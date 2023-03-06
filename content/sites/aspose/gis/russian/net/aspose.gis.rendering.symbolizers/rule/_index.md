---
title: Class Rule
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.Rendering.Symbolizers.Rule сорт. Определенное пользователем правило дляRuleBasedSymbolizer .
type: docs
weight: 1920
url: /ru/net/aspose.gis.rendering.symbolizers/rule/
---
## Rule class

Определенное пользователем правило для[`RuleBasedSymbolizer`](../rulebasedsymbolizer/) .

```csharp
public class Rule
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [Filter](../../aspose.gis.rendering.symbolizers/rule/filter/) { get; } | Определяет, должно ли «правило фильтра» применять символизатор к объекту. Если возвращается`true` используется символизатор; в противном случае функция пропускается. |
| [IsElseRule](../../aspose.gis.rendering.symbolizers/rule/iselserule/) { get; } | Получает значение, указывающее, является ли это правило "другим правилом". |
| [IsFilterRule](../../aspose.gis.rendering.symbolizers/rule/isfilterrule/) { get; } | Получает значение, указывающее, является ли данное правило правилом-фильтром. |
| [Symbolizer](../../aspose.gis.rendering.symbolizers/rule/symbolizer/) { get; } | Символизатор для применения к функции. |

## Методы

| Имя | Описание |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.symbolizers/rule/createelserule/)(VectorSymbolizer) | Создает новое правило, которое применяет символизатор к объекту всякий раз, когда он не соответствует ни одному правилу фильтрации. |
| static [CreateFilterRule](../../aspose.gis.rendering.symbolizers/rule/createfilterrule/)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | Создает новое правило, которое применяет символизатор к объекту всякий раз, когда он проходит фильтр. |

### Смотрите также

* пространство имен [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* сборка [Aspose.GIS](../../)


