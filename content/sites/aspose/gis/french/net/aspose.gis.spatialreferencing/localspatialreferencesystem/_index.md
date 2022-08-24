---
title: LocalSpatialReferenceSystem
second_title: Référence de l'API Aspose.GIS pour .NET
description: Coordonnées locales liées au SRS à un objet pas à la terre.
type: docs
weight: 2080
url: /fr/net/aspose.gis.spatialreferencing/localspatialreferencesystem/
---
## LocalSpatialReferenceSystem class

Coordonnées locales liées au SRS à un objet, pas à la terre.

```csharp
public class LocalSpatialReferenceSystem : SpatialReferenceSystem
```

## Propriétés

| Nom | La description |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Renvoie ce SRS converti en[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . Utilisation[`IsCompound`](../spatialreferencesystem/iscompound) pour savoir si la conversion est possible. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Renvoie ce SRS converti en[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . Utilisation[`Type`](../spatialreferencesystem/type) pour savoir si la conversion est possible. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Renvoie ce SRS converti en[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . Utilisation[`Type`](../spatialreferencesystem/type) pour savoir si la conversion est possible. |
| override [AsLocal](../../aspose.gis.spatialreferencing/localspatialreferencesystem/aslocal) { get; } | Renvoyez ceci. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Renvoie ce SRS converti en[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . Utilisation[`Type`](../spatialreferencesystem/type) pour savoir si la conversion est possible. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Renvoie ce SRS converti en[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . Utilisation[`Type`](../spatialreferencesystem/type) pour savoir si la conversion est possible. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/localspatialreferencesystem/dimensionscount) { get; } | Nombre de dimensions dans ce SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Si cet identifiant d'objet est un identifiant EPSG - retourne son code. Sinon - renvoie -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/geographicdatum) { get; } | LancerInvalidOperationException puisque le SRS local n'a pas de données géographiques. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasgeographicdatum) { get; } | Retours`false` puisque le SRS local n'a pas de données géographiques. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasprimemeridian) { get; } | Retours`false` , puisque le SRS local n'a pas de méridien principal. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Identifiant de cet objet identifiable. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Renvoie si ce SRS est composé (une union de deux SRS). Les combinaisons suivantes de SRS dans un SRS composé sont considérées comme valides : SRS géographique + SRS vertical, dans ce cas, le type de SRS composé seraGeographic . SRS projeté + SRS vertical, dans ce cas le type de SRS composé seraProjected . Si la combinaison de SRS diffère, le type de SRS composé seraUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Renvoie si ce SRS est unique (pas une union de deux SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Identique à[`Validate`](../spatialreferencesystem/validate) , mais ne renvoie pas de message d'erreur. |
| [LocalDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/localdatum) { get; } | Datum, qui décrit la méthode de mesure. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Nom de cet objet. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/primemeridian) { get; } | LancerInvalidOperationException , puisque le SRS local n'a pas de méridien principal. |
| override [Type](../../aspose.gis.spatialreferencing/localspatialreferencesystem/type) { get; } | RetourLocal . |
| [Unit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/unit) { get; } | Unité de ce SRS. |

## Méthodes

| Nom | La description |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Crée une transformation à partir de ceci`Système de référence spatiale` à un autre`Système de référence spatiale` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Renvoie la représentation de ce SRS sous forme de chaîne WKT. La chaîne WKT résultante correspondra à la spécification OGC 01-009, généralement nommée "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getaxis)(int) | Obtenir[`Axis`](../axis) qui décrit la dimension. |
| override [GetUnit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getunit)(int) | Obtenir[`Unit`](./unit)de dimension. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/localspatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Détecte si ce SRS est équivalent à un autre SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Retourne une chaîne qui représente l'objet actuel. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Crée une transformation à partir de ceci`Système de référence spatiale` à un autre`Système de référence spatiale` . |
| override [Validate](../../aspose.gis.spatialreferencing/localspatialreferencesystem/validate)(out string) | Déterminez si ce SRS est valide. Voir[`Validate`](../spatialreferencesystem/validate) pour la description de la validité. |

### Voir également

* class [SpatialReferenceSystem](../spatialreferencesystem)
* espace de noms [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* Assemblée [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
