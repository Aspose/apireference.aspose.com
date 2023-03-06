---
title: FileDriver.OpenLayer
second_title: Справочник по Aspose.GIS for .NET API
description: FileDriver метод. Открывает слой для чтения.
type: docs
weight: 90
url: /ru/net/aspose.gis/filedriver/openlayer/
---
## OpenLayer(string) {#openlayer_2}

Открывает слой для чтения.

```csharp
public VectorLayer OpenLayer(string path)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к файлу. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../vectorlayer/).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь`null`. |
| [GisException](../../gisexception/) | Ошибка чтения функции из файла. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Драйвер не может открывать векторные слои (см.[`CanOpenLayers`](../canopenlayers/)). |

### Смотрите также

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* пространство имен [Aspose.Gis](../../filedriver/)
* сборка [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath) {#openlayer}

Открывает слой для чтения.

```csharp
public VectorLayer OpenLayer(AbstractPath path)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к файлу. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../vectorlayer/).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь`null`. |
| [GisException](../../gisexception/) | Ошибка чтения функции из файла. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Драйвер не может открывать векторные слои (см.[`CanOpenLayers`](../canopenlayers/)). |

### Смотрите также

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* пространство имен [Aspose.Gis](../../filedriver/)
* сборка [Aspose.GIS](../../../)

---

## OpenLayer(string, DriverOptions) {#openlayer_3}

Открывает слой для чтения.

```csharp
public VectorLayer OpenLayer(string path, DriverOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к файлу. |
| options | DriverOptions | Параметры, зависящие от драйвера. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../vectorlayer/).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| ArgumentNullException | Путь`null`. |
| [GisException](../../gisexception/) | Ошибка чтения функции из файла. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Драйвер не может открывать векторные слои (см.[`CanOpenLayers`](../canopenlayers/)). |

### Смотрите также

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* пространство имен [Aspose.Gis](../../filedriver/)
* сборка [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath, DriverOptions) {#openlayer_1}

Открывает слой для чтения.

```csharp
public abstract VectorLayer OpenLayer(AbstractPath path, DriverOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к файлу. |
| options | DriverOptions | Параметры, зависящие от драйвера. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../vectorlayer/).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| ArgumentNullException | Путь`null`. |
| [GisException](../../gisexception/) | Ошибка чтения функции из файла. |
| IOException | Произошла ошибка ввода/вывода. |
| NotSupportedException | Драйвер не может открывать векторные слои (см.[`CanOpenLayers`](../canopenlayers/)). |

### Смотрите также

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* пространство имен [Aspose.Gis](../../filedriver/)
* сборка [Aspose.GIS](../../../)


