---
title: Class VerticalChoiceBoxConfig
second_title: Référence de l'API Aspose.OMR pour .NET
description: Aspose.OMR.Generation.Config.Elements.Parents.VerticalChoiceBoxConfig classe. La VerticalChoiceBox se compose dunAnswerConfig élément qui contient une courte réponse etContentConfig éléments décrivant en détail loption de réponse. Il peut également contenir unWriteInConfigélément dans lequel lutilisateur peut entrer sa propre réponse.
type: docs
weight: 280
url: /fr/net/aspose.omr.generation.config.elements.parents/verticalchoiceboxconfig/
---
## VerticalChoiceBoxConfig class

La VerticalChoiceBox se compose d'un[`AnswerConfig`](../answerconfig/) élément qui contient une courte réponse et[`ContentConfig`](../../aspose.omr.generation.config.elements/contentconfig/) éléments décrivant en détail l'option de réponse. Il peut également contenir un[`WriteInConfig`](../../aspose.omr.generation.config.elements/writeinconfig/)élément dans lequel l'utilisateur peut entrer sa propre réponse.

```csharp
public class VerticalChoiceBoxConfig : ParentConfig
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [VerticalChoiceBoxConfig](verticalchoiceboxconfig/)() | Default_Constructor |

## Propriétés

| Nom | La description |
| --- | --- |
| override [Children](../../aspose.omr.generation.config.elements.parents/verticalchoiceboxconfig/children/) { get; set; } | Éléments omr enfants. Dans la plupart des cas, positionné à l'intérieur du parent ou en dessous. |
| override [Name](../../aspose.omr.generation.config.elements.parents/verticalchoiceboxconfig/name/) { get; set; } | Valeur de la question |
| [Threshold](../../aspose.omr.generation.config.elements.parents/verticalchoiceboxconfig/threshold/) { get; set; } | Pourcentage de pixels après lesquels les bulles sont considérées comme marquées |
| [TopPadding](../../aspose.omr.generation.config.elements.parents/verticalchoiceboxconfig/toppadding/) { get; set; } | Nombre de pixels. Peut être utilisé pour ajouter un espace supplémentaire au-dessus de l'élément. Ou supprimez l'espace existant en définissant une valeur négative (par exemple -40) |
| override [Type](../../aspose.omr.generation.config.elements.parents/verticalchoiceboxconfig/type/) { get; set; } | Type d'élément omr. Champ obligatoire pour la sérialisation JSON. |

### Voir également

* class [ParentConfig](../../aspose.omr.generation.config/parentconfig/)
* espace de noms [Aspose.OMR.Generation.Config.Elements.Parents](../../aspose.omr.generation.config.elements.parents/)
* Assemblée [Aspose.OMR](../../)


