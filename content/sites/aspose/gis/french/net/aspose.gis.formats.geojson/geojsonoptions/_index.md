---
title: Class GeoJsonOptions
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.Formats.GeoJson.GeoJsonOptions classe. Options spécifiques au pilote pour le format GeoJSON.
type: docs
weight: 310
url: /fr/net/aspose.gis.formats.geojson/geojsonoptions/
---
## GeoJsonOptions class

Options spécifiques au pilote pour le format GeoJSON.

```csharp
public class GeoJsonOptions : DriverOptions
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [GeoJsonOptions](geojsonoptions/)() | Créer une nouvelle instance. |

## Propriétés

| Nom | La description |
| --- | --- |
| [ArrayAsString](../../aspose.gis.formats.geojson/geojsonoptions/arrayasstring/) { get; set; } | Indique s'il faut exposer des tableaux JSon de chaînes, d'entiers ou de réels sous forme de chaîne. |
| [AttributesSkip](../../aspose.gis.formats.geojson/geojsonoptions/attributesskip/) { get; set; } | contrôle la traduction des attributs : oui - ignore tous les attributs |
| [AutoId](../../aspose.gis.formats.geojson/geojsonoptions/autoid/) { get; set; } | Générer automatiquement des identifiants |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Détermine si fermer un non ferméLinearRing dans chaque géométrie. Par défaut à`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Détermine si ajouter un nouveau point au milieu à chaque segment de géométrie. Par défaut à`false` . |
| [DateAsString](../../aspose.gis.formats.geojson/geojsonoptions/dateasstring/) { get; set; } | Indique s'il faut exposer JSon date/time/date-time en tant que chaîne. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Détermine si supprimer les points proches dans chaque géométrie. Par défaut à`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Détermine la distance pour[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Par défaut à`0` . |
| [Description](../../aspose.gis.formats.geojson/geojsonoptions/description/) { get; set; } | Description au niveau de la collection d'entités (pour la création de couches) |
| [GeometryAsCollection](../../aspose.gis.formats.geojson/geojsonoptions/geometryascollection/) { get; set; } | contrôle la traduction des géométries : oui - envelopper les géométries avec le type GeometryCollection |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Une tolérance à utiliser pour linéariser les géométries de courbe. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) qui sera appliqué à la coordonnée M lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer/) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer/) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [Name](../../aspose.gis.formats.geojson/geojsonoptions/name/) { get; set; } | Nom au niveau de la collection d'entités (pour la création de couches) |
| [NestedPropertiesSeparator](../../aspose.gis.formats.geojson/geojsonoptions/nestedpropertiesseparator/) { get; set; } | Obtient ou définit une chaîne utilisée pour séparer les composants des attributs imbriqués. La valeur par défaut est "_". |
| [ReadBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/readboundingboxes/) { get; set; } | Détermine si les boîtes englobantes ('bbox') doivent être lues comme des attributs avec un nom 'bbox_0', 'bbox_1', etc. La valeur par défaut est`false` . Le[`NestedPropertiesSeparator`](./nestedpropertiesseparator/) chaîne est utilisée dans bbox_0, bbox_1,.. noms. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Détermine si supprimer des points se trouvant sur le même segment dans chaque géométrie. Par défaut à`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Détermine la distance pour[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Par défaut à`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Détermine si les géométries doivent être validées lorsqu'elles sont ajoutées au calque. Si défini sur`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) est appelée pour chaque géométrie lorsqu'elle est ajoutée à la couche, et si la validation échoue ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) est`false` ),[`GisException`](../../aspose.gis/gisexception/) est lancé. |
| [WriteBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/writeboundingboxes/) { get; set; } | Détermine si les objets GeoJSON doivent inclure des informations sur la plage de coordonnées pour ses géométries. Si défini sur`true` , un membre "bbox" est généré pour chaque géométrie (non nul) lorsqu'il est ajouté à la couche. La valeur par défaut est`false` . |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Détermine si la transformation d'un polygone ou d'un multipolygone en ligne est autorisée. Par défaut à`false` . |
| [WriteUnsetAttribute](../../aspose.gis.formats.geojson/geojsonoptions/writeunsetattribute/) { get; set; } | S'il faut écrire des attributs non définis en ajoutant une valeur "null" |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) qui sera appliqué aux coordonnées X et Y lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer/) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer/) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) qui sera appliqué à la coordonnée Z lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer/) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer/) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Voir également

* class [DriverOptions](../../aspose.gis/driveroptions/)
* espace de noms [Aspose.Gis.Formats.GeoJson](../../aspose.gis.formats.geojson/)
* Assemblée [Aspose.GIS](../../)


