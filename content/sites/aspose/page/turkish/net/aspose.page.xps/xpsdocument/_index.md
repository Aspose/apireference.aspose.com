---
title: Class XpsDocument
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.XPS.XpsDocument sınıf. Herhangi bir XPS öğesi için manipülasyon yöntemleri sağlayan XPS belgesinin ana varlığını kapsayan sınıf.
type: docs
weight: 480
url: /tr/net/aspose.page.xps/xpsdocument/
---
## XpsDocument class

Herhangi bir XPS öğesi için manipülasyon yöntemleri sağlayan XPS belgesinin ana varlığını kapsayan sınıf.

```csharp
public sealed class XpsDocument : Document, IDisposable
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [XpsDocument](xpsdocument/#constructor)() | Varsayılan sayfa boyutunda boş XPS belgesi oluşturur. |
| [XpsDocument](xpsdocument/#constructor_2)(string) | adresinde bulunan mevcut bir XPS belgesini açar.*path* . |
| [XpsDocument](xpsdocument/#constructor_1)(Stream, LoadOptions) | İçinde saklanan mevcut bir belgeyi yükler.*stream* XPS belgesi olarak. |
| [XpsDocument](xpsdocument/#constructor_3)(string, LoadOptions) | konumunda bulunan mevcut bir belgeyi açar.*path* XPS belgesi olarak. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [ActiveDocument](../../aspose.page.xps/xpsdocument/activedocument/) { get; } | Etkin belge numarasını alır. |
| [ActivePage](../../aspose.page.xps/xpsdocument/activepage/) { get; } | Aktif belgedeki aktif sayfa numarasını alır. |
| [DocumentCount](../../aspose.page.xps/xpsdocument/documentcount/) { get; } | XPS paketi içindeki belgelerin sayısını verir. |
| [JobPrintTicket](../../aspose.page.xps/xpsdocument/jobprintticket/) { get; set; } | Belgenin iş yazdırma biletini döndürür/ayarlar |
| [Page](../../aspose.page.xps/xpsdocument/page/) { get; } | bir döndürür[`XpsPage`](../../aspose.page.xps.xpsmodel/xpspage/) aktif sayfa örneği. |
| [PageCount](../../aspose.page.xps/xpsdocument/pagecount/) { get; } | Etkin belgedeki sayfa sayısını döndürür. |
| [TotalPageCount](../../aspose.page.xps/xpsdocument/totalpagecount/) { get; } | XPS belgesi içindeki tüm belgelerdeki toplam sayfa sayısını döndürür. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps/xpsdocument/add/)(T) | Bir içerik öğesi ekler (Tuval, Yol veya Glifler) |
| [AddCanvas](../../aspose.page.xps/xpsdocument/addcanvas/)() | Etkin sayfaya yeni bir tuval ekler. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument)(bool) | Varsayılan sayfa boyutuyla boş bir belge ekler. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument_1)(float, float, bool) | İlk sayfa boyutlarıyla boş bir belge ekler *width* Ve*height* . |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs)(XpsFont, float, float, float, string) | Etkin sayfaya yeni glifler ekler. |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs_1)(string, float, FontStyle, float, float, string) | Etkin sayfaya yeni glifler ekler. |
| [AddOutlineEntry](../../aspose.page.xps/xpsdocument/addoutlineentry/)(string, int, XpsHyperlinkTarget) | Belgeye bir anahat girişi ekler. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_1)(bool) | Varsayılan sayfa boyutuyla belgeye boş bir sayfa ekler. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage)(XpsPage, bool) | Belgeye bir sayfa ekler. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_2)(float, float, bool) | Belirtilen ile belgeye boş bir sayfa ekler*width* Ve*height* . |
| [AddPath](../../aspose.page.xps/xpsdocument/addpath/)(XpsPathGeometry) | Etkin sayfaya yeni bir yol ekler. |
| [CreateArcSegment](../../aspose.page.xps/xpsdocument/createarcsegment/)(PointF, SizeF, float, bool, XpsSweepDirection, bool) | Yeni bir eliptik yay parçası oluşturur. |
| [CreateCanvas](../../aspose.page.xps/xpsdocument/createcanvas/)() | Yeni bir tuval oluşturur. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_5)(Color) | Yeni bir renk oluşturur. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_6)(string, params float[]) | ICC tabanlı renk uzayında yeni bir renk oluşturur. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor)(XpsIccProfile, params float[]) | ICC tabanlı renk uzayında yeni bir renk oluşturur. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_3)(float, float, float) | ScRGB renk alanında yeni bir renk oluşturur. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_1)(int, int, int) | sRGB renk alanında yeni bir renk oluşturur. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_4)(float, float, float, float) | ScRGB renk alanında yeni bir renk oluşturur. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_2)(int, int, int, int) | sRGB renk alanında yeni bir renk oluşturur. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont)(Stream) | Akış dışında yeni bir TrueType yazı tipi kaynağı oluşturur. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont_1)(string, FontStyle) | Yeni bir TrueType yazı tipi kaynağı oluşturur. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs)(XpsFont, float, float, float, string) | Yeni glifler oluşturur. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs_1)(string, float, FontStyle, float, float, string) | Yeni glifler oluşturur. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop_1)(Color, float) | Yeni bir degrade durağı oluşturur. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop)(XpsColor, float) | Yeni bir degrade durağı oluşturur. |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile)(Stream) | Yeni bir ICC profil kaynağı oluşturur.*stream* . |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile_1)(string) | the konumunda bulunan ICC profil dosyasından yeni bir ICC profil kaynağı oluşturur.*iccProfilePath* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage)(Stream) | Yeni bir görüntü kaynağı oluşturur.*stream* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage_1)(string) | adresinde bulunan görüntü dosyasından yeni bir görüntü kaynağı oluşturur.*imagePath* . |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush_1)(string, RectangleF, RectangleF) | Yeni bir resim fırçası oluşturur. |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush)(XpsImage, RectangleF, RectangleF) | Yeni bir resim fırçası oluşturur. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush_1)(PointF, PointF) | Yeni bir doğrusal degrade fırçası oluşturur. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF) | Yeni bir doğrusal degrade fırçası oluşturur. |
| [CreateMatrix](../../aspose.page.xps/xpsdocument/creatematrix/)(float, float, float, float, float, float) | Yeni bir afin dönüşüm matrisi oluşturur. |
| [CreatePath](../../aspose.page.xps/xpsdocument/createpath/)(XpsPathGeometry) | Yeni bir yol oluşturur. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure)(PointF, bool) | Yeni bir yol şekli oluşturur. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure_1)(PointF, List&lt;XpsPathSegment&gt;, bool) | Yeni bir yol şekli oluşturur. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry)() | Yeni bir yol geometrisi oluşturur. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_1)(List&lt;XpsPathFigure&gt;) | Belirtilen yol rakamları listesiyle yeni bir yol geometrisi oluşturur. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_2)(string) | Kısaltılmış formla belirtilen yeni bir yol geometrisi oluşturur. |
| [CreatePolyBezierSegment](../../aspose.page.xps/xpsdocument/createpolybeziersegment/)(PointF[], bool) | Yeni bir kübik Bézier eğrileri seti oluşturur. |
| [CreatePolyLineSegment](../../aspose.page.xps/xpsdocument/createpolylinesegment/)(PointF[], bool) | İsteğe bağlı sayıda bireysel köşe içeren yeni bir çokgen çizim oluşturur. |
| [CreatePolyQuadraticBezierSegment](../../aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/)(PointF[], bool) | Belirtilen kontrol noktalarını kullanarak, bir set köşe noktası boyunca yol şeklindeki önceki noktadan yeni bir ikinci dereceden Bézier eğrileri seti oluşturur. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush_1)(PointF, PointF, float, float) | Yeni bir radyal degrade fırçası oluşturur. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF, float, float) | Yeni bir radyal degrade fırçası oluşturur. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush_1)(Color) | Yeni bir düz renk fırçası oluşturur. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush)(XpsColor) | Yeni bir düz renk fırçası oluşturur. |
| [CreateVisualBrush](../../aspose.page.xps/xpsdocument/createvisualbrush/)(XpsContentElement, RectangleF, RectangleF) | Yeni bir görsel fırça oluşturur. |
| [Dispose](../../aspose.page.xps/xpsdocument/dispose/)() | Örneği ortadan kaldırır. |
| [GetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/getdocumentprintticket/)(int) | tarafından indekslenen belgenin yazdırma biletini döndürür*documentIndex* . |
| [GetPagePrintTicket](../../aspose.page.xps/xpsdocument/getpageprintticket/)(int, int) | tarafından indekslenen sayfanın baskı biletini döndürür*pageIndex* tarafından indekslenen belgede*documentIndex* . |
| [Insert&lt;T&gt;](../../aspose.page.xps/xpsdocument/insert/)(int, T) | Şuradaki etkin page sayfasına bir öğe (Tuval, Yol veya Glifler) ekler:*index* pozisyon. |
| [InsertCanvas](../../aspose.page.xps/xpsdocument/insertcanvas/)(int) | adresindeki etkin sayfaya yeni bir tuval ekler.*index* pozisyon. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument)(int, bool) | Varsayılan sayfa boyutu ile boş bir belge ekler.*index* pozisyon. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument_1)(int, float, float, bool) | İlk sayfa boyutlarına sahip boş bir belge ekler *width* Ve*height* de*index* pozisyon. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs)(int, XpsFont, float, float, float, string) | Şuradaki etkin sayfaya yeni glifler ekler:*index* pozisyon. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs_1)(int, string, float, FontStyle, float, float, string) | Şuradaki etkin sayfaya yeni glifler ekler:*index* pozisyon. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_1)(int, bool) | Varsayılan sayfa boyutu ile belgeye boş bir sayfa ekler.*index* pozisyon. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage)(int, XpsPage, bool) | adresindeki belgeye bir sayfa ekler.*index* pozisyon. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_2)(int, float, float, bool) | Belirtilen ile belgeye boş bir sayfa ekler*width* Ve*height* de*index* pozisyon. |
| [InsertPath](../../aspose.page.xps/xpsdocument/insertpath/)(int, XpsPathGeometry) | adresindeki etkin sayfaya yeni bir yol ekler.*index* pozisyon. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge_1)(string[], Stream) | Birkaç XPS dosyasını tek bir XPS belgesinde birleştirme. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge)(string[], Device, SaveOptions) | kullanarak XPS belgelerini PDF'de birleştirme[`Device`](../../aspose.page/device/) örnek. |
| [Remove&lt;T&gt;](../../aspose.page.xps/xpsdocument/remove/)(T) | Etkin sayfadan bir öğeyi kaldırır. |
| [RemoveAt](../../aspose.page.xps/xpsdocument/removeat/)(int) | Şuradaki bir öğeyi kaldırır:*index* aktif sayfadan konum. |
| [RemoveDocumentAt](../../aspose.page.xps/xpsdocument/removedocumentat/)(int) | Şuradaki bir belgeyi kaldırır:*index* pozisyon. |
| [RemovePage](../../aspose.page.xps/xpsdocument/removepage/)(XpsPage) | Belgeden bir sayfa kaldırır. |
| [RemovePageAt](../../aspose.page.xps/xpsdocument/removepageat/)(int) | adresindeki belgeden bir sayfa kaldırır.*index* pozisyon. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_1)(Stream) | XPS belgesini akışa kaydeder. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_2)(string) | XPS belgesini şu konumda bulunan XPS dosyasına kaydeder:*path* . |
| override [Save](../../aspose.page.xps/xpsdocument/save/#save)(Device, SaveOptions) | kullanarak belgeyi kaydeder.[`Device`](../../aspose.page/device/) örnek. |
| [SelectActiveDocument](../../aspose.page.xps/xpsdocument/selectactivedocument/)(int) | Düzenleme için etkin bir belge seçer. |
| [SelectActivePage](../../aspose.page.xps/xpsdocument/selectactivepage/)(int) | Düzenleme için etkin bir belge sayfası seçer. |
| [SetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/setdocumentprintticket/)(int, DocumentPrintTicket) | Bağlantılar*printTicket* tarafından indekslenen belgeye*documentIndex* . |
| [SetPagePrintTicket](../../aspose.page.xps/xpsdocument/setpageprintticket/)(int, int, PagePrintTicket) | Bağlantılar*printTicket* tarafından indekslenen sayfaya*pageIndex* tarafından indekslenen belgede*documentIndex* . |

### Ayrıca bakınız

* class [Document](../../aspose.page/document/)
* ad alanı [Aspose.Page.XPS](../../aspose.page.xps/)
* toplantı [Aspose.Page](../../)


