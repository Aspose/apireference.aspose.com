---
title: Node.Accept
second_title: Aspose.3D for .NET API Reference
description: Node method. Walks through all descendant nodesincluding the current node and call the visitor with the node. Visitor can break the walkthrough by returning false
type: docs
weight: 140
url: /net/aspose.threed/node/accept/
---
## Node.Accept method

Walks through all descendant nodes(including the current node) and call the visitor with the node. Visitor can break the walk-through by returning false

```csharp
public bool Accept(NodeVisitor visitor)
```

| Parameter | Type | Description |
| --- | --- | --- |
| visitor | NodeVisitor | Visitor callback to visit the node |

### Return Value

true means visitor has broke the walk through.

### Examples

The following code shows how to get all meshes from a scene

```csharp
Scene scene = Scene.FromFile("input.fbx");
List<Mesh> meshes = new List<Mesh>();
scene.RootNode.Accept((node) =>
{
    if(node.Entity is Mesh)
        meshes.Add((Mesh)node.Entity);
    //continue searching
    return true;
});
```

### See Also

* delegate [NodeVisitor](../../nodevisitor/)
* class [Node](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)


