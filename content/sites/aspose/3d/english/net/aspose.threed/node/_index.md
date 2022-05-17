---
title: Node
second_title: Aspose.3D for .NET API Reference
description: 
type: docs
weight: 1460
url: /net/aspose.threed/node/
---
## Node class

Represents an element in the scene graph. A scene graph is a tree of Node objects. The tree management services are self contained in this class. Note the Aspose.3D SDK does not test the validity of the constructed scene graph. It is the responsibility of the caller to make sure that it does not generate cyclic graphs in a node hierarchy. Besides the tree management, this class defines all the properties required to describe the position of the object in the scene. This information include the basic Translation, Rotation and Scaling properties and the more advanced options for pivots, limits, and IK joints attributes such the stiffness and dampening. When it is first created, the Node object is "empty" (i.e: it is an object without any graphical representation that only contains the position information). In this state, it can be used to represent parents in the node tree structure but not much more. The normal use of this type of objects is to add them an entity that will specialize the node (see the "Entity"). The entity is an object in itself and is connected to the the Node. This also means that the same entity can be shared among multiple nodes. Camera, Light, Mesh, etc... are all entities and they all derived from the base class Entity.

```csharp
public class Node : SceneObject
```

## Constructors

| Name | Description |
| --- | --- |
| [Node](node)() | Initializes a new instance of the [`Node`](../node) class. |
| [Node](node)(string) | Initializes a new instance of the [`Node`](../node) class. |
| [Node](node)(string, Entity) | Initializes a new instance of the [`Node`](../node) class. |

## Properties

| Name | Description |
| --- | --- |
| [AssetInfo](../../aspose.threed/node/assetinfo) { get; set; } | Per-node asset info |
| [ChildNodes](../../aspose.threed/node/childnodes) { get; } | Gets the children nodes. |
| [Entities](../../aspose.threed/node/entities) { get; } | Gets all node entities. |
| [Entity](../../aspose.threed/node/entity) { get; set; } | Gets or sets the first entity attached to this node, if sets, will clear other entities. |
| [Excluded](../../aspose.threed/node/excluded) { get; set; } | Gets or sets whether to exclude this node and all child nodes/entities during exporting. |
| [GlobalTransform](../../aspose.threed/node/globaltransform) { get; } | Gets the global transform. |
| [Material](../../aspose.threed/node/material) { get; set; } | Gets or sets the first material associated with this node, if sets, will clear other materials |
| [Materials](../../aspose.threed/node/materials) { get; } | Gets the materials associated with this node. |
| [MetaDatas](../../aspose.threed/node/metadatas) { get; } | Gets the meta data defined in this node. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Gets or sets the name. |
| [ParentNode](../../aspose.threed/node/parentnode) { get; set; } | Gets or sets the parent node. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Gets the collection of all properties. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Gets the scene that this object belongs to |
| [Transform](../../aspose.threed/node/transform) { get; } | Gets the local transform. |
| [Visible](../../aspose.threed/node/visible) { get; set; } | Gets or sets to show the node |

## Methods

| Name | Description |
| --- | --- |
| [Accept](../../aspose.threed/node/accept)(NodeVisitor) | Walks through all descendant nodes(including the current node) and call the visitor with the node. Visitor can break the walk-through by returning false |
| [AddChildNode](../../aspose.threed/node/addchildnode)(Node) | Add a child node to this node |
| [AddEntity](../../aspose.threed/node/addentity)(Entity) | Add an entity to the node. |
| [CreateChildNode](../../aspose.threed/node/createchildnode)() | Creates a child node |
| [CreateChildNode](../../aspose.threed/node/createchildnode)(Entity) | Create a new child node with given entity attached |
| [CreateChildNode](../../aspose.threed/node/createchildnode)(string) | Create a new child node with given node name |
| [CreateChildNode](../../aspose.threed/node/createchildnode)(string, Entity) | Create a new child node with given node name |
| [CreateChildNode](../../aspose.threed/node/createchildnode)(string, Entity, Material) | Create a new child node with given node name, and attach specified entity and a material |
| virtual [Equals](equals)(object) |  |
| [EvaluateGlobalTransform](../../aspose.threed/node/evaluateglobaltransform)(bool) | Evaluate the global transform, include the geometric transform or not. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetBoundingBox](../../aspose.threed/node/getboundingbox)() | Calculate the bounding box of the node |
| [GetChild](../../aspose.threed/node/getchild)(int) | Gets the child node at specified index. |
| [GetChild](../../aspose.threed/node/getchild)(string) | Gets the child node with the specified name |
| [GetEntity&lt;T&gt;](../../aspose.threed/node/getentity)() |  |
| virtual [GetHashCode](gethashcode)() |  |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Get the value of specified property |
| [GetType](gettype)() |  |
| [Merge](../../aspose.threed/node/merge)(Node) | Detach everything under the node and attach them to current node. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Remove the specified property identified by name |
| [SelectObjects](../../aspose.threed/node/selectobjects)(string) | Select multiple objects under current node using XPath-like query syntax. |
| [SelectSingleObject](../../aspose.threed/node/selectsingleobject)(string) | Select single object under current node using XPath-like query syntax. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Sets the value of specified property |
| override [ToString](../../aspose.threed/node/tostring)() | Gets the string representation of this node. |

### See Also

* class [SceneObject](../sceneobject)
* namespace [Aspose.ThreeD](../../aspose.threed)
* assembly [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3d.dll -->
