---
title: Row
second_title: Aspose.Slides for .NET API 参考
description: 表示表中的一行
type: docs
weight: 8980
url: /zh/net/aspose.slides/row/
---
## Row class

表示表中的一行。

```csharp
public sealed class Row : CellCollection, IRow
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Count](../../aspose.slides/cellcollection/count) { get; } | 返回集合中的单元格数。 只读Int32。 |
| [Height](../../aspose.slides/row/height) { get; } | 返回一行的高度。 只读Double。 |
| [IsSynchronized](../../aspose.slides/cellcollection/issynchronized) { get; } | 返回一个值，指示对集合的访问是否同步（线程安全）。 只读Boolean。 |
| [Item](../../aspose.slides/cellcollection/item) { get; } | 按位置返回单元格。 只读[`Cell`](../cell)。 |
| [MinimalHeight](../../aspose.slides/row/minimalheight) { get; set; } | 返回或设置行的最小可能高度。 读/写Double。 |
| [Presentation](../../aspose.slides/cellcollection/presentation) { get; } | 返回 CellCollection 的父表示。 只读[`IPresentation`](../ipresentation)。 |
| [RowFormat](../../aspose.slides/row/rowformat) { get; } | 返回包含该行格式属性的 RowFormat 对象。 只读[`IRowFormat`](../irowformat)。 |
| [Slide](../../aspose.slides/cellcollection/slide) { get; } | 返回 CellCollection 的父幻灯片。 只读[`IBaseSlide`](../ibaseslide)。 |
| [SyncRoot](../../aspose.slides/cellcollection/syncroot) { get; } | 返回同步根。 只读Object。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [CopyTo](../../aspose.slides/cellcollection/copyto)(Array, int) | 将集合中的所有元素复制到指定的数组。 |
| [GetEnumerator](../../aspose.slides/cellcollection/getenumerator)() | 返回一个遍历集合的枚举器。 |
| [SetTextFormat](../../aspose.slides/row/settextformat#settextformat)(IParagraphFormat) | 将定义的段落格式属性设置为所有行单元格的段落。 |
| [SetTextFormat](../../aspose.slides/row/settextformat#settextformat_1)(IPortionFormat) | 将定义的部分格式属性设置为所有行单元格的部分。 |
| [SetTextFormat](../../aspose.slides/row/settextformat#settextformat_2)(ITextFrameFormat) | 将定义的文本框格式属性设置为所有行单元格的文本框。 |

### 也可以看看

* class [CellCollection](../cellcollection)
* interface [IRow](../irow)
* 命名空间 [Aspose.Slides](../../aspose.slides)
* 部件 [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
