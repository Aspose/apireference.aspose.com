---
title: Class FileGdbCoordinatePrecisionGrid
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.Formats.FileGdb.FileGdbCoordinatePrecisionGrid klas. Ein KoordinatenPräzisionsgitter innerhalb einer FileGDBEbene.
type: docs
weight: 250
url: /de/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/
---
## FileGdbCoordinatePrecisionGrid class

Ein Koordinaten-Präzisionsgitter innerhalb einer FileGDB-Ebene.

```csharp
public sealed class FileGdbCoordinatePrecisionGrid
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [FileGdbCoordinatePrecisionGrid](filegdbcoordinateprecisiongrid/)() | Default_Constructor |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [MOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/morigin/) { get; set; } | Holt oder setzt den Ursprung der M-Koordinate. Wenn eingestellt`null` der Standardwert wird verwendet. |
| [MScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/mscale/) { get; set; } | Ermittelt oder setzt den Maßstab der M-Koordinate. Wenn eingestellt`null` der Standardwert wird verwendet. |
| [XOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xorigin/) { get; set; } | Holt oder setzt den Ursprung der X-Koordinate. Wenn eingestellt`null` der Standardwert wird verwendet. |
| [XYScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/) { get; set; } | Ruft die Skalierung der X- und Y-Koordinaten ab oder legt sie fest. Wenn eingestellt`null` der Standardwert wird verwendet. |
| [YOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/yorigin/) { get; set; } | Holt oder setzt den Ursprung der Y-Koordinate. Wenn eingestellt`null` der Standardwert wird verwendet. |
| [ZOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zorigin/) { get; set; } | Holt oder setzt den Ursprung der Z-Koordinate. Wenn eingestellt`null` der Standardwert wird verwendet. |
| [ZScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zscale/) { get; set; } | Holt oder setzt die Skalierung der Z-Koordinate. Wenn eingestellt`null` der Standardwert wird verwendet. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| static [CreateFromRectangle](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/)(IPoint, IPoint) | Erstellt neu`FileGdbCoordinatePrecisionGrid` so dass alle Werte innerhalb eines Rechtecks darstellbar sind. |

### Bemerkungen

Das Koordinaten-Präzisionsgitter definiert den gültigen Bereich und die Auflösung der Koordinaten im FileGDB-Layer. Origin definiert den Pfad zum Koordinaten-Präzisionsgitter im Raum. Maßstab definiert die Auflösung (je größer Maßstab ist, desto genauere Werte werden geschrieben). Präzisionsraster gibt den gültigen Wertebereich für Koordinaten an: Jede Koordinate in der[`VectorLayer`](../../aspose.gis/vectorlayer/)müssen innerhalb dieses Bereichs liegen. Koordinaten, die außerhalb des Bereichs liegen, können später zu Lesefehlern führen und werden von ArcGIS falsch verarbeitet. Wenn Sie keine Eigenschaften angeben (belassen Sie sie`null` ) werden die Standardwerte verwendet. Standardwerte abhängig von[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) des[`VectorLayer`](../../aspose.gis/vectorlayer/) . Für geografische[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) Standardwerte sind: Für projiziert[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) Standardwerte sind: wo`XYToleranz` ,`ZToleranz` Und`MToleranz` sind Werte aus[`FileGdbOptions`](../filegdboptions/) .

```csharp
XMin = XOrigin
YMin = YOrigin
ZMin = ZOrigin
MMin = MOrigin
XMax = XOrigin + 9e+15 / XYScale
YMax = YOrigin + 9e+15 / XYScale
ZMax = ZOrigin + 9e+15 / ZScale
MMax = MOrigin + 9e+15 / MScale
```

```csharp
XOrigin = -400
YOrigin = -400
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1e9
ZScale  = 1 / ZTolerance * 10
MScale  = 1 / MTolerance * 10
```

```csharp
XOrigin = -2147483647
YOrigin = -2147483647
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1 / XYTolerance * 10
ZScale  = 1 / ZTolerance  * 10
MScale  = 1 / MTolerance  * 10
```

### Siehe auch

* namensraum [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* Montage [Aspose.GIS](../../)


