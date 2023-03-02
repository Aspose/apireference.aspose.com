---
title: RuleBasedSymbolizer.Add
second_title: Справочник по Aspose.GIS for .NET API
description: RuleBasedSymbolizer метод. Добавляет новыйRule .
type: docs
weight: 40
url: /ru/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/
---
## Add(Func&lt;Feature, bool&gt;, VectorSymbolizer) {#add_1}

Добавляет новый[`Rule`](../../rule/) .

```csharp
public void Add(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| filter | Func`2 | Определяет, когда символизатор следует применять к объекту. |
| symbolizer | VectorSymbolizer | Символизатор для применения к объекту, когда*filter* возвращает истину. |

### Смотрите также

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [RuleBasedSymbolizer](../)
* пространство имен [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* сборка [Aspose.GIS](../../../)

---

## Add(Rule) {#add}

Добавляет правило.

```csharp
public void Add(Rule rule)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| rule | Rule | Правило добавить. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null`. |

### Смотрите также

* class [Rule](../../rule/)
* class [RuleBasedSymbolizer](../)
* пространство имен [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* сборка [Aspose.GIS](../../../)


