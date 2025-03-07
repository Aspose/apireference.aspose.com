---
title: IMathParagraph
second_title: Référence de l'API Aspose.Slides pour .NET
description: Paragraphe mathématique qui est un conteneur pour les blocs mathématiques IMathBlock
type: docs
weight: 7710
url: /fr/net/aspose.slides.mathtext/imathparagraph/
---
## IMathParagraph interface

Paragraphe mathématique qui est un conteneur pour les blocs mathématiques (IMathBlock)

```csharp
public interface IMathParagraph : IMathBlockCollection
```

## Propriétés

| Nom | La description |
| --- | --- |
| [AsIMathBlockCollection](../../aspose.slides.mathtext/imathparagraph/asimathblockcollection) { get; } | Permet d'obtenir l'interface IMathBlockCollection de base [`IMathBlockCollection`](../imathblockcollection) |
| [Justification](../../aspose.slides.mathtext/imathparagraph/justification) { get; set; } | Justification du paragraphe Valeur par défaut : CenteredAsGroup |

## Méthodes

| Nom | La description |
| --- | --- |
| [WriteAsMathMl](../../aspose.slides.mathtext/imathparagraph/writeasmathml)(Stream) | Enregistre le contenu de ce[`IMathParagraph`](../imathparagraph) comme MathML |

### Exemples

Exemple :

```csharp
[C#]
IAutoShape shape = slide.Shapes.AddMathShape(x, y, width, height);
IMathParagraph mathParagraph = (shape.TextFrame.Paragraphs[0].Portions[0] as MathPortion).MathParagraph;
mathParagraph.Justification = MathJustification.LeftJustified;
```

### Voir également

* interface [IMathBlockCollection](../imathblockcollection)
* espace de noms [Aspose.Slides.MathText](../../aspose.slides.mathtext)
* Assemblée [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
