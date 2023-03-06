---
title: Class GmlOptions
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.Formats.Gml.GmlOptions classe. Options spécifiques au pilote pour le format GML.
type: docs
weight: 350
url: /fr/net/aspose.gis.formats.gml/gmloptions/
---
## GmlOptions class

Options spécifiques au pilote pour le format GML.

```csharp
public class GmlOptions : DriverOptions
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [GmlOptions](gmloptions/)() | Créer une nouvelle instance. |

## Propriétés

| Nom | La description |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Détermine si fermer un non ferméLinearRing dans chaque géométrie. Par défaut à`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Détermine si ajouter un nouveau point au milieu à chaque segment de géométrie. Par défaut à`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Détermine si supprimer les points proches dans chaque géométrie. Par défaut à`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Détermine la distance pour[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Par défaut à`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Une tolérance à utiliser pour linéariser les géométries de courbe. |
| [LoadSchemasFromInternet](../../aspose.gis.formats.gml/gmloptions/loadschemasfrominternet/) { get; set; } | Détermine si Aspose.GIS est autorisé à charger le schéma XML à partir d'Internet. Si défini sur`false` les schémas avec des URI absolus qui ne commencent pas par 'file://' ne seraient pas chargés. La valeur par défaut est`false` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) qui sera appliqué à la coordonnée M lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer/) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer/) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.gml/gmloptions/nestedpropertiesseparator/) { get; set; } | Obtient ou définit une chaîne utilisée pour séparer les composants des attributs imbriqués. La valeur par défaut est "_". |
| [RestoreSchema](../../aspose.gis.formats.gml/gmloptions/restoreschema/) { get; set; } | Détermine si Aspose.GIS est autorisé à analyser les attributs d'un fichier Gml dans lequel un schéma XML est manquant ou ne peut pas être chargé. Si défini sur`true` , le lecteur Aspose.GIS ne nécessite pas la présence d'un schéma XML. La valeur par défaut est`false` . |
| [SchemaLocation](../../aspose.gis.formats.gml/gmloptions/schemalocation/) { get; set; } | Liste de paires d'URI séparées par des espaces. Le premier URI de chaque paire est un URI de l'espace de noms, le deuxième URI est un chemin vers le schéma XML de l'espace de noms. Si défini sur`null` ,[`GmlDriver`](../gmldriver/) va essayer de lire schemaLocation à partir de l'élément racine du document. La valeur par défaut est`null` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Détermine si supprimer des points se trouvant sur le même segment dans chaque géométrie. Par défaut à`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Détermine la distance pour[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Par défaut à`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Détermine si les géométries doivent être validées lorsqu'elles sont ajoutées au calque. Si défini sur`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) est appelée pour chaque géométrie lorsqu'elle est ajoutée à la couche, et si la validation échoue ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) est`false` ),[`GisException`](../../aspose.gis/gisexception/) est lancé. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Détermine si la transformation d'un polygone ou d'un multipolygone en ligne est autorisée. Par défaut à`false` . |
| [XmlResolver](../../aspose.gis.formats.gml/gmloptions/xmlresolver/) { get; set; } | A[`XmlResolver`](./xmlresolver/) utilisé pour résoudre les ressources externes. La valeur par défaut estXmlUrlResolver . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) qui sera appliqué aux coordonnées X et Y lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer/) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer/) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) qui sera appliqué à la coordonnée Z lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer/) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer/) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Voir également

* class [DriverOptions](../../aspose.gis/driveroptions/)
* espace de noms [Aspose.Gis.Formats.Gml](../../aspose.gis.formats.gml/)
* Assemblée [Aspose.GIS](../../)


