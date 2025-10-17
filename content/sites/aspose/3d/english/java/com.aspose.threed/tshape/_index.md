---
title: TShape
second_title: Aspose.3D for Java API Reference
description: IFC compatible T-shape defined by parameters.
type: docs
weight: 182
url: /java/com.aspose.threed/tshape/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Profile](../../com.aspose.threed/profile), [com.aspose.threed.ParameterizedProfile](../../com.aspose.threed/parameterizedprofile)
```
public class TShape extends ParameterizedProfile
```

IFC compatible T-shape defined by parameters.
## Constructors

| Constructor | Description |
| --- | --- |
| [TShape()](#TShape--) | Constructor of [TShape](../../com.aspose.threed/tshape) |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [getBoundingBox()](#getBoundingBox--) | Gets the bounding box of current entity in its object space coordinate system. |
| [getClass()](#getClass--) |  |
| [getDepth()](#getDepth--) | Gets the length of the web. |
| [getEntityRendererKey()](#getEntityRendererKey--) | Gets the key of the entity renderer registered in the renderer |
| [getExcluded()](#getExcluded--) | Gets whether to exclude this entity during exporting. |
| [getExtent()](#getExtent--) | Gets the extent in x and y dimension. |
| [getFilletRadius()](#getFilletRadius--) | Gets the radius of fillet between web and flange. |
| [getFlangeEdgeRadius()](#getFlangeEdgeRadius--) | Gets the radius of the flange edge. |
| [getFlangeThickness()](#getFlangeThickness--) | Gets the wall thickness of flange. |
| [getFlangeWidth()](#getFlangeWidth--) | Gets the length of the flange. |
| [getName()](#getName--) | Gets the name. |
| [getParentNode()](#getParentNode--) | Gets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [getParentNodes()](#getParentNodes--) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getScene()](#getScene--) | Gets the scene that this object belongs to |
| [getWebEdgeRadius()](#getWebEdgeRadius--) | Gets the radius of web edge. |
| [getWebThickness()](#getWebThickness--) | Gets the wall thickness of web. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [setDepth(double value)](#setDepth-double-) | Sets the length of the web. |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Sets whether to exclude this entity during exporting. |
| [setFilletRadius(double value)](#setFilletRadius-double-) | Sets the radius of fillet between web and flange. |
| [setFlangeEdgeRadius(double value)](#setFlangeEdgeRadius-double-) | Sets the radius of the flange edge. |
| [setFlangeThickness(double value)](#setFlangeThickness-double-) | Sets the wall thickness of flange. |
| [setFlangeWidth(double value)](#setFlangeWidth-double-) | Sets the length of the flange. |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [setWebEdgeRadius(double value)](#setWebEdgeRadius-double-) | Sets the radius of web edge. |
| [setWebThickness(double value)](#setWebThickness-double-) | Sets the wall thickness of web. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TShape() {#TShape--}
```
public TShape()
```


Constructor of [TShape](../../com.aspose.threed/tshape)

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
### getDepth() {#getDepth--}
```
public double getDepth()
```


Gets the length of the web.

**Returns:**
double - the length of the web.
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
### getExtent() {#getExtent--}
```
public Vector2 getExtent()
```


Gets the extent in x and y dimension.

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### getFilletRadius() {#getFilletRadius--}
```
public double getFilletRadius()
```


Gets the radius of fillet between web and flange.

**Returns:**
double - the radius of fillet between web and flange.
### getFlangeEdgeRadius() {#getFlangeEdgeRadius--}
```
public double getFlangeEdgeRadius()
```


Gets the radius of the flange edge.

**Returns:**
double - the radius of the flange edge.
### getFlangeThickness() {#getFlangeThickness--}
```
public double getFlangeThickness()
```


Gets the wall thickness of flange.

**Returns:**
double - the wall thickness of flange.
### getFlangeWidth() {#getFlangeWidth--}
```
public double getFlangeWidth()
```


Gets the length of the flange.

**Returns:**
double - the length of the flange.
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String - the name.
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
### getScene() {#getScene--}
```
public Scene getScene()
```


Gets the scene that this object belongs to

**Returns:**
[Scene](../../com.aspose.threed/scene) - the scene that this object belongs to
### getWebEdgeRadius() {#getWebEdgeRadius--}
```
public double getWebEdgeRadius()
```


Gets the radius of web edge.

**Returns:**
double - the radius of web edge.
### getWebThickness() {#getWebThickness--}
```
public double getWebThickness()
```


Gets the wall thickness of web.

**Returns:**
double - the wall thickness of web.
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
### setDepth(double value) {#setDepth-double-}
```
public void setDepth(double value)
```


Sets the length of the web.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setExcluded(boolean value) {#setExcluded-boolean-}
```
public void setExcluded(boolean value)
```


Sets whether to exclude this entity during exporting.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setFilletRadius(double value) {#setFilletRadius-double-}
```
public void setFilletRadius(double value)
```


Sets the radius of fillet between web and flange.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setFlangeEdgeRadius(double value) {#setFlangeEdgeRadius-double-}
```
public void setFlangeEdgeRadius(double value)
```


Sets the radius of the flange edge.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setFlangeThickness(double value) {#setFlangeThickness-double-}
```
public void setFlangeThickness(double value)
```


Sets the wall thickness of flange.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setFlangeWidth(double value) {#setFlangeWidth-double-}
```
public void setFlangeWidth(double value)
```


Sets the length of the flange.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Sets the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

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

### setWebEdgeRadius(double value) {#setWebEdgeRadius-double-}
```
public void setWebEdgeRadius(double value)
```


Sets the radius of web edge.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setWebThickness(double value) {#setWebThickness-double-}
```
public void setWebThickness(double value)
```


Sets the wall thickness of web.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

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

