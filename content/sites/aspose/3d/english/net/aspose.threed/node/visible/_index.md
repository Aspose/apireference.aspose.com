---
title: Node.Visible
second_title: Aspose.3D for .NET API Reference
description: Node property. Gets or sets to show the node
type: docs
weight: 130
url: /net/aspose.threed/node/visible/
---
## Node.Visible property

Gets or sets to show the node

```csharp
public bool Visible { get; set; }
```

### Examples

The following code shows how to create a invisible node

```csharp
Scene scene = new Scene();
Node node = scene.RootNode.CreateChildNode("test-node", new Box());
node.Visible = false;
scene.Save("output.fbx");
```

### See Also

* class [Node](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)


