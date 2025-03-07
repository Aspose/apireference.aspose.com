---
title: SetSuperscript
second_title: Aspose.Sildes for .NET API Reference
description: Creates superscript
type: docs
weight: 170
url: /net/aspose.slides.mathtext/imathelement/setsuperscript/
---
## SetSuperscript(IMathElement) {#setsuperscript}

Creates superscript

```csharp
public IMathSuperscriptElement SetSuperscript(IMathElement superscript)
```

| Parameter | Type | Description |
| --- | --- | --- |
| superscript | IMathElement | Superscript (upper index on the right) |

### Return Value

New math element of type [`IMathSuperscriptElement`](../../imathsuperscriptelement)

### Examples

Example:

```csharp
[C#]
IMathElement element = new MathematicalText("N");
IMathElement index = new MathematicalText("4");
IMathSuperscriptElement superscript = element.SetSuperscript(index);
```

### See Also

* interface [IMathSuperscriptElement](../../imathsuperscriptelement)
* interface [IMathElement](../../imathelement)
* namespace [Aspose.Slides.MathText](../../imathelement)
* assembly [Aspose.Slides](../../../)

---

## SetSuperscript(string) {#setsuperscript_1}

Creates superscript

```csharp
public IMathSuperscriptElement SetSuperscript(string superscript)
```

| Parameter | Type | Description |
| --- | --- | --- |
| superscript | String | Superscript (upper index on the right) |

### Return Value

New math element of type [`IMathSuperscriptElement`](../../imathsuperscriptelement)

### Examples

Example:

```csharp
[C#]
IMathElement element = new MathematicalText("N");
IMathSuperscriptElement superscript = element.SetSuperscript("4");
```

### See Also

* interface [IMathSuperscriptElement](../../imathsuperscriptelement)
* interface [IMathElement](../../imathelement)
* namespace [Aspose.Slides.MathText](../../imathelement)
* assembly [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
