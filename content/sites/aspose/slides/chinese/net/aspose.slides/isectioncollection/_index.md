---
title: ISectionCollection
second_title: Aspose.Slides for .NET API 参考
description: 表示节的集合
type: docs
weight: 6340
url: /zh/net/aspose.slides/isectioncollection/
---
## ISectionCollection interface

表示节的集合。

```csharp
public interface ISectionCollection : IGenericCollection<ISection>
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Item](../../aspose.slides/isectioncollection/item) { get; } | 获取指定索引处的元素。 只读[`ISection`](../isection)。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [AddEmptySection](../../aspose.slides/isectioncollection/addemptysection)(string, int) | 将空白部分添加到集合的指定位置。 |
| [AddSection](../../aspose.slides/isectioncollection/addsection)(string, ISlide) | 添加从特定幻灯片开始的新部分。 |
| [AppendEmptySection](../../aspose.slides/isectioncollection/appendemptysection)(string) | 将空白部分添加到集合的末尾。 |
| [Clear](../../aspose.slides/isectioncollection/clear)() | 从集合中删除所有部分。 |
| [IndexOf](../../aspose.slides/isectioncollection/indexof)(ISection) | 返回集合中指定部分的索引。 |
| [RemoveSection](../../aspose.slides/isectioncollection/removesection)(ISection) | 删除部分。该部分中包含的幻灯片将合并到上一部分中。 |
| [RemoveSectionWithSlides](../../aspose.slides/isectioncollection/removesectionwithslides)(ISection) | 删除部分和该部分中包含的幻灯片。 |
| [ReorderSectionWithSlides](../../aspose.slides/isectioncollection/reordersectionwithslides)(ISection, int) | 将部分及其幻灯片从集合移动到指定位置。 |

### 也可以看看

* interface [IGenericCollection&lt;T&gt;](../igenericcollection-1)
* interface [ISection](../isection)
* 命名空间 [Aspose.Slides](../../aspose.slides)
* 部件 [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
