---
title: Node.GlobalTransform
second_title: Aspose.3D for .NET API Reference
description: Node property. Gets the global transform
type: docs
weight: 70
url: /net/aspose.threed/node/globaltransform/
---
## Node.GlobalTransform property

Gets the global transform.

```csharp
public GlobalTransform GlobalTransform { get; }
```

### Property Value

The global transform.

### Examples

The following code shows how to read node's global transform

```csharp
Scene scene = new Scene();
var boxNode = scene.RootNode.CreateChildNode(new Box());
//place the box at (10, 0, 0)
boxNode.Transform.Translation = new Vector3(10, 0, 0);
var global = boxNode.GlobalTransform;
Console.WriteLine($"The box's position in world coordinate is {global.Translation}");
```

### See Also

* class [GlobalTransform](../../globaltransform/)
* class [Node](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)


