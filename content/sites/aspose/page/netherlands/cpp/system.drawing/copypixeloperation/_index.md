---
title: "System::Drawing::CopyPixelOperation enum"
linktitle: "CopyPixelOperation"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::CopyPixelOperation enum. Geeft aan hoe de bronkleur in een pixelkopieerbewerking wordt gecombineerd met de doelkleur om te resulteren in een eindkleur in C++."
type: docs
weight: 3000
url: /nl/cpp/system.drawing/copypixeloperation/
---
## CopyPixelOperation enum


Specificeert hoe de bronkleur bij een pixel‑kopieerbewerking wordt gecombineerd met de doelkleur om een eindkleur te verkrijgen.

```cpp
enum class CopyPixelOperation
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| NoMirrorBitmap | n/a | De bitmap wordt niet gespiegeld. |
| Blackness | 66 | Het doelgebied wordt gevuld met de kleur met index 0 in de fysieke palet. |
| NotSourceErase | 1114278 | De bron- en doelkleuren worden ge-OR'd en de resulterende kleur wordt vervolgens geïnverteerd. |
| NotSourceCopy | 3342344 | Het brongebied wordt geïnverteerd en vervolgens gekopieerd naar het doel. |
| SourceErase | 4457256 | De omgekeerde kleuren van het bestemmingsgebied zijn ANDed met de kleuren van het brongebied. |
| DestinationInvert | 5570569 | Het bestemmingsgebied is omgekeerd. |
| PatInvert | 5898313 | De kleuren van de momenteel geselecteerde penseel in de bestemmingsapparaatcontext zijn XORed met de kleuren van de bestemming. |
| SourceInvert | 6684742 | De kleuren van de bron- en bestemmingsgebieden zijn XORed. |
| SourceAnd | 8913094 | De kleuren van de bron- en bestemmingsgebieden zijn ANDed. |
| MergePaint | 12255782 | De kleuren van het omgekeerde brongebied zijn ORed met de kleuren van het bestemmingsgebied. |
| MergeCopy | 12583114 | De kleuren van het brongebied zijn ANDed met de kleuren van de geselecteerde penseel van de bestemmingsapparaatcontext. |
| SourceCopy | 13369376 | Het brongebied wordt rechtstreeks gekopieerd naar het bestemmingsgebied. |
| SourcePaint | 15597702 | De kleuren van de bron- en bestemmingsgebieden worden OR‑gecombineerd. |
| PatCopy | 15728673 | De momenteel geselecteerde penseel in de bestemmings‑device‑context wordt gekopieerd naar de bestemmingsbitmap. |
| PatPaint | 16452105 | De kleuren van het momenteel geselecteerde penseel in de bestemmings‑device‑context worden OR‑gecombineerd met de kleuren van het omgekeerde brongebied. Het resultaat van deze bewerking wordt OR‑gecombineerd met de kleuren van het bestemmingsgebied. |
| Witheid | 16711778 | Het bestemmingsgebied wordt gevuld met de kleur met index 1 in het fysieke palet. |
| CaptureBlt | 1073741824 | [Windows](../../system.windows/) die bovenop het venster van de applicatie worden gestapeld, worden opgenomen in de resulterende afbeelding. |

## Zie ook

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
