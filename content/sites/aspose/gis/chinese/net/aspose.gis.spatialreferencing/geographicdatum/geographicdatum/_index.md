---
title: GeographicDatum.GeographicDatum
second_title: Aspose.GIS for .NET API 参考
description: GeographicDatum 构造函数. 创建新实例
type: docs
weight: 10
url: /zh/net/aspose.gis.spatialreferencing/geographicdatum/geographicdatum/
---
## GeographicDatum constructor

创建新实例。

```csharp
public GeographicDatum(string name, Ellipsoid ellipsoid, 
    BursaWolfParameters toWgs84Parameters = null, Identifier identifier = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| name | String | 该数据的名称。 |
| ellipsoid | Ellipsoid | 该基准面的椭球体。不能为空。 |
| toWgs84Parameters | BursaWolfParameters | 参数，可以给 bursa wolf 公式，将此数据中的坐标转换为 WGS84 数据中的坐标。 如果此数据接近 WGS84 且不需要转换，则将所有值设置为 0. 如果传递 bursa wolf 参数null，ToWgs84 将设置为[`IsNull`](../../bursawolfparameters/isnull/)参数. |
| identifier | Identifier | 该数据的标识符。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | ellipsoid一片空白。 |

### 也可以看看

* class [Ellipsoid](../../ellipsoid/)
* class [BursaWolfParameters](../../bursawolfparameters/)
* class [Identifier](../../identifier/)
* class [GeographicDatum](../)
* 命名空间 [Aspose.Gis.SpatialReferencing](../../geographicdatum/)
* 部件 [Aspose.GIS](../../../)


