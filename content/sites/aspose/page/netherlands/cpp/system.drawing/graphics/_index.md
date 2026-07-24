---
title: "System::Drawing::Graphics klasse"
linktitle: "Graphics"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Graphics klasse. Vertegenwoordigt een tekenoppervlak. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1000
url: /nl/cpp/system.drawing/graphics/
---
## Graphics class


Vertegenwoordigt een tekenoppervlak. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class Graphics : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AddMetafileComment](./addmetafilecomment/)(const System::ArrayPtr\<uint8_t\>\&) | NOG NIET GEÏMPLENTEERD. |
| [BeginContainer](./begincontainer/)() | Slaat een container op met de huidige staat van dit object, opent en gebruikt een nieuwe container en retourneert de opgeslagen container. |
| [BeginContainer](./begincontainer/)(Rectangle, Rectangle, GraphicsUnit) | Slaat een container op met de huidige staat van dit object, opent en gebruikt een nieuwe container en retourneert de opgeslagen container. |
| [BeginContainer](./begincontainer/)(RectangleF, RectangleF, GraphicsUnit) | Slaat een container op met de huidige staat van dit object, opent en gebruikt een nieuwe container en retourneert de opgeslagen container. |
| [Clear](./clear/)(Color) | Leegt het tekenoppervlak dat wordt vertegenwoordigd door het huidige object en vult het met de opgegeven kleur. |
| [CopyFromScreen](./copyfromscreen/)(Point, Point, Size, CopyPixelOperation) | NOG NIET GEÏMPLENTEERD. |
| [CopyFromScreen](./copyfromscreen/)(int32_t, int32_t, int32_t, int32_t, Size, CopyPixelOperation) | NOG NIET GEÏMPLENTEERD. |
| [Dispose](./dispose/)() | Geeft alle door het huidige object verworven besturingssysteembronnen vrij. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | Tekent de opgegeven boog met de opgegeven pen op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | Tekent de opgegeven boog met de opgegeven pen op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | Tekent de opgegeven boog met de opgegeven pen op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | Tekent de opgegeven boog met de opgegeven pen op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const Point\&, const Point\&, const Point\&, const Point\&) | NOG NIET GEÏMPLENTEERD. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const PointF\&, const PointF\&, const PointF\&, const PointF\&) | NOG NIET GEÏMPLENTEERD. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float, float, float) | NOG NIET GEÏMPLENTEERD. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | Tekent een reeks Bezier‑splines met de opgegeven pen. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | Tekent een reeks Bezier‑splines met de opgegeven pen. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float, Drawing2D::FillMode) | Tekent een gesloten spline met de opgegeven pen. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float, Drawing2D::FillMode) | Tekent een gesloten spline met de opgegeven pen. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float) | Tekent een spline met de opgegeven pen. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float) | Tekent een spline met de opgegeven pen. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, int32_t, int32_t, float) | Tekent een spline met de opgegeven pen. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, int32_t, int32_t, float) | Tekent een spline met de opgegeven pen. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, Rectangle) | Tekent de opgegeven ellips met de opgegeven pen op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, RectangleF) | Tekent de opgegeven ellips met de opgegeven pen op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Tekent de opgegeven ellips met de opgegeven pen op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Tekent de opgegeven ellips met de opgegeven pen op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, Rectangle) | NOG NIET GEÏMPLENTEERD. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, int32_t, int32_t) | NOG NIET GEÏMPLENTEERD. |
| [DrawIconUnstretched](./drawiconunstretched/)(const SharedPtr\<Icon\>\&, Rectangle) | NOG NIET GEÏMPLENTEERD. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<Point\>\&) | NOG NIET GEÏMPLENTEERD. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Tekent het opgegeven gebied van de opgegeven afbeelding op de opgegeven locatie. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::ArrayView\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Tekent het opgegeven gebied van de opgegeven afbeelding op de opgegeven locatie. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::StackArray\<PointF, N\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Tekent het opgegeven gebied van de opgegeven afbeelding op de opgegeven locatie. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int) | Tekent de opgegeven afbeelding op de opgegeven locatie. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float) | Tekent de opgegeven afbeelding op de opgegeven locatie. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Point) | Tekent de opgegeven afbeelding op de opgegeven locatie. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, PointF) | Tekent de opgegeven afbeelding op de opgegeven locatie. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, int, int) | Tekent de opgegeven afbeelding in de opgegeven rechthoek. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, float, float) | Tekent de opgegeven afbeelding in de opgegeven rechthoek. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, RectangleF, RectangleF, GraphicsUnit) | Tekent het opgegeven gebied van de opgegeven afbeelding op de opgegeven locatie. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, Rectangle, GraphicsUnit) | Tekent het opgegeven gebied van de opgegeven afbeelding op de opgegeven locatie. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, Rectangle, GraphicsUnit) | Tekent het opgegeven gebied van de opgegeven afbeelding op de opgegeven locatie. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const Rectangle\&) | Tekent de opgegeven afbeelding op de opgegeven locatie. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const RectangleF\&) | Tekent de opgegeven afbeelding op de opgegeven locatie. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Tekent het opgegeven gebied van de opgegeven afbeelding in de opgegeven rechthoek. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Tekent het opgegeven gebied van de opgegeven afbeelding in de opgegeven rechthoek. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit) | Tekent het opgegeven gebied van de opgegeven afbeelding in de opgegeven rechthoek. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit) | Tekent het opgegeven gebied van de opgegeven afbeelding in de opgegeven rechthoek. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | NOG NIET GEÏMPLENTEERD. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | NOG NIET GEÏMPLENTEERD. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | NOG NIET GEÏMPLENTEERD. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | NOG NIET GEÏMPLENTEERD. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit) | NOG NIET GEÏMPLENTEERD. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&) | NOG NIET GEÏMPLENTEERD. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit) | NOG NIET GEÏMPLENTEERD. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, const SharedPtr\<Imaging::ImageAttributes\>\&) | Tekent het opgegeven gebied van de opgegeven afbeelding op de opgegeven locatie. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, RectangleF, GraphicsUnit) | Tekent het opgegeven gebied van de opgegeven afbeelding op de opgegeven locatie. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int) | Tekent de opgegeven afbeelding met zijn oorspronkelijke fysieke grootte op de opgegeven locatie. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int, int, int) | Tekent een opgegeven afbeelding met zijn oorspronkelijke fysieke grootte op een opgegeven locatie. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Rectangle\&) | Tekent een opgegeven afbeelding met zijn oorspronkelijke fysieke grootte op een opgegeven locatie. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Point\&) | Tekent een opgegeven afbeelding met zijn oorspronkelijke fysieke grootte op een opgegeven locatie. |
| [DrawImageUnscaledAndClipped](./drawimageunscaledandclipped/)(const SharedPtr\<Image\>\&, Rectangle) | NOG NIET GEÏMPLENTEERD. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, Point, Point) | Tekent de opgegeven lijn met de opgegeven pen. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, PointF, PointF) | Tekent de opgegeven lijn met de opgegeven pen. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Tekent de opgegeven lijn met de opgegeven pen. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Tekent de opgegeven lijn met de opgegeven pen. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::Point\>\&) | Tekent een reeks lijnsegmenten met de opgegeven pen. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::PointF\>\&) | Tekent een reeks lijnsegmenten met de opgegeven pen. |
| [DrawPath](./drawpath/)(const SharedPtr\<Pen\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Tekent het opgegeven pad met de opgegeven pen. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | Tekent de opgegeven taart met de opgegeven pen op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | Tekent de opgegeven taart met de opgegeven pen op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | Tekent de opgegeven taart met de opgegeven pen op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | Tekent de opgegeven taart met de opgegeven pen op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | Tekent een veelhoek met de opgegeven pen. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | Tekent een veelhoek met de opgegeven pen. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Tekent de opgegeven rechthoek met de opgegeven pen op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Tekent de opgegeven rechthoek met de opgegeven pen op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, Rectangle) | Tekent de opgegeven rechthoek met de opgegeven pen op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Rectangle\>\&) | Tekent een reeks rechthoeken met de opgegeven pen. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<RectangleF\>\&) | Tekent een reeks rechthoeken met de opgegeven pen. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Tekent de opgegeven tekenreeks op de opgegeven locatie met het opgegeven lettertype en de opgegeven penseel. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Tekent de opgegeven tekenreeks in het opgegeven rechthoek met het opgegeven lettertype en penseel. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Tekent de opgegeven tekenreeks op de opgegeven locatie met het opgegeven lettertype en de opgegeven penseel. |
| [EndContainer](./endcontainer/)(const SharedPtr\<Drawing2D::GraphicsContainer\>\&) | Sluit de huidige container en herstelt de toestand van dit object vanuit de toestand van de opgeslagen container. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, Graphics::EnumerateMetafileProc) | NOG NIET GEÏMPLENTEERD. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Graphics::EnumerateMetafileProc) | NOG NIET GEÏMPLENTEERD. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Graphics::EnumerateMetafileProc) | NOG NIET GEÏMPLENTEERD. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, Graphics::EnumerateMetafileProc) | NOG NIET GEÏMPLENTEERD. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Graphics::EnumerateMetafileProc) | NOG NIET GEÏMPLENTEERD. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, Graphics::EnumerateMetafileProc) | NOG NIET GEÏMPLENTEERD. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | NOG NIET GEÏMPLENTEERD. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | NOG NIET GEÏMPLENTEERD. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | NOG NIET GEÏMPLENTEERD. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | NOG NIET GEÏMPLENTEERD. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | NOG NIET GEÏMPLENTEERD. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | NOG NIET GEÏMPLENTEERD. |
| [ExcludeClip](./excludeclip/)(Rectangle) | NOG NIET GEÏMPLENTEERD. |
| [ExcludeClip](./excludeclip/)(const SharedPtr\<Region\>\&) | NOG NIET GEÏMPLENTEERD. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode, float) | Tekent een gesloten spline met het opgegeven penseel. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode, float) | Tekent een gesloten spline met het opgegeven penseel. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, Rectangle) | Vult de binnenkant van de ellips die wordt opgegeven door de begrenzende rechthoek met het opgegeven penseel. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, RectangleF) | Vult de binnenkant van de ellips die wordt opgegeven door de begrenzende rechthoek met het opgegeven penseel. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, int, int, int, int) | Vult de binnenkant van de ellips die wordt opgegeven door de begrenzende rechthoek met het opgegeven penseel. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, float, float, float, float) | Vult de binnenkant van de ellips die wordt opgegeven door de begrenzende rechthoek met het opgegeven penseel. |
| [FillPath](./fillpath/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Vult de binnenkanten van het opgegeven pad met het opgegeven penseel. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, int, int, int, int, int, int) | Vult het opgegeven cirkelsegment met het opgegeven penseel op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, float, float, float, float, float, float) | Vult het opgegeven cirkelsegment met het opgegeven penseel op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, Rectangle, float, float) | Vult het opgegeven cirkelsegment met het opgegeven penseel op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode) | Vult de binnenkanten van de opgegeven veelhoek met het opgegeven penseel. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode) | Vult de binnenkanten van de opgegeven veelhoek met het opgegeven penseel. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, float, float, float, float) | Vult de opgegeven rechthoek met het opgegeven penseel. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, int, int, int, int) | Vult de opgegeven rechthoek met het opgegeven penseel. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, Rectangle) | Vult de opgegeven rechthoek met het opgegeven penseel. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, RectangleF) | Vult de opgegeven rechthoek met het opgegeven penseel. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Rectangle\>\&) | Vult een reeks rechthoeken met het opgegeven penseel. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<RectangleF\>\&) | Vult een reeks rechthoeken met het opgegeven penseel. |
| [FillRegion](./fillregion/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Region\>\&) | Vult de binnenkanten van het opgegeven gebied met het opgegeven penseel. |
| [Flush](./flush/)(Drawing2D::FlushIntention) | Activeert de onmiddellijke uitvoering van alle in behandeling zijnde tekenbewerkingen. |
| static [FromHwnd](./fromhwnd/)(IntPtr) | NOG NIET GEÏMPLENTEERD. |
| static [FromHwndInternal](./fromhwndinternal/)(IntPtr) | NOG NIET GEÏMPLENTEERD. |
| static [FromImage](./fromimage/)(const SharedPtr\<Image\>\&) | Maakt een nieuw [Graphics](./) object van de opgegeven afbeelding. |
| [get_Clip](./get_clip/)() | Retourneert een [Region](../region/) object dat een gebied vertegenwoordigt dat het tekengebied van het tekenoppervlak dat wordt vertegenwoordigd door het huidige [Graphics](./) object beperkt. |
| [get_ClipBounds](./get_clipbounds/)() const | Retourneert een rechthoek die het knipgebied van het oppervlak dat wordt vertegenwoordigd door het huidige object omsluit. |
| [get_CompositingMode](./get_compositingmode/)() | Retourneert een waarde die aangeeft hoe samengestelde afbeeldingen worden getekend op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [get_CompositingQuality](./get_compositingquality/)() | Retourneert een waarde die het kwaliteitsniveau aangeeft dat wordt gebruikt bij het samenvoegen van afbeeldingen. |
| [get_DpiX](./get_dpix/)() | Retourneert de horizontale resolutie. |
| [get_DpiY](./get_dpiy/)() | Retourneert de verticale resolutie. |
| [get_InterpolationMode](./get_interpolationmode/)() | Retourneert een waarde die de interpolatiemodus aangeeft die aan het huidige object is gekoppeld. |
| [get_IsClipEmpty](./get_isclipempty/)() const | NOG NIET GEÏMPLENTEERD. |
| [get_IsVisibleClipEmpty](./get_isvisibleclipempty/)() const | NOG NIET GEÏMPLENTEERD. |
| [get_PageScale](./get_pagescale/)() const | Retourneert de schaalverhouding tussen wereldeenheden en paginaneenheden voor het huidige [Graphics](./) object. |
| [get_PageUnit](./get_pageunit/)() const | Retourneert meeteenheden die worden gebruikt voor paginacoördinaten op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [get_PixelOffsetMode](./get_pixeloffsetmode/)() | Retourneert een waarde die aangeeft hoe de pixels worden verschoven tijdens het renderen op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [get_RenderingOrigin](./get_renderingorigin/)() const | Retourneert een [Point](../point/) object dat de renderingsherkomst van het huidige [Graphics](./) object vertegenwoordigt voor dithering en voor hatch-penseel. |
| [get_SmoothingMode](./get_smoothingmode/)() | Retourneert een waarde die een verzachtende modus aangeeft die wordt gebruikt tijdens het renderen op het oppervlak dat wordt vertegenwoordigd door het huidige object. |
| [get_TextContrast](./get_textcontrast/)() const | NOG NIET GEÏMPLENTEERD. |
| [get_TextRenderingHint](./get_textrenderinghint/)() | Retourneert een waarde die de kwaliteit van tekstweergave aangeeft. |
| [get_Transform](./get_transform/)() | Retourneert de geometrische wereldtransformatie voor het huidige [Graphics](./) object. |
| [get_VisibleClipBounds](./get_visibleclipbounds/)() const | Retourneert het [RectangleF](../rectanglef/) object dat een begrenzende rechthoek van de zichtbare knipregio van het huidige [Graphics](./) object weergeeft. |
| [GetHdc](./gethdc/)() | NOG NIET GEÏMPLENTEERD. |
| [GetNearestColor](./getnearestcolor/)(Color) | NOG NIET GEÏMPLENTEERD. |
| [GetSkCanvas](./getskcanvas/)() const |  |
| [IntersectClip](./intersectclip/)(const System::SharedPtr\<Region\>\&) | Werk de knipregio van dit object bij tot de doorsnede van de huidige knip en de opgegeven knip. |
| [IntersectClip](./intersectclip/)(System::Drawing::RectangleF) | Werk de knipregio van dit object bij tot de doorsnede van de huidige knip en de opgegeven knip. |
| [IntersectClip](./intersectclip/)(System::Drawing::Rectangle) | Werk de knipregio van dit object bij tot de doorsnede van de huidige knip en de opgegeven knip. |
| [IsVisible](./isvisible/)(Point) | Bepaalt of het opgegeven punt zich binnen de zichtbare knipregio van het huidige [Graphics](./) object bevindt. |
| [IsVisible](./isvisible/)(PointF) | NOG NIET GEÏMPLENTEERD. |
| [IsVisible](./isvisible/)(Rectangle) | NOG NIET GEÏMPLENTEERD. |
| [IsVisible](./isvisible/)(RectangleF) | NOG NIET GEÏMPLENTEERD. |
| [IsVisible](./isvisible/)(int32_t, int32_t) | NOG NIET GEÏMPLENTEERD. |
| [IsVisible](./isvisible/)(float, float) | NOG NIET GEÏMPLENTEERD. |
| [IsVisible](./isvisible/)(float, float, float, float) | NOG NIET GEÏMPLENTEERD. |
| [IsVisible](./isvisible/)(int32_t, int32_t, int32_t, int32_t) | NOG NIET GEÏMPLENTEERD. |
| [MeasureCharacterRanges](./measurecharacterranges/)(const System::String\&, const SharedPtr\<Font\>\&, RectangleF, const SharedPtr\<StringFormat\>\&) | Retourneert een array van regio's die elk de tekenposities in de opgegeven tekenreeks begrenzen. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const | Retourneert een grootte van de opgegeven tekenreeks wanneer deze wordt getekend in het opgegeven lettertype in het opgegeven formaat. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const | Retourneert een grootte van de opgegeven tekenreeks wanneer deze wordt getekend in het opgegeven lettertype in het opgegeven formaat. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const | NOG NIET GEÏMPLENTEERD. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const | Retourneert een grootte van de opgegeven tekenreeks wanneer deze wordt getekend in het opgegeven lettertype in het opgegeven formaat. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Vermenigvuldigt de wereldtransformatie‑matrix van het huidige [Graphics](./) object met de opgegeven matrix. |
| [ReleaseHdc](./releasehdc/)() | NOG NIET GEÏMPLENTEERD. |
| [ReleaseHdc](./releasehdc/)(IntPtr) | NOG NIET GEÏMPLENTEERD. |
| [ResetClip](./resetclip/)() | Reset de knipregio voor deze graphics naar een oneindige regio. |
| [ResetTransform](./resettransform/)() | Reset de wereldtransformatie‑matrix van het huidige object zodat deze een identiteitsmatrix wordt. |
| [Restore](./restore/)(const SharedPtr\<Drawing2D::GraphicsState\>\&) | Herstelt de status van dit object vanuit de opgeslagen status. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Past de opgegeven rotatie toe op de wereldtransformatie‑matrix van het huidige [Graphics](./) object in de opgegeven volgorde. |
| [Save](./save/)() | Slaat de huidige status van dit object op en retourneert de opgeslagen status. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Past de opgegeven schaalvector toe op de wereldtransformatie‑matrix van het huidige object. |
| [set_Clip](./set_clip/)(const SharedPtr\<Region\>\&) | Stelt een regio in die het tekengebied van het tekenoppervlak dat door het huidige object wordt vertegenwoordigd, beperkt. |
| [set_CompositingMode](./set_compositingmode/)(Drawing2D::CompositingMode) | Stelt een waarde in die aangeeft hoe samengestelde afbeeldingen worden getekend op het oppervlak dat door het huidige object wordt vertegenwoordigd. |
| [set_CompositingQuality](./set_compositingquality/)(Drawing2D::CompositingQuality) | Stelt een waarde in die het kwaliteitsniveau specificeert dat moet worden gebruikt bij het samenvoegen van afbeeldingen. |
| [set_InterpolationMode](./set_interpolationmode/)(Drawing2D::InterpolationMode) | Stelt een waarde in die de interpolatiemodus aangeeft die aan het huidige object is gekoppeld. |
| [set_PageScale](./set_pagescale/)(float) | Stelt de schaalverhouding tussen wereldeenheden en paginaneenheden in voor het huidige [Graphics](./) object. |
| [set_PageUnit](./set_pageunit/)(GraphicsUnit) | Stelt meeteenheden in die worden gebruikt voor paginacoördinaten op het oppervlak dat door het huidige object wordt vertegenwoordigd. |
| [set_PixelOffsetMode](./set_pixeloffsetmode/)(Drawing2D::PixelOffsetMode) | Stelt een waarde in die aangeeft hoe de pixels moeten worden verschoven tijdens het renderen op het oppervlak dat door het huidige object wordt vertegenwoordigd. |
| [set_RenderingOrigin](./set_renderingorigin/)(Point) | Stelt een [Point](../point/) object in dat de renderingsherkomst van het huidige [Graphics](./) object specificeert voor dithering en voor hatchpenselen. |
| [set_SmoothingMode](./set_smoothingmode/)(Drawing2D::SmoothingMode) | Stelt een waarde in die een verzachtende modus specificeert die tijdens het renderen op het oppervlak dat door het huidige object wordt vertegenwoordigd, wordt gebruikt. |
| [set_TextContrast](./set_textcontrast/)(int32_t) | NOG NIET GEÏMPLENTEERD. |
| [set_TextRenderingHint](./set_textrenderinghint/)(Text::TextRenderingHint) | Stelt een waarde in die de kwaliteit van tekstrendering specificeert. |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Stelt de geometrische wereldtransformatie in voor het huidige [Graphics](./) object. |
| [SetClip](./setclip/)(const SharedPtr\<Region\>\&, Drawing2D::CombineMode) | Stelt de knipregio van het tekenoppervlak dat wordt vertegenwoordigd door het huidige [Graphics](./) object in op het resultaat van de opgegeven bewerking die de huidige knipregio en de opgegeven regio combineert. |
| [SetClip](./setclip/)(Rectangle, Drawing2D::CombineMode) | Stelt de knipregio van het tekenoppervlak dat wordt vertegenwoordigd door het huidige [Graphics](./) object in op het resultaat van de opgegeven bewerking die de huidige knipregio en de opgegeven regio combineert. |
| [SetClip](./setclip/)(RectangleF, Drawing2D::CombineMode) | Stelt de knipregio van het tekenoppervlak dat wordt vertegenwoordigd door het huidige [Graphics](./) object in op het resultaat van de opgegeven bewerking die de huidige knipregio en de opgegeven regio combineert. |
| [SetClip](./setclip/)(const SharedPtr\<Graphics\>\&, Drawing2D::CombineMode) | NOG NIET GEÏMPLENTEERD. |
| [SetClip](./setclip/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&, Drawing2D::CombineMode) | Stelt de knipregio van het tekenoppervlak dat wordt weergegeven door het huidige [Graphics](./)-object in op het resultaat van de opgegeven bewerking die de huidige knipregio combineert met de regio die is opgegeven door een graphicspad. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::Point\>\&) | NOG NIET GEÏMPLENTEERD. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::PointF\>\&) | NOG NIET GEÏMPLENTEERD. |
| [TranslateClip](./translateclip/)(int, int) | NOG NIET GEÏMPLENTEERD. |
| [TranslateClip](./translateclip/)(float, float) | NOG NIET GEÏMPLENTEERD. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Past de opgegeven translatievector toe op de wereldtransformatie-matrix van het huidige [Graphics](./)-object. |
| [~Graphics](./~graphics/)() |  |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [DrawImageAbort](./drawimageabort/) | Het type van een callback-functieobject dat wordt gebruikt als argument voor de DrawImage-methode. |
| [EnumerateMetafileProc](./enumeratemetafileproc/) | Het type van een callback-functieobject dat wordt gebruikt als argument voor de EnumerateMetafile-methode. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
