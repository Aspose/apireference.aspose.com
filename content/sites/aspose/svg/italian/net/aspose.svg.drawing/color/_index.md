---
title: Class Color
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.Drawing.Color classe. La classe Color consente di specificare i colori come valori RedGreenBlue RGB valori HueSaturationLuminosity HSL valori HueSaturationValue HSV HueWhitenessBlackness HWB  valori valori lightnessAB LAB valori LuminanceChromaHue LCH valori CyanMagentaYellowKey CMYK valori Natural colors NCOL o con un nome di colore . È disponibile anche un canale alfa per indicare la trasparenza.
type: docs
weight: 1390
url: /it/net/aspose.svg.drawing/color/
---
## Color class

La classe Color consente di specificare i colori come valori Red-Green-Blue (RGB), valori Hue-Saturation-Luminosity (HSL), valori Hue-Saturation-Value (HSV), Hue-Whiteness-Blackness (HWB ) valori, valori lightness-AB (LAB), valori Luminance-Chroma-Hue (LCH), valori Cyan-Magenta-Yellow-Key (CMYK), valori Natural colors (NCOL), o con un nome di colore . È disponibile anche un canale alfa per indicare la trasparenza.

```csharp
public class Color
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Color](color/#constructor)() | Inizializza una nuova istanza di`Color` class. Per impostazione predefinita il colore è nero. |
| [Color](color/#constructor_1)(byte, byte, byte) | Inizializza una nuova istanza di`Color`class. Tutti i componenti di colore devono essere compresi nell'intervallo 0-255. |
| [Color](color/#constructor_5)(float, float, float) | Inizializza una nuova istanza di`Color` class. Tutti i componenti di colore devono essere compresi nell'intervallo 0-1. |
| [Color](color/#constructor_3)(int, int, int) | Inizializza una nuova istanza di`Color`class. Tutti i componenti di colore devono essere compresi nell'intervallo 0-255. |
| [Color](color/#constructor_2)(byte, byte, byte, byte) | Inizializza una nuova istanza di`Color`class. Tutti i componenti di colore devono essere compresi nell'intervallo 0-255. |
| [Color](color/#constructor_6)(float, float, float, float) | Inizializza una nuova istanza di`Color` class. Tutti i componenti di colore devono essere compresi nell'intervallo 0-1. |
| [Color](color/#constructor_4)(int, int, int, int) | Inizializza una nuova istanza di`Color`class. Tutti i componenti di colore devono essere compresi nell'intervallo 0-255. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Alpha](../../aspose.svg.drawing/color/alpha/) { get; } | Rappresenta la componente alfa del colore. |
| [Blue](../../aspose.svg.drawing/color/blue/) { get; } | Rappresenta la componente blu del colore. |
| [Green](../../aspose.svg.drawing/color/green/) { get; } | Rappresenta la componente verde del colore. |
| [Red](../../aspose.svg.drawing/color/red/) { get; } | Rappresenta la componente rossa del colore |

## Metodi

| Nome | Descrizione |
| --- | --- |
| static [FromCmyk](../../aspose.svg.drawing/color/fromcmyk/)(float, float, float, float) | Restituisce un nuovo Colore con i valori richiesti di ciano, magenta, giallo, chiave (nero). |
| static [FromCmyka](../../aspose.svg.drawing/color/fromcmyka/)(float, float, float, float, float) | Restituisce un nuovo Colore con i valori richiesti di ciano, magenta, giallo, chiave (nero), alfa. |
| static [FromGray](../../aspose.svg.drawing/color/fromgray/)(float) | Restituisce un nuovo Colore con il valore di grigio richiesto. |
| static [FromHsl](../../aspose.svg.drawing/color/fromhsl/)(float, float, float) | Restituisce un nuovo Colore con i valori di tonalità, saturazione e saturazione richiesti. |
| static [FromHsla](../../aspose.svg.drawing/color/fromhsla/)(float, float, float, float) | Restituisce un nuovo colore con i valori di tonalità, saturazione, saturazione e alfa richiesti. |
| static [FromHsv](../../aspose.svg.drawing/color/fromhsv/)(float, float, float) | Restituisce un nuovo colore con la tonalità, la saturazione e il valore richiesti. |
| static [FromHsva](../../aspose.svg.drawing/color/fromhsva/)(float, float, float, float) | Restituisce un nuovo colore con la tonalità, la saturazione, il valore, l'alfa richiesti. |
| static [FromHwb](../../aspose.svg.drawing/color/fromhwb/)(float, float, float) | Restituisce un nuovo Colore con i valori richiesti di tonalità, bianco e nero. |
| static [FromHwba](../../aspose.svg.drawing/color/fromhwba/)(float, float, float, float) | Restituisce un nuovo Colore con i valori richiesti di tonalità, bianco e nero. |
| static [FromInt](../../aspose.svg.drawing/color/fromint/)(int) | Restituisce un nuovo colore con il valore ARGB richiesto. |
| static [FromLab](../../aspose.svg.drawing/color/fromlab/)(float, float, float) | Restituisce un nuovo Colore con la luminosità richiesta, i valori A, B. |
| static [FromLaba](../../aspose.svg.drawing/color/fromlaba/)(float, float, float, float) | Restituisce un nuovo Colore con i valori richiesti di luminosità, A, B, alfa. |
| static [FromLch](../../aspose.svg.drawing/color/fromlch/)(float, float, float) | Restituisce un nuovo Colore con i valori di luminanza, crominanza e tonalità richiesti. |
| static [FromLcha](../../aspose.svg.drawing/color/fromlcha/)(float, float, float, float) | Restituisce un nuovo Colore con i valori di luminanza, crominanza, tonalità e alfa richiesti. |
| static [FromOklab](../../aspose.svg.drawing/color/fromoklab/)(float, float, float) | Restituisce un nuovo Colore con la luminosità richiesta, i valori A, B per il modello OKLAB. |
| static [FromOklaba](../../aspose.svg.drawing/color/fromoklaba/)(float, float, float, float) | Restituisce un nuovo Colore con i valori richiesti di luminosità, A, B, alfa per il modello OKLAB. |
| static [FromOklch](../../aspose.svg.drawing/color/fromoklch/)(float, float, float) | Restituisce un nuovo colore con i valori richiesti di luminanza, crominanza e tonalità per il modello OKLAB. |
| static [FromOklcha](../../aspose.svg.drawing/color/fromoklcha/)(float, float, float, float) | Restituisce un nuovo colore con i valori di luminanza, crominanza, tonalità e alfa richiesti per il modello OKLAB. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb/#fromrgb)(byte, byte, byte) | Restituisce un nuovo Color con i valori ged, green, blue richiesti. Tutti i componenti del colore devono essere compresi nell'intervallo 0-255. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb/#fromrgb_2)(float, float, float) | Restituisce un nuovo Color con i valori ged, green, blue richiesti. Tutti i componenti del colore devono essere compresi nell'intervallo 0-1. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb/#fromrgb_1)(int, int, int) | Restituisce un nuovo Color con i valori ged, green, blue richiesti. Tutti i componenti del colore devono essere compresi nell'intervallo 0-255. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba/#fromrgba)(byte, byte, byte, byte) | Restituisce un nuovo Color con i valori ged, green, blue, alpha richiesti. Tutti i componenti del colore devono essere compresi nell'intervallo 0-255. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba/#fromrgba_2)(float, float, float, float) | Restituisce un nuovo Color con i valori ged, green, blue, alpha richiesti. Tutti i componenti del colore devono essere compresi nell'intervallo 0-1. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba/#fromrgba_1)(int, int, int, int) | Restituisce un nuovo Color con i valori ged, green, blue, alpha richiesti. Tutti i componenti del colore devono essere compresi nell'intervallo 0-255. |
| static [FromString](../../aspose.svg.drawing/color/fromstring/)(string) | Analizza la stringa contenente il colore CSS e restituisce un nuovo Color. |
| static [FromUint](../../aspose.svg.drawing/color/fromuint/)(uint) | Restituisce un nuovo colore con il valore ARGB richiesto. |
| [AddLuminosity](../../aspose.svg.drawing/color/addluminosity/)(float) | Crea una copia del Colore sommando la sua luminosità e il valore delta. |
| [Convert](../../aspose.svg.drawing/color/convert/)(ColorModel) | Restituisce un componente di colore nel formato del modello di colore specificato. |
| override [Equals](../../aspose.svg.drawing/color/equals/)(object) | Determina se specificato`Color` è uguale a questa istanza. |
| [GetComplementary](../../aspose.svg.drawing/color/getcomplementary/)() | Restituisce un nuovo colore che si trova sul lato opposto della ruota dei colori rispetto all'originale. |
| override [GetHashCode](../../aspose.svg.drawing/color/gethashcode/)() | Restituisce un codice hash. |
| [GetHue](../../aspose.svg.drawing/color/gethue/)() | Restituisce una tonalità del colore. |
| [GetLuminosity](../../aspose.svg.drawing/color/getluminosity/)() | Restituisce una luminosità del Colore. |
| [GetSaturation](../../aspose.svg.drawing/color/getsaturation/)() | Restituisce una saturazione del Colore. |
| [ToInt](../../aspose.svg.drawing/color/toint/)() | Codifica i componenti Color ARGB in int. |
| [ToName](../../aspose.svg.drawing/color/toname/)() | Restituisce il nome del colore se corrisponde a un colore nell'elenco dei colori con nome CSS o una stringa vuota. |
| [ToNaturalColorString](../../aspose.svg.drawing/color/tonaturalcolorstring/)(int) | Restituisce un colore specificato dai colori naturali (NCol) utilizzando una lettera di colore con un numero per specificare la distanza (in percentuale) dal colore. |
| [ToRgbaHexString](../../aspose.svg.drawing/color/torgbahexstring/)() | Restituisce un colore esadecimale specificato con: #RRGGBBAA. |
| [ToRgbaString](../../aspose.svg.drawing/color/torgbastring/)() | Restituisce una stringa contenente il colore RGBA specificato da: rgba(R, G, B, A). |
| [ToRgbHexString](../../aspose.svg.drawing/color/torgbhexstring/)() | Restituisce un colore esadecimale specificato con: #RRGGBB. |
| [ToRgbString](../../aspose.svg.drawing/color/torgbstring/)() | Restituisce una stringa contenente il colore RGB specificato da: rgb(R, G, B). |
| override [ToString](../../aspose.svg.drawing/color/tostring/)() | Restituisce una stringa composta dai valori del componente RGBA. |
| [ToUint](../../aspose.svg.drawing/color/touint/)() | Codifica i componenti Color ARGB in unsigned int. |
| [WithAlpha](../../aspose.svg.drawing/color/withalpha/)(float) | Crea una copia del colore con il componente alfa specificato. |
| [WithHue](../../aspose.svg.drawing/color/withhue/)(float) | Crea una copia del colore con la tonalità specificata. |
| [WithLuminosity](../../aspose.svg.drawing/color/withluminosity/)(float) | Crea una copia del Colore con luminosità specificata. |
| [WithSaturation](../../aspose.svg.drawing/color/withsaturation/)(float) | Crea una copia del colore con la saturazione specificata. |

### Guarda anche

* spazio dei nomi [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* assemblea [Aspose.SVG](../../)


