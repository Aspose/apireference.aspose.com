---
title: Class OsmXmlOptions
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.Formats.OsmXml.OsmXmlOptions classe. Options spécifiques au pilote pour le format OSM XML.
type: docs
weight: 630
url: /fr/net/aspose.gis.formats.osmxml/osmxmloptions/
---
## OsmXmlOptions class

Options spécifiques au pilote pour le format OSM XML.

```csharp
public class OsmXmlOptions : DriverOptions
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [OsmXmlOptions](osmxmloptions/)() | Créer une nouvelle instance. |

## Propriétés

| Nom | La description |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Détermine si fermer un non ferméLinearRing dans chaque géométrie. Par défaut à`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Détermine si ajouter un nouveau point au milieu à chaque segment de géométrie. Par défaut à`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Détermine si supprimer les points proches dans chaque géométrie. Par défaut à`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Détermine la distance pour[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Par défaut à`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Une tolérance à utiliser pour linéariser les géométries de courbe. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) qui sera appliqué à la coordonnée M lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer/) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer/) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ReportAllNodes](../../aspose.gis.formats.osmxml/osmxmloptions/reportallnodes/) { get; set; } | Signale tous les nœuds comme entités, même s'ils n'ont pas de balises significatives. |
| [ReportAllWays](../../aspose.gis.formats.osmxml/osmxmloptions/reportallways/) { get; set; } | Signalez tous les chemins comme des entités, même s'ils n'ont pas de balises significatives ou n'ont pas de nœuds. |
| [ReportCommonAttributes](../../aspose.gis.formats.osmxml/osmxmloptions/reportcommonattributes/) { get; set; } | Signaler les attributs OSM communs : visible, version, changeset, timestamp, user et uid. Les attributs communs seront signalés comme des attributs de fonctionnalité avec le préfixe "osm_", par exemple osm_user, osm_timestamp, etc. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Détermine si supprimer des points se trouvant sur le même segment dans chaque géométrie. Par défaut à`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Détermine la distance pour[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Par défaut à`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Détermine si les géométries doivent être validées lorsqu'elles sont ajoutées au calque. Si défini sur`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) est appelée pour chaque géométrie lorsqu'elle est ajoutée à la couche, et si la validation échoue ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) est`false` ),[`GisException`](../../aspose.gis/gisexception/) est lancé. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Détermine si la transformation d'un polygone ou d'un multipolygone en ligne est autorisée. Par défaut à`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) qui sera appliqué aux coordonnées X et Y lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer/) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer/) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) qui sera appliqué à la coordonnée Z lorsque des géométries seront ajoutées au[`VectorLayer`](../../aspose.gis/vectorlayer/) ou lorsqu'ils sont lus à partir du[`VectorLayer`](../../aspose.gis/vectorlayer/) . La valeur par défaut est[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Voir également

* class [DriverOptions](../../aspose.gis/driveroptions/)
* espace de noms [Aspose.Gis.Formats.OsmXml](../../aspose.gis.formats.osmxml/)
* Assemblée [Aspose.GIS](../../)


