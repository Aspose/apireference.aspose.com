---
title: VectorLayer.CopyAttributes
second_title: Справочник по Aspose.GIS for .NET API
description: VectorLayer метод. Копирует атрибуты другихVectorLayer к этому.
type: docs
weight: 110
url: /ru/net/aspose.gis/vectorlayer/copyattributes/
---
## CopyAttributes(FeaturesSequence) {#copyattributes}

Копирует атрибуты других[`VectorLayer`](../) к этому.

```csharp
public void CopyAttributes(FeaturesSequence featuresSequence)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Последовательность объектов, из которой копируются атрибуты. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Входной слой`null`. |

### Смотрите также

* class [FeaturesSequence](../../featuressequence/)
* class [VectorLayer](../)
* пространство имен [Aspose.Gis](../../vectorlayer/)
* сборка [Aspose.GIS](../../../)

---

## CopyAttributes(FeaturesSequence, IAttributesConverter) {#copyattributes_1}

Копирует атрибуты других[`VectorLayer`](../) к этому.

```csharp
public void CopyAttributes(FeaturesSequence featuresSequence, IAttributesConverter converter)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Последовательность объектов, из которой копируются атрибуты. |
| converter | IAttributesConverter | Экземпляр пользовательского[`IAttributesConverter`](../../iattributesconverter/) который будет обрабатывать атрибуты один за другим. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Входной слой`null`. |

### Смотрите также

* class [FeaturesSequence](../../featuressequence/)
* interface [IAttributesConverter](../../iattributesconverter/)
* class [VectorLayer](../)
* пространство имен [Aspose.Gis](../../vectorlayer/)
* сборка [Aspose.GIS](../../../)


