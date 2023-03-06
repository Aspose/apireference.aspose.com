---
title: PostGisDriver.OpenDataset
second_title: Справочник по Aspose.GIS for .NET API
description: PostGisDriver метод. Открывает набор данных.
type: docs
weight: 10
url: /ru/net/aspose.gis.formats.postgis/postgisdriver/opendataset/
---
## PostGisDriver.OpenDataset method

Открывает набор данных.

```csharp
public override Dataset OpenDataset(IDbConnection connection)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| connection | IDbConnection | Открытое соединение с базой данных. |

### Возвращаемое значение

Экземпляр[`Dataset`](../../../aspose.gis/dataset/).

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Соединение`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Ошибка чтения набора данных. |
| IOException | Произошла ошибка ввода/вывода. |

### Смотрите также

* class [Dataset](../../../aspose.gis/dataset/)
* class [PostGisDriver](../)
* пространство имен [Aspose.Gis.Formats.PostGis](../../postgisdriver/)
* сборка [Aspose.GIS](../../../)


