---
title: Class FeaturesSequence
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.FeaturesSequence classe. FeaturesSequence représente un ensemble dentités vectorielles.
type: docs
weight: 170
url: /fr/net/aspose.gis/featuressequence/
---
## FeaturesSequence class

`FeaturesSequence` représente un ensemble d'entités vectorielles.

```csharp
public abstract class FeaturesSequence : IEnumerable<Feature>
```

## Propriétés

| Nom | La description |
| --- | --- |
| abstract [Attributes](../../aspose.gis/featuressequence/attributes/) { get; } | Obtient la collection d'attributs personnalisés pour les fonctionnalités de ce[`VectorLayer`](../vectorlayer/) . |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | Obtient le système de référence spatiale de cette séquence d'entités. |

## Méthodes

| Nom | La description |
| --- | --- |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | Renvoie un énumérateur qui parcourt la collection. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | Obtient une étendue spatiale de cette couche. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto)(AbstractPath, FileDriver) | Enregistre la séquence d'entités dans la couche. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_2)(string, FileDriver) | Enregistre la séquence d'entités dans la couche. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_1)(AbstractPath, FileDriver, SavingOptions) | Enregistre la séquence d'entités dans la couche. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_3)(string, FileDriver, SavingOptions) | Enregistre la séquence d'entités dans la couche. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | Divisez les entités par type de géométrie. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | Sélectionne les entités avec une valeur d'attribut égale à la valeur fournie. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | Sélectionne les entités dont la valeur d'attribut est supérieure à la valeur fournie. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | Sélectionne les entités dont la valeur d'attribut est supérieure ou égale à la valeur fournie. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects)(Extent) | Filtre les entités en fonction de l'étendue. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_1)(FeaturesSequence) | Filtre les entités en fonction de l'union de toutes les géométries dans d'autres séquences d'entités. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_2)(IGeometry) | Filtre les entités en fonction de la géométrie fournie. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | Sélectionne les entités dont la valeur d'attribut n'est pas égale à la valeur fournie. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | Sélectionne les entités dont l'attribut n'est pas égal à null. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | Sélectionne les entités avec un attribut égal à null. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | Sélectionne les entités avec un ensemble d'attributs. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | Sélectionne les entités avec une valeur d'attribut inférieure à la valeur fournie. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | Sélectionne les entités avec une valeur d'attribut inférieure ou égale à la valeur fournie. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | Sélectionne les entités où l'attribut spécifié n'est pas défini. |

### Voir également

* class [Feature](../feature/)
* espace de noms [Aspose.Gis](../../aspose.gis/)
* Assemblée [Aspose.GIS](../../)


