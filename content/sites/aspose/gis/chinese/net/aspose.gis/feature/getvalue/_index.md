---
title: Feature.GetValue
second_title: Aspose.GIS for .NET API 参考
description: Feature 方法. 获取属性的值
type: docs
weight: 30
url: /zh/net/aspose.gis/feature/getvalue/
---
## GetValue&lt;T&gt;(string) {#getvalue_1}

获取属性的值。

```csharp
public T GetValue<T>(string attributeName)
```

| 范围 | 描述 |
| --- | --- |
| T | 值的所需类型。 |
| attributeName | 属性的名称。 |

### 返回值

属性的值。

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

此方法自动将值转换为泛型类型参数中请求的类型。  如果图层不要求其要素具有为图层定义的所有属性的值， 此方法可能会失败并显示InvalidOperationException当请求缺失值时。 使用此类图层时，请考虑使用[`GetValueOrDefault`](../getvalueordefault/).

### 也可以看看

* class [Feature](../)
* 命名空间 [Aspose.Gis](../../feature/)
* 部件 [Aspose.GIS](../../../)

---

## GetValue(string) {#getvalue}

获取属性的值。

```csharp
public object GetValue(string attributeName)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| attributeName | String | 属性的名称。 |

### 返回值

属性的值。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 属性名称是`null`. |
| ArgumentException | 此图层中不存在具有此名称的属性。 |
| InvalidOperationException | 属性未锁定。 |
| InvalidOperationException | 未为此功能设置此属性的值。 |

### 评论

如果图层不要求其要素具有为图层定义的所有属性的值， 此方法可能会失败并显示InvalidOperationException当请求缺失值时。 使用此类图层时，请考虑使用[`GetValueOrDefault`](../getvalueordefault/).

### 也可以看看

* class [Feature](../)
* 命名空间 [Aspose.Gis](../../feature/)
* 部件 [Aspose.GIS](../../../)


