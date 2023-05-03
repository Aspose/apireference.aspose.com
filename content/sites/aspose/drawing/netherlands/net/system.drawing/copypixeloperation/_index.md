---
title: Enum CopyPixelOperation
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.CopyPixelOperation opsomming. Bepaalt hoe de bronkleur in een kopieerpixelbewerking wordt gecombineerd met de doelkleur om te resulteren in een uiteindelijke kleur.
type: docs
weight: 120
url: /nl/net/system.drawing/copypixeloperation/
---
## CopyPixelOperation enumeration

Bepaalt hoe de bronkleur in een kopieerpixelbewerking wordt gecombineerd met de doelkleur om te resulteren in een uiteindelijke kleur.

```csharp
public enum CopyPixelOperation
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| NoMirrorBitmap | `-2147483648` | De bitmap is niet gespiegeld. |
| Blackness | `66` | Het bestemmingsgebied wordt gevuld met de kleur die is gekoppeld aan index 0 in het fysieke palet. (Deze kleur is zwart voor het standaard fysieke palet.) |
| NotSourceErase | `1114278` | De bron- en doelkleuren worden gecombineerd met behulp van de Boolean`OF` operator, en de resulterende kleur wordt vervolgens omgekeerd. |
| NotSourceCopy | `3342344` | Het geïnverteerde brongebied wordt gekopieerd naar de bestemming. |
| SourceErase | `4457256` | De geïnverteerde kleuren van het bestemmingsgebied worden gecombineerd met de kleuren van het brongebied met behulp van de Booleaanse`EN` operator. |
| DestinationInvert | `5570569` | Het bestemmingsgebied is omgekeerd. |
| PatInvert | `5898313` | De kleuren van het penseel dat momenteel is geselecteerd in de context van het doelapparaat worden gecombineerd met de kleuren van het doel gebruiken de Booleaanse waarde`XOR` operator. |
| SourceInvert | `6684742` | De kleuren van de bron- en doelgebieden worden gecombineerd met behulp van de Booleaanse waarde`XOR` operator. |
| SourceAnd | `8913094` | De kleuren van de bron- en doelgebieden worden gecombineerd met behulp van de Booleaanse waarde`EN` operator. |
| MergePaint | `12255782` | De kleuren van het geïnverteerde brongebied worden samengevoegd met de kleuren van het bestemmingsgebied met behulp van de Booleaanse`OF` operator. |
| MergeCopy | `12583114` | De kleuren van het brongebied worden samengevoegd met de kleuren van het geselecteerde penseel van de doelapparaatcontext met behulp van de Booleaanse`EN` operator. |
| SourceCopy | `13369376` | Het brongebied wordt rechtstreeks gekopieerd naar het bestemmingsgebied. |
| SourcePaint | `15597702` | De kleuren van de bron- en doelgebieden worden gecombineerd met behulp van de Booleaanse waarde`OF` operator. |
| PatCopy | `15728673` | Het momenteel geselecteerde penseel in de context van het doelapparaat wordt gekopieerd naar de doelbitmap. |
| PatPaint | `16452105` | De kleuren van het penseel dat momenteel is geselecteerd in de context van het doelapparaat, worden gecombineerd met de kleuren van het omgekeerde brongebied met behulp van de Booleaanse`OF` exploitant. Het resultaat van deze bewerking wordt gecombineerd met de kleuren van het bestemmingsgebied met behulp van de Booleaanse waarde`OF` operator. |
| Whiteness | `16711778` | Het bestemmingsgebied wordt gevuld met de kleur die is gekoppeld aan index 1 in het fysieke palet. (Deze kleur is wit voor het standaard fysieke palet.) |
| CaptureBlt | `1073741824` | Vensters die bovenop uw venster zijn geplaatst, zijn opgenomen in de resulterende afbeelding. Standaard bevat de afbeelding alleen uw venster. Merk op dat dit over het algemeen niet kan worden gebruikt voor het afdrukken van apparaatcontexten. |

### Zie ook

* naamruimte [System.Drawing](../../system.drawing/)
* montage [Aspose.Drawing](../../)


