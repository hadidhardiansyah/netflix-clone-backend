package com.netflix.clone.service;

import com.netflix.clone.dto.request.VideoRequest;
import com.netflix.clone.dto.response.MessageResponse;
import com.netflix.clone.dto.response.PageResponse;
import com.netflix.clone.dto.response.VideoResponse;
import com.netflix.clone.dto.response.VideoStatusResponse;

import java.util.List;

public interface VideoService {
	MessageResponse createVideoByAdmin(VideoRequest videoRequest);
	
	PageResponse<VideoResponse> getAllAdminVideos(int page, int size, String search);
	
	MessageResponse updateVideoByAdmin(Long id, VideoRequest videoRequest);
	
	MessageResponse deleteVideoByAdmin(Long id);
	
	MessageResponse toggleVideoPublishStatusByAdmin(Long id, boolean status);
	
	VideoStatusResponse getVideoStatus();
	
	PageResponse<VideoResponse> getPublishedVideos(int page, int size, String search, String email);
	
	List<VideoResponse> getFeaturedVideos();
}
