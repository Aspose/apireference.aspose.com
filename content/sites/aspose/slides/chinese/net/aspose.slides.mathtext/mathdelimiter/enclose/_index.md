---
title: Enclose
second_title: Aspose.Slides for .NET API 参考
description: 将数学元素括在指定字符中例如括号或其他字符作为框架
type: docs
weight: 90
url: /zh/net/aspose.slides.mathtext/mathdelimiter/enclose/
---
## MathDelimiter.Enclose method

将数学元素括在指定字符中，例如括号或其他字符，作为框架

```csharp
public override IMathDelimiter Enclose(char beginningCharacter, char endingCharacter)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| beginCharacter | Char | 开始字符（通常是左括号） |
| endingCharacter | Char | 结束字符（通常是右括号） |

### 返回值

如果*beginningCharacter*和*endingCharacter*为空，则 对应的属性只赋值，没有新对象被创建（返回此实例）。 否则，返回 Delimiter 类型的新数学元素，其中包括指定字符作为框架 和[`MathDelimiter`](../../mathdelimiter)的此实例内框。

### 例子

示例:

```csharp
[C#]
IMathDelimiter innerDelimiter = new MathematicalText("x").Join(",y").Enclose('{', '}');
IMathDelimiter outerDelimiter = innerDelimiter.Enclose('[', ']');
```

### 也可以看看

* interface [IMathDelimiter](../../imathdelimiter)
* class [MathDelimiter](../../mathdelimiter)
* 命名空间 [Aspose.Slides.MathText](../../mathdelimiter)
* 部件 [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
