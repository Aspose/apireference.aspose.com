---
title: IMathLimit
second_title: Aspose.Slides for .NET API 参考
description: 指定限制对象由基线上的文本和紧邻其上方或下方的缩小尺寸文本组成
type: docs
weight: 7610
url: /zh/net/aspose.slides.mathtext/imathlimit/
---
## IMathLimit interface

指定限制对象，由基线上的文本和紧邻其上方或下方的缩小尺寸文本组成。

```csharp
public interface IMathLimit : IMathElement
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [AsIMathElement](../../aspose.slides.mathtext/imathlimit/asimathelement) { get; } | 允许获取基础 IMathElement 接口 [`IMathElement`](../imathelement) |
| [Base](../../aspose.slides.mathtext/imathlimit/base) { get; } | 基本参数 |
| [Limit](../../aspose.slides.mathtext/imathlimit/limit) { get; } | 限制参数 |
| [UpperLimit](../../aspose.slides.mathtext/imathlimit/upperlimit) { get; set; } | 指定上限或下限 |

### 例子

示例:

```csharp
[C#]
IMathLimit limitElement = new MathLimit(new MathematicalText("lim"), new MathematicalText("𝑛→∞"));
```

### 也可以看看

* interface [IMathElement](../imathelement)
* 命名空间 [Aspose.Slides.MathText](../../aspose.slides.mathtext)
* 部件 [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
