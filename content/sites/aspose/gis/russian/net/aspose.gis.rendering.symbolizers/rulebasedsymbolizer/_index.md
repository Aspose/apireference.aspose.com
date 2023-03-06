---
title: Class RuleBasedSymbolizer
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.Rendering.Symbolizers.RuleBasedSymbolizer сорт. Применяет символизатор к геометрии объектов в соответствии с определенными пользователем правилами.
type: docs
weight: 1930
url: /ru/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/
---
## RuleBasedSymbolizer class

Применяет символизатор к геометрии объектов в соответствии с определенными пользователем правилами.

```csharp
public class RuleBasedSymbolizer : VectorSymbolizer, IReadOnlyList<Rule>
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [RuleBasedSymbolizer](rulebasedsymbolizer/)() | Конструктор по умолчанию. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Count](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/count/) { get; } | Получает количество правил. |
| [Item](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/item/) { get; } | Получает правило по указанному индексу. |

## Методы

| Имя | Описание |
| --- | --- |
| [Add](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/#add)(Rule) | Добавляет правило. |
| [Add](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/#add_1)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | Добавляет новый[`Rule`](../rule/) . |
| [AddElseRule](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/addelserule/)(VectorSymbolizer) | Добавляет символизатор, который будет применяться к объектам, которые не соответствуют ни одному правилу фильтрации. |
| [GetEnumerator](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/getenumerator/)() | Возвращает перечислитель, который перебирает правила. |

### Смотрите также

* class [VectorSymbolizer](../vectorsymbolizer/)
* class [Rule](../rule/)
* пространство имен [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* сборка [Aspose.GIS](../../)


