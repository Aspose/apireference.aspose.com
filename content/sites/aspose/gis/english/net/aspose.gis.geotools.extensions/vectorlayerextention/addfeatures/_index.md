---
title: VectorLayerExtention.AddFeatures
second_title: Aspose.GIS for .NET API Reference
description: VectorLayerExtention method. Add Features using generic list
type: docs
weight: 10
url: /net/aspose.gis.geotools.extensions/vectorlayerextention/addfeatures/
---
## AddFeatures&lt;T&gt;(this VectorLayer, List&lt;T&gt;) {#addfeatures_1}

Add Features using generic list.

```csharp
public static void AddFeatures<T>(this VectorLayer layer, List<T> featuresData)
    where T : new()
```

| Parameter | Description |
| --- | --- |
| T | The Generic Type. |
| layer | The Layer to add. |
| featuresData | Input data. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorLayerExtention](../)
* namespace [Aspose.Gis.GeoTools.Extensions](../../vectorlayerextention/)
* assembly [Aspose.GIS](../../../)

---

## AddFeatures(this VectorLayer, IEnumerable&lt;IGeometry&gt;) {#addfeatures}

Add Features using generic list.

```csharp
public static void AddFeatures(this VectorLayer layer, IEnumerable<IGeometry> geometries)
```

| Parameter | Type | Description |
| --- | --- | --- |
| layer | VectorLayer | The Layer to add. |
| geometries | IEnumerable`1 | Input geometries. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [VectorLayerExtention](../)
* namespace [Aspose.Gis.GeoTools.Extensions](../../vectorlayerextention/)
* assembly [Aspose.GIS](../../../)


