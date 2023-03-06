---
title: FeaturesSequence.SaveTo
second_title: Справочник по Aspose.GIS for .NET API
description: FeaturesSequence метод. Сохраняет последовательность объектов в слой.
type: docs
weight: 50
url: /ru/net/aspose.gis/featuressequence/saveto/
---
## SaveTo(string, FileDriver) {#saveto_2}

Сохраняет последовательность объектов в слой.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| destinationPath | String | Путь к выходному слою. |
| destinationDriver | FileDriver | Драйвер формата для выходного слоя. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Любой аргумент`null`. |
| [GisException](../../gisexception/) | Ошибка чтения или записи функции в/из файла. |
| IOException | Произошла ошибка ввода/вывода. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Ошибка преобразования геометрии объектов из исходной системы пространственной привязки в целевую систему пространственной привязки. |

### Смотрите также

* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* пространство имен [Aspose.Gis](../../featuressequence/)
* сборка [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver) {#saveto}

Сохраняет последовательность объектов в слой.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| destinationPath | AbstractPath | Путь к выходному слою. |
| destinationDriver | FileDriver | Драйвер формата для выходного слоя. |

### Исключения

| исключение | условие |
| --- | --- |
| [GisException](../../gisexception/) | Ошибка чтения или записи функции в/из файла. |
| IOException | Произошла ошибка ввода/вывода. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Ошибка преобразования геометрии объектов из исходной системы пространственной привязки в целевую систему пространственной привязки. |

### Смотрите также

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* пространство имен [Aspose.Gis](../../featuressequence/)
* сборка [Aspose.GIS](../../../)

---

## SaveTo(string, FileDriver, SavingOptions) {#saveto_3}

Сохраняет последовательность объектов в слой.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver, SavingOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| destinationPath | String | Путь к выходному слою. |
| destinationDriver | FileDriver | Драйвер формата для выходного слоя. |
| options | SavingOptions | Варианты процедуры сохранения. |

### Исключения

| исключение | условие |
| --- | --- |
| [GisException](../../gisexception/) | Ошибка чтения или записи функции в/из файла. |
| IOException | Произошла ошибка ввода/вывода. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Ошибка преобразования геометрии объектов из исходной системы пространственной привязки в целевую систему пространственной привязки. |
| NotSupportedException | Пространственная система отсчета, указанная в*options* не поддерживается*destinationDriver* . |

### Смотрите также

* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* пространство имен [Aspose.Gis](../../featuressequence/)
* сборка [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver, SavingOptions) {#saveto_1}

Сохраняет последовательность объектов в слой.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver, 
    SavingOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| destinationPath | AbstractPath | Путь к выходному слою. |
| destinationDriver | FileDriver | Драйвер формата для выходного слоя. |
| options | SavingOptions | Варианты процедуры сохранения. |

### Исключения

| исключение | условие |
| --- | --- |
| [GisException](../../gisexception/) | Ошибка чтения или записи функции в/из файла. |
| IOException | Произошла ошибка ввода/вывода. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Ошибка преобразования геометрии объектов из исходной системы пространственной привязки в целевую систему пространственной привязки. |
| NotSupportedException | Пространственная система отсчета, указанная в*options* не поддерживается*destinationDriver* . |

### Смотрите также

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* пространство имен [Aspose.Gis](../../featuressequence/)
* сборка [Aspose.GIS](../../../)


