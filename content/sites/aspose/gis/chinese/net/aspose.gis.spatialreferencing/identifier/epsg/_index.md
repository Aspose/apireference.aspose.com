---
title: Identifier.Epsg
second_title: Aspose.GIS for .NET API 参考
description: Identifier 方法. 创建新的标识符用代码表示 EPSG 标识符epsgCode.
type: docs
weight: 20
url: /zh/net/aspose.gis.spatialreferencing/identifier/epsg/
---
## Identifier.Epsg method

创建新的标识符，用代码表示 EPSG 标识符*epsgCode*.

```csharp
public static Identifier Epsg(int epsgCode)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| epsgCode | Int32 | EPSG 代码。 |

### 返回值

新标识符[`AuthorityName`](../authorityname/)“EPSG”和[`AuthorityUniqueIdentifier`](../authorityuniqueidentifier/)*epsgCode*. 如果*epsgCode*小于 0 - 返回`null`;

### 也可以看看

* class [Identifier](../)
* 命名空间 [Aspose.Gis.SpatialReferencing](../../identifier/)
* 部件 [Aspose.GIS](../../../)


