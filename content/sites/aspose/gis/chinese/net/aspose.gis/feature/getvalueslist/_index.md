---
title: Feature.GetValuesList
second_title: Aspose.GIS for .NET API 参考
description: Feature 方法. 获取属性序列的值作为列表
type: docs
weight: 70
url: /zh/net/aspose.gis/feature/getvalueslist/
---
## Feature.GetValuesList&lt;T&gt; method

获取属性序列的值作为列表。

```csharp
public List<T> GetValuesList<T>(string attributeName, string separator)
```

| 范围 | 描述 |
| --- | --- |
| T | 值的所需类型。 |
| attributeName | 属性的名称。 |
| separator | 一个字符串，用于分隔序列的属性名称和索引值。 |

### 返回值

按序列索引值命名不同的属性值列表。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 属性名称是`null`. |
| ArgumentException | 此图层中不存在具有此名称的属性。 |
| InvalidOperationException | 属性未锁定。 |
| InvalidOperationException | 未为此功能设置此属性的值。 |
| InvalidCastException | 请求的类型没有实现IConvertible. |
| InvalidCastException | 属性的值是`null`，但请求的类型是值类型。 |
| FormatException | 转换失败，因为值的格式不正确。 |
| OverflowException | 由于溢出，转换失败。 |

### 评论

这使用[`GetValue`](../getvalue/)获得单一价值。因此，此方法会自动将值转换为泛型类型参数中请求的类型。  如果找不到索引为 0 的属性，它将生成ArgumentException.

### 也可以看看

* class [Feature](../)
* 命名空间 [Aspose.Gis](../../feature/)
* 部件 [Aspose.GIS](../../../)


