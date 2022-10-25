---
title: Node
second_title: Aspose.3D for Java API Reference
description: Represents an element in the scene graph.
type: docs
weight: 98
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
| [Node()](#Node--) | Initializes a new instance of the com.aspose.threed.Node class. |
| [Node(String name, Entity entity)](#Node-java.lang.String-com.aspose.threed.Entity-) | Initializes a new instance of the com.aspose.threed.Node class. |
| [Node(String name)](#Node-java.lang.String-) | Initializes a new instance of the com.aspose.threed.Node class. |
## Methods

| Method | Description |
| --- | --- |
| [getAssetInfo()](#getAssetInfo--) | Per-node asset info |
| [setAssetInfo(AssetInfo value)](#setAssetInfo-com.aspose.threed.AssetInfo-) | Per-node asset info |
| [getVisible()](#getVisible--) | Gets to show the node |
| [setVisible(boolean value)](#setVisible-boolean-) | Sets to show the node |
| [getChildNodes()](#getChildNodes--) | Gets the children nodes. |
| [createChildNode()](#createChildNode--) | Creates a child node |
| [merge(Node node)](#merge-com.aspose.threed.Node-) | Detach everything under the node and attach them to current node. |
| [createChildNode(String nodeName)](#createChildNode-java.lang.String-) | Create a new child node with given node name |
| [createChildNode(Entity entity)](#createChildNode-com.aspose.threed.Entity-) | Create a new child node with given entity attached |
| [createChildNode(String nodeName, Entity entity)](#createChildNode-java.lang.String-com.aspose.threed.Entity-) | Create a new child node with given node name |
| [createChildNode(String nodeName, Entity entity, Material material)](#createChildNode-java.lang.String-com.aspose.threed.Entity-com.aspose.threed.Material-) | Create a new child node with given node name, and attach specified entity and a material |
| [getEntity()](#getEntity--) | Gets the first entity attached to this node, if sets, will clear other entities. |
| [setEntity(Entity value)](#setEntity-com.aspose.threed.Entity-) | Sets the first entity attached to this node, if sets, will clear other entities. |
| [getExcluded()](#getExcluded--) | Gets whether to exclude this node and all child nodes/entities during exporting. |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Sets whether to exclude this node and all child nodes/entities during exporting. |
| [getEntities()](#getEntities--) | Gets all node entities. |
| [getMetaDatas()](#getMetaDatas--) | Gets the meta data defined in this node. |
| [getMaterials()](#getMaterials--) | Gets the materials associated with this node. |
| [getMaterial()](#getMaterial--) | Gets the first material associated with this node, if sets, will clear other materials |
| [setMaterial(Material value)](#setMaterial-com.aspose.threed.Material-) | Sets the first material associated with this node, if sets, will clear other materials |
| [getParentNode()](#getParentNode--) | Gets the parent node. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Sets the parent node. |
| [getTransform()](#getTransform--) | Gets the local transform. |
| [evaluateGlobalTransform(boolean withGeometricTransform)](#evaluateGlobalTransform-boolean-) | Evaluate the global transform, include the geometric transform or not. |
| [getGlobalTransform()](#getGlobalTransform--) | Gets the global transform. |
| [getChild(int index)](#getChild-int-) | Gets the child node at specified index. |
| [getChild(String nodeName)](#getChild-java.lang.String-) | Gets the child node with the specified name |
| [accept(NodeVisitor visitor)](#accept-com.aspose.threed.NodeVisitor-) | Walks through all descendant nodes(including the current node) and call the visitor with the node. |
| [toString()](#toString--) | Gets the string representation of this node. |
| [getBoundingBox()](#getBoundingBox--) | Calculate the bounding box of the node |
| [addEntity(Entity entity)](#addEntity-com.aspose.threed.Entity-) | Add an entity to the node. |
| [addChildNode(Node node)](#addChildNode-com.aspose.threed.Node-) | Add a child node to this node |
| [selectSingleObject(String path)](#selectSingleObject-java.lang.String-) | Select single object under current node using XPath-like query syntax. |
| [selectObjects(String path)](#selectObjects-java.lang.String-) | Select multiple objects under current node using XPath-like query syntax. |
### Node() {#Node--}
```
public Node()
```


Initializes a new instance of the com.aspose.threed.Node class.

### Node(String name, Entity entity) {#Node-java.lang.String-com.aspose.threed.Entity-}
```
public Node(String name, Entity entity)
```


Initializes a new instance of the com.aspose.threed.Node class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |
| entity | [Entity](../../com.aspose.threed/entity) | Default entity. |

### Node(String name) {#Node-java.lang.String-}
```
public Node(String name)
```


Initializes a new instance of the com.aspose.threed.Node class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |

### getAssetInfo() {#getAssetInfo--}
```
public AssetInfo getAssetInfo()
```


Per-node asset info

**Returns:**
[AssetInfo](../../com.aspose.threed/assetinfo)
### setAssetInfo(AssetInfo value) {#setAssetInfo-com.aspose.threed.AssetInfo-}
```
public void setAssetInfo(AssetInfo value)
```


Per-node asset info

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [AssetInfo](../../com.aspose.threed/assetinfo) | New value |

### getVisible() {#getVisible--}
```
public boolean getVisible()
```


Gets to show the node

**Returns:**
boolean
### setVisible(boolean value) {#setVisible-boolean-}
```
public void setVisible(boolean value)
```


Sets to show the node

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getChildNodes() {#getChildNodes--}
```
public List<Node> getChildNodes()
```


Gets the children nodes.

**Returns:**
java.util.List<com.aspose.threed.Node>
### createChildNode() {#createChildNode--}
```
public Node createChildNode()
```


Creates a child node

**Returns:**
[Node](../../com.aspose.threed/node) - The new child node.
### merge(Node node) {#merge-com.aspose.threed.Node-}
```
public void merge(Node node)
```


Detach everything under the node and attach them to current node.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) |  |

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
[Node](../../com.aspose.threed/node) - The new child node.
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
[Node](../../com.aspose.threed/node) - The new child node.
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
### getEntity() {#getEntity--}
```
public Entity getEntity()
```


Gets the first entity attached to this node, if sets, will clear other entities.

**Returns:**
[Entity](../../com.aspose.threed/entity)
### setEntity(Entity value) {#setEntity-com.aspose.threed.Entity-}
```
public void setEntity(Entity value)
```


Sets the first entity attached to this node, if sets, will clear other entities.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Entity](../../com.aspose.threed/entity) | New value |

### getExcluded() {#getExcluded--}
```
public boolean getExcluded()
```


Gets whether to exclude this node and all child nodes/entities during exporting.

**Returns:**
boolean
### setExcluded(boolean value) {#setExcluded-boolean-}
```
public void setExcluded(boolean value)
```


Sets whether to exclude this node and all child nodes/entities during exporting.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getEntities() {#getEntities--}
```
public List<Entity> getEntities()
```


Gets all node entities.

**Returns:**
java.util.List<com.aspose.threed.Entity>
### getMetaDatas() {#getMetaDatas--}
```
public List<CustomObject> getMetaDatas()
```


Gets the meta data defined in this node.

**Returns:**
java.util.List<com.aspose.threed.CustomObject>
### getMaterials() {#getMaterials--}
```
public List<Material> getMaterials()
```


Gets the materials associated with this node.

**Returns:**
java.util.List<com.aspose.threed.Material>
### getMaterial() {#getMaterial--}
```
public Material getMaterial()
```


Gets the first material associated with this node, if sets, will clear other materials

**Returns:**
[Material](../../com.aspose.threed/material)
### setMaterial(Material value) {#setMaterial-com.aspose.threed.Material-}
```
public void setMaterial(Material value)
```


Sets the first material associated with this node, if sets, will clear other materials

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Material](../../com.aspose.threed/material) | New value |

### getParentNode() {#getParentNode--}
```
public Node getParentNode()
```


Gets the parent node.

**Returns:**
[Node](../../com.aspose.threed/node)
### setParentNode(Node value) {#setParentNode-com.aspose.threed.Node-}
```
public void setParentNode(Node value)
```


Sets the parent node.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Node](../../com.aspose.threed/node) | New value |

### getTransform() {#getTransform--}
```
public Transform getTransform()
```


Gets the local transform.

**Returns:**
[Transform](../../com.aspose.threed/transform)
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
[Matrix4](../../com.aspose.threed/matrix4)
### getGlobalTransform() {#getGlobalTransform--}
```
public GlobalTransform getGlobalTransform()
```


Gets the global transform.

**Returns:**
[GlobalTransform](../../com.aspose.threed/globaltransform)
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
[Node](../../com.aspose.threed/node) - The child.
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
[Node](../../com.aspose.threed/node) - The child.
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
boolean - true means visitor has broke the walk through.
### toString() {#toString--}
```
public String toString()
```


Gets the string representation of this node.

**Returns:**
java.lang.String - The string representation of this node for debugging.
### getBoundingBox() {#getBoundingBox--}
```
public BoundingBox getBoundingBox()
```


Calculate the bounding box of the node

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox)
### addEntity(Entity entity) {#addEntity-com.aspose.threed.Entity-}
```
public void addEntity(Entity entity)
```


Add an entity to the node.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | The entity to be attached to the node |

### addChildNode(Node node) {#addChildNode-com.aspose.threed.Node-}
```
public void addChildNode(Node node)
```


Add a child node to this node

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) | The child node to be attached |

### selectSingleObject(String path) {#selectSingleObject-java.lang.String-}
```
public Object selectSingleObject(String path)
```


Select single object under current node using XPath-like query syntax.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.lang.String |  |

**Returns:**
java.lang.Object
### selectObjects(String path) {#selectObjects-java.lang.String-}
```
public ArrayList<Object> selectObjects(String path)
```


Select multiple objects under current node using XPath-like query syntax.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.lang.String |  |

**Returns:**
java.util.ArrayList<java.lang.Object>
