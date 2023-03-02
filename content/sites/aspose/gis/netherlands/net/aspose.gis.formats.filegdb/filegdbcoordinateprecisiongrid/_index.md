---
title: Class FileGdbCoordinatePrecisionGrid
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.Formats.FileGdb.FileGdbCoordinatePrecisionGrid klas. Een coördinatenprecisieraster binnen een FileGDBlaag.
type: docs
weight: 250
url: /nl/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/
---
## FileGdbCoordinatePrecisionGrid class

Een coördinatenprecisieraster binnen een FileGDB-laag.

```csharp
public sealed class FileGdbCoordinatePrecisionGrid
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [FileGdbCoordinatePrecisionGrid](filegdbcoordinateprecisiongrid/)() | De standaard constructeur. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [MOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/morigin/) { get; set; } | Haalt of stelt de oorsprong van de M-coördinaat in. Indien ingesteld op`null` de standaard wordt gebruikt. |
| [MScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/mscale/) { get; set; } | Haalt of stelt de schaal van M-coördinaat in. Indien ingesteld op`null` de standaard wordt gebruikt. |
| [XOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xorigin/) { get; set; } | Haalt of stelt de oorsprong van de X-coördinaat in. Indien ingesteld op`null` de standaard wordt gebruikt. |
| [XYScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/) { get; set; } | Haalt of stelt de schaal van X- en Y-coördinaten in. Indien ingesteld op`null` de standaard wordt gebruikt. |
| [YOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/yorigin/) { get; set; } | Haalt of stelt de oorsprong van de Y-coördinaat in. Indien ingesteld op`null` de standaard wordt gebruikt. |
| [ZOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zorigin/) { get; set; } | Haalt of stelt de oorsprong van de Z-coördinaat in. Indien ingesteld op`null` de standaard wordt gebruikt. |
| [ZScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zscale/) { get; set; } | Haalt of stelt de schaal van de Z-coördinaat in. Indien ingesteld op`null` de standaard wordt gebruikt. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [CreateFromRectangle](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/)(IPoint, IPoint) | Creëert nieuwe`BestandGdbCoordinatePrecisionGrid` zodat alle waarden binnen een rechthoek kunnen worden weergegeven. |

### Opmerkingen

Het coördinatenprecisieraster definieert het geldige domein en de resolutie van coördinaten in de FileGDB-laag. Origin definieert het pad naar het coördinatenprecisieraster in de ruimte. Schaal definieert de resolutie (hoe groter schaal is, hoe nauwkeuriger waarden worden geschreven). Precisieraster specificeert het geldige bereik van waarden voor coördinaten: Elke coördinaat in de[`VectorLayer`](../../aspose.gis/vectorlayer/)moet binnen dit bereik liggen. Coördinaten die buiten het bereik vallen, kunnen later leesfouten veroorzaken en worden verkeerd verwerkt door ArcGIS. Als u geen eigenschappen opgeeft (behoud`null` ) de standaardwaarden worden gebruikt. Standaardwaarden zijn afhankelijk van[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) van de[`VectorLayer`](../../aspose.gis/vectorlayer/) . Voor geografisch[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) standaard zijn: Voor geprojecteerd[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) standaard zijn: waar`XYTolerantie` ,`ZTolerantie` En`MTolerantie` zijn waarden van[`FileGdbOptions`](../filegdboptions/) .

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

### Zie ook

* naamruimte [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* montage [Aspose.GIS](../../)


