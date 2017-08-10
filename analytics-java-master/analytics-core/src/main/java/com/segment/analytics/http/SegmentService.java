package com.segment.analytics.http;

import com.segment.analytics.messages.Batch;
import retrofit.http.Body;
import retrofit.http.POST;

/** REST interface for the Segment API. */
public interface SegmentService {
  @POST("/insights/collector/datacollector") UploadResponse upload(@Body Batch batch);
}
