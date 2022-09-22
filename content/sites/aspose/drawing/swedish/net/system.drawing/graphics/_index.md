---
title: Graphics
second_title: Aspose.Drawing för .NET API Referens
description: Kapslar in ritytan.
type: docs
weight: 530
url: /sv/net/system.drawing/graphics/
---
## Graphics class

Kapslar in ritytan.

```csharp
public class Graphics : IDisposable
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Clip](../../system.drawing/graphics/clip) { get; set; } | Hämtar eller sätter enRegion som begränsar ritningsområdet för dettaGraphics . |
| [ClipBounds](../../system.drawing/graphics/clipbounds) { get; } | Får en[`RectangleF`](../rectanglef) struktur som begränsar klippområdet för detta[`Graphics`](../graphics) . |
| [CompositingMode](../../system.drawing/graphics/compositingmode) { get; set; } | Hämtar eller ställer in ett värde som anger hur sammansatta bilder ritas till dettaGraphics . |
| [CompositingQuality](../../system.drawing/graphics/compositingquality) { get; set; } | Hämtar eller ställer in renderingskvaliteten för sammansatta bilder som ritas till dettaGraphics . |
| [DpiX](../../system.drawing/graphics/dpix) { get; } | Får den horisontella upplösningen av dettaGraphics . |
| [DpiY](../../system.drawing/graphics/dpiy) { get; } | Får den vertikala upplösningen av dettaGraphics . |
| [InterpolationMode](../../system.drawing/graphics/interpolationmode) { get; set; } | Hämtar eller ställer in interpolationsläget som är associerat med denna grafik. |
| [IsClipEmpty](../../system.drawing/graphics/isclipempty) { get; } | Får ett värde som indikerar om klippområdet för dettaGraphics är tom. |
| [IsVisibleClipEmpty](../../system.drawing/graphics/isvisibleclipempty) { get; } | Får ett värde som indikerar om det synliga klippområdet för dettaGraphics är tom. |
| [PageScale](../../system.drawing/graphics/pagescale) { get; set; } | Hämtar eller ställer in skalningen mellan världsenheter och sidenheter för dettaGraphics . |
| [PageUnit](../../system.drawing/graphics/pageunit) { get; set; } | Hämtar eller ställer in måttenheten som används för sidkoordinater i dettaGraphics . |
| [PixelOffsetMode](../../system.drawing/graphics/pixeloffsetmode) { get; set; } | Hämtar eller ställer in ett värde som anger hur pixlar förskjuts under rendering av dennaGraphics . |
| [RenderingOrigin](../../system.drawing/graphics/renderingorigin) { get; set; } | Hämtar eller ställer in renderingsursprunget för dettaGraphics för dithering och för luckborstar. |
| [SmoothingMode](../../system.drawing/graphics/smoothingmode) { get; set; } | Hämtar eller ställer in renderingskvaliteten för denna grafik. |
| [TextContrast](../../system.drawing/graphics/textcontrast) { get; set; } | Hämtar eller ställer in gammakorrigeringsvärdet för rendering av text. |
| [TextRenderingHint](../../system.drawing/graphics/textrenderinghint) { get; set; } | Hämtar eller ställer in renderingsläget för text som är associerad med dettaGraphics . |
| [Transform](../../system.drawing/graphics/transform) { get; set; } | Hämtar eller ställer in en kopia av den geometriska världsomvandlingen för dettaGraphics . |
| [VisibleClipBounds](../../system.drawing/graphics/visibleclipbounds) { get; } | Hämtar begränsningsrektangeln för det synliga klippområdet för dettaGraphics . |

## Metoder

| namn | Beskrivning |
| --- | --- |
| static [FromHwnd](../../system.drawing/graphics/fromhwnd)(IntPtr) | Skapar en nyGraphics från det angivna handtaget till ett fönster. |
| static [FromImage](../../system.drawing/graphics/fromimage)(Image) | Skapar en ny grafik från den angivna bilden. |
| [AddMetafileComment](../../system.drawing/graphics/addmetafilecomment)(byte[]) | Lägger till en kommentar till den aktuellaMetafile . |
| [BeginContainer](../../system.drawing/graphics/begincontainer#begincontainer)() | Sparar en grafikbehållare med den aktuella statusen för dennaGraphics och öppnar och använder en ny grafikbehållare. |
| [BeginContainer](../../system.drawing/graphics/begincontainer#begincontainer_1)(Rectangle, Rectangle, GraphicsUnit) | Sparar en grafikbehållare med den aktuella statusen för dennaGraphics och öppnar och använder en ny grafikbehållare med den angivna skalomvandlingen. |
| [BeginContainer](../../system.drawing/graphics/begincontainer#begincontainer_2)(RectangleF, RectangleF, GraphicsUnit) | Sparar en grafikbehållare med den aktuella statusen för dennaGraphics och öppnar och använder en ny grafikbehållare med den angivna skalomvandlingen. |
| [Clear](../../system.drawing/graphics/clear)(Color) | Rensar hela ritytan och fyller den med den angivna bakgrundsfärgen. |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen#copyfromscreen_1)(Point, Point, Size) | Utför en bitblocksöverföring av färgdata, motsvarande en rektangel av pixlar, från skärmen till ritytan påGraphics . |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen#copyfromscreen_2)(Point, Point, Size, CopyPixelOperation) | Utför en bitblocksöverföring av färgdata, motsvarande en rektangel av pixlar, från skärmen till ritytan påGraphics . |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen#copyfromscreen)(int, int, int, int, Size, CopyPixelOperation) | Utför en bitblocksöverföring av färgdata, motsvarande en rektangel av pixlar, från skärmen till ritytan påGraphics . |
| [Dispose](../../system.drawing/graphics/dispose)() | Frigör alla resurser som används av denna grafik. |
| [DrawArc](../../system.drawing/graphics/drawarc#drawarc_1)(Pen, RectangleF, float, float) | Ritar en båge som representerar en del av en ellips som specificeras av en RectangleF-struktur. |
| [DrawArc](../../system.drawing/graphics/drawarc#drawarc)(Pen, float, float, float, float, float, float) | Ritar en båge som representerar en del av en ellips specificerad av ett par koordinater, en bredd och en höjd. |
| [DrawBezier](../../system.drawing/graphics/drawbezier#drawbezier_1)(Pen, PointF, PointF, PointF, PointF) | Ritar en Bézier-spline definierad av fyra PointF-strukturer. |
| [DrawBezier](../../system.drawing/graphics/drawbezier#drawbezier)(Pen, float, float, float, float, float, float, float, float) | Ritar en Bézier-spline definierad av fyra ordnade par av koordinater som representerar punkter. |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers#drawbeziers)(Pen, PointF[]) | Ritar en serie Bézier-splines från en uppsättning avPoint strukturer. |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers#drawbeziers_1)(Pen, Point[]) | Ritar en serie Bézier-splines från en uppsättning avPointF strukturer. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve)(Pen, PointF[]) | Ritar en sluten kardinalspline definierad av en array avPointF strukturer. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve_2)(Pen, Point[]) | Ritar en sluten kardinalspline definierad av en array avPoint strukturer. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve_1)(Pen, PointF[], float, FillMode) | Ritar en sluten kardinalspline definierad av en rad PointF-strukturer med en specificerad spänning. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve_3)(Pen, Point[], float, FillMode) | Ritar en sluten kardinalspline definierad av en array avPoint strukturer med en specificerad spänning. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve)(Pen, PointF[]) | Ritar en kardinal spline genom en specificerad array avPointF strukturer. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_4)(Pen, Point[]) | Ritar en kardinal spline genom en specificerad array avPoint strukturer. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_3)(Pen, PointF[], float) | Ritar en kardinal spline genom en specificerad array avPointF strukturer med en specificerad spänning. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_6)(Pen, Point[], float) | Ritar en kardinal spline genom en specificerad array avPoint strukturer med en specificerad spänning. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_1)(Pen, PointF[], int, int) | Ritar en kardinal spline genom en specificerad array avPointF strukturer med en specificerad spänning. Ritningen börjar offset från början av arrayen. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_2)(Pen, PointF[], int, int, float) | Ritar en kardinal spline genom en specificerad array avPointF strukturer med en specificerad spänning. Ritningen börjar offset från början av arrayen. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_5)(Pen, Point[], int, int, float) | Ritar en kardinal spline genom en specificerad array avPoint strukturer med en specificerad spänning. Ritningen börjar offset från början av arrayen. |
| [DrawEllipse](../../system.drawing/graphics/drawellipse#drawellipse_1)(Pen, RectangleF) | Ritar en ellips definierad av en avgränsande rektangelF. |
| [DrawEllipse](../../system.drawing/graphics/drawellipse#drawellipse)(Pen, float, float, float, float) | Ritar en ellips definierad av en avgränsande rektangel specificerad av ett par koordinater, en höjd och en bredd. |
| [DrawIcon](../../system.drawing/graphics/drawicon#drawicon_1)(Icon, Rectangle) | Ritar bilden som representeras av den angivnaIcon inom det område som anges av aRectangle struktur. |
| [DrawIcon](../../system.drawing/graphics/drawicon#drawicon)(Icon, int, int) | Ritar bilden som representeras av den angivnaIcon vid de angivna koordinaterna. |
| [DrawIconUnstretched](../../system.drawing/graphics/drawiconunstretched)(Icon, Rectangle) | Ritar bilden som representeras av den angivnaIcon utan att skala bilden. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_6)(Image, Point) | Ritar den angivna bilden, med dess ursprungliga fysiska storlek, på den angivna platsen. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_7)(Image, PointF) | Ritar det angivnaImage , med sin ursprungliga fysiska storlek, på den angivna platsen. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_8)(Image, PointF[]) | Ritar det angivnaImage på angiven plats och med angiven form och storlek. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_11)(Image, Point[]) | Ritar det angivnaЕ:Image på angiven plats och med angiven form och storlek. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_14)(Image, Rectangle) | Ritar den angivna bilden på den angivna platsen och med den angivna storleken. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_20)(Image, RectangleF) | Ritar den angivna bilden på den angivna platsen och med den angivna storleken. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_3)(Image, float, float) | Ritar det angivnaImage , med sin ursprungliga fysiska storlek, på den angivna platsen. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage)(Image, int, int) | Ritar den angivna bilden, med dess ursprungliga fysiska storlek, på den plats som anges av ett koordinatpar. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_9)(Image, PointF[], RectangleF, GraphicsUnit) | Ritar den angivna delen av den angivna bilden på den angivna platsen och med den angivna storleken. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_12)(Image, Point[], Rectangle, GraphicsUnit) | Ritar den angivna delen av den angivnaImage på angiven plats och med angiven storlek. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_19)(Image, Rectangle, Rectangle, GraphicsUnit) | Ritar den angivna delen av den angivna bilden på den angivna platsen och med den angivna storleken. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_21)(Image, RectangleF, RectangleF, GraphicsUnit) | Ritar den angivna delen av den angivna bilden på den angivna platsen och med den angivna storleken. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_4)(Image, float, float, float, float) | Ritar det angivnaImage , med sin ursprungliga fysiska storlek, på den angivna platsen och med den angivna storleken. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_5)(Image, float, float, RectangleF, GraphicsUnit) | Ritar en del av en bild på en angiven plats. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_1)(Image, int, int, int, int) | Ritar den angivna bilden på den angivna platsen och med den angivna storleken. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_2)(Image, int, int, Rectangle, GraphicsUnit) | Ritar en del av en bild på en angiven plats. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_10)(Image, PointF[], RectangleF, GraphicsUnit, ImageAttributes) | Ritar den angivna delen av den angivna bilden på den angivna platsen och med den angivna storleken. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_13)(Image, Point[], Rectangle, GraphicsUnit, ImageAttributes) | Ritar den angivna delen av den angivnaImage på angiven plats och med angiven storlek. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_17)(Image, Rectangle, float, float, float, float, GraphicsUnit) | Ritar den angivna delen av den angivnaImage på angiven plats och med angiven storlek. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_15)(Image, Rectangle, int, int, int, int, GraphicsUnit) | Ritar den angivna delen av den angivnaImage på angiven plats och med angiven storlek. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_18)(Image, Rectangle, float, float, float, float, GraphicsUnit, ImageAttributes) | Ritar den angivna delen av den angivnaImage på angiven plats och med angiven storlek. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_16)(Image, Rectangle, int, int, int, int, GraphicsUnit, ImageAttributes) | Ritar den angivna delen av den angivna bilden på den angivna platsen och med den angivna storleken. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled_2)(Image, Point) | Ritar en angiven bild med dess ursprungliga fysiska storlek på en angiven plats. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled_3)(Image, Rectangle) | Ritar en angiven bild med dess ursprungliga fysiska storlek på en angiven plats. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled)(Image, int, int) | Ritar den angivna bilden med dess ursprungliga fysiska storlek på den plats som anges av ett koordinatpar. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled_1)(Image, int, int, int, int) | Ritar den angivna bilden med dess ursprungliga fysiska storlek på den plats som anges av ett koordinatpar. |
| [DrawImageUnscaledAndClipped](../../system.drawing/graphics/drawimageunscaledandclipped)(Image, Rectangle) | Ritar den angivna bilden utan skalning och klipper den vid behov så att den passar i den angivna rektangeln. |
| [DrawLine](../../system.drawing/graphics/drawline#drawline_2)(Pen, Point, Point) | Ritar en linje som förbinder tvåPoint strukturer. |
| [DrawLine](../../system.drawing/graphics/drawline#drawline_3)(Pen, PointF, PointF) | Ritar en linje som förbinder två PointF-strukturer. |
| [DrawLine](../../system.drawing/graphics/drawline#drawline_1)(Pen, float, float, float, float) | Ritar en linje som förbinder de två punkter som anges av koordinatparen. |
| [DrawLine](../../system.drawing/graphics/drawline#drawline)(Pen, int, int, int, int) | Ritar en linje som förbinder de två punkter som anges av koordinatparen. |
| [DrawLines](../../system.drawing/graphics/drawlines#drawlines)(Pen, PointF[]) | Ritar en serie linjesegment som förbinder en array avPointF strukturer. |
| [DrawLines](../../system.drawing/graphics/drawlines#drawlines_1)(Pen, Point[]) | Ritar en serie linjesegment som förbinder en array avPoint strukturer. |
| [DrawPath](../../system.drawing/graphics/drawpath)(Pen, GraphicsPath) | Ritar en grafisk sökväg. |
| [DrawPie](../../system.drawing/graphics/drawpie#drawpie_1)(Pen, RectangleF, float, float) | Ritar en cirkelform som definieras av en ellips specificerad av en RectangleF-struktur och två radiella linjer. |
| [DrawPie](../../system.drawing/graphics/drawpie#drawpie)(Pen, float, float, float, float, float, float) | Ritar en cirkelform som definieras av en ellips specificerad av ett koordinatpar, en bredd, en höjd och två radiella linjer. |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon#drawpolygon)(Pen, PointF[]) | Ritar en polygon som definieras av en array av PointF-strukturer. |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon#drawpolygon_1)(Pen, Point[]) | Ritar en polygon som definieras av en array avPoint strukturer. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle#drawrectangle_2)(Pen, Rectangle) | Ritar en rektangel specificerad av en rektangelstruktur. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle#drawrectangle_1)(Pen, float, float, float, float) | Ritar en rektangel specificerad av ett koordinatpar, en bredd och en höjd. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle#drawrectangle)(Pen, int, int, int, int) | Ritar en rektangel specificerad av ett koordinatpar, en bredd och en höjd. |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles#drawrectangles)(Pen, RectangleF[]) | Ritar en serie rektanglar specificerade avRectangleF strukturer. |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles#drawrectangles_1)(Pen, Rectangle[]) | Ritar en serie rektanglar specificerade avRectangle strukturer. |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_2)(string, Font, Brush, PointF) | Ritar den angivna textsträngen på den angivna platsen med den angivnaBrush ochFont objekt. |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_4)(string, Font, Brush, RectangleF) | Ritar den angivna textsträngen i den angivna rektangeln med den angivnaBrush ochFont objekt som använder formateringsattributen för de angivnaStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring)(string, Font, Brush, float, float) | Ritar den angivna textsträngen på den angivna platsen med den angivnaBrush ochFont objekt. |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_3)(string, Font, Brush, PointF, StringFormat) | Ritar den angivna textsträngen på den angivna platsen med den angivnaBrush och Font objekt som använder formateringsattributen för de angivnaStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_5)(string, Font, Brush, RectangleF, StringFormat) | Ritar den angivna textsträngen i den angivna rektangeln med den angivnaBrush ochFont objekt som använder formateringsattributen för de angivnaStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_1)(string, Font, Brush, float, float, StringFormat) | Ritar den angivna textsträngen på den angivna platsen med den angivnaBrush och Font objekt som använder formateringsattributen för de angivnaStringFormat . |
| [EndContainer](../../system.drawing/graphics/endcontainer)(GraphicsContainer) | Stänger den aktuella grafikbehållaren och återställer tillståndet för dennaGraphics till det tillstånd som sparats av ett samtal tillBeginContainer metod. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile)(Metafile, Point, EnumerateMetafileProc) | Skickar posterna i det angivna[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning vid en angiven punkt. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_6)(Metafile, PointF, EnumerateMetafileProc) | Skickar posterna i det angivna[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning vid en angiven punkt. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_12)(Metafile, PointF[], EnumerateMetafileProc) | Skickar posterna i det angivna[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_18)(Metafile, Point[], EnumerateMetafileProc) | Skickar posterna i det angivna[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_24)(Metafile, Rectangle, EnumerateMetafileProc) | Skickar posterna för den angivna[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_30)(Metafile, RectangleF, EnumerateMetafileProc) | Skickar posterna för den angivna[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_1)(Metafile, Point, EnumerateMetafileProc, IntPtr) | Skickar posterna i det angivna[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning vid en angiven punkt. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_7)(Metafile, PointF, EnumerateMetafileProc, IntPtr) | Skickar posterna i det angivna[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning vid en angiven punkt. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_13)(Metafile, PointF[], EnumerateMetafileProc, IntPtr) | Skickar posterna i det angivna[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_19)(Metafile, Point[], EnumerateMetafileProc, IntPtr) | Skickar posterna i det angivna[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_25)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) | Skickar posterna för den angivna[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_31)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) | Skickar posterna för den angivna[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_2)(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) | Skickar posterna i det angivna[`Metafile`](../../system.drawing.imaging/metafile) en i taget, till en återuppringningsmetod för visning vid en angiven punkt med angivna bildattribut. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_3)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) | Skickar posterna i en vald rektangel från en[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning vid en angiven punkt. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_8)(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) | Skickar posterna i det angivna[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning vid en angiven punkt med angivna bildattribut. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_9)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | Skickar posterna i en vald rektangel från en[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning vid en angiven punkt. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_14)(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) | Skickar posterna i det angivna[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram med angivna bildattribut. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_15)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) | Skickar posterna i en vald rektangel från en S[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_20)(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) | Skickar posterna i det angivna[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram med angivna bildattribut. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_21)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) | Skickar posterna i en vald rektangel från en[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_26)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) | Skickar posterna för den angivna[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel med angivna bildattribut. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_27)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) | Skickar posterna för en vald rektangel från en[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_32)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) | Skickar posterna för den angivna[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel med angivna bildattribut. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_33)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | Skickar posterna för en vald rektangel från en[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_4)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Skickar posterna i en vald rektangel från en[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning vid en angiven punkt. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_10)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Skickar posterna i en vald rektangel från en[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning vid en angiven punkt. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_16)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Skickar posterna i en vald rektangel från en[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_22)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Skickar posterna i en vald rektangel från en[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_28)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Skickar posterna för en vald rektangel från en[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_34)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Skickar posterna för en vald rektangel från en[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_5)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Skickar posterna i en vald rektangel från en[`Metafile`](../../system.drawing.imaging/metafile) en i taget, till en återuppringningsmetod för visning vid en angiven punkt med angivna bildattribut. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_11)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Skickar posterna i en vald rektangel från en[`Metafile`](../../system.drawing.imaging/metafile) en i taget, till en återuppringningsmetod för visning vid en angiven punkt med angivna bildattribut. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_17)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Skickar posterna i en vald rektangel från en[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram med angivna bildattribut. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_23)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Skickar posterna i en vald rektangel från en[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram med angivna bildattribut. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_29)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Skickar posterna för en vald rektangel från en[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel med angivna bildattribut. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_35)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Skickar posterna för en vald rektangel från en[`Metafile`](../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel med angivna bildattribut. |
| [ExcludeClip](../../system.drawing/graphics/excludeclip#excludeclip)(Rectangle) | Uppdaterar klippområdet för dettaGraphics att utesluta det område som anges av aRectangle |
| [ExcludeClip](../../system.drawing/graphics/excludeclip#excludeclip_1)(Region) | Uppdaterar klippområdet för dettaGraphics att utesluta det område som anges av aRegion . |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve)(Brush, PointF[]) | Fyller det inre av en sluten kardinalsplinekurva som definieras av en array avPointF strukturer. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_3)(Brush, Point[]) | Fyller det inre av en sluten kardinalsplinekurva som definieras av en array avPoint strukturer. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_1)(Brush, PointF[], FillMode) | Fyller det inre av en sluten kardinalsplinekurva som definieras av en array avPointF strukturer som använder det angivna fyllningsläget. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_4)(Brush, Point[], FillMode) | Fyller det inre av en sluten kardinalsplinekurva som definieras av en array avPoint strukturer som använder det angivna fyllningsläget. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_2)(Brush, PointF[], FillMode, float) | Fyller det inre av en sluten kardinalsplinekurva definierad av en rad PointF-strukturer med det angivna fyllningsläget och spänningen. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_5)(Brush, Point[], FillMode, float) | Fyller det inre av en sluten kardinalsplinekurva som definieras av en array avPoint strukturer som använder det angivna fyllningsläget. |
| [FillEllipse](../../system.drawing/graphics/fillellipse#fillellipse_1)(Brush, RectangleF) | Fyller det inre av en ellips som definieras av en avgränsande rektangel specificerad av en RectangleF-struktur. |
| [FillEllipse](../../system.drawing/graphics/fillellipse#fillellipse)(Brush, float, float, float, float) | Fyller det inre av en ellips definierad av en avgränsande rektangel specificerad av ett par koordinater, en bredd och en höjd. |
| [FillPath](../../system.drawing/graphics/fillpath)(Brush, GraphicsPath) | Fyller det inre av en GraphicsPath. |
| [FillPie](../../system.drawing/graphics/fillpie#fillpie_2)(Brush, Rectangle, float, float) | Fyller det inre av en pajsektion definierad av en ellips specificerad av en rektangelstruktur och två radiella linjer. |
| [FillPie](../../system.drawing/graphics/fillpie#fillpie_1)(Brush, float, float, float, float, float, float) | Fyller det inre av en pajsektion definierad av en ellips specificerad av ett par koordinater, en bredd, en höjd och två radiella linjer. |
| [FillPie](../../system.drawing/graphics/fillpie#fillpie)(Brush, int, int, int, int, int, int) | Fyller det inre av en pajsektion definierad av en ellips specificerad av ett par koordinater, en bredd, en höjd och två radiella linjer. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon)(Brush, PointF[]) | Fyller det inre av en polygon som definieras av en matris med punkter som specificeras avPointF strukturer. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon_2)(Brush, Point[]) | Fyller det inre av en polygon som definieras av en matris med punkter som specificeras avPoint strukturer. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon_1)(Brush, PointF[], FillMode) | Fyller det inre av en polygon som definieras av en matris med punkter specificerade av PointF-strukturer med det angivna fyllningsläget. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon_3)(Brush, Point[], FillMode) | Fyller det inre av en polygon som definieras av en matris med punkter som specificeras avPoint strukturer som använder det angivna fyllningsläget. |
| [FillRectangle](../../system.drawing/graphics/fillrectangle#fillrectangle_1)(Brush, RectangleF) | Fyller det inre av en rektangel specificerad av en RectangleF-struktur. |
| [FillRectangle](../../system.drawing/graphics/fillrectangle#fillrectangle)(Brush, float, float, float, float) | Fyller det inre av en rektangel specificerad av ett par koordinater, en bredd och en höjd. |
| [FillRectangles](../../system.drawing/graphics/fillrectangles#fillrectangles)(Brush, RectangleF[]) | Fyller det inre av en serie rektanglar som anges avRectangleF strukturer. |
| [FillRectangles](../../system.drawing/graphics/fillrectangles#fillrectangles_1)(Brush, Rectangle[]) | Fyller det inre av en serie rektanglar som anges avRectangle strukturer. |
| [FillRegion](../../system.drawing/graphics/fillregion)(Brush, Region) | Fyller det inre av en region. |
| [Flush](../../system.drawing/graphics/flush#flush)() | Framtvingar exekvering av alla pågående grafikoperationer och återvänder omedelbart utan att vänta på att operationerna ska avslutas. |
| [Flush](../../system.drawing/graphics/flush#flush_1)(FlushIntention) | Tvingar exekvering av alla pågående grafikoperationer med metoden som väntar eller inte väntar, som specificerats, för att återvända innan operationerna avslutas. |
| [GetHdc](../../system.drawing/graphics/gethdc)() | Får handtaget till enhetskontexten som är kopplad till dettaGraphics . |
| [GetNearestColor](../../system.drawing/graphics/getnearestcolor)(Color) | Får den färg som ligger närmast den angivnaColor struktur. |
| [IntersectClip](../../system.drawing/graphics/intersectclip#intersectclip)(Rectangle) | Uppdaterar klippområdet för dettaGraphics till skärningspunkten mellan det aktuella klippområdet och det angivnaRectangle struktur. |
| [IntersectClip](../../system.drawing/graphics/intersectclip#intersectclip_1)(RectangleF) | Uppdaterar klippområdet för dettaGraphics till skärningspunkten mellan det aktuella klippområdet och det angivnaRectangleF struktur. |
| [IntersectClip](../../system.drawing/graphics/intersectclip#intersectclip_2)(Region) | Uppdaterar klippområdet för dettaGraphics till skärningspunkten mellan det aktuella klippområdet och det angivnaRegion . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_4)(Point) | Indikerar om den angivnaPoint strukturen är innesluten inom det synliga klämområdet av dennaGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_5)(PointF) | Indikerar om den angivnaPointF strukturen är innesluten inom det synliga klämområdet av dennaGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_6)(Rectangle) | Indikerar om rektangeln specificerad av aRectangle strukturen är innesluten inom det synliga klämområdet av dennaGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_7)(RectangleF) | Indikerar om rektangeln specificerad av aRectangleF strukturen är innesluten inom det synliga klämområdet av dennaGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_2)(float, float) | Indikerar om punkten som anges av ett par koordinater finns inom det synliga klippområdet för dettaGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible)(int, int) | Indikerar om punkten som anges av ett par koordinater finns inom det synliga klippområdet för dettaGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_3)(float, float, float, float) | Indikerar om rektangeln som anges av ett par koordinater, en bredd och en höjd finns inom det synliga klippområdet för dettaGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_1)(int, int, int, int) | Indikerar om rektangeln som anges av ett par koordinater, en bredd och en höjd finns inom det synliga klippområdet för dettaGraphics . |
| [MeasureCharacterRanges](../../system.drawing/graphics/measurecharacterranges)(string, Font, RectangleF, StringFormat) | Får en array avRegion objekt, som vart och ett begränsar ett område av teckenpositioner inom den angivna strängen. |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring)(string, Font) | Mäter den angivna strängen när den ritas med den angivnaFont . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_1)(string, Font, int) | Mäter den angivna strängen när den ritas med den angivnaFont . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_4)(string, Font, SizeF) | Mäter den angivna strängen när den ritas med den angivnaFont . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_2)(string, Font, int, StringFormat) | Mäter den angivna strängen när den ritas med den angivnaFont och formatted med det angivnaStringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_3)(string, Font, PointF, StringFormat) | Mäter den angivna strängen när den ritas med den angivnaFont och formatted med det angivnaStringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_5)(string, Font, SizeF, StringFormat) | Mäter den angivna strängen när den ritas med den angivnaFont och formatted med det angivnaStringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_6)(string, Font, SizeF, StringFormat, out int, out int) | Mäter den angivna strängen när den ritas med den angivnaFont och formatted med det angivnaStringFormat . |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform#multiplytransform)(Matrix) | Multiplicerar världsomvandlingen av dettaGraphics och specificeradeMatrix . |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Multiplicerar världsomvandlingen av dettaGraphics och specificerade Matrix i angiven ordning. |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc#releasehdc)() | Frigör ett enhetskontexthandtag som erhållits av ett tidigare anrop till GetHdc metod för dettaGraphics . |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc#releasehdc_1)(IntPtr) | Frigör ett enhetskontexthandtag som erhållits av ett tidigare anrop tillGetHdc metod av dettaGraphics . |
| [ResetClip](../../system.drawing/graphics/resetclip)() | Återställer klippområdet för dettaGraphics till en oändlig region. |
| [ResetTransform](../../system.drawing/graphics/resettransform)() | Återställer världstransformationsmatrisen för dennaGraphics till identitetsmatrisen. |
| [Restore](../../system.drawing/graphics/restore)(GraphicsState) | Återställer tillståndet för detta[`Graphics`](../graphics) till staten representerad av a[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate) . |
| [RotateTransform](../../system.drawing/graphics/rotatetransform#rotatetransform)(float) | Tillämpar den angivna rotationen på transformationsmatrisen för dennaGraphics . |
| [RotateTransform](../../system.drawing/graphics/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Tillämpar den angivna rotationen på transformationsmatrisen för dennaGraphics i angiven ordning. |
| [Save](../../system.drawing/graphics/save)() | Sparar det aktuella tillståndet för detta[`Graphics`](../graphics) och identifierar det sparade tillståndet med a[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate) . |
| [ScaleTransform](../../system.drawing/graphics/scaletransform#scaletransform)(float, float) | Tillämpar den specificerade skalningsoperationen på transformationsmatrisen för dennaGraphics genom att prependera it till objektets transformationsmatris. |
| [ScaleTransform](../../system.drawing/graphics/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Tillämpar den specificerade skalningsoperationen på transformationsmatrisen för dennaGraphics i angiven ordning. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_2)(Graphics) | Ställer in klippområdet för detta[`Graphics`](../graphics) till egenskapen Clip för den angivna[`Graphics`](../graphics) |
| [SetClip](../../system.drawing/graphics/setclip#setclip)(GraphicsPath) | Ställer in klippområdet för detta[`Graphics`](../graphics) till det angivna[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath) . |
| [SetClip](../../system.drawing/graphics/setclip#setclip_4)(Rectangle) | Ställer in klippområdet för detta[`Graphics`](../graphics) till resultatet av den specificerade operationen som kombinerar det aktuella klippområdet och rektangeln som anges av a[`Rectangle`](../rectangle) struktur. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_6)(RectangleF) | Ställer in klippområdet för detta[`Graphics`](../graphics) till resultatet av den specificerade operationen som kombinerar det aktuella klippområdet och rektangeln som anges av a[`RectangleF`](../rectanglef) struktur. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_3)(Graphics, CombineMode) | Ställer in klippområdet för detta[`Graphics`](../graphics) till resultatet av den specificerade kombinationsoperationen för den aktuella klippregionen och Clip-egenskapen för den specificerade[`Graphics`](../graphics) . |
| [SetClip](../../system.drawing/graphics/setclip#setclip_1)(GraphicsPath, CombineMode) | Ställer in klippområdet för detta[`Graphics`](../graphics) till resultatet av den specificerade operationen som kombinerar det aktuella klippområdet och det specificerade[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath) . |
| [SetClip](../../system.drawing/graphics/setclip#setclip_5)(Rectangle, CombineMode) | Ställer in klippområdet för detta[`Graphics`](../graphics) till resultatet av den specificerade operationen som kombinerar det aktuella klippområdet och rektangeln som anges av a[`Rectangle`](../rectangle) struktur. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_7)(RectangleF, CombineMode) | Ställer in klippområdet för detta[`Graphics`](../graphics) till resultatet av den specificerade operationen som kombinerar det aktuella klippområdet och rektangeln som anges av a[`RectangleF`](../rectanglef) struktur. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_8)(Region, CombineMode) | Ställer in klippområdet för dettaGraphicstill resultatet av den specificerade operationen som kombinerar det aktuella klippområdet och det specificeradeRegion . |
| [TransformPoints](../../system.drawing/graphics/transformpoints#transformpoints)(CoordinateSpace, CoordinateSpace, PointF[]) | Transformerar en rad punkter från ett koordinatutrymme till ett annat med hjälp av den aktuella världen och sidtransformationer av dennaGraphics . |
| [TransformPoints](../../system.drawing/graphics/transformpoints#transformpoints_1)(CoordinateSpace, CoordinateSpace, Point[]) | Transformerar en rad punkter från ett koordinatutrymme till ett annat med hjälp av den aktuella världen och sidtransformationer av dennaGraphics . |
| [TranslateClip](../../system.drawing/graphics/translateclip#translateclip_1)(float, float) | Översätter klippområdet för dettaGraphics med specificerade mängder i horisontell och vertikal riktning. |
| [TranslateClip](../../system.drawing/graphics/translateclip#translateclip)(int, int) | Översätter klippområdet för dettaGraphics med specificerade mängder i horisontell och vertikal riktning. |
| [TranslateTransform](../../system.drawing/graphics/translatetransform#translatetransform)(float, float) | Ändrar ursprunget för koordinatsystemet genom att införa den specificerade translation till transformationsmatrisen för dettaGraphics . |
| [TranslateTransform](../../system.drawing/graphics/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Ändrar ursprunget för koordinatsystemet genom att tillämpa den specificerade översättningen på transformationsmatrisen av dettaGraphics i angiven ordning. |

## Andra medlemmar

| namn | Beskrivning |
| --- | --- |
| delegate [DrawImageAbort](graphics.drawimageabort) | Tillhandahåller en återuppringningsmetod för att bestämma när[`DrawImage`](./drawimage) Metoden bör avbryta körningen i förtid och sluta rita en bild. |
| delegate [EnumerateMetafileProc](graphics.enumeratemetafileproc) | Tillhandahåller en återuppringningsmetod för[`EnumerateMetafile`](./enumeratemetafile) metod. |

### Se även

* namnutrymme [System.Drawing](../../system.drawing)
* hopsättning [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
