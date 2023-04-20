---
title: Class NamedNodeMap
second_title: Aspose.SVG for .NET API 参考
description: Aspose.Svg.Collections.NamedNodeMap 班级. 表示可以通过名称访问的属性集合
type: docs
weight: 30
url: /zh/net/aspose.svg.collections/namednodemap/
---
## NamedNodeMap class

表示可以通过名称访问的属性集合。

```csharp
public class NamedNodeMap : DOMObject, IDisposable, IEnumerable<Attr>
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Item](../../aspose.svg.collections/namednodemap/item/) { get; } | 返回地图中的第 index 个项目。如果索引大于或等于此映射中的节点数，则返回 null. (2 indexers) |
| [Length](../../aspose.svg.collections/namednodemap/length/) { get; } | 此映射中的节点数。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [GetEnumerator](../../aspose.svg.collections/namednodemap/getenumerator/)() | 返回一个遍历集合的枚举器。 |
| [GetNamedItem](../../aspose.svg.collections/namednodemap/getnameditem/)(string) | 检索名称指定的节点。 |
| [GetNamedItemNS](../../aspose.svg.collections/namednodemap/getnameditemns/)(string, string) | 检索由本地名称和命名空间 URI 指定的节点。 |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | 此方法用于检索 ECMAScript 对象Type . |
| [RemoveNamedItem](../../aspose.svg.collections/namednodemap/removenameditem/)(string) | 删除名称指定的节点。 |
| [RemoveNamedItemNS](../../aspose.svg.collections/namednodemap/removenameditemns/)(string, string) | 删除由本地名称和命名空间 URI 指定的节点。 |
| [SetNamedItem](../../aspose.svg.collections/namednodemap/setnameditem/)(Attr) | 使用节点名称属性添加节点。如果具有该名称的节点已存在于此映射中，则将其替换为新节点。自己替换一个节点是没有效果的。 |
| [SetNamedItemNS](../../aspose.svg.collections/namednodemap/setnameditemns/)(Attr) | 使用其名称空间 URI 和本地名称添加节点。如果具有该名称空间 URI 和该本地名称的节点已存在于此映射中，则它将被新节点替换。自己替换一个节点是没有效果的。 |

### 也可以看看

* class [DOMObject](../../aspose.svg.dom/domobject/)
* class [Attr](../../aspose.svg.dom/attr/)
* 命名空间 [Aspose.Svg.Collections](../../aspose.svg.collections/)
* 部件 [Aspose.SVG](../../)


