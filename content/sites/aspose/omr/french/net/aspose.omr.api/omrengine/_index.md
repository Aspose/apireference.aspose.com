---
title: Class OmrEngine
second_title: Référence de l'API Aspose.OMR pour .NET
description: Aspose.OMR.Api.OmrEngine classe. Le moteur OMR. Gère la création des classes de traitement de modèle et dimage et des composants de linterface graphique.
type: docs
weight: 20
url: /fr/net/aspose.omr.api/omrengine/
---
## OmrEngine class

Le moteur OMR. Gère la création des classes de traitement de modèle et d'image et des composants de l'interface graphique.

```csharp
public class OmrEngine
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [OmrEngine](omrengine/)() | Default_Constructor |

## Méthodes

| Nom | La description |
| --- | --- |
| [GenerateJSONTemplate](../../aspose.omr.api/omrengine/generatejsontemplate/)(string, GlobalPageSettings, Encoding) | Crée un modèle (.omr) et une image de modèle basés sur le balisage .json |
| [GenerateJSONTemplateFromString](../../aspose.omr.api/omrengine/generatejsontemplatefromstring/)(string, GlobalPageSettings, ImageCollection) | Crée un modèle (.omr) et une image de modèle basés sur le balisage JSON |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_5)(string, Encoding) | Crée un modèle (.omr) et une image de modèle basés sur le balisage de texte |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_6)(string[], ImageCollection) | Crée un modèle (.omr) et une image de modèle basés sur un tableau de lignes de balisage |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_1)(MemoryStream, ImageCollection, Encoding) | Crée un modèle (.omr) et une image de modèle basés sur MemoryStream |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_3)(string, GlobalPageSettings, Encoding) | Crée un modèle (.omr) et une image de modèle basés sur le balisage de texte |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_4)(string, string[], Encoding) | Crée un modèle (.omr) et une image de modèle basés sur le balisage de texte |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_7)(string[], GlobalPageSettings, ImageCollection) | Crée un modèle (.omr) et une image de modèle basés sur un tableau de lignes de balisage |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate)(TemplateConfig, GlobalPageSettings, ImageCollection) | Crée un modèle (.omr) et une image de modèle basés sur l'objet Modèle |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_2)(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) | Crée un modèle (.omr) et une image de modèle basés sur MemoryStream |
| [GetCorrectionControl](../../aspose.omr.api/omrengine/getcorrectioncontrol/)(TemplateProcessor) | Crée le[`CorrectionControl`](../../aspose.omr.correctionui/correctioncontrol/) instance qui permet de travailler avec l'API OMR à l'aide de l'interface graphique. Prend[`TemplateProcessor`](../templateprocessor/) en tant que paramètre et ne fonctionne qu'avec les images créées à l'aide du template spécifié |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor_1)(string) | Crée le[`TemplateProcessor`](../templateprocessor/) instance qui permet de travailler avec le modèle spécifié. |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor)(MemoryStream, Encoding) | Crée le[`TemplateProcessor`](../templateprocessor/) instance qui permet de travailler avec le modèle spécifié. |

### Exemples

```csharp
// récupère le processeur de modèle
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
```

```csharp
// obtient le contrôle de l'interface graphique de correction
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
CorrectionControl control = engine.GetCorrectionControl(templateProcessor);
```

```csharp
// génère un modèle
OmrEngine engine = new OmrEngine();
GenerationResult result = engine.GenerateTemplate(markupPath);
if(result.ErrorCode == 0)
{
    result.Save(folderPath, templateName);
}
```

### Voir également

* espace de noms [Aspose.OMR.Api](../../aspose.omr.api/)
* Assemblée [Aspose.OMR](../../)


