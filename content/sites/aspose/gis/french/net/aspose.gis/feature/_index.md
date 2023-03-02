---
title: Class Feature
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.Feature classe. Une entité géographique composée dune géométrie et dattributs définis par lutilisateur.
type: docs
weight: 130
url: /fr/net/aspose.gis/feature/
---
## Feature class

Une entité géographique composée d'une géométrie et d'attributs définis par l'utilisateur.

```csharp
public class Feature
```

## Propriétés

| Nom | La description |
| --- | --- |
| [Geometry](../../aspose.gis/feature/geometry/) { get; set; } | Obtient ou définit la géométrie de l'entité. Ne peut pas être`null` , utiliser[`Null`](../../aspose.gis.geometries/geometry/null/) pour indiquer la géométrie manquante. |

## Méthodes

| Nom | La description |
| --- | --- |
| [CopyValues](../../aspose.gis/feature/copyvalues/)(Feature) | Copie les valeurs des attributs d'une autre entité. |
| [GetValue](../../aspose.gis/feature/getvalue/#getvalue)(string) | Obtient la valeur d'un attribut. |
| [GetValue&lt;T&gt;](../../aspose.gis/feature/getvalue/#getvalue_1)(string) | Obtient la valeur d'un attribut. |
| [GetValueOrDefault](../../aspose.gis/feature/getvalueordefault/#getvalueordefault)(string, object) | Obtient la valeur d'un attribut, ou[`DefaultValue`](../featureattribute/defaultvalue/) si la valeur n'est pas définie ou`nul` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_1)(string) | Obtient la valeur d'un attribut, ou[`DefaultValue`](../featureattribute/defaultvalue/) si la valeur n'est pas définie ou`nul` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_2)(string, object) | Obtient la valeur d'un attribut, ou[`DefaultValue`](../featureattribute/defaultvalue/) si la valeur n'est pas définie ou`nul` . |
| [GetValues](../../aspose.gis/feature/getvalues/)(object[], object) | Renvoie les valeurs de tous les attributs d'un tableau. |
| [GetValuesDump](../../aspose.gis/feature/getvaluesdump/)(object) | Renvoie les valeurs de tous les attributs d'un tableau. Envisagez d'utiliser[`GetValues`](./getvalues/) méthode pour éviter une allocation de mémoire supplémentaire. |
| [GetValuesList&lt;T&gt;](../../aspose.gis/feature/getvalueslist/)(string, string) | Obtient les valeurs d'une séquence d'attributs sous forme de liste. |
| [IsValueNull](../../aspose.gis/feature/isvaluenull/)(string) | Détermine si l'attribut spécifié a été explicitement défini sur`nul` valeur. |
| [IsValueSet](../../aspose.gis/feature/isvalueset/)(string) | Vérifie si la valeur d'attribut est définie dans cette fonctionnalité. |
| [SetValue&lt;T&gt;](../../aspose.gis/feature/setvalue/)(string, T) | Définit une nouvelle valeur d'un attribut. |
| [SetValueNull](../../aspose.gis/feature/setvaluenull/)(string) | Définit la valeur de l'attribut sur`nul` . |
| [SetValues](../../aspose.gis/feature/setvalues/)(object[]) | Définit de nouvelles valeurs pour tous les attributs. Envisagez également d'utiliser[`CopyValues`](./copyvalues/) méthode pour rationaliser les valeurs de réglage en un seul appel. |
| [UnsetValue](../../aspose.gis/feature/unsetvalue/)(string) | Supprime la valeur d'attribut de cette fonctionnalité. |

### Voir également

* espace de noms [Aspose.Gis](../../aspose.gis/)
* Assemblée [Aspose.GIS](../../)


