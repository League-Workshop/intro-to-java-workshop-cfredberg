PImage mustache;
PImage person;
void setup() {
person = loadImage("person.jpg");
size(500, 680);
person.resize(width,height);
mustache = loadImage("stash.png");
}

void draw() {
background(person);
image(mustache, 108, 220);
}
