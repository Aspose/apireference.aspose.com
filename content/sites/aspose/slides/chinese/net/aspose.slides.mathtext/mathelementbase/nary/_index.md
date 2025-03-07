---
title: Nary
second_title: Aspose.Slides for .NET API 参考
description: 创建 N 元运算符
type: docs
weight: 90
url: /zh/net/aspose.slides.mathtext/mathelementbase/nary/
---
## Nary(MathNaryOperatorTypes, IMathElement, IMathElement) {#nary}

创建 N 元运算符

```csharp
public IMathNaryOperator Nary(MathNaryOperatorTypes type, IMathElement lowerLimit, 
    IMathElement upperLimit)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| type | MathNaryOperatorTypes | N 元运算符类型 |
| lowerLimit | IMathElement | 下限 |
| upperLimit | IMathElement | 上限 |

### 返回值

类型的新实例[`IMathNaryOperator`](../../imathnaryoperator)

### 例子

示例

```csharp
[C#]
IMathElement baseElement = new MathematicalText("i-1");
IMathElement lowerLimit = new MathematicalText("i=0");
IMathElement upperLimit = new MathematicalText("𝑛");
IMathNaryOperator naryOperator = baseElement.Nary(MathNaryOperatorTypes.Summation, lowerLimit, upperLimit);
```

### 也可以看看

* interface [IMathNaryOperator](../../imathnaryoperator)
* enum [MathNaryOperatorTypes](../../mathnaryoperatortypes)
* interface [IMathElement](../../imathelement)
* class [MathElementBase](../../mathelementbase)
* 命名空间 [Aspose.Slides.MathText](../../mathelementbase)
* 部件 [Aspose.Slides](../../../)

---

## Nary(MathNaryOperatorTypes, string, string) {#nary_1}

创建 N 元运算符

```csharp
public IMathNaryOperator Nary(MathNaryOperatorTypes type, string lowerLimit, string upperLimit)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| type | MathNaryOperatorTypes | N 元运算符类型 |
| lowerLimit | String | 下限 |
| upperLimit | String | 上限 |

### 返回值

类型的新实例[`IMathNaryOperator`](../../imathnaryoperator)

### 例子

示例

```csharp
[C#]
IMathNaryOperator naryOperator = new MathematicalText("i").Nary(MathNaryOperatorTypes.Summation, "i=0", "𝑛");
```

### 也可以看看

* interface [IMathNaryOperator](../../imathnaryoperator)
* enum [MathNaryOperatorTypes](../../mathnaryoperatortypes)
* class [MathElementBase](../../mathelementbase)
* 命名空间 [Aspose.Slides.MathText](../../mathelementbase)
* 部件 [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
