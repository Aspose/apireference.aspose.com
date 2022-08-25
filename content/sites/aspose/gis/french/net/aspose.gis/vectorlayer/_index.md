---
title: VectorLayer
second_title: Référence de l'API Aspose.GIS pour .NET
description: Représente une couche vectorielle. Une couche vectorielle est un ensemble dentités géographiques stockées dans un fichier.
type: docs
weight: 2220
url: /fr/net/aspose.gis/vectorlayer/
---
## VectorLayer class

Représente une couche vectorielle. Une couche vectorielle est un ensemble d'entités géographiques, stockées dans un fichier.

```csharp
public abstract class VectorLayer : FeaturesSequence, IDisposable
```

## Propriétés

| Nom | La description |
| --- | --- |
| override [Attributes](../../aspose.gis/vectorlayer/attributes) { get; } | Obtient la collection d'attributs personnalisés pour les fonctionnalités de ce[`VectorLayer`](../vectorlayer) . |
| virtual [Count](../../aspose.gis/vectorlayer/count) { get; } | Obtient le nombre d'entités dans cette couche. |
| abstract [Driver](../../aspose.gis/vectorlayer/driver) { get; } | Obtient le[`Driver`](./driver) qui a instancié cette couche. |
| abstract [GeometryType](../../aspose.gis/vectorlayer/geometrytype) { get; } | Obtient le type de géométrie pour le calque. |
| virtual [Item](../../aspose.gis/vectorlayer/item) { get; } | Obtient le[`Feature`](../feature) à l'index spécifié. |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem) { get; } | Obtient le système de référence spatiale de cette séquence d'entités. |

## Méthodes

| Nom | La description |
| --- | --- |
| static [Create](../../aspose.gis/vectorlayer/create#create)(AbstractPath, FileDriver) | Crée la couche et l'ouvre pour ajouter de nouvelles fonctionnalités. |
| static [Create](../../aspose.gis/vectorlayer/create#create_4)(string, FileDriver) | Crée la couche et l'ouvre pour ajouter de nouvelles fonctionnalités. |
| static [Create](../../aspose.gis/vectorlayer/create#create_1)(AbstractPath, FileDriver, DriverOptions) | Crée la couche et l'ouvre pour ajouter de nouvelles fonctionnalités. |
| static [Create](../../aspose.gis/vectorlayer/create#create_3)(AbstractPath, FileDriver, SpatialReferenceSystem) | Crée le calque et l'ouvre pour l'ajout. |
| static [Create](../../aspose.gis/vectorlayer/create#create_5)(string, FileDriver, DriverOptions) | Crée la couche et l'ouvre pour ajouter de nouvelles fonctionnalités. |
| static [Create](../../aspose.gis/vectorlayer/create#create_7)(string, FileDriver, SpatialReferenceSystem) | Crée le calque et l'ouvre pour l'ajout. |
| static [Create](../../aspose.gis/vectorlayer/create#create_2)(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) | Crée le calque et l'ouvre pour l'ajout. |
| static [Create](../../aspose.gis/vectorlayer/create#create_6)(string, FileDriver, DriverOptions, SpatialReferenceSystem) | Crée le calque et l'ouvre pour l'ajout. |
| static [Open](../../aspose.gis/vectorlayer/open#open)(AbstractPath, FileDriver) | Ouvrir le calque pour la lecture. |
| static [Open](../../aspose.gis/vectorlayer/open#open_2)(string, FileDriver) | Ouvrir le calque pour la lecture. |
| static [Open](../../aspose.gis/vectorlayer/open#open_1)(AbstractPath, FileDriver, DriverOptions) | Ouvrir le calque pour la lecture. |
| static [Open](../../aspose.gis/vectorlayer/open#open_3)(string, FileDriver, DriverOptions) | Ouvrir le calque pour la lecture. |
| [Add](../../aspose.gis/vectorlayer/add#add)(Feature) | Ajoute une nouvelle fonctionnalité à la couche, si elle est prise en charge par le[`VectorLayer`](../vectorlayer) s[`Driver`](./driver) . |
| virtual [Add](../../aspose.gis/vectorlayer/add#add_1)(Feature, IFeatureStyle) | Ajoute une nouvelle entité avec le style spécifié au calque, si pris en charge par le[`VectorLayer`](../vectorlayer) s[`Driver`](./driver) . |
| [ConstructFeature](../../aspose.gis/vectorlayer/constructfeature)() | Crée (mais n'ajoute pas à la couche) une nouvelle entité avec des attributs correspondant à la collection d'attributs de cette couche. Lorsque vous avez terminé avec la définition des données pour l'entité, utilisez[`Add`](./add) pour ajouter l'entité à la couche. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes#copyattributes)(FeaturesSequence) | Copie les attributs d'autres[`VectorLayer`](../vectorlayer) à celui-ci. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes#copyattributes_1)(FeaturesSequence, IAttributesConverter) | Copie les attributs d'autres[`VectorLayer`](../vectorlayer) à celui-ci. |
| [Dispose](../../aspose.gis/vectorlayer/dispose)() | Libère les ressources utilisées par le[`VectorLayer`](../vectorlayer) . |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator)() | Renvoie un énumérateur qui parcourt la collection. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent)() | Obtient une étendue spatiale de cette couche. |
| [Join](../../aspose.gis/vectorlayer/join)(VectorLayer, JoinOptions) | Joint un calque au calque actuel. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto#nearestto)(IPoint) | Obtient l'entité la plus proche du point fourni. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto#nearestto_1)(double, double) | Obtient l'entité la plus proche des coordonnées fournies. |
| virtual [RemoveAt](../../aspose.gis/vectorlayer/removeat)(int) | Supprimer le[`Feature`](../feature) à l'index spécifié. |
| virtual [ReplaceAt](../../aspose.gis/vectorlayer/replaceat)(int, Feature) | Remplacez le[`Feature`](../feature) à l'index spécifié. |
| [SaveTo](../../aspose.gis/featuressequence/saveto)(AbstractPath, FileDriver) | Enregistre la séquence d'entités dans la couche. |
| [SaveTo](../../aspose.gis/featuressequence/saveto)(string, FileDriver) | Enregistre la séquence d'entités dans la couche. |
| [SaveTo](../../aspose.gis/featuressequence/saveto)(AbstractPath, FileDriver, SavingOptions) | Enregistre la séquence d'entités dans la couche. |
| [SaveTo](../../aspose.gis/featuressequence/saveto)(string, FileDriver, SavingOptions) | Enregistre la séquence d'entités dans la couche. |
| virtual [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex#useattributesindex)(AbstractPath, string, bool) | Charge l'index d'attribut pour accélérer le filtrage par valeur d'attribut dans les méthodes de filtrage telles que[`WhereGreater`](../featuressequence/wheregreater). Si l'index n'existe pas, le crée en premier. Utilisation*forceRebuild* pour forcer la recréation de l'index. |
| [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex#useattributesindex_1)(string, string, bool) | Charge l'index d'attribut pour accélérer le filtrage par valeur d'attribut dans les méthodes de filtrage telles que[`WhereGreater`](../featuressequence/wheregreater). Si l'index n'existe pas, le crée en premier. Utilisation*forceRebuild* pour forcer la recréation de l'index. |
| virtual [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex#usespatialindex)(AbstractPath, bool) | Charge l'index spatial pour accélérer le filtrage par valeur d'attribut dans les méthodes de filtrage telles que[`WhereIntersects`](../featuressequence/whereintersects) et[`NearestTo`](./nearestto). Si l'index n'existe pas, le crée en premier. Utilisation*forceRebuild* pour forcer la recréation de l'index. |
| [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex#usespatialindex_1)(string, bool) | Charge l'index spatial pour accélérer le filtrage par valeur d'attribut dans les méthodes de filtrage telles que[`WhereIntersects`](../featuressequence/whereintersects) et[`NearestTo`](./nearestto). Si l'index n'existe pas, le crée en premier. Utilisation*forceRebuild* pour forcer la recréation de l'index. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal)(string, T) | Sélectionne les entités avec une valeur d'attribut égale à la valeur fournie. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater)(string, T) | Sélectionne les entités dont la valeur d'attribut est supérieure à la valeur fournie. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal)(string, T) | Sélectionne les entités dont la valeur d'attribut est supérieure ou égale à la valeur fournie. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects)(Extent) | Filtre les entités en fonction de l'étendue. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects)(FeaturesSequence) | Filtre les entités en fonction de l'union de toutes les géométries dans d'autres séquences d'entités. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects)(IGeometry) | Filtre les entités en fonction de la géométrie fournie. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal)(string, T) | Sélectionne les entités dont la valeur d'attribut n'est pas égale à la valeur fournie. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull)(string) | Sélectionne les entités dont l'attribut n'est pas égal à null. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull)(string) | Sélectionne les entités avec un attribut égal à null. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset)(string) | Sélectionne les entités avec un ensemble d'attributs. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller)(string, T) | Sélectionne les entités avec une valeur d'attribut inférieure à la valeur fournie. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal)(string, T) | Sélectionne les entités avec une valeur d'attribut inférieure ou égale à la valeur fournie. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset)(string) | Sélectionne les entités où l'attribut spécifié n'est pas défini. |
| static [Convert](../../aspose.gis/vectorlayer/convert#convert)(AbstractPath, FileDriver, AbstractPath, FileDriver) | Convertir un calque dans un format différent. |
| static [Convert](../../aspose.gis/vectorlayer/convert#convert_2)(string, FileDriver, string, FileDriver) | Convertir un calque dans un format différent. |
| static [Convert](../../aspose.gis/vectorlayer/convert#convert_1)(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) | Convertir un calque dans un format différent. |
| static [Convert](../../aspose.gis/vectorlayer/convert#convert_3)(string, FileDriver, string, FileDriver, ConversionOptions) | Convertir un calque dans un format différent. |

### Voir également

* class [FeaturesSequence](../featuressequence)
* espace de noms [Aspose.Gis](../../aspose.gis)
* Assemblée [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
