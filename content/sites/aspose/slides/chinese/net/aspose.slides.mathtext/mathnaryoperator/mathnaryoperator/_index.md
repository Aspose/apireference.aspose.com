---
title: MathNaryOperator
second_title: Aspose.Slides for .NET API 参考
description: 初始化 MathNaryOperator 类的新实例
type: docs
weight: 10
url: /zh/net/aspose.slides.mathtext/mathnaryoperator/mathnaryoperator/
---
## MathNaryOperator(char, IMathElement, IMathElement, IMathElement) {#constructor_2}

初始化 MathNaryOperator 类的新实例。

```csharp
public MathNaryOperator(char operatorSymbol, IMathElement baseArgument, IMathElement lowerLimit, 
    IMathElement upperLimit)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| operatorSymbol | Char | Nary operator symbol |
| baseArgument | IMathElement | Base argument |
| lowerLimit | IMathElement | 下限 |
| upperLimit | IMathElement | 上限 |

### 例子

示例:

```csharp
[C#]
IMathNaryOperator naryOperator = new MathNaryOperator('∑', new MathematicalText("i"), new MathematicalText("i=0"), new MathematicalText("𝑛"));
```

### 也可以看看

* interface [IMathElement](../../imathelement)
* class [MathNaryOperator](../../mathnaryoperator)
* 命名空间 [Aspose.Slides.MathText](../../mathnaryoperator)
* 部件 [Aspose.Slides](../../../)

---

## MathNaryOperator(char, IMathElement, IMathElement) {#constructor_1}

初始化 MathNaryOperator 类的新实例。

```csharp
public MathNaryOperator(char operatorSymbol, IMathElement baseArgument, IMathElement lowerLimit)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| operatorSymbol | Char | Nary operator symbol |
| baseArgument | IMathElement | Base argument |
| lowerLimit | IMathElement | 下限 |

### 例子

示例:

```csharp
[C#]
IMathNaryOperator naryOperator = new MathNaryOperator('∑', new MathematicalText("i"), new MathematicalText("i"));
```

### 也可以看看

* interface [IMathElement](../../imathelement)
* class [MathNaryOperator](../../mathnaryoperator)
* 命名空间 [Aspose.Slides.MathText](../../mathnaryoperator)
* 部件 [Aspose.Slides](../../../)

---

## MathNaryOperator(char, IMathElement) {#constructor}

初始化 MathNaryOperator 类的新实例。

```csharp
public MathNaryOperator(char operatorSymbol, IMathElement baseArgument)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| operatorSymbol | Char | Nary operator symbol |
| baseArgument | IMathElement | Base argument |

### 例子

示例:

```csharp
[C#]
IMathNaryOperator naryOperator = new MathNaryOperator('∑', new MathematicalText("i"));
```

### 也可以看看

* interface [IMathElement](../../imathelement)
* class [MathNaryOperator](../../mathnaryoperator)
* 命名空间 [Aspose.Slides.MathText](../../mathnaryoperator)
* 部件 [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
