---
title: MathBar
second_title: Référence de l'API Aspose.Slides pour .NET
description: Initialise MathBar avec overbar position supérieure
type: docs
weight: 10
url: /fr/net/aspose.slides.mathtext/mathbar/mathbar/
---
## MathBar(IMathElement) {#constructor}

Initialise MathBar avec overbar (position supérieure)

```csharp
public MathBar(IMathElement element)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| element | IMathElement | L'élément de base sur lequel la barre est appliquée |

### Exemples

Exemple :

```csharp
[C#]
MathBar mathBar = new MathBar(new MathematicalText("x"));
```

### Voir également

* interface [IMathElement](../../imathelement)
* class [MathBar](../../mathbar)
* espace de noms [Aspose.Slides.MathText](../../mathbar)
* Assemblée [Aspose.Slides](../../../)

---

## MathBar(IMathElement, MathTopBotPositions) {#constructor_1}

Initialise MathBar avec la position spécifiée

```csharp
public MathBar(IMathElement element, MathTopBotPositions position)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| element | IMathElement | L'élément de base sur lequel la barre est appliquée |
| position | MathTopBotPositions | Position de la barre de mesure. |

### Exemples

Exemple :

```csharp
[C#]
MathBar mathBar = new MathBar(new MathematicalText("x"), MathTopBotPositions.Bottom);
```

### Voir également

* interface [IMathElement](../../imathelement)
* enum [MathTopBotPositions](../../mathtopbotpositions)
* class [MathBar](../../mathbar)
* espace de noms [Aspose.Slides.MathText](../../mathbar)
* Assemblée [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
