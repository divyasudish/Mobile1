package welding.taal.com.mobile1app.server.services;


import java.util.HashMap;
import java.util.List;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;

/**
 * Created by Suneesh on 4/16/2016.
 */
public interface TaskService {
    @GET("/task1")
    void getTaskList(retrofit.Callback<String> taskCallback);
    @POST("/task")
    void uploadTask(@Body String objectList, Callback<String> testCallback);
}
