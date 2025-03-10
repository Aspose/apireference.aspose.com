---
title: PolygonModifier.Triangulate
second_title: Aspose.3D for .NET API Reference
description: PolygonModifier method. Convert all polygonbased meshes into full triangle mesh
type: docs
weight: 80
url: /net/aspose.threed.entities/polygonmodifier/triangulate/
---
## Triangulate(Scene) {#triangulate_5}

Convert all polygon-based meshes into full triangle mesh

```csharp
public static void Triangulate(Scene scene)
```

| Parameter | Type | Description |
| --- | --- | --- |
| scene | Scene | The scene to process |

## Examples

The following code shows how to merge all objects from a scene into a single mesh.

```csharp
var mesh = new Cylinder().ToMesh();

//Triangulate this quadrangle-based mesh to triangle-based 
mesh = PolygonModifier.Triangulate(mesh);

var scene = new Scene(mesh);

      scene.Save("test.obj");
```

### See Also

* class [Scene](../../../aspose.threed/scene/)
* class [PolygonModifier](../)
* namespace [Aspose.ThreeD.Entities](../../polygonmodifier/)
* assembly [Aspose.3D](../../../)

---

## Triangulate(Mesh) {#triangulate}

Convert a polygon-based mesh into full triangle mesh

```csharp
public static Mesh Triangulate(Mesh mesh)
```

| Parameter | Type | Description |
| --- | --- | --- |
| mesh | Mesh | The original non-triangle mesh |

### Return Value

The generated new triangle mesh

## Examples

The following code shows how to merge all objects from a scene into a single mesh.

```csharp
var mesh = new Cylinder().ToMesh();

//Triangulate this quadrangle-based mesh to triangle-based 
mesh = PolygonModifier.Triangulate(mesh);

var scene = new Scene(mesh);

      scene.Save("test.obj");
```

### See Also

* class [Mesh](../../mesh/)
* class [PolygonModifier](../)
* namespace [Aspose.ThreeD.Entities](../../polygonmodifier/)
* assembly [Aspose.3D](../../../)

---

## Triangulate(IList&lt;Vector4&gt;, IList&lt;int[]&gt;, bool, out Vector3[]) {#triangulate_4}

```csharp
public static int[][] Triangulate(IList<Vector4> controlPoints, IList<int[]> polygons, 
    bool generateNormals, out Vector3[] nor_out)
```

### See Also

* struct [Vector4](../../../aspose.threed.utilities/vector4/)
* struct [Vector3](../../../aspose.threed.utilities/vector3/)
* class [PolygonModifier](../)
* namespace [Aspose.ThreeD.Entities](../../polygonmodifier/)
* assembly [Aspose.3D](../../../)

---

## Triangulate(IList&lt;Vector4&gt;, IList&lt;int[]&gt;) {#triangulate_3}

```csharp
public static int[][] Triangulate(IList<Vector4> controlPoints, IList<int[]> polygons)
```

### See Also

* struct [Vector4](../../../aspose.threed.utilities/vector4/)
* class [PolygonModifier](../)
* namespace [Aspose.ThreeD.Entities](../../polygonmodifier/)
* assembly [Aspose.3D](../../../)

---

## Triangulate(IList&lt;Vector4&gt;, int[]) {#triangulate_2}

```csharp
public static int[][] Triangulate(IList<Vector4> controlPoints, int[] polygon)
```

### See Also

* struct [Vector4](../../../aspose.threed.utilities/vector4/)
* class [PolygonModifier](../)
* namespace [Aspose.ThreeD.Entities](../../polygonmodifier/)
* assembly [Aspose.3D](../../../)

---

## Triangulate(IList&lt;Vector4&gt;) {#triangulate_1}

```csharp
public static int[][] Triangulate(IList<Vector4> controlPoints)
```

### See Also

* struct [Vector4](../../../aspose.threed.utilities/vector4/)
* class [PolygonModifier](../)
* namespace [Aspose.ThreeD.Entities](../../polygonmodifier/)
* assembly [Aspose.3D](../../../)


