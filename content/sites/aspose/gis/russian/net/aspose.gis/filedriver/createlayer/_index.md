---
title: CreateLayer
second_title: Справочник по Aspose.GIS for .NET API
description: Создает слой и открывает его для добавления.
type: docs
weight: 60
url: /ru/net/aspose.gis/filedriver/createlayer/
---
## CreateLayer(string) {#createlayer_4}

Создает слой и открывает его для добавления.

```csharp
public VectorLayer CreateLayer(string path)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к файлу. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../vectorlayer).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь`null`. |
| [GisException](../../gisexception) | Ошибка записи функции в файл. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Драйвер не может создавать векторные слои (см.[`CanCreateLayers`](../cancreatelayers)). |

### Смотрите также

* class [VectorLayer](../../vectorlayer)
* class [FileDriver](../../filedriver)
* пространство имен [Aspose.Gis](../../filedriver)
* сборка [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath) {#createlayer}

Создает слой и открывает его для добавления.

```csharp
public VectorLayer CreateLayer(AbstractPath path)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к файлу. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../vectorlayer).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь`null`. |
| [GisException](../../gisexception) | Ошибка записи функции в файл. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Драйвер не может создавать векторные слои (см.[`CanCreateLayers`](../cancreatelayers)). |

### Смотрите также

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* пространство имен [Aspose.Gis](../../filedriver)
* сборка [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions) {#createlayer_5}

Создает слой и открывает его для добавления.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к файлу. |
| options | DriverOptions | Параметры, зависящие от драйвера. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../vectorlayer).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь`null`. |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| [GisException](../../gisexception) | Ошибка записи функции в файл. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Драйвер не может создавать векторные слои (см.[`CanCreateLayers`](../cancreatelayers)). |

### Смотрите также

* class [VectorLayer](../../vectorlayer)
* class [DriverOptions](../../driveroptions)
* class [FileDriver](../../filedriver)
* пространство имен [Aspose.Gis](../../filedriver)
* сборка [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions) {#createlayer_1}

Создает слой и открывает его для добавления.

```csharp
public VectorLayer CreateLayer(AbstractPath path, DriverOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к файлу. |
| options | DriverOptions | Параметры, зависящие от драйвера. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../vectorlayer).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь`null`. |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| [GisException](../../gisexception) | Ошибка записи функции в файл. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Драйвер не может создавать векторные слои (см.[`CanCreateLayers`](../cancreatelayers)). |

### Смотрите также

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [DriverOptions](../../driveroptions)
* class [FileDriver](../../filedriver)
* пространство имен [Aspose.Gis](../../filedriver)
* сборка [Aspose.GIS](../../../)

---

## CreateLayer(string, SpatialReferenceSystem) {#createlayer_7}

Создает слой и открывает его для добавления.

```csharp
public VectorLayer CreateLayer(string path, SpatialReferenceSystem spatialReferenceSystem)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к файлу. |
| spatialReferenceSystem | SpatialReferenceSystem | Пространственная система отсчета. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../vectorlayer).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь`null`. |
| [GisException](../../gisexception) | Ошибка записи функции в файл. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Пространственная система отсчета не поддерживается драйвером. Использование[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem) чтобы проверить, поддерживается ли система пространственной привязки. |

### Смотрите также

* class [VectorLayer](../../vectorlayer)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* пространство имен [Aspose.Gis](../../filedriver)
* сборка [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, SpatialReferenceSystem) {#createlayer_3}

Создает слой и открывает его для добавления.

```csharp
public VectorLayer CreateLayer(AbstractPath path, SpatialReferenceSystem spatialReferenceSystem)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к файлу. |
| spatialReferenceSystem | SpatialReferenceSystem | Пространственная система отсчета. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../vectorlayer).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь`null`. |
| [GisException](../../gisexception) | Ошибка записи функции в файл. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Пространственная система отсчета не поддерживается драйвером. Использование[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem) чтобы проверить, поддерживается ли система пространственной привязки. |

### Смотрите также

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* пространство имен [Aspose.Gis](../../filedriver)
* сборка [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions, SpatialReferenceSystem) {#createlayer_6}

Создает слой и открывает его для добавления.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к файлу. |
| options | DriverOptions | Параметры, зависящие от драйвера. |
| spatialReferenceSystem | SpatialReferenceSystem | Пространственная система отсчета. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../vectorlayer).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь`null`. |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| [GisException](../../gisexception) | Ошибка записи функции в файл. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Пространственная система отсчета не поддерживается драйвером. Использование[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem) чтобы проверить, поддерживается ли система пространственной привязки. |
| NotSupportedException | Драйвер не может создавать векторные слои (см.[`CanCreateLayers`](../cancreatelayers)). |

### Смотрите также

* class [VectorLayer](../../vectorlayer)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* пространство имен [Aspose.Gis](../../filedriver)
* сборка [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

Создает слой и открывает его для добавления.

```csharp
public abstract VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к файлу. |
| options | DriverOptions | Параметры, зависящие от драйвера. |
| spatialReferenceSystem | SpatialReferenceSystem | Пространственная система отсчета. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../vectorlayer).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь`null`. |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| [GisException](../../gisexception) | Ошибка записи функции в файл. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Пространственная система отсчета не поддерживается драйвером. Использование[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem) чтобы проверить, поддерживается ли система пространственной привязки. |
| NotSupportedException | Драйвер не может создавать векторные слои (см.[`CanCreateLayers`](../cancreatelayers)). |

### Смотрите также

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* пространство имен [Aspose.Gis](../../filedriver)
* сборка [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
