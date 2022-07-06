---
title: Create
second_title: Справочник по Aspose.GIS for .NET API
description: Создает слой и открывает его для добавления новых объектов.
type: docs
weight: 10
url: /ru/net/aspose.gis/vectorlayer/create/
---
## Create(string, FileDriver) {#create_4}

Создает слой и открывает его для добавления новых объектов.

```csharp
public static VectorLayer Create(string path, FileDriver driver)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к файлу. |
| driver | FileDriver | Используемый драйвер. |

### Возвращаемое значение

Слой только для записи.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь:`null`. |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| [GisException](../../gisexception) | Ошибка записи объекта в файл. |
| IOException | Произошла ошибка ввода-вывода. |

### Смотрите также

* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* пространство имен [Aspose.Gis](../../vectorlayer)
* сборка [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions) {#create_5}

Создает слой и открывает его для добавления новых объектов.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к файлу. |
| driver | FileDriver | Используемый драйвер. |
| options | DriverOptions | Опции драйвера. |

### Возвращаемое значение

Слой только для записи.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь:`null`. |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| [GisException](../../gisexception) | Ошибка записи объекта в файл. |
| IOException | Произошла ошибка ввода-вывода. |

### Смотрите также

* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [VectorLayer](../../vectorlayer)
* пространство имен [Aspose.Gis](../../vectorlayer)
* сборка [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver) {#create}

Создает слой и открывает его для добавления новых объектов.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к файлу. |
| driver | FileDriver | Используемый драйвер. |

### Возвращаемое значение

Слой только для записи.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь:`null`. |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| [GisException](../../gisexception) | Ошибка записи объекта в файл. |
| IOException | Произошла ошибка ввода-вывода. |

### Смотрите также

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* пространство имен [Aspose.Gis](../../vectorlayer)
* сборка [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions) {#create_1}

Создает слой и открывает его для добавления новых объектов.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к файлу. |
| driver | FileDriver | Используемый драйвер. |
| options | DriverOptions | Опции драйвера. |

### Возвращаемое значение

Слой только для записи.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь:`null`. |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| [GisException](../../gisexception) | Ошибка записи объекта в файл. |
| IOException | Произошла ошибка ввода-вывода. |

### Смотрите также

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [VectorLayer](../../vectorlayer)
* пространство имен [Aspose.Gis](../../vectorlayer)
* сборка [Aspose.GIS](../../../)

---

## Create(string, FileDriver, SpatialReferenceSystem) {#create_7}

Создает слой и открывает его для добавления.

```csharp
public static VectorLayer Create(string path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к файлу. |
| driver | FileDriver | Используемый драйвер. |
| spatialReferenceSystem | SpatialReferenceSystem | Пространственная система отсчета. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../vectorlayer).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь:`null`. |
| [GisException](../../gisexception) | Ошибка чтения или записи объекта в/из файла. |
| IOException | Произошла ошибка ввода-вывода. |
| NotSupportedException | Пространственная система отсчета не поддерживается драйвером. Используйте[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem)чтобы проверить, поддерживается ли система пространственной привязки. |

### Смотрите также

* class [FileDriver](../../filedriver)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* пространство имен [Aspose.Gis](../../vectorlayer)
* сборка [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, SpatialReferenceSystem) {#create_3}

Создает слой и открывает его для добавления.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к файлу. |
| driver | FileDriver | Используемый драйвер. |
| spatialReferenceSystem | SpatialReferenceSystem | Пространственная система отсчета. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../vectorlayer).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь:`null`. |
| [GisException](../../gisexception) | Ошибка чтения или записи объекта в/из файла. |
| IOException | Произошла ошибка ввода-вывода. |
| NotSupportedException | Пространственная система отсчета не поддерживается драйвером. Используйте[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem)чтобы проверить, поддерживается ли система пространственной привязки. |

### Смотрите также

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* пространство имен [Aspose.Gis](../../vectorlayer)
* сборка [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_6}

Создает слой и открывает его для добавления.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к файлу. |
| driver | FileDriver | Используемый драйвер. |
| options | DriverOptions | Опции драйвера. |
| spatialReferenceSystem | SpatialReferenceSystem | Пространственная система отсчета. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../vectorlayer).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь:`null`. |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| [GisException](../../gisexception) | Ошибка чтения или записи объекта в/из файла. |
| IOException | Произошла ошибка ввода-вывода. |
| NotSupportedException | Пространственная система отсчета не поддерживается драйвером. Используйте[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem)чтобы проверить, поддерживается ли система пространственной привязки. |

### Смотрите также

* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* пространство имен [Aspose.Gis](../../vectorlayer)
* сборка [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_2}

Создает слой и открывает его для добавления.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к файлу. |
| driver | FileDriver | Используемый драйвер. |
| options | DriverOptions | Опции драйвера. |
| spatialReferenceSystem | SpatialReferenceSystem | Пространственная система отсчета. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../vectorlayer).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь:`null`. |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| [GisException](../../gisexception) | Ошибка чтения или записи объекта в/из файла. |
| IOException | Произошла ошибка ввода-вывода. |
| NotSupportedException | Пространственная система отсчета не поддерживается драйвером. Используйте[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem)чтобы проверить, поддерживается ли система пространственной привязки. |

### Смотрите также

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* пространство имен [Aspose.Gis](../../vectorlayer)
* сборка [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
