---
title: Enum SpatialReferenceSystemMode
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.SpatialReferenceSystemMode 枚举. 指定在数据库 中写入空间参考系统 SRS 的模式如果它是未知的 SRS. 
type: docs
weight: 2020
url: /zh/net/aspose.gis/spatialreferencesystemmode/
---
## SpatialReferenceSystemMode enumeration

指定在数据库 中写入空间参考系统 (SRS) 的模式（如果它是未知的 SRS. ）

```csharp
public enum SpatialReferenceSystemMode
```

### 价值观

| 姓名 | 价值 | 描述 |
| --- | --- | --- |
| ThrowException | `0` | 如果它是数据库的未知 SRS，则抛出异常。 |
| WriteInSystemTable | `1` | 如果数据库的 SRS 未知，则将 SRS 信息写入系统表。 |
| SetupToZero | `2` | 如果它是数据库的未知 SRS，则将几何的 SRID 设置为“零”。 |

### 也可以看看

* 命名空间 [Aspose.Gis](../../aspose.gis/)
* 部件 [Aspose.GIS](../../)


