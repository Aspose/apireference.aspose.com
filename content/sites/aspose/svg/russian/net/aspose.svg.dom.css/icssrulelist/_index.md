---
title: Interface ICSSRuleList
second_title: Справочник по Aspose.SVG для .NET API
description: Aspose.Svg.Dom.Css.ICSSRuleList интерфейс. Интерфейс CSSRuleList обеспечивает абстракцию упорядоченного набора правил CSS.
type: docs
weight: 630
url: /ru/net/aspose.svg.dom.css/icssrulelist/
---
## ICSSRuleList interface

Интерфейс CSSRuleList обеспечивает абстракцию упорядоченного набора правил CSS.

```csharp
public interface ICSSRuleList : IEnumerable<ICSSRule>
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [Item](../../aspose.svg.dom.css/icssrulelist/item/) { get; } | Используется для получения правила CSS методом item() (http://www.w3.org/TR/DOM-Level-2-Style/css.html#CSS-CSSRuleList). Порядок в этой коллекции представляет собой порядок правил в таблице стилей CSS. Если индекс больше или равен количеству правил в списке, возвращается null. |
| [Length](../../aspose.svg.dom.css/icssrulelist/length/) { get; } | Количество CSSRules в списке. Диапазон допустимых индексов дочерних правил — от 0 до длины 1 включительно. |

### Смотрите также

* interface [ICSSRule](../icssrule/)
* пространство имен [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* сборка [Aspose.SVG](../../)


