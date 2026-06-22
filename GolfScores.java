void main() {
    String[] shotNames = {"Hole in one!", "Eagle!", "Birdie!", "Par!", "Bogey!",
            "Double Bogey!", "Quit!"};

    int par = (1 + (int) (Math.random() * ((6 - 1) + 1)));
    int strokes = (1 + (int) (Math.random() * ((9 - 1) + 1)));
    IO.println("Par: " + par);
    IO.println("Strokes: " + strokes);

    extracted(strokes, shotNames, par);
}

private static void extracted(int strokes, String[] shotNames, int par) {
    if (strokes == 1) {
        IO.println(shotNames[0]);
    } else if (strokes <= (par - 2)) {
        IO.println(shotNames[1]);
    } else if (strokes == (par - 1)) {
        IO.println(shotNames[2]);
    } else if (strokes == par) {
        IO.println(shotNames[3]);
    } else if (strokes == (par + 1)) {
        IO.println(shotNames[4]);
    } else if (strokes == (par + 2)) {
        IO.println(shotNames[5]);
    } else if (strokes >= (par + 3)) {
        IO.println(shotNames[6]);
    }
}
