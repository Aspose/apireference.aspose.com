---
title: Class TopoJsonOptions
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.Formats.TopoJson.TopoJsonOptions clase. Opciones específicas del controlador para el formato TopoJSON.
type: docs
weight: 710
url: /es/net/aspose.gis.formats.topojson/topojsonoptions/
---
## TopoJsonOptions class

Opciones específicas del controlador para el formato TopoJSON.

```csharp
public class TopoJsonOptions : DriverOptions
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [TopoJsonOptions](topojsonoptions/)() | Crear nueva instancia. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Determina si cerrar un no cerradoLinearRing en cada geometría. Predeterminado a`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Determina si se agrega un nuevo punto en el medio de cada segmento de geometría. Predeterminado a`false` . |
| [DefaultObjectName](../../aspose.gis.formats.topojson/topojsonoptions/defaultobjectname/) { get; set; } | Nombre del objeto donde se ponen las características por defecto. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Determina si eliminar puntos cercanos en cada geometría. Predeterminado a`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Determina la distancia para[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Predeterminado a`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Una tolerancia que se utilizará para linealizar geometrías de curvas. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) que se aplicará a la coordenada M cuando se agreguen geometrías a la[`VectorLayer`](../../aspose.gis/vectorlayer/) o cuando se leen de la[`VectorLayer`](../../aspose.gis/vectorlayer/) . El valor predeterminado es[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.topojson/topojsonoptions/nestedpropertiesseparator/) { get; set; } | Obtiene o establece una cadena que se utiliza para separar componentes de atributos anidados. El valor predeterminado es "_". |
| [ObjectNameAttribute](../../aspose.gis.formats.topojson/topojsonoptions/objectnameattribute/) { get; set; } | Nombre del atributo, que refleja el nombre del objeto que contiene una característica. |
| [QuantizationNumber](../../aspose.gis.formats.topojson/topojsonoptions/quantizationnumber/) { get; set; } | Especifica el número de cuantificación que se usará para cuantificar las coordenadas y los arcos de codificación delta en la salida TopoJSON. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Determina si se eliminan los puntos que se encuentran en el mismo segmento en cada geometría. Predeterminado a`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Determina la distancia para[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Predeterminado a`0` . |
| [Transform](../../aspose.gis.formats.topojson/topojsonoptions/transform/) { get; set; } | Especifica el objeto de transformación que se usará para cuantificar las coordenadas y los arcos de codificación delta en la salida TopoJSON. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Determina si las geometrías deben validarse cuando se agregan a la capa. Si se establece en`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) se llama para cada geometría cuando se agrega a la capa, y si falla la validación ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) es`false` ),[`GisException`](../../aspose.gis/gisexception/) es lanzado. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Determina si se permite la transformación de polígono o multipolígono a cadena lineal. Predeterminado a`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) que se aplicará a las coordenadas X e Y cuando se agreguen geometrías al[`VectorLayer`](../../aspose.gis/vectorlayer/) o cuando se leen de la[`VectorLayer`](../../aspose.gis/vectorlayer/) . El valor predeterminado es[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) que se aplicará a la coordenada Z cuando se agreguen geometrías a la[`VectorLayer`](../../aspose.gis/vectorlayer/) o cuando se leen de la[`VectorLayer`](../../aspose.gis/vectorlayer/) . El valor predeterminado es[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Ver también

* class [DriverOptions](../../aspose.gis/driveroptions/)
* espacio de nombres [Aspose.Gis.Formats.TopoJson](../../aspose.gis.formats.topojson/)
* asamblea [Aspose.GIS](../../)


