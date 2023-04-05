---
title: PsDocument.FillAndStrokeText
second_title: Aspose.Page för .NET API-referens
description: PsDocument metod. Lägger till en textsträng genom att fylla insidan av glyfer och rita glyfers konturer.
type: docs
weight: 110
url: /sv/net/aspose.page.eps/psdocument/fillandstroketext/
---
## FillAndStrokeText(string, Font, float, float, Brush, Brush, Pen) {#fillandstroketext_1}

Lägger till en textsträng genom att fylla insidan av glyfer och rita glyfers konturer.

```csharp
public void FillAndStrokeText(string text, Font font, float x, float y, Brush fillPaint, 
    Brush strokePaint, Pen stroke)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | String | Texten att lägga till. |
| font | Font | Systemteckensnitt som kommer att användas för att rita text. |
| x | Single | X-koordinat för textursprung. |
| y | Single | Y-koordinat för textursprung. |
| fillPaint | Brush | Fyllningen som används för att måla glyfer interiör. |
| strokePaint | Brush | DeBrush används för att måla glyfers konturer. Kan vara vilken underklass som helst avBrush klass i .NET-plattformen. |
| stroke | Pen | Linjen som används för att rita glyfers konturer. |

### Se även

* class [PsDocument](../)
* namnutrymme [Aspose.Page.EPS](../../psdocument/)
* hopsättning [Aspose.Page](../../../)

---

## FillAndStrokeText(string, float[], Font, float, float, Brush, Brush, Pen) {#fillandstroketext}

Lägger till en textsträng genom att fylla insidan av glyfer och rita glyfers konturer.

```csharp
public void FillAndStrokeText(string text, float[] advances, Font font, float x, float y, 
    Brush fillPaint, Brush strokePaint, Pen stroke)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| text | String | Texten att lägga till. |
| advances | Single[] | En rad glyfers bredd. Dens längd måste överensstämma med antalet tecken i strängen. |
| font | Font | Systemteckensnitt som kommer att användas för att rita text. |
| x | Single | X-koordinat för textursprung. |
| y | Single | Y-koordinat för textursprung. |
| fillPaint | Brush | Fyllningen som används för att måla glyfer interiör. |
| strokePaint | Brush | DeBrush används för att måla glyfers konturer. Kan vara vilken underklass som helst avBrush klass i .NET-plattformen. |
| stroke | Pen | Linjen som används för att rita glyfers konturer. |

### Se även

* class [PsDocument](../)
* namnutrymme [Aspose.Page.EPS](../../psdocument/)
* hopsättning [Aspose.Page](../../../)


