---
title: Node.Material
second_title: Aspose.3D for .NET API Reference
description: Node property. Gets or sets the first material associated with this node if sets will clear other materials
type: docs
weight: 80
url: /net/aspose.threed/node/material/
---
## Node.Material property

Gets or sets the first material associated with this node, if sets, will clear other materials

```csharp
public Material Material { get; set; }
```

### Property Value

The material.

## Examples

```csharp
Scene scene = new Scene();
var node = scene.RootNode.CreateChildNode(new Box());
node.Material = new LambertMaterial();
```

### See Also

* class [Material](../../../aspose.threed.shading/material/)
* class [Node](../)
* namespace [Aspose.ThreeD](../../node/)
* assembly [Aspose.3D](../../../)


