---
title: Node 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/node/
---
## Node class

  Represents an element in the scene graph.  A scene graph is a tree of Node objects. The tree management services are self contained in this class.  Note the Aspose.3D SDK does not test the validity of the constructed scene graph. It is the responsibility of the caller to make sure that it does not generate cyclic graphs in a node hierarchy.  Besides the tree management, this class defines all the properties required to describe the position of the object in the scene. This information include the basic Translation, Rotation and Scaling properties and the more advanced options for pivots, limits, and IK joints attributes such the stiffness and dampening.  When it is first created, the Node object is "empty" (i.e: it is an object without any graphical representation that only contains the position information). In this state, it can be used to represent parents in the node tree structure but not much more. The normal use of this type of objects is to add them an entity that will specialize the node (see the "Entity").  The entity is an object in itself and is connected to the the Node. This also means that the same entity can be shared among multiple nodes. Camera, Light, Mesh, etc... are all entities and they all derived from the base class Entity.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Initializes a new instance of the Node class. | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(name, entity) | Initializes a new instance of the Node class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name. |
| entity | Entity | Default entity. |

 **Result:**



---


### constructor_overload$2{#constructor_overload$2}

| Name | Description |
| --- | --- |
| constructor_overload$2(name) | Initializes a new instance of the Node class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name. |

 **Result:**



---


### getAssetInfo{#getAssetInfo}

| Name | Description |
| --- | --- |
| getAssetInfo() | Per-node asset info | 

 **Result:**



---


### setAssetInfo{#setAssetInfo}

| Name | Description |
| --- | --- |
| setAssetInfo(value) | Per-node asset info | 

 **Result:**



---


### getVisible{#getVisible}

| Name | Description |
| --- | --- |
| getVisible() | Gets or sets to show the node | 

 **Result:**



---


### setVisible{#setVisible}

| Name | Description |
| --- | --- |
| setVisible(value) | Gets or sets to show the node | 

 **Result:**



---


### getChildNodes{#getChildNodes}

| Name | Description |
| --- | --- |
| getChildNodes() | Gets the children nodes. The nodes. | 

 **Result:**



---


### getEntity{#getEntity}

| Name | Description |
| --- | --- |
| getEntity() | Gets or sets the first entity attached to this node, if sets, will clear other entities. The node entity. | 

 **Result:**



---


### setEntity{#setEntity}

| Name | Description |
| --- | --- |
| setEntity(value) | Gets or sets the first entity attached to this node, if sets, will clear other entities. The node entity. | 

 **Result:**



---


### getExcluded{#getExcluded}

| Name | Description |
| --- | --- |
| getExcluded() | Gets or sets whether to exclude this node and all child nodes/entities during exporting. | 

 **Result:**



---


### setExcluded{#setExcluded}

| Name | Description |
| --- | --- |
| setExcluded(value) | Gets or sets whether to exclude this node and all child nodes/entities during exporting. | 

 **Result:**



---


### getEntities{#getEntities}

| Name | Description |
| --- | --- |
| getEntities() | Gets all node entities. The node entities. | 

 **Result:**



---


### getMetaDatas{#getMetaDatas}

| Name | Description |
| --- | --- |
| getMetaDatas() | Gets the meta data defined in this node. The meta datas. | 

 **Result:**



---


### getMaterials{#getMaterials}

| Name | Description |
| --- | --- |
| getMaterials() | Gets the materials associated with this node. The materials. | 

 **Result:**



---


### getMaterial{#getMaterial}

| Name | Description |
| --- | --- |
| getMaterial() | Gets or sets the first material associated with this node, if sets, will clear other materials The material. | 

 **Result:**



---


### setMaterial{#setMaterial}

| Name | Description |
| --- | --- |
| setMaterial(value) | Gets or sets the first material associated with this node, if sets, will clear other materials The material. | 

 **Result:**



---


### getParentNode{#getParentNode}

| Name | Description |
| --- | --- |
| getParentNode() | Gets or sets the parent node. The parent node. | 

 **Result:**



---


### setParentNode{#setParentNode}

| Name | Description |
| --- | --- |
| setParentNode(value) | Gets or sets the parent node. The parent node. | 

 **Result:**



---


### getTransform{#getTransform}

| Name | Description |
| --- | --- |
| getTransform() | Gets the local transform. The transform. | 

 **Result:**



---


### getGlobalTransform{#getGlobalTransform}

| Name | Description |
| --- | --- |
| getGlobalTransform() | Gets the global transform. The global transform. | 

 **Result:**



---


### getScene{#getScene}

| Name | Description |
| --- | --- |
| getScene() | Gets the scene that this object belongs to | 

 **Result:**



---


### getName{#getName}

| Name | Description |
| --- | --- |
| getName() | Gets or sets the name. The name. | 

 **Result:**



---


### setName{#setName}

| Name | Description |
| --- | --- |
| setName(value) | Gets or sets the name. The name. | 

 **Result:**



---


### getProperties{#getProperties}

| Name | Description |
| --- | --- |
| getProperties() | Gets the collection of all properties. | 

 **Result:**



---


### createChildNode{#createChildNode}

| Name | Description |
| --- | --- |
| createChildNode() | Creates a child node | 

 **Result:**
Node


---


### merge{#merge}

| Name | Description |
| --- | --- |
| merge(node) | Detach everything under the node and attach them to current node. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  nod | Node | null |

 **Result:**
Node


---


### createChildNode{#createChildNode}

| Name | Description |
| --- | --- |
| createChildNode(nodeName) | Create a new child node with given node name | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| nodeName | String | The new child node's name |

 **Result:**
Node


---


### createChildNode{#createChildNode}

| Name | Description |
| --- | --- |
| createChildNode(entity) | Create a new child node with given entity attached | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| entity | Entity | Default entity attached to the node |

 **Result:**
Node


---


### createChildNode{#createChildNode}

| Name | Description |
| --- | --- |
| createChildNode(nodeName, entity) | Create a new child node with given node name | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| nodeName | String | The new child node's name |
| entity | Entity | Default entity attached to the node |

 **Result:**
Node


---


### createChildNode{#createChildNode}

| Name | Description |
| --- | --- |
| createChildNode(nodeName, entity, material) | Create a new child node with given node name, and attach specified entity and a material | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| nodeName | String | The new child node's name |
| entity | Entity | Default entity attached to the node |
| material | Material | The material attached to the node |

 **Result:**
Node


---


### evaluateGlobalTransform{#evaluateGlobalTransform}

| Name | Description |
| --- | --- |
| evaluateGlobalTransform(withGeometricTransform) | Evaluate the global transform, include the geometric transform or not. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| withGeometricTransform | boolean | Whether the geometric transform is needed. |

 **Result:**
Matrix4


---


### getChild{#getChild}

| Name | Description |
| --- | --- |
| getChild(index) | Gets the child node at specified index. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| index | Number | Index. |

 **Result:**
Node


---


### getChild{#getChild}

| Name | Description |
| --- | --- |
| getChild(nodeName) | Gets the child node with the specified name | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| nodeName | String | The child name to find. |

 **Result:**
Node


---


### accept{#accept}

| Name | Description |
| --- | --- |
| accept(visitor) | Walks through all descendant nodes(including the current node) and call the visitor with the node. Visitor can break the walk-through by returning false | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| visitor | NodeVisitor | Visitor callback to visit the node |

 **Result:**
boolean


---


### toString{#toString}

| Name | Description |
| --- | --- |
| toString() | Gets the string representation of this node. | 

 **Result:**
String


---


### getBoundingBox{#getBoundingBox}

| Name | Description |
| --- | --- |
| getBoundingBox() | Calculate the bounding box of the node | 

 **Result:**
BoundingBox


---


### addEntity{#addEntity}

| Name | Description |
| --- | --- |
| addEntity(entity) | Add an entity to the node. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| entity | Entity | The entity to be attached to the node |

 **Result:**
BoundingBox


---


### addChildNode{#addChildNode}

| Name | Description |
| --- | --- |
| addChildNode(node) | Add a child node to this node | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| node | Node | The child node to be attached |

 **Result:**
BoundingBox


---


### selectSingleObject{#selectSingleObject}

| Name | Description |
| --- | --- |
| selectSingleObject(path) | Select single object under current node using XPath-like query syntax. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  pat | String | null |

 **Result:**
Object


---


### selectObjects{#selectObjects}

| Name | Description |
| --- | --- |
| selectObjects(path) | Select multiple objects under current node using XPath-like query syntax. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  pat | String | null |

 **Result:**
0, Culture=neutral, PublicKeyToken=b77a5c561934e089]]


---


### removeProperty{#removeProperty}

| Name | Description |
| --- | --- |
| removeProperty(property) | Removes a dynamic property. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| property | Property | Which property to remove |

 **Result:**
boolean


---


### removeProperty{#removeProperty}

| Name | Description |
| --- | --- |
| removeProperty(property) | Remove the specified property identified by name | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  propert | String | null |

 **Result:**
boolean


---


### getProperty{#getProperty}

| Name | Description |
| --- | --- |
| getProperty(property) | Get the value of specified property | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| property | String | Property name |

 **Result:**
Object


---


### setProperty{#setProperty}

| Name | Description |
| --- | --- |
| setProperty(property, value) | Sets the value of specified property | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| property | String | Property name |
| value | Object | The value of the property |

 **Result:**
Object


---


### findProperty{#findProperty}

| Name | Description |
| --- | --- |
| findProperty(propertyName) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| propertyName | String | Property name. |

 **Result:**
Property


---



