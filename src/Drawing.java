public class Drawing {
    private static Drawing draw; //initialize the drawing to be null for getinstance checks
    public int shapes = 0;
    
    public static Drawing getInstance(){
        if (draw == null){
            draw = new Drawing();
        }
        return draw;
    }

    private Drawing(){

    }

    public void drawShape(Shape shape){
       if(shape instanceof Square){
        System.out.println("Drawing a square with color: " + shape.getColor() + " and area: " + shape.calculateArea());
        shapes++;
       }
       else if(shape instanceof Circle){
        System.out.println("Drawing a circle with color: " + shape.getColor() + " and area: " + shape.calculateArea());
        shapes++;
       }

    }


    }

