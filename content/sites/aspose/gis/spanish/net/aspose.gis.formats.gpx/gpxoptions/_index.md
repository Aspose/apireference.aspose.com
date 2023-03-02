---
title: Class GpxOptions
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.Formats.Gpx.GpxOptions clase. Opciones específicas del controlador para el formato GPX.
type: docs
weight: 370
url: /es/net/aspose.gis.formats.gpx/gpxoptions/
---
## GpxOptions class

Opciones específicas del controlador para el formato GPX.

```csharp
public class GpxOptions : DriverOptions
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [GpxOptions](gpxoptions/)() | Crear nueva instancia. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Determina si cerrar un no cerradoLinearRing en cada geometría. Predeterminado a`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Determina si se agrega un nuevo punto en el medio de cada segmento de geometría. Predeterminado a`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Determina si eliminar puntos cercanos en cada geometría. Predeterminado a`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Determina la distancia para[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Predeterminado a`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Una tolerancia que se utilizará para linealizar geometrías de curvas. |
| [MAttribute](../../aspose.gis.formats.gpx/gpxoptions/mattribute/) { get; set; } | Determina qué atributo GPX se exportará como coordenada 'M' de waypoints, puntos de ruta y puntos de seguimiento. El comportamiento es el mismo con[`ZAttribute`](./zattribute/) , por defecto es`null` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) que se aplicará a la coordenada M cuando se agreguen geometrías a la[`VectorLayer`](../../aspose.gis/vectorlayer/) o cuando se leen de la[`VectorLayer`](../../aspose.gis/vectorlayer/) . El valor predeterminado es[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedAttributeSeparator](../../aspose.gis.formats.gpx/gpxoptions/nestedattributeseparator/) { get; } | Una cadena para separar el nombre del atributo anidado y sus índices. El valor predeterminado es el guión bajo doble "__". |
| [ReadNestedAttributes](../../aspose.gis.formats.gpx/gpxoptions/readnestedattributes/) { get; set; } | Determina si los puntos GPX, como 'trkpt' y 'rtept', contienen atributos internos y si deben leerse. Predeterminado a`false` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Determina si se eliminan los puntos que se encuentran en el mismo segmento en cada geometría. Predeterminado a`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Determina la distancia para[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Predeterminado a`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Determina si las geometrías deben validarse cuando se agregan a la capa. Si se establece en`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) se llama para cada geometría cuando se agrega a la capa, y si falla la validación ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) es`false` ),[`GisException`](../../aspose.gis/gisexception/) es lanzado. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Determina si se permite la transformación de polígono o multipolígono a cadena lineal. Predeterminado a`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) que se aplicará a las coordenadas X e Y cuando se agreguen geometrías al[`VectorLayer`](../../aspose.gis/vectorlayer/) o cuando se leen de la[`VectorLayer`](../../aspose.gis/vectorlayer/) . El valor predeterminado es[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZAttribute](../../aspose.gis.formats.gpx/gpxoptions/zattribute/) { get; set; } | Determina qué atributo GPX se exportará como coordenada 'Z' de waypoints, puntos de ruta y puntos de track. Si`null` ningún atributo se exportará como coordenada 'Z'. El valor predeterminado es "ele". Los valores posibles son nombres de todos los atributos XML GPX que se pueden representar como dobles (por ejemplo, "velocidad", "magvar", "altura geoide", etc. ) |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) que se aplicará a la coordenada Z cuando se agreguen geometrías a la[`VectorLayer`](../../aspose.gis/vectorlayer/) o cuando se leen de la[`VectorLayer`](../../aspose.gis/vectorlayer/) . El valor predeterminado es[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Ver también

* class [DriverOptions](../../aspose.gis/driveroptions/)
* espacio de nombres [Aspose.Gis.Formats.Gpx](../../aspose.gis.formats.gpx/)
* asamblea [Aspose.GIS](../../)


