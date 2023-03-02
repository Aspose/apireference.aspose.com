---
title: Class GpxOptions
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.Formats.Gpx.GpxOptions classe. Options spécifiques au pilote pour le format GPX.
type: docs
weight: 370
url: /fr/net/aspose.gis.formats.gpx/gpxoptions/
---
## GpxOptions class

Options spécifiques au pilote pour le format GPX.

```csharp
public class GpxOptions : DriverOptions
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [GpxOptions](gpxoptions/)() | Créer une nouvelle instance. |

## Propriétés

| Nom | La description |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Détermine si fermer un non ferméLinearRing dans chaque géométrie. Par défaut à`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Détermine si ajouter un nouveau point au milieu à chaque segment de géométrie. Par défaut à`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Détermine si supprimer les points proches dans chaque géométrie. Par défaut à`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Détermine la distance pour[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Par défaut à`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Une tolérance à utiliser pour linéariser les géométries de courbe. |
| [MAttribute](../../aspose.gis.formats.gpx/gpxoptions/mattribute/) { get; set; } | Détermine quel attribut GPX sera exporté en tant que coordonnée "M" des waypoints, des points de route et des points de suivi. Le comportement est le même avec[`ZAttribute`](./zattribute/) , par défaut à`null` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) qui sera appliqué à la coordonnée M lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer/) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer/) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedAttributeSeparator](../../aspose.gis.formats.gpx/gpxoptions/nestedattributeseparator/) { get; } | Une chaîne pour séparer le nom de l'attribut imbriqué et ses index. Par défaut, le double trait de soulignement "__". |
| [ReadNestedAttributes](../../aspose.gis.formats.gpx/gpxoptions/readnestedattributes/) { get; set; } | Détermine si les points GPX, tels que 'trkpt' et 'rtept', contiennent des attributs internes et s'ils doivent être lus. Par défaut à`false` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Détermine si supprimer des points se trouvant sur le même segment dans chaque géométrie. Par défaut à`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Détermine la distance pour[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Par défaut à`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Détermine si les géométries doivent être validées lorsqu'elles sont ajoutées au calque. Si défini sur`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) est appelée pour chaque géométrie lorsqu'elle est ajoutée à la couche, et si la validation échoue ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) est`false` ),[`GisException`](../../aspose.gis/gisexception/) est lancé. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Détermine si la transformation d'un polygone ou d'un multipolygone en ligne est autorisée. Par défaut à`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) qui sera appliqué aux coordonnées X et Y lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer/) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer/) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZAttribute](../../aspose.gis.formats.gpx/gpxoptions/zattribute/) { get; set; } | Détermine quel attribut GPX sera exporté en tant que coordonnée 'Z' des waypoints, des points de route et des points de trace. Si`null` aucun attribut ne sera exporté en tant que coordonnée 'Z'. La valeur par défaut est "ele". Les valeurs possibles sont les noms de tous les attributs XML GPX qui peuvent être représentés en double (par exemple "speed", "magvar", "geoidheight" etc. ) |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) qui sera appliqué à la coordonnée Z lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer/) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer/) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Voir également

* class [DriverOptions](../../aspose.gis/driveroptions/)
* espace de noms [Aspose.Gis.Formats.Gpx](../../aspose.gis.formats.gpx/)
* Assemblée [Aspose.GIS](../../)


