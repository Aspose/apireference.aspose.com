---
title: ProjectedSpatialReferenceSystemParameters.AddProjectionParameter
second_title: Aspose.GIS for .NET API 参考
description: ProjectedSpatialReferenceSystemParameters 方法. 将投影参数添加到此 SRS如果已添加具有此类名称的参数  更新它
type: docs
weight: 100
url: /zh/net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/addprojectionparameter/
---
## ProjectedSpatialReferenceSystemParameters.AddProjectionParameter method

将投影参数添加到此 SRS。如果已添加具有此类名称的参数 - 更新它。

```csharp
public void AddProjectionParameter(string parameterName, double value)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| parameterName | String | 投影参数的名称。 |
| value | Double | 参数值。值的单位应该是[`LinearUnit`](../linearunit/) 或[`AngularUnit`](../../geographicspatialreferencesystem/angularunit/)的[`Base`](../base/). |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | *parameterName*一片空白。 |

### 也可以看看

* class [ProjectedSpatialReferenceSystemParameters](../)
* 命名空间 [Aspose.Gis.SpatialReferencing](../../projectedspatialreferencesystemparameters/)
* 部件 [Aspose.GIS](../../../)


