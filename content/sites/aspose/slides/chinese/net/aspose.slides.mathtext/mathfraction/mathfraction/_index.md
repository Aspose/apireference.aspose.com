---
title: MathFraction
second_title: Aspose.Slides for .NET API 参考
description: 用指定的分子分母和类型初始化 MathFraction
type: docs
weight: 10
url: /zh/net/aspose.slides.mathtext/mathfraction/mathfraction/
---
## MathFraction(IMathElement, IMathElement, MathFractionTypes) {#constructor_1}

用指定的分子、分母和类型初始化 MathFraction

```csharp
public MathFraction(IMathElement numerator, IMathElement denominator, 
    MathFractionTypes fractionType)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| numerator | IMathElement | 分子 |
| 分母 | IMathElement | 分母 |
| fractionType | MathFractionTypes | 分数类型 |

### 例子

示例:

```csharp
[C#]
MathFraction mathFraction = new MathFraction(new MathematicalText("x"), new MathematicalText("y"), MathFractionTypes.Linear);
```

### 也可以看看

* interface [IMathElement](../../imathelement)
* enum [MathFractionTypes](../../mathfractiontypes)
* class [MathFraction](../../mathfraction)
* 命名空间 [Aspose.Slides.MathText](../../mathfraction)
* 部件 [Aspose.Slides](../../../)

---

## MathFraction(IMathElement, IMathElement) {#constructor}

使用指定的分子和分母初始化“Bar”类型的 MathFraction

```csharp
public MathFraction(IMathElement numerator, IMathElement denominator)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| numerator | IMathElement | 分子 |
| 分母 | IMathElement | 分母 |

### 例子

示例:

```csharp
[C#]
MathFraction mathFraction = new MathFraction(new MathematicalText("x"), new MathematicalText("y"));
```

### 也可以看看

* interface [IMathElement](../../imathelement)
* class [MathFraction](../../mathfraction)
* 命名空间 [Aspose.Slides.MathText](../../mathfraction)
* 部件 [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
