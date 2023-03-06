---
title: Dataset.Open
second_title: Справочник по Aspose.GIS for .NET API
description: Dataset метод. Открывает набор данных.
type: docs
weight: 20
url: /ru/net/aspose.gis/dataset/open/
---
## Open(string, FileDriver) {#open_3}

Открывает набор данных.

```csharp
public static Dataset Open(string path, FileDriver driver)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к набору данных. |
| driver | FileDriver | Драйвер для использования. |

### Возвращаемое значение

Экземпляр[`Dataset`](../).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь`null`. |
| [GisException](../../gisexception/) | Ошибка чтения набора данных. |
| IOException | Произошла ошибка ввода/вывода. |

### Смотрите также

* class [FileDriver](../../filedriver/)
* class [Dataset](../)
* пространство имен [Aspose.Gis](../../dataset/)
* сборка [Aspose.GIS](../../../)

---

## Open(AbstractPath, FileDriver) {#open}

Открывает набор данных.

```csharp
public static Dataset Open(AbstractPath path, FileDriver driver)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к набору данных. |
| driver | FileDriver | Драйвер для использования. |

### Возвращаемое значение

Экземпляр[`Dataset`](../).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Путь`null`. |
| [GisException](../../gisexception/) | Ошибка чтения набора данных. |
| IOException | Произошла ошибка ввода/вывода. |

### Смотрите также

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [Dataset](../)
* пространство имен [Aspose.Gis](../../dataset/)
* сборка [Aspose.GIS](../../../)

---

## Open(string, FileDriver, DriverOptions) {#open_4}

Открывает набор данных.

```csharp
public static Dataset Open(string path, FileDriver driver, DriverOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | String | Путь к набору данных. |
| driver | FileDriver | Драйвер для использования. |
| options | DriverOptions | Параметры, зависящие от драйвера. |

### Возвращаемое значение

Экземпляр[`Dataset`](../).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| ArgumentNullException | Путь`null`. |
| [GisException](../../gisexception/) | Ошибка чтения набора данных. |
| IOException | Произошла ошибка ввода/вывода. |

### Смотрите также

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* пространство имен [Aspose.Gis](../../dataset/)
* сборка [Aspose.GIS](../../../)

---

## Open(AbstractPath, FileDriver, DriverOptions) {#open_1}

Открывает набор данных.

```csharp
public static Dataset Open(AbstractPath path, FileDriver driver, DriverOptions options)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к набору данных. |
| driver | FileDriver | Драйвер для использования. |
| options | DriverOptions | Параметры, зависящие от драйвера. |

### Возвращаемое значение

Экземпляр[`Dataset`](../).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| ArgumentNullException | Путь`null`. |
| [GisException](../../gisexception/) | Ошибка чтения набора данных. |
| IOException | Произошла ошибка ввода/вывода. |

### Смотрите также

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* пространство имен [Aspose.Gis](../../dataset/)
* сборка [Aspose.GIS](../../../)

---

## Open(IDbConnection, DatabaseDriver) {#open_2}

Открывает набор данных.

```csharp
public static Dataset Open(IDbConnection connection, DatabaseDriver driver)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| connection | IDbConnection | Открытое соединение с базой данных. |
| driver | DatabaseDriver | Драйвер для использования. |

### Возвращаемое значение

Экземпляр[`Dataset`](../).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentException | Объект параметров имеет неверный тип для этого драйвера. |
| ArgumentNullException | Путь`null`. |
| [GisException](../../gisexception/) | Ошибка чтения набора данных. |
| IOException | Произошла ошибка ввода/вывода. |

### Смотрите также

* class [DatabaseDriver](../../databasedriver/)
* class [Dataset](../)
* пространство имен [Aspose.Gis](../../dataset/)
* сборка [Aspose.GIS](../../../)


