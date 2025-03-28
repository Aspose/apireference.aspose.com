---
title: IMathFunction
second_title: Référence de l'API Aspose.Slides pour .NET
description: Spécifie une fonction dun argument.
type: docs
weight: 7590
url: /fr/net/aspose.slides.mathtext/imathfunction/
---
## IMathFunction interface

Spécifie une fonction d'un argument.

```csharp
public interface IMathFunction : IMathElement
```

## Propriétés

| Nom | La description |
| --- | --- |
| [AsIMathElement](../../aspose.slides.mathtext/imathfunction/asimathelement) { get; } | Permet d'obtenir l'interface IMathElement de base [`IMathElement`](../imathelement) |
| [Base](../../aspose.slides.mathtext/imathfunction/base) { get; } | Argument de fonction |
| [Name](../../aspose.slides.mathtext/imathfunction/name) { get; } | Function name Par exemple, les noms de fonction sont sin et cos |

### Exemples

Exemple :

```csharp
[C#]
IMathFunction sinX = new MathematicalText("sin").Function("x");
```

### Voir également

* interface [IMathElement](../imathelement)
* espace de noms [Aspose.Slides.MathText](../../aspose.slides.mathtext)
* Assemblée [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
