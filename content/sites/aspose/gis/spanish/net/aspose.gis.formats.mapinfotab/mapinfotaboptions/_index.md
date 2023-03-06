---
title: Class MapInfoTabOptions
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.Formats.MapInfoTab.MapInfoTabOptions clase. Opciones específicas del controlador para el formato de ficha MapInfo.
type: docs
weight: 610
url: /es/net/aspose.gis.formats.mapinfotab/mapinfotaboptions/
---
## MapInfoTabOptions class

Opciones específicas del controlador para el formato de ficha MapInfo.

```csharp
public class MapInfoTabOptions : DriverOptions
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [MapInfoTabOptions](mapinfotaboptions/)() | Crear nueva instancia. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [BlockSize](../../aspose.gis.formats.mapinfotab/mapinfotaboptions/blocksize/) { get; set; } | Tamaño de bloque para archivos '*.map' (múltiplos de 512). El valor predeterminado es 16384. Valores válidos: 512 a 32256. |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Determina si cerrar un no cerradoLinearRing en cada geometría. Predeterminado a`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Determina si se agrega un nuevo punto en el medio de cada segmento de geometría. Predeterminado a`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Determina si eliminar puntos cercanos en cada geometría. Predeterminado a`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Determina la distancia para[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Predeterminado a`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Una tolerancia que se utilizará para linealizar geometrías de curvas. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) que se aplicará a la coordenada M cuando se agreguen geometrías a la[`VectorLayer`](../../aspose.gis/vectorlayer/) o cuando se leen de la[`VectorLayer`](../../aspose.gis/vectorlayer/) . El valor predeterminado es[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Determina si se eliminan los puntos que se encuentran en el mismo segmento en cada geometría. Predeterminado a`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Determina la distancia para[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Predeterminado a`0` . |
| [TextStringAttribute](../../aspose.gis.formats.mapinfotab/mapinfotaboptions/textstringattribute/) { get; set; } | Especifica el nombre del atributo que representa el texto del objeto gráfico 'Texto'. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Determina si las geometrías deben validarse cuando se agregan a la capa. Si se establece en`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) se llama para cada geometría cuando se agrega a la capa, y si falla la validación ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) es`false` ),[`GisException`](../../aspose.gis/gisexception/) es lanzado. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Determina si se permite la transformación de polígono o multipolígono a cadena lineal. Predeterminado a`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) que se aplicará a las coordenadas X e Y cuando se agreguen geometrías al[`VectorLayer`](../../aspose.gis/vectorlayer/) o cuando se leen de la[`VectorLayer`](../../aspose.gis/vectorlayer/) . El valor predeterminado es[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) que se aplicará a la coordenada Z cuando se agreguen geometrías a la[`VectorLayer`](../../aspose.gis/vectorlayer/) o cuando se leen de la[`VectorLayer`](../../aspose.gis/vectorlayer/) . El valor predeterminado es[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Ver también

* class [DriverOptions](../../aspose.gis/driveroptions/)
* espacio de nombres [Aspose.Gis.Formats.MapInfoTab](../../aspose.gis.formats.mapinfotab/)
* asamblea [Aspose.GIS](../../)


