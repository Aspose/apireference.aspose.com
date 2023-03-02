---
title: Class GeographicDatum
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.SpatialReferencing.GeographicDatum 班级. 地理数据将经度和纬度与地球上的特定位置相关联
type: docs
weight: 2120
url: /zh/net/aspose.gis.spatialreferencing/geographicdatum/
---
## GeographicDatum class

地理数据将经度和纬度与地球上的特定位置相关联。

```csharp
public class GeographicDatum : IdentifiableObject
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [GeographicDatum](geographicdatum/)(string, Ellipsoid, BursaWolfParameters, Identifier) | 创建新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| static [Etrs89](../../aspose.gis.spatialreferencing/geographicdatum/etrs89/) { get; } | ETRS 89 数据. |
| static [Nad83](../../aspose.gis.spatialreferencing/geographicdatum/nad83/) { get; } | NAD 83 数据. |
| static [Osgb36](../../aspose.gis.spatialreferencing/geographicdatum/osgb36/) { get; } | OSGB 1936 数据. |
| static [Wgs72](../../aspose.gis.spatialreferencing/geographicdatum/wgs72/) { get; } | WGS 72 基准. |
| static [Wgs84](../../aspose.gis.spatialreferencing/geographicdatum/wgs84/) { get; } | WGS 84 基准. |
| [Ellipsoid](../../aspose.gis.spatialreferencing/geographicdatum/ellipsoid/) { get; } | Ellipsoid，在此基准中用于近似地球。 |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | 如果此对象标识符是 EPSG 标识符 - 返回其代码。否则 - 返回 -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | 此可识别对象的标识符。 |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | 此对象的名称。 |
| [ToWgs84Parameters](../../aspose.gis.spatialreferencing/geographicdatum/towgs84parameters/) { get; } | BursaWolfParamters 可用于将此数据中的坐标转换为 WGS84 数据中的坐标。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum) | 判断两个基准是否等价。 等价基准的相同坐标匹配地球上相同的地方。 等价基准的某些参数可以不同，例如[`Name`](../identifiableobject/name/). |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | 返回表示当前对象的字符串。 |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum, GeographicDatum) | 判断两个基准是否等价。 等价基准的相同坐标匹配地球上相同的地方。 等价基准的某些参数可以不同，例如[`Name`](../identifiableobject/name/). |

### 也可以看看

* class [IdentifiableObject](../identifiableobject/)
* 命名空间 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 部件 [Aspose.GIS](../../)


