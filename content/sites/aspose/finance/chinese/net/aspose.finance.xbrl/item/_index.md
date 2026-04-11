---
title: Item
second_title: Aspose.Finance 适用于 .NET API 参考
description: Item 是 XBRL item 元素的替代组中的一个元素。它包含简单事实的值以及用于正确解释该事实的数值项的上下文和单位的引用。
type: docs
weight: 7800
url: /zh/net/aspose.finance.xbrl/item/
---
## Item class

Item 是 XBRL 项目元素的替代组中的一个元素。它包含简单事实的值以及正确解释该事实所需的上下文引用（以及数值项目的单位）。

```csharp
public class Item : Fact
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [Item](item)(Concept) | 初始化一个新的 [`Item`](../item) 类实例。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [ContextRef](../../aspose.finance.xbrl/item/contextref) { get; set; } | 获取或设置对 [`Context`](../context) 的引用。 |
| [Decimals](../../aspose.finance.xbrl/item/decimals) { get; set; } | 获取或设置小数。 |
| [Id](../../aspose.finance.xbrl/fact/id) { get; set; } | 获取或设置事实的 id。 |
| [InfiniteDecimals](../../aspose.finance.xbrl/item/infinitedecimals) { get; set; } | 获取或设置此项是否具有无限小数。 |
| [InfinitePrecision](../../aspose.finance.xbrl/item/infiniteprecision) { get; set; } | 获取或设置此项是否具有无限精度。 |
| [Name](../../aspose.finance.xbrl/fact/name) { get; set; } | 获取或设置事实的限定名称。 |
| [NilSpecified](../../aspose.finance.xbrl/item/nilspecified) { get; set; } | 获取或设置此项是否为 nil。 |
| [Precision](../../aspose.finance.xbrl/item/precision) { get; set; } | 获取或设置精度。 |
| [SchemaConcept](../../aspose.finance.xbrl/item/schemaconcept) { get; } | 获取概念。 |
| [UnitRef](../../aspose.finance.xbrl/item/unitref) { get; set; } | 获取或设置对 [`Unit`](../unit) 的引用。 |
| [Value](../../aspose.finance.xbrl/item/value) { get; set; } | 获取或设置该值。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [IsTextBlock](../../aspose.finance.xbrl/item/istextblock)() | 检查此项是否为文本块。 |

### 另请参阅

* class [Fact](../fact)
* namespace [Aspose.Finance.Xbrl](../../aspose.finance.xbrl)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
