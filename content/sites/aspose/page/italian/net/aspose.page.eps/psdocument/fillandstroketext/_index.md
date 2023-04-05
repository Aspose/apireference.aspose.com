---
title: PsDocument.FillAndStrokeText
second_title: Aspose.Page per riferimento all'API .NET
description: PsDocument metodo. Aggiunge una stringa di testo riempiendo linterno dei glifi e disegnando i contorni dei glifi.
type: docs
weight: 110
url: /it/net/aspose.page.eps/psdocument/fillandstroketext/
---
## FillAndStrokeText(string, Font, float, float, Brush, Brush, Pen) {#fillandstroketext_1}

Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi.

```csharp
public void FillAndStrokeText(string text, Font font, float x, float y, Brush fillPaint, 
    Brush strokePaint, Pen stroke)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | String | Il testo da aggiungere. |
| font | Font | Carattere di sistema che verrà utilizzato per disegnare il testo. |
| x | Single | Coordinata X per l'origine del testo. |
| y | Single | Coordinata Y per l'origine del testo. |
| fillPaint | Brush | Il riempimento utilizzato per dipingere glifi interni. |
| strokePaint | Brush | ILBrush utilizzato per dipingere i contorni dei glifi. Può essere qualsiasi sottoclasse diBrush classe nella piattaforma .NET. |
| stroke | Pen | Il tratto utilizzato per disegnare i contorni dei glifi. |

### Guarda anche

* class [PsDocument](../)
* spazio dei nomi [Aspose.Page.EPS](../../psdocument/)
* assemblea [Aspose.Page](../../../)

---

## FillAndStrokeText(string, float[], Font, float, float, Brush, Brush, Pen) {#fillandstroketext}

Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi.

```csharp
public void FillAndStrokeText(string text, float[] advances, Font font, float x, float y, 
    Brush fillPaint, Brush strokePaint, Pen stroke)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | String | Il testo da aggiungere. |
| advances | Single[] | Un array di larghezza dei glifi. La sua lunghezza deve corrispondere al numero di glifi nella stringa. |
| font | Font | Carattere di sistema che verrà utilizzato per disegnare il testo. |
| x | Single | Coordinata X per l'origine del testo. |
| y | Single | Coordinata Y per l'origine del testo. |
| fillPaint | Brush | Il riempimento utilizzato per dipingere glifi interni. |
| strokePaint | Brush | ILBrush utilizzato per dipingere i contorni dei glifi. Può essere qualsiasi sottoclasse diBrush classe nella piattaforma .NET. |
| stroke | Pen | Il tratto utilizzato per disegnare i contorni dei glifi. |

### Guarda anche

* class [PsDocument](../)
* spazio dei nomi [Aspose.Page.EPS](../../psdocument/)
* assemblea [Aspose.Page](../../../)


