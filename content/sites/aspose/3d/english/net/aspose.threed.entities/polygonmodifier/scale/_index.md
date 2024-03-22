---
title: PolygonModifier.Scale
second_title: Aspose.3D for .NET API Reference
description: PolygonModifier method. Scale all geometriesScale the control points not the transformation matrix in this scene
type: docs
weight: 50
url: /net/aspose.threed.entities/polygonmodifier/scale/
---
## Scale(Scene, Vector3) {#scale}

Scale all geometries(Scale the control points not the transformation matrix) in this scene

```csharp
public static Scene Scale(Scene scene, Vector3 scale)
```

| Parameter | Type | Description |
| --- | --- | --- |
| scene | Scene | The scene to scale |
| scale | Vector3 | The scale factor |

### Examples

The following code shows how to scale all geometries in scene by 10 times.

```csharp
//Load a test file for scaling
var scene = Scene.FromFile("input.fbx");
//scale all geometries 10 times.
PolygonModifier.Scale(scene, new Vector3(10, 10, 10));
scene.Save("test.obj");
```

### See Also

* class [Scene](../../../aspose.threed/scene/)
* struct [Vector3](../../../aspose.threed.utilities/vector3/)
* class [PolygonModifier](../)
* namespace [Aspose.ThreeD.Entities](../../../aspose.threed.entities/)
* assembly [Aspose.3D](../../../)

---

## Scale(Node, Vector3) {#scale_1}

Scale all geometries(Scale the control points not the transformation matrix) in this node

```csharp
public static void Scale(Node node, Vector3 scale)
```

| Parameter | Type | Description |
| --- | --- | --- |
| node | Node | The node to scale |
| scale | Vector3 | The scale factor |

### Examples

The following code shows how to scale all geometries in scene by 10 times.

```csharp
//Load a test file for scaling
var scene = Scene.FromFile("input.fbx");
//scale all geometries 10 times.
PolygonModifier.Scale(scene.RootNode, new Vector3(10, 10, 10));
scene.Save("test.obj");
```

### See Also

* class [Node](../../../aspose.threed/node/)
* struct [Vector3](../../../aspose.threed.utilities/vector3/)
* class [PolygonModifier](../)
* namespace [Aspose.ThreeD.Entities](../../../aspose.threed.entities/)
* assembly [Aspose.3D](../../../)


