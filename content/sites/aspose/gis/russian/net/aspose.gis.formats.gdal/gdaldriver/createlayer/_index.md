---
title: GdalDriver.CreateLayer
second_title: Справочник по Aspose.GIS for .NET API
description: GdalDriver метод. Создает слой и открывает его для добавления новых объектов.
type: docs
weight: 40
url: /ru/net/aspose.gis.formats.gdal/gdaldriver/createlayer/
---
## GdalDriver.CreateLayer method

Создает слой и открывает его для добавления новых объектов.

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| path | AbstractPath | Путь к файлу. |
| options | DriverOptions | Параметры, зависящие от драйвера. |
| spatialReferenceSystem | SpatialReferenceSystem | Пространственная система отсчета. |

### Возвращаемое значение

Экземпляр[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Исключения

| исключение | условие |
| --- | --- |
| InvalidOperationException | Слой уже существует. |
| NotSupportedException | Пространственная система отсчета не поддерживается драйвером. |

### Смотрите также

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [GdalDriver](../)
* пространство имен [Aspose.Gis.Formats.GDAL](../../gdaldriver/)
* сборка [Aspose.GIS](../../../)


