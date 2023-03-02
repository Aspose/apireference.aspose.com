---
title: FileGdbOptions.ZTolerance
second_title: Справочник по Aspose.GIS for .NET API
description: FileGdbOptions свойство. Допуск привязки Z.
type: docs
weight: 80
url: /ru/net/aspose.gis.formats.filegdb/filegdboptions/ztolerance/
---
## FileGdbOptions.ZTolerance property

Допуск привязки Z.

```csharp
public double? ZTolerance { get; set; }
```

### Примечания

Это параметр создания, и он не влияет на чтение. Этот параметр управляет допуском привязки, используемым для расширенных функций ArcGIS. Он не влияет на поведение Aspose.GIS, но может использоваться ArcGIS. Единица параметра единица пространственной системы отсчета. Если установлено значение`null` , используется значение по умолчанию. Если система пространственной привязки неизвестна или имеет менее трех измерений, по умолчанию используется значение 0,001. Если пространственная система отсчета имеет три измерения , значение по умолчанию составляет 0,001 метра, преобразованное в единицу измерения третьего измерения.

### Смотрите также

* class [FileGdbOptions](../)
* пространство имен [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* сборка [Aspose.GIS](../../../)


