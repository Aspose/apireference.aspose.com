---
title: Class CompositeGridConfig
second_title: Aspose.OMR for .NET API 参考
description: Aspose.OMR.Generation.Config.Elements.CompositeGridConfig 班级. 网格元素 生成气泡数组每个填充的气泡代表复合 value 中的一个符号所有标记的符号将连接成单个 value
type: docs
weight: 120
url: /zh/net/aspose.omr.generation.config.elements/compositegridconfig/
---
## CompositeGridConfig class

网格元素。 生成气泡数组。每个填充的气泡代表复合 value 中的一个符号，所有标记的符号将连接成单个 value

```csharp
public class CompositeGridConfig : BaseConfig
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [CompositeGridConfig](compositegridconfig/)() | 默认构造函数。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [BubbleType](../../aspose.omr.generation.config.elements/compositegridconfig/bubbletype/) { get; set; } | 气泡的类型 |
| [Column](../../aspose.omr.generation.config.elements/compositegridconfig/column/) { get; set; } | 在多列父级绘制元素时 - 表示位置. |
| [ColumnsCount](../../aspose.omr.generation.config.elements/compositegridconfig/columnscount/) { get; set; } | 网格内的列数。每列代表结果中的单个符号 value 金额必须等于[`ExtraRow`](./extrarow/)列数 |
| [DisplayHint](../../aspose.omr.generation.config.elements/compositegridconfig/displayhint/) { get; set; } | 应显示此网格的名称 |
| [ExtraRow](../../aspose.omr.generation.config.elements/compositegridconfig/extrarow/) { get; set; } | 将放置在默认值之上的特定于列的值 -[`Values`](./values/) . 呈现为二维数组。 第一行。第二列。 每个字符串代表气泡内的文本。 如果字符串为空，则不会放置气泡。 列数必须等于[`ColumnsCount`](./columnscount/) |
| [GridAlignment](../../aspose.omr.generation.config.elements/compositegridconfig/gridalignment/) { get; set; } | Grid alignment，指示在page 上应该绘制网格的位置 |
| [GridOrientation](../../aspose.omr.generation.config.elements/compositegridconfig/gridorientation/) { get; set; } | 网格方向：水平或垂直。指示应如何定位子元素 |
| [HeaderBorderColor](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordercolor/) { get; set; } | 方形边框颜色 |
| [HeaderBorderSize](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordersize/) { get; set; } | 方形边框尺寸 |
| [HeaderType](../../aspose.omr.generation.config.elements/compositegridconfig/headertype/) { get; set; } | 表示在网格的开头绘制什么类型的元素 |
| override [Name](../../aspose.omr.generation.config.elements/compositegridconfig/name/) { get; set; } | 网格名称。在 recognition 中用作标识符 |
| [RotationAngle](../../aspose.omr.generation.config.elements/compositegridconfig/rotationangle/) { get; set; } | 描述 Grid 元素绕其自身轴的旋转。 "90" - 将 CompositeGrid 旋转 90 度 "-90" - 将 ComopositeGrid 旋转至 -90 度 |
| override [Type](../../aspose.omr.generation.config.elements/compositegridconfig/type/) { get; set; } | omr 元素的类型。 JSON 序列化的必填字段. |
| [Values](../../aspose.omr.generation.config.elements/compositegridconfig/values/) { get; set; } | 将描述每列中可能的符号的字符串集合。 列特定值放置在[`ExtraRow`](./extrarow/) |
| [XPosition](../../aspose.omr.generation.config.elements/compositegridconfig/xposition/) { get; set; } | 页面上的网格 X 位置，覆盖 alignment |
| [YPosition](../../aspose.omr.generation.config.elements/compositegridconfig/yposition/) { get; set; } | 页面上的网格 Y 位置，覆盖 alignment |

## 字段

| 姓名 | 描述 |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/compositegridconfig/bubblesize/) | 气泡的大小 |
| [VerticalMargin](../../aspose.omr.generation.config.elements/compositegridconfig/verticalmargin/) | lines 之间的边距 |

### 也可以看看

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* 命名空间 [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* 部件 [Aspose.OMR](../../)


