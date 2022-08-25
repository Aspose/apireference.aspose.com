---
title: FileGdbOptions
second_title: Referencia de API de Aspose.GIS para .NET
description: Opciones específicas del controlador para formato FileGDB.
type: docs
weight: 240
url: /es/net/aspose.gis.formats.filegdb/filegdboptions/
---
## FileGdbOptions class

Opciones específicas del controlador para formato FileGDB.

```csharp
public sealed class FileGdbOptions : DriverOptions
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [FileGdbOptions](filegdboptions)() | Crear nueva instancia. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring) { get; set; } | Determina si cerrar un no cerradoLinearRing en cada geometría. Predeterminado a`false` . |
| [CoordinatePrecisionGrid](../../aspose.gis.formats.filegdb/filegdboptions/coordinateprecisiongrid) { get; set; } | Una cuadrícula de precisión de coordenadas para usar en una nueva capa. |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints) { get; set; } | Determina si se agrega un nuevo punto en el medio de cada segmento de geometría. Predeterminado a`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints) { get; set; } | Determina si eliminar puntos cercanos en cada geometría. Predeterminado a`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance) { get; set; } | Determina la distancia para[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints) . Predeterminado a`0` . |
| [EnsureValidCoordinatesRange](../../aspose.gis.formats.filegdb/filegdboptions/ensurevalidcoordinatesrange) { get; set; } | Si las coordenadas deben estar en un rango válido. |
| [GeometryFieldName](../../aspose.gis.formats.filegdb/filegdboptions/geometryfieldname) { get; set; } | Nombre del campo de geometría. |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance) { get; set; } | Una tolerancia que se utilizará para linealizar geometrías de curvas. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) que se aplicará a la coordenada M cuando se agreguen geometrías a la[`VectorLayer`](../../aspose.gis/vectorlayer) o cuando se leen de la[`VectorLayer`](../../aspose.gis/vectorlayer) . El valor predeterminado es[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [MTolerance](../../aspose.gis.formats.filegdb/filegdboptions/mtolerance) { get; set; } | Tolerancia de ajuste M. |
| [ObjectIdFieldName](../../aspose.gis.formats.filegdb/filegdboptions/objectidfieldname) { get; set; } | Nombre del campo ID de objeto. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments) { get; set; } | Determina si se eliminan los puntos que se encuentran en el mismo segmento en cada geometría. Predeterminado a`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance) { get; set; } | Determina la distancia para[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments) . Predeterminado a`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite) { get; set; } | Determina si las geometrías deben validarse cuando se agregan a la capa. Si se establece en`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid)se llama para cada geometría cuando se agrega a la capa, y si falla la validación ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid) es`false` ),[`GisException`](../../aspose.gis/gisexception) es lanzado. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines) { get; set; } | Determina si se permite la transformación de polígono o multipolígono a cadena lineal. Predeterminado a`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel)que se aplicará a las coordenadas X e Y cuando se agreguen geometrías al[`VectorLayer`](../../aspose.gis/vectorlayer) o cuando se leen de la[`VectorLayer`](../../aspose.gis/vectorlayer) . El valor predeterminado es[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [XYTolerance](../../aspose.gis.formats.filegdb/filegdboptions/xytolerance) { get; set; } | Tolerancia de ajuste X e Y. |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) que se aplicará a la coordenada Z cuando se agreguen geometrías a la[`VectorLayer`](../../aspose.gis/vectorlayer) o cuando se leen de la[`VectorLayer`](../../aspose.gis/vectorlayer) . El valor predeterminado es[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [ZTolerance](../../aspose.gis.formats.filegdb/filegdboptions/ztolerance) { get; set; } | Tolerancia de ajuste Z. |

### Ver también

* class [DriverOptions](../../aspose.gis/driveroptions)
* espacio de nombres [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb)
* asamblea [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
