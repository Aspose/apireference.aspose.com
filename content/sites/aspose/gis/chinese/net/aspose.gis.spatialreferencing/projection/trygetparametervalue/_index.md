---
title: Projection.TryGetParameterValue
second_title: Aspose.GIS for .NET API 参考
description: Projection 方法. 获取具有此投影指定名称的参数如果没有这样的参数  返回null.
type: docs
weight: 60
url: /zh/net/aspose.gis.spatialreferencing/projection/trygetparametervalue/
---
## Projection.TryGetParameterValue method

获取具有此投影指定名称的参数。如果没有这样的参数 - 返回`null`.

```csharp
public double? TryGetParameterValue(string name, ParameterType type = ParameterType.Other)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| name | String | 参数名称。 |
| type | ParameterType | 参数类型。 定义将取消应用的单位因子： 如果类型为Linear然后[`LinearParametersUnit`](../linearparametersunit/)将取消应用，结果将以米为单位。 如果类型是Angular然后[`AngularParametersUnit`](../angularparametersunit/)将被取消应用并且结果将以弧度为单位。 如果类型是Other参数值将“按原样”返回。 |

### 返回值

具有指定名称的参数或`null`如果它不存在。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数为空。 |

### 也可以看看

* enum [ParameterType](../../parametertype/)
* class [Projection](../)
* 命名空间 [Aspose.Gis.SpatialReferencing](../../projection/)
* 部件 [Aspose.GIS](../../../)


