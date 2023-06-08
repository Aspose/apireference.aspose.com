---
title: Toolkit.EvaluateTriangles
second_title: Aspose.CAD for .NET API Reference
description: Toolkit method. Yields a collection of triangles representing the geometry in world space
type: docs
weight: 110
url: /net/aspose.cad.fileformats.glb.toolkit/toolkit/evaluatetriangles/
---
## EvaluateTriangles(this Scene, RuntimeOptions, Animation, float) {#evaluatetriangles_4}

Yields a collection of triangles representing the geometry in world space.

```csharp
public static IEnumerable<(IVertexBuilder A, IVertexBuilder B, IVertexBuilder C, Material Material)> 
    EvaluateTriangles(this Scene scene, RuntimeOptions options = null, Animation animation = null, 
    float time = 0)
```

| Parameter | Type | Description |
| --- | --- | --- |
| scene | Scene | A [`Scene`](../../../aspose.cad.fileformats.glb/scene/) instance. |
| options | RuntimeOptions | Evaluation options. |
| animation | Animation | An [`Animation`](../../../aspose.cad.fileformats.glb/animation/) instance, or null. |
| time | Single | The animation time. |

### Return Value

A collection of triangles in world space.

### See Also

* interface [IVertexBuilder](../../../aspose.cad.fileformats.glb.geometry/ivertexbuilder/)
* class [Material](../../../aspose.cad.fileformats.glb/material/)
* class [Scene](../../../aspose.cad.fileformats.glb/scene/)
* class [RuntimeOptions](../../../aspose.cad.fileformats.glb.runtime/runtimeoptions/)
* class [Animation](../../../aspose.cad.fileformats.glb/animation/)
* class [Toolkit](../)
* namespace [Aspose.CAD.FileFormats.GLB.ToolKit](../../toolkit/)
* assembly [Aspose.CAD](../../../)

---

## EvaluateTriangles&lt;TvG,TvM&gt;(this Scene, RuntimeOptions, Animation, float) {#evaluatetriangles}

Yields a collection of triangles representing the geometry in world space.

```csharp
public static IEnumerable<EvaluatedTriangle<TvG, TvM, VertexEmpty>> EvaluateTriangles<TvG, TvM>(
    this Scene scene, RuntimeOptions options = null, Animation animation = null, float time = 0)
    where TvG : struct, IVertexGeometry
    where TvM : struct, IVertexMaterial
```

| Parameter | Description |
| --- | --- |
| TvG | The vertex fragment type with Position, Normal and Tangent. |
| TvM | The vertex fragment type with Colors and Texture Coordinates. |
| scene | A [`Scene`](../../../aspose.cad.fileformats.glb/scene/) instance. |
| options | Evaluation options. |
| animation | An [`Animation`](../../../aspose.cad.fileformats.glb/animation/) instance, or null. |
| time | The animation time. |

### Return Value

A collection of triangles in world space.

### See Also

* struct [EvaluatedTriangle&lt;TvG,TvM,TvS&gt;](../../evaluatedtriangle-3/)
* struct [VertexEmpty](../../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexempty/)
* class [Scene](../../../aspose.cad.fileformats.glb/scene/)
* class [RuntimeOptions](../../../aspose.cad.fileformats.glb.runtime/runtimeoptions/)
* class [Animation](../../../aspose.cad.fileformats.glb/animation/)
* interface [IVertexGeometry](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/)
* interface [IVertexMaterial](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/)
* class [Toolkit](../)
* namespace [Aspose.CAD.FileFormats.GLB.ToolKit](../../toolkit/)
* assembly [Aspose.CAD](../../../)

---

## EvaluateTriangles(this Mesh, IGeometryTransform) {#evaluatetriangles_2}

```csharp
public static IEnumerable<(IVertexBuilder A, IVertexBuilder B, IVertexBuilder C, Material Material)> 
    EvaluateTriangles(this Mesh mesh, IGeometryTransform xform = null)
```

### See Also

* interface [IVertexBuilder](../../../aspose.cad.fileformats.glb.geometry/ivertexbuilder/)
* class [Material](../../../aspose.cad.fileformats.glb/material/)
* class [Mesh](../../../aspose.cad.fileformats.glb/mesh/)
* interface [IGeometryTransform](../../../aspose.cad.fileformats.glb.transforms/igeometrytransform/)
* class [Toolkit](../)
* namespace [Aspose.CAD.FileFormats.GLB.ToolKit](../../toolkit/)
* assembly [Aspose.CAD](../../../)

---

## EvaluateTriangles(this MeshPrimitive, IGeometryTransform) {#evaluatetriangles_3}

```csharp
public static IEnumerable<(IVertexBuilder A, IVertexBuilder B, IVertexBuilder C, Material Material)> 
    EvaluateTriangles(this MeshPrimitive prim, IGeometryTransform xform = null)
```

### See Also

* interface [IVertexBuilder](../../../aspose.cad.fileformats.glb.geometry/ivertexbuilder/)
* class [Material](../../../aspose.cad.fileformats.glb/material/)
* class [MeshPrimitive](../../../aspose.cad.fileformats.glb/meshprimitive/)
* interface [IGeometryTransform](../../../aspose.cad.fileformats.glb.transforms/igeometrytransform/)
* class [Toolkit](../)
* namespace [Aspose.CAD.FileFormats.GLB.ToolKit](../../toolkit/)
* assembly [Aspose.CAD](../../../)

---

## EvaluateTriangles&lt;TvG,TvM,TvS&gt;(this Mesh, IGeometryTransform) {#evaluatetriangles_1}

```csharp
public static IEnumerable<EvaluatedTriangle<TvG, TvM, TvS>> EvaluateTriangles<TvG, TvM, TvS>(
    this Mesh mesh, IGeometryTransform xform = null)
    where TvG : struct, IVertexGeometry
    where TvM : struct, IVertexMaterial
    where TvS : struct, IVertexSkinning
```

### See Also

* struct [EvaluatedTriangle&lt;TvG,TvM,TvS&gt;](../../evaluatedtriangle-3/)
* class [Mesh](../../../aspose.cad.fileformats.glb/mesh/)
* interface [IGeometryTransform](../../../aspose.cad.fileformats.glb.transforms/igeometrytransform/)
* interface [IVertexGeometry](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/)
* interface [IVertexMaterial](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/)
* interface [IVertexSkinning](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexskinning/)
* class [Toolkit](../)
* namespace [Aspose.CAD.FileFormats.GLB.ToolKit](../../toolkit/)
* assembly [Aspose.CAD](../../../)


