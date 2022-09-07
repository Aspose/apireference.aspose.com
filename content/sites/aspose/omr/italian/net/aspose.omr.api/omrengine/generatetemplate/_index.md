---
title: GenerateTemplate
second_title: Aspose.OMR per Riferimento API .NET
description: Crea un modello .omr e unimmagine modello basati su MemoryStream
type: docs
weight: 40
url: /it/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection) {#generatetemplate_2}

Crea un modello (.omr) e un'immagine modello basati su MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | MemoryStream | Il flusso che contiene le righe di markup |
| settings | GlobalPageSettings | Le impostazioni globali applicabili a tutti gli elementi della pagina |
| userImages | ImageCollection | Raccolta di immagini che possono essere utilizzate per la generazione di modelli. Consenti di utilizzare le immagini da MemoryStream invece del file system |

### Valore di ritorno

Risultato di generazione

### Guarda anche

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* spazio dei nomi [Aspose.OMR.Api](../../omrengine)
* assemblea [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection) {#generatetemplate_1}

Crea un modello (.omr) e un'immagine modello basati su MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | MemoryStream | Il flusso che contiene le righe di markup |
| userImages | ImageCollection | Raccolta di immagini che possono essere utilizzate per la generazione di modelli. Consenti di utilizzare le immagini da MemoryStream invece del file system |

### Valore di ritorno

Risultato di generazione

### Guarda anche

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* spazio dei nomi [Aspose.OMR.Api](../../omrengine)
* assemblea [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], GlobalPageSettings, ImageCollection) {#generatetemplate_7}

Crea un modello (.omr) e un'immagine del modello in base a un array di righe di markup

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| markupLines | String[] | Matrice delle righe di markup |
| settings | GlobalPageSettings | Le impostazioni globali applicabili a tutti gli elementi della pagina |
| userImages | ImageCollection | Raccolta di immagini che possono essere utilizzate per la generazione di modelli. Consenti di utilizzare le immagini da MemoryStream invece del file system |

### Valore di ritorno

Risultato di generazione

### Guarda anche

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* spazio dei nomi [Aspose.OMR.Api](../../omrengine)
* assemblea [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], ImageCollection) {#generatetemplate_6}

Crea un modello (.omr) e un'immagine del modello in base a un array di righe di markup

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, ImageCollection userImages = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| markupLines | String[] | Matrice delle righe di markup |
| userImages | ImageCollection | Raccolta di immagini che possono essere utilizzate per la generazione di modelli. Consenti di utilizzare le immagini da MemoryStream invece del file system |

### Valore di ritorno

Risultato di generazione

### Guarda anche

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* spazio dei nomi [Aspose.OMR.Api](../../omrengine)
* assemblea [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings) {#generatetemplate_4}

Crea un modello (.omr) e un'immagine del modello in base al markup del testo

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| markupPath | String | Percorso del file di markup del testo |
| settings | GlobalPageSettings | Le impostazioni globali applicabili a tutti gli elementi della pagina |

### Valore di ritorno

Risultato di generazione

### Guarda anche

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [OmrEngine](../../omrengine)
* spazio dei nomi [Aspose.OMR.Api](../../omrengine)
* assemblea [Aspose.OMR](../../../)

---

## GenerateTemplate(string) {#generatetemplate_3}

Crea un modello (.omr) e un'immagine del modello in base al markup del testo

```csharp
public GenerationResult GenerateTemplate(string markupPath)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| markupPath | String | Percorso del file di markup del testo |

### Valore di ritorno

Risultato di generazione

### Guarda anche

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [OmrEngine](../../omrengine)
* spazio dei nomi [Aspose.OMR.Api](../../omrengine)
* assemblea [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[]) {#generatetemplate_5}

Crea un modello (.omr) e un'immagine del modello in base al markup del testo

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| markupPath | String | Percorso del file di markup del testo |
| imagesPaths | String[] | Percorsi completi delle immagini utilizzate nella generazione |

### Valore di ritorno

Risultato di generazione

### Guarda anche

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [OmrEngine](../../omrengine)
* spazio dei nomi [Aspose.OMR.Api](../../omrengine)
* assemblea [Aspose.OMR](../../../)

---

## GenerateTemplate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generatetemplate}

Crea un modello (.omr) e un'immagine del modello in base all'oggetto Modello

```csharp
public GenerationResult GenerateTemplate(TemplateConfig config, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| config | TemplateConfig | Oggetto modello che rappresenta tutti gli elementi |
| settings | GlobalPageSettings | impostazioni globali utilizzate in tutta la generazione di modelli |
| userImages | ImageCollection | Raccolta di immagini che possono essere utilizzate per la generazione di modelli. Consenti di utilizzare le immagini da MemoryStream invece del file system |

### Valore di ritorno

Risultato di generazione

### Guarda anche

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* spazio dei nomi [Aspose.OMR.Api](../../omrengine)
* assemblea [Aspose.OMR](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OMR.dll -->
