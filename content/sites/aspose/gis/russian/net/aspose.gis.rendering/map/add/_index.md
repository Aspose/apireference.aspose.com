---
title: Add
second_title: Справочник по Aspose.GIS for .NET API
description: СоздаетVectorMapLayeraspose.gis.rendering/vectormaplayerс символизатором по умолчанию и добавляет его на карту. Слои отображаются в порядке добавления.
type: docs
weight: 110
url: /ru/net/aspose.gis.rendering/map/add/
---
## Add(VectorLayer, bool) {#add_7}

Создает[`VectorMapLayer`](../../vectormaplayer)с символизатором по умолчанию и добавляет его на карту. Слои отображаются в порядке добавления.

```csharp
public void Add(VectorLayer layer, bool keepOpen = false)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| layer | VectorLayer | Векторный слой для представления[`VectorMapLayer`](../../vectormaplayer). |
| keepOpen | Boolean | `true`чтобы оставить векторный слой открытым после[`Map`](../../map)объект утилизируется; `false`для удаления слоя. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Уровень`null`. |

### Смотрите также

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [Map](../../map)
* пространство имен [Aspose.Gis.Rendering](../../map)
* сборка [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, bool) {#add_6}

Создает и добавляет на карту[`VectorMapLayer`](../../vectormaplayer). Слои отображаются в порядке добавления.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = false)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| layer | VectorLayer | Векторный слой для представления[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Символизатор, используемый для рендеринга. Если`null`, используется символизатор по умолчанию. |
| keepOpen | Boolean | `true`чтобы оставить векторный слой открытым после[`Map`](../../map)объект утилизируется; `false`для удаления слоя. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Уровень`null`. |

### Смотрите также

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Map](../../map)
* пространство имен [Aspose.Gis.Rendering](../../map)
* сборка [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, bool) {#add_5}

Создает и добавляет на карту[`VectorMapLayer`](../../vectormaplayer). Слои отображаются в порядке добавления.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = false)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| layer | VectorLayer | Векторный слой для представления[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Символизатор, используемый для рендеринга. Если`null`, используется символизатор по умолчанию. |
| labeling | Labeling | Надписи, используемые для надписывания объектов в слое. Если`null`, по умолчанию будет использоваться[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling). |
| keepOpen | Boolean | `true`чтобы оставить слой открытым после[`Map`](../../map)объект удален; в противном случае`false`. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Уровень`null`. |

### Смотрите также

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling)
* class [Map](../../map)
* пространство имен [Aspose.Gis.Rendering](../../map)
* сборка [Aspose.GIS](../../../)

---

## Add(FeaturesSequence) {#add}

Создает и добавляет на карту[`VectorMapLayer`](../../vectormaplayer). Слои отображаются в порядке добавления.

```csharp
public void Add(FeaturesSequence featuresSequence)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Последовательность объектов для представления с помощью[`VectorMapLayer`](../../vectormaplayer). |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Последовательность функций:`null`. |

### Смотрите также

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [Map](../../map)
* пространство имен [Aspose.Gis.Rendering](../../map)
* сборка [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer) {#add_1}

Создает и добавляет на карту[`VectorMapLayer`](../../vectormaplayer). Слои отображаются в порядке добавления.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Последовательность объектов для представления с помощью[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Символизатор, используемый для рендеринга. Если`null`, используется символизатор по умолчанию. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Последовательность функций:`null`. |

### Смотрите также

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Map](../../map)
* пространство имен [Aspose.Gis.Rendering](../../map)
* сборка [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer, Labeling) {#add_2}

Создает и добавляет на карту[`VectorMapLayer`](../../vectormaplayer). Слои отображаются в порядке добавления.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, Labeling labeling)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Последовательность объектов для представления с помощью[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Символизатор, используемый для рендеринга. |
| labeling | Labeling | Надписи, используемые для надписывания объектов в слое. Если`null`,[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling)будет использоваться. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Последовательность функций:`null`. |

### Смотрите также

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling)
* class [Map](../../map)
* пространство имен [Aspose.Gis.Rendering](../../map)
* сборка [Aspose.GIS](../../../)

---

## Add(MapLayer) {#add_4}

Добавляет слой на карту. Слои отображаются в порядке добавления.

```csharp
public void Add(MapLayer mapLayer)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| mapLayer | MapLayer | Добавляемый слой. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент:`null`. |

### Смотрите также

* class [MapLayer](../../maplayer)
* class [Map](../../map)
* пространство имен [Aspose.Gis.Rendering](../../map)
* сборка [Aspose.GIS](../../../)

---

## Add(RasterLayer, RasterColorizer, bool) {#add_3}

Создает[`RasterMapLayer`](../../rastermaplayer)с колоризатором по умолчанию и добавляет его на карту.

```csharp
public void Add(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| layer | RasterLayer | Векторный слой для представления[`RasterLayer`](../../../aspose.gis.raster/rasterlayer). |
| colorizer | RasterColorizer | Колоризатор, используемый для рендеринга. Если`null`, используется раскрашиватель по умолчанию. |
| keepOpen | Boolean | `true`чтобы оставить растровый слой открытым после[`Map`](../../map)объект утилизируется; `false`для удаления слоя. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Уровень`null`. |

### Смотрите также

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer)
* class [Map](../../map)
* пространство имен [Aspose.Gis.Rendering](../../map)
* сборка [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
