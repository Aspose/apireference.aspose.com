---
title: AsposeOcr.SaveMultipageDocument
second_title: Référence de l'API Aspose.OCR pour .NET
description: AsposeOcr méthode. Permet dobtenir un document multipage à partir de la liste des objets RecognitionResult
type: docs
weight: 250
url: /fr/net/aspose.ocr/asposeocr/savemultipagedocument/
---
## SaveMultipageDocument(string, SaveFormat, List&lt;RecognitionResult&gt;) {#savemultipagedocument_1}

Permet d'obtenir un document multipage à partir de la liste des objets RecognitionResult

```csharp
public static void SaveMultipageDocument(string fullFileName, SaveFormat saveFormat, 
    List<RecognitionResult> results)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| fullFileName | String | Nom de fichier avec un chemin pour enregistrer le résultat de la reconnaissance dans le format sélectionné. |
| saveFormat | SaveFormat | Format des documents (Docx, Txt, Pdf). |
| results | List`1 | Liste de[`RecognitionResult`](../../recognitionresult/) objets. |

### Voir également

* enum [SaveFormat](../../saveformat/)
* class [RecognitionResult](../../recognitionresult/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)

---

## SaveMultipageDocument(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) {#savemultipagedocument}

Permet d'obtenir un document multipage à partir de la liste des objets RecognitionResult

```csharp
public static void SaveMultipageDocument(MemoryStream stream, SaveFormat saveFormat, 
    List<RecognitionResult> results)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | MemoryStream | MemoryStream pour enregistrer le résultat de la reconnaissance dans le format sélectionné. |
| saveFormat | SaveFormat | Format des documents (Docx, Txt, Pdf). |
| results | List`1 | Liste de[`RecognitionResult`](../../recognitionresult/) objets. |

### Voir également

* enum [SaveFormat](../../saveformat/)
* class [RecognitionResult](../../recognitionresult/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)


