
            
              
<div class="modal fade" id="modalRegistrationForm2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content py-3 px-5"> 
        

<!-- Pills content -->
<div class="tab-content">
  <div class="tab-pane fade show active" id="pills-login" role="tabpanel" aria-labelledby="tab-login">
    <form method="post" action="controller.jsp">
         <input type="hidden" name="page" value="registration">
      <div class="text-center mb-3">
          <h3 style="color: black;">REGISTER</h3>
         
          <hr style="color: voilet; height:2px; background-image:linear-gradient(to right,#f8bbd0,#E91E63); "/>
            
      </div>

         <p class="text-center" style="color: black; margin-bottom: 20px;"><b> Give your details to avail our services.</b></p>

      <div class="form-outline " style="margin-top:30px; text-align: left;">
       
        <label class="form-label text-start" for="loginName" style="color: black;">User Name</label>
         <input  type="text" name="name" class="form-control" required/> 
      </div>
         
         <div class="form-outline " style="margin-top:10px; text-align: left;">
       
        <label class="form-label text-start" for="loginName" style="color: black;">User Email</label>
         <input type="email" name="email" class="form-control" required/> 
      </div>

      <!-- Password input -->
      <div class="form-outline " style=" margin-top:10px; text-align: left;">
        
        <label class="form-label" for="loginPassword" style="color: black;">User Password</label>
        <input type="password" name="password" class="form-control" required/>
        
      </div>
      
       <div class="form-outline " style=" margin-top:10px; text-align: left;">
        
        <label class="form-label" for="loginPassword" style="color: black;">User Phone No.</label>
        <input type="number" name="phone"  class="form-control" required/>
        
      </div>
      <div class="form-outline " style=" margin-top:10px;margin-bottom:30px; text-align: left;">
        
        <label class="form-label" for="loginPassword" style="color: black;">User Address</label>
        <textarea class="form-control" name="address">
            
        </textarea>
       
        
      </div>

     

      <!-- Submit button -->
      <button type="submit" class="btn btn-block mb-2 text-black fs-5 " style="width: 100%; background-image:linear-gradient(to right,#f8bbd0,#E91E63);">Sign In</button>

    </form>
  </div>
</div>
<!-- Pills content -->
    </div>
  </div>
</div>
           