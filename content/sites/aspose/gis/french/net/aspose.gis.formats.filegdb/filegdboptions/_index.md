---
title: FileGdbOptions
second_title: Référence de l'API Aspose.GIS pour .NET
description: Options spécifiques au pilote pour le format FileGDB.
type: docs
weight: 240
url: /fr/net/aspose.gis.formats.filegdb/filegdboptions/
---
## FileGdbOptions class

Options spécifiques au pilote pour le format FileGDB.

```csharp
public sealed class FileGdbOptions : DriverOptions
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [FileGdbOptions](filegdboptions)() | Créer une nouvelle instance. |

## Propriétés

| Nom | La description |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring) { get; set; } | Détermine si fermer un non ferméLinearRing dans chaque géométrie. Par défaut à`false` . |
| [CoordinatePrecisionGrid](../../aspose.gis.formats.filegdb/filegdboptions/coordinateprecisiongrid) { get; set; } | Une grille de précision des coordonnées à utiliser dans le nouveau calque. |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints) { get; set; } | Détermine si ajouter un nouveau point au milieu à chaque segment de géométrie. Par défaut à`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints) { get; set; } | Détermine si supprimer les points proches dans chaque géométrie. Par défaut à`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance) { get; set; } | Détermine la distance pour[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints) . Par défaut à`0` . |
| [EnsureValidCoordinatesRange](../../aspose.gis.formats.filegdb/filegdboptions/ensurevalidcoordinatesrange) { get; set; } | Si les coordonnées doivent être dans une plage valide. |
| [GeometryFieldName](../../aspose.gis.formats.filegdb/filegdboptions/geometryfieldname) { get; set; } | Nom du champ géométrique. |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance) { get; set; } | Une tolérance à utiliser pour linéariser les géométries de courbe. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) qui sera appliqué à la coordonnée M lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [MTolerance](../../aspose.gis.formats.filegdb/filegdboptions/mtolerance) { get; set; } | Tolérance d'accrochage M. |
| [ObjectIdFieldName](../../aspose.gis.formats.filegdb/filegdboptions/objectidfieldname) { get; set; } | Nom du champ ID de l'objet. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments) { get; set; } | Détermine si supprimer des points se trouvant sur le même segment dans chaque géométrie. Par défaut à`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance) { get; set; } | Détermine la distance pour[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments) . Par défaut à`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite) { get; set; } | Détermine si les géométries doivent être validées lorsqu'elles sont ajoutées au calque. Si défini sur`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid)est appelée pour chaque géométrie lorsqu'elle est ajoutée à la couche, et si la validation échoue ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid) est`false` ),[`GisException`](../../aspose.gis/gisexception) est lancé. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines) { get; set; } | Détermine si la transformation d'un polygone ou d'un multipolygone en ligne est autorisée. Par défaut à`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel)qui sera appliqué aux coordonnées X et Y lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [XYTolerance](../../aspose.gis.formats.filegdb/filegdboptions/xytolerance) { get; set; } | Tolérance d'accrochage X et Y. |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) qui sera appliqué à la coordonnée Z lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [ZTolerance](../../aspose.gis.formats.filegdb/filegdboptions/ztolerance) { get; set; } | Tolérance d'accrochage Z. |

### Voir également

* class [DriverOptions](../../aspose.gis/driveroptions)
* espace de noms [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb)
* Assemblée [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
