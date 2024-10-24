---
title: VerticalJustification
second_title: Aspose.Slides for .NET API 参考
description: 组字符的垂直对齐 指定对象相对于基线的对齐方式 例如当组字符在对象上方时 VerticalJustification of Top 表示对象的顶部落在基线上 当 VerticalJustification 设置为 Bottom 时对象的底部在基线上 默认值Bottom 为 PositionTopTop 为 PositionBottom
type: docs
weight: 50
url: /zh/net/aspose.slides.mathtext/imathgroupingcharacter/verticaljustification/
---
## IMathGroupingCharacter.VerticalJustification property

组字符的垂直对齐。 指定对象相对于基线的对齐方式。 例如，当组字符在对象上方时， VerticalJustification of Top 表示对象的顶部落在基线上； 当 VerticalJustification 设置为 Bottom 时，对象的底部在基线上 默认值:Bottom 为 Position=Top，Top 为 Position=Bottom

```csharp
public MathTopBotPositions VerticalJustification { get; set; }
```

### 例子

示例:

```csharp
[C#]
MathGroupingCharacter groupingCharacter = new MathGroupingCharacter(new MathematicalText("abc"));
groupingCharacter.VerticalJustification = MathTopBotPositions.Top;
```

### 也可以看看

* enum [MathTopBotPositions](../../mathtopbotpositions)
* interface [IMathGroupingCharacter](../../imathgroupingcharacter)
* 命名空间 [Aspose.Slides.MathText](../../imathgroupingcharacter)
* 部件 [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
