---
title: Class FileGdbCoordinatePrecisionGrid
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.Formats.FileGdb.FileGdbCoordinatePrecisionGrid classe. Une grille de précision de coordonnées à lintérieur dune couche FileGDB.
type: docs
weight: 250
url: /fr/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/
---
## FileGdbCoordinatePrecisionGrid class

Une grille de précision de coordonnées à l'intérieur d'une couche FileGDB.

```csharp
public sealed class FileGdbCoordinatePrecisionGrid
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [FileGdbCoordinatePrecisionGrid](filegdbcoordinateprecisiongrid/)() | Default_Constructor |

## Propriétés

| Nom | La description |
| --- | --- |
| [MOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/morigin/) { get; set; } | Obtient ou définit l'origine de la coordonnée M. Si réglé sur`null` la valeur par défaut est utilisée. |
| [MScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/mscale/) { get; set; } | Obtient ou définit l'échelle de la coordonnée M. Si réglé sur`null` la valeur par défaut est utilisée. |
| [XOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xorigin/) { get; set; } | Obtient ou définit l'origine de la coordonnée X. Si réglé sur`null` la valeur par défaut est utilisée. |
| [XYScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/) { get; set; } | Obtient ou définit l'échelle des coordonnées X et Y. Si réglé sur`null` la valeur par défaut est utilisée. |
| [YOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/yorigin/) { get; set; } | Obtient ou définit l'origine de la coordonnée Y. Si réglé sur`null` la valeur par défaut est utilisée. |
| [ZOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zorigin/) { get; set; } | Obtient ou définit l'origine de la coordonnée Z. Si réglé sur`null` la valeur par défaut est utilisée. |
| [ZScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zscale/) { get; set; } | Obtient ou définit l'échelle de la coordonnée Z. Si réglé sur`null` la valeur par défaut est utilisée. |

## Méthodes

| Nom | La description |
| --- | --- |
| static [CreateFromRectangle](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/)(IPoint, IPoint) | Crée un nouveau`FileGdbCoordinatePrecisionGridFileGdbCoordinatePrecisionGrid` de sorte que toutes les valeurs à l'intérieur d'un rectangle soient représentables. |

### Remarques

La grille de précision des coordonnées définit le domaine valide et la résolution des coordonnées dans la couche FileGDB. L'origine définit le chemin vers la grille de précision des coordonnées dans l'espace. L'échelle définit la résolution (plus l'échelle est grande, plus les valeurs sont écrites avec précision). La grille de précision spécifie la plage de valeurs valides pour les coordonnées : Chaque coordonnée dans le[`VectorLayer`](../../aspose.gis/vectorlayer/)doivent être comprises dans cette plage. Les coordonnées qui sont en dehors de la plage peuvent provoquer des erreurs de lecture ultérieurement et seront mal traitées par ArcGIS. Si vous ne spécifiez aucune propriété (conservez-les`null` ) les valeurs par défaut seront utilisées. Les valeurs par défaut dépendent de[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) de la[`VectorLayer`](../../aspose.gis/vectorlayer/) . Pour géographique[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) les valeurs par défaut sont : Pour projeté[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) les valeurs par défaut sont : où`Tolérance XY` ,`Tolérance Z` et`MTolérance` sont des valeurs de[`FileGdbOptions`](../filegdboptions/) .

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

### Voir également

* espace de noms [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* Assemblée [Aspose.GIS](../../)


