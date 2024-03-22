---
title: Node.Transform
second_title: Aspose.3D for .NET API Reference
description: Node property. Gets the local transform
type: docs
weight: 120
url: /net/aspose.threed/node/transform/
---
## Node.Transform property

Gets the local transform.

```csharp
public Transform Transform { get; }
```

### Property Value

The transform.

### Examples

The following code shows how to change the transform of the node:

```csharp
Scene scene = new Scene();
var boxNode = scene.RootNode.CreateChildNode(new Box());
//place the box at (10, 0, 0)
boxNode.Transform.Translation = new Vector3(10, 0, 0);
```

### See Also

* class [Transform](../../transform/)
* class [Node](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)


