function validateForm() {
    var phoneInput = document.getElementById("phone");
    var phoneNumber = phoneInput.value;
    var password = document.getElementById("password");
    var confirmPassword = document.getElementById("confirmPassword");

    if (!(/^\d{10}$/.test(phoneNumber))) {
        alert("Please enter a valid 10-digit phone number.");
        return false;
    }

    const emailInput = document.getElementById('email');
    const emailValue = emailInput.value;
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(emailValue)) {
        alert('Please enter a valid email address.');
        return false;
    }

    if(password!= confirmPassword){
        alert("Password doesn't match");
        return false;
    }

    return true;
}