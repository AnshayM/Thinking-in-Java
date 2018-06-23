package unit7;

/**
 * 确保正确的初始化.
 * 重点熟悉整个流程。
 * 
 * @author Administrator
 *
 */
class Shape {
	public Shape(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Shape Constructor");
	}

	void dispose() {
		System.out.println("Shape dispose");
	}
}

class Circle extends Shape {
	public Circle(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Drawing Circle");
	}

	void dispose() {
		System.out.println("Erasing Circle");
		super.dispose(); // 调用基类的dispose()方法
	}
}

class Triangle extends Shape {
	public Triangle(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Drawing Triangle");
	}

	void dispose() {
		System.out.println("Erasing Triangle");
		super.dispose();
	}
}

class Line extends Shape {
	private int start, end;

	public Line(int start, int end) {
		// TODO Auto-generated constructor stub
		super(start);
		this.start = start;
		this.end = end;
		System.out.println("Drawing Line:" + start + ", " + end);
	}

	void dispose() {
		System.out.println("Erasing Line:" + start + ", " + end);
		super.dispose();
	}
}

public class CADSystem extends Shape {
	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[3];

	public CADSystem(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		for (int j = 0; j < lines.length; j++) {
			lines[j] = new Line(j, j * j);
		}
		c = new Circle(1);
		t = new Triangle(1);
		System.out.println("Combined Constructor");
	}

	public void dispose() {
		System.out.println("CADSystem.dispose()");
		t.dispose();
		c.dispose();
		for (int i = 0; i < lines.length; i++) {
			lines[i].dispose();
		}
		super.dispose();
	}

	public static void main(String[] args) {
		CADSystem x = new CADSystem(47);
		try {

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			x.dispose();		//finally确保最终实现正确处理
		}
	}
}

/*
Shape Constructor
Shape Constructor
Drawing Line:0, 0
Shape Constructor
Drawing Line:1, 1
Shape Constructor
Drawing Line:2, 4
Shape Constructor
Drawing Circle
Shape Constructor
Drawing Triangle
Combined Constructor
CADSystem.dispose()
Erasing Triangle
Shape dispose
Erasing Circle
Shape dispose
Erasing Line:0, 0
Shape dispose
Erasing Line:1, 1
Shape dispose
Erasing Line:2, 4
Shape dispose
Shape dispose
*/