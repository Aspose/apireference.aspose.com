---
title: Feature.CopyValues
second_title: Aspose.GIS for .NET API 参考
description: Feature 方法. 从另一个特征复制属性值
type: docs
weight: 20
url: /zh/net/aspose.gis/feature/copyvalues/
---
## Feature.CopyValues method

从另一个特征复制属性值。

```csharp
public void CopyValues(Feature inputFeature)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| inputFeature | Feature | 要从中复制值的功能。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 论据是`null`. |
| ArgumentException | 此图层中不存在具有此名称的属性。 |
| InvalidOperationException | 属性未锁定。 |
| InvalidOperationException | 输入值为空，此功能中的属性不能为空。 |
| [GisException](../../gisexception/) | 属性在要素中具有相同的名称但不同的数据类型。 |

### 评论

此方法仅复制具有匹配名称的属性。

### 也可以看看

* class [Feature](../)
* 命名空间 [Aspose.Gis](../../feature/)
* 部件 [Aspose.GIS](../../../)


