---
title: Superscript
second_title: Référence de l'API Aspose.Slides pour .NET
description: Exposant
type: docs
weight: 30
url: /fr/net/aspose.slides.mathtext/mathleftsubsuperscriptelement/superscript/
---
## MathLeftSubSuperscriptElement.Superscript property

Exposant

```csharp
public IMathElement Superscript { get; }
```

### Exemples

Exemple :

```csharp
[C#]
IMathElement baseElement = new MathematicalText("X");
IMathElement subscript = new MathematicalText("i");
IMathElement superscript = new MathematicalText("j");
MathLeftSubSuperscriptElement leftSubSuperscript = new MathLeftSubSuperscriptElement(baseElement, subscript, superscript);
IMathElement sup = leftSubSuperscript.Superscript;
```

### Voir également

* interface [IMathElement](../../imathelement)
* class [MathLeftSubSuperscriptElement](../../mathleftsubsuperscriptelement)
* espace de noms [Aspose.Slides.MathText](../../mathleftsubsuperscriptelement)
* Assemblée [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
