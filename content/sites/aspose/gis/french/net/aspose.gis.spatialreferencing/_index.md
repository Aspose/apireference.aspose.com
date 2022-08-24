---
title: Aspose.Gis.SpatialReferencing
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.SpatialReferencing namespace fournit des classes pour travailler avec des références spatiales systèmes de référence de coordonnées.
type: docs
weight: 330
url: /fr/net/aspose.gis.spatialreferencing/
---
`Aspose.Gis.SpatialReferencing` namespace fournit des classes pour travailler avec des références spatiales (systèmes de référence de coordonnées).

## Des classes

| Classer | La description |
| --- | --- |
| [Axis](./axis) | Un axe décrit une dimension de SRS. |
| [BursaWolfParameters](./bursawolfparameters) | Classe contenant les paramètres de la formule Bursa-Wolf à transformer en une autre donnée. |
| [CompoundSpatialReferenceSystem](./compoundspatialreferencesystem) | Le SRS composé réunit deux SRS sous-jacents, dont aucun ne peut être composé. |
| [Ellipsoid](./ellipsoid) | Ellipsoïde représente un ellipsoïde, qui se rapproche de la terre. |
| [GeocentricSpatialReferenceSystem](./geocentricspatialreferencesystem) | Le SRS géocentrique est un SRS cartésien tridimensionnel dont l'origine est au centre de la Terre. |
| [GeocentricSpatialReferenceSystemParameters](./geocentricspatialreferencesystemparameters) | Paramètres pour créer un SRS géocentrique. Les paramètres ont des valeurs par défaut raisonnables, vous ne devrez donc en affecter que certains. Si vous affectez`null` à n'importe quel paramètre, une valeur par défaut sera utilisée. |
| [GeographicDatum](./geographicdatum) | Les données géographiques relient la longitude et la latitude à un endroit particulier sur terre. |
| [GeographicSpatialReferenceSystem](./geographicspatialreferencesystem) | Un SRS géographique est un SRS basé sur la longitude et la latitude. Un SRS géographique peut être bidimensionnel ou tridimensionnel. Si le SRS géographique est tridimensionnel, il s'agit en fait d'un SRS composé de SRS bidimensionnel et de SRS vertical. |
| [GeographicSpatialReferenceSystemParameters](./geographicspatialreferencesystemparameters) | Paramètres pour créer un SRS géographique. Les paramètres ont des valeurs par défaut raisonnables, vous ne devrez donc en affecter que certains. Si vous affectez`null` à n'importe quel paramètre, une valeur par défaut sera utilisée. |
| [IdentifiableObject](./identifiableobject) | Représente un objet pouvant avoir un code et un nom EPSG. |
| [Identifier](./identifier) | Représente un identifiant - une référence à la description externe d'un objet. Si vous créez un SRS à partir de WKT,[`Identifier`](../aspose.gis.spatialreferencing/identifier) correspond au mot clé "AUTORITY". |
| [LocalDatum](./localdatum) | Indique la méthode utilisée pour les mesures dans le système de référence spatiale local. |
| [LocalSpatialReferenceSystem](./localspatialreferencesystem) | Coordonnées locales liées au SRS à un objet, pas à la terre. |
| [PrimeMeridian](./primemeridian) | PrimeMeridian représente un méridien auquel la longitude est définie comme étant 0. |
| [ProjectedSpatialReferenceSystem](./projectedspatialreferencesystem) | Le SRS projeté est le résultat de l'application d'une projection à un SRS géographique. Un SRS projeté peut être bidimensionnel ou tridimensionnel. Si le SRS projeté est tridimensionnel, il s'agit en fait d'un SRS composé de SRS projeté bidimensionnel et d'un vertical unidimensionnel. SRS. |
| [ProjectedSpatialReferenceSystemParameters](./projectedspatialreferencesystemparameters) | Paramètres pour créer le SRS projeté. Certains paramètres ont des valeurs par défaut. Certains paramètres ont des valeurs par défaut raisonnables, vous n'avez donc pas à les affecter uniquement. Si vous affectez`null` à ces paramètres, une valeur par défaut sera utilisée. [`ProjectionMethodName`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname) et[`Base`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base) n'ont pas de valeurs par défaut - vous devez attribuer des non`null` valeur à ces propriétés. |
| [Projection](./projection) | Représente une méthode de projection avec des paramètres, qui transforme (longitude, latitude) en (x, y). |
| [SpatialReferenceSystem](./spatialreferencesystem) | Le système de référence spatiale cartographie les coordonnées des lieux sur Terre. Il existe différents types de SRS, voir[`Type`](../aspose.gis.spatialreferencing/spatialreferencesystem/type) . De plus, si le type de SRS estGeographic ou Projected SRS peut être composé ou simple, voir[`IsCompound`](../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) . |
| [SpatialReferenceSystemTransformation](./spatialreferencesystemtransformation) | La transformation du système de référence spatiale transforme les géométries du système de référence spatiale source en système de référence spatiale cible. |
| [TransformationException](./transformationexception) | L'exception de transformation est levée lorsqu'une erreur se produit lors de la transformation de la coordonnée ou lors de la création de la transformation. |
| [Unit](./unit) | Représente l'unité de mesure. |
| [VerticalDatum](./verticaldatum) | Indique la méthode utilisée pour les mesures verticales. |
| [VerticalSpatialReferenceSystem](./verticalspatialreferencesystem) | Vertical SRS est un SRS unidimensionnel qui décrit les coordonnées de hauteur. |
## Énumération

| Énumération | La description |
| --- | --- |
| [AxisDirection](./axisdirection) | Axis direction définit la direction dans laquelle l'axe pointe. |
| [GeocentricAxisesOrder](./geocentricaxisesorder) | Représente l'ordre des axes dans SRS géocentrique. |
| [GeographicAxisesOrder](./geographicaxisesorder) | Représente l'ordre des axes dans le SRS géographique. |
| [ParameterType](./parametertype) | Détermine le type de paramètre dans[`Projection`](../aspose.gis.spatialreferencing/projection) . |
| [ProjectedAxisesOrder](./projectedaxisesorder) | Représente l'ordre des axes dans le SRS géographique. |
| [SpatialReferenceSystemType](./spatialreferencesystemtype) | Représente le type de système de référence spatiale. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
