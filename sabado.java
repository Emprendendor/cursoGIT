public String getPayloadObjeto() throws JsonProcessingException {
	    
    Map<String, Object> likeMap = new LinkedHashMap<>("datos ", posibilidade");
    /*
     * likeMap.put("_uuid", api.getUuid()); likeMap.put("_uid", api.getUserId());
     * likeMap.put("_csrftoken", api.getOrFetchCsrf()); likeMap.put("media_id",
     * mediaId);
     */
    
 
    
    
    ObjectMapper mapper = new ObjectMapper();
    String payloadJson = mapper.writeValueAsString(likeMap);

    return payloadJson;
}

<Invoice>
  <Header invoiceNumber="12345">
    <Date>
      <Month>July</Month>
      <Day>15</Day>
      <Year>2001</Year>
    </Date>
    <BillTo custNumber="X5739" name="Milton McGoo" phone="416-448-4414">
      <Address>
        <street1>IBM</street1>
        <street2>1150 Eglinton Ave East</street2>
        <city>Toronto</city>
        <state>Ontario</state>
        <zip>M3C 1H7</zip>
        <country>Canada</country>
      </Address>s
    </BillTo>
  </Header>
  <Item discount="promotion" price="57">
    <description>high speed 3D graphics card</description>
  </Item>
</Invoice>
package com.mavenproyecto;
import com.fasterxml.jackson.databind.andres
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html; charset=UTF-8"); // 
        resp.getWriter().print("<html>\n" +  // 
                "<body>\n" +
                "<h1>This is my HTML page</h1>\n" +
                "<p> hallo what is going on!!!</p>\n" +
                "</body>\n" +
                "</html>");
    }
}
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>  Error JSP </title>
</head>
<body>
<h1>  Error jsp</h1>
</body>
</html>

Subo mi repositorio al remoto y ahora lo modifico


