---
title: NoBreak
second_title: Aspose.Sildes for .NET API Reference
description: No break This property specifies the unbreakable property on the object box. When true no line breaks can occur within the box. This can be important for operator emulators that consist of more than one binary operator. When this element is not specified breaks can occur inside box. Default true
type: docs
weight: 60
url: /net/aspose.slides.mathtext/mathbox/nobreak/
---
## MathBox.NoBreak property

No break This property specifies the "unbreakable" property on the object box. When true, no line breaks can occur within the box. This can be important for operator emulators that consist of more than one binary operator. When this element is not specified, breaks can occur inside box. Default: true

```csharp
public bool NoBreak { get; set; }
```

### Examples

Example:

```csharp
[C#]
MathBox box = new MathBox(new MathematicalText("*****"));
box.NoBreak = false;
```

### See Also

* class [MathBox](../../mathbox)
* namespace [Aspose.Slides.MathText](../../mathbox)
* assembly [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
