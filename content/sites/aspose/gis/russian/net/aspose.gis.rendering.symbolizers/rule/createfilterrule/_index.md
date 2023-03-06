---
title: Rule.CreateFilterRule
second_title: Справочник по Aspose.GIS for .NET API
description: Rule метод. Создает новое правило которое применяет символизатор к объекту всякий раз когда он проходит фильтр.
type: docs
weight: 20
url: /ru/net/aspose.gis.rendering.symbolizers/rule/createfilterrule/
---
## Rule.CreateFilterRule method

Создает новое правило, которое применяет символизатор к объекту всякий раз, когда он проходит фильтр.

```csharp
public static Rule CreateFilterRule(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| filter | Func`2 | Определяет, когда следует использовать символизатор. |
| symbolizer | VectorSymbolizer | Символизатор для применения. |

### Возвращаемое значение

Новый объект правила.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Фильтр есть`null`. |

### Смотрите также

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [Rule](../)
* пространство имен [Aspose.Gis.Rendering.Symbolizers](../../rule/)
* сборка [Aspose.GIS](../../../)


