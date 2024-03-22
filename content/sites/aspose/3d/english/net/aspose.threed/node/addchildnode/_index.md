---
title: Node.AddChildNode
second_title: Aspose.3D for .NET API Reference
description: Node method. Add a child node to this node
type: docs
weight: 150
url: /net/aspose.threed/node/addchildnode/
---
## Node.AddChildNode method

Add a child node to this node

```csharp
public void AddChildNode(Node node)
```

| Parameter | Type | Description |
| --- | --- | --- |
| node | Node | The child node to be attached |

### Examples

The following code shows how to get all meshes from a scene

```csharp
Scene scene = Scene.FromFile("input.fbx");
var newNode = new Node();
//add a new node manually
scene.RootNode.AddChildNode(newNode);
```

### See Also

* class [Node](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)


