---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI sınıfı"
linktitle: "PageAPI"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI sınıfı. C++'de Page öğesi değiştirme API'si."
type: docs
weight: 500
url: /tr/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/
---
## PageAPI class


Bu **[Page](../../aspose.page/)** öğesi değiştirme API'si.

```cpp
class PageAPI : public Aspose::Page::XPS::Features::EventBasedModifications::IModificationAPI
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(T) | Bir içerik öğesi ekler (Canvas, Path veya Glyphs). |
| [AddCanvas](./addcanvas/)() | Sayfaya yeni bir canvas ekler. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Sayfaya yeni glyphs ekler. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Sayfaya yeni glyphs ekler. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, int32_t) | Belgeye bir anahat girişi ekler. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Sayfaya yeni bir path ekler. |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Yeni bir eliptik yay segmenti oluşturur. |
| [CreateCanvas](./createcanvas/)() | Yeni bir canvas oluşturur. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Yeni bir renk oluşturur. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | sRGB renk uzayında yeni bir renk oluşturur. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | sRGB renk uzayında yeni bir renk oluşturur. |
| [CreateColor](./createcolor/)(float, float, float, float) | scRGB renk uzayında yeni bir renk oluşturur. |
| [CreateColor](./createcolor/)(float, float, float) | scRGB renk uzayında yeni bir renk oluşturur. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | ICC tabanlı renk uzayında yeni bir renk oluşturur. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | ICC tabanlı renk uzayında yeni bir renk oluşturur. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Yeni glyphs oluşturur. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Yeni glyphs oluşturur. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Yeni bir gradient durak noktası oluşturur. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Yeni bir gradient durak noktası oluşturur. |
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
| [get_Height](./get_height/)() | Sayfanın yüksekliğini döndürür/ayarlar, etkili koordinat uzayının birimlerinde gerçek bir sayı olarak ifade edilir. |
| [get_PageCount](./get_pagecount/)() | Etkin belgede sayfa sayısını döndürür. |
| [get_TotalPageCount](./get_totalpagecount/)() | Tüm belgeler içindeki [XPS](../../aspose.page.xps/) belgesindeki toplam sayfa sayısını döndürür. |
| [get_Utils](./get_utils/)() | Resmi [XPS](../../aspose.page.xps/) manipülasyon API'sinin ötesinde yardımcı programlar sağlayan nesneyi alır. |
| [get_Width](./get_width/)() | Sayfanın genişliğini döndürür/ayarlar, etkili koordinat uzayının birimlerinde gerçek bir sayı olarak ifade edilir. |
| [Insert](./insert/)(int32_t, T) | Sayfaya *index*  konumunda bir öğe (Canvas, Path veya Glyphs) ekler. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Sayfaya *index*  konumunda yeni bir canvas ekler. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Sayfaya *index*  konumunda yeni glyph'ler ekler. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Sayfaya *index*  konumunda yeni glyph'ler ekler. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Sayfaya *index*  konumunda yeni bir yol ekler. |
| [Remove](./remove/)(T) | Sayfadan bir öğe kaldırır. |
| [RemoveAt](./removeat/)(int32_t) | Sayfadan *index* konumundaki bir öğeyi kaldırır. |
| [set_Height](./set_height/)(float) | Sayfanın yüksekliğini döndürür/ayarlar, etkili koordinat uzayının birimlerinde gerçek bir sayı olarak ifade edilir. |
| [set_Width](./set_width/)(float) | Sayfanın genişliğini döndürür/ayarlar, etkili koordinat uzayının birimlerinde gerçek bir sayı olarak ifade edilir. |
## Ayrıca Bakınız

* Class [IModificationAPI](../imodificationapi/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
