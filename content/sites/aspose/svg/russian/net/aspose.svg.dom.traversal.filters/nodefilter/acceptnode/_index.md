---
title: NodeFilter.AcceptNode
second_title: Справочник по Aspose.SVG для .NET API
description: NodeFilter метод. Проверить виден ли указанный узел в логическом представлении a TreeWalker или NodeIterator. Эта функция будет вызываться реализацией TreeWalker и NodeIterator обычно он не вызывается напрямую из кода пользователя from . Хотя вы могли бы сделать это если бы хотели использовать фильтр same для управления логикой вашего собственного приложения.
type: docs
weight: 10
url: /ru/net/aspose.svg.dom.traversal.filters/nodefilter/acceptnode/
---
## NodeFilter.AcceptNode method

Проверить, виден ли указанный узел в логическом представлении a TreeWalker или NodeIterator. Эта функция будет вызываться реализацией TreeWalker и NodeIterator; обычно он не вызывается напрямую из кода пользователя from . (Хотя вы могли бы сделать это, если бы хотели использовать фильтр same для управления логикой вашего собственного приложения.)

```csharp
public abstract short AcceptNode(Node n)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| n | Node | узел, чтобы проверить, проходит ли он фильтр или нет. |

### Возвращаемое значение

константа для определения того, принят ли узел, отклонен или пропущен, как определено выше.

### Смотрите также

* class [Node](../../../aspose.svg.dom/node/)
* class [NodeFilter](../)
* пространство имен [Aspose.Svg.Dom.Traversal.Filters](../../nodefilter/)
* сборка [Aspose.SVG](../../../)


