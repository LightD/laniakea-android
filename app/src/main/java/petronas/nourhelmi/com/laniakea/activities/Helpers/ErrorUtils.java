package petronas.nourhelmi.com.laniakea.activities.Helpers;

import java.io.IOException;
import java.lang.annotation.Annotation;

import okhttp3.ResponseBody;
import petronas.nourhelmi.com.laniakea.activities.API.ServerError;
import petronas.nourhelmi.com.laniakea.activities.API.ServiceGenerator;
import retrofit2.Converter;
import retrofit2.Response;

/**
 * Created by nourhelmi on 20/06/2017.
 */

public class ErrorUtils {

    public static ServerError parseError(Response<?> response) {
        Converter<ResponseBody, ServerError> converter =
                ServiceGenerator.retrofit()
                        .responseBodyConverter(ServerError.class, new Annotation[0]);

        ServerError error;

        try {
            error = converter.convert(response.errorBody());
        } catch (IOException e) {
            return new ServerError();
        }

        return error;
    }
}
