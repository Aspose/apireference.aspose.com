---
title: Class TemplateProcessor
second_title: Référence de l'API Aspose.OMR pour .NET
description: Aspose.OMR.Api.TemplateProcessor classe. Classe pour le traitement des modèles et des images.  Chaque instance de cette classe fonctionne avec un seul modèle OMR. Elle est capable de reconnaître les images du modèle spécifié dans le constructeur.
type: docs
weight: 30
url: /fr/net/aspose.omr.api/templateprocessor/
---
## TemplateProcessor class

Classe pour le traitement des modèles et des images.  Chaque instance de cette classe fonctionne avec un seul modèle OMR. Elle est capable de reconnaître les images du modèle spécifié dans le constructeur.

```csharp
public class TemplateProcessor
```

## Méthodes

| Nom | La description |
| --- | --- |
| [Recalculate](../../aspose.omr.api/templateprocessor/recalculate/)(RecognitionResult, int) | Met à jour le résultat de la reconnaissance à l'aide de paramètres affinés. |
| [RecognizeFolder](../../aspose.omr.api/templateprocessor/recognizefolder/)(string, int) | Reconnaît les images du dossier |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage)(MemoryStream, int) | Reconnaissance de l'image à partir du flux de mémoire |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage_1)(string, int) | Reconnaît l'image |
| [RecognizeMultiPageTemplate](../../aspose.omr.api/templateprocessor/recognizemultipagetemplate/)(string[], int) | Reconnaît le modèle multipage |

### Exemples

```csharp
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
RecognitionResult result = templateProcessor.RecognizeImage(imagePath);
string csvResult = result.GetCsv();
```

### Voir également

* espace de noms [Aspose.OMR.Api](../../aspose.omr.api/)
* Assemblée [Aspose.OMR](../../)


