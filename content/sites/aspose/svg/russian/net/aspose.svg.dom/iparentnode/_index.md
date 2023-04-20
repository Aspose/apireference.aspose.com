---
title: Interface IParentNode
second_title: Справочник по Aspose.SVG для .NET API
description: Aspose.Svg.Dom.IParentNode интерфейс. ОпределяетIParentNode интерфейс который реализуется любыми возможными родителями.
type: docs
weight: 1100
url: /ru/net/aspose.svg.dom/iparentnode/
---
## IParentNode interface

Определяет`IParentNode` интерфейс, который реализуется любыми возможными родителями.

```csharp
public interface IParentNode : IElementTraversal
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [ChildElementCount](../../aspose.svg.dom/iparentnode/childelementcount/) { get; } | Атрибут childElementCount должен возвращать количество дочерних элементов объекта контекста, которые являются элементами. |
| [Children](../../aspose.svg.dom/iparentnode/children/) { get; } | Возвращает дочерние элементы. |
| [FirstElementChild](../../aspose.svg.dom/iparentnode/firstelementchild/) { get; } | Возвращает первый дочерний элемент, иначе null. |
| [LastElementChild](../../aspose.svg.dom/iparentnode/lastelementchild/) { get; } | Возвращает последний дочерний элемент, в противном случае — null. |

## Методы

| Имя | Описание |
| --- | --- |
| [QuerySelector](../../aspose.svg.dom/iparentnode/queryselector/)(string) | Возвращает первый элемент, который является потомком узла, соответствующего селекторам. |
| [QuerySelectorAll](../../aspose.svg.dom/iparentnode/queryselectorall/)(string) | Возвращает все элементы-потомки узла, соответствующие селекторам. |

### Смотрите также

* interface [IElementTraversal](../../aspose.svg.dom.traversal/ielementtraversal/)
* пространство имен [Aspose.Svg.Dom](../../aspose.svg.dom/)
* сборка [Aspose.SVG](../../)


