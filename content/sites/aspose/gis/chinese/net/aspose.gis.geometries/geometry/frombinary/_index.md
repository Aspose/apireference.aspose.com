---
title: Geometry.FromBinary
second_title: Aspose.GIS for .NET API 参考
description: Geometry 方法. 从众所周知的二进制表示形式创建几何
type: docs
weight: 460
url: /zh/net/aspose.gis.geometries/geometry/frombinary/
---
## FromBinary(byte[]) {#frombinary}

从众所周知的二进制表示形式创建几何。

```csharp
public static IGeometry FromBinary(byte[] wkb)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| wkb | Byte[] | 众所周知的几何图形的二进制表示。 |

### 返回值

由参数表示的几何。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数为空。 |
| NotSupportedException | 参数表示不支持类型的几何图形。 |
| FormatException | 参数不是有效的 Well-Known Binary。 |

### 也可以看看

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../geometry/)
* 部件 [Aspose.GIS](../../../)

---

## FromBinary(byte[], SpatialReferenceSystem) {#frombinary_1}

从众所周知的二进制表示形式创建几何。

```csharp
public static IGeometry FromBinary(byte[] wkb, SpatialReferenceSystem spatialReferenceSystem)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| wkb | Byte[] | 众所周知的几何图形的二进制表示。 |
| spatialReferenceSystem | SpatialReferenceSystem | 要分配给几何体的空间参考系。 |

### 返回值

由参数表示的几何。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数为空。 |
| NotSupportedException | 参数表示不支持类型的几何图形。 |
| FormatException | 参数不是有效的 Well-Known Binary。 |

### 评论

如果几何a之后有多余的字节FormatException抛出异常。

### 也可以看看

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../geometry/)
* 部件 [Aspose.GIS](../../../)


