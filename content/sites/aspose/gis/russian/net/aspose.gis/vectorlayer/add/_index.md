---
title: VectorLayer.Add
second_title: Справочник по Aspose.GIS for .NET API
description: VectorLayer метод. Добавляет в слой новый объект если поддерживаетсяVectorLayer сDriver .
type: docs
weight: 80
url: /ru/net/aspose.gis/vectorlayer/add/
---
## Add(Feature) {#add}

Добавляет в слой новый объект, если поддерживается[`VectorLayer`](../) с[`Driver`](../driver/) .

```csharp
public void Add(Feature feature)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| feature | Feature | Функция для добавления. |

### Исключения

| исключение | условие |
| --- | --- |
| InvalidOperationException | выбрасывается, если слой доступен только для чтения. |

### Смотрите также

* class [Feature](../../feature/)
* class [VectorLayer](../)
* пространство имен [Aspose.Gis](../../vectorlayer/)
* сборка [Aspose.GIS](../../../)

---

## Add(Feature, IFeatureStyle) {#add_1}

Добавляет в слой новый объект с указанным стилем, если поддерживается[`VectorLayer`](../) с[`Driver`](../driver/) .

```csharp
public virtual void Add(Feature feature, IFeatureStyle style)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| feature | Feature | Функция для добавления. |
| style | IFeatureStyle | Художественный стиль. Использовать`null` чтобы указать отсутствующий стиль. |

### Исключения

| исключение | условие |
| --- | --- |
| InvalidOperationException | вызывается, если слой не поддерживает стили или слой доступен только для чтения. |
| InvalidOperationException | выбрасывается, если редактируемые слои не поддерживают стили. |
| ArgumentException | выбрасывается, если стиль не соответствует типу драйвера. |

### Смотрите также

* class [Feature](../../feature/)
* interface [IFeatureStyle](../../ifeaturestyle/)
* class [VectorLayer](../)
* пространство имен [Aspose.Gis](../../vectorlayer/)
* сборка [Aspose.GIS](../../../)


