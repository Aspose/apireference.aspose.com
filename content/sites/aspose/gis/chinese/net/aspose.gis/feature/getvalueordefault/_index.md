---
title: Feature.GetValueOrDefault
second_title: Aspose.GIS for .NET API 参考
description: Feature 方法. 获取属性值或DefaultValue如果该值未设置或无效的.
type: docs
weight: 40
url: /zh/net/aspose.gis/feature/getvalueordefault/
---
## GetValueOrDefault&lt;T&gt;(string) {#getvalueordefault_1}

获取属性值，或[`DefaultValue`](../../featureattribute/defaultvalue/)如果该值未设置或`无效的`.

```csharp
public T GetValueOrDefault<T>(string attributeName)
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

此方法自动将值转换为泛型类型参数中请求的类型。

### 也可以看看

* class [Feature](../)
* 命名空间 [Aspose.Gis](../../feature/)
* 部件 [Aspose.GIS](../../../)

---

## GetValueOrDefault(string, object) {#getvalueordefault}

获取属性值，或[`DefaultValue`](../../featureattribute/defaultvalue/)如果该值未设置或`无效的`.

```csharp
public object GetValueOrDefault(string attributeName, object defaultValue = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| attributeName | String | 属性的名称。 |
| defaultValue | Object | 缺少属性值时要返回的值。默认值为`null`. |

### 返回值

属性的值。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 属性名称是`null`. |
| ArgumentException | 此图层中不存在具有此名称的属性。 |
| InvalidOperationException | 属性未锁定。 |
| InvalidOperationException | 未为此功能设置此属性的值。 |

### 也可以看看

* class [Feature](../)
* 命名空间 [Aspose.Gis](../../feature/)
* 部件 [Aspose.GIS](../../../)

---

## GetValueOrDefault&lt;T&gt;(string, object) {#getvalueordefault_2}

获取属性值，或[`DefaultValue`](../../featureattribute/defaultvalue/)如果该值未设置或`无效的`.

```csharp
public T GetValueOrDefault<T>(string attributeName, object defaultValue)
```

| 范围 | 描述 |
| --- | --- |
| T | 值的所需类型。 |
| attributeName | 属性的名称。 |
| defaultValue | 缺少属性值时要返回的值。 |

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

此方法自动将值转换为泛型类型参数中请求的类型。

### 也可以看看

* class [Feature](../)
* 命名空间 [Aspose.Gis](../../feature/)
* 部件 [Aspose.GIS](../../../)


