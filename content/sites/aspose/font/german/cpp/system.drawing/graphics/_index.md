---
title: "System::Drawing::Graphics class"
linktitle: "Graphics"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Graphics class. Stellt eine Zeichenfläche dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1000
url: /de/cpp/system.drawing/graphics/
---
## Graphics class


Stellt eine Zeichenfläche dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Graphics : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddMetafileComment](./addmetafilecomment/)(const System::ArrayPtr\<uint8_t\>\&) | NICHT IMPLEMENTIERT. |
| [BeginContainer](./begincontainer/)() | Speichert einen Container mit dem aktuellen Zustand dieses Objekts, öffnet und verwendet einen neuen Container und gibt den gespeicherten Container zurück. |
| [BeginContainer](./begincontainer/)(Rectangle, Rectangle, GraphicsUnit) | Speichert einen Container mit dem aktuellen Zustand dieses Objekts, öffnet und verwendet einen neuen Container und gibt den gespeicherten Container zurück. |
| [BeginContainer](./begincontainer/)(RectangleF, RectangleF, GraphicsUnit) | Speichert einen Container mit dem aktuellen Zustand dieses Objekts, öffnet und verwendet einen neuen Container und gibt den gespeicherten Container zurück. |
| [Clear](./clear/)(Color) | Löscht die vom aktuellen Objekt dargestellte Zeichenfläche und füllt sie mit der angegebenen Farbe. |
| [CopyFromScreen](./copyfromscreen/)(Point, Point, Size, CopyPixelOperation) | NICHT IMPLEMENTIERT. |
| [CopyFromScreen](./copyfromscreen/)(int32_t, int32_t, int32_t, int32_t, Size, CopyPixelOperation) | NICHT IMPLEMENTIERT. |
| [Dispose](./dispose/)() | Gibt alle vom aktuellen Objekt erworbenen Betriebssystemressourcen frei. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | Zeichnet den angegebenen Bogen mit dem angegebenen Stift auf der vom aktuellen Objekt dargestellten Fläche. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | Zeichnet den angegebenen Bogen mit dem angegebenen Stift auf der vom aktuellen Objekt dargestellten Fläche. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | Zeichnet den angegebenen Bogen mit dem angegebenen Stift auf der vom aktuellen Objekt dargestellten Fläche. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | Zeichnet den angegebenen Bogen mit dem angegebenen Stift auf der vom aktuellen Objekt dargestellten Fläche. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const Point\&, const Point\&, const Point\&, const Point\&) | NICHT IMPLEMENTIERT. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const PointF\&, const PointF\&, const PointF\&, const PointF\&) | NICHT IMPLEMENTIERT. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float, float, float) | NICHT IMPLEMENTIERT. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | Zeichnet eine Reihe von Bézier-Kurven mit dem angegebenen Stift. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | Zeichnet eine Reihe von Bézier-Kurven mit dem angegebenen Stift. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float, Drawing2D::FillMode) | Zeichnet eine geschlossene Kurve mit dem angegebenen Stift. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float, Drawing2D::FillMode) | Zeichnet eine geschlossene Kurve mit dem angegebenen Stift. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float) | Zeichnet eine Kurve mit dem angegebenen Stift. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float) | Zeichnet eine Kurve mit dem angegebenen Stift. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, int32_t, int32_t, float) | Zeichnet eine Kurve mit dem angegebenen Stift. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, int32_t, int32_t, float) | Zeichnet eine Kurve mit dem angegebenen Stift. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, Rectangle) | Zeichnet die angegebene Ellipse mit dem angegebenen Stift auf der vom aktuellen Objekt dargestellten Fläche. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, RectangleF) | Zeichnet die angegebene Ellipse mit dem angegebenen Stift auf der vom aktuellen Objekt dargestellten Fläche. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Zeichnet die angegebene Ellipse mit dem angegebenen Stift auf der vom aktuellen Objekt dargestellten Fläche. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Zeichnet die angegebene Ellipse mit dem angegebenen Stift auf der vom aktuellen Objekt dargestellten Fläche. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, Rectangle) | NICHT IMPLEMENTIERT. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, int32_t, int32_t) | NICHT IMPLEMENTIERT. |
| [DrawIconUnstretched](./drawiconunstretched/)(const SharedPtr\<Icon\>\&, Rectangle) | NICHT IMPLEMENTIERT. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<Point\>\&) | NICHT IMPLEMENTIERT. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Zeichnet den angegebenen Bereich des angegebenen Bildes an der angegebenen Position. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::ArrayView\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Zeichnet den angegebenen Bereich des angegebenen Bildes an der angegebenen Position. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::StackArray\<PointF, N\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Zeichnet den angegebenen Bereich des angegebenen Bildes an der angegebenen Position. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int) | Zeichnet das angegebene Bild an der angegebenen Position. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float) | Zeichnet das angegebene Bild an der angegebenen Position. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Point) | Zeichnet das angegebene Bild an der angegebenen Position. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, PointF) | Zeichnet das angegebene Bild an der angegebenen Position. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, int, int) | Zeichnet das angegebene Bild in das angegebene Rechteck. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, float, float) | Zeichnet das angegebene Bild in das angegebene Rechteck. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, RectangleF, RectangleF, GraphicsUnit) | Zeichnet den angegebenen Bereich des angegebenen Bildes an der angegebenen Position. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, Rectangle, GraphicsUnit) | Zeichnet den angegebenen Bereich des angegebenen Bildes an der angegebenen Position. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, Rectangle, GraphicsUnit) | Zeichnet den angegebenen Bereich des angegebenen Bildes an der angegebenen Position. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const Rectangle\&) | Zeichnet das angegebene Bild an der angegebenen Position. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const RectangleF\&) | Zeichnet das angegebene Bild an der angegebenen Position. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Zeichnet den angegebenen Bereich des angegebenen Bildes in das angegebene Rechteck. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Zeichnet den angegebenen Bereich des angegebenen Bildes in das angegebene Rechteck. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit) | Zeichnet den angegebenen Bereich des angegebenen Bildes in das angegebene Rechteck. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit) | Zeichnet den angegebenen Bereich des angegebenen Bildes in das angegebene Rechteck. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | NICHT IMPLEMENTIERT. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | NICHT IMPLEMENTIERT. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | NICHT IMPLEMENTIERT. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | NICHT IMPLEMENTIERT. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit) | NICHT IMPLEMENTIERT. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&) | NICHT IMPLEMENTIERT. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit) | NICHT IMPLEMENTIERT. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, const SharedPtr\<Imaging::ImageAttributes\>\&) | Zeichnet den angegebenen Bereich des angegebenen Bildes an der angegebenen Position. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, RectangleF, GraphicsUnit) | Zeichnet den angegebenen Bereich des angegebenen Bildes an der angegebenen Position. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int) | Zeichnet das angegebene Bild mit seiner ursprünglichen physischen Größe an der angegebenen Position. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int, int, int) | Zeichnet ein angegebenes Bild mit seiner ursprünglichen physischen Größe an einer angegebenen Position. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Rectangle\&) | Zeichnet ein angegebenes Bild mit seiner ursprünglichen physischen Größe an einer angegebenen Position. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Point\&) | Zeichnet ein angegebenes Bild mit seiner ursprünglichen physischen Größe an einer angegebenen Position. |
| [DrawImageUnscaledAndClipped](./drawimageunscaledandclipped/)(const SharedPtr\<Image\>\&, Rectangle) | NICHT IMPLEMENTIERT. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, Point, Point) | Zeichnet die angegebene Linie mit dem angegebenen Stift. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, PointF, PointF) | Zeichnet die angegebene Linie mit dem angegebenen Stift. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Zeichnet die angegebene Linie mit dem angegebenen Stift. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Zeichnet die angegebene Linie mit dem angegebenen Stift. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::Point\>\&) | Zeichnet eine Reihe von Liniensegmenten mit dem angegebenen Stift. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::PointF\>\&) | Zeichnet eine Reihe von Liniensegmenten mit dem angegebenen Stift. |
| [DrawPath](./drawpath/)(const SharedPtr\<Pen\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Zeichnet den angegebenen Pfad mit dem angegebenen Stift. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | Zeichnet das angegebene Kuchenstück mit dem angegebenen Stift auf der vom aktuellen Objekt dargestellten Fläche. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | Zeichnet das angegebene Kuchenstück mit dem angegebenen Stift auf der vom aktuellen Objekt dargestellten Fläche. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | Zeichnet das angegebene Kuchenstück mit dem angegebenen Stift auf der vom aktuellen Objekt dargestellten Fläche. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | Zeichnet das angegebene Kuchenstück mit dem angegebenen Stift auf der vom aktuellen Objekt dargestellten Fläche. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | Zeichnet ein Polygon mit dem angegebenen Stift. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | Zeichnet ein Polygon mit dem angegebenen Stift. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Zeichnet das angegebene Rechteck mit dem angegebenen Stift auf der vom aktuellen Objekt dargestellten Fläche. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Zeichnet das angegebene Rechteck mit dem angegebenen Stift auf der vom aktuellen Objekt dargestellten Fläche. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, Rectangle) | Zeichnet das angegebene Rechteck mit dem angegebenen Stift auf der vom aktuellen Objekt dargestellten Fläche. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Rectangle\>\&) | Zeichnet eine Reihe von Rechtecken mit dem angegebenen Stift. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<RectangleF\>\&) | Zeichnet eine Reihe von Rechtecken mit dem angegebenen Stift. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Zeichnet die angegebene Zeichenkette an der angegebenen Position mit der angegebenen Schriftart und dem angegebenen Pinsel. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Zeichnet die angegebene Zeichenkette im angegebenen Rechteck mit der angegebenen Schriftart und dem angegebenen Pinsel. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Zeichnet die angegebene Zeichenkette an der angegebenen Position mit der angegebenen Schriftart und dem angegebenen Pinsel. |
| [EndContainer](./endcontainer/)(const SharedPtr\<Drawing2D::GraphicsContainer\>\&) | Schließt den aktuellen Container und stellt den Zustand dieses Objekts aus dem Zustand des gespeicherten Containers wieder her. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, Graphics::EnumerateMetafileProc) | NICHT IMPLEMENTIERT. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Graphics::EnumerateMetafileProc) | NICHT IMPLEMENTIERT. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Graphics::EnumerateMetafileProc) | NICHT IMPLEMENTIERT. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, Graphics::EnumerateMetafileProc) | NICHT IMPLEMENTIERT. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Graphics::EnumerateMetafileProc) | NICHT IMPLEMENTIERT. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, Graphics::EnumerateMetafileProc) | NICHT IMPLEMENTIERT. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | NICHT IMPLEMENTIERT. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | NICHT IMPLEMENTIERT. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | NICHT IMPLEMENTIERT. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | NICHT IMPLEMENTIERT. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | NICHT IMPLEMENTIERT. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | NICHT IMPLEMENTIERT. |
| [ExcludeClip](./excludeclip/)(Rectangle) | NICHT IMPLEMENTIERT. |
| [ExcludeClip](./excludeclip/)(const SharedPtr\<Region\>\&) | NICHT IMPLEMENTIERT. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode, float) | Zeichnet eine geschlossene Kurve mit dem angegebenen Pinsel. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode, float) | Zeichnet eine geschlossene Kurve mit dem angegebenen Pinsel. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, Rectangle) | Füllt das Innere der durch das Begrenzungsrechteck definierten Ellipse mit dem angegebenen Pinsel. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, RectangleF) | Füllt das Innere der durch das Begrenzungsrechteck definierten Ellipse mit dem angegebenen Pinsel. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, int, int, int, int) | Füllt das Innere der durch das Begrenzungsrechteck definierten Ellipse mit dem angegebenen Pinsel. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, float, float, float, float) | Füllt das Innere der durch das Begrenzungsrechteck definierten Ellipse mit dem angegebenen Pinsel. |
| [FillPath](./fillpath/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Füllt die Innenbereiche des angegebenen Pfads mit dem angegebenen Pinsel. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, int, int, int, int, int, int) | Füllt das angegebene Kuchenstück mit dem angegebenen Pinsel auf der Oberfläche, die vom aktuellen Objekt dargestellt wird. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, float, float, float, float, float, float) | Füllt das angegebene Kuchenstück mit dem angegebenen Pinsel auf der Oberfläche, die vom aktuellen Objekt dargestellt wird. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, Rectangle, float, float) | Füllt das angegebene Kuchenstück mit dem angegebenen Pinsel auf der Oberfläche, die vom aktuellen Objekt dargestellt wird. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode) | Füllt die Innenbereiche des angegebenen Polygons mit dem angegebenen Pinsel. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode) | Füllt die Innenbereiche des angegebenen Polygons mit dem angegebenen Pinsel. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, float, float, float, float) | Füllt das angegebene Rechteck mit dem angegebenen Pinsel. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, int, int, int, int) | Füllt das angegebene Rechteck mit dem angegebenen Pinsel. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, Rectangle) | Füllt das angegebene Rechteck mit dem angegebenen Pinsel. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, RectangleF) | Füllt das angegebene Rechteck mit dem angegebenen Pinsel. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Rectangle\>\&) | Füllt eine Reihe von Rechtecken mit dem angegebenen Pinsel. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<RectangleF\>\&) | Füllt eine Reihe von Rechtecken mit dem angegebenen Pinsel. |
| [FillRegion](./fillregion/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Region\>\&) | Füllt die Innenbereiche der angegebenen Region mit dem angegebenen Pinsel. |
| [Flush](./flush/)(Drawing2D::FlushIntention) | Löst die sofortige Ausführung aller ausstehenden Zeichenoperationen aus. |
| static [FromHwnd](./fromhwnd/)(IntPtr) | NICHT IMPLEMENTIERT. |
| static [FromHwndInternal](./fromhwndinternal/)(IntPtr) | NICHT IMPLEMENTIERT. |
| static [FromImage](./fromimage/)(const SharedPtr\<Image\>\&) | Erstellt ein neues [Graphics](./)-Objekt aus dem angegebenen Bild. |
| [get_Clip](./get_clip/)() | Gibt ein [Region](../region/)-Objekt zurück, das eine Region darstellt, die den Zeichenbereich der von dem aktuellen [Graphics](./)-Objekt repräsentierten Zeichenfläche begrenzt. |
| [get_ClipBounds](./get_clipbounds/)() const | Gibt ein Rechteck zurück, das den Beschneidungsbereich der von dem aktuellen Objekt dargestellten Oberfläche begrenzt. |
| [get_CompositingMode](./get_compositingmode/)() | Gibt einen Wert zurück, der angibt, wie zusammengesetzte Bilder auf der von dem aktuellen Objekt dargestellten Oberfläche gezeichnet werden. |
| [get_CompositingQuality](./get_compositingquality/)() | Gibt einen Wert zurück, der die beim Zusammenfügen von Bildern verwendete Qualitätsstufe angibt. |
| [get_DpiX](./get_dpix/)() | Gibt die horizontale Auflösung zurück. |
| [get_DpiY](./get_dpiy/)() | Gibt die vertikale Auflösung zurück. |
| [get_InterpolationMode](./get_interpolationmode/)() | Gibt einen Wert zurück, der den Interpolationsmodus des aktuellen Objekts angibt. |
| [get_IsClipEmpty](./get_isclipempty/)() const | NICHT IMPLEMENTIERT. |
| [get_IsVisibleClipEmpty](./get_isvisibleclipempty/)() const | NICHT IMPLEMENTIERT. |
| [get_PageScale](./get_pagescale/)() const | Gibt die Skalierung zwischen Welteinheiten und Seiteneinheiten für das aktuelle [Graphics](./)-Objekt zurück. |
| [get_PageUnit](./get_pageunit/)() const | Gibt die für Seitenkoordinaten auf der von dem aktuellen Objekt dargestellten Oberfläche verwendeten Maßeinheiten zurück. |
| [get_PixelOffsetMode](./get_pixeloffsetmode/)() | Gibt einen Wert zurück, der angibt, wie die Pixel während des Renderns auf der von dem aktuellen Objekt dargestellten Oberfläche verschoben werden. |
| [get_RenderingOrigin](./get_renderingorigin/)() const | Gibt ein [Point](../point/)-Objekt zurück, das den Renderursprung des aktuellen [Graphics](./)-Objekts für Dithering und Schraffurpinsel darstellt. |
| [get_SmoothingMode](./get_smoothingmode/)() | Gibt einen Wert zurück, der den beim Rendern auf der von dem aktuellen Objekt dargestellten Oberfläche verwendeten Glättungsmodus angibt. |
| [get_TextContrast](./get_textcontrast/)() const | NICHT IMPLEMENTIERT. |
| [get_TextRenderingHint](./get_textrenderinghint/)() | Gibt einen Wert zurück, der die Qualität der Textdarstellung angibt. |
| [get_Transform](./get_transform/)() | Gibt die geometrische Welttransformation für das aktuelle [Graphics](./)-Objekt zurück. |
| [get_VisibleClipBounds](./get_visibleclipbounds/)() const | Gibt das [RectangleF](../rectanglef/)-Objekt zurück, das ein Begrenzungsrechteck der sichtbaren Beschneidungsregion des aktuellen [Graphics](./)-Objekts darstellt. |
| [GetHdc](./gethdc/)() | NICHT IMPLEMENTIERT. |
| [GetNearestColor](./getnearestcolor/)(Color) | NICHT IMPLEMENTIERT. |
| [GetSkCanvas](./getskcanvas/)() const |  |
| [IntersectClip](./intersectclip/)(const System::SharedPtr\<Region\>\&) | Aktualisiert die Beschneidungsregion dieses Objekts auf die Schnittmenge der aktuellen Beschneidung und der angegebenen Beschneidung. |
| [IntersectClip](./intersectclip/)(System::Drawing::RectangleF) | Aktualisiert die Beschneidungsregion dieses Objekts auf die Schnittmenge der aktuellen Beschneidung und der angegebenen Beschneidung. |
| [IntersectClip](./intersectclip/)(System::Drawing::Rectangle) | Aktualisiert die Beschneidungsregion dieses Objekts auf die Schnittmenge der aktuellen Beschneidung und der angegebenen Beschneidung. |
| [IsVisible](./isvisible/)(Point) | Ermittelt, ob der angegebene Punkt innerhalb der sichtbaren Beschneidungsregion des aktuellen [Graphics](./)-Objekts liegt. |
| [IsVisible](./isvisible/)(PointF) | NICHT IMPLEMENTIERT. |
| [IsVisible](./isvisible/)(Rectangle) | NICHT IMPLEMENTIERT. |
| [IsVisible](./isvisible/)(RectangleF) | NICHT IMPLEMENTIERT. |
| [IsVisible](./isvisible/)(int32_t, int32_t) | NICHT IMPLEMENTIERT. |
| [IsVisible](./isvisible/)(float, float) | NICHT IMPLEMENTIERT. |
| [IsVisible](./isvisible/)(float, float, float, float) | NICHT IMPLEMENTIERT. |
| [IsVisible](./isvisible/)(int32_t, int32_t, int32_t, int32_t) | NICHT IMPLEMENTIERT. |
| [MeasureCharacterRanges](./measurecharacterranges/)(const System::String\&, const SharedPtr\<Font\>\&, RectangleF, const SharedPtr\<StringFormat\>\&) | Gibt ein Array von Regionen zurück, von denen jede die Zeichenpositionen im angegebenen String begrenzt. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const | Gibt die Größe des angegebenen Strings zurück, wenn er in der angegebenen Schriftart im angegebenen Format gezeichnet wird. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const | Gibt die Größe des angegebenen Strings zurück, wenn er in der angegebenen Schriftart im angegebenen Format gezeichnet wird. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const | NICHT IMPLEMENTIERT. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const | Gibt die Größe des angegebenen Strings zurück, wenn er in der angegebenen Schriftart im angegebenen Format gezeichnet wird. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Multipliziert die Welt-Transformationsmatrix des aktuellen [Graphics](./)-Objekts mit der angegebenen Matrix. |
| [ReleaseHdc](./releasehdc/)() | NICHT IMPLEMENTIERT. |
| [ReleaseHdc](./releasehdc/)(IntPtr) | NICHT IMPLEMENTIERT. |
| [ResetClip](./resetclip/)() | Setzt die Clip-Region für diese Grafik auf eine unendliche Region zurück. |
| [ResetTransform](./resettransform/)() | Setzt die Welt-Transformationsmatrix des aktuellen Objekts zurück, sodass sie zu einer Einheitsmatrix wird. |
| [Restore](./restore/)(const SharedPtr\<Drawing2D::GraphicsState\>\&) | Stellt den Zustand dieses Objekts aus dem gespeicherten Zustand wieder her. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Wendet die angegebene Rotation in der angegebenen Reihenfolge auf die Welt-Transformationsmatrix des aktuellen [Graphics](./)-Objekts an. |
| [Save](./save/)() | Speichert den aktuellen Zustand dieses Objekts und gibt den gespeicherten Zustand zurück. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Wendet den angegebenen Skalierungsvektor auf die Welt-Transformationsmatrix des aktuellen Objekts an. |
| [set_Clip](./set_clip/)(const SharedPtr\<Region\>\&) | Legt eine Region fest, die den Zeichenbereich der vom aktuellen Objekt dargestellten Zeichenfläche begrenzt. |
| [set_CompositingMode](./set_compositingmode/)(Drawing2D::CompositingMode) | Legt einen Wert fest, der angibt, wie zusammengesetzte Bilder auf der vom aktuellen Objekt dargestellten Oberfläche gezeichnet werden. |
| [set_CompositingQuality](./set_compositingquality/)(Drawing2D::CompositingQuality) | Legt einen Wert fest, der die Qualitätsstufe angibt, die beim Zusammensetzen von Bildern verwendet werden soll. |
| [set_InterpolationMode](./set_interpolationmode/)(Drawing2D::InterpolationMode) | Legt einen Wert fest, der den Interpolationsmodus des aktuellen Objekts angibt. |
| [set_PageScale](./set_pagescale/)(float) | Legt die Skalierung zwischen Welteinheiten und Seiteneinheiten für das aktuelle [Graphics](./)-Objekt fest. |
| [set_PageUnit](./set_pageunit/)(GraphicsUnit) | Legt die Maßeinheiten fest, die für Seitenkoordinaten auf der vom aktuellen Objekt dargestellten Oberfläche verwendet werden. |
| [set_PixelOffsetMode](./set_pixeloffsetmode/)(Drawing2D::PixelOffsetMode) | Legt einen Wert fest, der angibt, wie die Pixel während des Renderns auf der vom aktuellen Objekt dargestellten Oberfläche verschoben werden sollen. |
| [set_RenderingOrigin](./set_renderingorigin/)(Point) | Legt ein [Point](../point/)-Objekt fest, das den Renderursprung des aktuellen [Graphics](./)-Objekts für Dithering und Schraffurpinsel angibt. |
| [set_SmoothingMode](./set_smoothingmode/)(Drawing2D::SmoothingMode) | Legt einen Wert fest, der den Glättungsmodus angibt, der beim Rendern auf der vom aktuellen Objekt dargestellten Oberfläche verwendet wird. |
| [set_TextContrast](./set_textcontrast/)(int32_t) | NICHT IMPLEMENTIERT. |
| [set_TextRenderingHint](./set_textrenderinghint/)(Text::TextRenderingHint) | Legt einen Wert fest, der die Qualität der Textdarstellung angibt. |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Legt die geometrische Welt-Transformation für das aktuelle [Graphics](./)-Objekt fest. |
| [SetClip](./setclip/)(const SharedPtr\<Region\>\&, Drawing2D::CombineMode) | Legt die Clip-Region der vom aktuellen [Graphics](./)-Objekt dargestellten Zeichenfläche auf das Ergebnis der angegebenen Operation fest, die die aktuelle Clip-Region und die angegebene Region kombiniert. |
| [SetClip](./setclip/)(Rectangle, Drawing2D::CombineMode) | Legt die Clip-Region der vom aktuellen [Graphics](./)-Objekt dargestellten Zeichenfläche auf das Ergebnis der angegebenen Operation fest, die die aktuelle Clip-Region und die angegebene Region kombiniert. |
| [SetClip](./setclip/)(RectangleF, Drawing2D::CombineMode) | Legt die Clip-Region der vom aktuellen [Graphics](./)-Objekt dargestellten Zeichenfläche auf das Ergebnis der angegebenen Operation fest, die die aktuelle Clip-Region und die angegebene Region kombiniert. |
| [SetClip](./setclip/)(const SharedPtr\<Graphics\>\&, Drawing2D::CombineMode) | NICHT IMPLEMENTIERT. |
| [SetClip](./setclip/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&, Drawing2D::CombineMode) | Legt die Clip-Region der vom aktuellen [Graphics](./)-Objekt dargestellten Zeichenfläche auf das Ergebnis der angegebenen Operation fest, die die aktuelle Clip-Region und die durch einen Grafikpfad angegebene Region kombiniert. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::Point\>\&) | NICHT IMPLEMENTIERT. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::PointF\>\&) | NICHT IMPLEMENTIERT. |
| [TranslateClip](./translateclip/)(int, int) | NICHT IMPLEMENTIERT. |
| [TranslateClip](./translateclip/)(float, float) | NICHT IMPLEMENTIERT. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Wendet den angegebenen Translationsvektor auf die Welt-Transformationsmatrix des aktuellen [Graphics](./)-Objekts an. |
| [~Graphics](./~graphics/)() |  |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [DrawImageAbort](./drawimageabort/) | Der Typ eines Callback-Funktionsobjekts, das als Argument für die DrawImage-Methode verwendet wird. |
| [EnumerateMetafileProc](./enumeratemetafileproc/) | Der Typ eines Callback-Funktionsobjekts, das als Argument für die EnumerateMetafile-Methode verwendet wird. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
