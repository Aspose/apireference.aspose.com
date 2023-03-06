---
title: Class VerticalSpatialReferenceSystem
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.SpatialReferencing.VerticalSpatialReferenceSystem classe. Vertical SRS est un SRS unidimensionnel qui décrit les coordonnées de hauteur.
type: docs
weight: 2310
url: /fr/net/aspose.gis.spatialreferencing/verticalspatialreferencesystem/
---
## VerticalSpatialReferenceSystem class

Vertical SRS est un SRS unidimensionnel qui décrit les coordonnées de hauteur.

```csharp
public class VerticalSpatialReferenceSystem : SpatialReferenceSystem
```

## Propriétés

| Nom | La description |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Renvoie ce SRS converti en[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Utilisation[`IsCompound`](../spatialreferencesystem/iscompound/) pour savoir si la conversion est possible. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Renvoie ce SRS converti en[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Utilisation[`Type`](../spatialreferencesystem/type/) pour savoir si la conversion est possible. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Renvoie ce SRS converti en[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . Utilisation[`Type`](../spatialreferencesystem/type/) pour savoir si la conversion est possible. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Renvoie ce SRS converti en[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Utilisation[`Type`](../spatialreferencesystem/type/) pour savoir si la conversion est possible. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Renvoie ce SRS converti en[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . Utilisation[`Type`](../spatialreferencesystem/type/) pour savoir si la conversion est possible. |
| override [AsVertical](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/asvertical/) { get; } | Renvoie ce SRS. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/dimensionscount/) { get; } | Renvoie 1, car le SRS vertical est toujours unidimensionnel. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Si cet identifiant d'objet est un identifiant EPSG - retourne son code. Sinon - renvoie -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/geographicdatum/) { get; } | LancerInvalidOperationException , puisque Vertical SRS n'a pas de données géographiques. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasgeographicdatum/) { get; } | Retours`false` , puisque Vertical SRS n'a pas de données géographiques. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasprimemeridian/) { get; } | Retours`false` , puisque Vertical SRS n'a pas de méridien principal. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identifiant de cet objet identifiable. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Renvoie si ce SRS est composé (une union de deux SRS). Les combinaisons suivantes de SRS dans un SRS composé sont considérées comme valides : SRS géographique + SRS vertical, dans ce cas, le type de SRS composé seraGeographic . SRS projeté + SRS vertical, dans ce cas le type de SRS composé seraProjected . Si la combinaison de SRS diffère, le type de SRS composé seraUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Renvoie si ce SRS est unique (pas une union de deux SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Identique à[`Validate`](../spatialreferencesystem/validate/) , mais ne renvoie pas de message d'erreur. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nom de cet objet. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/primemeridian/) { get; } | LancerInvalidOperationException , puisque Vertical SRS n'a pas de méridien principal. |
| override [Type](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/type/) { get; } | RetourVertical . |
| [VerticalDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticaldatum/) { get; } | Datum utilisé dans ce SRS. |
| [VerticalUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticalunit/) { get; } | Unité utilisée dans ce SRS. |

## Méthodes

| Nom | La description |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Crée une transformation à partir de ceci`Système de référence spatiale` à un autre`Système de référence spatiale` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Renvoie la représentation de ce SRS sous forme de chaîne WKT. La chaîne WKT résultante correspondra à la spécification OGC 01-009, généralement nommée "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getaxis/)(int) | Obtenir[`Axis`](../axis/) qui décrit la dimension. |
| override [GetUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getunit/)(int) | Obtenir[`Unit`](../unit/)de dimension. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Détecte si ce SRS est équivalent à un autre SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Retourne une chaîne qui représente l'objet actuel. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Crée une transformation à partir de ceci`Système de référence spatiale` à un autre`Système de référence spatiale` . |
| override [Validate](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/validate/)(out string) | Déterminez si ce SRS est valide. Voir[`Validate`](../spatialreferencesystem/validate/) pour la description de la validité. |

### Voir également

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* espace de noms [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* Assemblée [Aspose.GIS](../../)


