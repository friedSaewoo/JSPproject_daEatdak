/**
 * 
 */
let $all = $(".all");
let $inputs = $(".term");
let buttons = document.querySelector('.button');
let cartgoods = document.querySelectorAll('.cart-goods');

$all.on('click', function(){
    if($(this).is(":checked")){
        $inputs.prop('checked', true);
    }else{
        $inputs.prop('checked', false);
    }
});

$inputs.on('click', function(){
    if(!$(this).is(":checked")){
        $all.prop('checked', false);
    }
    if($inputs.filter(":checked").length === cartgoods.length){
        $all.prop('checked', true);
    }
});

buttons.addEventListener('click', function(){
    let checkedInputs = document.querySelectorAll('.term:checked');
    
    if (checkedInputs.length > 0) {
        alert("상품이 삭제되었습니다.");
        
        checkedInputs.forEach(function(input){
            $(input).closest(".cart-goods").remove();
        });
        $all.prop('checked', false);
    } else {
        alert("선택된 상품이 없습니다.");
    }
});
// 주문하기 마우스 오버,아웃 이벤트
let productorders=document.querySelector('.product-order span');

productorders.addEventListener('mouseover',function(){
	productorders.style.color="white";
	productorders.style.backgroundColor="rgba(94,190,231)";
})

productorders.addEventListener('mouseout',function(){
	productorders.style.color="rgba(94,190,231)";
	productorders.style.backgroundColor="white";
})

//  주문하기 클릭시 주문하기 데이터가 사라지고 장바구니가 비어있다는 웹으로 이동
productorders.addEventListener('click',function(){
    if (cartgoods.length >0) {
        cartgoods.forEach(function (cartgoods){
            cartgoods.remove();
        });
        alert("상품주문완료");
        $('.product-order span').css('display','none');
        window.location.href="/product/html/product_cart.html";
    }
});




// 수량 클릭시 변화하는 함수 

// HTML에서 각 상품을 감싸고 있는 부모 요소의 클래스를 .cart-item으로 가정합니다.
// HTML에서 각 상품을 감싸고 있는 부모 요소의 클래스를 .cart-item으로 가정합니다.
let cartItems = document.querySelectorAll('.cart-goods');

cartItems.forEach((cartItem, index) => {
    let increaseBtn = cartItem.querySelector('.increase');
    let decreaseBtn = cartItem.querySelector('.decrease');
    let countEl = cartItem.querySelector('.count');
    let totalPriceEl = cartItem.querySelector('.total-price');

    // 각 상품의 가격 정보를 데이터 속성(data-price)을 통해 가져옵니다.
    let price = parseFloat(cartItem.getAttribute('data-price'));
    
    let count = 1; // 초기 수량 설정

    // increase 버튼 클릭 시 수량 증가
    increaseBtn.addEventListener('click', () => {
        count++;
        countEl.textContent = count;
        updateTotalPrice(price, count, totalPriceEl);
    });

    // decrease 버튼 클릭 시 수량 감소 (최소 수량 1)
    decreaseBtn.addEventListener('click', () => {
        if (count > 1) {
            count--;
            countEl.textContent = count;
            updateTotalPrice(price, count, totalPriceEl);
        }
    });

    // 초기화 시 총 가격 계산
    updateTotalPrice(price, count, totalPriceEl);
});

// 총 가격 업데이트 함수
function updateTotalPrice(price, count, totalPriceEl) {
    if (!isNaN(price)) {
        // 총 가격을 계산하고 화면에 업데이트합니다.
        let totalPrice = price * count;
        totalPriceEl.textContent = totalPrice.toFixed(2) + '원'; // 총 가격을 소수점 2자리까지 표시
    }
}