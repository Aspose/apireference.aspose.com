---
title: Class GeoJsonOptions
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.Formats.GeoJson.GeoJsonOptions klas. Treiberspezifische Optionen für das GeoJSONFormat.
type: docs
weight: 310
url: /de/net/aspose.gis.formats.geojson/geojsonoptions/
---
## GeoJsonOptions class

Treiberspezifische Optionen für das GeoJSON-Format.

```csharp
public class GeoJsonOptions : DriverOptions
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [GeoJsonOptions](geojsonoptions/)() | Neue Instanz erstellen. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [ArrayAsString](../../aspose.gis.formats.geojson/geojsonoptions/arrayasstring/) { get; set; } | Ob JSon-Arrays aus Strings, Ganzzahlen oder reellen Zahlen als String verfügbar gemacht werden sollen. |
| [AttributesSkip](../../aspose.gis.formats.geojson/geojsonoptions/attributesskip/) { get; set; } | steuert die Übersetzung von Attributen: ja - alle Attribute überspringen |
| [AutoId](../../aspose.gis.formats.geojson/geojsonoptions/autoid/) { get; set; } | IDs automatisch generieren |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Bestimmt, ob ein nicht geschlossener geschlossen wirdLinearRing in jeder Geometrie. Standardmäßig auf`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Legt fest, ob jedem Segment der Geometrie ein neuer Punkt in der Mitte hinzugefügt wird. Standardmäßig auf`false` . |
| [DateAsString](../../aspose.gis.formats.geojson/geojsonoptions/dateasstring/) { get; set; } | Ob JSon-Datum/Uhrzeit/Datum-Uhrzeit als Zeichenfolge angezeigt werden soll. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Legt fest, ob nahe Punkte in jeder Geometrie gelöscht werden. Standardmäßig auf`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Bestimmt Entfernung für[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Standardmäßig auf`0` . |
| [Description](../../aspose.gis.formats.geojson/geojsonoptions/description/) { get; set; } | Beschreibung auf Merkmalssammlungsebene (für Layer-Erstellung) |
| [GeometryAsCollection](../../aspose.gis.formats.geojson/geojsonoptions/geometryascollection/) { get; set; } | Übersetzung von Geometrien steuern: ja - Geometrien mit GeometryCollection type umschließen |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Eine Toleranz zum Linearisieren von Kurvengeometrien. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) die auf M-Koordinate angewendet wird, wenn Geometrien hinzugefügt werden[`VectorLayer`](../../aspose.gis/vectorlayer/) oder wenn sie aus dem gelesen werden[`VectorLayer`](../../aspose.gis/vectorlayer/) . Der Standardwert ist[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [Name](../../aspose.gis.formats.geojson/geojsonoptions/name/) { get; set; } | Name auf Merkmalssammlungsebene (für Layer-Erstellung) |
| [NestedPropertiesSeparator](../../aspose.gis.formats.geojson/geojsonoptions/nestedpropertiesseparator/) { get; set; } | Ruft eine Zeichenfolge ab oder legt sie fest, die verwendet wird, um Komponenten von verschachtelten Attributen zu trennen. Standard ist "_". |
| [ReadBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/readboundingboxes/) { get; set; } | Legt fest, ob Bounding Boxes ('bbox') als Attribute mit Namen 'bbox_0', 'bbox_1' usw. gelesen werden sollen. Standardwert ist`false` . Die[`NestedPropertiesSeparator`](./nestedpropertiesseparator/) string wird verwendet in bbox_0, bbox_1,.. names. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Bestimmt, ob Punkte gelöscht werden, die in jeder Geometrie auf demselben Segment liegen. Standardmäßig auf`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Bestimmt Entfernung für[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Standardmäßig auf`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Legt fest, ob Geometrien validiert werden sollen, wenn sie der Ebene hinzugefügt werden. Wenn festgelegt auf`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) wird für each -Geometrie aufgerufen, wenn sie der Ebene hinzugefügt wird und wenn die Validierung fehlschlägt ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) Ist`false` ),[`GisException`](../../aspose.gis/gisexception/) wird geworfen. |
| [WriteBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/writeboundingboxes/) { get; set; } | Legt fest, ob GeoJSON-Objekte Informationen zum Koordinatenbereich für ihre Geometrien enthalten sollen. Wenn festgelegt auf`true` , ein Element "bbox" wird für jede Geometrie (nicht null) generiert, wenn sie der Ebene hinzugefügt wird. Der Standardwert ist`false` . |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Legt fest, ob die Umwandlung eines Polygons oder Multipolygons in einen Linienzug zulässig ist. Standardmäßig auf`false` . |
| [WriteUnsetAttribute](../../aspose.gis.formats.geojson/geojsonoptions/writeunsetattribute/) { get; set; } | Ob nicht gesetzte Attribute geschrieben werden sollen, indem 'null' value hinzugefügt wird |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) die auf X- und Y-Koordinaten angewendet werden, wenn Geometrien hinzugefügt werden[`VectorLayer`](../../aspose.gis/vectorlayer/) oder wenn sie aus dem gelesen werden[`VectorLayer`](../../aspose.gis/vectorlayer/) . Der Standardwert ist[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) die auf Z-Koordinate angewendet wird, wenn Geometrien hinzugefügt werden[`VectorLayer`](../../aspose.gis/vectorlayer/) oder wenn sie aus dem gelesen werden[`VectorLayer`](../../aspose.gis/vectorlayer/) . Der Standardwert ist[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Siehe auch

* class [DriverOptions](../../aspose.gis/driveroptions/)
* namensraum [Aspose.Gis.Formats.GeoJson](../../aspose.gis.formats.geojson/)
* Montage [Aspose.GIS](../../)


