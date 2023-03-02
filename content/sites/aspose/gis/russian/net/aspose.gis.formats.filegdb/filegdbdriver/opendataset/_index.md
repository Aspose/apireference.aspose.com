---
title: FileGdbDriver.OpenDataset
second_title: Справочник по Aspose.GIS for .NET API
description: FileGdbDriver метод. Открывает набор данных.
type: docs
weight: 70
url: /ru/net/aspose.gis.formats.filegdb/filegdbdriver/opendataset/
---
## OpenDataset(string, FileGdbOptions) {#opendataset_5}

Открывает набор данных.

```csharp
public Dataset OpenDataset(string path, FileGdbOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к набору данных. |
| options | FileGdbOptions | Параметры, зависящие от драйвера. |

### Возвращаемое значение

Экземпляр[`Dataset`](../../../aspose.gis/dataset/).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| ArgumentNullException | Путь`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Ошибка чтения слоя из набора данных. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Драйвер не может открыть наборы данных (см.[`CanOpenDatasets`](../canopendatasets/)). |

### Смотрите также

* class [Dataset](../../../aspose.gis/dataset/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* пространство имен [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* сборка [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, DriverOptions) {#opendataset_1}

Открывает набор данных.

```csharp
public override Dataset OpenDataset(AbstractPath path, DriverOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к набору данных. |
| options | DriverOptions | Параметры, зависящие от драйвера. |

### Возвращаемое значение

Экземпляр[`Dataset`](../../../aspose.gis/dataset/).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| ArgumentNullException | Путь`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Ошибка чтения слоя из набора данных. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Драйвер не может открыть наборы данных (см.[`CanOpenDatasets`](../canopendatasets/)). |

### Смотрите также

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [FileGdbDriver](../)
* пространство имен [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* сборка [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, FileGdbOptions) {#opendataset_2}

Открывает набор данных.

```csharp
public Dataset OpenDataset(AbstractPath path, FileGdbOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к набору данных. |
| options | FileGdbOptions | Параметры, зависящие от драйвера. |

### Возвращаемое значение

Экземпляр[`Dataset`](../../../aspose.gis/dataset/).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| ArgumentNullException | Путь`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Ошибка чтения слоя из набора данных. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Драйвер не может открыть наборы данных (см.[`CanOpenDatasets`](../canopendatasets/)). |

### Смотрите также

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* пространство имен [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* сборка [Aspose.GIS](../../../)


