---
title: IndexOf
second_title: Aspose.Slides für .NET-API-Referenz
description: Bestimmt den Index eines bestimmten mathematischen Elements in der Sammlung.
type: docs
weight: 120
url: /de/net/aspose.slides.mathtext/mathblock/indexof/
---
## MathBlock.IndexOf method

Bestimmt den Index eines bestimmten mathematischen Elements in der Sammlung.

```csharp
public int IndexOf(IMathElement item)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| item | IMathElement | Das Element, das in der Auflistung gesucht werden soll. |

### Rückgabewert

Der Index von*item* wenn in der Sammlung gefunden; andernfalls -1.

### Beispiele

Beispiel:

```csharp
[C#]
MathBlock mathBlock = new MathBlock(new MathematicalText("x"));
MathematicalText plusElement = new MathematicalText("+");
mathBlock.Add(plusElement);
mathBlock.Add(new MathRadical(new MathematicalText("x"), new MathematicalText("3")));
int index = mathBlock.IndexOf(plusElement);
```

### Siehe auch

* interface [IMathElement](../../imathelement)
* class [MathBlock](../../mathblock)
* namensraum [Aspose.Slides.MathText](../../mathblock)
* Montage [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
