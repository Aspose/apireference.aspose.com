---
title: RemoveUnusedMasterSlides
second_title: Aspose.Slides für .NET-API-Referenz
description: Macht Komprimierung derPresentationaspose.slides/presentation durch Entfernen unbenutzter Masterfolien.
type: docs
weight: 20
url: /de/net/aspose.slides.lowcode/compress/removeunusedmasterslides/
---
## Compress.RemoveUnusedMasterSlides method

Macht Komprimierung der[`Presentation`](../../../aspose.slides/presentation) durch Entfernen unbenutzter Masterfolien.

```csharp
public static void RemoveUnusedMasterSlides(Presentation pres)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| pres | Presentation | Die Präsentationsinstanz |

### Beispiele

```csharp
using (Presentation pres = new Presentation("pres.pptx"))
{
    Aspose.Slides.LowCode.Compress.RemoveUnusedMasterSlides(pres);
    
    pres.Save("pres-out.pptx", SaveFormat.Pptx);
}
```

### Siehe auch

* class [Presentation](../../../aspose.slides/presentation)
* class [Compress](../../compress)
* namensraum [Aspose.Slides.LowCode](../../compress)
* Montage [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
