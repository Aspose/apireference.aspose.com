---
title: MathDelimiter
second_title: Aspose.Slides für .NET-API-Referenz
description: Initialisiert MathDelimiter mit dem angegebenen Element als einzelnes Basisargument
type: docs
weight: 10
url: /de/net/aspose.slides.mathtext/mathdelimiter/mathdelimiter/
---
## MathDelimiter constructor

Initialisiert MathDelimiter mit dem angegebenen Element als einzelnes Basisargument

```csharp
public MathDelimiter(IMathElement element)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| element | IMathElement | Das Basiselement, auf das das Trennzeichen angewendet wird. Kann null sein. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | wirft dann*element* ist ein Container für andere Elemente wie MathBlock. In diesem Fall müssen Sie einen anderen Konstruktor mit IEnumerable-Argument aufrufen. |

### Beispiele

Beispiel:

```csharp
[C#]
IMathElement element = new MathematicalText("x");
MathDelimiter delimiter = new MathDelimiter(element);
```

### Siehe auch

* interface [IMathElement](../../imathelement)
* class [MathDelimiter](../../mathdelimiter)
* namensraum [Aspose.Slides.MathText](../../mathdelimiter)
* Montage [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
