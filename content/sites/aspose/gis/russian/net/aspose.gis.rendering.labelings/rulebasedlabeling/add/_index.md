---
title: RuleBasedLabeling.Add
second_title: Справочник по Aspose.GIS for .NET API
description: RuleBasedLabeling метод. Добавляет новыйLabelingRule .
type: docs
weight: 40
url: /ru/net/aspose.gis.rendering.labelings/rulebasedlabeling/add/
---
## Add(Func&lt;Feature, bool&gt;, Labeling) {#add_1}

Добавляет новый[`LabelingRule`](../../labelingrule/) .

```csharp
public void Add(Func<Feature, bool> filter, Labeling labeling)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| filter | Func`2 | Определяет, когда маркировка должна применяться к объекту. |
| labeling | Labeling | Маркировка, применяемая к функции, когда*filter* возвращает истину. |

### Смотрите также

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [RuleBasedLabeling](../)
* пространство имен [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* сборка [Aspose.GIS](../../../)

---

## Add(LabelingRule) {#add}

Добавляет правило.

```csharp
public void Add(LabelingRule rule)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| rule | LabelingRule | Правило добавить. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null`. |

### Смотрите также

* class [LabelingRule](../../labelingrule/)
* class [RuleBasedLabeling](../)
* пространство имен [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* сборка [Aspose.GIS](../../../)


