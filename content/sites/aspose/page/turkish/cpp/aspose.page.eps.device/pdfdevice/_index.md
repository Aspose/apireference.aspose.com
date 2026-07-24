---
title: "Aspose::Page::EPS::Device::PdfDevice sınıfı"
linktitle: "PdfDevice"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::EPS::Device::PdfDevice sınıfı. Bu sınıf, belgenin C++'ta PDF'ye render edilmesini kapsar."
type: docs
weight: 300
url: /tr/cpp/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class


Bu sınıf, belgenin PDF'ye render edilmesini kapsüller.

```cpp
class PdfDevice : public Aspose::Page::Device,
                  public Aspose::Page::IMultiPageDevice,
                  public Aspose::Page::IStreamable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [AUTHOR](./author/)() | "Author" özelliği değeri. |
| static [BACKGROUND](./background/)() | "Background" özelliği anahtarı. |
| static [BACKGROUND_COLOR](./background_color/)() | "Background color" özelliği anahtarı. |
| virtual [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Verilen şekli kullanarak kırpar. writeClip(Rectangle), writeClip(RectangleF) veya writeClip(Shape) metodlarına yönlendirir. |
| virtual [ClipRect](./cliprect/)(float, float, float, float) | Dikdörtgeni kırpar. clip(Rectangle2D) metodunu çağırır. |
| [ClosePage](./closepage/)() override | Sayfa render edildikten sonra cihazın gerekli hazırlığını yapar. |
| [CloseStream](./closestream/)() |  |
| static [COMPRESS](./compress/)() | "Compress" özelliği anahtarı. |
| virtual [Copy](./copy/)() |  |
| [Create](./create/)() override | Bu cihazın bir kopyasını oluşturur. |
| virtual [Create](./create/)(float, float, float, float) |  |
| [CreatePdfCanvas](./createpdfcanvas/)() |  |
| [Dispose](./dispose/)() override | Grafik bağlamını serbest bırakır. Oluşturulurken restoreOnDispose true ise, writeGraphicsRestore() çağrılacaktır. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Bir yolu çizer. |
| [DrawBitmapGlyph](./drawbitmapglyph/)(System::SharedPtr\<System::Object\>, System::String, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override |  |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) override | Atanan dönüşüm ve arka plan ile bir görüntü çizer. |
| [DrawString](./drawstring/)(System::String, double, double) override | Verilen noktada bir dize çizer. |
| static [EMBED_FONTS](./embed_fonts/)() | "Embed font in document" özelliği anahtarı. |
| static [EMBED_FONTS_AS](./embed_fonts_as/)() | "What font type is used for embedding" özelliği anahtarı. |
| static [EMIT_ERRORS](./emit_errors/)() | "Emit errors" özelliği değeri. |
| static [EMIT_WARNINGS](./emit_warnings/)() | "Emit warnings" özelliği değeri. |
| [EndDocument](./enddocument/)() override | Belge render edildikten sonra cihazın gerekli hazırlığını yapar. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Bir yolu doldurur. |
| [FillLastClip](./filllastclip/)() |  |
| static [FIT_TO_PAGE](./fit_to_page/)() | "Fit content to page" özelliği anahtarı. |
| [get_CurrentPageNumber](./get_currentpagenumber/)() override | Geçerli sayfa numarası. |
| [get_LastWrittenPaint](./get_lastwrittenpaint/)() const | Bir dize etrafında çerçeve ve banner çizer. Metod, dizeyi çizmeye başlamadan önce metin imlecinin ayarlanması gereken noktayı hesaplar ve döndürür. |
| [get_OutputStream](./get_outputstream/)() override | Bir çıktı akışı belirtir veya döndürür. |
| [get_WarningMessage](./get_warningmessage/)() |  |
| [GetFinalWrittenLength](./getfinalwrittenlength/)() override |  |
| [GetTransform](./gettransform/)() override | Geçerli dönüşümü alır. |
| [InitClip](./initclip/)() override | Cihazın kırpmasını başlatır. |
| [InitPageNumbers](./initpagenumbers/)() override | Çıktı sayfa sayısını başlatır. |
| static [KEYWORDS](./keywords/)() | "Keywords" özelliği değeri. |
| [OpenPage](./openpage/)(System::String) override | Sayfa işlenmesinden önce cihazın gerekli hazırlığını yapar. |
| [OpenPage](./openpage/)(float, float) override | Her sayfa işlenmesinden önce cihazın gerekli hazırlığını yapar. |
| static [ORIENTATION](./orientation/)() | "Orientation" özelliği anahtarı. |
| static [PAGE_MARGINS](./page_margins/)() | "Page margins" özelliği anahtarı. |
| static [PAGE_SIZE_](./page_size_/)() | "Page size" özelliği anahtarı. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>) | Çıktı akışıyla yeni bir [PdfDevice](./) örneğini başlatır. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::Size) | Çıktı akışı ve belirtilen sayfa boyutuyla yeni bir [PdfDevice](./) örneğini başlatır. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<PdfDevice\>, bool) | Klon yapıcı. Mevcut cihazla yeni bir [PdfDevice](./) örneğini başlatır. |
| [ReNew](./renew/)() override | Cihazı tüm belge için başlangıç durumuna sıfırlar. Çıktı akışını sıfırlamak için kullanılır. |
| [ReNewForMerge](./renewformerge/)(bool) override | Birden fazla belge birleştirilirken cihazı tüm belge için başlangıç durumuna sıfırlar. Çıktı akışını sıfırlamak için kullanılır. |
| [Reset](./reset/)() override | Sayfa cihazı parametreleri ayarlanacaksa bu yöntem, yazma akışını sayfanın başına geri döndürmeye izin verir. |
| [Reset](./reset/)(bool) override |  |
| virtual [ResetClip](./resetclip/)(System::Drawing::Rectangle) |  |
| [Rotate](./rotate/)(double) override | Mevcut dönüşümü Z ekseni etrafında döndürür. writeTransform(Transform) çağrılır. Pozitif theta açısı ile döndürmek, pozitif x eksenindeki noktaları pozitif y eksenine doğru döndürür. |
| virtual [SavePageTransform](./savepagetransform/)() |  |
| [Scale](./scale/)(double, double) override | Mevcut dönüşüm matrisini ölçeklendirir. writeTransform(Transform) çağrılır. |
| [set_Font](./set_font/)(System::SharedPtr\<BaseTrFont\>) override | Mevcut yazı tipini belirtir. |
| [set_OutputStream](./set_outputstream/)(System::SharedPtr\<System::IO::Stream\>) override | Bir çıktı akışı belirtir veya döndürür. |
| [set_Paint](./set_paint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Mevcut boyamayı döndürür veya belirtir. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<System::Drawing::Pen\>) override | Mevcut çizgiyi döndürür veya belirtir. |
| [SetClip](./setclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Cihazın kırpmasını belirtir. |
| virtual [SetFooter](./setfooter/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| virtual [SetHeader](./setheader/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| [SetSaveFromPatternCreate](./setsavefrompatterncreate/)() |  |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Mevcut dönüşümü belirtir. Çoğu çıktı formatı bu işlevi uygulamadığından, currentTransform'in ters dönüşümü hesaplanır ve ayarlanacak dönüşümle çarpılır. Sonuç daha sonra writeTransform(Transform) çağrısı ile iletilir. |
| [Shear](./shear/)(double, double) override | Mevcut dönüşüm matrisini kaydırır. writeTransform(Transform) çağrılır. |
| [StartDocument](./startdocument/)() override | Belge işlenmeye başlamadan önce cihazın gerekli hazırlığını yapar. |
| static [SUBJECT](./subject/)() | "Subject" özelliği değeri. |
| static [TITLE](./title/)() | "Title" özelliği değeri. |
| [ToString](./tostring/)() const override | Cihaz türünün adını döndürür. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Mevcut dönüşüm matrisini dönüştürür. writeTransform(Transform) metodunu çağırır. |
| [Translate](./translate/)(double, double) override | Mevcut dönüşüm matrisini çevirir. writeTransform(Transform) metodunu çağırır. |
| static [TRANSPARENT](./transparent/)() | "Transparent" özellik anahtarı. |
| [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) override | Diğer çok sayfalı cihazdan sayfa parametrelerini günceller. |
| static [WRITE_IMAGES_AS](./write_images_as/)() | "Format of images" özellik anahtarı. |
| [WriteBackground](./writebackground/)() override | Mevcut arka planı yazar. |
| [WriteCap](./writecap/)(System::Drawing::Drawing2D::LineCap) override | Çizgi ucunu yazar. |
| virtual [WriteClip](./writeclip/)(System::Drawing::RectangleF) |  |
| virtual [WriteClip](./writeclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) |  |
| [WriteComment](./writecomment/)(System::String) override | Bir yorum yazar. |
| [WriteDash](./writedash/)(System::ArrayPtr\<double\>, double, System::Drawing::Drawing2D::DashCap, float) override | Çizgi dash'ını yazar. |
| virtual [WriteGraphicsRestore](./writegraphicsrestore/)() |  |
| virtual [WriteGraphicsSave](./writegraphicssave/)() |  |
| [WriteHeader](./writeheader/)() | Katalogu, docinfo'yu, tercihleri ve (tek sayfa çıktısı kullandığımız için sayfa ağacını) yazar. |
| [WriteJoin](./writejoin/)(System::Drawing::Drawing2D::LineJoin) override | Çizgi birleşimini yazar. |
| [WriteLastWrittenPaint](./writelastwrittenpaint/)() | Son yazılan boyayı yazar. Boya yazıldıktan sonra grafiklerin geri yüklenmesi ("Q") yapıldığında faydalıdır. |
| [WriteMiterLimit](./writemiterlimit/)(float) override | Çizgi miter limitini yazar. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::SolidBrush\>) override | Boyayı verilen renk olarak yazar. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Drawing2D::LinearGradientBrush\>) override | Boyayı verilen degrade olarak yazar. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::TextureBrush\>) override | Boyayı verilen doku olarak yazar. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Boyayı yazar. |
| [WriteString](./writestring/)(System::SharedPtr\<BaseTrFont\>, System::String) override | Belirtilen fontla dizeyi yazar. |
| [WriteTrailer](./writetrailer/)() | PDF belgesinin trailer'ını yazar. |
| virtual [WriteTransform](./writetransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Verilen dönüşüm matrisini dosyaya yazar. |
| [WriteWarning](./writewarning/)(System::String) override | Varsayılan olarak System.err'e bir uyarı yazar. |
| [WriteWidth](./writewidth/)(float) override | Çizgi genişliğini yazar. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [VERSION](./version/) | "Version" özellik anahtarı. |
| static [VERSION5](./version5/) | "Version of Adobe Acrobat Reader" özellik değeri. |

## Deprecated
PdfDevice sınıfı 24.3 sürümünden itibaren kullanımdan kaldırılmıştır. Bunun yerine PsDocument sınıfındaki SaveAsPdf yöntemini kullanın. 24.6 sürümünde bu sınıf tamamen gizlenecek.

## Ayrıca Bakınız

* Class [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* Class [IStreamable](../../aspose.page/istreamable/)
* Namespace [Aspose::Page::EPS::Device](../)
* Library [Aspose.Page for C++](../../)
