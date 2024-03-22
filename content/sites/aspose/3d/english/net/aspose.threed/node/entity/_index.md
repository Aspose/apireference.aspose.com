---
title: Node.Entity
second_title: Aspose.3D for .NET API Reference
description: Node property. Gets or sets the first entity attached to this node if sets will clear other entities
type: docs
weight: 50
url: /net/aspose.threed/node/entity/
---
## Node.Entity property

Gets or sets the first entity attached to this node, if sets, will clear other entities.

```csharp
public Entity Entity { get; set; }
```

### Property Value

The node entity.

### Examples

The following code shows how to create a new child node under root node

```csharp
Scene scene = new Scene();
Node node = scene.RootNode.CreateChildNode("new node");
node.Entity = new Box();
scene.Save("output.fbx");
```

### See Also

* class [Entity](../../entity/)
* class [Node](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)


