---
title: Description
second_title: Aspose.Slides für .NET-API-Referenz
description: Gibt die Textbeschreibung des Summary Zoom SectionObjekts zurück.
type: docs
weight: 10
url: /de/net/aspose.slides/summaryzoomsection/description/
---
## SummaryZoomSection.Description property

Gibt die Textbeschreibung des Summary Zoom Section-Objekts zurück.

```csharp
public string Description { get; set; }
```

### Beispiele

Beispiel:

```csharp
[C#]
using (Presentation pres = new Presentation("pres.pptx"))
{
    ISummaryZoomSection zoomSection = zoomFrame.SummaryZoomCollection[1];
    zoomSection.Description = "Description";
}
```

### Siehe auch

* class [SummaryZoomSection](../../summaryzoomsection)
* namensraum [Aspose.Slides](../../summaryzoomsection)
* Montage [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
