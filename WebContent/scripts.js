// 0 grama
// 1 montanha
// 2 agua
// 3 lava
// 4 caverna
var tileMap = [
		[ 1, 0, 0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1,
				0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0 ],
		[ 1, 0, 1, 1, 1, 1, 0, 2, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 ],
		[ 1, 0, 0, 0, 0, 1, 0, 2, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 3, 1, 1, 1, 1, 0 ],
		[ 1, 0, 1, 1, 1, 1, 0, 2, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 3, 3, 3, 1, 1, 1, 1 ],
		[ 1, 0, 0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 3, 3, 3, 3, 3, 1, 1, 1 ],
		[ 1, 1, 1, 1, 0, 1, 0, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0,
				0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 3, 3, 3, 1, 1, 1, 1 ],
		[ 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 3, 1, 1, 1, 1, 0 ],
		[ 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 2, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 ],
		[ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0,
				0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0 ],
		[ 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 2, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 ],
		[ 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 2, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0,
				0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0 ],
		[ 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0,
				1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 ],
		[ 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 0, 1, 0, 0, 1, 0, 0, 1,
				1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0 ],
		[ 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 1, 0, 0, 1,
				1, 1, 2, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 ],
		[ 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 1, 0, 0, 0,
				1, 1, 2, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 ],
		[ 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 2, 2, 2, 2, 2, 0, 0, 1, 0, 0, 0,
				0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 ],
		[ 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 1, 1,
				1, 0, 2, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0 ],
		[ 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0,
				0, 0, 2, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1 ],
		[ 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 2, 2, 2, 0, 0, 0, 2, 2, 2, 0, 0, 1, 0,
				0, 0, 2, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1 ],
		[ 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 2, 2, 2, 0, 0, 0, 2, 2, 2, 0, 1, 1, 1,
				0, 0, 2, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 ],
		[ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 0, 0, 0, 2, 2, 2, 0, 1, 1, 1,
				0, 0, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 ],
		[ 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 1, 1,
				0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 ],
		[ 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 1, 0,
				0, 0, 1, 1, 1, 0, 0, 2, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1 ],
		[ 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0,
				0, 0, 1, 1, 1, 0, 0, 2, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1 ],
		[ 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1,
				1, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0 ],
		[ 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 2, 0, 0, 0, 1, 1, 0, 0, 0,
				0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0 ],
		[ 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 1, 1, 1, 1, 0, 0,
				0, 1, 0, 1, 0, 0, 2, 2, 2, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0 ],
		[ 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 2, 0, 1, 1, 1, 1, 1, 1, 0,
				0, 1, 0, 0, 0, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 1, 0 ],
		[ 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 1, 1, 1, 1, 1, 0,
				0, 1, 0, 0, 2, 2, 2, 2, 2, 2, 2, 0, 0, 1, 1, 1, 1, 1, 0 ],
		[ 1, 0, 0, 0, 1, 0, 0, 1, 2, 2, 2, 2, 2, 2, 2, 0, 0, 1, 1, 1, 1, 0, 0,
				0, 1, 0, 0, 0, 2, 2, 2, 2, 2, 0, 0, 0, 1, 0, 0, 0, 1, 0 ],
		[ 1, 1, 0, 1, 1, 1, 0, 0, 2, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1,
				1, 1, 1, 0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ],
		[ 1, 1, 0, 1, 1, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0 ],
		[ 1, 0, 0, 0, 1, 0, 0, 0, 2, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1,
				1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 ],
		[ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1 ],
		[ 0, 1, 0, 1, 1, 1, 1, 0, 2, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1 ],
		[ 0, 1, 0, 0, 0, 0, 1, 0, 2, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0,
				1, 0, 1, 0, 0, 1, 1, 1, 1, 4, 1, 1, 1, 1, 0, 0, 1, 0, 1 ],
		[ 0, 1, 1, 1, 0, 0, 1, 0, 2, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0,
				1, 0, 0, 0, 1, 1, 1, 3, 3, 4, 3, 3, 1, 1, 1, 0, 0, 0, 1 ],
		[ 0, 1, 0, 0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0,
				1, 0, 0, 1, 1, 3, 3, 3, 3, 4, 3, 3, 3, 3, 1, 1, 0, 0, 1 ],
		[ 1, 1, 0, 1, 1, 1, 1, 0, 2, 2, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0,
				1, 0, 0, 1, 1, 3, 3, 3, 3, 4, 3, 3, 3, 3, 1, 1, 0, 0, 0 ],
		[ 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0,
				1, 0, 1, 1, 3, 3, 3, 3, 3, 4, 3, 3, 3, 3, 3, 1, 1, 0, 0 ],
		[ 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 1, 1, 3, 3, 3, 3, 3, 4, 3, 3, 3, 3, 3, 1, 1, 0, 0 ],
		[ 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 0, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 0, 0 ] ]
// var tileMap = createGround(42, 42);

function createGround(width, height) {
	var result = [];
	for (var i = 0; i < width; i++) {
		result[i] = [];
		for (var j = 0; j < height; j++) {
			result[i][j] = Math.random() * 5 | 0;
		}
	}
	return result;
}

function limpaCanvas() {
	elem = document.getElementById("myCanvas")
	elem.getContext("2d").clearRect(0, 0, elem.width, elem.height);
}
function Shape(x, y, w, h, fill) {
	this.x = x;
	this.y = y;
	this.w = w;
	this.h = h;
	this.fill = fill;
}

function pintaQuadrados() {
	// get canvas element.
	width = 30;
	height = 30;
	elem = document.getElementById("myCanvas");

	// check if context exist
	if (elem.getContext) {
		context = elem.getContext("2d");
		// context.fillStyle = "#1fe827";
		// context.fillRect(0, 0, elem.width, elem.height);
		// 0 grama
		// 1 montanha
		// 2 agua
		// 3 lava
		// 4 caverna
		for (var i = 0; i < 42; i++) {
			for (var j = 0; j < 42; j++) {
				switch (tileMap[j][i]) {
				case 0:
					myShape = new Shape(i * 30, j * 30, width, height,
					// "#1fe827");
					"#92D050");// original do pdf
					break;
				case 1:
					myShape = new Shape(i * 30, j * 30, width, height,
					// "#795548");
					"#948A54");// original do pdf
					break;
				case 2:
					myShape = new Shape(i * 30, j * 30, width, height,
					// "#03a9f4");
					"#548DD4");// original do pdf
					break;
				case 3:
					myShape = new Shape(i * 30, j * 30, width, height,
					// "#f44336");
					"#E36C0A");// original do pdf
					break;
				case 4:
					myShape = new Shape(i * 30, j * 30, width, height,
					// "#9e9e9e");
					"#A6A6A6");// original do pdf
					break;
				}

				context.fillStyle = myShape.fill;
				context.fillRect(myShape.x, myShape.y, myShape.w, myShape.h);
			}
		}
	}
}
function drawGrid() {
	var cnv = document.getElementById("myCanvas");
	var gridOptions = {
		minorLines : {
			separation : 5,
			color : '#00FF00'
		},
		majorLines : {
			separation : 30,
			color : '#00'
		}
	};
	// drawGridLines(cnv, gridOptions.minorLines);
	drawGridLines(cnv, gridOptions.majorLines);
	return;
}

function drawGridLines(cnv, lineOptions) {
	var iWidth = cnv.width;
	var iHeight = cnv.height;

	var ctx = cnv.getContext('2d');

	ctx.strokeStyle = lineOptions.color;
	ctx.strokeWidth = 1;

	ctx.beginPath();

	var iCount = null;
	var i = null;
	var x = null;
	var y = null;

	iCount = Math.floor(iWidth / lineOptions.separation);

	for (i = 1; i <= iCount; i++) {
		x = (i * lineOptions.separation);
		ctx.moveTo(x, 0);
		ctx.lineTo(x, iHeight);
		ctx.stroke();
	}
	iCount = Math.floor(iHeight / lineOptions.separation);

	for (i = 1; i <= iCount; i++) {
		y = (i * lineOptions.separation);
		ctx.moveTo(0, y);
		ctx.lineTo(iWidth, y);
		ctx.stroke();
	}
	ctx.closePath();
	return;
}