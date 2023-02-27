---
title: RecognitionResult.Save
second_title: Référence de l'API Aspose.OCR pour .NET
description: RecognitionResult méthode. Enregistre le document en tant que texte brut PDF ou document Microsoft Word.
type: docs
weight: 130
url: /fr/net/aspose.ocr/recognitionresult/save/
---
## Save(string, SaveFormat, bool, SpellCheckLanguage, string) {#save_1}

Enregistre le document en tant que texte brut, PDF ou document Microsoft Word.

```csharp
public void Save(string fullFileName, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| fullFileName | String | Nom de fichier avec un chemin pour enregistrer le résultat de la reconnaissance dans le format sélectionné. |
| saveFormat | SaveFormat | Format des documents (Docx, Txt, Pdf). |
| applySpellingCorrection | Boolean | Définissez true pour corriger les mots mal orthographiés au cas où vous en auriez dans votre résultat de reconnaissance. |
| language | SpellCheckLanguage | Dictionnaire pour le correcteur orthographique (facultatif). |
| dictionaryPath | String | En option. Chemin d'accès complet au dictionnaire utilisateur au format .txt. Le format est [mot - espace - fréquence(nombre)]. Exemple : le 23135851162\nque 3400031103\n |

### Voir également

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* espace de noms [Aspose.OCR](../../recognitionresult/)
* Assemblée [Aspose.OCR](../../../)

---

## Save(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) {#save}

Enregistre le document en tant que texte brut, PDF ou document Microsoft Word.

```csharp
public void Save(MemoryStream stream, SaveFormat saveFormat, bool applySpellingCorrection = false, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | MemoryStream | MemoryStream pour enregistrer le résultat de la reconnaissance dans le format sélectionné. |
| saveFormat | SaveFormat | Format des documents (Docx, Txt, Pdf). |
| applySpellingCorrection | Boolean | Définissez true pour corriger les mots mal orthographiés au cas où vous en auriez dans votre résultat de reconnaissance. |
| language | SpellCheckLanguage | Dictionnaire pour le correcteur orthographique (facultatif). |
| dictionaryPath | String | En option. Chemin d'accès complet au dictionnaire utilisateur au format .txt. Le format est [mot - espace - fréquence(nombre)]. Exemple : le 23135851162\nque 3400031103\n |

### Voir également

* enum [SaveFormat](../../saveformat/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* espace de noms [Aspose.OCR](../../recognitionresult/)
* Assemblée [Aspose.OCR](../../../)


