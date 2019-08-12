PImage mustache;
PImage dad;
void setup() {
dad = loadImage("dad.jpg");
size(500, 680);
dad.resize(width,height);
mustache = loadImage("stash.png");
}

void draw() {
background(dad);
image(mustache, 108, 220);
}
