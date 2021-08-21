
        function loginValidation(){
            var uname = document.myform.username.value;
            var password = document.myform.password.value;
            if(uname == null || uname ==""){
                alert("Name can't be blank");
                return false;
            }else if(password.length < 6){
                    alert("Password must be atleast 6 characters long");
                    return false;
            }
        }
