---
title: Cylinder
second_title: Aspose.3D for Java API Reference
description: Parameterized Cylinder.
type: docs
weight: 36
url: /java/com.aspose.threed/cylinder/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Primitive](../../com.aspose.threed/primitive)
```
public class Cylinder extends Primitive
```

Parameterized Cylinder. It can also be used to represent the cone when one of radiusTop/radiusBottom is zero.
## Constructors

| Constructor | Description |
| --- | --- |
| [Cylinder()](#Cylinder--) | Initializes a new instance of the com.aspose.threed.Cylinder class. |
| [Cylinder(double radius, double height)](#Cylinder-double-double-) | Initializes a new instance of the com.aspose.threed.Cylinder class. |
| [Cylinder(double radiusTop, double radiusBottom, double height)](#Cylinder-double-double-double-) | Initializes a new instance of the com.aspose.threed.Cylinder class. |
| [Cylinder(double radiusTop, double radiusBottom, double height, int radialSegments, int heightSegments, boolean openEnded)](#Cylinder-double-double-double-int-int-boolean-) | Initializes a new instance of the com.aspose.threed.Cylinder class. |
| [Cylinder(String name, double radiusTop, double radiusBottom, double height, int radialSegments, int heightSegments, boolean openEnded, double thetaStart, double thetaLength)](#Cylinder-java.lang.String-double-double-double-int-int-boolean-double-double-) | Initializes a new instance of the com.aspose.threed.Cylinder class. |
## Methods

| Method | Description |
| --- | --- |
| [getOffsetBottom()](#getOffsetBottom--) | Gets the vertices transformation offset of the bottom side. |
| [setOffsetBottom(Vector3 value)](#setOffsetBottom-com.aspose.threed.Vector3-) | Sets the vertices transformation offset of the bottom side. |
| [getOffsetTop()](#getOffsetTop--) | Gets the vertices transformation offset of the top side. |
| [setOffsetTop(Vector3 value)](#setOffsetTop-com.aspose.threed.Vector3-) | Sets the vertices transformation offset of the top side. |
| [getGenerateFanCylinder()](#getGenerateFanCylinder--) | Gets whether to generate the fan-style cylinder when the ThetaLength is less than 2\*PI, otherwise the model will not be cut. |
| [setGenerateFanCylinder(boolean value)](#setGenerateFanCylinder-boolean-) | Sets whether to generate the fan-style cylinder when the ThetaLength is less than 2\*PI, otherwise the model will not be cut. |
| [getShearBottom()](#getShearBottom--) | Gets of the shear transform of the bottom side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0) |
| [setShearBottom(Vector2 value)](#setShearBottom-com.aspose.threed.Vector2-) | Sets of the shear transform of the bottom side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0) |
| [getShearTop()](#getShearTop--) | Gets of the shear transform of the top side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0) |
| [setShearTop(Vector2 value)](#setShearTop-com.aspose.threed.Vector2-) | Sets of the shear transform of the top side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0) |
| [getRadiusTop()](#getRadiusTop--) | Gets the radius of cylinder's top cap. |
| [setRadiusTop(double value)](#setRadiusTop-double-) | Sets the radius of cylinder's top cap. |
| [getRadiusBottom()](#getRadiusBottom--) | Gets the radius of cylinder's bottom cap. |
| [setRadiusBottom(double value)](#setRadiusBottom-double-) | Sets the radius of cylinder's bottom cap. |
| [getHeight()](#getHeight--) | Gets the height of the cylinder. |
| [setHeight(double value)](#setHeight-double-) | Sets the height of the cylinder. |
| [getRadialSegments()](#getRadialSegments--) | Gets the radial segments. |
| [setRadialSegments(int value)](#setRadialSegments-int-) | Sets the radial segments. |
| [getHeightSegments()](#getHeightSegments--) | Gets the height segments. |
| [setHeightSegments(int value)](#setHeightSegments-int-) | Sets the height segments. |
| [getOpenEnded()](#getOpenEnded--) | Gets a value indicating whether this com.aspose.threed.Cylinder open ended. |
| [setOpenEnded(boolean value)](#setOpenEnded-boolean-) | Sets a value indicating whether this com.aspose.threed.Cylinder open ended. |
| [getThetaStart()](#getThetaStart--) | Gets the theta start. |
| [setThetaStart(double value)](#setThetaStart-double-) | Sets the theta start. |
| [getThetaLength()](#getThetaLength--) | Gets the length of the theta. |
| [setThetaLength(double value)](#setThetaLength-double-) | Sets the length of the theta. |
| [toMesh()](#toMesh--) | Convert current object to mesh |
### Cylinder() {#Cylinder--}
```
public Cylinder()
```


Initializes a new instance of the com.aspose.threed.Cylinder class.

### Cylinder(double radius, double height) {#Cylinder-double-double-}
```
public Cylinder(double radius, double height)
```


Initializes a new instance of the com.aspose.threed.Cylinder class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| radius | double | Radius of the top and bottom cap. |
| height | double | Height. |

### Cylinder(double radiusTop, double radiusBottom, double height) {#Cylinder-double-double-double-}
```
public Cylinder(double radiusTop, double radiusBottom, double height)
```


Initializes a new instance of the com.aspose.threed.Cylinder class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| radiusTop | double | Radius top. |
| radiusBottom | double | Radius bottom. |
| height | double | Height. |

### Cylinder(double radiusTop, double radiusBottom, double height, int radialSegments, int heightSegments, boolean openEnded) {#Cylinder-double-double-double-int-int-boolean-}
```
public Cylinder(double radiusTop, double radiusBottom, double height, int radialSegments, int heightSegments, boolean openEnded)
```


Initializes a new instance of the com.aspose.threed.Cylinder class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| radiusTop | double | Radius of cylinder's top cap. |
| radiusBottom | double | Radius of cylinder's bottom cap. |
| height | double | Height of the cylinder. |
| radialSegments | int | Radial segments of both top and bottom circles.. |
| heightSegments | int | Height segments. |
| openEnded | boolean | If set to \`\`\` true \`\`\` the cylinder would have no bottom/top caps.. |

### Cylinder(String name, double radiusTop, double radiusBottom, double height, int radialSegments, int heightSegments, boolean openEnded, double thetaStart, double thetaLength) {#Cylinder-java.lang.String-double-double-double-int-int-boolean-double-double-}
```
public Cylinder(String name, double radiusTop, double radiusBottom, double height, int radialSegments, int heightSegments, boolean openEnded, double thetaStart, double thetaLength)
```


Initializes a new instance of the com.aspose.threed.Cylinder class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The name of this object |
| radiusTop | double | Radius of cylinder's top cap. |
| radiusBottom | double | Radius of cylinder's bottom cap. |
| height | double | Height of the cylinder. |
| radialSegments | int | Radial segments of both top and bottom circles.. |
| heightSegments | int | Height segments. |
| openEnded | boolean | If set to \`\`\` true \`\`\` the cylinder would have no bottom/top caps.. |
| thetaStart | double | Theta start. |
| thetaLength | double | Theta length. |

### getOffsetBottom() {#getOffsetBottom--}
```
public Vector3 getOffsetBottom()
```


Gets the vertices transformation offset of the bottom side.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setOffsetBottom(Vector3 value) {#setOffsetBottom-com.aspose.threed.Vector3-}
```
public void setOffsetBottom(Vector3 value)
```


Sets the vertices transformation offset of the bottom side.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getOffsetTop() {#getOffsetTop--}
```
public Vector3 getOffsetTop()
```


Gets the vertices transformation offset of the top side.

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### setOffsetTop(Vector3 value) {#setOffsetTop-com.aspose.threed.Vector3-}
```
public void setOffsetTop(Vector3 value)
```


Sets the vertices transformation offset of the top side.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### getGenerateFanCylinder() {#getGenerateFanCylinder--}
```
public boolean getGenerateFanCylinder()
```


Gets whether to generate the fan-style cylinder when the ThetaLength is less than 2\*PI, otherwise the model will not be cut.

**Returns:**
boolean
### setGenerateFanCylinder(boolean value) {#setGenerateFanCylinder-boolean-}
```
public void setGenerateFanCylinder(boolean value)
```


Sets whether to generate the fan-style cylinder when the ThetaLength is less than 2\*PI, otherwise the model will not be cut.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getShearBottom() {#getShearBottom--}
```
public Vector2 getShearBottom()
```


Gets of the shear transform of the bottom side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0)

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### setShearBottom(Vector2 value) {#setShearBottom-com.aspose.threed.Vector2-}
```
public void setShearBottom(Vector2 value)
```


Sets of the shear transform of the bottom side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | New value |

### getShearTop() {#getShearTop--}
```
public Vector2 getShearTop()
```


Gets of the shear transform of the top side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0)

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### setShearTop(Vector2 value) {#setShearTop-com.aspose.threed.Vector2-}
```
public void setShearTop(Vector2 value)
```


Sets of the shear transform of the top side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | New value |

### getRadiusTop() {#getRadiusTop--}
```
public double getRadiusTop()
```


Gets the radius of cylinder's top cap.

**Returns:**
double
### setRadiusTop(double value) {#setRadiusTop-double-}
```
public void setRadiusTop(double value)
```


Sets the radius of cylinder's top cap.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getRadiusBottom() {#getRadiusBottom--}
```
public double getRadiusBottom()
```


Gets the radius of cylinder's bottom cap.

**Returns:**
double
### setRadiusBottom(double value) {#setRadiusBottom-double-}
```
public void setRadiusBottom(double value)
```


Sets the radius of cylinder's bottom cap.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getHeight() {#getHeight--}
```
public double getHeight()
```


Gets the height of the cylinder.

**Returns:**
double
### setHeight(double value) {#setHeight-double-}
```
public void setHeight(double value)
```


Sets the height of the cylinder.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getRadialSegments() {#getRadialSegments--}
```
public int getRadialSegments()
```


Gets the radial segments.

**Returns:**
int
### setRadialSegments(int value) {#setRadialSegments-int-}
```
public void setRadialSegments(int value)
```


Sets the radial segments.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getHeightSegments() {#getHeightSegments--}
```
public int getHeightSegments()
```


Gets the height segments.

**Returns:**
int
### setHeightSegments(int value) {#setHeightSegments-int-}
```
public void setHeightSegments(int value)
```


Sets the height segments.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getOpenEnded() {#getOpenEnded--}
```
public boolean getOpenEnded()
```


Gets a value indicating whether this com.aspose.threed.Cylinder open ended. The default value is false.

**Returns:**
boolean
### setOpenEnded(boolean value) {#setOpenEnded-boolean-}
```
public void setOpenEnded(boolean value)
```


Sets a value indicating whether this com.aspose.threed.Cylinder open ended. The default value is false.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getThetaStart() {#getThetaStart--}
```
public double getThetaStart()
```


Gets the theta start. The default value is 0.

**Returns:**
double
### setThetaStart(double value) {#setThetaStart-double-}
```
public void setThetaStart(double value)
```


Sets the theta start. The default value is 0.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getThetaLength() {#getThetaLength--}
```
public double getThetaLength()
```


Gets the length of the theta. The default value is 2\\u03c0.

**Returns:**
double
### setThetaLength(double value) {#setThetaLength-double-}
```
public void setThetaLength(double value)
```


Sets the length of the theta. The default value is 2\\u03c0.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### toMesh() {#toMesh--}
```
public Mesh toMesh()
```


Convert current object to mesh

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - The mesh.
