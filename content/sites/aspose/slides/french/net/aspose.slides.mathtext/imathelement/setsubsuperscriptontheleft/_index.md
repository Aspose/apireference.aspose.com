---
title: SetSubSuperscriptOnTheLeft
second_title: Référence de l'API Aspose.Slides pour .NET
description: Crée un indice et un exposant à gauche
type: docs
weight: 150
url: /fr/net/aspose.slides.mathtext/imathelement/setsubsuperscriptontheleft/
---
## SetSubSuperscriptOnTheLeft(IMathElement, IMathElement) {#setsubsuperscriptontheleft}

Crée un indice et un exposant à gauche

```csharp
public IMathLeftSubSuperscriptElement SetSubSuperscriptOnTheLeft(IMathElement subscript, 
    IMathElement superscript)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| subscript | IMathElement | Indice (index inférieur à gauche) |
| superscript | IMathElement | Exposant (index supérieur à gauche) |

### Return_Value

Nouvel élément mathématique de type[`IMathLeftSubSuperscriptElement`](../../imathleftsubsuperscriptelement)

### Exemples

Exemple :

```csharp
[C#]
IMathElement baseElement = new MathematicalText("N");
IMathElement subscript = new MathematicalText("i");
IMathElement superscript = new MathematicalText("j");
IMathLeftSubSuperscriptElement leftSubsuperscript = baseElement.SetSubSuperscriptOnTheLeft(subscript, superscript);
```

### Voir également

* interface [IMathLeftSubSuperscriptElement](../../imathleftsubsuperscriptelement)
* interface [IMathElement](../../imathelement)
* espace de noms [Aspose.Slides.MathText](../../imathelement)
* Assemblée [Aspose.Slides](../../../)

---

## SetSubSuperscriptOnTheLeft(string, string) {#setsubsuperscriptontheleft_1}

Crée un indice et un exposant à gauche

```csharp
public IMathLeftSubSuperscriptElement SetSubSuperscriptOnTheLeft(string subscript, 
    string superscript)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| subscript | String | Indice (index inférieur à gauche) |
| superscript | String | Exposant (index supérieur à gauche) |

### Return_Value

Nouvel élément mathématique de type[`IMathLeftSubSuperscriptElement`](../../imathleftsubsuperscriptelement)

### Exemples

Exemple :

```csharp
[C#]
IMathElement baseElement = new MathematicalText("N");
IMathLeftSubSuperscriptElement leftSubsuperscript = baseElement.SetSubSuperscriptOnTheLeft("i", "j");
```

### Voir également

* interface [IMathLeftSubSuperscriptElement](../../imathleftsubsuperscriptelement)
* interface [IMathElement](../../imathelement)
* espace de noms [Aspose.Slides.MathText](../../imathelement)
* Assemblée [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
