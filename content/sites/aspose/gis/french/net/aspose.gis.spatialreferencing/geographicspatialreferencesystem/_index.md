---
title: GeographicSpatialReferenceSystem
second_title: Référence de l'API Aspose.GIS pour .NET
description: Un SRS géographique est un SRS basé sur la longitude et la latitude. Un SRS géographique peut être bidimensionnel ou tridimensionnel. Si le SRS géographique est tridimensionnel il sagit en fait dun SRS composé de SRS bidimensionnel et de SRS vertical.
type: docs
weight: 2030
url: /fr/net/aspose.gis.spatialreferencing/geographicspatialreferencesystem/
---
## GeographicSpatialReferenceSystem class

Un SRS géographique est un SRS basé sur la longitude et la latitude. Un SRS géographique peut être bidimensionnel ou tridimensionnel. Si le SRS géographique est tridimensionnel, il s'agit en fait d'un SRS composé de SRS bidimensionnel et de SRS vertical.

```csharp
public abstract class GeographicSpatialReferenceSystem : SpatialReferenceSystem
```

## Propriétés

| Nom | La description |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/angularunit) { get; } | Unité, utilisée pour les dimensions angulaires, dans ce SRS. |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Renvoie ce SRS converti en[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . Utilisation[`IsCompound`](../spatialreferencesystem/iscompound) pour savoir si la conversion est possible. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Renvoie ce SRS converti en[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . Utilisation[`Type`](../spatialreferencesystem/type) pour savoir si la conversion est possible. |
| [AsGeographic](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/asgeographic) { get; } | Renvoie ceci. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Renvoie ce SRS converti en[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . Utilisation[`Type`](../spatialreferencesystem/type) pour savoir si la conversion est possible. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Renvoie ce SRS converti en[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . Utilisation[`Type`](../spatialreferencesystem/type) pour savoir si la conversion est possible. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Renvoie ce SRS converti en[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . Utilisation[`Type`](../spatialreferencesystem/type) pour savoir si la conversion est possible. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/axisesorder) { get; } | Ordre des axes dans ce SRS. Si ce SRS n'est pas valide et a de mauvaises directions d'axes,Invalid est renvoyé. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/dimensionscount) { get; } | Renvoie le nombre de dimensions dans ce SRS. Pour un SRS géographique, cela peut être : deux - s'il s'agit d'un SRS géographique unique. trois - s'il s'agit d'un SRS composé, qui se compose d'un SRS géographique à deux dimensions et d'un SRS vertical, qui ajoute une troisième dimension. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Si cet identifiant d'objet est un identifiant EPSG - retourne son code. Sinon - renvoie -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum) { get; } | Renvoie la donnée géographique de ce SRS. |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasgeographicdatum) { get; } | Retours`true` , puisque les SRS géographiques ont toujours le premier méridien. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasprimemeridian) { get; } | Retours`true` , puisque les SRS géographiques ont toujours le premier méridien. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Identifiant de cet objet identifiable. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Renvoie si ce SRS est composé (une union de deux SRS). Les combinaisons suivantes de SRS dans un SRS composé sont considérées comme valides : SRS géographique + SRS vertical, dans ce cas, le type de SRS composé seraGeographic . SRS projeté + SRS vertical, dans ce cas le type de SRS composé seraProjected . Si la combinaison de SRS diffère, le type de SRS composé seraUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Renvoie si ce SRS est unique (pas une union de deux SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Identique à[`Validate`](../spatialreferencesystem/validate) , mais ne renvoie pas de message d'erreur. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Nom de cet objet. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian) { get; } | Renvoie le premier méridien de ce SRS. |
| [Type](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/type) { get; } | RetoursGeographic . |

## Méthodes

| Nom | La description |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Crée une transformation à partir de ceci`Système de référence spatiale` à un autre`Système de référence spatiale` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Renvoie la représentation de ce SRS sous forme de chaîne WKT. La chaîne WKT résultante correspondra à la spécification OGC 01-009, généralement nommée "WKT1". |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis)(int) | Obtenir[`Axis`](../axis) qui décrit la dimension. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit)(int) | Obtenir[`Unit`](../unit)de dimension. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Détecte si ce SRS est équivalent à un autre SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Retourne une chaîne qui représente l'objet actuel. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Crée une transformation à partir de ceci`Système de référence spatiale` à un autre`Système de référence spatiale` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate)(out string) | Déterminez si ce SRS est valide. |

### Voir également

* class [SpatialReferenceSystem](../spatialreferencesystem)
* espace de noms [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* Assemblée [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
