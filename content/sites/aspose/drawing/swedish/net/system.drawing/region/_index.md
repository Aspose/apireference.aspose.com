---
title: Region
second_title: Aspose.Drawing för .NET API Referens
description: Beskriver det inre av en grafisk form som består av rektanglar och banor. Denna klass kan inte ärvas.
type: docs
weight: 1060
url: /sv/net/system.drawing/region/
---
## Region class

Beskriver det inre av en grafisk form som består av rektanglar och banor. Denna klass kan inte ärvas.

```csharp
public sealed class Region : IDisposable
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Region](region#constructor)() | Initierar en ny instans av[`Region`](../region) class. |
| [Region](region#constructor_1)(GraphicsPath) | Initierar en ny instans av[`Region`](../region) klass med den angivnaGraphicsPath . |
| [Region](region#constructor_3)(Rectangle) | Initierar en ny instans av[`Region`](../region) klass från den angivnaRectangle struktur. |
| [Region](region#constructor_4)(RectangleF) | Initierar en ny instans av[`Region`](../region) klass från den angivnaRectangleF struktur. |
| [Region](region#constructor_2)(RegionData) | Initierar en ny instans av[`Region`](../region) klass från de angivna data. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Clone](../../system.drawing/region/clone)() | Skapar en exakt kopia av dettaRegion . |
| [Complement](../../system.drawing/region/complement#complement)(GraphicsPath) | Uppdaterar dettaRegion att innehålla den del av det angivnaGraphicsPath som inte korsar dettaRegion . |
| [Complement](../../system.drawing/region/complement#complement_1)(Rectangle) | Uppdaterar dettaRegion att innehålla den del av det angivnaRectangle structure som inte korsar dettaRegion . |
| [Complement](../../system.drawing/region/complement#complement_2)(RectangleF) | Uppdaterar dettaRegion att innehålla den del av det angivnaRectangleF structure som inte korsar dettaRegion . |
| [Complement](../../system.drawing/region/complement#complement_3)(Region) | Uppdaterar dettaRegion att innehålla den del av det angivnaRegion som inte skär med dettaRegion . |
| [Dispose](../../system.drawing/region/dispose)() | Frigör alla resurser som används av dettaRegion . |
| [Equals](../../system.drawing/region/equals#equals)(Region, Graphics) | Testar om den angivnaRegion är identisk med dettaRegion på den angivna ritytan. |
| [Exclude](../../system.drawing/region/exclude#exclude)(GraphicsPath) | Uppdaterar dettaRegion för att endast innehålla den del av dess inre som inte skär den angivna GraphicsPath . |
| [Exclude](../../system.drawing/region/exclude#exclude_1)(Rectangle) | Uppdaterar dettaRegion att endast innehålla den del av dess inre som inte skär med den angivnaRectangle struktur. |
| [Exclude](../../system.drawing/region/exclude#exclude_2)(RectangleF) | Uppdaterar dettaRegion för att endast innehålla den del av dess inre som inte skär den angivna RectangleF struktur. |
| [Exclude](../../system.drawing/region/exclude#exclude_3)(Region) | Uppdaterar dettaRegion att endast innehålla den del av dess inre som inte skär med den angivnaRegion . |
| [GetBounds](../../system.drawing/region/getbounds)(Graphics) | Får enRectangleFstruktur som representerar en rektangel som begränsar dettaRegion på ritytan av enGraphics objekt. |
| [GetRegionData](../../system.drawing/region/getregiondata)() | Returnerar enRegionData som representerar informationen som beskriver dettaRegion . |
| [GetRegionScans](../../system.drawing/region/getregionscans)(Matrix) | Returnerar en matris medRectangleF strukturer som närmar sig dettaRegion efter att den angivna matristransformationen har tillämpats. |
| [Intersect](../../system.drawing/region/intersect#intersect)(GraphicsPath) | Uppdaterar dettaRegion till skärningspunkten av sig själv med det angivnaGraphicsPath . |
| [Intersect](../../system.drawing/region/intersect#intersect_1)(Rectangle) | Uppdaterar dettaRegion till skärningspunkten av sig själv med det angivnaRectangle struktur. |
| [Intersect](../../system.drawing/region/intersect#intersect_2)(RectangleF) | Uppdaterar dettaRegion till skärningspunkten mellan sig själv med specificerad RectangleF struktur. |
| [Intersect](../../system.drawing/region/intersect#intersect_3)(Region) | Uppdaterar dettaRegion till skärningspunkten av sig själv med det angivnaRegion . |
| [IsEmpty](../../system.drawing/region/isempty)(Graphics) | Testar om dettaRegion har en tom interiör på den angivna ritytan. |
| [IsInfinite](../../system.drawing/region/isinfinite)(Graphics) | Testar om dettaRegion har en oändlig interiör på den angivna ritytan. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_7)(Point) | Testar om den angivnaPoint strukturen finns i dettaRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_9)(PointF) | Testar om den angivnaPointF strukturen finns i dettaRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_11)(Rectangle) | Testar om någon del av det angivnaRectangle strukturen finns i this Region . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_13)(RectangleF) | Testar om någon del av det angivnaRectangleF strukturen finns inom dettaRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_3)(float, float) | Testar om den angivna punkten finns i dennaRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_8)(Point, Graphics) | Testar om den angivnaPoint strukturen finns i dettaRegion när den ritas med den angivnaGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_10)(PointF, Graphics) | Testar om den angivnaPointF strukturen finns i dettaRegion när den ritas med den angivnaGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_12)(Rectangle, Graphics) | Testar om någon del av det angivnaRectangle strukturen finns inom dettaRegion när den ritas med det angivnaGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_14)(RectangleF, Graphics) | Testar om någon del av det angivnaRectangleF strukturen finns inom dettaRegion när den ritas med det angivnaGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_6)(float, float, Graphics) | Testar om den angivna punkten finns i dennaRegion när den ritas med den angivnaGraphics. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_2)(int, int, Graphics) | Testar om den angivna punkten finns i dennaRegion objekt när det ritas med det angivnaGraphics objekt. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_4)(float, float, float, float) | Testar om någon del av den angivna rektangeln finns i dennaRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible)(int, int, int, int) | Testar om någon del av den angivna rektangeln finns i dennaRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_5)(float, float, float, float, Graphics) | Testar om någon del av den angivna rektangeln finns i dennaRegion när den ritas med den angivnaGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_1)(int, int, int, int, Graphics) | Testar om någon del av den angivna rektangeln finns i dennaRegion när drawn använder den angivnaGraphics . |
| [MakeEmpty](../../system.drawing/region/makeempty)() | Initierar dettaRegion till en tom interiör. |
| [MakeInfinite](../../system.drawing/region/makeinfinite)() | Initierar dettaRegion invända mot en oändlig interiör. |
| [Transform](../../system.drawing/region/transform)(Matrix) | Förvandlar dettaRegion av den angivnaMatrix . |
| [Translate](../../system.drawing/region/translate#translate_1)(float, float) | Förskjuter koordinaterna för dettaRegion med det angivna beloppet. |
| [Translate](../../system.drawing/region/translate#translate)(int, int) | Förskjuter koordinaterna för dettaRegion med det angivna beloppet. |
| [Union](../../system.drawing/region/union#union)(GraphicsPath) | Uppdaterar dettaRegion till föreningen av sig själv och det specificeradeGraphicsPath . |
| [Union](../../system.drawing/region/union#union_1)(Rectangle) | Uppdaterar dettaRegion till föreningen av sig själv och det specificeradeRectangle struktur. |
| [Union](../../system.drawing/region/union#union_2)(RectangleF) | Uppdaterar dettaRegion till föreningen av sig själv och det specificeradeRectangleF struktur. |
| [Union](../../system.drawing/region/union#union_3)(Region) | Uppdaterar dettaRegion till föreningen av sig själv och det specificeradeRegion . |
| [Xor](../../system.drawing/region/xor#xor)(GraphicsPath) | Uppdaterar dettaRegiontill facket minus skärningspunkten för sig själv med den angivna GraphicsPath . |
| [Xor](../../system.drawing/region/xor#xor_1)(Rectangle) | Uppdaterar dettaRegiontill facket minus skärningspunkten för sig själv med den angivna Rectangle struktur. |
| [Xor](../../system.drawing/region/xor#xor_2)(RectangleF) | Uppdaterar dettaRegion till facket minus skärningspunkten för sig själv med den angivnaRectangleF struktur. |
| [Xor](../../system.drawing/region/xor#xor_3)(Region) | Uppdaterar dettaRegiontill facket minus skärningspunkten för sig själv med den angivna Region . |

### Se även

* namnutrymme [System.Drawing](../../system.drawing)
* hopsättning [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
