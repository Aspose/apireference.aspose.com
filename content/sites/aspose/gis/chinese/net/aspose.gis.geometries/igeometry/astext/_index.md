---
title: IGeometry.AsText
second_title: Aspose.GIS for .NET API 参考
description: IGeometry 方法. 将此几何图形转换为其 WellKnown Text 表示形式
type: docs
weight: 120
url: /zh/net/aspose.gis.geometries/igeometry/astext/
---
## AsText() {#astext}

将此几何图形转换为其 Well-Known Text 表示形式。

```csharp
public string AsText()
```

### 返回值

此几何的知名文本表示。

### 评论

此方法的输出在Iso WKT 变体。

### 也可以看看

* interface [IGeometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../igeometry/)
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
| NotSupportedException | 请求的 WKT 变体不支持该几何形状。 以下几何形状仅由IsoWKT 变体： [`CircularString`](../../circularstring/)[`CompoundCurve`](../../compoundcurve/)[`CurvePolygon`](../../curvepolygon/)[`MultiCurve`](../../multicurve/)[`MultiSurface`](../../multisurface/) 任何 WKT 变体都支持所有其他几何形状。 |
| ArgumentOutOfRangeException | *variant*不是有效的[`WktVariant`](../../wktvariant/). |

### 也可以看看

* enum [WktVariant](../../wktvariant/)
* interface [IGeometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../igeometry/)
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
* interface [IGeometry](../)
* 命名空间 [Aspose.Gis.Geometries](../../igeometry/)
* 部件 [Aspose.GIS](../../../)


