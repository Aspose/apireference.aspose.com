---
title: Class Icon
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Icon klas. Vertegenwoordigt een Windowspictogram een kleine bitmapafbeelding die wordt gebruikt om een object weer te geven. Pictogrammen kunnen worden gezien als transparante bitmaps hoewel hun grootte wordt bepaald door het systeem.
type: docs
weight: 570
url: /nl/net/system.drawing/icon/
---
## Icon class

Vertegenwoordigt een Windows-pictogram, een kleine bitmapafbeelding die wordt gebruikt om een object weer te geven. Pictogrammen kunnen worden gezien als transparante bitmaps, hoewel hun grootte wordt bepaald door het systeem.

```csharp
public sealed class Icon : ICloneable, IDisposable, ISerializable
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Icon](icon/#constructor_2)(Stream) | Initialiseert een nieuw exemplaar van het`Icon` klasse uit de opgegeven gegevensstroom. |
| [Icon](icon/#constructor_5)(string) | Initialiseert een nieuw exemplaar van het`Icon` klasse van de opgegeven bestandsnaam. |
| [Icon](icon/#constructor_1)(Icon, Size) | Initialiseert een nieuw exemplaar van het`Icon` klasse en probeert een versie van het pictogram te vinden die overeenkomt met de gevraagde grootte. |
| [Icon](icon/#constructor_4)(Stream, Size) | Initialiseert een nieuw exemplaar van het`Icon` klasse van de opgegeven grootte van de opgegeven stream. |
| [Icon](icon/#constructor_7)(string, Size) | Initialiseert een nieuw exemplaar van het`Icon` klasse van de opgegeven grootte uit het opgegeven bestand. |
| [Icon](icon/#constructor_8)(Type, string) | Initialiseert een nieuw exemplaar van het`Icon` klasse van een bron in de opgegeven assembly. |
| [Icon](icon/#constructor)(Icon, int, int) | Initialiseert een nieuw exemplaar van het`Icon` klasse en probeert een versie van het pictogram te vinden die overeenkomt met de gevraagde grootte.. |
| [Icon](icon/#constructor_3)(Stream, int, int) | Initialiseert een nieuw exemplaar van het`Icon` klasse uit de opgegeven gegevensstroom en met de opgegeven breedte en hoogte. |
| [Icon](icon/#constructor_6)(string, int, int) | Initialiseert een nieuw exemplaar van het`Icon` klasse met de opgegeven breedte en hoogte van het opgegeven bestand. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Handle](../../system.drawing/icon/handle/) { get; } | Krijgt hiervoor het handvatIcon . Dit is geen kopie van het handvat; maak het niet vrij. |
| [Height](../../system.drawing/icon/height/) { get; } | Krijgt de hoogte hiervanIcon . |
| [Size](../../system.drawing/icon/size/) { get; } | Krijgt de grootte hiervanIcon . |
| [Width](../../system.drawing/icon/width/) { get; } | Krijgt de breedte hiervanIcon . |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [ExtractAssociatedIcon](../../system.drawing/icon/extractassociatedicon/)(string) | Retourneert een pictogramrepresentatie van een afbeelding die zich in het opgegeven bestand bevindt. |
| static [FromHandle](../../system.drawing/icon/fromhandle/)(IntPtr) | Creëert een GDI+Icon van de opgegeven Windows-ingang naar een pictogram (HICON). |
| [Clone](../../system.drawing/icon/clone/)() | Kloont deIcon , een dubbele afbeelding maken. |
| [Dispose](../../system.drawing/icon/dispose/)() | Voert door de toepassing gedefinieerde taken uit die verband houden met het vrijmaken, vrijgeven of resetten van onbeheerde bronnen. |
| [Save](../../system.drawing/icon/save/)(Stream) | Slaat dit opIcon naar de opgegeven uitvoerStream . |
| [ToBitmap](../../system.drawing/icon/tobitmap/)() | Converteert ditIcon naar een GDI+Bitmap . |
| override [ToString](../../system.drawing/icon/tostring/)() | Haalt een door mensen leesbare tekenreeks op die deIcon . |

### Zie ook

* naamruimte [System.Drawing](../../system.drawing/)
* montage [Aspose.Drawing](../../)


