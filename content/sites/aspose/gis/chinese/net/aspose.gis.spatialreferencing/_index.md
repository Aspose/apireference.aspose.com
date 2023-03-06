---
title: Aspose.Gis.SpatialReferencing
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.空间参考命名空间提供用于处理空间参考坐标参考系统的类
type: docs
weight: 370
url: /zh/net/aspose.gis.spatialreferencing/
---
`Aspose.Gis.空间参考`命名空间提供用于处理空间参考（坐标参考系统）的类。

## 课程

| 班级 | 描述 |
| --- | --- |
| [Axis](./axis/) | 一个轴描述了 SRS 的一个维度。 |
| [BursaWolfParameters](./bursawolfparameters/) | 包含 Bursa-Wolf 公式参数以转换为另一个数据的类。 |
| [CompoundSpatialReferenceSystem](./compoundspatialreferencesystem/) | 复合 SRS 将两个基础 SRS 结合在一起，它们都不能是复合的。 |
| [Ellipsoid](./ellipsoid/) | Ellipsoid 表示椭圆体，近似于地球。 |
| [GeocentricSpatialReferenceSystem](./geocentricspatialreferencesystem/) | Geocentric SRS 是原点在地球中心的 3 维笛卡尔 SRS。 |
| [GeocentricSpatialReferenceSystemParameters](./geocentricspatialreferencesystemparameters/) | 创建地心 SRS 的参数。 参数具有合理的默认值，因此您只需分配其中的一些参数。 如果您分配`null`对于任何参数，将使用默认值。 |
| [GeographicDatum](./geographicdatum/) | 地理数据将经度和纬度与地球上的特定位置相关联。 |
| [GeographicSpatialReferenceSystem](./geographicspatialreferencesystem/) | Geographic SRS是基于经度和纬度的SRS。 Geographic SRS可以是二维的，也可以是三维的。 如果地理SRS是三维的，那么它实际上是二维SRS和垂直SRS的复合SRS。 |
| [GeographicSpatialReferenceSystemParameters](./geographicspatialreferencesystemparameters/) | 用于创建地理 SRS 的参数。 参数具有合理的默认值，因此您只需分配其中的一些参数。 如果您分配`null`对于任何参数，将使用默认值。 |
| [IdentifiableObject](./identifiableobject/) | 表示可能具有 EPSG 代码和名称的对象。 |
| [Identifier](./identifier/) | 表示标识符 - 对对象外部描述的引用。 如果从 WKT 创建 SRS，[`Identifier`](../aspose.gis.spatialreferencing/identifier/)对应于“AUTHORITY”关键字。 |
| [LocalDatum](./localdatum/) | 指示用于本地空间参考系统中测量的方法。 |
| [LocalSpatialReferenceSystem](./localspatialreferencesystem/) | 局部 SRS 相关坐标到某个物体，而不是地球。 |
| [PrimeMeridian](./primemeridian/) | PrimeMeridian 表示经度定义为 0. 的子午线 |
| [ProjectedSpatialReferenceSystem](./projectedspatialreferencesystem/) | 投影SRS是对地理SRS应用投影的结果。 投影SRS可以是二维或三维的。 如果投影SRS是三维的，那么它实际上是二维投影SRS和一维垂直的复合SRS SRS. |
| [ProjectedSpatialReferenceSystemParameters](./projectedspatialreferencesystemparameters/) | 创建预计 SRS 的参数。有些参数有默认值。 有些参数有合理的默认值，所以你不必只分配它们。 如果你分配`null`对于这些参数，将使用默认值。 [`ProjectionMethodName`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/)和[`Base`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/)没有默认值 - 你必须分配一些非`null`此属性的值. |
| [Projection](./projection/) | 表示带参数的投影方法，将（经度，纬度）转换为（x，y）。 |
| [SpatialReferenceSystem](./spatialreferencesystem/) | 空间参考系统将坐标映射到地球上的位置。 有不同类型的 SRS，请参阅[`Type`](../aspose.gis.spatialreferencing/spatialreferencesystem/type/). 更重要的是，如果 SRS 的类型是Geographicor Projected SRS 可以是复合的也可以是单一的，见[`IsCompound`](../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/). |
| [SpatialReferenceSystemTransformation](./spatialreferencesystemtransformation/) | 空间参考系统转换将几何图形从源空间参考系统转换为目标空间参考系统。 |
| [TransformationException](./transformationexception/) | 坐标转换或创建转换出错时抛出转换异常。 |
| [Unit](./unit/) | 表示计量单位。 |
| [VerticalDatum](./verticaldatum/) | 指示用于垂直测量的方法。 |
| [VerticalSpatialReferenceSystem](./verticalspatialreferencesystem/) | Vertical SRS 是描述高度坐标的一维 SRS。 |
## 枚举

| 枚举 | 描述 |
| --- | --- |
| [AxisDirection](./axisdirection/) | 轴方向定义轴指向的方向。 |
| [GeocentricAxisesOrder](./geocentricaxisesorder/) | 表示地心 SRS 中轴的顺序。 |
| [GeographicAxisesOrder](./geographicaxisesorder/) | 表示地理 SRS 中轴的顺序。 |
| [ParameterType](./parametertype/) | 确定参数类型[`Projection`](../aspose.gis.spatialreferencing/projection/). |
| [ProjectedAxisesOrder](./projectedaxisesorder/) | 表示地理 SRS 中轴的顺序。 |
| [SpatialReferenceSystemType](./spatialreferencesystemtype/) | 表示空间参考系统的类型。 |


