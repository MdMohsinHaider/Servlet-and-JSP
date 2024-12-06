document.addEventListener("DOMContentLoaded", function () {
    const form = document.querySelector("form");

    form.addEventListener("submit", function (event) {
        // Get form field values
        const userId = document.querySelector("input[name='userId']").value;
        const userName = document.querySelector("input[name='userName']").value;
        const userEmail = document.querySelector("input[name='userEmail']").value;
        const userDob = document.querySelector("input[name='userDob']").value;
        const gender = document.querySelector("input[name='gender']:checked");

        // Validation logic
        if (!userId || userId <= 0) {
            alert("Please enter a valid User ID.");
            event.preventDefault();
            return;
        }

        if (!userName.trim()) {
            alert("User Name is required.");
            event.preventDefault();
            return;
        }

        if (!userEmail || !validateEmail(userEmail)) {
            alert("Please enter a valid email address.");
            event.preventDefault();
            return;
        }

        if (!userDob) {
            alert("Please select a date of birth.");
            event.preventDefault();
            return;
        }

        if (!gender) {
            alert("Please select a gender.");
            event.preventDefault();
            return;
        }
    });

    // Helper function to validate email
    function validateEmail(email) {
        const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return emailRegex.test(email);
    }
});
