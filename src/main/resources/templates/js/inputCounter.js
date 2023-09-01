function updateCharacterCount() {
    const textarea = document.getElementById('task');
    const characterCountElement = document.getElementById('character-count');
    const maxLength = parseInt(textarea.getAttribute('maxlength'));
    const currentLength = textarea.value.length;
    characterCountElement.textContent = currentLength + '/' + maxLength + ' characters';
}