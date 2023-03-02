---
title: Class Identifier
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.SpatialReferencing.Identifier 班级. 表示标识符  对对象外部描述的引用 如果从 WKT 创建 SRSIdentifier对应于AUTHORITY关键字
type: docs
weight: 2160
url: /zh/net/aspose.gis.spatialreferencing/identifier/
---
## Identifier class

表示标识符 - 对对象外部描述的引用。 如果从 WKT 创建 SRS，`Identifier`对应于“AUTHORITY”关键字。

```csharp
public class Identifier : IEquatable<Identifier>
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [Identifier](identifier/)(string, string) | 创建新实例. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [AuthorityName](../../aspose.gis.spatialreferencing/identifier/authorityname/) { get; } | 权威名称，它给出了一个[`AuthorityUniqueIdentifier`](./authorityuniqueidentifier/). |
| [AuthorityUniqueIdentifier](../../aspose.gis.spatialreferencing/identifier/authorityuniqueidentifier/) { get; } | 一种在[`AuthorityName`](./authorityname/). |

## 方法

| 姓名 | 描述 |
| --- | --- |
| static [Epsg](../../aspose.gis.spatialreferencing/identifier/epsg/)(int) | 创建新的标识符，用代码表示 EPSG 标识符*epsgCode*. |
| [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals)(Identifier) | 指示当前对象是否等于同一类型的另一个对象。 |
| override [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals_1)(object) | 确定指定对象是否等于当前对象。 |
| [GetEpsgCode](../../aspose.gis.spatialreferencing/identifier/getepsgcode/)() | 如果此对象表示有效的 EPSG 标识符（例如 - 权限名称为“EPSG”且权限唯一标识符为整数）- 返回它。否则 - 返回 -1. |
| override [GetHashCode](../../aspose.gis.spatialreferencing/identifier/gethashcode/)() | 用作默认哈希函数。 |
| [operator ==](../../aspose.gis.spatialreferencing/identifier/op_equality/) | 实现运算符 ==. |
| [operator !=](../../aspose.gis.spatialreferencing/identifier/op_inequality/) | 实现运算符 !=. |

### 例子

WGS 84 空间参考系统有 EPSG 代码 4326，因此它可能包含标识符： WGS 84 Ellipsoid 的 EPSG 代码为 7030，它可能包含标识符：

```csharp
new  {  = "EPSG",  = 4326 };
```

```csharp
new  {  = "EPSG",  = 7030 };
```

### 也可以看看

* 命名空间 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 部件 [Aspose.GIS](../../)


