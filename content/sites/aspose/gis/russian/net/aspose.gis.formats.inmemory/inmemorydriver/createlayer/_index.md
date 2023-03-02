---
title: InMemoryDriver.CreateLayer
second_title: Справочник по Aspose.GIS for .NET API
description: InMemoryDriver метод. Создает слой и открывает его для добавления новых объектов.
type: docs
weight: 40
url: /ru/net/aspose.gis.formats.inmemory/inmemorydriver/createlayer/
---
## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_3}

Создает слой и открывает его для добавления новых объектов.

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к файлу. |
| options | DriverOptions | Параметры, зависящие от драйвера. |
| spatialReferenceSystem | SpatialReferenceSystem | Пространственная система отсчета. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Исключения

| исключение | условие |
| --- | --- |
| InvalidOperationException | Слой уже существует. |

### Смотрите также

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [InMemoryDriver](../)
* пространство имен [Aspose.Gis.Formats.InMemory](../../inmemorydriver/)
* сборка [Aspose.GIS](../../../)

---

## CreateLayer() {#createlayer}

Создает слой и открывает его для добавления новых объектов.

```csharp
public VectorLayer CreateLayer()
```

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Смотрите также

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [InMemoryDriver](../)
* пространство имен [Aspose.Gis.Formats.InMemory](../../inmemorydriver/)
* сборка [Aspose.GIS](../../../)


