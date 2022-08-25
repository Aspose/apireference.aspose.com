---
title: ProjectedSpatialReferenceSystem
second_title: Référence de l'API Aspose.GIS pour .NET
description: Le SRS projeté est le résultat de lapplication dune projection à un SRS géographique. Un SRS projeté peut être bidimensionnel ou tridimensionnel. Si le SRS projeté est tridimensionnel il sagit en fait dun SRS composé de SRS projeté bidimensionnel et dun vertical unidimensionnel. SRS.
type: docs
weight: 2120
url: /fr/net/aspose.gis.spatialreferencing/projectedspatialreferencesystem/
---
## ProjectedSpatialReferenceSystem class

Le SRS projeté est le résultat de l'application d'une projection à un SRS géographique. Un SRS projeté peut être bidimensionnel ou tridimensionnel. Si le SRS projeté est tridimensionnel, il s'agit en fait d'un SRS composé de SRS projeté bidimensionnel et d'un vertical unidimensionnel. SRS.

```csharp
public abstract class ProjectedSpatialReferenceSystem : SpatialReferenceSystem
```

## Propriétés

| Nom | La description |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/angularunit) { get; } | Unité, qui est utilisée pour les valeurs angulaires dans ce SRS et pour les paramètres angulaires de[`Projection`](./projection) . Correspond à l'unité angulaire de[`Base`](./base) . |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Renvoie ce SRS converti en[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . Utilisation[`IsCompound`](../spatialreferencesystem/iscompound) pour savoir si la conversion est possible. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Renvoie ce SRS converti en[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . Utilisation[`Type`](../spatialreferencesystem/type) pour savoir si la conversion est possible. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Renvoie ce SRS converti en[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . Utilisation[`Type`](../spatialreferencesystem/type) pour savoir si la conversion est possible. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Renvoie ce SRS converti en[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . Utilisation[`Type`](../spatialreferencesystem/type) pour savoir si la conversion est possible. |
| [AsProjected](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/asprojected) { get; } | Renvoyez ceci. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Renvoie ce SRS converti en[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . Utilisation[`Type`](../spatialreferencesystem/type) pour savoir si la conversion est possible. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/axisesorder) { get; } | Ordre des axes dans ce SRS. Si ce SRS n'est pas valide et a de mauvaises directions d'axes,Invalid est renvoyé. |
| abstract [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/base) { get; } | SRS géographique auquel[`Projection`](./projection) a été appliqué pour obtenir ce SRS. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/dimensionscount) { get; } | Renvoie le nombre de dimensions dans ce SRS. Pour le SRS projeté, cela peut être : deux - s'il s'agit d'un SRS projeté unique. trois - s'il s'agit d'un SRS composé, qui se compose d'un SRS projeté à deux dimensions et d'un SRS vertical, qui ajoute une troisième dimension. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Si cet identifiant d'objet est un identifiant EPSG - retourne son code. Sinon - renvoie -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum) { get; } | Renvoie la donnée géographique de ce SRS. |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasgeographicdatum) { get; } | Renvoie vrai, puisque le SRS projeté a toujours le méridien principal. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasprimemeridian) { get; } | Renvoie vrai, puisque le SRS projeté a toujours le méridien principal. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Identifiant de cet objet identifiable. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Renvoie si ce SRS est composé (une union de deux SRS). Les combinaisons suivantes de SRS dans un SRS composé sont considérées comme valides : SRS géographique + SRS vertical, dans ce cas, le type de SRS composé seraGeographic . SRS projeté + SRS vertical, dans ce cas le type de SRS composé seraProjected . Si la combinaison de SRS diffère, le type de SRS composé seraUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Renvoie si ce SRS est unique (pas une union de deux SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Identique à[`Validate`](../spatialreferencesystem/validate) , mais ne renvoie pas de message d'erreur. |
| abstract [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/linearunit) { get; } | Unité, qui est utilisée pour les dimensions linéaires dans ce SRS et pour les paramètres linéaires de[`Projection`](./projection) . |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Nom de cet objet. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian) { get; } | Renvoie le premier méridien de ce SRS. |
| abstract [Projection](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/projection) { get; } | Projection, qui a été appliquée à[`Base`](./base) pour obtenir ce SRS. |
| [Type](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/type) { get; } | RetoursProjected . |

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
