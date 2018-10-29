# DingTalk

### 接入钉钉的主要流程：
- AuthHelper.getSign()：SHA-1签名，得到signature
- 签名校验流程：
  - AuthHelper.getConfig()：后端准备好，前端校验参数
  - (ndex.jsp).var _config =<%=auth.AuthHelper.getConfig(request)%>：前端接受后台参数
  - (auth.js).dd.config：执行前端dd.config进行签名校验
- UserInfoServlet：签名校验成功后，获取免登授权码，通过ajax传到后台
- UserService.getUserInfo()：通过code授权码获取userid
- UserService.getUser()：根据userid获取用户信息
- UserInfoServlet.doPost()：将用户信息传至前端
- auth.js：前端接受用户信息后做相应处理传给index.jsp
