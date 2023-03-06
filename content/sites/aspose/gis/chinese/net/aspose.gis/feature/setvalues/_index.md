---
title: Feature.SetValues
second_title: Aspose.GIS for .NET API 参考
description: Feature 方法. 为所有属性设置新值 也考虑使用CopyValues在一次调用中简化设置值的方法.
type: docs
weight: 120
url: /zh/net/aspose.gis/feature/setvalues/
---
## Feature.SetValues method

为所有属性设置新值。 也考虑使用[`CopyValues`](../copyvalues/)在一次调用中简化设置值的方法.

```csharp
public int SetValues(object[] values)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| values | Object[] | 新值的数组。 |

### 返回值

属性值集的数量。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数不能`null`. |
| ArgumentException | 此图层中不存在具有此名称的属性。 |
| InvalidOperationException | 属性未锁定。 |
| InvalidCastException | 值的类型没有实现IConvertible. |
| FormatException | 转换失败，因为值的格式不正确。 |
| OverflowException | 由于溢出，转换失败。 |

### 评论

此方法自动将每个值转换为属性的类型。  values 数组的长度不需要与特征中的属性数匹配。 如果数组长度大于属性数，则将所有数组值复制到属性中； 如果小于，只有数组长度的值被复制到属性中， 从序号为 0. 的属性值开始

### 也可以看看

* class [Feature](../)
* 命名空间 [Aspose.Gis](../../feature/)
* 部件 [Aspose.GIS](../../../)


