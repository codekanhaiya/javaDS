public class DirectionStr{

    private static float getShortestPath(String path){
        int x=0,y=0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
                                            // we take direction on the basis of Indian map
            if(dir=='E'){ //East
                x++;
            }else if(dir=='W'){ //West
                x--;
            }else if(dir=='N'){ //North
                y++;
            }else if(dir=='S'){ //South
                y--;
            }
        }
        int xSquare = x*x, ySquare = y*y;
        return (float)Math.sqrt(xSquare+ySquare);
    }

    public static void main(String arg[]){
        String direction = "WNEENESENNN";
        System.out.println("Shortest path: "+getShortestPath(direction)+" unit");
    }
}