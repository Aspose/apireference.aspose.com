---
title: Class RecognitionResult
second_title: Référence de l'API Aspose.OCR pour .NET
description: Aspose.OCR.RecognitionResult classe. Les résultats de la reconnaissance dimage. Contient des éléments avec des informations de reconnaissance et des méthodes dexportation des résultats.
type: docs
weight: 220
url: /fr/net/aspose.ocr/recognitionresult/
---
## RecognitionResult class

Les résultats de la reconnaissance d'image. Contient des éléments avec des informations de reconnaissance et des méthodes d'exportation des résultats.

```csharp
public class RecognitionResult
```

## Propriétés

| Nom | La description |
| --- | --- |
| [Image](../../aspose.ocr/recognitionresult/image/) { get; set; } | Obtient ou définit l'image pour la création de pdf. |
| [RecognitionAreasRectangles](../../aspose.ocr/recognitionresult/recognitionareasrectangles/) { get; } | Obtient les coordonnées des rectangles. |
| [RecognitionAreasText](../../aspose.ocr/recognitionresult/recognitionareastext/) { get; } | Obtient les résultats de reconnaissance de liste d'une liste de zones (Rectangles). |
| [RecognitionCharactersList](../../aspose.ocr/recognitionresult/recognitioncharacterslist/) { get; } | Ensemble de caractères trouvés par l'algorithme de reconnaissance et classés par ordre décroissant de probabilité. |
| [RecognitionLinesResult](../../aspose.ocr/recognitionresult/recognitionlinesresult/) { get; } | Obtient une liste de résultats de reconnaissance avec une liste de lignes (Rectangles). |
| [RecognitionText](../../aspose.ocr/recognitionresult/recognitiontext/) { get; } | Obtient le résultat de la reconnaissance dans une chaîne. |
| [Skew](../../aspose.ocr/recognitionresult/skew/) { get; } | Obtient l'angle d'inclinaison. |
| [Warnings](../../aspose.ocr/recognitionresult/warnings/) { get; } | Obtient la liste des messages d'avertissement décrivant les défauts non critiques apparus lors de la génération. |

## Méthodes

| Nom | La description |
| --- | --- |
| [GetJson](../../aspose.ocr/recognitionresult/getjson/)(bool) | Forme une chaîne JSON avec les résultats de la reconnaissance. |
| [GetSpellCheckCorrectedText](../../aspose.ocr/recognitionresult/getspellcheckcorrectedtext/)(SpellCheckLanguage, string) | Corrige le texte (remplace les mots mal orthographiés). |
| [GetSpellCheckErrorList](../../aspose.ocr/recognitionresult/getspellcheckerrorlist/)(SpellCheckLanguage, string) | Trouver les mots mal orthographiés avec des orthographes suggérées pour un texte d'entrée donné. |
| [GetXml](../../aspose.ocr/recognitionresult/getxml/)() | Formez une chaîne XML avec les résultats de la reconnaissance. |
| [Save](../../aspose.ocr/recognitionresult/save/#save)(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) | Enregistre le document en tant que texte brut, PDF ou document Microsoft Word. |
| [Save](../../aspose.ocr/recognitionresult/save/#save_1)(string, SaveFormat, bool, SpellCheckLanguage, string) | Enregistre le document en tant que texte brut, PDF ou document Microsoft Word. |
| [operator +](../../aspose.ocr/recognitionresult/op_addition/) | Pour compléter le résultat complet à partir des fragments (lignes) reconnus. |

## Autres membres

| Nom | La description |
| --- | --- |
| class [LinesResult](recognitionresult.linesresult/) | Texte reconnu de la ligne avec les coordonnées de la ligne. |

### Voir également

* espace de noms [Aspose.OCR](../../aspose.ocr/)
* Assemblée [Aspose.OCR](../../)


