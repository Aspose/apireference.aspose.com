---
title: IMorphTargetBuilder.SetVertexDelta
second_title: Aspose.CAD for .NET API Reference
description: IMorphTargetBuilder method. Sets a relative morph target
type: docs
weight: 50
url: /net/aspose.cad.fileformats.glb.geometry/imorphtargetbuilder/setvertexdelta/
---
## SetVertexDelta(IVertexGeometry, VertexGeometryDelta) {#setvertexdelta}

Sets a relative morph target

```csharp
public void SetVertexDelta(IVertexGeometry meshVertex, VertexGeometryDelta geometryDelta)
```

| Parameter | Type | Description |
| --- | --- | --- |
| meshVertex | IVertexGeometry | The base mesh vertex to morph. |
| geometryDelta | VertexGeometryDelta | The offset from *meshVertex* to morph. |

### See Also

* interface [IVertexGeometry](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/)
* struct [VertexGeometryDelta](../../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/)
* interface [IMorphTargetBuilder](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../imorphtargetbuilder/)
* assembly [Aspose.CAD](../../../)

---

## SetVertexDelta(IVertexGeometry, VertexGeometryDelta, VertexMaterialDelta) {#setvertexdelta_1}

Sets a relative morph target

```csharp
public void SetVertexDelta(IVertexGeometry meshVertex, VertexGeometryDelta geometryDelta, 
    VertexMaterialDelta materialDelta)
```

| Parameter | Type | Description |
| --- | --- | --- |
| meshVertex | IVertexGeometry | The base mesh vertex to morph. |
| geometryDelta | VertexGeometryDelta | The offset from *meshVertex* to morph. |
| materialDelta | VertexMaterialDelta | The offset from *meshVertex* material to morph. |

### See Also

* interface [IVertexGeometry](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/)
* struct [VertexGeometryDelta](../../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/)
* struct [VertexMaterialDelta](../../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/)
* interface [IMorphTargetBuilder](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../imorphtargetbuilder/)
* assembly [Aspose.CAD](../../../)

---

## SetVertexDelta(Vector3, VertexGeometryDelta) {#setvertexdelta_2}

Sets a relative morph target to all base mesh vertices matching *meshPosition*.

```csharp
public void SetVertexDelta(Vector3 meshPosition, VertexGeometryDelta geometryDelta)
```

| Parameter | Type | Description |
| --- | --- | --- |
| meshPosition | Vector3 | The base vertex position. |
| geometryDelta | VertexGeometryDelta | The offset to apply to each matching vertex found. |

### See Also

* struct [VertexGeometryDelta](../../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/)
* interface [IMorphTargetBuilder](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../imorphtargetbuilder/)
* assembly [Aspose.CAD](../../../)

---

## SetVertexDelta(Vector3, VertexGeometryDelta, VertexMaterialDelta) {#setvertexdelta_3}

Sets a relative morph target to all base mesh vertices matching *meshPosition*.

```csharp
public void SetVertexDelta(Vector3 meshPosition, VertexGeometryDelta geometryDelta, 
    VertexMaterialDelta materialDelta)
```

| Parameter | Type | Description |
| --- | --- | --- |
| meshPosition | Vector3 | The base vertex position. |
| geometryDelta | VertexGeometryDelta | The offset to apply to each matching vertex found. |
| materialDelta | VertexMaterialDelta | The offset to apply to each matching vertex material found. |

### See Also

* struct [VertexGeometryDelta](../../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/)
* struct [VertexMaterialDelta](../../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/)
* interface [IMorphTargetBuilder](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../imorphtargetbuilder/)
* assembly [Aspose.CAD](../../../)


