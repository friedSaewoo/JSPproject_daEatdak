CREATE database jsp_daEatdak;
drop database jsp_daEatdak;

use jsp_daEatdak;

-- phone num varchar로 변경
CREATE TABLE users (
	user_num	int	unsigned auto_increment primary key,
	address_num	int	NULL,
	user_email	varchar(255)	NOT NULL,
	user_name	varchar(50)	NOT NULL,
	user_password	varchar(50)	NOT NULL,
	user_phone	varchar(20),
	user_roll	int	DEFAULT 0 not null,
	foreign key (address_num) references address (address_num)
);

ALTER TABLE users
MODIFY COLUMN address_num INT unsigned not null;

ALTER TABLE users
ADD CONSTRAINT FK_users_address
FOREIGN KEY (address_num) REFERENCES address(address_num);

CREATE TABLE category (
	category_num	int	unsigned auto_increment primary key,
	category_name	varchar(30)	NOT NULL
);

CREATE TABLE goods (
	goods_num int unsigned auto_increment primary key,
	category_num int unsigned NOT NULL,
	goods_name	varchar(50)	NOT NULL,
	goods_price	int	NOT NULL,
	goods_quantity	int	NOT null default 0,
	sale_count	int	default 0 NOT null,
	foreign key (category_num) references category (category_num)
);

-- image_num primarykey로 추가
CREATE TABLE image (
	image_num int auto_increment primary key,
    goods_num INT unsigned NOT NULL,
    goods_img BLOB NOT NULL,
    goods_detail_img1 BLOB NOT NULL,
    goods_detail_img2 BLOB,
    goods_detail_img3 BLOB,
    goods_detail_img4 BLOB,
    goods_detail_img5 BLOB,
    foreign key (goods_num) references goods (goods_num)
);

CREATE TABLE address (
	address_num	int	unsigned auto_increment primary key,
	address	varchar(100)	NOT NULL,
	road_address	varchar(100)	NOT NULL,
	detail_address	varchar(100)	NOT NULL
);

CREATE TABLE orders (
	order_num	int	unsigned auto_increment primary key,
	user_num	int	unsigned NOT NULL,
	address_num	int	unsigned NOT NULL,
	total_price	int	NOT NULL,
	order_phone	varchar(20)	NOT null,
	foreign key (user_num) references users (user_num),
	foreign key (address_num) references address (address_num)
);


-- 주문 상품정보 테이블 추가 << 생각해보니 필요할거같아서 
create table order_item(
	order_item_num int unsigned auto_increment primary key,
	order_num int unsigned not null,
	goods_num int unsigned not null,
	order_quantity int not null default 1,
	foreign key (order_num) references orders (order_num),
	foreign key (goods_num) references goods (goods_num)
);

CREATE TABLE wishlist (
	wishlist_num int unsigned auto_increment primary key,
	user_num	int unsigned	NOT NULL,
	goods_num int unsigned NOT NULL,
	foreign key (user_num) references users (user_num),
	foreign key (goods_num) references goods (goods_num)
);


CREATE TABLE board (
	board_num int unsigned auto_increment primary key,
	user_num	int	unsigned NOT NULL,
	board_name	varchar(30)	NOT NULL,
	board_content	text	NOT NULL,
	board_date	date NOT NULL,
	board_count	int	NOT NULL,
	board_password	int	NOT NULL,
	board_lock	int	NOT null default 0,
	foreign key (user_num) references users (user_num)
);


CREATE TABLE comments (
	comment_num int unsigned auto_increment primary key,
	user_num	int unsigned NOT NULL,
	board_num	int	unsigned NOT NULL,
	comment_content	varchar(100) NOT NULL,
	foreign key (user_num) references users (user_num),
	foreign key (board_num) references board (board_num)
);

CREATE TABLE cart (
	cart_num	int	unsigned auto_increment primary key,
	user_num	int	unsigned NOT NULL,
	foreign key (user_num) references users (user_num)
);

CREATE TABLE cart_item (
	cart_item_num	int	unsigned auto_increment primary key,
	cart_num	int	unsigned NOT NULL,
	goods_num	int	unsigned NOT NULL,
	quantity	int	NOT NULL	DEFAULT 1,
	foreign key (cart_num) references cart (cart_num),
	foreign key (goods_num) references goods (goods_num)
);


CREATE TABLE payment (
	payment_id INT AUTO_INCREMENT PRIMARY key,
	order_num int	unsigned NOT NULL,
	foreign key (order_num) references orders (order_num)
);
