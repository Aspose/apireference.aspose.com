---
title: "System::Drawing::Graphics class"
linktitle: "Graphics"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Graphics class. Rappresenta una superficie di disegno. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1000
url: /it/cpp/system.drawing/graphics/
---
## Graphics class


Rappresenta una superficie di disegno. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Graphics : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddMetafileComment](./addmetafilecomment/)(const System::ArrayPtr\<uint8_t\>\&) | NON IMPLEMENTATO. |
| [BeginContainer](./begincontainer/)() | Salva un contenitore con lo stato corrente di questo oggetto, apre e utilizza un nuovo contenitore e restituisce il contenitore salvato. |
| [BeginContainer](./begincontainer/)(Rectangle, Rectangle, GraphicsUnit) | Salva un contenitore con lo stato corrente di questo oggetto, apre e utilizza un nuovo contenitore e restituisce il contenitore salvato. |
| [BeginContainer](./begincontainer/)(RectangleF, RectangleF, GraphicsUnit) | Salva un contenitore con lo stato corrente di questo oggetto, apre e utilizza un nuovo contenitore e restituisce il contenitore salvato. |
| [Clear](./clear/)(Color) | Cancella la superficie di disegno rappresentata dall'oggetto corrente e la riempie con il colore specificato. |
| [CopyFromScreen](./copyfromscreen/)(Point, Point, Size, CopyPixelOperation) | NON IMPLEMENTATO. |
| [CopyFromScreen](./copyfromscreen/)(int32_t, int32_t, int32_t, int32_t, Size, CopyPixelOperation) | NON IMPLEMENTATO. |
| [Dispose](./dispose/)() | Rilascia tutte le risorse del sistema operativo acquisite dall'oggetto corrente. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | Disegna l'arco specificato usando la penna specificata sulla superficie rappresentata dall'oggetto corrente. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | Disegna l'arco specificato usando la penna specificata sulla superficie rappresentata dall'oggetto corrente. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | Disegna l'arco specificato usando la penna specificata sulla superficie rappresentata dall'oggetto corrente. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | Disegna l'arco specificato usando la penna specificata sulla superficie rappresentata dall'oggetto corrente. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const Point\&, const Point\&, const Point\&, const Point\&) | NON IMPLEMENTATO. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const PointF\&, const PointF\&, const PointF\&, const PointF\&) | NON IMPLEMENTATO. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float, float, float) | NON IMPLEMENTATO. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | Disegna una serie di spline di Bézier usando la penna specificata. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | Disegna una serie di spline di Bézier usando la penna specificata. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float, Drawing2D::FillMode) | Disegna una spline chiusa usando la penna specificata. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float, Drawing2D::FillMode) | Disegna una spline chiusa usando la penna specificata. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float) | Disegna una spline usando la penna specificata. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float) | Disegna una spline usando la penna specificata. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, int32_t, int32_t, float) | Disegna una spline usando la penna specificata. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, int32_t, int32_t, float) | Disegna una spline usando la penna specificata. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, Rectangle) | Disegna l'ellisse specificata usando la penna specificata sulla superficie rappresentata dall'oggetto corrente. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, RectangleF) | Disegna l'ellisse specificata usando la penna specificata sulla superficie rappresentata dall'oggetto corrente. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Disegna l'ellisse specificata usando la penna specificata sulla superficie rappresentata dall'oggetto corrente. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Disegna l'ellisse specificata usando la penna specificata sulla superficie rappresentata dall'oggetto corrente. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, Rectangle) | NON IMPLEMENTATO. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, int32_t, int32_t) | NON IMPLEMENTATO. |
| [DrawIconUnstretched](./drawiconunstretched/)(const SharedPtr\<Icon\>\&, Rectangle) | NON IMPLEMENTATO. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<Point\>\&) | NON IMPLEMENTATO. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Disegna la regione specificata dell'immagine specificata nella posizione specificata. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::ArrayView\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Disegna la regione specificata dell'immagine specificata nella posizione specificata. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::StackArray\<PointF, N\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Disegna la regione specificata dell'immagine specificata nella posizione specificata. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int) | Disegna l'immagine specificata nella posizione specificata. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float) | Disegna l'immagine specificata nella posizione specificata. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Point) | Disegna l'immagine specificata nella posizione specificata. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, PointF) | Disegna l'immagine specificata nella posizione specificata. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, int, int) | Disegna l'immagine specificata nel rettangolo specificato. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, float, float) | Disegna l'immagine specificata nel rettangolo specificato. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, RectangleF, RectangleF, GraphicsUnit) | Disegna la regione specificata dell'immagine specificata nella posizione specificata. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, Rectangle, GraphicsUnit) | Disegna la regione specificata dell'immagine specificata nella posizione specificata. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, Rectangle, GraphicsUnit) | Disegna la regione specificata dell'immagine specificata nella posizione specificata. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const Rectangle\&) | Disegna l'immagine specificata nella posizione specificata. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const RectangleF\&) | Disegna l'immagine specificata nella posizione specificata. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Disegna la regione specificata dell'immagine specificata nel rettangolo specificato. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Disegna la regione specificata dell'immagine specificata nel rettangolo specificato. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit) | Disegna la regione specificata dell'immagine specificata nel rettangolo specificato. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit) | Disegna la regione specificata dell'immagine specificata nel rettangolo specificato. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | NON IMPLEMENTATO. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | NON IMPLEMENTATO. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | NON IMPLEMENTATO. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | NON IMPLEMENTATO. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit) | NON IMPLEMENTATO. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&) | NON IMPLEMENTATO. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit) | NON IMPLEMENTATO. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, const SharedPtr\<Imaging::ImageAttributes\>\&) | Disegna la regione specificata dell'immagine specificata nella posizione specificata. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, RectangleF, GraphicsUnit) | Disegna la regione specificata dell'immagine specificata nella posizione specificata. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int) | Disegna l'immagine specificata usando le sue dimensioni fisiche originali nella posizione specificata. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int, int, int) | Disegna un'immagine specificata usando le sue dimensioni fisiche originali in una posizione specificata. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Rectangle\&) | Disegna un'immagine specificata usando le sue dimensioni fisiche originali in una posizione specificata. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Point\&) | Disegna un'immagine specificata usando le sue dimensioni fisiche originali in una posizione specificata. |
| [DrawImageUnscaledAndClipped](./drawimageunscaledandclipped/)(const SharedPtr\<Image\>\&, Rectangle) | NON IMPLEMENTATO. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, Point, Point) | Disegna la linea specificata usando la penna specificata. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, PointF, PointF) | Disegna la linea specificata usando la penna specificata. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Disegna la linea specificata usando la penna specificata. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Disegna la linea specificata usando la penna specificata. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::Point\>\&) | Disegna una serie di segmenti di linea usando la penna specificata. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::PointF\>\&) | Disegna una serie di segmenti di linea usando la penna specificata. |
| [DrawPath](./drawpath/)(const SharedPtr\<Pen\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Disegna il percorso specificato usando la penna specificata. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | Disegna la torta specificata usando la penna specificata sulla superficie rappresentata dall'oggetto corrente. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | Disegna la torta specificata usando la penna specificata sulla superficie rappresentata dall'oggetto corrente. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | Disegna la torta specificata usando la penna specificata sulla superficie rappresentata dall'oggetto corrente. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | Disegna la torta specificata usando la penna specificata sulla superficie rappresentata dall'oggetto corrente. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | Disegna un poligono usando la penna specificata. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | Disegna un poligono usando la penna specificata. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Disegna il rettangolo specificato usando la penna specificata sulla superficie rappresentata dall'oggetto corrente. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Disegna il rettangolo specificato usando la penna specificata sulla superficie rappresentata dall'oggetto corrente. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, Rectangle) | Disegna il rettangolo specificato usando la penna specificata sulla superficie rappresentata dall'oggetto corrente. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Rectangle\>\&) | Disegna una serie di rettangoli usando la penna specificata. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<RectangleF\>\&) | Disegna una serie di rettangoli usando la penna specificata. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Disegna la stringa specificata nella posizione specificata usando il font e il pennello specificati. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Disegna la stringa specificata nel rettangolo specificato usando il font e il pennello specificati. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Disegna la stringa specificata nella posizione specificata usando il font e il pennello specificati. |
| [EndContainer](./endcontainer/)(const SharedPtr\<Drawing2D::GraphicsContainer\>\&) | Chiude il contenitore corrente e ripristina lo stato di questo oggetto dallo stato del contenitore salvato. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, Graphics::EnumerateMetafileProc) | NON IMPLEMENTATO. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Graphics::EnumerateMetafileProc) | NON IMPLEMENTATO. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Graphics::EnumerateMetafileProc) | NON IMPLEMENTATO. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, Graphics::EnumerateMetafileProc) | NON IMPLEMENTATO. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Graphics::EnumerateMetafileProc) | NON IMPLEMENTATO. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, Graphics::EnumerateMetafileProc) | NON IMPLEMENTATO. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | NON IMPLEMENTATO. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | NON IMPLEMENTATO. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | NON IMPLEMENTATO. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | NON IMPLEMENTATO. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | NON IMPLEMENTATO. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | NON IMPLEMENTATO. |
| [ExcludeClip](./excludeclip/)(Rectangle) | NON IMPLEMENTATO. |
| [ExcludeClip](./excludeclip/)(const SharedPtr\<Region\>\&) | NON IMPLEMENTATO. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode, float) | Disegna una spline chiusa usando il pennello specificato. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode, float) | Disegna una spline chiusa usando il pennello specificato. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, Rectangle) | Riempie l'interno dell'ellisse specificata dal rettangolo di delimitazione usando il pennello specificato. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, RectangleF) | Riempie l'interno dell'ellisse specificata dal rettangolo di delimitazione usando il pennello specificato. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, int, int, int, int) | Riempie l'interno dell'ellisse specificata dal rettangolo di delimitazione usando il pennello specificato. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, float, float, float, float) | Riempie l'interno dell'ellisse specificata dal rettangolo di delimitazione usando il pennello specificato. |
| [FillPath](./fillpath/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Riempie gli interni del percorso specificato usando il pennello specificato. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, int, int, int, int, int, int) | Riempie la torta specificata usando il pennello specificato sulla superficie rappresentata dall'oggetto corrente. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, float, float, float, float, float, float) | Riempie la torta specificata usando il pennello specificato sulla superficie rappresentata dall'oggetto corrente. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, Rectangle, float, float) | Riempie la torta specificata usando il pennello specificato sulla superficie rappresentata dall'oggetto corrente. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode) | Riempie gli interni del poligono specificato usando il pennello specificato. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode) | Riempie gli interni del poligono specificato usando il pennello specificato. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, float, float, float, float) | Riempie il rettangolo specificato con il pennello specificato. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, int, int, int, int) | Riempie il rettangolo specificato con il pennello specificato. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, Rectangle) | Riempie il rettangolo specificato con il pennello specificato. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, RectangleF) | Riempie il rettangolo specificato con il pennello specificato. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Rectangle\>\&) | Riempie una serie di rettangoli usando il pennello specificato. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<RectangleF\>\&) | Riempie una serie di rettangoli usando il pennello specificato. |
| [FillRegion](./fillregion/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Region\>\&) | Riempie gli interni della regione specificata usando il pennello specificato. |
| [Flush](./flush/)(Drawing2D::FlushIntention) | Attiva l'esecuzione immediata di tutte le operazioni di disegno in sospeso. |
| static [FromHwnd](./fromhwnd/)(IntPtr) | NON IMPLEMENTATO. |
| static [FromHwndInternal](./fromhwndinternal/)(IntPtr) | NON IMPLEMENTATO. |
| static [FromImage](./fromimage/)(const SharedPtr\<Image\>\&) | Crea un nuovo oggetto [Graphics](./) dall'immagine specificata. |
| [get_Clip](./get_clip/)() | Restituisce un oggetto [Region](../region/) che rappresenta una regione che limita l'area di disegno della superficie di disegno rappresentata dall'attuale oggetto [Graphics](./). |
| [get_ClipBounds](./get_clipbounds/)() const | Restituisce un rettangolo che delimita l'area di ritaglio della superficie rappresentata dall'oggetto corrente. |
| [get_CompositingMode](./get_compositingmode/)() | Restituisce un valore che indica come le immagini composte vengono disegnate sulla superficie rappresentata dall'oggetto corrente. |
| [get_CompositingQuality](./get_compositingquality/)() | Restituisce un valore che indica il livello di qualità utilizzato durante la composizione delle immagini. |
| [get_DpiX](./get_dpix/)() | Restituisce la risoluzione orizzontale. |
| [get_DpiY](./get_dpiy/)() | Restituisce la risoluzione verticale. |
| [get_InterpolationMode](./get_interpolationmode/)() | Restituisce un valore che indica la modalità di interpolazione associata all'oggetto corrente. |
| [get_IsClipEmpty](./get_isclipempty/)() const | NON IMPLEMENTATO. |
| [get_IsVisibleClipEmpty](./get_isvisibleclipempty/)() const | NON IMPLEMENTATO. |
| [get_PageScale](./get_pagescale/)() const | Restituisce la scala tra unità del mondo e unità di pagina per l'attuale oggetto [Graphics](./). |
| [get_PageUnit](./get_pageunit/)() const | Restituisce le unità di misura utilizzate per le coordinate di pagina sulla superficie rappresentata dall'oggetto corrente. |
| [get_PixelOffsetMode](./get_pixeloffsetmode/)() | Restituisce un valore che indica come i pixel sono spostati durante il rendering sulla superficie rappresentata dall'oggetto corrente. |
| [get_RenderingOrigin](./get_renderingorigin/)() const | Restituisce un oggetto [Point](../point/) che rappresenta l'origine del rendering dell'attuale oggetto [Graphics](./) per la dithering e per i pennelli a tratteggio. |
| [get_SmoothingMode](./get_smoothingmode/)() | Restituisce un valore che indica la modalità di smussatura usata durante il rendering sulla superficie rappresentata dall'oggetto corrente. |
| [get_TextContrast](./get_textcontrast/)() const | NON IMPLEMENTATO. |
| [get_TextRenderingHint](./get_textrenderinghint/)() | Restituisce un valore che indica la qualità del rendering del testo. |
| [get_Transform](./get_transform/)() | Restituisce la trasformazione geometrica del mondo per l'attuale oggetto [Graphics](./). |
| [get_VisibleClipBounds](./get_visibleclipbounds/)() const | Restituisce l'oggetto [RectangleF](../rectanglef/) che rappresenta un rettangolo di delimitazione della regione di ritaglio visibile dell'attuale oggetto [Graphics](./). |
| [GetHdc](./gethdc/)() | NON IMPLEMENTATO. |
| [GetNearestColor](./getnearestcolor/)(Color) | NON IMPLEMENTATO. |
| [GetSkCanvas](./getskcanvas/)() const |  |
| [IntersectClip](./intersectclip/)(const System::SharedPtr\<Region\>\&) | Aggiorna la regione di ritaglio di questo oggetto all'intersezione del ritaglio corrente e del ritaglio specificato. |
| [IntersectClip](./intersectclip/)(System::Drawing::RectangleF) | Aggiorna la regione di ritaglio di questo oggetto all'intersezione del ritaglio corrente e del ritaglio specificato. |
| [IntersectClip](./intersectclip/)(System::Drawing::Rectangle) | Aggiorna la regione di ritaglio di questo oggetto all'intersezione del ritaglio corrente e del ritaglio specificato. |
| [IsVisible](./isvisible/)(Point) | Determina se il punto specificato è contenuto nella regione di ritaglio visibile dell'attuale oggetto [Graphics](./). |
| [IsVisible](./isvisible/)(PointF) | NON IMPLEMENTATO. |
| [IsVisible](./isvisible/)(Rectangle) | NON IMPLEMENTATO. |
| [IsVisible](./isvisible/)(RectangleF) | NON IMPLEMENTATO. |
| [IsVisible](./isvisible/)(int32_t, int32_t) | NON IMPLEMENTATO. |
| [IsVisible](./isvisible/)(float, float) | NON IMPLEMENTATO. |
| [IsVisible](./isvisible/)(float, float, float, float) | NON IMPLEMENTATO. |
| [IsVisible](./isvisible/)(int32_t, int32_t, int32_t, int32_t) | NON IMPLEMENTATO. |
| [MeasureCharacterRanges](./measurecharacterranges/)(const System::String\&, const SharedPtr\<Font\>\&, RectangleF, const SharedPtr\<StringFormat\>\&) | Restituisce un array di regioni, ognuna delle quali delimita le posizioni dei caratteri nella stringa specificata. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const | Restituisce la dimensione della stringa specificata quando viene disegnata con il carattere specificato nel formato specificato. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const | Restituisce la dimensione della stringa specificata quando viene disegnata con il carattere specificato nel formato specificato. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const | NON IMPLEMENTATO. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const | Restituisce la dimensione della stringa specificata quando viene disegnata con il carattere specificato nel formato specificato. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Moltiplica la matrice di trasformazione globale dell'oggetto [Graphics](./) corrente per la matrice specificata. |
| [ReleaseHdc](./releasehdc/)() | NON IMPLEMENTATO. |
| [ReleaseHdc](./releasehdc/)(IntPtr) | NON IMPLEMENTATO. |
| [ResetClip](./resetclip/)() | Reimposta la regione di ritaglio per questo oggetto grafico a una regione infinita. |
| [ResetTransform](./resettransform/)() | Reimposta la matrice di trasformazione globale dell'oggetto corrente in modo che diventi una matrice identità. |
| [Restore](./restore/)(const SharedPtr\<Drawing2D::GraphicsState\>\&) | Ripristina lo stato di questo oggetto dallo stato salvato. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Applica la rotazione specificata alla matrice di trasformazione globale dell'oggetto [Graphics](./) corrente nell'ordine specificato. |
| [Save](./save/)() | Salva lo stato corrente di questo oggetto e restituisce lo stato salvato. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Applica il vettore di scala specificato alla matrice di trasformazione globale dell'oggetto corrente. |
| [set_Clip](./set_clip/)(const SharedPtr\<Region\>\&) | Imposta una regione che limita l'area di disegno della superficie di disegno rappresentata dall'oggetto corrente. |
| [set_CompositingMode](./set_compositingmode/)(Drawing2D::CompositingMode) | Imposta un valore che specifica come le immagini composite vengono disegnate sulla superficie rappresentata dall'oggetto corrente. |
| [set_CompositingQuality](./set_compositingquality/)(Drawing2D::CompositingQuality) | Imposta un valore che specifica il livello di qualità da utilizzare durante la composizione delle immagini. |
| [set_InterpolationMode](./set_interpolationmode/)(Drawing2D::InterpolationMode) | Imposta un valore che indica la modalità di interpolazione associata all'oggetto corrente. |
| [set_PageScale](./set_pagescale/)(float) | Imposta la scala tra le unità del mondo e le unità di pagina per l'oggetto [Graphics](./) corrente. |
| [set_PageUnit](./set_pageunit/)(GraphicsUnit) | Imposta le unità di misura utilizzate per le coordinate di pagina sulla superficie rappresentata dall'oggetto corrente. |
| [set_PixelOffsetMode](./set_pixeloffsetmode/)(Drawing2D::PixelOffsetMode) | Imposta un valore che specifica come i pixel devono essere spostati durante il rendering sulla superficie rappresentata dall'oggetto corrente. |
| [set_RenderingOrigin](./set_renderingorigin/)(Point) | Imposta un oggetto [Point](../point/) che specifica l'origine del rendering dell'oggetto [Graphics](./) corrente per la dithering e per i pennelli a tratteggio. |
| [set_SmoothingMode](./set_smoothingmode/)(Drawing2D::SmoothingMode) | Imposta un valore che specifica una modalità di smoothing utilizzata durante il rendering sulla superficie rappresentata dall'oggetto corrente. |
| [set_TextContrast](./set_textcontrast/)(int32_t) | NON IMPLEMENTATO. |
| [set_TextRenderingHint](./set_textrenderinghint/)(Text::TextRenderingHint) | Imposta un valore che specifica la qualità del rendering del testo. |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Imposta la trasformazione geometrica globale per l'oggetto [Graphics](./) corrente. |
| [SetClip](./setclip/)(const SharedPtr\<Region\>\&, Drawing2D::CombineMode) | Imposta la regione di ritaglio della superficie di disegno rappresentata dall'oggetto [Graphics](./) corrente al risultato dell'operazione specificata che combina la regione di ritaglio corrente e la regione specificata. |
| [SetClip](./setclip/)(Rectangle, Drawing2D::CombineMode) | Imposta la regione di ritaglio della superficie di disegno rappresentata dall'oggetto [Graphics](./) corrente al risultato dell'operazione specificata che combina la regione di ritaglio corrente e la regione specificata. |
| [SetClip](./setclip/)(RectangleF, Drawing2D::CombineMode) | Imposta la regione di ritaglio della superficie di disegno rappresentata dall'oggetto [Graphics](./) corrente al risultato dell'operazione specificata che combina la regione di ritaglio corrente e la regione specificata. |
| [SetClip](./setclip/)(const SharedPtr\<Graphics\>\&, Drawing2D::CombineMode) | NON IMPLEMENTATO. |
| [SetClip](./setclip/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&, Drawing2D::CombineMode) | Imposta la regione di ritaglio della superficie di disegno rappresentata dall'oggetto [Graphics](./) corrente al risultato dell'operazione specificata che combina la regione di ritaglio corrente e la regione specificata da un percorso grafico. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::Point\>\&) | NON IMPLEMENTATO. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::PointF\>\&) | NON IMPLEMENTATO. |
| [TranslateClip](./translateclip/)(int, int) | NON IMPLEMENTATO. |
| [TranslateClip](./translateclip/)(float, float) | NON IMPLEMENTATO. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Applica il vettore di traslazione specificato alla matrice di trasformazione globale dell'oggetto [Graphics](./) corrente. |
| [~Graphics](./~graphics/)() |  |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [DrawImageAbort](./drawimageabort/) | Il tipo di un oggetto funzione di callback utilizzato come argomento per il metodo DrawImage. |
| [EnumerateMetafileProc](./enumeratemetafileproc/) | Il tipo di un oggetto funzione di callback utilizzato come argomento per il metodo EnumerateMetafile. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
