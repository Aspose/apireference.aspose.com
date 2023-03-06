---
title: Class SimpleLabeling
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.Rendering.Labelings.SimpleLabeling classe. Un simple étiquetage place une étiquette sur chaque élément.
type: docs
weight: 1700
url: /fr/net/aspose.gis.rendering.labelings/simplelabeling/
---
## SimpleLabeling class

Un simple étiquetage place une étiquette sur chaque élément.

```csharp
public class SimpleLabeling : Labeling
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [SimpleLabeling](simplelabeling/#constructor)() | Initialise une nouvelle instance du`SimpleLabeling` classe. |
| [SimpleLabeling](simplelabeling/#constructor_1)(SimpleLabeling) | Initialise une nouvelle instance du`SimpleLabeling` classe. |
| [SimpleLabeling](simplelabeling/#constructor_2)(string) | Initialise une nouvelle instance du`SimpleLabeling` classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [FeatureBasedConfiguration](../../aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/) { get; set; } | Un rappel utilisé pour configurer cet étiquetage avant de gérer une fonctionnalité. |
| [FontColor](../../aspose.gis.rendering.labelings/simplelabeling/fontcolor/) { get; set; } | Détermine la couleur du texte. |
| [FontFamily](../../aspose.gis.rendering.labelings/simplelabeling/fontfamily/) { get; set; } | Famille de polices à utiliser pour rendre le texte. La valeur par défaut est la valeur dépendante du système. |
| [FontSize](../../aspose.gis.rendering.labelings/simplelabeling/fontsize/) { get; set; } | Taille du texte. |
| [FontStyle](../../aspose.gis.rendering.labelings/simplelabeling/fontstyle/) { get; set; } | Style à appliquer au texte. |
| [GeometryExpression](../../aspose.gis.rendering.labelings/simplelabeling/geometryexpression/) { get; set; } | Fournit un moyen de remplacer la géométrie de l'entité par une autre modifiée pour l'étiquetage. Ce rappel est invoqué le premier après[`FeatureBasedConfiguration`](./featurebasedconfiguration/) . La valeur par défaut est`null` (utiliser la géométrie des entités telle quelle). |
| [HaloColor](../../aspose.gis.rendering.labelings/simplelabeling/halocolor/) { get; set; } | Couleur du halo (trait) autour du texte. |
| [HaloSize](../../aspose.gis.rendering.labelings/simplelabeling/halosize/) { get; set; } | Taille du halo (trait) autour du texte. |
| [LabelAttribute](../../aspose.gis.rendering.labelings/simplelabeling/labelattribute/) { get; set; } | Nom d'attribut à utiliser comme source d'étiquettes. Ignoré si[`LabelExpression`](./labelexpression/) est défini. Soit[`LabelAttribute`](./labelattribute/) ou[`LabelExpression`](./labelexpression/) doit être défini avant le rendu ; InvalidOperationException est lancé autrement. |
| [LabelExpression](../../aspose.gis.rendering.labelings/simplelabeling/labelexpression/) { get; set; } | Fournit un moyen de personnaliser et de formater le texte de l'étiquette. Si défini, remplace[`LabelAttribute`](./labelattribute/) . Soit[`LabelAttribute`](./labelattribute/) ou[`LabelExpression`](./labelexpression/) doit être défini avant le rendu ; InvalidOperationException est lancé autrement. |
| [MultipartMode](../../aspose.gis.rendering.labelings/simplelabeling/multipartmode/) { get; set; } | Spécifie le comportement de rendu pour les géométries en plusieurs parties. La valeur par défaut estAll . |
| [Placement](../../aspose.gis.rendering.labelings/simplelabeling/placement/) { get; set; } | Label placement spécifie comment les étiquettes sont placées par rapport aux géométries de l'entité. |
| [Priority](../../aspose.gis.rendering.labelings/simplelabeling/priority/) { get; set; } | Indique la priorité de cette étiquette en cas de chevauchement avec une autre étiquette. L'étiquette avec une priorité inférieure n'est pas rendue. La valeur par défaut est 1000. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Clone](../../aspose.gis.rendering.labelings/simplelabeling/clone/)() | Clone cette instance. |

### Voir également

* class [Labeling](../labeling/)
* espace de noms [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* Assemblée [Aspose.GIS](../../)


