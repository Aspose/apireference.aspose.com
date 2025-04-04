---
title: Enclose
second_title: Référence de l'API Aspose.Slides pour .NET
description: Encadre un élément mathématique dans des caractères spécifiés tels que des parenthèses ou dautres caractères comme framing
type: docs
weight: 90
url: /fr/net/aspose.slides.mathtext/mathdelimiter/enclose/
---
## MathDelimiter.Enclose method

Encadre un élément mathématique dans des caractères spécifiés tels que des parenthèses ou d'autres caractères comme framing

```csharp
public override IMathDelimiter Enclose(char beginningCharacter, char endingCharacter)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| beginningCharacter | Char | Caractère de début (généralement parenthèse gauche) |
| endingCharacter | Char | Caractère de fin (généralement crochet droit) |

### Return_Value

Si*beginningCharacter* et*endingCharacter* sont nulles, les propriétés correspondantes ne reçoivent que des valeurs et aucun nouvel objet n'est créé (renvoie cette instance). Sinon, renvoie un nouvel élément mathématique de type Delimiter qui inclut les caractères spécifiés comme cadrage et cette instance de[`MathDelimiter`](../../mathdelimiter) encadré à l'intérieur.

### Exemples

Exemple :

```csharp
[C#]
IMathDelimiter innerDelimiter = new MathematicalText("x").Join(",y").Enclose('{', '}');
IMathDelimiter outerDelimiter = innerDelimiter.Enclose('[', ']');
```

### Voir également

* interface [IMathDelimiter](../../imathdelimiter)
* class [MathDelimiter](../../mathdelimiter)
* espace de noms [Aspose.Slides.MathText](../../mathdelimiter)
* Assemblée [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
