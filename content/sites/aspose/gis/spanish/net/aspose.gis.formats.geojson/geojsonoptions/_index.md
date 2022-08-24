---
title: GeoJsonOptions
second_title: Referencia de API de Aspose.GIS para .NET
description: Opciones específicas del controlador para el formato GeoJSON.
type: docs
weight: 260
url: /es/net/aspose.gis.formats.geojson/geojsonoptions/
---
## GeoJsonOptions class

Opciones específicas del controlador para el formato GeoJSON.

```csharp
public class GeoJsonOptions : DriverOptions
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [GeoJsonOptions](geojsonoptions)() | Crear nueva instancia. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring) { get; set; } | Determina si cerrar un no cerradoLinearRing en cada geometría. Predeterminado a`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints) { get; set; } | Determina si se agrega un nuevo punto en el medio de cada segmento de geometría. Predeterminado a`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints) { get; set; } | Determina si eliminar puntos cercanos en cada geometría. Predeterminado a`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance) { get; set; } | Determina la distancia para[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints) . Predeterminado a`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance) { get; set; } | Una tolerancia que se utilizará para linealizar geometrías de curvas. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) que se aplicará a la coordenada M cuando se agreguen geometrías a la[`VectorLayer`](../../aspose.gis/vectorlayer) o cuando se leen de la[`VectorLayer`](../../aspose.gis/vectorlayer) . El valor predeterminado es[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.geojson/geojsonoptions/nestedpropertiesseparator) { get; set; } | Obtiene o establece una cadena que se utiliza para separar componentes de atributos anidados. El valor predeterminado es "_". |
| [ReadBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/readboundingboxes) { get; set; } | Determina si los cuadros delimitadores ('bbox') deben leerse como atributos con un nombre 'bbox_0', 'bbox_1', etc. El valor predeterminado es`false` . El[`NestedPropertiesSeparator`](./nestedpropertiesseparator) la cadena se usa en bbox_0, bbox_1,... nombres. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments) { get; set; } | Determina si se eliminan los puntos que se encuentran en el mismo segmento en cada geometría. Predeterminado a`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance) { get; set; } | Determina la distancia para[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments) . Predeterminado a`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite) { get; set; } | Determina si las geometrías deben validarse cuando se agregan a la capa. Si se establece en`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid)se llama para cada geometría cuando se agrega a la capa, y si falla la validación ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid) es`false` ),[`GisException`](../../aspose.gis/gisexception) es lanzado. |
| [WriteBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/writeboundingboxes) { get; set; } | Determina si los objetos GeoJSON deben incluir información sobre el rango de coordenadas para sus geometrías. Si se establece en`true` , se genera un miembro "bbox" para cada geometría (no nula) cuando se agrega a la capa. El valor predeterminado es`false` . |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines) { get; set; } | Determina si se permite la transformación de polígono o multipolígono a cadena lineal. Predeterminado a`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel)que se aplicará a las coordenadas X e Y cuando se agreguen geometrías al[`VectorLayer`](../../aspose.gis/vectorlayer) o cuando se leen de la[`VectorLayer`](../../aspose.gis/vectorlayer) . El valor predeterminado es[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) que se aplicará a la coordenada Z cuando se agreguen geometrías a la[`VectorLayer`](../../aspose.gis/vectorlayer) o cuando se leen de la[`VectorLayer`](../../aspose.gis/vectorlayer) . El valor predeterminado es[`Exact`](../../aspose.gis/precisionmodel/exact) . |

### Ver también

* class [DriverOptions](../../aspose.gis/driveroptions)
* espacio de nombres [Aspose.Gis.Formats.GeoJson](../../aspose.gis.formats.geojson)
* asamblea [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
