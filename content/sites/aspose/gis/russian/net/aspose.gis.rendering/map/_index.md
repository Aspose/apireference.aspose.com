---
title: Class Map
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.Rendering.Map сорт. Карта  это набор слоев которые можно отображать друг поверх друга с помощьюRenderer .
type: docs
weight: 1720
url: /ru/net/aspose.gis.rendering/map/
---
## Map class

Карта — это набор слоев, которые можно отображать друг поверх друга с помощью[`Renderer`](../renderer/) .

```csharp
public class Map : IDisposable, IReadOnlyList<MapLayer>
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Map](map/)(Measurement, Measurement) | Создает новый экземпляр`карта` класс. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [BackgroundColor](../../aspose.gis.rendering/map/backgroundcolor/) { get; set; } | Цвет фона карты. По умолчаниюTransparent . |
| [Count](../../aspose.gis.rendering/map/count/) { get; } | Получает количество слоев на карте. |
| [Extent](../../aspose.gis.rendering/map/extent/) { get; set; } | Указывает границы карты для визуализации. Если установлено значение`null` , экстент вычисляется во время рендеринга, чтобы включить всю геометрию во всех слоях. |
| [Height](../../aspose.gis.rendering/map/height/) { get; set; } | Визуальная высота карты. |
| [Item](../../aspose.gis.rendering/map/item/) { get; } | Получает слой по указанному индексу. |
| [Padding](../../aspose.gis.rendering/map/padding/) { get; set; } | Указывает заполнение для добавления к экстенту. |
| [Resolution](../../aspose.gis.rendering/map/resolution/) { get; set; } | Разрешение, которое будет использоваться для рендеринга этой карты и преобразования между[`Measurement`](../measurement/) . По умолчанию 96. |
| [SpatialReferenceSystem](../../aspose.gis.rendering/map/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](./spatialreferencesystem/) карты. |
| [Width](../../aspose.gis.rendering/map/width/) { get; set; } | Визуальная ширина карты. |

## Методы

| Имя | Описание |
| --- | --- |
| [Add](../../aspose.gis.rendering/map/add/#add)(FeaturesSequence) | Создает и добавляет[`VectorMapLayer`](../vectormaplayer/) к карте. Слои рендерятся в порядке добавления. |
| [Add](../../aspose.gis.rendering/map/add/#add_4)(MapLayer) | Добавляет слой на карту. Слои рендерятся в порядке добавления. |
| [Add](../../aspose.gis.rendering/map/add/#add_1)(FeaturesSequence, VectorSymbolizer) | Создает и добавляет[`VectorMapLayer`](../vectormaplayer/) к карте. Слои рендерятся в порядке добавления. |
| [Add](../../aspose.gis.rendering/map/add/#add_7)(VectorLayer, bool) | Создает[`VectorMapLayer`](../vectormaplayer/) с символизатором по умолчанию и добавляет его на карту. Слои рендерятся в порядке добавления. |
| [Add](../../aspose.gis.rendering/map/add/#add_2)(FeaturesSequence, VectorSymbolizer, Labeling) | Создает и добавляет[`VectorMapLayer`](../vectormaplayer/) к карте. Слои рендерятся в порядке добавления. |
| [Add](../../aspose.gis.rendering/map/add/#add_3)(RasterLayer, RasterColorizer, bool) | Создает[`RasterMapLayer`](../rastermaplayer/) с колоризатором по умолчанию и добавляет его на карту. |
| [Add](../../aspose.gis.rendering/map/add/#add_6)(VectorLayer, VectorSymbolizer, bool) | Создает и добавляет[`VectorMapLayer`](../vectormaplayer/) к карте. Слои рендерятся в порядке добавления. |
| [Add](../../aspose.gis.rendering/map/add/#add_5)(VectorLayer, VectorSymbolizer, Labeling, bool) | Создает и добавляет[`VectorMapLayer`](../vectormaplayer/) к карте. Слои рендерятся в порядке добавления. |
| [Dispose](../../aspose.gis.rendering/map/dispose/)() | Распоряжается ресурсами. |
| [GetEnumerator](../../aspose.gis.rendering/map/getenumerator/)() | Возвращает перечислитель, который перебирает слои на карте. |
| [Render](../../aspose.gis.rendering/map/render/#render)(AbstractPath, Renderer) | Визуализирует карту в файл. |
| [Render](../../aspose.gis.rendering/map/render/#render_1)(string, Renderer) | Визуализирует карту в файл. |

### Смотрите также

* class [MapLayer](../maplayer/)
* пространство имен [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* сборка [Aspose.GIS](../../)


