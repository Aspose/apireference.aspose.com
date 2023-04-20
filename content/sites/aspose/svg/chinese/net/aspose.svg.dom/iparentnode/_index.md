---
title: Interface IParentNode
second_title: Aspose.SVG for .NET API 参考
description: Aspose.Svg.Dom.IParentNode 界面. 定义IParentNode由任何可能的父母实现的接口
type: docs
weight: 1100
url: /zh/net/aspose.svg.dom/iparentnode/
---
## IParentNode interface

定义`IParentNode`由任何可能的父母实现的接口。

```csharp
public interface IParentNode : IElementTraversal
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [ChildElementCount](../../aspose.svg.dom/iparentnode/childelementcount/) { get; } | childElementCount 属性必须返回作为元素的上下文对象的子项数。 |
| [Children](../../aspose.svg.dom/iparentnode/children/) { get; } | 返回子元素。 |
| [FirstElementChild](../../aspose.svg.dom/iparentnode/firstelementchild/) { get; } | 返回作为元素的第一个子元素，否则返回 null。 |
| [LastElementChild](../../aspose.svg.dom/iparentnode/lastelementchild/) { get; } | 返回作为元素的最后一个子元素，否则返回 null。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [QuerySelector](../../aspose.svg.dom/iparentnode/queryselector/)(string) | 返回第一个元素，它是与选择器匹配的节点的后代。 |
| [QuerySelectorAll](../../aspose.svg.dom/iparentnode/queryselectorall/)(string) | 返回与选择器匹配的节点的所有元素后代。 |

### 也可以看看

* interface [IElementTraversal](../../aspose.svg.dom.traversal/ielementtraversal/)
* 命名空间 [Aspose.Svg.Dom](../../aspose.svg.dom/)
* 部件 [Aspose.SVG](../../)


