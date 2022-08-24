---
title: TopoJsonOptions
second_title: Référence de l'API Aspose.GIS pour .NET
description: Options spécifiques au pilote pour le format TopoJSON.
type: docs
weight: 640
url: /fr/net/aspose.gis.formats.topojson/topojsonoptions/
---
## TopoJsonOptions class

Options spécifiques au pilote pour le format TopoJSON.

```csharp
public class TopoJsonOptions : DriverOptions
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [TopoJsonOptions](topojsonoptions)() | Créer une nouvelle instance. |

## Propriétés

| Nom | La description |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring) { get; set; } | Détermine si fermer un non ferméLinearRing dans chaque géométrie. Par défaut à`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints) { get; set; } | Détermine si ajouter un nouveau point au milieu à chaque segment de géométrie. Par défaut à`false` . |
| [DefaultObjectName](../../aspose.gis.formats.topojson/topojsonoptions/defaultobjectname) { get; set; } | Nom de l'objet où les fonctionnalités sont mises par défaut. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints) { get; set; } | Détermine si supprimer les points proches dans chaque géométrie. Par défaut à`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance) { get; set; } | Détermine la distance pour[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints) . Par défaut à`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance) { get; set; } | Une tolérance à utiliser pour linéariser les géométries de courbe. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) qui sera appliqué à la coordonnée M lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.topojson/topojsonoptions/nestedpropertiesseparator) { get; set; } | Obtient ou définit une chaîne utilisée pour séparer les composants des attributs imbriqués. La valeur par défaut est "_". |
| [ObjectNameAttribute](../../aspose.gis.formats.topojson/topojsonoptions/objectnameattribute) { get; set; } | Nom de l'attribut, qui reflète le nom de l'objet qui contient une fonctionnalité. |
| [QuantizationNumber](../../aspose.gis.formats.topojson/topojsonoptions/quantizationnumber) { get; set; } | Spécifie le numéro de quantification à utiliser pour quantifier les coordonnées et encoder les arcs en delta dans la sortie TopoJSON. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments) { get; set; } | Détermine si supprimer des points se trouvant sur le même segment dans chaque géométrie. Par défaut à`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance) { get; set; } | Détermine la distance pour[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments) . Par défaut à`0` . |
| [Transform](../../aspose.gis.formats.topojson/topojsonoptions/transform) { get; set; } | Spécifie l'objet de transformation à utiliser pour quantifier les coordonnées et encoder les arcs en delta dans la sortie TopoJSON. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite) { get; set; } | Détermine si les géométries doivent être validées lorsqu'elles sont ajoutées au calque. Si défini sur`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid)est appelée pour chaque géométrie lorsqu'elle est ajoutée à la couche, et si la validation échoue ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid) est`false` ),[`GisException`](../../aspose.gis/gisexception) est lancé. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines) { get; set; } | Détermine si la transformation d'un polygone ou d'un multipolygone en ligne est autorisée. Par défaut à`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel)qui sera appliqué aux coordonnées X et Y lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) qui sera appliqué à la coordonnée Z lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact) . |

### Voir également

* class [DriverOptions](../../aspose.gis/driveroptions)
* espace de noms [Aspose.Gis.Formats.TopoJson](../../aspose.gis.formats.topojson)
* Assemblée [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
