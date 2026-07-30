---
title: "System::Drawing::Drawing2D::GraphicsPath sınıfı"
linktitle: "GraphicsPath"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Drawing2D::GraphicsPath sınıfı. Bağlı çizgiler ve eğrilerden oluşan bir küme temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığın üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 600
url: /tr/cpp/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class


Bağlı çizgiler ve eğrilerden oluşan bir küme temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığın üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class GraphicsPath : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddArc](./addarc/)(float, float, float, float, float, float) | Belirtilen eliptik yayını, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddArc](./addarc/)(int, int, int, int, float, float) | Belirtilen eliptik yayını, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddArc](./addarc/)(const RectangleF\&, float, float) | Belirtilen eliptik yayını, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddArc](./addarc/)(const Rectangle\&, float, float) | Belirtilen eliptik yayını, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddBezier](./addbezier/)(const Point\&, const Point\&, const Point\&, const Point\&) | Belirtilen kübik Bezier eğrisini, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddBezier](./addbezier/)(const PointF\&, const PointF\&, const PointF\&, const PointF\&) | Belirtilen kübik Bezier eğrisini, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddBezier](./addbezier/)(int, int, int, int, int, int, int, int) | Belirtilen kübik Bezier eğrisini, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddBezier](./addbezier/)(float, float, float, float, float, float, float, float) | Belirtilen kübik Bezier eğrisini, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<Point\>\&) | Bağlı kübik Bezier eğrilerinden oluşan bir diziyi geçerli şekle ekler. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<PointF\>\&) | Bağlı kübik Bezier eğrilerinden oluşan bir diziyi geçerli şekle ekler. |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<PointF\>\&, float) | Belirtilen kapalı eğriyi, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<Point\>\&, float) | Belirtilen kapalı eğriyi, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, float) | Belirtilen eğriyi, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, float) | Belirtilen eğriyi, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, int, int, float) | Belirtilen eğriyi, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, int, int, float) | Belirtilen eğriyi, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddEllipse](./addellipse/)(float, float, float, float) | Belirtilen elipsi, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddEllipse](./addellipse/)(int, int, int, int) | Belirtilen elipsi, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddEllipse](./addellipse/)(const RectangleF\&) | Belirtilen elipsi, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddEllipse](./addellipse/)(const Rectangle\&) | Belirtilen elipsi, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddLine](./addline/)(const Point\&, const Point\&) | Belirtilen çizgiyi, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddLine](./addline/)(const PointF\&, const PointF\&) | Belirtilen çizgiyi, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddLine](./addline/)(int, int, int, int) | Belirtilen çizgiyi, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddLine](./addline/)(float, float, float, float) | Belirtilen çizgiyi, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddLines](./addlines/)(const ArrayPtr\<PointF\>\&) | Belirtilen bağlı çizgi segmentlerinden oluşan seriyi, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddLines](./addlines/)(const ArrayPtr\<Point\>\&) | Belirtilen bağlı çizgi segmentlerinden oluşan seriyi, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddPath](./addpath/)(const SharedPtr\<GraphicsPath\>\&, bool) | Belirtilen yolu, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddPie](./addpie/)(float, float, float, float, float, float) | Belirtilen pasta şeklinin dış hatlarını, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddPie](./addpie/)(int, int, int, int, float, float) | Belirtilen pasta şeklinin dış hatlarını, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddPie](./addpie/)(const Rectangle\&, float, float) | Belirtilen pasta şeklinin dış hatlarını, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<PointF\>\&) | Belirtilen çokgeni, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<Point\>\&) | Belirtilen çokgeni, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddRectangle](./addrectangle/)(const Rectangle\&) | Belirtilen dikdörtgeni, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddRectangle](./addrectangle/)(const RectangleF\&) | Belirtilen dikdörtgeni, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<Rectangle\>\&) | Belirtilen dikdörtgen serisini, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<RectangleF\>\&) | Belirtilen dikdörtgen serisini, geçerli nesne tarafından temsil edilen yola ekler. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Point, const SharedPtr\<StringFormat\>\&) | Geçerli nesne tarafından temsil edilen yola bir metin dizesi ekler. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, PointF, const SharedPtr\<StringFormat\>\&) | Geçerli nesne tarafından temsil edilen yola bir metin dizesi ekler. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Rectangle, const SharedPtr\<StringFormat\>\&) | Geçerli nesne tarafından temsil edilen yola bir metin dizesi ekler. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, RectangleF, const SharedPtr\<StringFormat\>\&) | Geçerli nesne tarafından temsil edilen yola bir metin dizesi ekler. |
| virtual [Clone](./clone/)() | Geçerli nesnenin bir kopyasını oluşturur. |
| [CloseAllFigures](./closeallfigures/)() | Tüm açık şekilleri kapatır ve yeni bir tane başlatır. |
| [CloseFigure](./closefigure/)() | Geçerli şekli kapatır ve yeni bir tane başlatır. |
| [Dispose](./dispose/)() | Geçerli nesne tarafından edinilen tüm işletim sistemi kaynaklarını serbest bırakır. |
| [Flatten](./flatten/)() | Yoldaki her eğriyi, bağlı çizgiler serisine dönüştürerek düzleştirir. 0.25 düzlük değeri kullanılır. |
| [Flatten](./flatten/)(const MatrixPtr\&) | Yoldaki her eğriyi, bağlı çizgiler serisine dönüştürerek düzleştirir. 0.25 düzlük değeri kullanılır. |
| [Flatten](./flatten/)(const MatrixPtr\&, float) | Yoldaki her eğriyi, bağlı çizgiler serisine dönüştürerek düzleştirir. |
| [get_FillMode](./get_fillmode/)() | Geçerli nesnenin doldurma kipini döndürür. |
| [get_PathData](./get_pathdata/)() | Geçerli nesne tarafından temsil edilen bir yolu oluşturan noktaları ve türlerini içeren bir [PathData](../pathdata/) nesnesi döndürür. |
| [get_PathPoints](./get_pathpoints/)() const | Geçerli nesne tarafından temsil edilen bir yolu oluşturan noktaları içeren bir dizi döndürür. |
| [get_PathTypes](./get_pathtypes/)() const | Geçerli nesne tarafından temsil edilen bir yolu oluşturan noktaların türlerini gösteren değerleri içeren bir dizi döndürür. |
| [get_PointCount](./get_pointcount/)() const | Geçerli nesne tarafından temsil edilen yoldaki nokta sayısını döndürür. |
| [GetBounds](./getbounds/)(const MatrixPtr\&, const SharedPtr\<Pen\>\&) const | Belirtilen matris ile dönüştürüldüğünde geçerli nesne tarafından temsil edilen yolu sınırlayan bir dikdörtgeni temsil eden bir [RectangleF](../../system.drawing/rectanglef/) nesnesi döndürür. |
| [GetFigureFlags](./getfigureflags/)() | Geçerli nesne tarafından temsil edilen yol içinde bulunan şekil türlerini gösteren Detail::FigureType değerlerinin bit düzeyinde bir kombinasyonu olan bir değer döndürür. |
| [GetLastPoint](./getlastpoint/)() const | Yoldaki son noktayı temsil eden bir [PointF](../../system.drawing/pointf/) nesnesi döndürür. |
| [GraphicsPath](./graphicspath/)(FillMode) | Belirtilen doldurma modu ile yeni bir [GraphicsPath](./) sınıfı örneği oluşturur. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<Point\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | Belirtilen yolu temsil eden yeni bir [GraphicsPath](./) nesnesi oluşturur. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<PointF\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | Belirtilen yolu temsil eden yeni bir [GraphicsPath](./) nesnesi oluşturur. |
| [GraphicsPath](./graphicspath/)(const SkPath\&) |  |
| [IsOutlineVisible](./isoutlinevisible/)(const PointF\&, const SharedPtr\<Pen\>\&) | Belirtilen noktanın, belirtilen [Pen](../../system.drawing/pen/) ile çizildiğinde bu [GraphicsPath](./) konturunun (altında) içinde olup olmadığını gösterir. NOT EMPLEMENTED. |
| [IsVisible](./isvisible/)(const PointF\&) | Belirtilen noktanın geçerli nesne tarafından temsil edilen yol içinde olup olmadığını belirler. |
| [IsVisible](./isvisible/)(float, float) | Belirtilen noktanın geçerli nesne tarafından temsil edilen yol içinde olup olmadığını belirler. |
| [Reset](./reset/)() | Yoldaki tüm noktaları kaldırarak yolu boşaltır. |
| [Reverse](./reverse/)() | Bu [GraphicsPath](./) nesnesinin PathPoints dizisindeki nokta sırasını tersine çevirir. |
| [set_FillMode](./set_fillmode/)(FillMode) | Geçerli nesnenin doldurma modunu ayarlar. |
| [SetMarkers](./setmarkers/)() | UYGULANMADI. |
| [StartFigure](./startfigure/)() | Yeni bir şekil başlatır. |
| [Transform](./transform/)(const MatrixPtr\&) | Geçerli nesne tarafından temsil edilen yolu, belirtilen dönüşüm matrisini uygulayarak dönüştürür. |
| [Transform](./transform/)(const SkMatrix\&) |  |
| [Widen](./widen/)(const SharedPtr\<Pen\>\&) | Bu yolu, orijinal yolun etrafında bir kontur ile değiştirir. |
| [~GraphicsPath](./~graphicspath/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
