---
title: Class DriverOptions
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.DriverOptions clase. Opciones para unDriver .
type: docs
weight: 100
url: /es/net/aspose.gis/driveroptions/
---
## DriverOptions class

Opciones para un[`Driver`](../driver/) .

```csharp
public abstract class DriverOptions
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Determina si cerrar un no cerradoLinearRing en cada geometría. Predeterminado a`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Determina si se agrega un nuevo punto en el medio de cada segmento de geometría. Predeterminado a`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Determina si eliminar puntos cercanos en cada geometría. Predeterminado a`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Determina la distancia para[`DeleteNearPoints`](./deletenearpoints/) . Predeterminado a`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Una tolerancia que se utilizará para linealizar geometrías de curvas. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../precisionmodel/) que se aplicará a la coordenada M cuando se agreguen geometrías a la[`VectorLayer`](../vectorlayer/) o cuando se leen de la[`VectorLayer`](../vectorlayer/) . El valor predeterminado es[`Exact`](../precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Determina si se eliminan los puntos que se encuentran en el mismo segmento en cada geometría. Predeterminado a`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Determina la distancia para[`SimplifySegments`](./simplifysegments/) . Predeterminado a`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Determina si las geometrías deben validarse cuando se agregan a la capa. Si se establece en`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) se llama para cada geometría cuando se agrega a la capa, y si falla la validación ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) es`false` ),[`GisException`](../gisexception/) es lanzado. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Determina si se permite la transformación de polígono o multipolígono a cadena lineal. Predeterminado a`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../precisionmodel/) que se aplicará a las coordenadas X e Y cuando se agreguen geometrías al[`VectorLayer`](../vectorlayer/) o cuando se leen de la[`VectorLayer`](../vectorlayer/) . El valor predeterminado es[`Exact`](../precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../precisionmodel/) que se aplicará a la coordenada Z cuando se agreguen geometrías a la[`VectorLayer`](../vectorlayer/) o cuando se leen de la[`VectorLayer`](../vectorlayer/) . El valor predeterminado es[`Exact`](../precisionmodel/exact/) . |

### Ver también

* espacio de nombres [Aspose.Gis](../../aspose.gis/)
* asamblea [Aspose.GIS](../../)


