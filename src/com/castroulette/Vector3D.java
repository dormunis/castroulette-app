package com.castroulette;

/**
 * Created by dmunis on 29/03/16.
 */
public class Vector3D {

    private float _x,_y,_z;

    public Vector3D() {
        _x = 0;
        _y = 0;
        _z = 0;
    }

    public void decreaseBy(Vector3D vec) {
        _x -= vec.get_x();
        _y -= vec.get_y();
        _z -= vec.get_z();
    }

    public void set(float x, float y, float z) {
        _x = x;
        _y = y;
        _z = z;
    }
    public void set(Vector3D copy) {
        _x = copy.get_x();
        _y = copy.get_y();
        _z = copy.get_z();
    }

    public float get_z() {
        return _z;
    }

    public float get_x() {
        return _x;
    }

    public float get_y() {
        return _y;
    }

    public float dot() {
        return (float) Math.sqrt(_x * _x + _y * _y + _z * _z);
    }

    public void setDefault() {
        _x = 0;
        _y = 0;
        _z = 0;
    }

}
