---
title: Class CsvOptions
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.Formats.Csv.CsvOptions klas. Treiberspezifische Optionen für das CSVFormat.
type: docs
weight: 200
url: /de/net/aspose.gis.formats.csv/csvoptions/
---
## CsvOptions class

Treiberspezifische Optionen für das CSV-Format.

```csharp
public class CsvOptions : DriverOptions
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [CsvOptions](csvoptions/)() | Neue Instanz erstellen. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Bestimmt, ob ein nicht geschlossener geschlossen wirdLinearRing in jeder Geometrie. Standardmäßig auf`false` . |
| [ColumnM](../../aspose.gis.formats.csv/csvoptions/columnm/) { get; set; } | Ermittelt oder legt einen Namen der Spalte fest, die den M-Koordinatenwert enthält. Standard ist`null` . |
| [ColumnWkt](../../aspose.gis.formats.csv/csvoptions/columnwkt/) { get; set; } | Ruft einen Namen einer Spalte ab oder legt einen Namen fest, der bekannten Text zur Darstellung von Geometrie enthält. Standard ist`null` . |
| [ColumnX](../../aspose.gis.formats.csv/csvoptions/columnx/) { get; set; } | Ermittelt oder legt einen Namen der Spalte fest, die den X-Koordinatenwert enthält. Standard ist`null` . |
| [ColumnY](../../aspose.gis.formats.csv/csvoptions/columny/) { get; set; } | Ruft einen Namen der Spalte ab oder legt einen Namen fest, der einen Y-Koordinatenwert enthält. Standard ist`null` . |
| [ColumnZ](../../aspose.gis.formats.csv/csvoptions/columnz/) { get; set; } | Ruft einen Namen der Spalte ab oder legt einen Namen fest, der den Z-Koordinatenwert enthält. Standard ist`null` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Legt fest, ob jedem Segment der Geometrie ein neuer Punkt in der Mitte hinzugefügt wird. Standardmäßig auf`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Legt fest, ob nahe Punkte in jeder Geometrie gelöscht werden. Standardmäßig auf`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Bestimmt Entfernung für[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Standardmäßig auf`0` . |
| [Delimiter](../../aspose.gis.formats.csv/csvoptions/delimiter/) { get; set; } | Erhält oder setzt ein Zeichen, das als Trennzeichen zum Trennen von Werten verwendet wird. Standard ist ','. |
| [DoubleQuoteEscape](../../aspose.gis.formats.csv/csvoptions/doublequoteescape/) { get; set; } | Holt oder setzt ein Zeichen, das als Escape-Buchstabe für doppelte Anführungszeichen verwendet wird. Standard ist '"'. |
| [HasAttributeNames](../../aspose.gis.formats.csv/csvoptions/hasattributenames/) { get; set; } | Bestimmt, ob eine Kopfzeile mit Attributnamen vorhanden ist. Standard ist`true` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Eine Toleranz zum Linearisieren von Kurvengeometrien. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) die auf M-Koordinate angewendet wird, wenn Geometrien hinzugefügt werden[`VectorLayer`](../../aspose.gis/vectorlayer/) oder wenn sie aus dem gelesen werden[`VectorLayer`](../../aspose.gis/vectorlayer/) . Der Standardwert ist[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Bestimmt, ob Punkte gelöscht werden, die in jeder Geometrie auf demselben Segment liegen. Standardmäßig auf`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Bestimmt Entfernung für[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Standardmäßig auf`0` . |
| [StartLineNumber](../../aspose.gis.formats.csv/csvoptions/startlinenumber/) { get; set; } | Ruft eine nullbasierte Zeilennummer ab oder legt sie fest, die beim Lesen der Daten an erster Stelle steht. Standard ist 0. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Legt fest, ob Geometrien validiert werden sollen, wenn sie der Ebene hinzugefügt werden. Wenn festgelegt auf`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) wird für each -Geometrie aufgerufen, wenn sie der Ebene hinzugefügt wird und wenn die Validierung fehlschlägt ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) Ist`false` ),[`GisException`](../../aspose.gis/gisexception/) wird geworfen. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Legt fest, ob die Umwandlung eines Polygons oder Multipolygons in einen Linienzug zulässig ist. Standardmäßig auf`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) die auf X- und Y-Koordinaten angewendet werden, wenn Geometrien hinzugefügt werden[`VectorLayer`](../../aspose.gis/vectorlayer/) oder wenn sie aus dem gelesen werden[`VectorLayer`](../../aspose.gis/vectorlayer/) . Der Standardwert ist[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) die auf Z-Koordinate angewendet wird, wenn Geometrien hinzugefügt werden[`VectorLayer`](../../aspose.gis/vectorlayer/) oder wenn sie aus dem gelesen werden[`VectorLayer`](../../aspose.gis/vectorlayer/) . Der Standardwert ist[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Siehe auch

* class [DriverOptions](../../aspose.gis/driveroptions/)
* namensraum [Aspose.Gis.Formats.Csv](../../aspose.gis.formats.csv/)
* Montage [Aspose.GIS](../../)


