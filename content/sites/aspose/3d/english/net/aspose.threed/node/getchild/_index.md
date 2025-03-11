---
title: Node.GetChild
second_title: Aspose.3D for .NET API Reference
description: Node method. Gets the child node at specified index
type: docs
weight: 200
url: /net/aspose.threed/node/getchild/
---
## GetChild(int) {#getchild}

Gets the child node at specified index.

```csharp
public Node GetChild(int index)
```

| Parameter | Type | Description |
| --- | --- | --- |
| index | Int32 | Index. |

### Return Value

The child.

## Examples

The following code shows how to get a child node at specified index.

```csharp
Scene scene = Scene.FromFile("input.fbx");
var node = scene.RootNode.GetChild(0);
Console.WriteLine($"The first node of the file is {node.Name}");
```

### See Also

* class [Node](../)
* namespace [Aspose.ThreeD](../../node/)
* assembly [Aspose.3D](../../../)

---

## GetChild(string) {#getchild_1}

Gets the child node with the specified name

```csharp
public Node GetChild(string nodeName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| nodeName | String | The child name to find. |

### Return Value

The child.

## Examples

The following code shows how to get a child node with specified name

```csharp
Scene scene = Scene.FromFile("input.fbx");
var node = scene.RootNode.GetChild("box");
Console.WriteLine($"The box node's translation is {node.Transform.Translation}");
```

### See Also

* class [Node](../)
* namespace [Aspose.ThreeD](../../node/)
* assembly [Aspose.3D](../../../)


