let h1 = document.querySelector('#h1'),
		svg = document.querySelector('svg'),
		g = document.querySelector('g');
const ns = svg.namespaceURI;
let l = h1.getTotalLength();
var col, dp;


function draw() {
	col = `rgba(${Math.random()*255},${Math.random()*100+100},${Math.random()*100+100},.4)`;
	g.innerHTML = '';
	let steps = parseInt(Math.random()*40+10);
let _step = l/steps;
const st = parseInt(Math.random()*l)+10;
	const sii = Math.random()*5+2;
	const si = Math.random()*5+.2;
for(var ii=0; ii<15*steps; ii+=sii) {
	genDP();
	for(let i=0; i<steps; i+=si) {
		let ss = _step*i;
		let point1 = h1.getPointAtLength(ss+st);
		let point2 = h1.getPointAtLength((ss+ii+st) % steps);
		addLine(point1, point2);
	}
}
}

function addLine(a,b) {
	let d = `M ${a.x} ${a.y} L ${b.x} ${b.y}`
	var p = document.createElementNS(ns, 'path');
	p.setAttribute('d', d);
	p.setAttribute('stroke', col);
	p.setAttribute('stroke-width', '.08');
	p.setAttribute('stroke-dasharray', dp);
	g.appendChild(p);
}

function genDP() {
	const times = Math.random()*10+1;
	dp = '';
	for(var i=0; i<times; i++) {
		dp+=`${parseInt(Math.random()*4+1)} `
	}
}

draw();
svg.addEventListener('click', draw)