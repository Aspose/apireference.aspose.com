---
title: Scene.RootNode
second_title: Aspose.3D for .NET API Reference
description: Scene property. Gets the root node of the scene
type: docs
weight: 90
url: /net/aspose.threed/scene/rootnode/
---
## Scene.RootNode property

Gets the root node of the scene.

```csharp
public Node RootNode { get; }
```

### Property Value

The root node.

### Examples

The following code shows how to create a node with Box entity attached to the root node.

```csharp
Scene scene = new Scene();
scene.RootNode.CreateChildNode(new Box());
scene.Save("box.stl");
```

### See Also

* class [Node](../../node/)
* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)


