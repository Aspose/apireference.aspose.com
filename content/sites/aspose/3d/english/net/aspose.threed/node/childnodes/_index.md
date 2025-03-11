---
title: Node.ChildNodes
second_title: Aspose.3D for .NET API Reference
description: Node property. Gets the children nodes
type: docs
weight: 30
url: /net/aspose.threed/node/childnodes/
---
## Node.ChildNodes property

Gets the children nodes.

```csharp
public IList<Node> ChildNodes { get; }
```

### Property Value

The nodes.

## Examples

The following code shows how to enumerate child node of root node

```csharp
Scene scene = Scene.FromFile("test.fbx");
foreach(var child in scene.RootNode.ChildNodes)
{
    //do your business
}
```

### See Also

* class [Node](../)
* namespace [Aspose.ThreeD](../../node/)
* assembly [Aspose.3D](../../../)


