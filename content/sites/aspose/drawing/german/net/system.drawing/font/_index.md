---
title: Font
second_title: Aspose.Drawing für .NET-API-Referenz
description: Definiert ein bestimmtes Format für Text einschließlich Schriftart Größe und Stilattributen. Diese Klasse kann nicht vererbt werden.
type: docs
weight: 500
url: /de/net/system.drawing/font/
---
## Font class

Definiert ein bestimmtes Format für Text, einschließlich Schriftart, Größe und Stilattributen. Diese Klasse kann nicht vererbt werden.

```csharp
public sealed class Font : IDisposable
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Font](font#constructor)(Font, FontStyle) | Initialisiert eine neue Instanz von[`Font`](../font) Klasse verwendet die angegebene vorhandeneFont undFontStyle Aufzählung.. |
| [Font](font#constructor_1)(FontFamily, float) | Initialisiert eine neue Instanz von[`Font`](../font) Klasse. |
| [Font](font#constructor_7)(string, float) | Initialisiert eine neue Instanz von[`Font`](../font) Klasse mit einer bestimmten Größe. |
| [Font](font#constructor_2)(FontFamily, float, FontStyle) | Initialisiert eine neue Instanz von[`Font`](../font) Klasse mit einer bestimmten Größe und einem bestimmten Stil.. |
| [Font](font#constructor_6)(FontFamily, float, GraphicsUnit) | Initialisiert eine neue Instanz von[`Font`](../font) Klasse mit einer bestimmten Größe und Einheit. Setzt den Stil aufRegular . |
| [Font](font#constructor_8)(string, float, FontStyle) | Initialisiert eine neue Instanz von[`Font`](../font) Klasse mit einer bestimmten Größe und einem bestimmten Stil. |
| [Font](font#constructor_12)(string, float, GraphicsUnit) | Initialisiert eine neue Instanz von[`Font`](../font) Klasse mit einer bestimmten Größe und Einheit. Der Stil ist eingestellt aufRegular . |
| [Font](font#constructor_3)(FontFamily, float, FontStyle, GraphicsUnit) | Initialisiert eine neue Instanz von[`Font`](../font) Klasse mit einer bestimmten Größe, einem Stil und einer Einheit. |
| [Font](font#constructor_9)(string, float, FontStyle, GraphicsUnit) | Initialisiert eine neue Instanz von[`Font`](../font) Klasse mit einer bestimmten Größe, einem Stil und einer Einheit. |
| [Font](font#constructor_4)(FontFamily, float, FontStyle, GraphicsUnit, byte) | Initialisiert eine neue Instanz von[`Font`](../font) Klasse mit einer bestimmten Größe, einem Stil, einer Einheit und einem Zeichensatz.. |
| [Font](font#constructor_10)(string, float, FontStyle, GraphicsUnit, byte) | Initialisiert eine neue Instanz von[`Font`](../font)Klasse mit einer bestimmten Größe, einem Stil, einer Einheit und einem Zeichensatz. |
| [Font](font#constructor_5)(FontFamily, float, FontStyle, GraphicsUnit, byte, bool) | Initialisiert eine neue Instanz von[`Font`](../font) Klasse mit einer bestimmten Größe, einem Stil, einer Einheit und einem Zeichensatz.. |
| [Font](font#constructor_11)(string, float, FontStyle, GraphicsUnit, byte, bool) | Initialisiert eine neue Instanz von[`Font`](../font) Klasse, die die angegebene Größe, den Stil, die Einheit und den Zeichensatz verwendet. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Bold](../../system.drawing/font/bold) { get; } | Ruft einen Wert ab, der angibt, ob diesFont ist fett. |
| [FontFamily](../../system.drawing/font/fontfamily) { get; } | Ruft die abFontFamily damit verbundenFont . |
| [GdiCharSet](../../system.drawing/font/gdicharset) { get; } | Ruft einen Bytewert ab, der den GDI-Zeichensatz angibt, den thisFont verwendet. |
| [GdiVerticalFont](../../system.drawing/font/gdiverticalfont) { get; } | Ruft einen Wert ab, der angibt, ob diesFont wird von einer vertikalen GDI-Schriftart abgeleitet.. |
| [Height](../../system.drawing/font/height) { get; } | Ruft den Zeilenabstand dieser Schriftart ab. |
| [IsSystemFont](../../system.drawing/font/issystemfont) { get; } | Ruft einen Wert ab, der angibt, ob die Schriftart Mitglied von istSystemFonts . |
| [Italic](../../system.drawing/font/italic) { get; } | Ruft einen Wert ab, der angibt, ob diesFont ist kursiv. |
| [Name](../../system.drawing/font/name) { get; } | Ruft den Gesichtsnamen davon abFont . |
| [OriginalFontName](../../system.drawing/font/originalfontname) { get; } | Ruft den Namen der ursprünglich angegebenen Schriftart ab. |
| [Size](../../system.drawing/font/size) { get; } | Ruft die em-Größe davon abFont gemessen in den von the angegebenen EinheitenUnit Eigentum. |
| [SizeInPoints](../../system.drawing/font/sizeinpoints) { get; } | Ruft die Em-Größe davon in Punkten abFont . |
| [Strikeout](../../system.drawing/font/strikeout) { get; } | Ruft einen Wert ab, der angibt, ob diesFont gibt eine horizontale Linie durch die Schriftart an. |
| [Style](../../system.drawing/font/style) { get; } | Ruft Stilinformationen dafür abFont . |
| [SystemFontName](../../system.drawing/font/systemfontname) { get; } | Ruft den Namen der Systemschriftart ab, wenn die Eigenschaft IsSystemFont true zurückgibt. |
| [Underline](../../system.drawing/font/underline) { get; } | Ruft einen Wert ab, der angibt, ob diesFont ist unterstrichen. |
| [Unit](../../system.drawing/font/unit) { get; } | Liefert die Maßeinheit dafürFont . |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Clone](../../system.drawing/font/clone)() | Erstellt eine exakte Kopie davonFont . |
| [Dispose](../../system.drawing/font/dispose)() | Gibt alle von diesem verwendeten Ressourcen freiFont . |
| override [Equals](../../system.drawing/font/equals)(object) | Gibt an, ob das angegebene Objekt ein istFont und hat das gleicheFontFamily , GdiVerticalFont ,GdiCharSet ,Style ,Size , undUnit Eigenschaftswerte wie dieseFont . |
| override [GetHashCode](../../system.drawing/font/gethashcode)() | Ruft den Hash-Code dafür abFont . |
| [GetHeight](../../system.drawing/font/getheight#getheight)() | Gibt den Zeilenabstand dieser Schriftart in Pixel zurück. |
| [GetHeight](../../system.drawing/font/getheight#getheight_1)(float) | Gibt die Höhe davon in Pixel zurückFontwenn es zu einem Gerät mit der angegebenen vertikalen Auflösung gezogen wird. |
| [GetHeight](../../system.drawing/font/getheight#getheight_2)(Graphics) | Gibt den Zeilenabstand in der aktuellen Einheit eines angegebenen zurückGraphics , dieser Schriftart. |
| override [ToString](../../system.drawing/font/tostring)() | Gibt eine für Menschen lesbare Zeichenfolgendarstellung davon zurückFont . |

### Siehe auch

* namensraum [System.Drawing](../../system.drawing)
* Montage [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
