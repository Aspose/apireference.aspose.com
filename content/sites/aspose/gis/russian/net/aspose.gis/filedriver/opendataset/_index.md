---
title: FileDriver.OpenDataset
second_title: Справочник по Aspose.GIS for .NET API
description: FileDriver метод. Открывает набор данных.
type: docs
weight: 80
url: /ru/net/aspose.gis/filedriver/opendataset/
---
## OpenDataset(string) {#opendataset_2}

Открывает набор данных.

```csharp
public Dataset OpenDataset(string path)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к набору данных. |

### Возвращаемое значение

Экземпляр[`Dataset`](../../dataset/).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь`null`. |
| [GisException](../../gisexception/) | Ошибка чтения набора данных. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Драйвер не может открыть наборы данных (см.[`CanOpenDatasets`](../canopendatasets/)). |

### Смотрите также

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* пространство имен [Aspose.Gis](../../filedriver/)
* сборка [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath) {#opendataset}

Открывает набор данных.

```csharp
public Dataset OpenDataset(AbstractPath path)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к набору данных. |

### Возвращаемое значение

Экземпляр[`Dataset`](../../dataset/).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь`null`. |
| [GisException](../../gisexception/) | Ошибка чтения набора данных. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Драйвер не может открыть наборы данных (см.[`CanOpenDatasets`](../canopendatasets/)). |

### Смотрите также

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* пространство имен [Aspose.Gis](../../filedriver/)
* сборка [Aspose.GIS](../../../)

---

## OpenDataset(string, DriverOptions) {#opendataset_3}

Открывает набор данных.

```csharp
public Dataset OpenDataset(string path, DriverOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к набору данных. |
| options | DriverOptions | Параметры, зависящие от драйвера. |

### Возвращаемое значение

Экземпляр[`Dataset`](../../dataset/).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| ArgumentNullException | Путь`null`. |
| [GisException](../../gisexception/) | Ошибка чтения набора данных. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Драйвер не может открыть наборы данных (см.[`CanOpenDatasets`](../canopendatasets/)). |

### Смотрите также

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* пространство имен [Aspose.Gis](../../filedriver/)
* сборка [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, DriverOptions) {#opendataset_1}

Открывает набор данных.

```csharp
public virtual Dataset OpenDataset(AbstractPath path, DriverOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к набору данных. |
| options | DriverOptions | Параметры, зависящие от драйвера. |

### Возвращаемое значение

Экземпляр[`Dataset`](../../dataset/).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| ArgumentNullException | Путь`null`. |
| [GisException](../../gisexception/) | Ошибка чтения набора данных. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Драйвер не может открыть наборы данных (см.[`CanOpenDatasets`](../canopendatasets/)). |

### Смотрите также

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* пространство имен [Aspose.Gis](../../filedriver/)
* сборка [Aspose.GIS](../../../)


