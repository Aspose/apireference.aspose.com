---
title: AsposeOcr.GetRectangles
second_title: Aspose.OCR per Riferimento API .NET
description: AsposeOcr metodo. Rileva aree di testo sullimmagine.  La correzione automatica dellinclinazione dellimmagine non viene applicata. Supporta GIF PNG JPEG BMP TIFF JFIF.
type: docs
weight: 70
url: /it/net/aspose.ocr/asposeocr/getrectangles/
---
## GetRectangles(string, AreasType, bool) {#getrectangles_1}

Rileva aree di testo sull'immagine.  La correzione automatica dell'inclinazione dell'immagine non viene applicata. Supporta GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<Rectangle> GetRectangles(string fullPath, AreasType areasType = AreasType.PARAGRAPHS, 
    bool detectAreas = true)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fullPath | String | Percorso per l'immagine. |
| areasType | AreasType | Determina quali rettangoli restituire - riga o paragrafi. |
| detectAreas | Boolean | Abilita il rilevamento automatico delle aree di testo. |

### Valore di ritorno

Elenco delle aree o linee di testo rilevate.

### Guarda anche

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* spazio dei nomi [Aspose.OCR](../../asposeocr/)
* assemblea [Aspose.OCR](../../../)

---

## GetRectangles(MemoryStream, AreasType, bool) {#getrectangles}

Rileva aree di testo sull'immagine.  La correzione automatica dell'inclinazione dell'immagine non viene applicata. Supporta GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<Rectangle> GetRectangles(MemoryStream image, 
    AreasType areasType = AreasType.PARAGRAPHS, bool detectAreas = true)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| image | MemoryStream | Flusso di memoria contenente l'immagine. |
| areasType | AreasType | Determina quali rettangoli restituire - riga o paragrafi. |
| detectAreas | Boolean | Abilita il rilevamento automatico delle aree di testo. |

### Valore di ritorno

Elenco delle aree o linee di testo rilevate.

### Guarda anche

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* spazio dei nomi [Aspose.OCR](../../asposeocr/)
* assemblea [Aspose.OCR](../../../)


