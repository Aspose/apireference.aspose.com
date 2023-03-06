---
title: Class GdalOptions
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.Formats.GDAL.GdalOptions klas. Treiberspezifische Optionen für das GDALFormat.
type: docs
weight: 290
url: /de/net/aspose.gis.formats.gdal/gdaloptions/
---
## GdalOptions class

Treiberspezifische Optionen für das GDAL-Format.

```csharp
public class GdalOptions : DriverOptions
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [GdalOptions](gdaloptions/)(string) | Erstellen Sie eine neue Instanz. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Bestimmt, ob ein nicht geschlossener geschlossen wirdLinearRing in jeder Geometrie. Standardmäßig auf`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Legt fest, ob jedem Segment der Geometrie ein neuer Punkt in der Mitte hinzugefügt wird. Standardmäßig auf`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Legt fest, ob nahe Punkte in jeder Geometrie gelöscht werden. Standardmäßig auf`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Bestimmt Entfernung für[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Standardmäßig auf`0` . |
| [FileName](../../aspose.gis.formats.gdal/gdaloptions/filename/) { get; set; } | Name der zu startenden Anwendung |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Eine Toleranz zum Linearisieren von Kurvengeometrien. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) die auf M-Koordinate angewendet wird, wenn Geometrien hinzugefügt werden[`VectorLayer`](../../aspose.gis/vectorlayer/) oder wenn sie aus dem gelesen werden[`VectorLayer`](../../aspose.gis/vectorlayer/) . Der Standardwert ist[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [PathToTempFile](../../aspose.gis.formats.gdal/gdaloptions/pathtotempfile/) { get; } | Pfad zu temporären Dateien. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Bestimmt, ob Punkte gelöscht werden, die in jeder Geometrie auf demselben Segment liegen. Standardmäßig auf`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Bestimmt Entfernung für[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Standardmäßig auf`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Legt fest, ob Geometrien validiert werden sollen, wenn sie der Ebene hinzugefügt werden. Wenn festgelegt auf`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) wird für each -Geometrie aufgerufen, wenn sie der Ebene hinzugefügt wird und wenn die Validierung fehlschlägt ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) Ist`false` ),[`GisException`](../../aspose.gis/gisexception/) wird geworfen. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Legt fest, ob die Umwandlung eines Polygons oder Multipolygons in einen Linienzug zulässig ist. Standardmäßig auf`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) die auf X- und Y-Koordinaten angewendet werden, wenn Geometrien hinzugefügt werden[`VectorLayer`](../../aspose.gis/vectorlayer/) oder wenn sie aus dem gelesen werden[`VectorLayer`](../../aspose.gis/vectorlayer/) . Der Standardwert ist[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) die auf Z-Koordinate angewendet wird, wenn Geometrien hinzugefügt werden[`VectorLayer`](../../aspose.gis/vectorlayer/) oder wenn sie aus dem gelesen werden[`VectorLayer`](../../aspose.gis/vectorlayer/) . Der Standardwert ist[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Siehe auch

* class [DriverOptions](../../aspose.gis/driveroptions/)
* namensraum [Aspose.Gis.Formats.GDAL](../../aspose.gis.formats.gdal/)
* Montage [Aspose.GIS](../../)


