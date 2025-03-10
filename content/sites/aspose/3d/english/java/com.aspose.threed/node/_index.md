---
title: Node
second_title: Aspose.3D for Java API Reference
description: Represents an element in the scene graph.
type: docs
weight: 106
url: /java/com.aspose.threed/node/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject)
```
public class Node extends SceneObject
```

Represents an element in the scene graph. A scene graph is a tree of Node objects. The tree management services are self contained in this class. Note the Aspose.3D SDK does not test the validity of the constructed scene graph. It is the responsibility of the caller to make sure that it does not generate cyclic graphs in a node hierarchy. Besides the tree management, this class defines all the properties required to describe the position of the object in the scene. This information include the basic Translation, Rotation and Scaling properties and the more advanced options for pivots, limits, and IK joints attributes such the stiffness and dampening. When it is first created, the Node object is "empty" (i.e: it is an object without any graphical representation that only contains the position information). In this state, it can be used to represent parents in the node tree structure but not much more. The normal use of this type of objects is to add them an entity that will specialize the node (see the "Entity"). The entity is an object in itself and is connected to the the Node. This also means that the same entity can be shared among multiple nodes. Camera, Light, Mesh, etc... are all entities and they all derived from the base class Entity.
## Constructors

| Constructor | Description |
| --- | --- |
| [Node()](#Node--) | Initializes a new instance of the [Node](../../com.aspose.threed/node) class. |
| [Node(String name, Entity entity)](#Node-java.lang.String-com.aspose.threed.Entity-) | Initializes a new instance of the [Node](../../com.aspose.threed/node) class. |
| [Node(String name)](#Node-java.lang.String-) | Initializes a new instance of the [Node](../../com.aspose.threed/node) class. |
## Methods

| Method | Description |
| --- | --- |
| [accept(NodeVisitor visitor)](#accept-com.aspose.threed.NodeVisitor-) | Walks through all descendant nodes(including the current node) and call the visitor with the node. |
| [addChildNode(Node node)](#addChildNode-com.aspose.threed.Node-) | Add a child node to this node |
| [addEntity(Entity entity)](#addEntity-com.aspose.threed.Entity-) | Add an entity to the node. |
| [createChildNode()](#createChildNode--) | Creates a child node |
| [createChildNode(Entity entity)](#createChildNode-com.aspose.threed.Entity-) | Create a new child node with given entity attached |
| [createChildNode(String nodeName)](#createChildNode-java.lang.String-) | Create a new child node with given node name |
| [createChildNode(String nodeName, Entity entity)](#createChildNode-java.lang.String-com.aspose.threed.Entity-) | Create a new child node with given node name |
| [createChildNode(String nodeName, Entity entity, Material material)](#createChildNode-java.lang.String-com.aspose.threed.Entity-com.aspose.threed.Material-) | Create a new child node with given node name, and attach specified entity and a material |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [evaluateGlobalTransform(boolean withGeometricTransform)](#evaluateGlobalTransform-boolean-) | Evaluate the global transform, include the geometric transform or not. |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [getAssetInfo()](#getAssetInfo--) | Per-node asset info |
| [getBoundingBox()](#getBoundingBox--) | Calculate the bounding box of the node |
| [getChild(int index)](#getChild-int-) | Gets the child node at specified index. |
| [getChild(String nodeName)](#getChild-java.lang.String-) | Gets the child node with the specified name |
| [getChildNodes()](#getChildNodes--) | Gets the children nodes. |
| [getClass()](#getClass--) |  |
| [getEntities()](#getEntities--) | Gets all node entities. |
| [getEntity()](#getEntity--) | Gets the first entity attached to this node, if sets, will clear other entities. |
| [getExcluded()](#getExcluded--) | Gets whether to exclude this node and all child nodes/entities during exporting. |
| [getGlobalTransform()](#getGlobalTransform--) | Gets the global transform. |
| [getMaterial()](#getMaterial--) | Gets the first material associated with this node, if sets, will clear other materials |
| [getMaterials()](#getMaterials--) | Gets the materials associated with this node. |
| [getMetaDatas()](#getMetaDatas--) | Gets the meta data defined in this node. |
| [getName()](#getName--) | Gets the name. |
| [getParentNode()](#getParentNode--) | Gets the parent node. |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getScene()](#getScene--) | Gets the scene that this object belongs to |
| [getTransform()](#getTransform--) | Gets the local transform. |
| [getVisible()](#getVisible--) | Gets to show the node |
| [hashCode()](#hashCode--) |  |
| [merge(Node node)](#merge-com.aspose.threed.Node-) | Detach everything under the node and attach them to current node. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [selectObjects(String path)](#selectObjects-java.lang.String-) | Select multiple objects under current node using XPath-like query syntax. |
| [selectSingleObject(String path)](#selectSingleObject-java.lang.String-) | Select single object under current node using XPath-like query syntax. |
| [setAssetInfo(AssetInfo value)](#setAssetInfo-com.aspose.threed.AssetInfo-) | Per-node asset info |
| [setEntity(Entity value)](#setEntity-com.aspose.threed.Entity-) | Sets the first entity attached to this node, if sets, will clear other entities. |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Sets whether to exclude this node and all child nodes/entities during exporting. |
| [setMaterial(Material value)](#setMaterial-com.aspose.threed.Material-) | Sets the first material associated with this node, if sets, will clear other materials |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Sets the parent node. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [setVisible(boolean value)](#setVisible-boolean-) | Sets to show the node |
| [toString()](#toString--) | Gets the string representation of this node. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Node() {#Node--}
```
public Node()
```


Initializes a new instance of the [Node](../../com.aspose.threed/node) class.

### Node(String name, Entity entity) {#Node-java.lang.String-com.aspose.threed.Entity-}
```
public Node(String name, Entity entity)
```


Initializes a new instance of the [Node](../../com.aspose.threed/node) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |
| entity | [Entity](../../com.aspose.threed/entity) | Default entity. |

### Node(String name) {#Node-java.lang.String-}
```
public Node(String name)
```


Initializes a new instance of the [Node](../../com.aspose.threed/node) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |

### accept(NodeVisitor visitor) {#accept-com.aspose.threed.NodeVisitor-}
```
public boolean accept(NodeVisitor visitor)
```


Walks through all descendant nodes(including the current node) and call the visitor with the node. Visitor can break the walk-through by returning false

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| visitor | [NodeVisitor](../../com.aspose.threed/nodevisitor) | Visitor callback to visit the node |

**Returns:**
boolean - true means visitor has broke the walk through. **Example:** The following code shows how to get all meshes from a scene

```
Scene scene = Scene.fromFile("input.fbx");
     List<Mesh> meshes = new ArrayList<Mesh>();
     scene.getRootNode().accept(new NodeVisitor() {
         @Override
         public boolean call(Node node) {
             if(node.Entity instanceof Mesh)
                 meshes.add(((Mesh)node).getEntity());
             //continue searching
             return true;
         }
     });
```
### addChildNode(Node node) {#addChildNode-com.aspose.threed.Node-}
```
public void addChildNode(Node node)
```


Add a child node to this node

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) | The child node to be attached **Example:** The following code shows how to get all meshes from a scene

```
Scene scene = Scene.fromFile("input.fbx");
     var newNode = new Node();
     //add a new node manually
     scene.getRootNode().addChildNode(newNode);
``` |

### addEntity(Entity entity) {#addEntity-com.aspose.threed.Entity-}
```
public void addEntity(Entity entity)
```


Add an entity to the node.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | The entity to be attached to the node |

### createChildNode() {#createChildNode--}
```
public Node createChildNode()
```


Creates a child node

**Returns:**
[Node](../../com.aspose.threed/node) - The new child node. **Example:** The following code shows how to create a new child node under root node

```
Scene scene = new Scene();
     Node node = scene.getRootNode().createChildNode();
     node.setEntity(new Box());
     scene.save("output.fbx");
```
### createChildNode(Entity entity) {#createChildNode-com.aspose.threed.Entity-}
```
public Node createChildNode(Entity entity)
```


Create a new child node with given entity attached

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | Default entity attached to the node |

**Returns:**
[Node](../../com.aspose.threed/node) - The new child node. **Example:** The following code shows how to create a new child node under root node

```
Scene scene = new Scene();
     Node node = scene.getRootNode().createChildNode(new Box());
     scene.save("output.fbx");
```
### createChildNode(String nodeName) {#createChildNode-java.lang.String-}
```
public Node createChildNode(String nodeName)
```


Create a new child node with given node name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| nodeName | java.lang.String | The new child node's name |

**Returns:**
[Node](../../com.aspose.threed/node) - The new child node. **Example:** The following code shows how to create a new child node under root node

```
Scene scene = new Scene();
     Node node = scene.getRootNode().createChildNode("new node");
     node.setEntity(new Box());
     scene.save("output.fbx");
```
### createChildNode(String nodeName, Entity entity) {#createChildNode-java.lang.String-com.aspose.threed.Entity-}
```
public Node createChildNode(String nodeName, Entity entity)
```


Create a new child node with given node name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| nodeName | java.lang.String | The new child node's name |
| entity | [Entity](../../com.aspose.threed/entity) | Default entity attached to the node |

**Returns:**
[Node](../../com.aspose.threed/node) - The new child node.
### createChildNode(String nodeName, Entity entity, Material material) {#createChildNode-java.lang.String-com.aspose.threed.Entity-com.aspose.threed.Material-}
```
public Node createChildNode(String nodeName, Entity entity, Material material)
```


Create a new child node with given node name, and attach specified entity and a material

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| nodeName | java.lang.String | The new child node's name |
| entity | [Entity](../../com.aspose.threed/entity) | Default entity attached to the node |
| material | [Material](../../com.aspose.threed/material) | The material attached to the node |

**Returns:**
[Node](../../com.aspose.threed/node) - The new child node.
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
### evaluateGlobalTransform(boolean withGeometricTransform) {#evaluateGlobalTransform-boolean-}
```
public Matrix4 evaluateGlobalTransform(boolean withGeometricTransform)
```


Evaluate the global transform, include the geometric transform or not.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| withGeometricTransform | boolean | Whether the geometric transform is needed. |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - The global transform matrix. **Example:** The following code shows how to read the node's global transform matrix.

```
Scene scene = new Scene();
     var boxNode = scene.getRootNode().createChildNode(new Box());
     //place the box at (10, 0, 0)
     boxNode.getTransform().setTranslation(new Vector3(10, 0, 0));
     Matrix4 mat = boxNode.evaluateGlobalTransform(true);
     System.out.printf("The box's global transform matrix is %s", mat);
```
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
### getAssetInfo() {#getAssetInfo--}
```
public AssetInfo getAssetInfo()
```


Per-node asset info

**Returns:**
[AssetInfo](../../com.aspose.threed/assetinfo) - Per-node asset info
### getBoundingBox() {#getBoundingBox--}
```
public BoundingBox getBoundingBox()
```


Calculate the bounding box of the node

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox) - The bounding box of current node
### getChild(int index) {#getChild-int-}
```
public Node getChild(int index)
```


Gets the child node at specified index.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Index. |

**Returns:**
[Node](../../com.aspose.threed/node) - The child. **Example:** The following code shows how to get a child node at specified index.

```
Scene scene = Scene.fromFile("input.fbx");
     var node = scene.getRootNode().getChild(0);
     System.out.printf("The first node of the file is %s", node.getName());
```
### getChild(String nodeName) {#getChild-java.lang.String-}
```
public Node getChild(String nodeName)
```


Gets the child node with the specified name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| nodeName | java.lang.String | The child name to find. |

**Returns:**
[Node](../../com.aspose.threed/node) - The child. **Example:** The following code shows how to get a child node with specified name

```
Scene scene = Scene.fromFile("input.fbx");
     var node = scene.getRootNode().getChild("box");
     System.out.printf("The box node's translation is %s", node.getTransform().getTranslation());
```
### getChildNodes() {#getChildNodes--}
```
public List<Node> getChildNodes()
```


Gets the children nodes.

**Returns:**
java.util.List<com.aspose.threed.Node> - the children nodes. **Example:** The following code shows how to enumerate child node of root node

```
Scene scene = Scene.fromFile("test.fbx");
     for(var child : scene.getRootNode().getChildNodes())
     {
         //do your business
     }
```
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEntities() {#getEntities--}
```
public List<Entity> getEntities()
```


Gets all node entities.

**Returns:**
java.util.List<com.aspose.threed.Entity> - all node entities.
### getEntity() {#getEntity--}
```
public Entity getEntity()
```


Gets the first entity attached to this node, if sets, will clear other entities.

**Returns:**
[Entity](../../com.aspose.threed/entity) - the first entity attached to this node, if sets, will clear other entities. **Example:** The following code shows how to create a new child node under root node

```
Scene scene = new Scene();
     Node node = scene.getRootNode().createChildNode("new node");
     node.setEntity(new Box());
     scene.save("output.fbx");
```
### getExcluded() {#getExcluded--}
```
public boolean getExcluded()
```


Gets whether to exclude this node and all child nodes/entities during exporting.

**Returns:**
boolean - whether to exclude this node and all child nodes/entities during exporting. **Example:** The following code shows how to exclude specified node from exporting

```
Scene scene = new Scene();
     scene.getRootNode().createChildNode("excluded", new Box()).setExcluded(true);
     scene.getRootNode().createChildNode("not excluded", new Box());
     scene.save("output.usdz");
```
### getGlobalTransform() {#getGlobalTransform--}
```
public GlobalTransform getGlobalTransform()
```


Gets the global transform.

**Returns:**
[GlobalTransform](../../com.aspose.threed/globaltransform) - the global transform. **Example:** The following code shows how to read node's global transform

```
Scene scene = new Scene();
     var boxNode = scene.getRootNode().createChildNode(new Box());
     //place the box at (10, 0, 0)
     boxNode.getTransform().setTranslation(new Vector3(10, 0, 0));
     var global = boxNode.getGlobalTransform();
     System.out.printf("The box's position in world coordinate is %s", global.getTranslation());
```
### getMaterial() {#getMaterial--}
```
public Material getMaterial()
```


Gets the first material associated with this node, if sets, will clear other materials

**Returns:**
[Material](../../com.aspose.threed/material) - the first material associated with this node, if sets, will clear other materials **Example:**

```
Scene scene = new Scene();
     var node = scene.getRootNode().createChildNode(new Box());
     node.setMaterial(new LambertMaterial());
```
### getMaterials() {#getMaterials--}
```
public List<Material> getMaterials()
```


Gets the materials associated with this node.

**Returns:**
java.util.List<com.aspose.threed.Material> - the materials associated with this node.
### getMetaDatas() {#getMetaDatas--}
```
public List<CustomObject> getMetaDatas()
```


Gets the meta data defined in this node.

**Returns:**
java.util.List<com.aspose.threed.CustomObject> - the meta data defined in this node.
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


Gets the parent node.

**Returns:**
[Node](../../com.aspose.threed/node) - the parent node.
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
### getTransform() {#getTransform--}
```
public Transform getTransform()
```


Gets the local transform.

**Returns:**
[Transform](../../com.aspose.threed/transform) - the local transform. **Example:** The following code shows how to change the transform of the node:

```
Scene scene = new Scene();
     var boxNode = scene.getRootNode().createChildNode(new Box());
     //place the box at (10, 0, 0)
     boxNode.getTransform().setTranslation(new Vector3(10, 0, 0));
```
### getVisible() {#getVisible--}
```
public boolean getVisible()
```


Gets to show the node

**Returns:**
boolean - to show the node **Example:** The following code shows how to create a invisible node

```
Scene scene = new Scene();
     Node node = scene.getRootNode().createChildNode("test-node", new Box());
     node.setVisible(false);
     scene.save("output.fbx");
```
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### merge(Node node) {#merge-com.aspose.threed.Node-}
```
public void merge(Node node)
```


Detach everything under the node and attach them to current node.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) | **Example:** The following code shows how to merge two 3D files into one file

```
Scene scene1 = Scene.fromFile("scene1.fbx");
     Scene scene2 = Scene.fromFile("scene2.fbx");
     scene1.getRootNode().merge(scene2.getRootNode());
     scene1.save("merged.fbx");
``` |

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
### selectObjects(String path) {#selectObjects-java.lang.String-}
```
public ArrayList<Object> selectObjects(String path)
```


Select multiple objects under current node using XPath-like query syntax.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.lang.String | The XPath-like query |

**Returns:**
java.util.ArrayList<java.lang.Object> - Multiple object matches the XPath-like query.
### selectSingleObject(String path) {#selectSingleObject-java.lang.String-}
```
public Object selectSingleObject(String path)
```


Select single object under current node using XPath-like query syntax.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.lang.String | The XPath-like query |

**Returns:**
java.lang.Object - Object located by the XPath-like query.
### setAssetInfo(AssetInfo value) {#setAssetInfo-com.aspose.threed.AssetInfo-}
```
public void setAssetInfo(AssetInfo value)
```


Per-node asset info

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [AssetInfo](../../com.aspose.threed/assetinfo) | New value |

### setEntity(Entity value) {#setEntity-com.aspose.threed.Entity-}
```
public void setEntity(Entity value)
```


Sets the first entity attached to this node, if sets, will clear other entities.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Entity](../../com.aspose.threed/entity) | New value **Example:** The following code shows how to create a new child node under root node

```
Scene scene = new Scene();
     Node node = scene.getRootNode().createChildNode("new node");
     node.setEntity(new Box());
     scene.save("output.fbx");
``` |

### setExcluded(boolean value) {#setExcluded-boolean-}
```
public void setExcluded(boolean value)
```


Sets whether to exclude this node and all child nodes/entities during exporting.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value **Example:** The following code shows how to exclude specified node from exporting

```
Scene scene = new Scene();
     scene.getRootNode().createChildNode("excluded", new Box()).setExcluded(true);
     scene.getRootNode().createChildNode("not excluded", new Box());
     scene.save("output.usdz");
``` |

### setMaterial(Material value) {#setMaterial-com.aspose.threed.Material-}
```
public void setMaterial(Material value)
```


Sets the first material associated with this node, if sets, will clear other materials

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Material](../../com.aspose.threed/material) | New value **Example:**

```
Scene scene = new Scene();
     var node = scene.getRootNode().createChildNode(new Box());
     node.setMaterial(new LambertMaterial());
``` |

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


Sets the parent node.

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

### setVisible(boolean value) {#setVisible-boolean-}
```
public void setVisible(boolean value)
```


Sets to show the node

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value **Example:** The following code shows how to create a invisible node

```
Scene scene = new Scene();
     Node node = scene.getRootNode().createChildNode("test-node", new Box());
     node.setVisible(false);
     scene.save("output.fbx");
``` |

### toString() {#toString--}
```
public String toString()
```


Gets the string representation of this node.

**Returns:**
java.lang.String - The string representation of this node for debugging.
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

