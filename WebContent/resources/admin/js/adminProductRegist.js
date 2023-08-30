function DropFile(dropAreaId, fileListId) {
  let dropArea = document.getElementById(dropAreaId);
  let fileList = document.getElementById(fileListId);

  function preventDefaults(e) {
    e.preventDefault();
    e.stopPropagation();
  }

  function highlight(e) {
    preventDefaults(e);
    dropArea.classList.add("highlight");
  }

  function unhighlight(e) {
    preventDefaults(e);
    dropArea.classList.remove("highlight");
  }

  function handleDrop(e) {
    unhighlight(e);
    let dt = e.dataTransfer;
    let files = dt.files;

    handleFiles(files);

    const fileList = document.getElementById(fileListId);
    if (fileList) {
      fileList.scrollTo({ top: fileList.scrollHeight });
    }
  }

  function handleFiles(files) {
    files = [...files];
    files.forEach(previewFile);
  }

  function previewFile(file) {
    console.log(file);
    renderFile(file);
  }

  function renderFile(file) {
    let reader = new FileReader();
    reader.readAsDataURL(file);
    reader.onloadend = function () {
      let img = dropArea.getElementsByClassName("preview");
      img.src = reader.result;
      img.style.display = "block";
    };
  }


  return {
    handleFiles
  };

}

const dropFile = new DropFile("drop-file", "files");


function productDel() {
  $(".ins").click(function() {
      var up = confirm("등록 하시겠습니까?");
      link = "admin_productInfo.html"
      if(up) {
          alert("등록되었습니다.")
          location.href = link;
      }
  })
  $(".imgDel").click(function() {
    alert("테슽");
    $("#image_container img").css("display","none");
  });
  $(".imgsDel").click(function() {
    $("#images_container img").css("display","none");
  });



}

$('document').ready(function(){
  productDel();
$('.pagination li:first-child').addClass("disabled");

});




