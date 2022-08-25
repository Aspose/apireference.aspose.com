---
title: GeocentricSpatialReferenceSystem
second_title: Référence de l'API Aspose.GIS pour .NET
description: Le SRS géocentrique est un SRS cartésien tridimensionnel dont lorigine est au centre de la Terre.
type: docs
weight: 1990
url: /fr/net/aspose.gis.spatialreferencing/geocentricspatialreferencesystem/
---
## GeocentricSpatialReferenceSystem class

Le SRS géocentrique est un SRS cartésien tridimensionnel dont l'origine est au centre de la Terre.

```csharp
public class GeocentricSpatialReferenceSystem : SpatialReferenceSystem
```

## Propriétés

| Nom | La description |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Renvoie ce SRS converti en[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . Utilisation[`IsCompound`](../spatialreferencesystem/iscompound) pour savoir si la conversion est possible. |
| override [AsGeocentric](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/asgeocentric) { get; } | Renvoyez ceci. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Renvoie ce SRS converti en[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . Utilisation[`Type`](../spatialreferencesystem/type) pour savoir si la conversion est possible. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Renvoie ce SRS converti en[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . Utilisation[`Type`](../spatialreferencesystem/type) pour savoir si la conversion est possible. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Renvoie ce SRS converti en[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . Utilisation[`Type`](../spatialreferencesystem/type) pour savoir si la conversion est possible. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Renvoie ce SRS converti en[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . Utilisation[`Type`](../spatialreferencesystem/type) pour savoir si la conversion est possible. |
| [AxisesOrder](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/axisesorder) { get; } | Ordre des axes dans ce SRS. Si ce SRS n'est pas valide et a de mauvaises directions d'axes,Invalid est renvoyé. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/dimensionscount) { get; } | Renvoie 3, puisque le SRS géocentrique est toujours en trois dimensions. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Si cet identifiant d'objet est un identifiant EPSG - retourne son code. Sinon - renvoie -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/geographicdatum) { get; } | Renvoie la donnée géographique de ce SRS. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasgeographicdatum) { get; } | Retour`true` , puisque les SRS géocentriques ont toujours des données géographiques. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasprimemeridian) { get; } | Retour`true` , puisque les SRS géocentriques ont toujours le premier méridien. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Identifiant de cet objet identifiable. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Renvoie si ce SRS est composé (une union de deux SRS). Les combinaisons suivantes de SRS dans un SRS composé sont considérées comme valides : SRS géographique + SRS vertical, dans ce cas, le type de SRS composé seraGeographic . SRS projeté + SRS vertical, dans ce cas le type de SRS composé seraProjected . Si la combinaison de SRS diffère, le type de SRS composé seraUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Renvoie si ce SRS est unique (pas une union de deux SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Identique à[`Validate`](../spatialreferencesystem/validate) , mais ne renvoie pas de message d'erreur. |
| [LinearUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/linearunit) { get; } | Unité, utilisée dans ce SRS. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Nom de cet objet. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/primemeridian) { get; } | Renvoie le premier méridien de ce SRS. |
| override [Type](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/type) { get; } | RetourGeocentric . |

## Méthodes

| Nom | La description |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Crée une transformation à partir de ceci`Système de référence spatiale` à un autre`Système de référence spatiale` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Renvoie la représentation de ce SRS sous forme de chaîne WKT. La chaîne WKT résultante correspondra à la spécification OGC 01-009, généralement nommée "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getaxis)(int) | Obtenir[`Axis`](../axis) qui décrit la dimension. |
| override [GetUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getunit)(int) | Obtenir[`Unit`](../unit)de dimension. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Détecte si ce SRS est équivalent à un autre SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Retourne une chaîne qui représente l'objet actuel. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Crée une transformation à partir de ceci`Système de référence spatiale` à un autre`Système de référence spatiale` . |
| override [Validate](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/validate)(out string) | Déterminez si ce SRS est valide. Voir[`Validate`](../spatialreferencesystem/validate) pour la description de la validité. |

### Voir également

* class [SpatialReferenceSystem](../spatialreferencesystem)
* espace de noms [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* Assemblée [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
