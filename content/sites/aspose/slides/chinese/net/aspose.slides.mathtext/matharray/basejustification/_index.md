---
title: BaseJustification
second_title: Aspose.Slides for .NET API 参考
description: 指定数组相对于周围文本的对齐方式 数组外的文本可以与数组的底部顶部或中心对齐目的 默认值中心
type: docs
weight: 30
url: /zh/net/aspose.slides.mathtext/matharray/basejustification/
---
## MathArray.BaseJustification property

指定数组相对于周围文本的对齐方式 数组外的文本可以与数组的底部、顶部或中心对齐目的。 默认值:中心

```csharp
public MathVerticalAlignment BaseJustification { get; set; }
```

### 例子

示例:

```csharp
[C#]
IMathArray mathArray = new MathArray(new MathematicalText("item1"));
mathArray.BaseJustification = MathVerticalAlignment.Top;
```

### 也可以看看

* enum [MathVerticalAlignment](../../mathverticalalignment)
* class [MathArray](../../matharray)
* 命名空间 [Aspose.Slides.MathText](../../matharray)
* 部件 [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
