---
title: "System::Drawing::Graphics sınıfı"
linktitle: "Graphics"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Graphics sınıfı. Bir çizim yüzeyi temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneği yığına (stack) ya da operator new ile asla oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak C++'de geçirin."
type: docs
weight: 1000
url: /tr/cpp/system.drawing/graphics/
---
## Graphics class


Bir çizim yüzeyi temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class Graphics : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddMetafileComment](./addmetafilecomment/)(const System::ArrayPtr\<uint8_t\>\&) | UYGULANMADI. |
| [BeginContainer](./begincontainer/)() | Bu nesnenin mevcut durumu ile bir konteyneri kaydeder, yeni bir konteyner açar ve kullanır ve kaydedilen konteyneri döndürür. |
| [BeginContainer](./begincontainer/)(Rectangle, Rectangle, GraphicsUnit) | Bu nesnenin mevcut durumu ile bir konteyneri kaydeder, yeni bir konteyner açar ve kullanır ve kaydedilen konteyneri döndürür. |
| [BeginContainer](./begincontainer/)(RectangleF, RectangleF, GraphicsUnit) | Bu nesnenin mevcut durumu ile bir konteyneri kaydeder, yeni bir konteyner açar ve kullanır ve kaydedilen konteyneri döndürür. |
| [Clear](./clear/)(Color) | Mevcut nesne tarafından temsil edilen çizim yüzeyini temizler ve belirtilen renk ile doldurur. |
| [CopyFromScreen](./copyfromscreen/)(Point, Point, Size, CopyPixelOperation) | UYGULANMADI. |
| [CopyFromScreen](./copyfromscreen/)(int32_t, int32_t, int32_t, int32_t, Size, CopyPixelOperation) | UYGULANMADI. |
| [Dispose](./dispose/)() | Geçerli nesne tarafından edinilen tüm işletim sistemi kaynaklarını serbest bırakır. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | Mevcut nesne tarafından temsil edilen yüzeyde belirtilen kalemi kullanarak belirtilen yayı çizer. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | Mevcut nesne tarafından temsil edilen yüzeyde belirtilen kalemi kullanarak belirtilen yayı çizer. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | Mevcut nesne tarafından temsil edilen yüzeyde belirtilen kalemi kullanarak belirtilen yayı çizer. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | Mevcut nesne tarafından temsil edilen yüzeyde belirtilen kalemi kullanarak belirtilen yayı çizer. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const Point\&, const Point\&, const Point\&, const Point\&) | UYGULANMADI. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const PointF\&, const PointF\&, const PointF\&, const PointF\&) | UYGULANMADI. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float, float, float) | UYGULANMADI. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | Belirtilen kalemi kullanarak bir dizi Bezier eğrisi çizer. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | Belirtilen kalemi kullanarak bir dizi Bezier eğrisi çizer. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float, Drawing2D::FillMode) | Belirtilen kalemi kullanarak kapalı bir eğri çizer. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float, Drawing2D::FillMode) | Belirtilen kalemi kullanarak kapalı bir eğri çizer. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float) | Belirtilen kalemi kullanarak bir eğri çizer. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float) | Belirtilen kalemi kullanarak bir eğri çizer. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, int32_t, int32_t, float) | Belirtilen kalemi kullanarak bir eğri çizer. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, int32_t, int32_t, float) | Belirtilen kalemi kullanarak bir eğri çizer. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, Rectangle) | Mevcut nesne tarafından temsil edilen yüzeyde belirtilen kalemi kullanarak belirtilen elipsi çizer. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, RectangleF) | Mevcut nesne tarafından temsil edilen yüzeyde belirtilen kalemi kullanarak belirtilen elipsi çizer. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Mevcut nesne tarafından temsil edilen yüzeyde belirtilen kalemi kullanarak belirtilen elipsi çizer. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Mevcut nesne tarafından temsil edilen yüzeyde belirtilen kalemi kullanarak belirtilen elipsi çizer. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, Rectangle) | UYGULANMADI. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, int32_t, int32_t) | UYGULANMADI. |
| [DrawIconUnstretched](./drawiconunstretched/)(const SharedPtr\<Icon\>\&, Rectangle) | UYGULANMADI. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<Point\>\&) | UYGULANMADI. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Belirtilen konumda belirtilen görüntünün belirtilen bölgesini çizer. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::ArrayView\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Belirtilen konumda belirtilen görüntünün belirtilen bölgesini çizer. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::StackArray\<PointF, N\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Belirtilen konumda belirtilen görüntünün belirtilen bölgesini çizer. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int) | Belirtilen konumda belirtilen görüntüyü çizer. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float) | Belirtilen konumda belirtilen görüntüyü çizer. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Point) | Belirtilen konumda belirtilen görüntüyü çizer. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, PointF) | Belirtilen konumda belirtilen görüntüyü çizer. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, int, int) | Belirtilen görüntüyü belirtilen dikdörtgene çizer. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, float, float) | Belirtilen görüntüyü belirtilen dikdörtgene çizer. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, RectangleF, RectangleF, GraphicsUnit) | Belirtilen konumda belirtilen görüntünün belirtilen bölgesini çizer. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, Rectangle, GraphicsUnit) | Belirtilen konumda belirtilen görüntünün belirtilen bölgesini çizer. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, Rectangle, GraphicsUnit) | Belirtilen konumda belirtilen görüntünün belirtilen bölgesini çizer. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const Rectangle\&) | Belirtilen konumda belirtilen görüntüyü çizer. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const RectangleF\&) | Belirtilen konumda belirtilen görüntüyü çizer. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Belirtilen görüntünün belirtilen bölgesini belirtilen dikdörtgene çizer. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Belirtilen görüntünün belirtilen bölgesini belirtilen dikdörtgene çizer. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit) | Belirtilen görüntünün belirtilen bölgesini belirtilen dikdörtgene çizer. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit) | Belirtilen görüntünün belirtilen bölgesini belirtilen dikdörtgene çizer. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | UYGULANMADI. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | UYGULANMADI. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | UYGULANMADI. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | UYGULANMADI. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit) | UYGULANMADI. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&) | UYGULANMADI. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit) | UYGULANMADI. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, const SharedPtr\<Imaging::ImageAttributes\>\&) | Belirtilen konumda belirtilen görüntünün belirtilen bölgesini çizer. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, RectangleF, GraphicsUnit) | Belirtilen konumda belirtilen görüntünün belirtilen bölgesini çizer. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int) | Belirtilen görüntüyü orijinal fiziksel boyutu ile belirtilen konumda çizer. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int, int, int) | Belirtilen bir görüntüyü orijinal fiziksel boyutu ile belirtilen bir konumda çizer. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Rectangle\&) | Belirtilen bir görüntüyü orijinal fiziksel boyutu ile belirtilen bir konumda çizer. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Point\&) | Belirtilen bir görüntüyü orijinal fiziksel boyutu ile belirtilen bir konumda çizer. |
| [DrawImageUnscaledAndClipped](./drawimageunscaledandclipped/)(const SharedPtr\<Image\>\&, Rectangle) | UYGULANMADI. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, Point, Point) | Belirtilen kalemi kullanarak belirtilen çizgiyi çizer. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, PointF, PointF) | Belirtilen kalemi kullanarak belirtilen çizgiyi çizer. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Belirtilen kalemi kullanarak belirtilen çizgiyi çizer. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Belirtilen kalemi kullanarak belirtilen çizgiyi çizer. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::Point\>\&) | Belirtilen kalemi kullanarak bir dizi çizgi segmenti çizer. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::PointF\>\&) | Belirtilen kalemi kullanarak bir dizi çizgi segmenti çizer. |
| [DrawPath](./drawpath/)(const SharedPtr\<Pen\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Belirtilen kalemi kullanarak belirtilen yolu çizer. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | Mevcut nesne tarafından temsil edilen yüzeyde belirtilen kalemi kullanarak belirtilen pasta dilimini çizer. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | Mevcut nesne tarafından temsil edilen yüzeyde belirtilen kalemi kullanarak belirtilen pasta dilimini çizer. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | Mevcut nesne tarafından temsil edilen yüzeyde belirtilen kalemi kullanarak belirtilen pasta dilimini çizer. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | Mevcut nesne tarafından temsil edilen yüzeyde belirtilen kalemi kullanarak belirtilen pasta dilimini çizer. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | Belirtilen kalemi kullanarak bir çokgen çizer. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | Belirtilen kalemi kullanarak bir çokgen çizer. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Mevcut nesne tarafından temsil edilen yüzeyde belirtilen kalemi kullanarak belirtilen dikdörtgeni çizer. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Mevcut nesne tarafından temsil edilen yüzeyde belirtilen kalemi kullanarak belirtilen dikdörtgeni çizer. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, Rectangle) | Mevcut nesne tarafından temsil edilen yüzeyde belirtilen kalemi kullanarak belirtilen dikdörtgeni çizer. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Rectangle\>\&) | Belirtilen kalemi kullanarak bir dizi dikdörtgen çizer. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<RectangleF\>\&) | Belirtilen kalemi kullanarak bir dizi dikdörtgen çizer. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Belirtilen konumda belirtilen dizeyi belirtilen yazı tipi ve fırça ile çizer. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Belirtilen dikdörtgende belirtilen dizeyi belirtilen yazı tipi ve fırça ile çizer. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Belirtilen konumda belirtilen dizeyi belirtilen yazı tipi ve fırça ile çizer. |
| [EndContainer](./endcontainer/)(const SharedPtr\<Drawing2D::GraphicsContainer\>\&) | Mevcut konteyneri kapatır ve bu nesnenin durumunu kaydedilen konteynerin durumundan geri yükler. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, Graphics::EnumerateMetafileProc) | UYGULANMADI. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Graphics::EnumerateMetafileProc) | UYGULANMADI. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Graphics::EnumerateMetafileProc) | UYGULANMADI. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, Graphics::EnumerateMetafileProc) | UYGULANMADI. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Graphics::EnumerateMetafileProc) | UYGULANMADI. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, Graphics::EnumerateMetafileProc) | UYGULANMADI. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | UYGULANMADI. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | UYGULANMADI. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | UYGULANMADI. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | UYGULANMADI. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | UYGULANMADI. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | UYGULANMADI. |
| [ExcludeClip](./excludeclip/)(Rectangle) | UYGULANMADI. |
| [ExcludeClip](./excludeclip/)(const SharedPtr\<Region\>\&) | UYGULANMADI. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode, float) | Belirtilen fırçayı kullanarak kapalı bir eğri çizer. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode, float) | Belirtilen fırçayı kullanarak kapalı bir eğri çizer. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, Rectangle) | Sınırlayıcı dikdörtgen tarafından tanımlanan elipsin içini belirtilen fırça ile doldurur. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, RectangleF) | Sınırlayıcı dikdörtgen tarafından tanımlanan elipsin içini belirtilen fırça ile doldurur. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, int, int, int, int) | Sınırlayıcı dikdörtgen tarafından tanımlanan elipsin içini belirtilen fırça ile doldurur. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, float, float, float, float) | Sınırlayıcı dikdörtgen tarafından tanımlanan elipsin içini belirtilen fırça ile doldurur. |
| [FillPath](./fillpath/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Belirtilen yolu, belirtilen fırça kullanarak içlerini doldurur. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, int, int, int, int, int, int) | Geçerli nesnenin temsil ettiği yüzeyde, belirtilen dilimi belirtilen fırça kullanarak doldurur. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, float, float, float, float, float, float) | Geçerli nesnenin temsil ettiği yüzeyde, belirtilen dilimi belirtilen fırça kullanarak doldurur. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, Rectangle, float, float) | Geçerli nesnenin temsil ettiği yüzeyde, belirtilen dilimi belirtilen fırça kullanarak doldurur. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode) | Belirtilen çokgenin içlerini belirtilen fırça kullanarak doldurur. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode) | Belirtilen çokgenin içlerini belirtilen fırça kullanarak doldurur. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, float, float, float, float) | Belirtilen dikdörtgeni belirtilen fırça ile doldurur. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, int, int, int, int) | Belirtilen dikdörtgeni belirtilen fırça ile doldurur. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, Rectangle) | Belirtilen dikdörtgeni belirtilen fırça ile doldurur. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, RectangleF) | Belirtilen dikdörtgeni belirtilen fırça ile doldurur. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Rectangle\>\&) | Belirtilen fırça kullanarak bir dizi dikdörtgeni doldurur. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<RectangleF\>\&) | Belirtilen fırça kullanarak bir dizi dikdörtgeni doldurur. |
| [FillRegion](./fillregion/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Region\>\&) | Belirtilen bölgenin içlerini belirtilen fırça kullanarak doldurur. |
| [Flush](./flush/)(Drawing2D::FlushIntention) | Bekleyen tüm çizim işlemlerinin hemen yürütülmesini tetikler. |
| static [FromHwnd](./fromhwnd/)(IntPtr) | UYGULANMADI. |
| static [FromHwndInternal](./fromhwndinternal/)(IntPtr) | UYGULANMADI. |
| static [FromImage](./fromimage/)(const SharedPtr\<Image\>\&) | Belirtilen görüntüden yeni bir [Graphics](./) nesnesi oluşturur. |
| [get_Clip](./get_clip/)() | Geçerli [Graphics](./) nesnesinin temsil ettiği çizim yüzeyinin çizim alanını sınırlayan bir bölgeyi temsil eden bir [Region](../region/) nesnesi döndürür. |
| [get_ClipBounds](./get_clipbounds/)() const | Geçerli nesnenin temsil ettiği yüzeyin kırpma alanını sınırlayan bir dikdörtgen döndürür. |
| [get_CompositingMode](./get_compositingmode/)() | Geçerli nesnenin temsil ettiği yüzeyde birleştirilmiş görüntülerin nasıl çizildiğini gösteren bir değer döndürür. |
| [get_CompositingQuality](./get_compositingquality/)() | Görüntü birleştirme sırasında kullanılan kalite seviyesini gösteren bir değer döndürür. |
| [get_DpiX](./get_dpix/)() | Yatay çözünürlüğü döndürür. |
| [get_DpiY](./get_dpiy/)() | Dikey çözünürlüğü döndürür. |
| [get_InterpolationMode](./get_interpolationmode/)() | Geçerli nesneyle ilişkili ara değerleme modunu gösteren bir değer döndürür. |
| [get_IsClipEmpty](./get_isclipempty/)() const | UYGULANMADI. |
| [get_IsVisibleClipEmpty](./get_isvisibleclipempty/)() const | UYGULANMADI. |
| [get_PageScale](./get_pagescale/)() const | Geçerli [Graphics](./) nesnesi için dünya birimleri ile sayfa birimleri arasındaki ölçeklemeyi döndürür. |
| [get_PageUnit](./get_pageunit/)() const | Geçerli nesnenin temsil ettiği yüzeyde sayfa koordinatları için kullanılan ölçüm birimlerini döndürür. |
| [get_PixelOffsetMode](./get_pixeloffsetmode/)() | Geçerli nesnenin temsil ettiği yüzeyde işleme sırasında piksellerin nasıl kaydırıldığını gösteren bir değer döndürür. |
| [get_RenderingOrigin](./get_renderingorigin/)() const | Geçerli [Graphics](./) nesnesinin, titreme ve tarama fırçaları için işleme başlangıç noktasını temsil eden bir [Point](../point/) nesnesi döndürür. |
| [get_SmoothingMode](./get_smoothingmode/)() | Geçerli nesnenin temsil ettiği yüzeyde işleme sırasında kullanılan yumuşatma modunu gösteren bir değer döndürür. |
| [get_TextContrast](./get_textcontrast/)() const | UYGULANMADI. |
| [get_TextRenderingHint](./get_textrenderinghint/)() | Metin işleme kalitesini gösteren bir değer döndürür. |
| [get_Transform](./get_transform/)() | Geçerli [Graphics](./) nesnesi için geometrik dünya dönüşümünü döndürür. |
| [get_VisibleClipBounds](./get_visibleclipbounds/)() const | Geçerli [Graphics](./) nesnesinin görünür kırpma bölgesinin sınırlayıcı dikdörtgenini temsil eden bir [RectangleF](../rectanglef/) nesnesi döndürür. |
| [GetHdc](./gethdc/)() | UYGULANMADI. |
| [GetNearestColor](./getnearestcolor/)(Color) | UYGULANMADI. |
| [GetSkCanvas](./getskcanvas/)() const |  |
| [IntersectClip](./intersectclip/)(const System::SharedPtr\<Region\>\&) | Bu nesnenin kırpma bölgesini, geçerli kırpma ve belirtilen kırpmanın kesişimiyle günceller. |
| [IntersectClip](./intersectclip/)(System::Drawing::RectangleF) | Bu nesnenin kırpma bölgesini, geçerli kırpma ve belirtilen kırpmanın kesişimiyle günceller. |
| [IntersectClip](./intersectclip/)(System::Drawing::Rectangle) | Bu nesnenin kırpma bölgesini, geçerli kırpma ve belirtilen kırpmanın kesişimiyle günceller. |
| [IsVisible](./isvisible/)(Point) | Belirtilen noktanın, geçerli [Graphics](./) nesnesinin görünür kırpma bölgesi içinde olup olmadığını belirler. |
| [IsVisible](./isvisible/)(PointF) | UYGULANMADI. |
| [IsVisible](./isvisible/)(Rectangle) | UYGULANMADI. |
| [IsVisible](./isvisible/)(RectangleF) | UYGULANMADI. |
| [IsVisible](./isvisible/)(int32_t, int32_t) | UYGULANMADI. |
| [IsVisible](./isvisible/)(float, float) | UYGULANMADI. |
| [IsVisible](./isvisible/)(float, float, float, float) | UYGULANMADI. |
| [IsVisible](./isvisible/)(int32_t, int32_t, int32_t, int32_t) | UYGULANMADI. |
| [MeasureCharacterRanges](./measurecharacterranges/)(const System::String\&, const SharedPtr\<Font\>\&, RectangleF, const SharedPtr\<StringFormat\>\&) | Belirtilen dizedeki karakter konumlarını sınırlayan her bir bölgeyi içeren bir dizi döndürür. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const | Belirtilen dize, belirtilen yazı tipinde ve belirtilen biçimde çizildiğinde boyutunu döndürür. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const | Belirtilen dize, belirtilen yazı tipinde ve belirtilen biçimde çizildiğinde boyutunu döndürür. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const | UYGULANMADI. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const | Belirtilen dize, belirtilen yazı tipinde ve belirtilen biçimde çizildiğinde boyutunu döndürür. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Geçerli [Graphics](./) nesnesinin dünya dönüşüm matrisini belirtilen matrisle çarpar. |
| [ReleaseHdc](./releasehdc/)() | UYGULANMADI. |
| [ReleaseHdc](./releasehdc/)(IntPtr) | UYGULANMADI. |
| [ResetClip](./resetclip/)() | Bu grafik için kırpma bölgesini sonsuz bir bölgeye sıfırlar. |
| [ResetTransform](./resettransform/)() | Geçerli nesnenin dünya dönüşüm matrisini kimlik matrisine dönüşecek şekilde sıfırlar. |
| [Restore](./restore/)(const SharedPtr\<Drawing2D::GraphicsState\>\&) | Bu nesnenin durumunu kaydedilmiş durumdan geri yükler. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Belirtilen dönüşü, geçerli [Graphics](./) nesnesinin dünya dönüşüm matrisine belirtilen sırayla uygular. |
| [Save](./save/)() | Bu nesnenin geçerli durumunu kaydeder ve kaydedilen durumu döndürür. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Belirtilen ölçek vektörünü geçerli nesnenin dünya dönüşüm matrisine uygular. |
| [set_Clip](./set_clip/)(const SharedPtr\<Region\>\&) | Geçerli nesne tarafından temsil edilen çizim yüzeyinin çizim alanını sınırlayan bir bölge ayarlar. |
| [set_CompositingMode](./set_compositingmode/)(Drawing2D::CompositingMode) | Geçerli nesne tarafından temsil edilen yüzeyde birleştirilmiş görüntülerin nasıl çizileceğini belirten bir değer ayarlar. |
| [set_CompositingQuality](./set_compositingquality/)(Drawing2D::CompositingQuality) | Görüntüler birleştirilirken kullanılacak kalite seviyesini belirten bir değer ayarlar. |
| [set_InterpolationMode](./set_interpolationmode/)(Drawing2D::InterpolationMode) | Geçerli nesneyle ilişkili ara değerleme modunu gösteren bir değer ayarlar. |
| [set_PageScale](./set_pagescale/)(float) | Geçerli [Graphics](./) nesnesi için dünya birimleri ile sayfa birimleri arasındaki ölçeklemeyi ayarlar. |
| [set_PageUnit](./set_pageunit/)(GraphicsUnit) | Geçerli nesne tarafından temsil edilen yüzeyde sayfa koordinatları için kullanılan ölçüm birimlerini ayarlar. |
| [set_PixelOffsetMode](./set_pixeloffsetmode/)(Drawing2D::PixelOffsetMode) | Geçerli nesne tarafından temsil edilen yüzeyde renderleme sırasında piksellerin nasıl ofsetleneceğini belirten bir değer ayarlar. |
| [set_RenderingOrigin](./set_renderingorigin/)(Point) | Geçerli [Graphics](./) nesnesinin dithering ve tarama fırçaları için renderleme başlangıç noktasını belirten bir [Point](../point/) nesnesi ayarlar. |
| [set_SmoothingMode](./set_smoothingmode/)(Drawing2D::SmoothingMode) | Geçerli nesne tarafından temsil edilen yüzeyde renderleme sırasında kullanılan bir rahatlatma modunu belirten bir değer ayarlar. |
| [set_TextContrast](./set_textcontrast/)(int32_t) | UYGULANMADI. |
| [set_TextRenderingHint](./set_textrenderinghint/)(Text::TextRenderingHint) | Metin renderleme kalitesini belirten bir değer ayarlar. |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Geçerli [Graphics](./) nesnesi için geometrik dünya dönüşümünü ayarlar. |
| [SetClip](./setclip/)(const SharedPtr\<Region\>\&, Drawing2D::CombineMode) | Geçerli [Graphics](./) nesnesi tarafından temsil edilen çizim yüzeyinin kırpma bölgesini, geçerli kırpma bölgesi ile belirtilen bölgeyi birleştiren belirtilen işlemin sonucuna ayarlar. |
| [SetClip](./setclip/)(Rectangle, Drawing2D::CombineMode) | Geçerli [Graphics](./) nesnesi tarafından temsil edilen çizim yüzeyinin kırpma bölgesini, geçerli kırpma bölgesi ile belirtilen bölgeyi birleştiren belirtilen işlemin sonucuna ayarlar. |
| [SetClip](./setclip/)(RectangleF, Drawing2D::CombineMode) | Geçerli [Graphics](./) nesnesi tarafından temsil edilen çizim yüzeyinin kırpma bölgesini, geçerli kırpma bölgesi ile belirtilen bölgeyi birleştiren belirtilen işlemin sonucuna ayarlar. |
| [SetClip](./setclip/)(const SharedPtr\<Graphics\>\&, Drawing2D::CombineMode) | UYGULANMADI. |
| [SetClip](./setclip/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&, Drawing2D::CombineMode) | Geçerli [Graphics](./) nesnesi tarafından temsil edilen çizim yüzeyinin kırpma bölgesini, geçerli kırpma bölgesi ile bir grafik yolu tarafından belirtilen bölgeyi birleştiren belirtilen işlemin sonucuna ayarlar. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::Point\>\&) | UYGULANMADI. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::PointF\>\&) | UYGULANMADI. |
| [TranslateClip](./translateclip/)(int, int) | UYGULANMADI. |
| [TranslateClip](./translateclip/)(float, float) | UYGULANMADI. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Belirtilen çeviri vektörünü geçerli [Graphics](./) nesnesinin dünya dönüşüm matrisine uygular. |
| [~Graphics](./~graphics/)() |  |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [DrawImageAbort](./drawimageabort/) | DrawImage yöntemi için argüman olarak kullanılan bir geri çağırma işlev nesnesinin türü. |
| [EnumerateMetafileProc](./enumeratemetafileproc/) | EnumerateMetafile yöntemi için argüman olarak kullanılan bir geri çağırma işlev nesnesinin türü. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
