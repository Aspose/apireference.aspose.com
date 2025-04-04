---
title: AddSectionZoomFrame
second_title: Aspose.Slides für .NET-API-Referenz
description: Fügt ein neues AbschnittsZoomObjekt am Ende einer Sammlung hinzu.
type: docs
weight: 140
url: /de/net/aspose.slides/ishapecollection/addsectionzoomframe/
---
## AddSectionZoomFrame(float, float, float, float, ISection) {#addsectionzoomframe}

Fügt ein neues Abschnitts-Zoom-Objekt am Ende einer Sammlung hinzu.

```csharp
public ISectionZoomFrame AddSectionZoomFrame(float x, float y, float width, float height, 
    ISection section)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | Single | X-Koordinate eines neuen Schnitt-ZoomrahmensSingle. |
| y | Single | Y-Koordinate eines neuen Schnitt-ZoomrahmensSingle. |
| width | Single | Breite eines neuen Schnitt-Zoom-RahmensSingle. |
| height | Single | Höhe eines neuen Schnitt-ZoomrahmensSingle. |
| section | ISection | Das Schnittobjekt, auf das der Schnitt-Zoomrahmen verweist[`ISection`](../../isection). |

### Rückgabewert

Schnitt-Zoom-Objekt erstellt[`ISectionZoomFrame`](../../isectionzoomframe).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentException | Der referenzierte Abschnitt gehört nicht zur aktuellen Präsentation oder enthält keine Folien. |

### Beispiele

Dieses Beispiel demonstriert das Hinzufügen eines Abschnitts-Zoom-Objekts am Ende einer Sammlung (vorausgesetzt, es gibt mindestens zwei Abschnitte in der Präsentation „Präsentation.pptx“):

```csharp
[C#]
using (Presentation pres = new Presentation("Presentation.pptx"))
{
    ISectionZoomFrame zoomFrame = pres.Slides[0].Shapes.AddSectionZoomFrame(150, 20, 50, 50, pres.Sections[1]);
}
```

### Siehe auch

* interface [ISectionZoomFrame](../../isectionzoomframe)
* interface [ISection](../../isection)
* interface [IShapeCollection](../../ishapecollection)
* namensraum [Aspose.Slides](../../ishapecollection)
* Montage [Aspose.Slides](../../../)

---

## AddSectionZoomFrame(float, float, float, float, ISection, IPPImage) {#addsectionzoomframe_1}

Fügt ein neues Abschnitts-Zoom-Objekt am Ende einer Sammlung mit einem vordefinierten Bild hinzu.

```csharp
public ISectionZoomFrame AddSectionZoomFrame(float x, float y, float width, float height, 
    ISection section, IPPImage image)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | Single | X-Koordinate eines neuen Schnitt-ZoomrahmensSingle. |
| y | Single | Y-Koordinate eines neuen Schnitt-ZoomrahmensSingle. |
| width | Single | Breite eines neuen Schnitt-Zoom-RahmensSingle. |
| height | Single | Höhe eines neuen Schnitt-ZoomrahmensSingle. |
| section | ISection | Das Schnittobjekt, auf das der Schnitt-Zoomrahmen verweist[`ISection`](../../isection). |
| image | IPPImage | Das Bild für die referenzierte Folie[`IPPImage`](../../ippimage) |

### Rückgabewert

Schnitt-Zoom-Objekt erstellt[`ISectionZoomFrame`](../../isectionzoomframe).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentException | Der referenzierte Abschnitt gehört nicht zur aktuellen Präsentation oder enthält keine Folien. |

### Beispiele

Dieses Beispiel demonstriert das Hinzufügen eines Abschnitts-Zoom-Objekts am Ende einer Sammlung (vorausgesetzt, es gibt mindestens zwei Abschnitte in der Präsentation „Präsentation.pptx“):

```csharp
[C#]
using (Presentation pres = new Presentation("Presentation.pptx"))
{
    IPPImage image = pres.Images.AddImage(Image.FromFile("image.png"));
    ISectionZoomFrame zoomFrame = pres.Slides[0].Shapes.AddSectionZoomFrame(150, 20, 50, 50, pres.Sections[1], image);
}
```

### Siehe auch

* interface [ISectionZoomFrame](../../isectionzoomframe)
* interface [ISection](../../isection)
* interface [IPPImage](../../ippimage)
* interface [IShapeCollection](../../ishapecollection)
* namensraum [Aspose.Slides](../../ishapecollection)
* Montage [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
