---
title: 命名节点映射
second_title: Aspose.Finance 适用于 .NET API 参考
description: 表示可通过名称访问的属性集合。
type: docs
weight: 7450
url: /zh/net/aspose.finance.xbrl.dom/namednodemap/
---
## NamedNodeMap class

表示可通过名称访问的属性集合。

```csharp
public class NamedNodeMap : IEnumerable<Attr>
```

## 属性

| 名称 | 描述 |
| --- | --- |
| [Item](../../aspose.finance.xbrl.dom/namednodemap/item) { get; } | 获取具有指定名称的属性。（2 个索引器） |
| [Length](../../aspose.finance.xbrl.dom/namednodemap/length) { get; } | 获取映射中属性的数量。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [GetEnumerator](../../aspose.finance.xbrl.dom/namednodemap/getenumerator)() | 返回一个遍历映射的枚举器。 |
| [GetNamedItem](../../aspose.finance.xbrl.dom/namednodemap/getnameditem)(string) | 获取指定名称的属性。 |
| [GetNamedItemNS](../../aspose.finance.xbrl.dom/namednodemap/getnameditemns)(string, string) | 获取由本地名称和命名空间 URI 指定的属性。 |
| [RemoveNamedItem](../../aspose.finance.xbrl.dom/namednodemap/removenameditem)(string) | 移除指定名称的属性。 |
| [RemoveNamedItemNS](../../aspose.finance.xbrl.dom/namednodemap/removenameditemns)(string, string) | 移除由本地名称和命名空间 URI 指定的属性。 |
| [SetNamedItem](../../aspose.finance.xbrl.dom/namednodemap/setnameditem)(Attr) | 使用其 nodeName 属性添加节点。如果映射中已存在具有该名称的节点，则会被新节点替换。用自身替换节点没有任何效果。 |
| [SetNamedItemNS](../../aspose.finance.xbrl.dom/namednodemap/setnameditemns)(Attr) | 使用其 namespaceURI 和 localName 添加节点。如果映射中已存在具有该命名空间 URI 和本地名称的节点，则会被新节点替换。用自身替换节点没有任何效果。 |

### 另请参阅

* class [Attr](../attr)
* namespace [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
