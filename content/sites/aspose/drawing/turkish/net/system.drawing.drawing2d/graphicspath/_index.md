---
title: GraphicsPath
second_title: Aspose.Drawing for .NET API Referansı
description: Bir dizi bağlantılı çizgi ve eğriyi temsil eder.
type: docs
weight: 260
url: /tr/net/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class

Bir dizi bağlantılı çizgi ve eğriyi temsil eder.

```csharp
public class GraphicsPath : IDisposable
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [GraphicsPath](graphicspath#constructor)() | FillMode Alternate değeriyle GraphicsPath sınıfının yeni bir örneğini başlatır. |
| [GraphicsPath](graphicspath#constructor_1)(FillMode) | Yeni bir örneğini başlatır[`GraphicsPath`](../graphicspath)Belirtilen ile sınıfFillMode numaralandırma. |
| [GraphicsPath](graphicspath#constructor_2)(PointF[], byte[]) | Yeni bir örneğini başlatır[`GraphicsPath`](../graphicspath) belirtilen sınıf[`PathPointType`](../pathpointtype) vePointF diziler. |
| [GraphicsPath](graphicspath#constructor_4)(Point[], byte[]) | Yeni bir örneğini başlatır[`GraphicsPath`](../graphicspath) belirtilen sınıf[`PathPointType`](../pathpointtype) vePoint diziler. |
| [GraphicsPath](graphicspath#constructor_3)(PointF[], byte[], FillMode) | Yeni bir örneğini başlatır[`GraphicsPath`](../graphicspath) belirtilen sınıfPathPointType vePointF diziler ve belirtilen ileFillMode numaralandırma öğesi.. |
| [GraphicsPath](graphicspath#constructor_5)(Point[], byte[], FillMode) | Yeni bir örneğini başlatır[`GraphicsPath`](../graphicspath) belirtilen sınıfPathPointType vePoint diziler ve belirtilen ileFillMode numaralandırma öğesi.. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [FillMode](../../system.drawing.drawing2d/graphicspath/fillmode) { get; set; } | Bu GraphicsPath içindeki şekillerin içinin nasıl doldurulacağını belirleyen bir FillMode numaralandırması alır veya ayarlar. |
| [PathData](../../system.drawing.drawing2d/graphicspath/pathdata) { get; } | PathData bunun için nokta ve tür dizilerini içine alanGraphicsPath |
| [PathPoints](../../system.drawing.drawing2d/graphicspath/pathpoints) { get; } | Yoldaki noktaları alır. |
| [PathTypes](../../system.drawing.drawing2d/graphicspath/pathtypes) { get; } | Dizindeki karşılık gelen noktaların türlerini alır.PathPoints dizi. |
| [PointCount](../../system.drawing.drawing2d/graphicspath/pointcount) { get; } | İçindeki öğelerin sayısını alırPathPoints ya daPathTypes dizi. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc#addarc_1)(RectangleF, float, float) | Geçerli şekle eliptik bir yay ekler. |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc#addarc)(float, float, float, float, float, float) | Geçerli şekle eliptik bir yay ekler. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier#addbezier_1)(PointF, PointF, PointF, PointF) | Geçerli şekle kübik bir Bézier eğrisi ekler. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier#addbezier)(float, float, float, float, float, float, float, float) | Geçerli şekle kübik bir Bézier eğrisi ekler. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers#addbeziers)(PointF[]) | Geçerli şekle bir dizi bağlı kübik Bézier eğrisi ekler. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers#addbeziers_1)(Point[]) | Geçerli şekle bir dizi bağlı kübik Bézier eğrisi ekler. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve)(PointF[]) | Bu yola kapalı bir eğri ekler. Eğri dizideki noktaların her birinden geçtiği için bir ana eğri eğrisi kullanılır. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve_1)(PointF[], float) | Bu yola kapalı bir eğri ekler. Eğri dizideki her bir noktadan geçtiği için bir ana eğri eğrisi kullanılır. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve)(PointF[]) | Geçerli şekle bir spline eğrisi ekler. Eğri dizideki noktaların her birinden geçtiği için bir ana eğri eğrisi kullanılır. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_3)(Point[]) | Geçerli şekle bir spline eğrisi ekler. Eğri dizideki noktaların her birinden geçtiği için bir ana eğri eğrisi kullanılır. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_2)(PointF[], float) | Geçerli şekle bir spline eğrisi ekler. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_1)(PointF[], int, int, float) | Geçerli şekle bir spline eğrisi ekler. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse#addellipse_1)(RectangleF) | Geçerli yola bir elips ekler. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse#addellipse)(float, float, float, float) | Geçerli yola bir elips ekler. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline#addline_1)(PointF, PointF) | Bu GraphicsPath'e bir çizgi parçası ekler. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline#addline)(float, float, float, float) | Bu GraphicsPath'e bir çizgi parçası ekler. |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines#addlines)(PointF[]) | Bunun sonuna bir dizi bağlantılı çizgi parçası eklerGraphicsPath . |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines#addlines_1)(Point[]) | Bunun sonuna bir dizi bağlantılı çizgi parçası eklerGraphicsPath . |
| [AddPath](../../system.drawing.drawing2d/graphicspath/addpath)(GraphicsPath, bool) | Belirtilen GraphicsPath'i bu yola ekler. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie#addpie_1)(Rectangle, float, float) | Bu yola bir pasta şeklinin ana hatlarını ekler. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie#addpie)(float, float, float, float, float, float) | Bu yola bir pasta şeklinin ana hatlarını ekler. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon#addpolygon)(PointF[]) | Bu yola bir çokgen ekler. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon#addpolygon_1)(Point[]) | Bu yola bir çokgen ekler. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle#addrectangle)(Rectangle) | Bu yola bir dikdörtgen ekler. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle#addrectangle_1)(RectangleF) | Bu yola bir dikdörtgen ekler. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles#addrectangles)(RectangleF[]) | Bu yola bir dizi dikdörtgen ekler. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles#addrectangles_1)(Rectangle[]) | Bu yola bir dizi dikdörtgen ekler. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring)(string, FontFamily, int, float, Point, StringFormat) | Bu yola bir metin dizesi ekler. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_1)(string, FontFamily, int, float, PointF, StringFormat) | Bu yola bir metin dizesi ekler. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_2)(string, FontFamily, int, float, Rectangle, StringFormat) | Bu yola bir metin dizesi ekler. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_3)(string, FontFamily, int, float, RectangleF, StringFormat) | Bu yola bir metin dizesi ekler. |
| [Clone](../../system.drawing.drawing2d/graphicspath/clone)() | Geçerli yol nesnesinin bir kopyasını oluşturun. |
| [CloseAllFigures](../../system.drawing.drawing2d/graphicspath/closeallfigures)() | Bu yoldaki tüm açık şekilleri kapatır ve yeni bir şekil başlatır. Her açık şekli, bitiş noktasından başlangıç noktasına bir çizgi bağlayarak kapatır. |
| [CloseFigure](../../system.drawing.drawing2d/graphicspath/closefigure)() | Mevcut rakamı kapatır ve yeni bir rakam başlatır. Geçerli şekil bir dizi bağlı çizgi ve eğri içeriyorsa, yöntem bir çizgiyi bitiş noktasından başlangıç noktasına bağlayarak döngüyü kapatır. |
| [Dispose](../../system.drawing.drawing2d/graphicspath/dispose)() | Bu GraphicsPath tarafından kullanılan tüm kaynakları serbest bırakır. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten)() | Bu yoldaki her eğriyi bir dizi bağlantılı çizgi parçasına dönüştürür. |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds)() | Bunu sınırlayan bir dikdörtgen döndürürGraphicsPath . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds_1)(Matrix) | Bunu sınırlayan bir dikdörtgen döndürürGraphicsPath bu yol belirtilen tarafından dönüştürüldüğünde Matrix . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds_2)(Matrix, Pen) | Bunu sınırlayan bir dikdörtgen döndürürGraphicsPath geçerli yol belirtilen tarafından dönüştürüldüğünde Matrix ve belirtilen ile çizilmişPen . |
| [GetLastPoint](../../system.drawing.drawing2d/graphicspath/getlastpoint)() | Bunun PathPoints dizisindeki son noktayı alır[`GraphicsPath`](../graphicspath) . |
| [IsOutlineVisible](../../system.drawing.drawing2d/graphicspath/isoutlinevisible)(PointF, Pen) | Belirtilen noktanın buGraphicsPath belirtilen ile çizildiğindePen . |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible)(PointF) | Belirtilen noktanın bunun içinde bulunup bulunmadığını gösterir.GraphicsPath . |
| [Reset](../../system.drawing.drawing2d/graphicspath/reset)() | [`PathPoints`](./pathpoints) ve[`PathTypes`](./pathtypes)arrays ve ayarlar[`FillMode`](../fillmode) ileAlternate . |
| [Reverse](../../system.drawing.drawing2d/graphicspath/reverse)() | Noktaların sırasını tersine çevirir.[`PathPoints`](./pathpoints) bunun dizisi[`GraphicsPath`](../graphicspath) . |
| [SetMarkers](../../system.drawing.drawing2d/graphicspath/setmarkers)() | Bunun üzerine bir işaret koyar[`GraphicsPath`](../graphicspath) . |
| [StartFigure](../../system.drawing.drawing2d/graphicspath/startfigure)() | Mevcut rakamı kapatmadan yeni bir rakam başlatır. Yola eklenen sonraki tüm noktalar bu yeni şekle eklenir. |
| [Transform](../../system.drawing.drawing2d/graphicspath/transform)(Matrix) | Bu GraphicsPath'e bir dönüştürme matrisi uygular. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp)(PointF[], RectangleF) | Buna bir dikdörtgen ve bir paralelkenar ile tanımlanan bir çarpıtma dönüşümü uygular.[`GraphicsPath`](../graphicspath) . |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_1)(PointF[], RectangleF, Matrix) | Buna bir dikdörtgen ve bir paralelkenar ile tanımlanan bir çarpıtma dönüşümü uygular.[`GraphicsPath`](../graphicspath). |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_2)(PointF[], RectangleF, Matrix, WarpMode) | Buna bir dikdörtgen ve bir paralelkenar ile tanımlanan bir çarpıtma dönüşümü uygular.[`GraphicsPath`](../graphicspath). |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_3)(PointF[], RectangleF, Matrix, WarpMode, float) | Buna bir dikdörtgen ve bir paralelkenar ile tanımlanan bir çarpıtma dönüşümü uygular.[`GraphicsPath`](../graphicspath). |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen#widen)(Pen) | Yola ek bir anahat ekler. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen#widen_1)(Pen, Matrix, float) | Bunu değiştirirGraphicsPath bu yol belirtilen kalem tarafından çizildiğinde doldurulan alanı çevreleyen eğrilerle. |

### Ayrıca bakınız

* ad alanı [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* toplantı [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
