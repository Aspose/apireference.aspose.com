---
title: Class KmlOptions
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.Formats.Kml.KmlOptions classe. Options spécifiques au pilote pour le format KML.
type: docs
weight: 410
url: /fr/net/aspose.gis.formats.kml/kmloptions/
---
## KmlOptions class

Options spécifiques au pilote pour le format KML.

```csharp
public class KmlOptions : DriverOptions
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [KmlOptions](kmloptions/)() | Créer une nouvelle instance. |

## Propriétés

| Nom | La description |
| --- | --- |
| [AltitudeMode](../../aspose.gis.formats.kml/kmloptions/altitudemode/) { get; set; } | Vous permet de spécifier les AltitudeModes à utiliser pour les géométries KML |
| [AutoId](../../aspose.gis.formats.kml/kmloptions/autoid/) { get; set; } | Générer automatiquement des identifiants |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Détermine si fermer un non ferméLinearRing dans chaque géométrie. Par défaut à`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Détermine si ajouter un nouveau point au milieu à chaque segment de géométrie. Par défaut à`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Détermine si supprimer les points proches dans chaque géométrie. Par défaut à`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Détermine la distance pour[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Par défaut à`0` . |
| [DocumentId](../../aspose.gis.formats.kml/kmloptions/documentid/) { get; set; } | Utilisé pour spécifier l'id du nœud racine 'Document' |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Une tolérance à utiliser pour linéariser les géométries de courbe. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) qui sera appliqué à la coordonnée M lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer/) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer/) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Détermine si supprimer des points se trouvant sur le même segment dans chaque géométrie. Par défaut à`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Détermine la distance pour[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Par défaut à`0` . |
| [SymbolToReplaceInvalidChars](../../aspose.gis.formats.kml/kmloptions/symboltoreplaceinvalidchars/) { get; set; } | Détermine quel symbole sera utilisé pour remplacer les caractères invalides lors de la lecture. Le remplacement est ignoré si la valeur est '\0'. Par défaut, la valeur est '\0' char. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Détermine si les géométries doivent être validées lorsqu'elles sont ajoutées au calque. Si défini sur`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) est appelée pour chaque géométrie lorsqu'elle est ajoutée à la couche, et si la validation échoue ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) est`false` ),[`GisException`](../../aspose.gis/gisexception/) est lancé. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Détermine si la transformation d'un polygone ou d'un multipolygone en ligne est autorisée. Par défaut à`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) qui sera appliqué aux coordonnées X et Y lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer/) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer/) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) qui sera appliqué à la coordonnée Z lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer/) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer/) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Voir également

* class [DriverOptions](../../aspose.gis/driveroptions/)
* espace de noms [Aspose.Gis.Formats.Kml](../../aspose.gis.formats.kml/)
* Assemblée [Aspose.GIS](../../)


