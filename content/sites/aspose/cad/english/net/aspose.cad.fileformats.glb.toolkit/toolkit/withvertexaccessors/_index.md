---
title: Toolkit.WithVertexAccessors
second_title: Aspose.CAD for .NET API Reference
description: Toolkit method. 
type: docs
weight: 610
url: /net/aspose.cad.fileformats.glb.toolkit/toolkit/withvertexaccessors/
---
## WithVertexAccessors(this MeshPrimitive, IReadOnlyList&lt;VertexPosition&gt;) {#withvertexaccessors_2}

```csharp
public static MeshPrimitive WithVertexAccessors(this MeshPrimitive primitive, 
    IReadOnlyList<VertexPosition> vertices)
```

### See Also

* class [MeshPrimitive](../../../aspose.cad.fileformats.glb/meshprimitive/)
* struct [VertexPosition](../../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexposition/)
* class [Toolkit](../)
* namespace [Aspose.CAD.FileFormats.GLB.ToolKit](../../toolkit/)
* assembly [Aspose.CAD](../../../)

---

## WithVertexAccessors(this MeshPrimitive, IReadOnlyList&lt;VertexPositionNormal&gt;) {#withvertexaccessors_1}

```csharp
public static MeshPrimitive WithVertexAccessors(this MeshPrimitive primitive, 
    IReadOnlyList<VertexPositionNormal> vertices)
```

### See Also

* class [MeshPrimitive](../../../aspose.cad.fileformats.glb/meshprimitive/)
* struct [VertexPositionNormal](../../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexpositionnormal/)
* class [Toolkit](../)
* namespace [Aspose.CAD.FileFormats.GLB.ToolKit](../../toolkit/)
* assembly [Aspose.CAD](../../../)

---

## WithVertexAccessors&lt;TvP,TvM&gt;(this MeshPrimitive, IReadOnlyList&lt;(TvP Geo, TvM Mat)&gt;) {#withvertexaccessors_5}

```csharp
public static MeshPrimitive WithVertexAccessors<TvP, TvM>(this MeshPrimitive primitive, 
    IReadOnlyList<(TvP Geo, TvM Mat)> vertices)
    where TvP : struct, IVertexGeometry
    where TvM : struct, IVertexMaterial
```

### See Also

* class [MeshPrimitive](../../../aspose.cad.fileformats.glb/meshprimitive/)
* interface [IVertexGeometry](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/)
* interface [IVertexMaterial](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/)
* class [Toolkit](../)
* namespace [Aspose.CAD.FileFormats.GLB.ToolKit](../../toolkit/)
* assembly [Aspose.CAD](../../../)

---

## WithVertexAccessors&lt;TvP,TvM,TvS&gt;(this MeshPrimitive, IReadOnlyList&lt;(TvP Geo, TvM Mat, TvS Skin)&gt;) {#withvertexaccessors_4}

```csharp
public static MeshPrimitive WithVertexAccessors<TvP, TvM, TvS>(this MeshPrimitive primitive, 
    IReadOnlyList<(TvP Geo, TvM Mat, TvS Skin)> vertices)
    where TvP : struct, IVertexGeometry
    where TvM : struct, IVertexMaterial
    where TvS : struct, IVertexSkinning
```

### See Also

* class [MeshPrimitive](../../../aspose.cad.fileformats.glb/meshprimitive/)
* interface [IVertexGeometry](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/)
* interface [IVertexMaterial](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/)
* interface [IVertexSkinning](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexskinning/)
* class [Toolkit](../)
* namespace [Aspose.CAD.FileFormats.GLB.ToolKit](../../toolkit/)
* assembly [Aspose.CAD](../../../)

---

## WithVertexAccessors&lt;TVertex&gt;(this MeshPrimitive, IReadOnlyList&lt;TVertex&gt;) {#withvertexaccessors_3}

```csharp
public static MeshPrimitive WithVertexAccessors<TVertex>(this MeshPrimitive primitive, 
    IReadOnlyList<TVertex> vertices)
    where TVertex : IVertexBuilder
```

### See Also

* class [MeshPrimitive](../../../aspose.cad.fileformats.glb/meshprimitive/)
* interface [IVertexBuilder](../../../aspose.cad.fileformats.glb.geometry/ivertexbuilder/)
* class [Toolkit](../)
* namespace [Aspose.CAD.FileFormats.GLB.ToolKit](../../toolkit/)
* assembly [Aspose.CAD](../../../)

---

## WithVertexAccessors(this MeshPrimitive, IEnumerable&lt;MemoryAccessor&gt;) {#withvertexaccessors}

```csharp
public static MeshPrimitive WithVertexAccessors(this MeshPrimitive primitive, 
    IEnumerable<MemoryAccessor> memAccessors)
```

### See Also

* class [MeshPrimitive](../../../aspose.cad.fileformats.glb/meshprimitive/)
* class [MemoryAccessor](../../../aspose.cad.fileformats.glb.memory/memoryaccessor/)
* class [Toolkit](../)
* namespace [Aspose.CAD.FileFormats.GLB.ToolKit](../../toolkit/)
* assembly [Aspose.CAD](../../../)


