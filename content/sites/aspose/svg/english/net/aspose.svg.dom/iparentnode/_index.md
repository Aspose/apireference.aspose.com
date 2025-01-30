---
title: IParentNode Interface
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Dom.IParentNode interface. Defines the IParentNode interface that is implemented by any possible parents
type: docs
weight: 3680
url: /net/aspose.svg.dom/iparentnode/
---
## IParentNode interface

Defines the `IParentNode` interface that is implemented by any possible parents.

```csharp
public interface IParentNode : IElementTraversal
```

## Properties

| Name | Description |
| --- | --- |
| [ChildElementCount](../../aspose.svg.dom/iparentnode/childelementcount/) { get; } | The childElementCount attribute must return the number of children of the context object that are elements. |
| [Children](../../aspose.svg.dom/iparentnode/children/) { get; } | Returns the child elements. |
| [FirstElementChild](../../aspose.svg.dom/iparentnode/firstelementchild/) { get; } | Returns the first child that is an element, and null otherwise. |
| [LastElementChild](../../aspose.svg.dom/iparentnode/lastelementchild/) { get; } | Returns the last child that is an element, and null otherwise. |

## Methods

| Name | Description |
| --- | --- |
| [QuerySelector](../../aspose.svg.dom/iparentnode/queryselector/)(string) | Returns the first element that is a descendant of node that matches selectors. |
| [QuerySelectorAll](../../aspose.svg.dom/iparentnode/queryselectorall/)(string) | Returns all element descendants of node that match selectors. |

### See Also

* interface [IElementTraversal](../../aspose.svg.dom.traversal/ielementtraversal/)
* namespace [Aspose.Svg.Dom](../../aspose.svg.dom/)
* assembly [Aspose.SVG](../../)
