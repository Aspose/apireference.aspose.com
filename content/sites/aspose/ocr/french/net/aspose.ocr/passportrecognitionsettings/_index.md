---
title: Class PassportRecognitionSettings
second_title: Référence de l'API Aspose.OCR pour .NET
description: Aspose.OCR.PassportRecognitionSettings classe. Paramètres pour la reconnaissance du passeport. Contient des éléments permettant de personnaliser le processus de reconnaissance.
type: docs
weight: 190
url: /fr/net/aspose.ocr/passportrecognitionsettings/
---
## PassportRecognitionSettings class

Paramètres pour la reconnaissance du passeport. Contient des éléments permettant de personnaliser le processus de reconnaissance.

```csharp
public class PassportRecognitionSettings : ReceiptRecognitionSettings
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [PassportRecognitionSettings](passportrecognitionsettings/)(Language) | Initialise une nouvelle instance du`PassportRecognitionSettings`classe avec un ensemble complet de propriétés. |

## Propriétés

| Nom | La description |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/receiptrecognitionsettings/allowedcharacters/) { get; set; } | Jeu de caractères autorisés. Détermine le type de caractères autorisés pour le résultat de la reconnaissance. |
| [AutoSkew](../../aspose.ocr/receiptrecognitionsettings/autoskew/) { set; } | Obtient ou définit un indicateur indiquant si la correction automatique de l'inclinaison de l'image doit être activée. Activé (true) par défaut. |
| [IgnoredCharacters](../../aspose.ocr/receiptrecognitionsettings/ignoredcharacters/) { get; set; } | Définit la liste noire des symboles de reconnaissance. |
| [Language](../../aspose.ocr/receiptrecognitionsettings/language/) { set; } | Obtient ou définit la langue utilisée pour l'OCR.  Détermine l'alphabet utilisé lors de la reconnaissance. Multi-langue par défaut. |
| [PreprocessingFilters](../../aspose.ocr/receiptrecognitionsettings/preprocessingfilters/) { get; set; } | Permet de préparer l'image pour l'OCR en ajustant les méthodes de prétraitement. |
| [ThreadsCount](../../aspose.ocr/receiptrecognitionsettings/threadscount/) { set; } | Obtient ou définit le nombre de threads pour le traitement. Par défaut, 0 signifie que l'image sera traitée avec un nombre de threads égal à votre nombre de processeurs. ThreadsCount = 1 signifie que l'image sera traitée dans le thread principal. |

### Voir également

* class [ReceiptRecognitionSettings](../receiptrecognitionsettings/)
* espace de noms [Aspose.OCR](../../aspose.ocr/)
* Assemblée [Aspose.OCR](../../)


