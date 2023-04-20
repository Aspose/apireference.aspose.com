---
title: Class SVGPathSeg
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Paths.SVGPathSeg sınıf. SVGPathSeg arabirimi bir yol veri belirtimi içindeki tek bir komuta karşılık gelen temel bir arabirimdir.
type: docs
weight: 2490
url: /tr/net/aspose.svg.paths/svgpathseg/
---
## SVGPathSeg class

SVGPathSeg arabirimi, bir yol veri belirtimi içindeki tek bir komuta karşılık gelen temel bir arabirimdir.

```csharp
public abstract class SVGPathSeg : SVGValueType
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [PathSegType](../../aspose.svg.paths/svgpathseg/pathsegtype/) { get; } | Bu arabirimde tanımlanan sabitlerden biri tarafından belirtilen yol segmentinin türü. |
| [PathSegTypeAsLetter](../../aspose.svg.paths/svgpathseg/pathsegtypeasletter/) { get; } | Karşılık gelen tek karakterli komut adı tarafından belirtilen yol segmentinin türü. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | Yönetilmeyen ve - isteğe bağlı olarak - yönetilen kaynakları serbest bırakır. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Bu yöntem ECMAScript nesnesini almak için kullanılır.Type . |

## Alanlar

| İsim | Tanım |
| --- | --- |
| const [PATHSEG_ARC_ABS](../../aspose.svg.paths/svgpathseg/pathseg_arc_abs/) | Bir "mutlak arkto" (A) yolu veri komutuna karşılık gelir. |
| const [PATHSEG_ARC_REL](../../aspose.svg.paths/svgpathseg/pathseg_arc_rel/) | Bir "göreli arcto" (a) yol veri komutuna karşılık gelir. |
| const [PATHSEG_CLOSEPATH](../../aspose.svg.paths/svgpathseg/pathseg_closepath/) | Bir "yakın yol" (z) yol veri komutuna karşılık gelir. |
| const [PATHSEG_CURVETO_CUBIC_ABS](../../aspose.svg.paths/svgpathseg/pathseg_curveto_cubic_abs/) | Bir "mutlak kübik Bézier eğrisi" (C) yol veri komutuna karşılık gelir. |
| const [PATHSEG_CURVETO_CUBIC_REL](../../aspose.svg.paths/svgpathseg/pathseg_curveto_cubic_rel/) | Bir "göreceli kübik Bézier eğrisine" (c) yol verisi komutuna karşılık gelir. |
| const [PATHSEG_CURVETO_CUBIC_SMOOTH_ABS](../../aspose.svg.paths/svgpathseg/pathseg_curveto_cubic_smooth_abs/) | "mutlak düz kübik eğri" (S) yol veri komutuna karşılık gelir. |
| const [PATHSEG_CURVETO_CUBIC_SMOOTH_REL](../../aspose.svg.paths/svgpathseg/pathseg_curveto_cubic_smooth_rel/) | "Göreceli pürüzsüz kübik eğri" (s) yol veri komutuna karşılık gelir. |
| const [PATHSEG_CURVETO_QUADRATIC_ABS](../../aspose.svg.paths/svgpathseg/pathseg_curveto_quadratic_abs/) | Bir "mutlak ikinci dereceden Bézier eğrisine" (Q) yol verisi komutuna karşılık gelir. |
| const [PATHSEG_CURVETO_QUADRATIC_REL](../../aspose.svg.paths/svgpathseg/pathseg_curveto_quadratic_rel/) | Bir "göreli ikinci dereceden Bézier eğrisi" (q) yol verisi komutuna karşılık gelir. |
| const [PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS](../../aspose.svg.paths/svgpathseg/pathseg_curveto_quadratic_smooth_abs/) | Bir "mutlak düz ikinci dereceden eğri" (T) yol verisi komutuna karşılık gelir. |
| const [PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL](../../aspose.svg.paths/svgpathseg/pathseg_curveto_quadratic_smooth_rel/) | "Göreceli yumuşak ikinci dereceden eğri" (t) yol verisi komutuna karşılık gelir. |
| const [PATHSEG_LINETO_ABS](../../aspose.svg.paths/svgpathseg/pathseg_lineto_abs/) | Bir "mutlak hatta" (L) yol veri komutuna karşılık gelir. |
| const [PATHSEG_LINETO_HORIZONTAL_ABS](../../aspose.svg.paths/svgpathseg/pathseg_lineto_horizontal_abs/) | "mutlak yatay çizgi" (H) yol veri komutuna karşılık gelir. |
| const [PATHSEG_LINETO_HORIZONTAL_REL](../../aspose.svg.paths/svgpathseg/pathseg_lineto_horizontal_rel/) | "Göreceli yatay çizgi" (h) yol veri komutuna karşılık gelir. |
| const [PATHSEG_LINETO_REL](../../aspose.svg.paths/svgpathseg/pathseg_lineto_rel/) | "Göreceli hatta" (l) yol veri komutuna karşılık gelir. |
| const [PATHSEG_LINETO_VERTICAL_ABS](../../aspose.svg.paths/svgpathseg/pathseg_lineto_vertical_abs/) | "mutlak dikey çizgi" (V) yol veri komutuna karşılık gelir. |
| const [PATHSEG_LINETO_VERTICAL_REL](../../aspose.svg.paths/svgpathseg/pathseg_lineto_vertical_rel/) | "Göreli dikey çizgi" (v) yol veri komutuna karşılık gelir. |
| const [PATHSEG_MOVETO_ABS](../../aspose.svg.paths/svgpathseg/pathseg_moveto_abs/) | Bir "mutlak hareket" (M) yol verisi komutuna karşılık gelir. |
| const [PATHSEG_MOVETO_REL](../../aspose.svg.paths/svgpathseg/pathseg_moveto_rel/) | Bir "göreli hareket" (m) yol verisi komutuna karşılık gelir. |
| const [PATHSEG_UNKNOWN](../../aspose.svg.paths/svgpathseg/pathseg_unknown/) | Birim tipi önceden tanımlanmış tiplerden biri değil. Bu türde yeni bir değer tanımlamaya veya mevcut bir değeri bu türe değiştirmeye çalışmak geçersizdir. |

### Ayrıca bakınız

* class [SVGValueType](../../aspose.svg.datatypes/svgvaluetype/)
* ad alanı [Aspose.Svg.Paths](../../aspose.svg.paths/)
* toplantı [Aspose.SVG](../../)


