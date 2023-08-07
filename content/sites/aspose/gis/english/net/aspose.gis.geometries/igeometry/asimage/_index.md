---
title: IGeometry.AsImage
second_title: Aspose.GIS for .NET API Reference
description: IGeometry method. Export this geometry to an image representation
type: docs
weight: 110
url: /net/aspose.gis.geometries/igeometry/asimage/
---
## AsImage(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_1}

Export this geometry to an image representation.

```csharp
public void AsImage(AbstractPath outputPath, Measurement width, Measurement height, 
    Renderer renderer, VectorSymbolizer symbolizer = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| outputPath | AbstractPath | Path to the output image. |
| width | Measurement | Width of the map. |
| height | Measurement | Height of the map. |
| renderer | Renderer | Renderer to use. |
| symbolizer | VectorSymbolizer | A symbolizer to use for rendering. If `null`, default symbolizer is used. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Any argument `null`. |
| IOException | An I/O error occurred. |
| [GisException](../../../aspose.gis/gisexception/) | An error while processing or reading GIS data. |
| ArgumentException | Unit of width or height is !:SpatialReferencing.Unit.MapUnits. |
| ArgumentOutOfRangeException | Width or height is negative or zero. |

### See Also

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* interface [IGeometry](../)
* namespace [Aspose.Gis.Geometries](../../igeometry/)
* assembly [Aspose.GIS](../../../)

---

## AsImage(string, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_2}

Export this geometry to an image representation.

```csharp
public void AsImage(string outputPath, Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| outputPath | String | Path to the output image. |
| width | Measurement | Width of the map. |
| height | Measurement | Height of the map. |
| renderer | Renderer | Renderer to use. |
| symbolizer | VectorSymbolizer | A symbolizer to use for rendering. If `null`, default symbolizer is used. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Any argument `null`. |
| IOException | An I/O error occurred. |
| [GisException](../../../aspose.gis/gisexception/) | An error while processing or reading GIS data. |
| ArgumentException | Unit of width or height is !:SpatialReferencing.Unit.MapUnits. |
| ArgumentOutOfRangeException | Width or height is negative or zero. |

### See Also

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* interface [IGeometry](../)
* namespace [Aspose.Gis.Geometries](../../igeometry/)
* assembly [Aspose.GIS](../../../)

---

## AsImage(Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage}

Export this geometry to an image representation.

```csharp
public Stream AsImage(Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| width | Measurement | Width of the map. |
| height | Measurement | Height of the map. |
| renderer | Renderer | Renderer to use. |
| symbolizer | VectorSymbolizer | A symbolizer to use for rendering. If `null`, default symbolizer is used. |

### Return Value

The image as stream

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Any argument `null`. |
| IOException | An I/O error occurred. |
| [GisException](../../../aspose.gis/gisexception/) | An error while processing or reading GIS data. |
| ArgumentException | Unit of width or height is !:SpatialReferencing.Unit.MapUnits. |
| ArgumentOutOfRangeException | Width or height is negative or zero. |

### See Also

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* interface [IGeometry](../)
* namespace [Aspose.Gis.Geometries](../../igeometry/)
* assembly [Aspose.GIS](../../../)


