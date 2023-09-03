<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- If we remove the tag libraries export statement and only Javax is used in the application,
 the application and this JSP page will work successfully with Tomcat 9 as well -->    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h3>Product Details Entered Are</h3>
    
    <table class="data"> 
    <tr>
        <th>Name &emsp;&emsp;&emsp;&emsp;</th>
        <th>Price &emsp;&emsp;&emsp;&emsp;</th>
        <th>Date Added &emsp;&emsp;&emsp;&emsp;</th>
        <th>HDD &emsp;&emsp;&emsp;&emsp;</th>
        <th>CPU &emsp;&emsp;&emsp;&emsp;</th>
        <th>RAM &emsp;&emsp;&emsp;&emsp;</th>
    </tr>
    	
        <tr>
            <td> ${epe.pName}</td>
            <td> ${epe.pPrice}</td>
            <td> ${epe.dateAdded}</td>
            <td> ${epe.pHDD}</td>
            <td> ${epe.pCPU}</td>
            <td> ${epe.pRAM}</td>
        </tr>
    
    </table>
    

</body>
</html>