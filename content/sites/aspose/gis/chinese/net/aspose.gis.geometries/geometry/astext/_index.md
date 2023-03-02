---
title: Geometry.AsText
second_title: Aspose.GIS for .NET API 参考
description: Geometry 方法. 将此几何图形转换为其 WellKnown Text 表示形式
type: docs
weight: 130
url: /zh/net/aspose.gis.geometries/geometry/astext/
---
## AsText() {#astext}

将此几何图形转换为其 Well-Known Text 表示形式。

```csharp
public string AsText()
```

### 返回值

此几何的知名文本表示。

### 评论

此方法的输出位于IsoWKT variant. 默认数字格式为[`General`](../../../aspose.gis/numericformat/general/)（精度为“0”）.

### 也可以看看

* class [Geometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../geometry/)
* 部件 [Aspose.GIS](../../../)

---

## AsText(WktVariant) {#astext_1}

将此几何图形转换为其 Well-Known Text 表示形式。

```csharp
public string AsText(WktVariant variant)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| variant | WktVariant | 要使用的 Well-Known Text 变体。 |

### 返回值

此几何的知名文本表示。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| NotSupportedException | 几何无法在请求的 WKT 变体中表示。目前这发生在 when [`HasCurveGeometry`](../hascurvegeometry/)几何是`true`和 WKT 变体是 SimpleFeatureAccessOutdated. |
| ArgumentOutOfRangeException | *variant*不是有效的[`WktVariant`](../../wktvariant/). |

### 评论

默认数字格式为[`General`](../../../aspose.gis/numericformat/general/)（精度为“0”）.

### 也可以看看

* enum [WktVariant](../../wktvariant/)
* class [Geometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../geometry/)
* 部件 [Aspose.GIS](../../../)

---

## AsText(WktVariant, NumericFormat) {#astext_2}

将此几何图形转换为其 Well-Known Text 表示形式。

```csharp
public string AsText(WktVariant variant, NumericFormat format)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| variant | WktVariant | 要使用的 Well-Known Text 变体。 |
| format | NumericFormat | 转换为字符串的坐标格式。见[`NumericFormat`](../../../aspose.gis/numericformat/)为拿到它，为实现它。 |

### 返回值

此几何的知名文本表示。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| NotSupportedException | 几何无法在请求的 WKT 变体中表示。目前这发生在 when [`HasCurveGeometry`](../hascurvegeometry/)几何是`true`和 WKT 变体是 SimpleFeatureAccessOutdated. |
| ArgumentOutOfRangeException | *variant*不是有效的[`WktVariant`](../../wktvariant/). |

### 也可以看看

* enum [WktVariant](../../wktvariant/)
* class [NumericFormat](../../../aspose.gis/numericformat/)
* class [Geometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../geometry/)
* 部件 [Aspose.GIS](../../../)


