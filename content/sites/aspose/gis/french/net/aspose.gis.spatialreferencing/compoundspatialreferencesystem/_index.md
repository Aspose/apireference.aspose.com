---
title: CompoundSpatialReferenceSystem
second_title: Référence de l'API Aspose.GIS pour .NET
description: Le SRS composé réunit deux SRS sousjacents dont aucun ne peut être composé.
type: docs
weight: 1960
url: /fr/net/aspose.gis.spatialreferencing/compoundspatialreferencesystem/
---
## CompoundSpatialReferenceSystem class

Le SRS composé réunit deux SRS sous-jacents, dont aucun ne peut être composé.

```csharp
public class CompoundSpatialReferenceSystem : SpatialReferenceSystem
```

## Propriétés

| Nom | La description |
| --- | --- |
| override [AsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/ascompound) { get; } | Renvoyez ceci. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Renvoie ce SRS converti en[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . Utilisation[`Type`](../spatialreferencesystem/type) pour savoir si la conversion est possible. |
| override [AsGeographic](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asgeographic) { get; } | Renvoie la représentation géographique de ce SRS. Si ce SRS composé représente effectivement un SRS géographique, le résultat sera un SRS géographique tridimensionnel (avec des dimensions de longitude, latitude, hauteur). Sinon, une exception sera levée. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Renvoie ce SRS converti en[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . Utilisation[`Type`](../spatialreferencesystem/type) pour savoir si la conversion est possible. |
| override [AsProjected](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asprojected) { get; } | Renvoie la représentation projetée de ce SRS. Si ce SRS composé représente effectivement un SRS projeté, le résultat sera un SRS projeté en trois dimensions (avec X, Y, dimensions de hauteur). Sinon, une exception sera levée. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Renvoie ce SRS converti en[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . Utilisation[`Type`](../spatialreferencesystem/type) pour savoir si la conversion est possible. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/dimensionscount) { get; } | Nombre de dimensions. Pour le SRS composé, il s'agit de la somme du nombre de dimensions du SRS sous-jacent. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Si cet identifiant d'objet est un identifiant EPSG - retourne son code. Sinon - renvoie -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/geographicdatum) { get; } | Renvoie le datum géographique de ce SRS. Si les deux[`Head`](./head) et[`Tail`](./tail) avoir un datum géographique - renvoie le datum géographique de la tête. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasgeographicdatum) { get; } | Les SRS composés ont un datum géographique si l'un des SRS sous-jacents a un datum géographique. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasprimemeridian) { get; } | Le SRS composé a un méridien principal si l'un des SRS sous-jacents a un méridien principal. |
| [Head](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/head) { get; } | Premier SRS sous-jacent. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Identifiant de cet objet identifiable. |
| override [IsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/iscompound) { get; } | Retours`true` . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Renvoie si ce SRS est unique (pas une union de deux SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Identique à[`Validate`](../spatialreferencesystem/validate) , mais ne renvoie pas de message d'erreur. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Nom de cet objet. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/primemeridian) { get; } | Renvoie le premier méridien de ce SRS. Si les deux[`Head`](./head) et[`Tail`](./tail) avoir le méridien principal - renvoyer le méridien principal de la tête. |
| [Tail](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/tail) { get; } | Deuxième SRS sous-jacent. |
| override [Type](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/type) { get; } | Type de ce SRS composé. Peut êtreGeographicif ce SRS composé est une combinaison de SRS géographique et vertical, ouProjected if ce SRS composé est une combinaison de SRS projeté et vertical. |

## Méthodes

| Nom | La description |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Crée une transformation à partir de ceci`Système de référence spatiale` à un autre`Système de référence spatiale` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Renvoie la représentation de ce SRS sous forme de chaîne WKT. La chaîne WKT résultante correspondra à la spécification OGC 01-009, généralement nommée "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getaxis)(int) | Obtenir[`Axis`](../axis) qui décrit la dimension. |
| override [GetUnit](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getunit)(int) | Obtenir[`Unit`](../unit)de dimension. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Détecte si ce SRS est équivalent à un autre SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Retourne une chaîne qui représente l'objet actuel. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Crée une transformation à partir de ceci`Système de référence spatiale` à un autre`Système de référence spatiale` . |
| override [Validate](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/validate)(out string) | Déterminez si ce SRS est valide. Voir[`Validate`](../spatialreferencesystem/validate) pour la description de la validité. |

### Voir également

* class [SpatialReferenceSystem](../spatialreferencesystem)
* espace de noms [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* Assemblée [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
