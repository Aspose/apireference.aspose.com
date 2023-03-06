---
title: Class TopoJsonOptions
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.Formats.TopoJson.TopoJsonOptions klas. Treiberspezifische Optionen für das TopoJSONFormat.
type: docs
weight: 710
url: /de/net/aspose.gis.formats.topojson/topojsonoptions/
---
## TopoJsonOptions class

Treiberspezifische Optionen für das TopoJSON-Format.

```csharp
public class TopoJsonOptions : DriverOptions
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [TopoJsonOptions](topojsonoptions/)() | Neue Instanz erstellen. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Bestimmt, ob ein nicht geschlossener geschlossen wirdLinearRing in jeder Geometrie. Standardmäßig auf`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Legt fest, ob jedem Segment der Geometrie ein neuer Punkt in der Mitte hinzugefügt wird. Standardmäßig auf`false` . |
| [DefaultObjectName](../../aspose.gis.formats.topojson/topojsonoptions/defaultobjectname/) { get; set; } | Name des Objekts, in das Features standardmäßig eingefügt werden. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Legt fest, ob nahe Punkte in jeder Geometrie gelöscht werden. Standardmäßig auf`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Bestimmt Entfernung für[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Standardmäßig auf`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Eine Toleranz zum Linearisieren von Kurvengeometrien. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) die auf M-Koordinate angewendet wird, wenn Geometrien hinzugefügt werden[`VectorLayer`](../../aspose.gis/vectorlayer/) oder wenn sie aus dem gelesen werden[`VectorLayer`](../../aspose.gis/vectorlayer/) . Der Standardwert ist[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.topojson/topojsonoptions/nestedpropertiesseparator/) { get; set; } | Ruft eine Zeichenfolge ab oder legt sie fest, die verwendet wird, um Komponenten von verschachtelten Attributen zu trennen. Standard ist "_". |
| [ObjectNameAttribute](../../aspose.gis.formats.topojson/topojsonoptions/objectnameattribute/) { get; set; } | Name des Attributs, das den Namen des Objekts widerspiegelt, das ein Feature enthält. |
| [QuantizationNumber](../../aspose.gis.formats.topojson/topojsonoptions/quantizationnumber/) { get; set; } | Gibt die Quantisierungsnummer an, die zum Quantisieren von Koordinaten und Delta-Codierungsbögen in der Ausgabe TopoJSON verwendet werden soll. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Bestimmt, ob Punkte gelöscht werden, die in jeder Geometrie auf demselben Segment liegen. Standardmäßig auf`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Bestimmt Entfernung für[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Standardmäßig auf`0` . |
| [Transform](../../aspose.gis.formats.topojson/topojsonoptions/transform/) { get; set; } | Gibt das Transformationsobjekt an, das verwendet werden soll, um Koordinaten zu quantisieren und Bögen in der Ausgabe TopoJSON zu deltakodieren. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Legt fest, ob Geometrien validiert werden sollen, wenn sie der Ebene hinzugefügt werden. Wenn festgelegt auf`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) wird für each -Geometrie aufgerufen, wenn sie der Ebene hinzugefügt wird und wenn die Validierung fehlschlägt ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) Ist`false` ),[`GisException`](../../aspose.gis/gisexception/) wird geworfen. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Legt fest, ob die Umwandlung eines Polygons oder Multipolygons in einen Linienzug zulässig ist. Standardmäßig auf`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) die auf X- und Y-Koordinaten angewendet werden, wenn Geometrien hinzugefügt werden[`VectorLayer`](../../aspose.gis/vectorlayer/) oder wenn sie aus dem gelesen werden[`VectorLayer`](../../aspose.gis/vectorlayer/) . Der Standardwert ist[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) die auf Z-Koordinate angewendet wird, wenn Geometrien hinzugefügt werden[`VectorLayer`](../../aspose.gis/vectorlayer/) oder wenn sie aus dem gelesen werden[`VectorLayer`](../../aspose.gis/vectorlayer/) . Der Standardwert ist[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Siehe auch

* class [DriverOptions](../../aspose.gis/driveroptions/)
* namensraum [Aspose.Gis.Formats.TopoJson](../../aspose.gis.formats.topojson/)
* Montage [Aspose.GIS](../../)


