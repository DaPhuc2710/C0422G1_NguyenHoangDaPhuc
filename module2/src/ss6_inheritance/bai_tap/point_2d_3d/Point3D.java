package ss6_inheritance.bai_tap.point_2d_3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;

    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), getZ()};
    }

    @Override
    public String toString() {
        return "Point3D has \t" +
                "x=" + getX() +
                "\t, y=" + getY() +
                "\t z=" + z +
                "\tArray of [x,y,z]\t" + getXYZ().toString() + "]";

    }
}
