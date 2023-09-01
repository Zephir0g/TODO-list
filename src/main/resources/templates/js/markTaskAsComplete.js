function submitFormOnCheckboxChange() {
    const checkboxes = document.querySelectorAll('.form-check-input');

    checkboxes.forEach(checkbox => {
        checkbox.addEventListener('change', function () {
            const form = this.closest('form');
            form.submit();
        });
    });
}

document.addEventListener('DOMContentLoaded', submitFormOnCheckboxChange);