---
title: Class GeoJsonOptions
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.Formats.GeoJson.GeoJsonOptions clase. Opciones específicas del controlador para el formato GeoJSON.
type: docs
weight: 310
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
| [GeoJsonOptions](geojsonoptions/)() | Crear nueva instancia. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [ArrayAsString](../../aspose.gis.formats.geojson/geojsonoptions/arrayasstring/) { get; set; } | Si exponer matrices JSon de cadenas, enteros o reales como cadena. |
| [AttributesSkip](../../aspose.gis.formats.geojson/geojsonoptions/attributesskip/) { get; set; } | controla la traducción de atributos: sí - omitir todos los atributos |
| [AutoId](../../aspose.gis.formats.geojson/geojsonoptions/autoid/) { get; set; } | Generar automáticamente ids |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Determina si cerrar un no cerradoLinearRing en cada geometría. Predeterminado a`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Determina si se agrega un nuevo punto en el medio de cada segmento de geometría. Predeterminado a`false` . |
| [DateAsString](../../aspose.gis.formats.geojson/geojsonoptions/dateasstring/) { get; set; } | Si exponer JSon fecha/hora/fecha-hora como cadena. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Determina si eliminar puntos cercanos en cada geometría. Predeterminado a`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Determina la distancia para[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Predeterminado a`0` . |
| [Description](../../aspose.gis.formats.geojson/geojsonoptions/description/) { get; set; } | Descripción a nivel de colección de entidades (para la creación de capas) |
| [GeometryAsCollection](../../aspose.gis.formats.geojson/geojsonoptions/geometryascollection/) { get; set; } | controlar la traslación de geometrías: sí - ajustar geometrías con GeometryCollection type |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Una tolerancia que se utilizará para linealizar geometrías de curvas. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) que se aplicará a la coordenada M cuando se agreguen geometrías a la[`VectorLayer`](../../aspose.gis/vectorlayer/) o cuando se leen de la[`VectorLayer`](../../aspose.gis/vectorlayer/) . El valor predeterminado es[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [Name](../../aspose.gis.formats.geojson/geojsonoptions/name/) { get; set; } | Nombre a nivel de colección de entidades (para la creación de capas) |
| [NestedPropertiesSeparator](../../aspose.gis.formats.geojson/geojsonoptions/nestedpropertiesseparator/) { get; set; } | Obtiene o establece una cadena que se utiliza para separar componentes de atributos anidados. El valor predeterminado es "_". |
| [ReadBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/readboundingboxes/) { get; set; } | Determina si los cuadros delimitadores ('bbox') deben leerse como atributos con un nombre 'bbox_0', 'bbox_1', etc. El valor predeterminado es`false` . El[`NestedPropertiesSeparator`](./nestedpropertiesseparator/) la cadena se usa en bbox_0, bbox_1,... nombres. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Determina si se eliminan los puntos que se encuentran en el mismo segmento en cada geometría. Predeterminado a`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Determina la distancia para[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Predeterminado a`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Determina si las geometrías deben validarse cuando se agregan a la capa. Si se establece en`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) se llama para cada geometría cuando se agrega a la capa, y si falla la validación ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) es`false` ),[`GisException`](../../aspose.gis/gisexception/) es lanzado. |
| [WriteBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/writeboundingboxes/) { get; set; } | Determina si los objetos GeoJSON deben incluir información sobre el rango de coordenadas para sus geometrías. Si se establece en`true` , se genera un miembro "bbox" para cada geometría (no nula) cuando se agrega a la capa. El valor predeterminado es`false` . |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Determina si se permite la transformación de polígono o multipolígono a cadena lineal. Predeterminado a`false` . |
| [WriteUnsetAttribute](../../aspose.gis.formats.geojson/geojsonoptions/writeunsetattribute/) { get; set; } | Si escribir atributos no establecidos agregando valor 'nulo' |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) que se aplicará a las coordenadas X e Y cuando se agreguen geometrías al[`VectorLayer`](../../aspose.gis/vectorlayer/) o cuando se leen de la[`VectorLayer`](../../aspose.gis/vectorlayer/) . El valor predeterminado es[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) que se aplicará a la coordenada Z cuando se agreguen geometrías a la[`VectorLayer`](../../aspose.gis/vectorlayer/) o cuando se leen de la[`VectorLayer`](../../aspose.gis/vectorlayer/) . El valor predeterminado es[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Ver también

* class [DriverOptions](../../aspose.gis/driveroptions/)
* espacio de nombres [Aspose.Gis.Formats.GeoJson](../../aspose.gis.formats.geojson/)
* asamblea [Aspose.GIS](../../)


