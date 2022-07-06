---
title: Convert
second_title: Справочник по Aspose.GIS for .NET API
description: Преобразование слоя в другой формат.
type: docs
weight: 180
url: /ru/net/aspose.gis/vectorlayer/convert/
---
## Convert(string, FileDriver, string, FileDriver) {#convert_2}

Преобразование слоя в другой формат.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| sourcePath | String | Путь к слою, который будет преобразован. |
| sourceDriver | FileDriver | Драйвер формата для исходного слоя. |
| destinationPath | String | Путь к слою, который будет создан в результате преобразования. |
| destinationDriver | FileDriver | Драйвер формата для целевого слоя. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Любой из путей`null`. |

### Смотрите также

* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* пространство имен [Aspose.Gis](../../vectorlayer)
* сборка [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver) {#convert}

Преобразование слоя в другой формат.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| sourcePath | AbstractPath | Путь к слою, который будет преобразован. |
| sourceDriver | FileDriver | Драйвер формата для исходного слоя. |
| destinationPath | AbstractPath | Путь к слою, который будет создан в результате преобразования. |
| destinationDriver | FileDriver | Драйвер формата для целевого слоя. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Любой из путей`null`. |

### Смотрите также

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* пространство имен [Aspose.Gis](../../vectorlayer)
* сборка [Aspose.GIS](../../../)

---

## Convert(string, FileDriver, string, FileDriver, ConversionOptions) {#convert_3}

Преобразование слоя в другой формат.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver, ConversionOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| sourcePath | String | Путь к слою, который будет преобразован. |
| sourceDriver | FileDriver | Драйвер формата для исходного слоя. |
| destinationPath | String | Путь к слою, который будет создан в результате преобразования. |
| destinationDriver | FileDriver | Драйвер формата для целевого слоя. |
| options | ConversionOptions | Параметры процедуры преобразования. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Любой из путей`null`. |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| [GisException](../../gisexception) | Ошибка чтения или записи объекта в/из файла. |
| IOException | Произошла ошибка ввода-вывода. |
| NotSupportedException | Пространственная система отсчета, указанная в*options*не поддерживается*драйверназначения*. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception) | Преобразование геометрии объектов из исходной системы пространственной привязки в целевая система пространственной привязки не удалась. |

### Смотрите также

* class [FileDriver](../../filedriver)
* class [ConversionOptions](../../conversionoptions)
* class [VectorLayer](../../vectorlayer)
* пространство имен [Aspose.Gis](../../vectorlayer)
* сборка [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) {#convert_1}

Преобразование слоя в другой формат.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver, ConversionOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| sourcePath | AbstractPath | Путь к слою, который будет преобразован. |
| sourceDriver | FileDriver | Драйвер формата для исходного слоя. |
| destinationPath | AbstractPath | Путь к слою, который будет создан в результате преобразования. |
| destinationDriver | FileDriver | Драйвер формата для целевого слоя. |
| options | ConversionOptions | Параметры процедуры преобразования. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Любой из путей`null`. |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| [GisException](../../gisexception) | Ошибка чтения или записи объекта в/из файла. |
| IOException | Произошла ошибка ввода-вывода. |
| NotSupportedException | Пространственная система отсчета, указанная в*options*не поддерживается*драйверназначения*. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception) | Преобразование геометрии объектов из исходной системы пространственной привязки в целевая система пространственной привязки не удалась. |

### Смотрите также

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [ConversionOptions](../../conversionoptions)
* class [VectorLayer](../../vectorlayer)
* пространство имен [Aspose.Gis](../../vectorlayer)
* сборка [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
