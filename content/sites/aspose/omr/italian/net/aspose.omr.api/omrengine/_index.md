---
title: Class OmrEngine
second_title: Aspose.OMR per Riferimento API .NET
description: Aspose.OMR.Api.OmrEngine classe. Il motore OMR. Gestisce la creazione del modello e delle classi di elaborazione delle immagini e dei componenti della GUI.
type: docs
weight: 20
url: /it/net/aspose.omr.api/omrengine/
---
## OmrEngine class

Il motore OMR. Gestisce la creazione del modello e delle classi di elaborazione delle immagini e dei componenti della GUI.

```csharp
public class OmrEngine
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [OmrEngine](omrengine/)() | Default_Costruttore |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [GenerateJSONTemplate](../../aspose.omr.api/omrengine/generatejsontemplate/)(string, GlobalPageSettings, Encoding) | Crea un modello (.omr) e un'immagine modello basata su .json markup |
| [GenerateJSONTemplateFromString](../../aspose.omr.api/omrengine/generatejsontemplatefromstring/)(string, GlobalPageSettings, ImageCollection) | Crea un modello (.omr) e un'immagine modello basata sul markup JSON |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_5)(string, Encoding) | Crea un modello (.omr) e un'immagine modello basata sul markup del testo |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_6)(string[], ImageCollection) | Crea un modello (.omr) e un'immagine modello basata su un array delle linee di markup |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_1)(MemoryStream, ImageCollection, Encoding) | Crea un modello (.omr) e un'immagine modello basata su MemoryStream |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_3)(string, GlobalPageSettings, Encoding) | Crea un modello (.omr) e un'immagine modello basata sul markup del testo |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_4)(string, string[], Encoding) | Crea un modello (.omr) e un'immagine modello basata sul markup del testo |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_7)(string[], GlobalPageSettings, ImageCollection) | Crea un modello (.omr) e un'immagine modello basata su un array delle linee di markup |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate)(TemplateConfig, GlobalPageSettings, ImageCollection) | Crea un modello (.omr) e un'immagine modello basata sull'oggetto Modello |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_2)(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) | Crea un modello (.omr) e un'immagine modello basata su MemoryStream |
| [GetCorrectionControl](../../aspose.omr.api/omrengine/getcorrectioncontrol/)(TemplateProcessor) | Crea il file[`CorrectionControl`](../../aspose.omr.correctionui/correctioncontrol/) istanza che consente di lavorare con l'API OMR utilizzando GUI. Takes[`TemplateProcessor`](../templateprocessor/) come parametro e funziona solo con le immagini create utilizzando template specificato |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor_1)(string) | Crea il file[`TemplateProcessor`](../templateprocessor/) istanza che consente di lavorare con il modello specificato. |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor)(MemoryStream, Encoding) | Crea il file[`TemplateProcessor`](../templateprocessor/) istanza che consente di lavorare con il modello specificato. |

### Esempi

```csharp
// ottiene il processore del modello
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
```

```csharp
// ottiene il controllo della GUI di correzione
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
CorrectionControl control = engine.GetCorrectionControl(templateProcessor);
```

```csharp
// genera un modello
OmrEngine engine = new OmrEngine();
GenerationResult result = engine.GenerateTemplate(markupPath);
if(result.ErrorCode == 0)
{
    result.Save(folderPath, templateName);
}
```

### Guarda anche

* spazio dei nomi [Aspose.OMR.Api](../../aspose.omr.api/)
* assemblea [Aspose.OMR](../../)


