---
title: FileDriver.EditLayer
second_title: Справочник по Aspose.GIS for .NET API
description: FileDriver метод. Открывает слой для редактирования.
type: docs
weight: 70
url: /ru/net/aspose.gis/filedriver/editlayer/
---
## EditLayer(string, DriverOptions) {#editlayer_1}

Открывает слой для редактирования.

```csharp
public VectorLayer EditLayer(string path, DriverOptions options = null)
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

### Смотрите также

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* пространство имен [Aspose.Gis](../../filedriver/)
* сборка [Aspose.GIS](../../../)

---

## EditLayer(AbstractPath, DriverOptions) {#editlayer}

Открывает слой для редактирования.

```csharp
public virtual VectorLayer EditLayer(AbstractPath path, DriverOptions options = null)
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
| NotSupportedException | Драйвер не может редактировать слои. |
| IOException | Произошла ошибка ввода/вывода. |

### Примечания

Драйвер создает внутренний слой со всеми функциями. Но у нас есть возможность использовать дисковое пространство вместо оперативной памяти. Существуют драйверы для более оптимального использования ресурсов (см. документацию конкретного драйвера). Также драйвер может редактировать слой, если он может создавать и открывать слои.

### Смотрите также

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* пространство имен [Aspose.Gis](../../filedriver/)
* сборка [Aspose.GIS](../../../)


