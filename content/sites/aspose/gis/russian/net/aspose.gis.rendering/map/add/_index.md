---
title: Map.Add
second_title: Справочник по Aspose.GIS for .NET API
description: Map метод. СоздаетVectorMapLayer с символизатором по умолчанию и добавляет его на карту. Слои рендерятся в порядке добавления.
type: docs
weight: 110
url: /ru/net/aspose.gis.rendering/map/add/
---
## Add(VectorLayer, bool) {#add_7}

Создает[`VectorMapLayer`](../../vectormaplayer/) с символизатором по умолчанию и добавляет его на карту. Слои рендерятся в порядке добавления.

```csharp
public void Add(VectorLayer layer, bool keepOpen = false)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| layer | VectorLayer | Векторный слой для представления[`VectorMapLayer`](../../vectormaplayer/). |
| keepOpen | Boolean | `true` оставить векторный слой открытым после[`Map`](../) объект удален; `false` чтобы удалить слой. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Слой`null`. |

### Смотрите также

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [Map](../)
* пространство имен [Aspose.Gis.Rendering](../../map/)
* сборка [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, bool) {#add_6}

Создает и добавляет[`VectorMapLayer`](../../vectormaplayer/) к карте. Слои рендерятся в порядке добавления.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = false)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| layer | VectorLayer | Векторный слой для представления[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | Символизатор, используемый для рендеринга. Если`null`, используется символизатор по умолчанию. |
| keepOpen | Boolean | `true` оставить векторный слой открытым после[`Map`](../) объект удален; `false` чтобы удалить слой. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Слой`null`. |

### Смотрите также

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* пространство имен [Aspose.Gis.Rendering](../../map/)
* сборка [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, bool) {#add_5}

Создает и добавляет[`VectorMapLayer`](../../vectormaplayer/) к карте. Слои рендерятся в порядке добавления.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = false)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| layer | VectorLayer | Векторный слой для представления[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | Символизатор, используемый для рендеринга. Если`null`, используется символизатор по умолчанию. |
| labeling | Labeling | Надписи, используемые для подписи объектов в слое. Если`null` , по умолчанию[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) будет использоваться. |
| keepOpen | Boolean | `true` оставить слой открытым после[`Map`](../) объект утилизируется; в противном случае,`false` . |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Слой`null`. |

### Смотрите также

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* пространство имен [Aspose.Gis.Rendering](../../map/)
* сборка [Aspose.GIS](../../../)

---

## Add(FeaturesSequence) {#add}

Создает и добавляет[`VectorMapLayer`](../../vectormaplayer/) к карте. Слои рендерятся в порядке добавления.

```csharp
public void Add(FeaturesSequence featuresSequence)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Последовательность функций для представления[`VectorMapLayer`](../../vectormaplayer/). |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Последовательность функций`null`. |

### Смотрите также

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [Map](../)
* пространство имен [Aspose.Gis.Rendering](../../map/)
* сборка [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer) {#add_1}

Создает и добавляет[`VectorMapLayer`](../../vectormaplayer/) к карте. Слои рендерятся в порядке добавления.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Последовательность функций для представления[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | Символизатор, используемый для рендеринга. Если`null`, используется символизатор по умолчанию. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Последовательность функций`null`. |

### Смотрите также

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* пространство имен [Aspose.Gis.Rendering](../../map/)
* сборка [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer, Labeling) {#add_2}

Создает и добавляет[`VectorMapLayer`](../../vectormaplayer/) к карте. Слои рендерятся в порядке добавления.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, Labeling labeling)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Последовательность функций для представления[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | Символизатор, используемый для рендеринга. |
| labeling | Labeling | Надписи, используемые для подписи объектов в слое. Если`null` ,[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) будет использоваться. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Последовательность функций`null`. |

### Смотрите также

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* пространство имен [Aspose.Gis.Rendering](../../map/)
* сборка [Aspose.GIS](../../../)

---

## Add(MapLayer) {#add_4}

Добавляет слой на карту. Слои рендерятся в порядке добавления.

```csharp
public void Add(MapLayer mapLayer)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| mapLayer | MapLayer | Добавляемый слой. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null`. |

### Смотрите также

* class [MapLayer](../../maplayer/)
* class [Map](../)
* пространство имен [Aspose.Gis.Rendering](../../map/)
* сборка [Aspose.GIS](../../../)

---

## Add(RasterLayer, RasterColorizer, bool) {#add_3}

Создает[`RasterMapLayer`](../../rastermaplayer/) с колоризатором по умолчанию и добавляет его на карту.

```csharp
public void Add(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| layer | RasterLayer | Векторный слой для представления[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/). |
| colorizer | RasterColorizer | Colorizer для использования для рендеринга. Если`null`, используется колоризатор по умолчанию. |
| keepOpen | Boolean | `true` оставить растровый слой открытым после[`Map`](../) объект удален; `false` чтобы удалить слой. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Слой`null`. |

### Смотрите также

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer/)
* class [Map](../)
* пространство имен [Aspose.Gis.Rendering](../../map/)
* сборка [Aspose.GIS](../../../)


