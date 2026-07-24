---
title: "Aspose::Page::XPS::XpsDocument sınıf"
linktitle: "XpsDocument"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsDocument sınıfı. XPS belgesinin ana varlığını kapsayan sınıf, C++'ta herhangi bir XPS öğesi için manipülasyon yöntemleri sağlar."
type: docs
weight: 400
url: /tr/cpp/aspose.page.xps/xpsdocument/
---
## XpsDocument class


Ana varlığı kapsayan sınıf, [XPS](../) belgesinin herhangi bir [XPS](../) öğesi için manipülasyon yöntemleri sağlar.

```cpp
class XpsDocument : public Aspose::Page::Document,
                    public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(T) | Bir içerik öğesi ekler (Canvas, Path veya Glyphs). |
| [AddCanvas](./addcanvas/)() | Etkin sayfaya yeni bir kanvas ekler. |
| [AddDocument](./adddocument/)(bool) | Varsayılan sayfa boyutuyla boş bir belge ekler. |
| [AddDocument](./adddocument/)(float, float, bool) | İlk sayfanın *width* ve *height* boyutlarıyla boş bir belge ekler. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Etkin sayfaya yeni glifler ekler. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Etkin sayfaya yeni glifler ekler. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, System::SharedPtr\<XpsModel::XpsHyperlinkTarget\>) | Belgeye bir anahat girişi ekler. |
| [AddPage](./addpage/)(bool) | Belgeye varsayılan sayfa boyutuyla boş bir sayfa ekler. |
| [AddPage](./addpage/)(float, float, bool) | Belgeye belirtilen *width* ve *height* boyutlarıyla boş bir sayfa ekler. |
| [AddPage](./addpage/)(System::SharedPtr\<XpsModel::XpsPage\>, bool) | Belgeye bir sayfa ekler. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Etkin sayfaya yeni bir yol ekler. |
| [Assert](./assert/)() |  |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Yeni bir eliptik yay segmenti oluşturur. |
| [CreateCanvas](./createcanvas/)() | Yeni bir canvas oluşturur. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Yeni bir renk oluşturur. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | sRGB renk uzayında yeni bir renk oluşturur. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | sRGB renk uzayında yeni bir renk oluşturur. |
| [CreateColor](./createcolor/)(float, float, float, float) | scRGB renk uzayında yeni bir renk oluşturur. |
| [CreateColor](./createcolor/)(float, float, float) | scRGB renk uzayında yeni bir renk oluşturur. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | ICC tabanlı renk uzayında yeni bir renk oluşturur. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | ICC tabanlı renk uzayında yeni bir renk oluşturur. |
| [CreateFont](./createfont/)(System::String, System::Drawing::FontStyle) | Yeni bir **TrueType** yazı tipi kaynağı oluşturur. |
| [CreateFont](./createfont/)(System::SharedPtr\<System::IO::Stream\>) | Akıştan yeni bir **TrueType** yazı tipi kaynağı oluşturur. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Yeni glyphs oluşturur. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Yeni glyphs oluşturur. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Yeni bir gradient durak noktası oluşturur. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Yeni bir gradient durak noktası oluşturur. |
| [CreateIccProfile](./createiccprofile/)(System::String) | *iccProfilePath* konumundaki ICC profil dosyasından yeni bir ICC profil kaynağı oluşturur. |
| [CreateIccProfile](./createiccprofile/)(System::SharedPtr\<System::IO::Stream\>) | *stream* üzerinden yeni bir ICC profil kaynağı oluşturur. |
| [CreateImage](./createimage/)(System::String) | *imagePath* konumundaki görüntü dosyasından yeni bir resim kaynağı oluşturur. |
| [CreateImage](./createimage/)(System::SharedPtr\<System::IO::Stream\>) | *stream* üzerinden yeni bir resim kaynağı oluşturur. |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Yeni bir görüntü fırçası oluşturur. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | Yeni bir görüntü fırçası oluşturur. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | Yeni bir doğrusal gradient fırçası oluşturur. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | Yeni bir doğrusal gradient fırçası oluşturur. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | Yeni bir afine dönüşüm matrisi oluşturur. |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Yeni bir yol oluşturur. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | Yeni bir yol şekli oluşturur. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | Yeni bir yol şekli oluşturur. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | Kısaltılmış biçimde belirtilen yeni bir yol geometrisi oluşturur. |
| [CreatePathGeometry](./createpathgeometry/)() | Yeni bir yol geometrisi oluşturur. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | Belirtilen yol şekli listesine sahip yeni bir yol geometrisi oluşturur. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Yeni bir kübik Bézier eğrileri kümesi oluşturur. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Keyfi sayıda bireysel köşe içeren yeni bir çokgen çizim oluşturur. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Yol şekli içindeki önceki noktadan bir dizi köşe üzerinden, belirtilen kontrol noktalarını kullanarak yeni bir kuadratik Bézier eğrileri kümesi oluşturur. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | Yeni bir radyal gradient fırçası oluşturur. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | Yeni bir radyal gradient fırçası oluşturur. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | Yeni bir katı renk fırçası oluşturur. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | Yeni bir katı renk fırçası oluşturur. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Yeni bir görsel fırça oluşturur. |
| [Dispose](./dispose/)() override | Örneği serbest bırakır. |
| [get_ActiveDocument](./get_activedocument/)() | Etkin belgenin numarasını alır. |
| [get_ActivePage](./get_activepage/)() | Etkin belge içindeki etkin sayfanın numarasını alır. |
| [get_DocumentCount](./get_documentcount/)() | [XPS](../) paketindeki belge sayısını döndürür. |
| [get_JobPrintTicket](./get_jobprintticket/)() | Belgenin iş yazdırma biletini döndürür/ayarlar. |
| [get_Page](./get_page/)() | Etkin sayfa için bir [XpsPage](../) örneği döndürür. |
| [get_PageCount](./get_pagecount/)() | Etkin belgede sayfa sayısını döndürür. |
| [get_TotalPageCount](./get_totalpagecount/)() | [XPS](../) belgesi içindeki tüm belgelerdeki toplam sayfa sayısını döndürür. |
| [get_Utils](./get_utils/)() const | Resmi [XPS](../) manipülasyon API'sinin ötesinde yardımcı araçlar sağlayan nesneyi alır. |
| [GetDocumentPrintTicket](./getdocumentprintticket/)(int32_t) | Belirtilen *documentIndex* indeksli belgenin baskı bileti döndürülür . |
| [GetPagePrintTicket](./getpageprintticket/)(int32_t, int32_t) | Belirtilen *documentIndex* indeksli belgede *pageIndex* indeksli sayfanın baskı bileti döndürülür . |
| [Insert](./insert/)(int32_t, T) | *index* konumunda aktif sayfaya bir öğe (Canvas, Path veya Glyphs) ekler. |
| [InsertCanvas](./insertcanvas/)(int32_t) | *index* konumunda aktif sayfaya yeni bir canvas ekler. |
| [InsertDocument](./insertdocument/)(int32_t, bool) | *index* konumunda varsayılan sayfa boyutlu boş bir belge ekler. |
| [InsertDocument](./insertdocument/)(int32_t, float, float, bool) | *index* konumunda ilk sayfa boyutları *width* ve *height* olan boş bir belge ekler. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | *index* konumunda aktif sayfaya yeni glyph'ler ekler. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | *index* konumunda aktif sayfaya yeni glyph'ler ekler. |
| [InsertPage](./insertpage/)(int32_t, bool) | *index* konumunda varsayılan sayfa boyutlu boş bir sayfa belgeye ekler. |
| [InsertPage](./insertpage/)(int32_t, float, float, bool) | *index* konumunda belirtilen *width* ve *height* boyutlarında boş bir sayfa belgeye ekler. |
| [InsertPage](./insertpage/)(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) | *index* konumunda belgeye bir sayfa ekler. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | *index* konumunda aktif sayfaya yeni bir yol ekler. |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::String) | Birden fazla [XPS](../) dosyasını tek bir [XPS](../) belgeye birleştirir. |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>) | Birden fazla [XPS](../) dosyasını tek bir [XPS](../) belgeye birleştirir. |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | [Device](../) örneğini kullanarak [XPS](../) belgelerini PDF'ye birleştirir. |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | [Device](../) örneğini kullanarak [XPS](../) belgelerini PDF'ye birleştirir. |
| [Remove](./remove/)(T) | Aktif sayfadan bir öğeyi kaldırır. |
| [RemoveAt](./removeat/)(int32_t) | Aktif sayfadan *index* konumundaki öğeyi kaldırır. |
| [RemoveDocumentAt](./removedocumentat/)(int32_t) | *index* konumundaki belgeyi kaldırır. |
| [RemovePage](./removepage/)(System::SharedPtr\<XpsModel::XpsPage\>) | Belgeden bir sayfayı kaldırır. |
| [RemovePageAt](./removepageat/)(int32_t) | Belgeden *index* konumundaki sayfayı kaldırır. |
| [Save](./save/)(System::String) | [XPS](../) belgesini *path* konumundaki [XPS](../) dosyasına kaydeder . |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | [XPS](../) belgesini akışa kaydeder. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Belgeyi görüntü dosyasına kaydeder. Çıktı dizini ve dosya adı, giriş [XPS](../) dosyasından aynı olacaktır. Dosya uzantısı, "options" parametresindeki görüntü formatına karşılık gelir. Belge, FileStream olmayan bir akışla başlatıldıysa, görüntü dosyası varsayılan dosya adı şablonuyla geçerli klasöre kaydedilir. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) | Belgeyi belirtilen dizine, belirtilen dosya adıyla görüntü dosyasına kaydeder. Dosya uzantısı, "options" parametresindeki görüntü formatına karşılık gelir. |
| [SaveAsImageBytes](./saveasimagebytes/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Belgeyi bitmap görüntü formatında bayt dizileri olarak kaydeder. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Belgeyi PDF formatında kaydeder. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Belgeyi PDF formatında kaydeder. |
| [SaveAsPs](./saveasps/)(System::String, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Belgeyi PS formatında kaydeder. |
| [SaveAsPs](./saveasps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Belgeyi PS formatında kaydeder. |
| [SelectActiveDocument](./selectactivedocument/)(int32_t) | Düzenleme için aktif bir belge seçer. |
| [SelectActivePage](./selectactivepage/)(int32_t) | Düzenleme için aktif bir belge sayfası seçer. |
| [set_JobPrintTicket](./set_jobprintticket/)(System::SharedPtr\<Aspose::Page::XPS::XpsMetadata::JobPrintTicket\>) | Belgenin iş yazdırma biletini döndürür/ayarlar. |
| [SetDocumentPrintTicket](./setdocumentprintticket/)(int32_t, System::SharedPtr\<XpsMetadata::DocumentPrintTicket\>) | *printTicket* öğesini *documentIndex* ile indekslenen belgeye bağlar. |
| [SetPagePrintTicket](./setpageprintticket/)(int32_t, int32_t, System::SharedPtr\<XpsMetadata::PagePrintTicket\>) | *printTicket* öğesini *documentIndex* ile indekslenen belgede *pageIndex* ile indekslenen sayfaya bağlar. |
| [XpsDocument](./xpsdocument/)() | Varsayılan sayfa boyutuyla boş bir [XPS](../) belgesi oluşturur. |
| [XpsDocument](./xpsdocument/)(System::String) | *path* konumundaki mevcut bir [XPS](../) belgesini açar. |
| [XpsDocument](./xpsdocument/)(System::String, System::SharedPtr\<LoadOptions\>) | *path* konumundaki mevcut bir belgeyi [XPS](../) belgesi olarak açar. |
| [XpsDocument](./xpsdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<LoadOptions\>) | *stream* içinde depolanan mevcut bir belgeyi [XPS](../) belgesi olarak yükler. |
## Ayrıca Bakınız

* Class [Document](../../aspose.page/document/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
