---
title: Class LayeredSymbolizer
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.Rendering.Symbolizers.LayeredSymbolizer сорт. Символизатор отображающий несколько других символизаторов.
type: docs
weight: 1830
url: /ru/net/aspose.gis.rendering.symbolizers/layeredsymbolizer/
---
## LayeredSymbolizer class

Символизатор, отображающий несколько других символизаторов.

```csharp
public class LayeredSymbolizer : VectorSymbolizer, IReadOnlyList<VectorSymbolizer>
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [LayeredSymbolizer](layeredsymbolizer/#constructor)() | Создает новый экземпляр. |
| [LayeredSymbolizer](layeredsymbolizer/#constructor_1)(RenderingOrder) | Создает новый экземпляр. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [Count](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/count/) { get; } | Получает количество символизаторов. |
| [Item](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/item/) { get; } | Получает символизатор по указанному индексу. |
| [RenderingOrder](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/renderingorder/) { get; set; } | Определяет порядок рендеринга. ByFeatures - визуализировать все символизаторы для объекта, затем перейти к следующему объекту.ByLayers - визуализировать все объекты с помощью символизатора, затем перейти к следующему символизатору. |

## Методы

| Имя | Описание |
| --- | --- |
| [Add](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/add/)(VectorSymbolizer) | Добавляет указанный символизатор. |
| [GetEnumerator](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/getenumerator/)() | Возвращает перечислитель, который выполняет итерацию по коллекции. |

### Смотрите также

* class [VectorSymbolizer](../vectorsymbolizer/)
* пространство имен [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* сборка [Aspose.GIS](../../)


