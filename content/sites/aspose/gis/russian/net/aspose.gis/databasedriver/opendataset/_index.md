---
title: DatabaseDriver.OpenDataset
second_title: Справочник по Aspose.GIS for .NET API
description: DatabaseDriver метод. Открывает набор данных.
type: docs
weight: 10
url: /ru/net/aspose.gis/databasedriver/opendataset/
---
## DatabaseDriver.OpenDataset method

Открывает набор данных.

```csharp
public abstract Dataset OpenDataset(IDbConnection connection)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| connection | IDbConnection | Открытое соединение с базой данных. |

### Возвращаемое значение

Экземпляр[`Dataset`](../../dataset/).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Соединение`null`. |
| [GisException](../../gisexception/) | Ошибка чтения набора данных. |
| IOException | Произошла ошибка ввода/вывода. |

### Смотрите также

* class [Dataset](../../dataset/)
* class [DatabaseDriver](../)
* пространство имен [Aspose.Gis](../../databasedriver/)
* сборка [Aspose.GIS](../../../)


