var exampleModal = document.getElementById('editTaskModal')
exampleModal.addEventListener('show.bs.modal', function (event) {
    // Button that triggered the modal
    var button = event.relatedTarget
    // Extract info from data-bs-* attributes
    var recipient = button.getAttribute('data-bs-whatever')
    var taskId = button.getAttribute('data-task-id')
    // If necessary, you could initiate an AJAX request here
    // and then do the updating in a callback.
    //
    // Update the modal's content.
    var modalTitle = exampleModal.querySelector('.modal-title')
    var modalBodyTextarea = exampleModal.querySelector('.modal-body textarea')
    var modalBodyInput = exampleModal.querySelector('.modal-body input')
    var modalFooterInput = exampleModal.querySelector('.modal-footer input')

    modalTitle.textContent = 'Change text to ' + recipient
    modalBodyTextarea.value = recipient
    modalBodyInput.value = taskId
    modalFooterInput.value = taskId
})


