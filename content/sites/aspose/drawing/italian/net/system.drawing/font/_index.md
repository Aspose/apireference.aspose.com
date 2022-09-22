---
title: Font
second_title: Aspose.Drawing per .NET API Reference
description: Definisce un formato particolare per il testo inclusi il carattere le dimensioni e gli attributi di stile. Questa classe non può essere ereditata.
type: docs
weight: 500
url: /it/net/system.drawing/font/
---
## Font class

Definisce un formato particolare per il testo, inclusi il carattere, le dimensioni e gli attributi di stile. Questa classe non può essere ereditata.

```csharp
public sealed class Font : IDisposable
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Font](font#constructor)(Font, FontStyle) | Inizializza una nuova istanza di[`Font`](../font) la classe utilizza l'esistente specificatoFont eFontStyle enumerazione.. |
| [Font](font#constructor_1)(FontFamily, float) | Inizializza una nuova istanza di[`Font`](../font) classe. |
| [Font](font#constructor_7)(string, float) | Inizializza una nuova istanza di[`Font`](../font) classe utilizzando una dimensione specificata. |
| [Font](font#constructor_2)(FontFamily, float, FontStyle) | Inizializza una nuova istanza di[`Font`](../font) classe utilizzando una dimensione e uno stile specificati.. |
| [Font](font#constructor_6)(FontFamily, float, GraphicsUnit) | Inizializza una nuova istanza di[`Font`](../font) classe utilizzando una dimensione e un'unità specificate. Imposta lo stile suRegular . |
| [Font](font#constructor_8)(string, float, FontStyle) | Inizializza una nuova istanza di[`Font`](../font) classe utilizzando una dimensione e uno stile specificati. |
| [Font](font#constructor_12)(string, float, GraphicsUnit) | Inizializza una nuova istanza di[`Font`](../font) classe utilizzando una dimensione e un'unità specificate. Lo stile è impostato suRegular . |
| [Font](font#constructor_3)(FontFamily, float, FontStyle, GraphicsUnit) | Inizializza una nuova istanza di[`Font`](../font) classe utilizzando una dimensione, uno stile e un'unità specificati. |
| [Font](font#constructor_9)(string, float, FontStyle, GraphicsUnit) | Inizializza una nuova istanza di[`Font`](../font) classe utilizzando una dimensione, uno stile e un'unità specificati. |
| [Font](font#constructor_4)(FontFamily, float, FontStyle, GraphicsUnit, byte) | Inizializza una nuova istanza di[`Font`](../font) classe utilizzando una dimensione, uno stile, un'unità e un set di caratteri specificati.. |
| [Font](font#constructor_10)(string, float, FontStyle, GraphicsUnit, byte) | Inizializza una nuova istanza di[`Font`](../font)classe utilizzando una dimensione, uno stile, un'unità e un set di caratteri specificati. |
| [Font](font#constructor_5)(FontFamily, float, FontStyle, GraphicsUnit, byte, bool) | Inizializza una nuova istanza di[`Font`](../font) classe utilizzando una dimensione, uno stile, un'unità e un set di caratteri specificati.. |
| [Font](font#constructor_11)(string, float, FontStyle, GraphicsUnit, byte, bool) | Inizializza una nuova istanza di[`Font`](../font) classe utilizzando la dimensione, lo stile, l'unità e il set di caratteri specificati. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Bold](../../system.drawing/font/bold) { get; } | Ottiene un valore che indica se questoFont è in grassetto. |
| [FontFamily](../../system.drawing/font/fontfamily) { get; } | Ottiene ilFontFamily associato a questoFont . |
| [GdiCharSet](../../system.drawing/font/gdicharset) { get; } | Ottiene un valore byte che specifica il set di caratteri GDI che questoFont utilizza. |
| [GdiVerticalFont](../../system.drawing/font/gdiverticalfont) { get; } | Ottiene un valore che indica se questoFont è derivato da un carattere verticale GDI.. |
| [Height](../../system.drawing/font/height) { get; } | Ottiene l'interlinea di questo font. |
| [IsSystemFont](../../system.drawing/font/issystemfont) { get; } | Ottiene un valore che indica se il tipo di carattere è un membro diSystemFonts . |
| [Italic](../../system.drawing/font/italic) { get; } | Ottiene un valore che indica se questoFont è in corsivo. |
| [Name](../../system.drawing/font/name) { get; } | Ottiene il nome del volto di questoFont . |
| [OriginalFontName](../../system.drawing/font/originalfontname) { get; } | Ottiene il nome del font originariamente specificato. |
| [Size](../../system.drawing/font/size) { get; } | Ottiene la dimensione em di questoFont misurato nelle unità specificate da Unit proprietà. |
| [SizeInPoints](../../system.drawing/font/sizeinpoints) { get; } | Ottiene la dimensione em, in punti, di questoFont . |
| [Strikeout](../../system.drawing/font/strikeout) { get; } | Ottiene un valore che indica se questoFont specifica una linea orizzontale attraverso il font. |
| [Style](../../system.drawing/font/style) { get; } | Ottiene informazioni sullo stile per questoFont . |
| [SystemFontName](../../system.drawing/font/systemfontname) { get; } | Ottiene il nome del carattere di sistema se la proprietà IsSystemFont restituisce true. |
| [Underline](../../system.drawing/font/underline) { get; } | Ottiene un valore che indica se questoFont è sottolineato. |
| [Unit](../../system.drawing/font/unit) { get; } | Ottiene l'unità di misura per questoFont . |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Clone](../../system.drawing/font/clone)() | Crea una copia esatta di questoFont . |
| [Dispose](../../system.drawing/font/dispose)() | Rilascia tutte le risorse utilizzate da questoFont . |
| override [Equals](../../system.drawing/font/equals)(object) | Indica se l'oggetto specificato è aFont e ha lo stessoFontFamily , GdiVerticalFont ,GdiCharSet ,Style ,Size , eUnit valori di proprietà come questoFont . |
| override [GetHashCode](../../system.drawing/font/gethashcode)() | Ottiene il codice hash per questoFont . |
| [GetHeight](../../system.drawing/font/getheight#getheight)() | Restituisce l'interlinea, in pixel, di questo font. |
| [GetHeight](../../system.drawing/font/getheight#getheight_1)(float) | Restituisce l'altezza, in pixel, di questoFontquando viene attirato su un dispositivo con la risoluzione verticale specificata. |
| [GetHeight](../../system.drawing/font/getheight#getheight_2)(Graphics) | Restituisce l'interlinea, nell'unità corrente di un oggetto specificatoGraphics , di questo tipo di carattere. |
| override [ToString](../../system.drawing/font/tostring)() | Restituisce una rappresentazione di stringa leggibile dall'uomo di questoFont . |

### Guarda anche

* spazio dei nomi [System.Drawing](../../system.drawing)
* assemblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
