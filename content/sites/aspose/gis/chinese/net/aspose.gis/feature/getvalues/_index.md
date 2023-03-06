---
title: Feature.GetValues
second_title: Aspose.GIS for .NET API 参考
description: Feature 方法. 返回数组中所有属性的值
type: docs
weight: 50
url: /zh/net/aspose.gis/feature/getvalues/
---
## Feature.GetValues method

返回数组中所有属性的值。

```csharp
public int GetValues(object[] values, object defaultValue = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| values | Object[] | 要将属性值复制到其中的数组。 |
| defaultValue | Object | 属性值缺失（未设置）时返回的值。默认值为`null`. 考虑使用 'DBNull.Value' 用于分隔 'unset' 和 '`null`价值观. |

### 返回值

复制了一些属性。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 论据是`null`. |
| InvalidOperationException | 属性未锁定。 |

### 评论

特征的值属性被复制到作为参数传递的值数组中。 对于具有未设置值的属性，返回指定的“unsetValue”参数。  values 数组的长度不需要与特征中的属性数匹配。 如果数组长度大于属性数，则将所有属性值复制到数组中； 如果小于，仅将属性值的数组长度数量复制到数组中， 从序号为 0. 的属性值开始

### 也可以看看

* class [Feature](../)
* 命名空间 [Aspose.Gis](../../feature/)
* 部件 [Aspose.GIS](../../../)


