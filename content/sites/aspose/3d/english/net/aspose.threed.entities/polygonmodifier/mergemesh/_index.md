---
title: PolygonModifier.MergeMesh
second_title: Aspose.3D for .NET API Reference
description: PolygonModifier method. Convert a whole scene to a single transformed mesh Vertex elements like normal/texture coordinates are not supported yet
type: docs
weight: 40
url: /net/aspose.threed.entities/polygonmodifier/mergemesh/
---
## MergeMesh(Scene) {#mergemesh_1}

Convert a whole scene to a single transformed mesh Vertex elements like normal/texture coordinates are not supported yet

```csharp
public static Mesh MergeMesh(Scene scene)
```

| Parameter | Type | Description |
| --- | --- | --- |
| scene | Scene | The scene to merge |

### Return Value

The merged mesh

### Examples

The following code shows how to merge all objects from a scene into a single mesh.

```csharp
//Input file may contains multiple objects
var scene = Scene.FromFile("input.fbx");
//now merge them into a single mesh
Mesh merged = PolygonModifier.MergeMesh(scene);
//then we save it to a file with only one mesh
var newScene = new Scene(merged);
newScene.Save("test.obj");
```

### See Also

* class [Mesh](../../mesh/)
* class [Scene](../../../aspose.threed/scene/)
* class [PolygonModifier](../)
* namespace [Aspose.ThreeD.Entities](../../../aspose.threed.entities/)
* assembly [Aspose.3D](../../../)

---

## MergeMesh(IList&lt;Node&gt;) {#mergemesh_2}

```csharp
public static Mesh MergeMesh(IList<Node> nodes)
```

### See Also

* class [Mesh](../../mesh/)
* class [Node](../../../aspose.threed/node/)
* class [PolygonModifier](../)
* namespace [Aspose.ThreeD.Entities](../../../aspose.threed.entities/)
* assembly [Aspose.3D](../../../)

---

## MergeMesh(Node) {#mergemesh}

Convert a whole node to a single transformed mesh Vertex elements like normal/texture coordinates are not supported yet

```csharp
public static Mesh MergeMesh(Node node)
```

| Parameter | Type | Description |
| --- | --- | --- |
| node | Node | The node to merge |

### Return Value

Merged mesh

### Examples

The following code shows how to merge all objects from nodes into a single mesh.

```csharp
//Input file may contains multiple objects
var scene = Scene.FromFile("input.fbx");
//now merge them into a single mesh
Mesh merged = PolygonModifier.MergeMesh(scene.RootNode);
//then we save it to a file with only one mesh
var newScene = new Scene(merged);
newScene.Save("test.obj");
```

### See Also

* class [Mesh](../../mesh/)
* class [Node](../../../aspose.threed/node/)
* class [PolygonModifier](../)
* namespace [Aspose.ThreeD.Entities](../../../aspose.threed.entities/)
* assembly [Aspose.3D](../../../)


