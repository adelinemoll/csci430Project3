import java.awt.*;
public class Line extends Item {
  private Point point1;
  private Point point2;
  private Point currentPoint;
  //private boolean complete=false;
  public Line(Point point1, Point point2, Point currentPoint) {
    this.point1 = point1;
    this.point2 = point2;
	this.currentPoint= currentPoint;
  }
  public boolean isComplete(){
	  if (point2==null)
		return false;
	  else
		return true;
  }
  // public void setComplete(boolean bool){
	  // complete=bool;
  // }
  public Line(Point point1) {
    this.point1 = point1;
	point2 = null;
  }
  public Line() {
	  point1 = null;
	  point2 = null;
  }
  public boolean includes(Point point) {
    return ((distance(point, point1 ) < 10.0) || (distance(point, point2)< 10.0));
  }
  public void render() {
	Line line = new Line(point1, point2, currentPoint);
	// System.out.println("Point2 is "+ point2);
	// if (point2!=null){
		// complete=true;
	// }
	// System.out.println("Complete?" + complete);
    uiContext.drawLine(line);
  }
  public void setPoint1(Point point) {
    point1 = point;
  }
  public void setPoint2(Point point) {
    point2 = point;
  }
  public void setCurrentPoint(Point point){
	  currentPoint=point;
  }
  public Point getPoint1() {
    return point1;
  }
  public Point getPoint2() {
    return point2;
  }
  public Point getCurrentPoint(){
	  return currentPoint;
  }
  public String toString() {
    return "Line  from " + point1 + " to " + point2;
  }
}

