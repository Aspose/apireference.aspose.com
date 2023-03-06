---
title: FileGdbOptions.EnsureValidCoordinatesRange
second_title: Справочник по Aspose.GIS for .NET API
description: FileGdbOptions свойство. Должны ли координаты быть в допустимом диапазоне.
type: docs
weight: 30
url: /ru/net/aspose.gis.formats.filegdb/filegdboptions/ensurevalidcoordinatesrange/
---
## FileGdbOptions.EnsureValidCoordinatesRange property

Должны ли координаты быть в допустимом диапазоне.

```csharp
public bool EnsureValidCoordinatesRange { get; set; }
```

### Примечания

Это параметр создания, и он не влияет на чтение. Если установлено значение`true` исключение будет вызвано при попытке записать координату с values вне допустимого диапазона. Если установлено`false` такая координата будет записана молча. Допустимый диапазон определяется[`CoordinatePrecisionGrid`](../coordinateprecisiongrid/) . Ссылаться на[`CoordinatePrecisionGrid`](../coordinateprecisiongrid/) документацию, чтобы прочитать о том, как допустимый диапазон определяется по координатной сетке точности. Значение по умолчанию:`false` .

### Смотрите также

* class [FileGdbOptions](../)
* пространство имен [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* сборка [Aspose.GIS](../../../)


