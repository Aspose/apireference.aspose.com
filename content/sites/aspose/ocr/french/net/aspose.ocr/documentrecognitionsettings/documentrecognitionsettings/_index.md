---
title: DocumentRecognitionSettings.DocumentRecognitionSettings
second_title: Référence de l'API Aspose.OCR pour .NET
description: DocumentRecognitionSettings constructeur. Initialise une nouvelle instance duDocumentRecognitionSettings classe avec un ensemble court de propriétés.
type: docs
weight: 10
url: /fr/net/aspose.ocr/documentrecognitionsettings/documentrecognitionsettings/
---
## DocumentRecognitionSettings(int, int) {#constructor}

Initialise une nouvelle instance du[`DocumentRecognitionSettings`](../) classe avec un ensemble court de propriétés.

```csharp
public DocumentRecognitionSettings(int startPage = 0, int pagesNumber = 1)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| startPage | Int32 | Définissez la première page pour la reconnaissance. 0 par défaut. |
| pagesNumber | Int32 | Définissez le nombre de pages pour le fichier pdf multipage de reconnaissance. |

### Voir également

* class [DocumentRecognitionSettings](../)
* espace de noms [Aspose.OCR](../../documentrecognitionsettings/)
* Assemblée [Aspose.OCR](../../../)

---

## DocumentRecognitionSettings(int, int, Language, bool, bool, int) {#constructor_1}

Initialise une nouvelle instance du[`DocumentRecognitionSettings`](../)classe avec un ensemble complet de propriétés.

```csharp
public DocumentRecognitionSettings(int startPage, int pagesNumber, 
    Language language = Language.None, bool detectAreas = true, bool autoSkew = true, 
    int threshold = 0)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| startPage | Int32 | Définissez la première page pour la reconnaissance. 0 par défaut. |
| pagesNumber | Int32 | Définissez le nombre de pages pour le fichier pdf multipage de reconnaissance. |
| language | Language | Langue utilisée pour l'OCR. |
| detectAreas | Boolean | Activer la détection automatique des zones de texte. |
| autoSkew | Boolean | Activez la correction automatique de l'inclinaison de l'image. |
| threshold | Int32 | Seuil de binarisation d'image personnalisé. |

### Voir également

* enum [Language](../../language/)
* class [DocumentRecognitionSettings](../)
* espace de noms [Aspose.OCR](../../documentrecognitionsettings/)
* Assemblée [Aspose.OCR](../../../)


