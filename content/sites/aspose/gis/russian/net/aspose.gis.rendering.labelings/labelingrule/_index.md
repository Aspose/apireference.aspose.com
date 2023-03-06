---
title: Class LabelingRule
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.Rendering.Labelings.LabelingRule сорт. Определенное пользователем правило дляRuleBasedLabeling .
type: docs
weight: 1630
url: /ru/net/aspose.gis.rendering.labelings/labelingrule/
---
## LabelingRule class

Определенное пользователем правило для[`RuleBasedLabeling`](../rulebasedlabeling/) .

```csharp
public class LabelingRule
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [Filter](../../aspose.gis.rendering.labelings/labelingrule/filter/) { get; } | Определяет, должно ли «правило фильтра» применять маркировку к объекту. Если возвращается`true` используется маркировка; в противном случае функция пропускается. |
| [IsElseRule](../../aspose.gis.rendering.labelings/labelingrule/iselserule/) { get; } | Получает значение, указывающее, является ли это правило "другим правилом". |
| [IsFilterRule](../../aspose.gis.rendering.labelings/labelingrule/isfilterrule/) { get; } | Получает значение, указывающее, является ли данное правило правилом-фильтром. |
| [Labeling](../../aspose.gis.rendering.labelings/labelingrule/labeling/) { get; } | Маркировка, применяемая к функции. |

## Методы

| Имя | Описание |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.labelings/labelingrule/createelserule/)(Labeling) | Создает новое правило, которое применяет метку к объекту всякий раз, когда он не соответствует ни одному правилу фильтрации. |
| static [CreateFilterRule](../../aspose.gis.rendering.labelings/labelingrule/createfilterrule/)(Func&lt;Feature, bool&gt;, Labeling) | Создает новое правило, которое применяет метку к объекту всякий раз, когда он проходит фильтр. |

### Смотрите также

* пространство имен [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* сборка [Aspose.GIS](../../)


