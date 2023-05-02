---
title: Enum ImageLockMode
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Imaging.ImageLockMode opsomming. Specificeert vlaggen die worden doorgegeven aan de flagsparameter van hetLockBits methode. DeLockBits methode vergrendelt een deel van een afbeelding zodat u de pixelgegevens kunt lezen of schrijven.
type: docs
weight: 780
url: /nl/net/system.drawing.imaging/imagelockmode/
---
## ImageLockMode enumeration

Specificeert vlaggen die worden doorgegeven aan de flags-parameter van het[`LockBits`](../../system.drawing/bitmap/lockbits/) methode. De[`LockBits`](../../system.drawing/bitmap/lockbits/) methode vergrendelt een deel van een afbeelding zodat u de pixelgegevens kunt lezen of schrijven.

```csharp
public enum ImageLockMode
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| ReadOnly | `1` | Geeft aan dat een deel van de afbeelding is vergrendeld voor lezen. |
| WriteOnly | `2` | Geeft aan dat een deel van de afbeelding is vergrendeld voor schrijven. |
| ReadWrite | `3` | Geeft aan dat een deel van de afbeelding is vergrendeld voor lezen of schrijven. |
| UserInputBuffer | `4` | Geeft aan dat de buffer die wordt gebruikt voor het lezen of schrijven van pixelgegevens wordt toegewezen door de gebruiker. Als deze vlag is ingesteld, wordt de*flags* parameter van de[`LockBits`](../../system.drawing/bitmap/lockbits/) methode dient als invoerparameter (en mogelijk als uitvoerparameter). Als deze vlag wordt gewist, dan*flags* parameter dient alleen als uitvoerparameter. |

### Zie ook

* naamruimte [System.Drawing.Imaging](../../system.drawing.imaging/)
* montage [Aspose.Drawing](../../)


