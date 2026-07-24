---
title: "System::Drawing::Drawing2D::GraphicsPath sınıfı"
linktitle: "GraphicsPath"
second_title: "Aspose.Page için C++"
description: "System::Drawing::Drawing2D::GraphicsPath sınıfı. Bağlantılı çizgiler ve eğrilerden oluşan bir küme temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 600
url: /tr/cpp/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class


Bağlantılı çizgi ve eğrilerden oluşan bir küme temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class GraphicsPath : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddArc](./addarc/)(float, float, float, float, float, float) | Belirtilen eliptik yay, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddArc](./addarc/)(int, int, int, int, float, float) | Belirtilen eliptik yay, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddArc](./addarc/)(const RectangleF\&, float, float) | Belirtilen eliptik yay, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddArc](./addarc/)(const Rectangle\&, float, float) | Belirtilen eliptik yay, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddBezier](./addbezier/)(const Point\&, const Point\&, const Point\&, const Point\&) | Belirtilen kübik Bezier eğrisi, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddBezier](./addbezier/)(const PointF\&, const PointF\&, const PointF\&, const PointF\&) | Belirtilen kübik Bezier eğrisi, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddBezier](./addbezier/)(int, int, int, int, int, int, int, int) | Belirtilen kübik Bezier eğrisi, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddBezier](./addbezier/)(float, float, float, float, float, float, float, float) | Belirtilen kübik Bezier eğrisi, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<Point\>\&) | Bağlantılı kübik Bezier eğrilerinin bir dizisi, geçerli şekle eklenir. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<PointF\>\&) | Bağlantılı kübik Bezier eğrilerinin bir dizisi, geçerli şekle eklenir. |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<PointF\>\&, float) | Belirtilen kapalı eğri, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<Point\>\&, float) | Belirtilen kapalı eğri, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, float) | Belirtilen eğri, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, float) | Belirtilen eğri, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, int, int, float) | Belirtilen eğri, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, int, int, float) | Belirtilen eğri, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddEllipse](./addellipse/)(float, float, float, float) | Belirtilen elips, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddEllipse](./addellipse/)(int, int, int, int) | Belirtilen elips, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddEllipse](./addellipse/)(const RectangleF\&) | Belirtilen elips, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddEllipse](./addellipse/)(const Rectangle\&) | Belirtilen elips, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddLine](./addline/)(const Point\&, const Point\&) | Belirtilen çizgi, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddLine](./addline/)(const PointF\&, const PointF\&) | Belirtilen çizgi, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddLine](./addline/)(int, int, int, int) | Belirtilen çizgi, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddLine](./addline/)(float, float, float, float) | Belirtilen çizgi, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddLines](./addlines/)(const ArrayPtr\<PointF\>\&) | Belirtilen bağlantılı çizgi segmentleri serisi, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddLines](./addlines/)(const ArrayPtr\<Point\>\&) | Belirtilen bağlantılı çizgi segmentleri serisi, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddPath](./addpath/)(const SharedPtr\<GraphicsPath\>\&, bool) | Belirtilen yol, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddPie](./addpie/)(float, float, float, float, float, float) | Belirtilen pasta şeklinin dış hatları, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddPie](./addpie/)(int, int, int, int, float, float) | Belirtilen pasta şeklinin dış hatları, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddPie](./addpie/)(const Rectangle\&, float, float) | Belirtilen pasta şeklinin dış hatları, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<PointF\>\&) | Belirtilen çokgen, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<Point\>\&) | Belirtilen çokgen, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddRectangle](./addrectangle/)(const Rectangle\&) | Belirtilen dikdörtgen, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddRectangle](./addrectangle/)(const RectangleF\&) | Belirtilen dikdörtgen, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<Rectangle\>\&) | Belirtilen dikdörtgen serisi, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<RectangleF\>\&) | Belirtilen dikdörtgen serisi, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Point, const SharedPtr\<StringFormat\>\&) | Bir metin dizesi, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, PointF, const SharedPtr\<StringFormat\>\&) | Bir metin dizesi, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Rectangle, const SharedPtr\<StringFormat\>\&) | Bir metin dizesi, geçerli nesne tarafından temsil edilen yola eklenir. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, RectangleF, const SharedPtr\<StringFormat\>\&) | Bir metin dizesi, geçerli nesne tarafından temsil edilen yola eklenir. |
| virtual [Clone](./clone/)() | Geçerli nesnenin bir kopyasını oluşturur. |
| [CloseAllFigures](./closeallfigures/)() | Tüm açık şekilleri kapatır ve yeni bir tane başlatır. |
| [CloseFigure](./closefigure/)() | Geçerli şekli kapatır ve yeni bir tane başlatır. |
| [Dispose](./dispose/)() | Geçerli nesne tarafından edinilen tüm işletim sistemi kaynaklarını serbest bırakır. |
| [Flatten](./flatten/)() | Yoldaki her eğriyi bağlantılı çizgi serisine dönüştürerek düzleştirir. 0.25 düzleştirme değeri kullanılır. |
| [Flatten](./flatten/)(const MatrixPtr\&) | Yoldaki her eğriyi bağlantılı çizgi serisine dönüştürerek düzleştirir. 0.25 düzleştirme değeri kullanılır. |
| [Flatten](./flatten/)(const MatrixPtr\&, float) | Yoldaki her eğriyi bağlantılı çizgi serisine dönüştürerek düzleştirir. |
| [get_FillMode](./get_fillmode/)() | Geçerli nesnenin doldurma kipini döndürür. |
| [get_PathData](./get_pathdata/)() | Geçerli nesne tarafından temsil edilen bir yolu oluşturan noktaları ve türlerini içeren bir [PathData](../pathdata/) nesnesi döndürür. |
| [get_PathPoints](./get_pathpoints/)() const | Geçerli nesne tarafından temsil edilen bir yolu oluşturan noktaları içeren bir dizi döndürür. |
| [get_PathTypes](./get_pathtypes/)() const | Geçerli nesne tarafından temsil edilen bir yolu oluşturan noktaların türlerini gösteren değerleri içeren bir dizi döndürür. |
| [get_PointCount](./get_pointcount/)() const | Geçerli nesne tarafından temsil edilen yoldaki nokta sayısını döndürür. |
| [GetBounds](./getbounds/)(const MatrixPtr\&, const SharedPtr\<Pen\>\&) const | Belirtilen matrisle dönüştürüldüğünde, geçerli nesne tarafından temsil edilen yolu sınırlayan bir dikdörtgeni temsil eden bir [RectangleF](../../system.drawing/rectanglef/) nesnesi döndürür. |
| [GetFigureFlags](./getfigureflags/)() | Geçerli nesne tarafından temsil edilen yol içinde bulunan şekil türlerini gösteren, Detail::FigureType değerlerinin bit düzeyinde bir kombinasyonu olan bir değer döndürür. |
| [GetLastPoint](./getlastpoint/)() const | Yoldaki son noktayı temsil eden bir [PointF](../../system.drawing/pointf/) nesnesi döndürür. |
| [GraphicsPath](./graphicspath/)(FillMode) | Belirtilen doldurma kipine sahip yeni bir [GraphicsPath](./) sınıfı örneği oluşturur. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<Point\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | Belirtilen yolu temsil eden yeni bir [GraphicsPath](./) nesnesi oluşturur. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<PointF\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | Belirtilen yolu temsil eden yeni bir [GraphicsPath](./) nesnesi oluşturur. |
| [GraphicsPath](./graphicspath/)(const SkPath\&) |  |
| [IsOutlineVisible](./isoutlinevisible/)(const PointF\&, const SharedPtr\<Pen\>\&) | Belirtilen noktanın, belirtilen [Pen](../../system.drawing/pen/) ile çizildiğinde bu [GraphicsPath](./) dış hattının (altında) içinde olup olmadığını gösterir. UYGULANMADI. |
| [IsVisible](./isvisible/)(const PointF\&) | Belirtilen noktanın geçerli nesne tarafından temsil edilen yol içinde olup olmadığını belirler. |
| [IsVisible](./isvisible/)(float, float) | Belirtilen noktanın geçerli nesne tarafından temsil edilen yol içinde olup olmadığını belirler. |
| [Reset](./reset/)() | Yoldaki tüm noktaları kaldırarak yolu boşaltır. |
| [Reverse](./reverse/)() | Bu [GraphicsPath](./) nesnesinin PathPoints dizisindeki nokta sırasını tersine çevirir. |
| [set_FillMode](./set_fillmode/)(FillMode) | Geçerli nesnenin doldurma kipini ayarlar. |
| [SetMarkers](./setmarkers/)() | UYGULANMADI. |
| [StartFigure](./startfigure/)() | Yeni bir şekil başlatır. |
| [Transform](./transform/)(const MatrixPtr\&) | Geçerli nesne tarafından temsil edilen yolu, belirtilen dönüşüm matrisini uygulayarak dönüştürür. |
| [Transform](./transform/)(const SkMatrix\&) |  |
| [Widen](./widen/)(const SharedPtr\<Pen\>\&) | Bu yolu, orijinal yolun etrafında bir dış hatla değiştirir. |
| [~GraphicsPath](./~graphicspath/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
