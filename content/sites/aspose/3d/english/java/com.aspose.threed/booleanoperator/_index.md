---
title: BooleanOperator
second_title: Aspose.3D for Java API Reference
description: Boolean operator allows you to apply Boolean operation on two  instances.
type: docs
weight: 23
url: /java/com.aspose.threed/booleanoperator/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity)

**All Implemented Interfaces:**
[com.aspose.threed.IMeshConvertible](../../com.aspose.threed/imeshconvertible)
```
public class BooleanOperator extends Entity implements IMeshConvertible
```

Boolean operator allows you to apply Boolean operation on two [IMeshConvertible](../../com.aspose.threed/imeshconvertible) instances.
## Constructors

| Constructor | Description |
| --- | --- |
| [BooleanOperator()](#BooleanOperator--) | Constructor of [BooleanOperator](../../com.aspose.threed/booleanoperator) |
| [BooleanOperator(BooleanOperation operation, A3DObject first, A3DObject second)](#BooleanOperator-com.aspose.threed.BooleanOperation-com.aspose.threed.A3DObject-com.aspose.threed.A3DObject-) | Constructs a new instance of [BooleanOperator](../../com.aspose.threed/booleanoperator) with two operands |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [getBoundingBox()](#getBoundingBox--) | Gets the bounding box of current entity in its object space coordinate system. |
| [getClass()](#getClass--) |  |
| [getEntityRendererKey()](#getEntityRendererKey--) | Gets the key of the entity renderer registered in the renderer |
| [getExcluded()](#getExcluded--) | Gets whether to exclude this entity during exporting. |
| [getFirst()](#getFirst--) | The first operand of the Boolean operator |
| [getName()](#getName--) | Gets the name. |
| [getOperator()](#getOperator--) | The Boolean operator used in the operation to create the result mesh. |
| [getParentNode()](#getParentNode--) | Gets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [getParentNodes()](#getParentNodes--) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getScene()](#getScene--) | Gets the scene that this object belongs to |
| [getSecond()](#getSecond--) | The second operand of the Boolean operator |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Sets whether to exclude this entity during exporting. |
| [setFirst(BooleanOperand value)](#setFirst-com.aspose.threed.BooleanOperand-) | The first operand of the Boolean operator |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setOperator(BooleanOperation value)](#setOperator-com.aspose.threed.BooleanOperation-) | The Boolean operator used in the operation to create the result mesh. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [setSecond(BooleanOperand value)](#setSecond-com.aspose.threed.BooleanOperand-) | The second operand of the Boolean operator |
| [toMesh()](#toMesh--) | Perform the Boolean operation on two operands |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### BooleanOperator() {#BooleanOperator--}
```
public BooleanOperator()
```


Constructor of [BooleanOperator](../../com.aspose.threed/booleanoperator)

### BooleanOperator(BooleanOperation operation, A3DObject first, A3DObject second) {#BooleanOperator-com.aspose.threed.BooleanOperation-com.aspose.threed.A3DObject-com.aspose.threed.A3DObject-}
```
public BooleanOperator(BooleanOperation operation, A3DObject first, A3DObject second)
```


Constructs a new instance of [BooleanOperator](../../com.aspose.threed/booleanoperator) with two operands

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| operation | [BooleanOperation](../../com.aspose.threed/booleanoperation) | Boolean operation kind |
| first | [A3DObject](../../com.aspose.threed/a3dobject) | Instance of [IMeshConvertible](../../com.aspose.threed/imeshconvertible), [HalfSpace](../../com.aspose.threed/halfspace) or [Node](../../com.aspose.threed/node) |
| second | [A3DObject](../../com.aspose.threed/a3dobject) | Instance of [IMeshConvertible](../../com.aspose.threed/imeshconvertible), [HalfSpace](../../com.aspose.threed/halfspace) or [Node](../../com.aspose.threed/node) |

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
### getEntityRendererKey() {#getEntityRendererKey--}
```
public EntityRendererKey getEntityRendererKey()
```


Gets the key of the entity renderer registered in the renderer

**Returns:**
[EntityRendererKey](../../com.aspose.threed/entityrendererkey) - the key of the entity renderer registered in the renderer
### getExcluded() {#getExcluded--}
```
public boolean getExcluded()
```


Gets whether to exclude this entity during exporting.

**Returns:**
boolean - whether to exclude this entity during exporting.
### getFirst() {#getFirst--}
```
public BooleanOperand getFirst()
```


The first operand of the Boolean operator

**Returns:**
[BooleanOperand](../../com.aspose.threed/booleanoperand) - The first operand of the Boolean operator
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String - the name.
### getOperator() {#getOperator--}
```
public BooleanOperation getOperator()
```


The Boolean operator used in the operation to create the result mesh.

**Returns:**
[BooleanOperation](../../com.aspose.threed/booleanoperation) - The Boolean operator used in the operation to create the result mesh.
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
### getSecond() {#getSecond--}
```
public BooleanOperand getSecond()
```


The second operand of the Boolean operator

**Returns:**
[BooleanOperand](../../com.aspose.threed/booleanoperand) - The second operand of the Boolean operator
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
### setExcluded(boolean value) {#setExcluded-boolean-}
```
public void setExcluded(boolean value)
```


Sets whether to exclude this entity during exporting.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setFirst(BooleanOperand value) {#setFirst-com.aspose.threed.BooleanOperand-}
```
public void setFirst(BooleanOperand value)
```


The first operand of the Boolean operator

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [BooleanOperand](../../com.aspose.threed/booleanoperand) | New value |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Sets the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setOperator(BooleanOperation value) {#setOperator-com.aspose.threed.BooleanOperation-}
```
public void setOperator(BooleanOperation value)
```


The Boolean operator used in the operation to create the result mesh.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [BooleanOperation](../../com.aspose.threed/booleanoperation) | New value |

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

### setSecond(BooleanOperand value) {#setSecond-com.aspose.threed.BooleanOperand-}
```
public void setSecond(BooleanOperand value)
```


The second operand of the Boolean operator

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [BooleanOperand](../../com.aspose.threed/booleanoperand) | New value |

### toMesh() {#toMesh--}
```
public Mesh toMesh()
```


Perform the Boolean operation on two operands

**Returns:**
[Mesh](../../com.aspose.threed/mesh)
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

