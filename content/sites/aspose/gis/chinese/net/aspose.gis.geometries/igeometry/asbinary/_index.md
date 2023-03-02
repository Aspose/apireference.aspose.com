---
title: IGeometry.AsBinary
second_title: Aspose.GIS for .NET API 参考
description: IGeometry 方法. 将此几何图形转换为其众所周知的二进制表示形式
type: docs
weight: 100
url: /zh/net/aspose.gis.geometries/igeometry/asbinary/
---
## AsBinary() {#asbinary}

将此几何图形转换为其众所周知的二进制表示形式。

```csharp
public byte[] AsBinary()
```

### 返回值

此几何的众所周知的二进制表示。

### 评论

此方法的输出在IsoWKB 变体。

### 也可以看看

* interface [IGeometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../igeometry/)
* 部件 [Aspose.GIS](../../../)

---

## AsBinary(WkbVariant) {#asbinary_1}

将此几何图形转换为其众所周知的二进制表示形式。

```csharp
public byte[] AsBinary(WkbVariant variant)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| variant | WkbVariant | 要使用的众所周知的二进制变体。 |

### 返回值

此几何的众所周知的二进制表示。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| NotSupportedException | 几何无法在请求的 WKB 变体中表示。目前这发生在 [`HasCurveGeometry`](../hascurvegeometry/)几何是`true`和 WKB 变体是 SimpleFeatureAccessOutdated. |
| ArgumentOutOfRangeException | *variant*不是有效的[`WkbVariant`](../../wkbvariant/). |

### 也可以看看

* enum [WkbVariant](../../wkbvariant/)
* interface [IGeometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../igeometry/)
* 部件 [Aspose.GIS](../../../)


