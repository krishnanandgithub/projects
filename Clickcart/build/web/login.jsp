            
              
<div class="modal" id="modalLoginForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content p-5"> 
        

<!-- Pills content -->
<div class="tab-content">
  <div class="tab-pane fade show active" id="pills-login" role="tabpanel" aria-labelledby="tab-login">
      <form class="needs-validation" method="post" action="controller.jsp">
         <input type="hidden" name="page" value="adminlogin">
      <div class="text-center mb-3">
          <h3 style="color: black;">ADMIN LOGIN</h3>
          <hr style="color: #f8bbd0; height:2px; background-image:linear-gradient(to right,#f8bbd0,#E91E63); "/>
          <p style="color: black;">Login to go to the admin section</p>

      <!-- Email input -->
      <div class="form-outline " style="margin-top:40px; text-align: left;">
       
        <label class="form-label text-start" for="loginName" style="color: black;">Email or User Id</label>
         <input id="loginName" type="text" name="userid" class="form-control" required/> 
      </div>

      <!-- Password input -->
      <div class="form-outline " style=" margin-bottom:40px; margin-top:10px; text-align: left;">
        
        <label class="form-label" for="loginPassword" style="color: black;">Password</label>
        <input type="password" name="password" id="loginPassword" class="form-control" required/>
        
      </div>



      <!-- Submit button -->
      <button type="submit" class="btn btn-block mb-4 text-black fs-5 w-100" style=" background-image:linear-gradient(to right,#f8bbd0,#E91E63);">Login</button>

     
      </div>
    </form>
  </div>
  
</div>
<!-- Pills content -->
    </div>
  </div>
</div>
           