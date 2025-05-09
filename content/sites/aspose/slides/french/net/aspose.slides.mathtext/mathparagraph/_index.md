---
title: MathParagraph
second_title: Référence de l'API Aspose.Slides pour .NET
description: Paragraphe mathématique qui est un conteneur pour les blocs mathématiques IMathBlock
type: docs
weight: 8210
url: /fr/net/aspose.slides.mathtext/mathparagraph/
---
## MathParagraph class

Paragraphe mathématique qui est un conteneur pour les blocs mathématiques (IMathBlock)

```csharp
public class MathParagraph : IMathParagraph
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [MathParagraph](mathparagraph#constructor)() | Initialise une nouvelle instance de la classe MathParagraph. |
| [MathParagraph](mathparagraph#constructor_1)(IMathBlock) | Initialise une nouvelle instance de la classe MathParagraph. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Count](../../aspose.slides.mathtext/mathparagraph/count) { get; } | Obtient le nombre d'éléments réellement contenus dans la collection. Lecture seuleInt32 . |
| [Item](../../aspose.slides.mathtext/mathparagraph/item) { get; set; } | Obtient l'élément à l'index spécifié. Lecture seule[`IMathBlock`](../imathblock) . |
| [Justification](../../aspose.slides.mathtext/mathparagraph/justification) { get; set; } | Justification du paragraphe Valeur par défaut : CenteredAsGroup |

## Méthodes

| Nom | La description |
| --- | --- |
| [Add](../../aspose.slides.mathtext/mathparagraph/add)(IMathBlock) | Ajoute IMathBlock à la fin de la collection. |
| [Clear](../../aspose.slides.mathtext/mathparagraph/clear)() | Supprime tous les éléments de la collection. |
| [Contains](../../aspose.slides.mathtext/mathparagraph/contains)(IMathBlock) | Détermine si la collection contient une valeur spécifique. |
| [IndexOf](../../aspose.slides.mathtext/mathparagraph/indexof)(IMathBlock) | Détermine l'index d'un IMathBlock spécifique dans la collection. |
| [Insert](../../aspose.slides.mathtext/mathparagraph/insert)(int, IMathBlock) | Insère IMathBlock dans la collection à l'index spécifié. |
| [Remove](../../aspose.slides.mathtext/mathparagraph/remove)(IMathBlock) | Supprime la première occurrence d'un objet spécifique de la collection/&gt;. |
| [RemoveAt](../../aspose.slides.mathtext/mathparagraph/removeat)(int) | Supprime un élément à l'index spécifié de la collection. |
| [WriteAsMathMl](../../aspose.slides.mathtext/mathparagraph/writeasmathml)(Stream) | Enregistre le contenu de ce[`MathParagraph`](../mathparagraph) comme MathML |

### Exemples

Exemple :

```csharp
[C#]
IAutoShape shape = slide.Shapes.AddMathShape(x, y, width, height);
IMathParagraph mathParagraph = (shape.TextFrame.Paragraphs[0].Portions[0] as MathPortion).MathParagraph;
mathParagraph.Justification = MathJustification.LeftJustified;
```

### Voir également

* interface [IMathParagraph](../imathparagraph)
* espace de noms [Aspose.Slides.MathText](../../aspose.slides.mathtext)
* Assemblée [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
