---
title: MapInfoTabDriver.CreateLayer
second_title: Справочник по Aspose.GIS for .NET API
description: MapInfoTabDriver метод. Создает слой и открывает его для добавления новых объектов.
type: docs
weight: 40
url: /ru/net/aspose.gis.formats.mapinfotab/mapinfotabdriver/createlayer/
---
## CreateLayer(string, MapInfoTabOptions) {#createlayer_9}

Создает слой и открывает его для добавления новых объектов.

```csharp
public VectorLayer CreateLayer(string path, MapInfoTabOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к файлу. |
| options | MapInfoTabOptions | Параметры, зависящие от драйвера. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Исключения

| исключение | условие |
| --- | --- |
| InvalidOperationException | Слой уже существует. |

### Смотрите также

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [MapInfoTabOptions](../../mapinfotaboptions/)
* class [MapInfoTabDriver](../)
* пространство имен [Aspose.Gis.Formats.MapInfoTab](../../mapinfotabdriver/)
* сборка [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, MapInfoTabOptions) {#createlayer_3}

Создает слой и открывает его для добавления новых объектов.

```csharp
public VectorLayer CreateLayer(AbstractPath path, MapInfoTabOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к файлу. |
| options | MapInfoTabOptions | Параметры, зависящие от драйвера. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Исключения

| исключение | условие |
| --- | --- |
| InvalidOperationException | Слой уже существует. |

### Смотрите также

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [MapInfoTabOptions](../../mapinfotaboptions/)
* class [MapInfoTabDriver](../)
* пространство имен [Aspose.Gis.Formats.MapInfoTab](../../mapinfotabdriver/)
* сборка [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

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
* class [MapInfoTabDriver](../)
* пространство имен [Aspose.Gis.Formats.MapInfoTab](../../mapinfotabdriver/)
* сборка [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, MapInfoTabOptions, SpatialReferenceSystem) {#createlayer_4}

Создает слой и открывает его для добавления новых объектов.

```csharp
public VectorLayer CreateLayer(AbstractPath path, MapInfoTabOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к файлу. |
| options | MapInfoTabOptions | Параметры, зависящие от драйвера. |
| spatialReferenceSystem | SpatialReferenceSystem | Пространственная система отсчета. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Исключения

| исключение | условие |
| --- | --- |
| InvalidOperationException | Слой уже существует. |
| NotSupportedException | Пространственная система отсчета не поддерживается драйвером. |

### Смотрите также

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [MapInfoTabOptions](../../mapinfotaboptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [MapInfoTabDriver](../)
* пространство имен [Aspose.Gis.Formats.MapInfoTab](../../mapinfotabdriver/)
* сборка [Aspose.GIS](../../../)


