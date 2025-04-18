---
title: MathBar
second_title: Aspose.Slides für .NET-API-Referenz
description: Initialisiert MathBar mit Overbar Oberste Position
type: docs
weight: 10
url: /de/net/aspose.slides.mathtext/mathbar/mathbar/
---
## MathBar(IMathElement) {#constructor}

Initialisiert MathBar mit Overbar (Oberste Position)

```csharp
public MathBar(IMathElement element)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| element | IMathElement | Das Basiselement, auf das die Stange angewendet wird |

### Beispiele

Beispiel:

```csharp
[C#]
MathBar mathBar = new MathBar(new MathematicalText("x"));
```

### Siehe auch

* interface [IMathElement](../../imathelement)
* class [MathBar](../../mathbar)
* namensraum [Aspose.Slides.MathText](../../mathbar)
* Montage [Aspose.Slides](../../../)

---

## MathBar(IMathElement, MathTopBotPositions) {#constructor_1}

Initialisiert MathBar mit angegebener Position

```csharp
public MathBar(IMathElement element, MathTopBotPositions position)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| element | IMathElement | Das Basiselement, auf das die Stange angewendet wird |
| position | MathTopBotPositions | Position des Taktstrichs. |

### Beispiele

Beispiel:

```csharp
[C#]
MathBar mathBar = new MathBar(new MathematicalText("x"), MathTopBotPositions.Bottom);
```

### Siehe auch

* interface [IMathElement](../../imathelement)
* enum [MathTopBotPositions](../../mathtopbotpositions)
* class [MathBar](../../mathbar)
* namensraum [Aspose.Slides.MathText](../../mathbar)
* Montage [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
