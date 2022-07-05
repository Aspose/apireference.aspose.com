---
title: VectorMapLayer
second_title: Справочник по Aspose.GIS for .NET API
description: Создает новый экземпляр с символизатором по умолчанию.
type: docs
weight: 10
url: /ru/net/aspose.gis.rendering/vectormaplayer/vectormaplayer/
---
## VectorMapLayer(FeaturesSequence) {#constructor}

Создает новый экземпляр с символизатором по умолчанию.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Последовательность признаков. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент:`null`. |

### Смотрите также

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorMapLayer](../../vectormaplayer)
* пространство имен [Aspose.Gis.Rendering](../../vectormaplayer)
* сборка [Aspose.GIS](../../../)

---

## VectorMapLayer(FeaturesSequence, VectorSymbolizer) {#constructor_1}

Создает новый экземпляр с символизатором по умолчанию.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Последовательность признаков. |
| symbolizer | VectorSymbolizer | Символизатор, используемый для рендеринга слоя. Если`null`, будет использоваться символизатор по умолчанию. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент:`null`. |

### Смотрите также

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [VectorMapLayer](../../vectormaplayer)
* пространство имен [Aspose.Gis.Rendering](../../vectormaplayer)
* сборка [Aspose.GIS](../../../)

---

## VectorMapLayer(FeaturesSequence, VectorSymbolizer, Labeling) {#constructor_2}

Создает новый экземпляр с символизатором по умолчанию.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, 
    Labeling labeling)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Последовательность признаков. |
| symbolizer | VectorSymbolizer | Символизатор, используемый для рендеринга слоя. Если`null`, будет использоваться символизатор по умолчанию. |
| labeling | Labeling | Надписи, используемые для надписывания объектов в слое. Если`null`, по умолчанию будет использоваться[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling). |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент:`null`. |

### Смотрите также

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling)
* class [VectorMapLayer](../../vectormaplayer)
* пространство имен [Aspose.Gis.Rendering](../../vectormaplayer)
* сборка [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, bool) {#constructor_5}

Создает новый экземпляр с символизатором по умолчанию.

```csharp
public VectorMapLayer(VectorLayer layer, bool keepOpen = true)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| layer | VectorLayer | Векторный слой. |
| keepOpen | Boolean | `true`чтобы оставить слой открытым после[`VectorMapLayer`](../../vectormaplayer)объект удален; в противном случае`false`. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Уровень`null`. |

### Смотрите также

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorMapLayer](../../vectormaplayer)
* пространство имен [Aspose.Gis.Rendering](../../vectormaplayer)
* сборка [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, VectorSymbolizer, bool) {#constructor_4}

Создает новый экземпляр.

```csharp
public VectorMapLayer(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = true)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| layer | VectorLayer | Векторный слой. |
| symbolizer | VectorSymbolizer | Символизатор, используемый для рендеринга слоя. Если`null`, будет использоваться символизатор по умолчанию. |
| keepOpen | Boolean | `true`чтобы оставить слой открытым после[`VectorMapLayer`](../../vectormaplayer)объект удален; в противном случае`false`. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Уровень`null`. |

### Смотрите также

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [VectorMapLayer](../../vectormaplayer)
* пространство имен [Aspose.Gis.Rendering](../../vectormaplayer)
* сборка [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, VectorSymbolizer, Labeling, bool) {#constructor_3}

Создает новый экземпляр.

```csharp
public VectorMapLayer(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = true)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| layer | VectorLayer | Векторный слой. |
| symbolizer | VectorSymbolizer | Символизатор, используемый для рендеринга слоя. Если`null`, будет использоваться символизатор по умолчанию. |
| labeling | Labeling | Надписи, используемые для подписи объектов в слое. Если`null`, по умолчанию будет использоваться[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling). |
| keepOpen | Boolean | `true`чтобы оставить слой открытым после[`VectorMapLayer`](../../vectormaplayer)объект удален; в противном случае`false`. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Уровень`null`. |

### Смотрите также

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling)
* class [VectorMapLayer](../../vectormaplayer)
* пространство имен [Aspose.Gis.Rendering](../../vectormaplayer)
* сборка [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
