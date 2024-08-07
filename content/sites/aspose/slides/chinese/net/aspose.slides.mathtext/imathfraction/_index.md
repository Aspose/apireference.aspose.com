---
title: IMathFraction
second_title: Aspose.Slides for .NET API 参考
description: 指定分数对象由分数条分隔的分子和分母组成 分数条可以是水平的或对角的具体取决于分数属性 分数对象也用于表示堆栈函数它将一个元素放在另一个元素之上没有分数栏
type: docs
weight: 7540
url: /zh/net/aspose.slides.mathtext/imathfraction/
---
## IMathFraction interface

指定分数对象，由分数条分隔的分子和分母组成。 分数条可以是水平的或对角的，具体取决于分数属性。 分数对象也用于表示堆栈函数，它将一个元素放在另一个元素之上，没有分数栏。

```csharp
public interface IMathFraction : IMathElement
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [AsIMathElement](../../aspose.slides.mathtext/imathfraction/asimathelement) { get; } | 允许获取基础 IMathElement 接口 [`IMathElement`](../imathelement) |
| [Denominator](../../aspose.slides.mathtext/imathfraction/denominator) { get; } | 分母 |
| [FractionType](../../aspose.slides.mathtext/imathfraction/fractiontype) { get; set; } | 分数类型 默认值:条形 |
| [Numerator](../../aspose.slides.mathtext/imathfraction/numerator) { get; } | 分子 |

### 例子

示例:

```csharp
[C#]
IMathFraction mathFraction = new MathematicalText("x").Divide("y");
IMathFraction mathFraction2 = new MathFraction(new MathematicalText("x"), new MathematicalText("y"), MathFractionTypes.Linear);
```

### 也可以看看

* interface [IMathElement](../imathelement)
* 命名空间 [Aspose.Slides.MathText](../../aspose.slides.mathtext)
* 部件 [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
