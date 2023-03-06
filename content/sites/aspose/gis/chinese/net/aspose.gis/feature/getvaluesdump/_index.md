---
title: Feature.GetValuesDump
second_title: Aspose.GIS for .NET API 参考
description: Feature 方法. 返回数组中所有属性的值 考虑使用GetValues避免额外内存分配的方法.
type: docs
weight: 60
url: /zh/net/aspose.gis/feature/getvaluesdump/
---
## Feature.GetValuesDump method

返回数组中所有属性的值。 考虑使用[`GetValues`](../getvalues/)避免额外内存分配的方法.

```csharp
public object[] GetValuesDump(object defaultValue = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| defaultValue | Object | 属性值缺失（未设置）时返回的值。默认值为`null`. 考虑使用 'DBNull.Value' 用于分隔 'unset' 和 '`null`价值观. |

### 返回值

要将属性值复制到其中的新数组。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 论据是`null`. |
| InvalidOperationException | 属性未锁定。 |

### 评论

特征的值属性被复制到作为参数传递的值数组中。 对于具有未设置值的属性，返回指定的“unsetValue”参数。

### 也可以看看

* class [Feature](../)
* 命名空间 [Aspose.Gis](../../feature/)
* 部件 [Aspose.GIS](../../../)


