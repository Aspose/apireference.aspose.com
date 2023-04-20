---
title: SVGListBase1.ReplaceItem
second_title: Справочник по Aspose.SVG для .NET API
description: SVGListBase метод. Заменяет существующий элемент в списке новым элементом.
type: docs
weight: 110
url: /ru/net/aspose.svg.collections/svglistbase-1/replaceitem/
---
## SVGListBase&lt;T&gt;.ReplaceItem method

Заменяет существующий элемент в списке новым элементом.

```csharp
public T ReplaceItem(T newItem, ulong index)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| newItem | T | Элемент, который должен быть вставлен в список. |
| index | UInt64 | Индекс элемента, который необходимо заменить. Первый элемент имеет номер 0. |

### Возвращаемое значение

Вставленный элемент.

### Исключения

| исключение | условие |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | Код[`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.svg.dom/domexception/no_modification_allowed_err/). Возникает, когда список нельзя изменить. |
| [DOMException](../../../aspose.svg.dom/domexception/) | Код[`INDEX_SIZE_ERR`](../../../aspose.svg.dom/domexception/index_size_err/). Возникает, если номер индекса больше или равен numberOfItems. |

### Смотрите также

* class [SVGListBase&lt;T&gt;](../)
* пространство имен [Aspose.Svg.Collections](../../svglistbase-1/)
* сборка [Aspose.SVG](../../../)


