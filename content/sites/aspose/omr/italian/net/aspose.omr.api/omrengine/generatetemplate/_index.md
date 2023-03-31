---
title: OmrEngine.GenerateTemplate
second_title: Aspose.OMR per Riferimento API .NET
description: OmrEngine metodo. Crea un modello .omr e unimmagine modello basata su MemoryStream
type: docs
weight: 40
url: /it/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) {#generatetemplate_2}

Crea un modello (.omr) e un'immagine modello basata su MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null, Encoding encoding = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | MemoryStream | Il flusso che contiene le righe di markup |
| settings | GlobalPageSettings | Le impostazioni globali applicabili a tutti gli elementi della pagina |
| userImages | ImageCollection | Raccolta di immagini che possono essere utilizzate per la generazione di un modello. Permette di usare immagini da MemoryStream invece che da file system |
| encoding | Encoding | codifica delle righe di markup, per impostazione predefinita viene utilizzato UTF-8 |

### Valore di ritorno

Risultato della generazione

### Guarda anche

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* spazio dei nomi [Aspose.OMR.Api](../../omrengine/)
* assemblea [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection, Encoding) {#generatetemplate_1}

Crea un modello (.omr) e un'immagine modello basata su MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null, 
    Encoding encoding = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | MemoryStream | Il flusso che contiene le righe di markup |
| userImages | ImageCollection | Raccolta di immagini che possono essere utilizzate per la generazione di un modello. Permette di usare immagini da MemoryStream invece che da file system |
| encoding | Encoding | codifica delle righe di markup, per impostazione predefinita viene utilizzato UTF-8 |

### Valore di ritorno

Risultato della generazione

### Guarda anche

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* spazio dei nomi [Aspose.OMR.Api](../../omrengine/)
* assemblea [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], GlobalPageSettings, ImageCollection) {#generatetemplate_7}

Crea un modello (.omr) e un'immagine modello basata su un array delle linee di markup

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| markupLines | String[] | Array delle righe di markup |
| settings | GlobalPageSettings | Le impostazioni globali applicabili a tutti gli elementi della pagina |
| userImages | ImageCollection | Raccolta di immagini che possono essere utilizzate per la generazione di un modello. Permette di usare immagini da MemoryStream invece che da file system |

### Valore di ritorno

Risultato della generazione

### Guarda anche

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* spazio dei nomi [Aspose.OMR.Api](../../omrengine/)
* assemblea [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], ImageCollection) {#generatetemplate_6}

Crea un modello (.omr) e un'immagine modello basata su un array delle linee di markup

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, ImageCollection userImages = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| markupLines | String[] | Array delle righe di markup |
| userImages | ImageCollection | Raccolta di immagini che possono essere utilizzate per la generazione di un modello. Permette di usare immagini da MemoryStream invece che da file system |

### Valore di ritorno

Risultato della generazione

### Guarda anche

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* spazio dei nomi [Aspose.OMR.Api](../../omrengine/)
* assemblea [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings, Encoding) {#generatetemplate_3}

Crea un modello (.omr) e un'immagine modello basata sul markup del testo

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings, 
    Encoding encoding = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| markupPath | String | Percorso del file di markup del testo |
| settings | GlobalPageSettings | Le impostazioni globali applicabili a tutti gli elementi della pagina |
| encoding | Encoding | codifica del file di markup, per impostazione predefinita viene utilizzato UTF-8 |

### Valore di ritorno

Risultato della generazione

### Guarda anche

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [OmrEngine](../)
* spazio dei nomi [Aspose.OMR.Api](../../omrengine/)
* assemblea [Aspose.OMR](../../../)

---

## GenerateTemplate(string, Encoding) {#generatetemplate_5}

Crea un modello (.omr) e un'immagine modello basata sul markup del testo

```csharp
public GenerationResult GenerateTemplate(string markupPath, Encoding encoding = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| markupPath | String | Percorso del file di markup del testo |
| encoding | Encoding | codifica del file di markup, per impostazione predefinita viene utilizzato UTF-8 |

### Valore di ritorno

Risultato della generazione

### Guarda anche

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* spazio dei nomi [Aspose.OMR.Api](../../omrengine/)
* assemblea [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[], Encoding) {#generatetemplate_4}

Crea un modello (.omr) e un'immagine modello basata sul markup del testo

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths, 
    Encoding encoding = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| markupPath | String | Percorso del file di markup del testo |
| imagesPaths | String[] | Percorsi completi delle immagini utilizzate nella generazione |
| encoding | Encoding | codifica del file di markup, per impostazione predefinita viene utilizzato UTF-8 |

### Valore di ritorno

Risultato della generazione

### Guarda anche

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* spazio dei nomi [Aspose.OMR.Api](../../omrengine/)
* assemblea [Aspose.OMR](../../../)

---

## GenerateTemplate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generatetemplate}

Crea un modello (.omr) e un'immagine modello basata sull'oggetto Modello

```csharp
public GenerationResult GenerateTemplate(TemplateConfig config, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| config | TemplateConfig | Oggetto modello che rappresenta tutti gli elementi |
| settings | GlobalPageSettings | impostazioni globali utilizzate in tutta la generazione di modelli |
| userImages | ImageCollection | Raccolta di immagini che possono essere utilizzate per la generazione di un modello. Permette di usare immagini da MemoryStream invece che da file system |

### Valore di ritorno

Risultato della generazione

### Guarda anche

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* spazio dei nomi [Aspose.OMR.Api](../../omrengine/)
* assemblea [Aspose.OMR](../../../)


