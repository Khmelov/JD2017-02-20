<%@ include file="include/begin-html.jsp" %>

<form class="form-horizontal" action="do?command=signup" method="POST">
<fieldset>

<!-- Form Name -->
<legend>Form Name</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Login</label>
  <div class="col-md-4">
  <input id="textinput" name="textinput" type="text" placeholder="input login here" class="form-control input-md" required="">
  <span class="help-block">Your login (16 characters)</span>
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="E-mail">E-mail</label>
  <div class="col-md-4">
  <input id="E-mail" name="E-mail" type="text" placeholder="example@mail.com" class="form-control input-md" required="">
  <span class="help-block">your email</span>
  </div>
</div>

<!-- Password input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="password">Password</label>
  <div class="col-md-4">
    <input id="password" name="password" type="password" placeholder="" class="form-control input-md" required="">
    <span class="help-block">8 characters</span>
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="signup"></label>
  <div class="col-md-4">
    <button id="signup" name="signup" class="btn btn-success">Signup</button>
  </div>
</div>

</fieldset>
</form>


<p>Cmd SIGN-UP: ${message}</p>


<%@ include file="include/end-html.jsp" %>


