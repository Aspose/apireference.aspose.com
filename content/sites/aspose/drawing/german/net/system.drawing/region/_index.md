---
title: Region
second_title: Aspose.Drawing für .NET-API-Referenz
description: Beschreibt das Innere einer Grafikform die aus Rechtecken und Pfaden besteht. Diese Klasse kann nicht vererbt werden.
type: docs
weight: 1060
url: /de/net/system.drawing/region/
---
## Region class

Beschreibt das Innere einer Grafikform, die aus Rechtecken und Pfaden besteht. Diese Klasse kann nicht vererbt werden.

```csharp
public sealed class Region : IDisposable
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Region](region#constructor)() | Initialisiert eine neue Instanz von[`Region`](../region) Klasse. |
| [Region](region#constructor_1)(GraphicsPath) | Initialisiert eine neue Instanz von[`Region`](../region) Klasse mit den angegebenenGraphicsPath . |
| [Region](region#constructor_3)(Rectangle) | Initialisiert eine neue Instanz von[`Region`](../region) Klasse aus der angegebenenRectangle Struktur. |
| [Region](region#constructor_4)(RectangleF) | Initialisiert eine neue Instanz von[`Region`](../region) Klasse aus der angegebenenRectangleF Struktur. |
| [Region](region#constructor_2)(RegionData) | Initialisiert eine neue Instanz von[`Region`](../region) Klasse aus den angegebenen Daten. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Clone](../../system.drawing/region/clone)() | Erstellt eine exakte Kopie davonRegion . |
| [Complement](../../system.drawing/region/complement#complement)(GraphicsPath) | aktualisiert diesRegion um den Teil des angegebenen zu enthaltenGraphicsPath das does nicht damit schneidetRegion . |
| [Complement](../../system.drawing/region/complement#complement_1)(Rectangle) | aktualisiert diesRegion um den Teil des angegebenen zu enthaltenRectangle structure , die sich nicht damit schneidetRegion . |
| [Complement](../../system.drawing/region/complement#complement_2)(RectangleF) | aktualisiert diesRegion um den Teil des angegebenen zu enthaltenRectangleF structure , die sich nicht damit schneidetRegion . |
| [Complement](../../system.drawing/region/complement#complement_3)(Region) | aktualisiert diesRegion um den Teil des angegebenen zu enthaltenRegion das schneidet sich nicht mit diesemRegion . |
| [Dispose](../../system.drawing/region/dispose)() | Gibt alle von diesem verwendeten Ressourcen freiRegion . |
| [Equals](../../system.drawing/region/equals#equals)(Region, Graphics) | Testet, ob die angegebeneRegion ist damit identischRegion auf der angegebenen Zeichenfläche. |
| [Exclude](../../system.drawing/region/exclude#exclude)(GraphicsPath) | aktualisiert diesRegion um nur den Teil seines Inneren zu enthalten, der sich nicht mit dem angegebenen schneidetGraphicsPath . |
| [Exclude](../../system.drawing/region/exclude#exclude_1)(Rectangle) | aktualisiert diesRegion um nur den Teil seines Inneren zu enthalten, der sich nicht mit dem angegebenen schneidet Rectangle Struktur. |
| [Exclude](../../system.drawing/region/exclude#exclude_2)(RectangleF) | aktualisiert diesRegion um nur den Teil seines Inneren zu enthalten, der sich nicht mit dem angegebenen schneidetRectangleF Struktur. |
| [Exclude](../../system.drawing/region/exclude#exclude_3)(Region) | aktualisiert diesRegion um nur den Teil seines Inneren zu enthalten, der sich nicht mit dem angegebenen schneidet Region . |
| [GetBounds](../../system.drawing/region/getbounds)(Graphics) | erhält aRectangleFStruktur, die ein Rechteck darstellt, das diese begrenztRegion auf der Zeichenfläche von aGraphics Objekt. |
| [GetRegionData](../../system.drawing/region/getregiondata)() | Gibt a zurückRegionData das stellt die Informationen dar, die dies beschreibenRegion . |
| [GetRegionScans](../../system.drawing/region/getregionscans)(Matrix) | Gibt ein Array von zurückRectangleF Strukturen, die sich dem annähernRegion nachdem die angegebene Matrixtransformation angewendet wurde. |
| [Intersect](../../system.drawing/region/intersect#intersect)(GraphicsPath) | aktualisiert diesRegion zum Schnittpunkt von sich selbst mit dem angegebenenGraphicsPath . |
| [Intersect](../../system.drawing/region/intersect#intersect_1)(Rectangle) | aktualisiert diesRegion zum Schnittpunkt von sich selbst mit dem angegebenenRectangle Struktur. |
| [Intersect](../../system.drawing/region/intersect#intersect_2)(RectangleF) | aktualisiert diesRegion zum Schnittpunkt von sich selbst mit dem angegebenen RectangleF Struktur. |
| [Intersect](../../system.drawing/region/intersect#intersect_3)(Region) | aktualisiert diesRegion zum Schnittpunkt von sich selbst mit dem angegebenenRegion . |
| [IsEmpty](../../system.drawing/region/isempty)(Graphics) | Testet ob diesRegion hat einen leeren Innenraum auf der angegebenen Zeichenfläche. |
| [IsInfinite](../../system.drawing/region/isinfinite)(Graphics) | Testet ob diesRegion hat einen unendlichen Innenraum auf der angegebenen Zeichenfläche. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_7)(Point) | Testet, ob die angegebenePoint Struktur ist darin enthaltenRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_9)(PointF) | Testet, ob die angegebenePointF Struktur ist darin enthaltenRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_11)(Rectangle) | Testet, ob irgendein Teil der angegebenenRectangle Struktur ist in this enthaltenRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_13)(RectangleF) | Testet, ob irgendein Teil der angegebenenRectangleF Struktur ist in this enthaltenRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_3)(float, float) | Prüft, ob der angegebene Punkt darin enthalten istRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_8)(Point, Graphics) | Testet, ob die angegebenePoint Struktur ist darin enthaltenRegion beim Zeichnen mit den angegebenenGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_10)(PointF, Graphics) | Testet, ob die angegebenePointF Struktur ist darin enthaltenRegion beim Zeichnen mit den angegebenenGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_12)(Rectangle, Graphics) | Testet, ob irgendein Teil der angegebenenRectangle Struktur ist in this enthaltenRegion wenn gezogen mit den angegebenenGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_14)(RectangleF, Graphics) | Testet, ob irgendein Teil der angegebenenRectangleF Struktur ist in this enthaltenRegion wenn gezogen mit den angegebenenGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_6)(float, float, Graphics) | Prüft, ob der angegebene Punkt darin enthalten istRegion wenn gezeichnet using die angegebenenGraphics. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_2)(int, int, Graphics) | Prüft, ob der angegebene Punkt darin enthalten istRegion Objekt beim Zeichnen mit dem angegebenenGraphics Objekt. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_4)(float, float, float, float) | Testet, ob ein Teil des angegebenen Rechtecks darin enthalten istRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible)(int, int, int, int) | Testet, ob ein Teil des angegebenen Rechtecks darin enthalten istRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_5)(float, float, float, float, Graphics) | Testet, ob ein Teil des angegebenen Rechtecks darin enthalten istRegion beim Zeichnen mit den angegebenenGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_1)(int, int, int, int, Graphics) | Testet, ob ein Teil des angegebenen Rechtecks darin enthalten istRegion wenn draw mit den angegebenenGraphics . |
| [MakeEmpty](../../system.drawing/region/makeempty)() | Initialisiert diesRegion zu einem leeren Innenraum. |
| [MakeInfinite](../../system.drawing/region/makeinfinite)() | Initialisiert diesRegion Objekt zu einem unendlichen Inneren. |
| [Transform](../../system.drawing/region/transform)(Matrix) | Transformiert diesRegion durch die angegebenenMatrix . |
| [Translate](../../system.drawing/region/translate#translate_1)(float, float) | Versetzt die Koordinaten davonRegion um den angegebenen Betrag. |
| [Translate](../../system.drawing/region/translate#translate)(int, int) | Versetzt die Koordinaten davonRegion um den angegebenen Betrag. |
| [Union](../../system.drawing/region/union#union)(GraphicsPath) | aktualisiert diesRegion zur Vereinigung von sich selbst und dem SpezifiziertenGraphicsPath . |
| [Union](../../system.drawing/region/union#union_1)(Rectangle) | aktualisiert diesRegion zur Vereinigung von sich selbst und dem SpezifiziertenRectangle Struktur. |
| [Union](../../system.drawing/region/union#union_2)(RectangleF) | aktualisiert diesRegion zur Vereinigung von sich selbst und dem SpezifiziertenRectangleF Struktur. |
| [Union](../../system.drawing/region/union#union_3)(Region) | aktualisiert diesRegion zur Vereinigung von sich selbst und dem SpezifiziertenRegion . |
| [Xor](../../system.drawing/region/xor#xor)(GraphicsPath) | aktualisiert diesRegionzur Vereinigung minus der Schnittmenge von sich selbst mit dem angegebenen GraphicsPath . |
| [Xor](../../system.drawing/region/xor#xor_1)(Rectangle) | aktualisiert diesRegionzur Vereinigung minus der Schnittmenge von sich selbst mit dem angegebenen Rectangle Struktur. |
| [Xor](../../system.drawing/region/xor#xor_2)(RectangleF) | aktualisiert diesRegion zur Vereinigung minus der Schnittmenge von sich selbst mit dem angegebenenRectangleF Struktur. |
| [Xor](../../system.drawing/region/xor#xor_3)(Region) | aktualisiert diesRegionzur Vereinigung minus der Schnittmenge von sich selbst mit dem angegebenen Region . |

### Siehe auch

* namensraum [System.Drawing](../../system.drawing)
* Montage [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
