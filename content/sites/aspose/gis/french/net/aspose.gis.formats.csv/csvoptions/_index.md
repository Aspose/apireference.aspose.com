---
title: CsvOptions
second_title: Référence de l'API Aspose.GIS pour .NET
description: Options spécifiques au pilote pour le format CSV.
type: docs
weight: 190
url: /fr/net/aspose.gis.formats.csv/csvoptions/
---
## CsvOptions class

Options spécifiques au pilote pour le format CSV.

```csharp
public class CsvOptions : DriverOptions
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [CsvOptions](csvoptions)() | Créer une nouvelle instance. |

## Propriétés

| Nom | La description |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring) { get; set; } | Détermine si fermer un non ferméLinearRing dans chaque géométrie. Par défaut à`false` . |
| [ColumnM](../../aspose.gis.formats.csv/csvoptions/columnm) { get; set; } | Obtient ou définit un nom de colonne contenant la valeur de coordonnée M. La valeur par défaut est`null` . |
| [ColumnWkt](../../aspose.gis.formats.csv/csvoptions/columnwkt) { get; set; } | Obtient ou définit un nom de colonne contient du texte bien connu pour représenter la géométrie. La valeur par défaut est`null` . |
| [ColumnX](../../aspose.gis.formats.csv/csvoptions/columnx) { get; set; } | Obtient ou définit un nom de colonne contenant une valeur de coordonnée X. La valeur par défaut est`null` . |
| [ColumnY](../../aspose.gis.formats.csv/csvoptions/columny) { get; set; } | Obtient ou définit un nom de colonne contenant la valeur de coordonnée Y. La valeur par défaut est`null` . |
| [ColumnZ](../../aspose.gis.formats.csv/csvoptions/columnz) { get; set; } | Obtient ou définit un nom de colonne contenant une valeur de coordonnée Z. La valeur par défaut est`null` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints) { get; set; } | Détermine si ajouter un nouveau point au milieu à chaque segment de géométrie. Par défaut à`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints) { get; set; } | Détermine si supprimer les points proches dans chaque géométrie. Par défaut à`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance) { get; set; } | Détermine la distance pour[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints) . Par défaut à`0` . |
| [Delimiter](../../aspose.gis.formats.csv/csvoptions/delimiter) { get; set; } | Obtient ou définit un caractère utilisé comme délimiteur pour séparer les valeurs. La valeur par défaut est ','. |
| [DoubleQuoteEscape](../../aspose.gis.formats.csv/csvoptions/doublequoteescape) { get; set; } | Obtient ou définit un caractère utilisé comme lettre d'échappement pour les guillemets doubles. La valeur par défaut est '"'. |
| [HasAttributeNames](../../aspose.gis.formats.csv/csvoptions/hasattributenames) { get; set; } | Détermine si une ligne d'en-tête avec des noms d'attribut existe. La valeur par défaut est`true` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance) { get; set; } | Une tolérance à utiliser pour linéariser les géométries de courbe. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) qui sera appliqué à la coordonnée M lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments) { get; set; } | Détermine si supprimer des points se trouvant sur le même segment dans chaque géométrie. Par défaut à`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance) { get; set; } | Détermine la distance pour[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments) . Par défaut à`0` . |
| [StartLineNumber](../../aspose.gis.formats.csv/csvoptions/startlinenumber) { get; set; } | Obtient ou définit un nombre de lignes basé sur zéro qui sera le premier lors de la lecture des données. La valeur par défaut est 0. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite) { get; set; } | Détermine si les géométries doivent être validées lorsqu'elles sont ajoutées au calque. Si défini sur`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid)est appelée pour chaque géométrie lorsqu'elle est ajoutée à la couche, et si la validation échoue ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid) est`false` ),[`GisException`](../../aspose.gis/gisexception) est lancé. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines) { get; set; } | Détermine si la transformation d'un polygone ou d'un multipolygone en ligne est autorisée. Par défaut à`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel)qui sera appliqué aux coordonnées X et Y lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) qui sera appliqué à la coordonnée Z lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact) . |

### Voir également

* class [DriverOptions](../../aspose.gis/driveroptions)
* espace de noms [Aspose.Gis.Formats.Csv](../../aspose.gis.formats.csv)
* Assemblée [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
