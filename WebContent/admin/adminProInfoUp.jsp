<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>다잇닭</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/admin/css/adminProductUp.css">

    <script src="https://code.jquery.com/jquery-3.7.0.js"
        integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
    <script src="${pageContext.request.contextPath}/resources/admin/js/adminProductUp.js"></script>


    <!-- Plugin -->
    <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
    <link rel="stylesheet" href="https://rawgit.com/enyo/dropzone/master/dist/dropzone.css" />
    <script src="https://rawgit.com/enyo/dropzone/master/dist/dropzone.js"></script>

    <style>
        img:not(.mainLogo, .w-full) {
            width: 250px;
            height: 250px;
            float: left;
            margin-left: 1px;

        }

        .iup form {
            width: 250px;
            height: 250px;
        }

        
        .dz-clickable {
            width: 80px;
            margin-right: -90px;
            float: right;

        }

        .pt-1  {
            position: absolute;
            margin-top: -100px;
            margin-left: 150px;
            display: none;
        }

        .btn-sm {
            position: absolute;
            margin-left: 200px ;
            margin-top: 350px;
            width: 50px;
            height: 25px;
            background-color:rgb(202, 46, 46);
            color: white;
            border-radius: 10%;
        }

        .w-full{
            float: left;
            width: 600px;
            height: 350px;
            margin-top: 10px;
            margin-left: 40px;
        }


        p , .pt-1, .dz-default{
            display: none;
        }
        .dropzone img {
            position: absolute;
            margin-top: -15px;
            margin-left: -30px;
            width: 15px; 
            height: 15px; 
            cursor: pointer;
        }
        .dropzone img:hover, .dropzone span:hover {
            cursor: pointer;
        }



    </style>
</head>

<body>
    <main class="test">
        <div class="section-container"> <!-- 좌측 관리자 메뉴-->

            <div class="aside">
                
                <div class="main_logo">
                    <a href="../../common/html/index.html">
                        <img style="width: 140px;" src="../img/mainLogo01.png" class="mainLogo">
                    </a>
                </div>
                <a href="admin_main.html">
                    <div class="admin_menu">메인화면</div>
                </a>
                <a href="admin_memberInfo.html">
                    <div class="admin_menu">회원정보</div>
                </a>
                <a href="admin_productInfo.html">
                    <div class="admin_menu">상품관리</div>
                </a>
                <a href="${pageContext.request.contextPath}/board/boardList.jsp"><div class="admin_menu">문의게시판</div></a>
            </div>



            <div class="admin_proInfoUp">
                <div class="PageName">
                    <h2>상품 수정</h2>
                </div>
                <hr style="width: 90%;">

                <div class="Rege">
                    <div class="totalProdList">
                        <div class="registerPage">

                            <div style="width: 350px; height: 350px;">
                                <div id="image_container"></div>
                                <input type="file" id="image" accept="image/*" onchange="setThumbnail(event);" />
                            </div>

                            <div style="width: 60%; margin-left: 10px;">
                                <div class="productRegist">
                                    <div><span>상품분류</span>&nbsp;&nbsp;
                                        <select>
                                            <option>닭고기</option>
                                            <option>소고기</option>
                                            <option>돼지고기</option>
                                        </select><hr>
                                    </div>
                                </div>
                                <div class="productRegist">
                                    <div><span>상품명&nbsp;&nbsp;&nbsp;&nbsp;</span>&nbsp;&nbsp;&nbsp;
                                        <input class="productRegist-text" type="text" placeholder="상품명을 입력해 주세요.">
                                    </div><hr>
                                </div>
                                <div class="productRegist">
                                    <div><span>상품 가격</span>&nbsp;&nbsp;
                                        <input class="productRegist-text" type="text" placeholder="상품 가격을 입력해 주세요.">
                                    </div><hr>
                                </div>
                                <div class="productRegist">
                                    <div><span>상품 재고</span>&nbsp;&nbsp;
                                        <input class="productRegist-text" type="text" placeholder="상품 재고를 입력해 주세요.">
                                    </div><hr>
                                </div>

                                
                            </div>




                        </div>
                        <div class="dropzone" style="min-height: 25px;"><span style="font-size: 10px; position: absolute; margin-top: -15px;">선택</span>
                            <img src="../img/camera.png" class="">
                        </div>
        
                    </div>

                <div class="productRegist-btn">
                    <div>
                        <button class="upload" style="width: 80px; height: 40px;">수정하기</button>
                    </div>
                </div>
        
            </div>

        </main>






</body>
<script>
    function setThumbnail(event) {
        var reader = new FileReader();

        reader.onload = function (event) {
            var img = document.createElement("img");

            img.setAttribute("src", event.target.result);
            document.querySelector("div#image_container").appendChild(img);
        };

        reader.readAsDataURL(event.target.files[0]);
    }


    
</script>

</html>




