// screen resolution is 256x192

PImage imgBall = spriteArt("""
	..wwww
	.wwuuww
	wwuwwwww
	wwuwwwww
	wwuwwwww
	wwuwwwww
	.wwuuww 
	..wwww""");

PImage imgPaddle = spriteArt(".wwwwww.\nwwwwwwww\n" + "www..www\nww.ww.ww\n".repeat(21) + "wwwwwwww\n.wwwwww.");

Sprite ball;
Sprite paddleL;
Sprite paddleR;
Sprite wallT;
Sprite wallB;

void setup() {
	ball = new Sprite();
	ball.image = imgBall;
	ball.x = width / 2; // 128
	ball.y = height / 2;
	ball.diameter = 8;
	ball.bounciness = 1; // full bounciness
	ball.friction = 0; // no friction
	
	/* Part A: add the paddles */
	paddleL = new Sprite();
	paddleL.image = imgPaddle;
	paddleL.x = 20;
	paddleL.y = 90;
	paddleL.collider = "kinematic";
	
	paddleR = new Sprite();
	paddleR.image = imgPaddle;
	paddleR.x = 230;
	paddleR.y = 90;
	paddleR.collider = "kinematic";
	
	ball.speed = 3;
	ball.direction = 45;
	
	wallT = new Sprite();
	wallT.color = "white";
	wallT.x = 128;
	wallT.y = 20;
	wallT.height = 5;
	wallT.collider = "static";
	wallT.width = 256;
	
	wallB = new Sprite();
	wallB.color = "white";
	wallB.x = 128;
	wallB.y = 170;
	wallB.height = 5;
	wallB.collider = "static";
	wallB.width = 256;
}
	
void draw() {
	background("b");
	
	if (ball.x < -100) {
		ball.x = width / 2; // 128;
		ball.y = height / 2;

		if (Math.random() < 0.5) {
			ball.direction = 20 + Math.random() * 50;
		} else {
			ball.direction = -20 - Math.random() * 50;
		} 
		
	} if (ball.x > 300) {
		ball.x = width / 2;
		ball.y = height / 2;

		if (Math.random() < 0.5) {
			ball.direction = 110 + Math.random() * 50;
		} else {
			ball.direction = -110 - Math.random() * 50;
		}
	}

	
	if (kb.pressing("w")) {
		paddleL.vel.y = -5;
	}
	else if (kb.pressing("s")) {
		paddleL.vel.y = 5;
	}
	else {
		paddleL.vel.y = 0;
	}

	if (kb.pressing("ArrowUp")) {
		paddleR.vel.y = -5;
	}
	else if (kb.pressing("ArrowDown")) {
		paddleR.vel.y = 5;
	} else {
		paddleR.vel.y = 0;
	}
}  
	