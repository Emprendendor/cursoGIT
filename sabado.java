public String getPayloadObjeto() throws JsonProcessingException {
	    
    Map<String, Object> likeMap = new LinkedHashMap<>();
    /*
     * likeMap.put("_uuid", api.getUuid()); likeMap.put("_uid", api.getUserId());
     * likeMap.put("_csrftoken", api.getOrFetchCsrf()); likeMap.put("media_id",
     * mediaId);
     */
    
    
    likeMap.put("_uuid", "asasasas" );
    likeMap.put("_uid", "3232323");
    likeMap.put("_csrftoken", "3333334555");
    likeMap.put("media_id", "323232");
    
    
    ObjectMapper mapper = new ObjectMapper();
    String payloadJson = mapper.writeValueAsString(likeMap);

    return payloadJson;
}