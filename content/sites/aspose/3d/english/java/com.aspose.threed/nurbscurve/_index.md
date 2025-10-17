---
title: NurbsCurve
second_title: Aspose.3D for Java API Reference
description: NURBS curve is a curve represented by NURBSNon-uniform rational basis spline  A NURBS curve is defined by its  a set of weighted  and a  The w component in control point is used as control points weight whatever it is a  or
type: docs
weight: 112
url: /java/com.aspose.threed/nurbscurve/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Curve](../../com.aspose.threed/curve)
```
public class NurbsCurve extends Curve
```

[NURBS curve][] is a curve represented by NURBS(Non-uniform rational basis spline), A NURBS curve is defined by its [getOrder](../../com.aspose.threed/nurbscurve\#getOrder), a set of weighted [Geometry.getControlPoints](../../com.aspose.threed/geometry\#getControlPoints) and a [getKnotVectors](../../com.aspose.threed/nurbscurve\#getKnotVectors) The w component in control point is used as control point's weight, whatever it is a [CurveDimension.TWO\_DIMENSIONAL](../../com.aspose.threed/curvedimension\#TWO-DIMENSIONAL) or [CurveDimension.THREE\_DIMENSIONAL](../../com.aspose.threed/curvedimension\#THREE-DIMENSIONAL)


[NURBS curve]: https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline
## Constructors

| Constructor | Description |
| --- | --- |
| [NurbsCurve()](#NurbsCurve--) | Initializes a new instance of the [NurbsCurve](../../com.aspose.threed/nurbscurve) class. |
| [NurbsCurve(String name)](#NurbsCurve-java.lang.String-) | Initializes a new instance of the [NurbsCurve](../../com.aspose.threed/nurbscurve) class. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [evaluate()](#evaluate--) | Evaluate the NURBS curve |
| [evaluate(int steps)](#evaluate-int-) | Evaluate the NURBS curve |
| [evaluateAt(double u)](#evaluateAt-double-) | Evaluate the curve's point at specified position |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [getBoundingBox()](#getBoundingBox--) | Gets the bounding box of current entity in its object space coordinate system. |
| [getClass()](#getClass--) |  |
| [getColor()](#getColor--) | Gets the color of the line, default value is white(1, 1, 1) |
| [getControlPoints()](#getControlPoints--) | Gets all control points |
| [getCurveType()](#getCurveType--) | Gets the type of the curve. |
| [getDegree()](#getDegree--) | Gets the degree of a NURBS curve, the degree are defined as Order - 1 |
| [getDimension()](#getDimension--) | Gets the curve's dimension. |
| [getEntityRendererKey()](#getEntityRendererKey--) | Gets the key of the entity renderer registered in the renderer |
| [getExcluded()](#getExcluded--) | Gets whether to exclude this entity during exporting. |
| [getKnotVectors()](#getKnotVectors--) | Gets the knot vector, it is a sequence of parameter values that determines where and how the control points affect the NURBS curve. |
| [getMultiplicity()](#getMultiplicity--) | Gets the multiplicity. |
| [getName()](#getName--) | Gets the name. |
| [getOrder()](#getOrder--) | Gets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve. |
| [getParentNode()](#getParentNode--) | Gets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [getParentNodes()](#getParentNodes--) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getRational()](#getRational--) | Gets whether it is rational, this value indicates whether this [NurbsCurve](../../com.aspose.threed/nurbscurve) is rational spline or non-rational spline. |
| [getScene()](#getScene--) | Gets the scene that this object belongs to |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [setColor(Vector3 value)](#setColor-com.aspose.threed.Vector3-) | Sets the color of the line, default value is white(1, 1, 1) |
| [setCurveType(NurbsType value)](#setCurveType-com.aspose.threed.NurbsType-) | Sets the type of the curve. |
| [setDegree(int value)](#setDegree-int-) | Sets the degree of a NURBS curve, the degree are defined as Order - 1 |
| [setDimension(CurveDimension value)](#setDimension-com.aspose.threed.CurveDimension-) | Sets the curve's dimension. |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Sets whether to exclude this entity during exporting. |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setOrder(int value)](#setOrder-int-) | Sets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [setRational(boolean value)](#setRational-boolean-) | Sets whether it is rational, this value indicates whether this [NurbsCurve](../../com.aspose.threed/nurbscurve) is rational spline or non-rational spline. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### NurbsCurve() {#NurbsCurve--}
```
public NurbsCurve()
```


Initializes a new instance of the [NurbsCurve](../../com.aspose.threed/nurbscurve) class.

### NurbsCurve(String name) {#NurbsCurve-java.lang.String-}
```
public NurbsCurve(String name)
```


Initializes a new instance of the [NurbsCurve](../../com.aspose.threed/nurbscurve) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### evaluate() {#evaluate--}
```
public Vector4[] evaluate()
```


Evaluate the NURBS curve

**Returns:**
com.aspose.threed.Vector4[] - Points in the curve
### evaluate(int steps) {#evaluate-int-}
```
public Vector4[] evaluate(int steps)
```


Evaluate the NURBS curve

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| steps | int | The evaluation frequency between two neighbor knots, default value is 20 |

**Returns:**
com.aspose.threed.Vector4[] - Points in the curve
### evaluateAt(double u) {#evaluateAt-double-}
```
public Vector4 evaluateAt(double u)
```


Evaluate the curve's point at specified position

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| u | double | The position in the curve, between 0 and 1 |

**Returns:**
[Vector4](../../com.aspose.threed/vector4)
### findProperty(String propertyName) {#findProperty-java.lang.String-}
```
public Property findProperty(String propertyName)
```


Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| propertyName | java.lang.String | Property name. |

**Returns:**
[Property](../../com.aspose.threed/property) - The property.
### getBoundingBox() {#getBoundingBox--}
```
public BoundingBox getBoundingBox()
```


Gets the bounding box of current entity in its object space coordinate system.

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox) - the bounding box of current entity in its object space coordinate system. **Example:** The following code shows how to calculate the bounding box of a shape

```
Entity entity = new Sphere();
     entity.setRadius(10);
     var bbox = entity.getBoundingBox();
     System.out.printf("The bounding box of the entity is %s ~ %s", bbox.getMinimum(), bbox.getMaximum());
```
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getColor() {#getColor--}
```
public Vector3 getColor()
```


Gets the color of the line, default value is white(1, 1, 1)

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the color of the line, default value is white(1, 1, 1)
### getControlPoints() {#getControlPoints--}
```
public List<Vector4> getControlPoints()
```


Gets all control points

**Returns:**
java.util.List<com.aspose.threed.Vector4> - all control points
### getCurveType() {#getCurveType--}
```
public NurbsType getCurveType()
```


Gets the type of the curve.

**Returns:**
[NurbsType](../../com.aspose.threed/nurbstype) - the type of the curve.
### getDegree() {#getDegree--}
```
public int getDegree()
```


Gets the degree of a NURBS curve, the degree are defined as Order - 1

**Returns:**
int - the degree of a NURBS curve, the degree are defined as Order - 1
### getDimension() {#getDimension--}
```
public CurveDimension getDimension()
```


Gets the curve's dimension.

**Returns:**
[CurveDimension](../../com.aspose.threed/curvedimension) - the curve's dimension. **Remarks:** For a [CurveDimension.TWO\_DIMENSIONAL](../../com.aspose.threed/curvedimension\#TWO-DIMENSIONAL) curve, the z component in control point is unused.
### getEntityRendererKey() {#getEntityRendererKey--}
```
public EntityRendererKey getEntityRendererKey()
```


Gets the key of the entity renderer registered in the renderer

**Returns:**
[EntityRendererKey](../../com.aspose.threed/entityrendererkey)
### getExcluded() {#getExcluded--}
```
public boolean getExcluded()
```


Gets whether to exclude this entity during exporting.

**Returns:**
boolean - whether to exclude this entity during exporting.
### getKnotVectors() {#getKnotVectors--}
```
public List<Double> getKnotVectors()
```


Gets the knot vector, it is a sequence of parameter values that determines where and how the control points affect the NURBS curve.

**Returns:**
java.util.List<java.lang.Double> - the knot vector, it is a sequence of parameter values that determines where and how the control points affect the NURBS curve.
### getMultiplicity() {#getMultiplicity--}
```
public List<Integer> getMultiplicity()
```


Gets the multiplicity.

**Returns:**
java.util.List<java.lang.Integer> - the multiplicity.
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String - the name.
### getOrder() {#getOrder--}
```
public int getOrder()
```


Gets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve.

**Returns:**
int - the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve.
### getParentNode() {#getParentNode--}
```
public Node getParentNode()
```


Gets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.

**Returns:**
[Node](../../com.aspose.threed/node) - the first parent node, if set the first parent node, this entity will be detached from other parent nodes.
### getParentNodes() {#getParentNodes--}
```
public ArrayList<Node> getParentNodes()
```


Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing

**Returns:**
java.util.ArrayList<com.aspose.threed.Node> - all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing
### getProperties() {#getProperties--}
```
public PropertyCollection getProperties()
```


Gets the collection of all properties.

**Returns:**
[PropertyCollection](../../com.aspose.threed/propertycollection) - the collection of all properties.
### getProperty(String property) {#getProperty-java.lang.String-}
```
public Object getProperty(String property)
```


Get the value of specified property

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | Property name |

**Returns:**
java.lang.Object - The value of the found property
### getRational() {#getRational--}
```
public boolean getRational()
```


Gets whether it is rational, this value indicates whether this [NurbsCurve](../../com.aspose.threed/nurbscurve) is rational spline or non-rational spline. Non-rational B-spline is a special case of rational B-splines.

**Returns:**
boolean - whether it is rational, this value indicates whether this [NurbsCurve](../../com.aspose.threed/nurbscurve) is rational spline or non-rational spline. Non-rational B-spline is a special case of rational B-splines.
### getScene() {#getScene--}
```
public Scene getScene()
```


Gets the scene that this object belongs to

**Returns:**
[Scene](../../com.aspose.threed/scene) - the scene that this object belongs to
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### removeProperty(Property property) {#removeProperty-com.aspose.threed.Property-}
```
public boolean removeProperty(Property property)
```


Removes a dynamic property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | [Property](../../com.aspose.threed/property) | Which property to remove |

**Returns:**
boolean - true if the property is successfully removed
### removeProperty(String property) {#removeProperty-java.lang.String-}
```
public boolean removeProperty(String property)
```


Remove the specified property identified by name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | Which property to remove |

**Returns:**
boolean - true if the property is successfully removed
### setColor(Vector3 value) {#setColor-com.aspose.threed.Vector3-}
```
public void setColor(Vector3 value)
```


Sets the color of the line, default value is white(1, 1, 1)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setCurveType(NurbsType value) {#setCurveType-com.aspose.threed.NurbsType-}
```
public void setCurveType(NurbsType value)
```


Sets the type of the curve.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [NurbsType](../../com.aspose.threed/nurbstype) | New value |

### setDegree(int value) {#setDegree-int-}
```
public void setDegree(int value)
```


Sets the degree of a NURBS curve, the degree are defined as Order - 1

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setDimension(CurveDimension value) {#setDimension-com.aspose.threed.CurveDimension-}
```
public void setDimension(CurveDimension value)
```


Sets the curve's dimension.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [CurveDimension](../../com.aspose.threed/curvedimension) | New value **Remarks:** For a [CurveDimension.TWO\_DIMENSIONAL](../../com.aspose.threed/curvedimension\#TWO-DIMENSIONAL) curve, the z component in control point is unused. |

### setExcluded(boolean value) {#setExcluded-boolean-}
```
public void setExcluded(boolean value)
```


Sets whether to exclude this entity during exporting.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Sets the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setOrder(int value) {#setOrder-int-}
```
public void setOrder(int value)
```


Sets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setParentNode(Node value) {#setParentNode-com.aspose.threed.Node-}
```
public void setParentNode(Node value)
```


Sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Node](../../com.aspose.threed/node) | New value |

### setProperty(String property, Object value) {#setProperty-java.lang.String-java.lang.Object-}
```
public void setProperty(String property, Object value)
```


Sets the value of specified property

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | Property name |
| value | java.lang.Object | The value of the property |

### setRational(boolean value) {#setRational-boolean-}
```
public void setRational(boolean value)
```


Sets whether it is rational, this value indicates whether this [NurbsCurve](../../com.aspose.threed/nurbscurve) is rational spline or non-rational spline. Non-rational B-spline is a special case of rational B-splines.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

