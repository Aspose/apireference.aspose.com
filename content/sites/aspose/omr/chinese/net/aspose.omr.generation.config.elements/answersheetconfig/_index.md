---
title: Class AnswerSheetConfig
second_title: Aspose.OMR for .NET API 参考
description: Aspose.OMR.Generation.Config.Elements.AnswerSheetConfig 班级. 表示 AnswerSheet 元素 它允许添加按列和行分组的选择框 如果您想在一页纸上放很多问题请使用答题纸因为它们彼此靠近
type: docs
weight: 90
url: /zh/net/aspose.omr.generation.config.elements/answersheetconfig/
---
## AnswerSheetConfig class

表示 AnswerSheet 元素。 它允许添加按列和行分组的选择框。 如果您想在一页纸上放很多问题，请使用答题纸，因为它们彼此靠近。

```csharp
public class AnswerSheetConfig : BaseConfig
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [AnswerSheetConfig](answersheetconfig/)() | 默认构造函数。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [AnswersCount](../../aspose.omr.generation.config.elements/answersheetconfig/answerscount/) { get; set; } | 答题卡中每道题的答案选项数。 |
| [AnswersValues](../../aspose.omr.generation.config.elements/answersheetconfig/answersvalues/) { get; set; } | 每个值代表气泡内的符号。必须具有相同的计数[`AnswersCount`](./answerscount/) 示例：新字符串[] {“A”、“B”、“C”、“D”} 示例：新字符串[] {“1”、“2”、“3”、“4”} |
| [BubbleType](../../aspose.omr.generation.config.elements/answersheetconfig/bubbletype/) { get; set; } | 气泡的类型 |
| [Column](../../aspose.omr.generation.config.elements/answersheetconfig/column/) { get; set; } | 表示在哪一列绘制sheet |
| [ColumnsCount](../../aspose.omr.generation.config.elements/answersheetconfig/columnscount/) { get; set; } | 设置要绘制的列数。 |
| [ElementsCount](../../aspose.omr.generation.config.elements/answersheetconfig/elementscount/) { get; set; } | 确定答题卡中的问题总数。 |
| override [Name](../../aspose.omr.generation.config.elements/answersheetconfig/name/) { get; set; } | 答题卡名称 |
| [StartId](../../aspose.omr.generation.config.elements/answersheetconfig/startid/) { get; set; } | 问题编号的起始索引 |
| override [Type](../../aspose.omr.generation.config.elements/answersheetconfig/type/) { get; set; } | omr 元素的类型。 JSON 序列化的必填字段. |
| [VerticalMargin](../../aspose.omr.generation.config.elements/answersheetconfig/verticalmargin/) { get; set; } | 答题纸的垂直边距。以像素为单位设置。 |

## 字段

| 姓名 | 描述 |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/answersheetconfig/bubblesize/) | 气泡的大小 |

### 也可以看看

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* 命名空间 [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* 部件 [Aspose.OMR](../../)


