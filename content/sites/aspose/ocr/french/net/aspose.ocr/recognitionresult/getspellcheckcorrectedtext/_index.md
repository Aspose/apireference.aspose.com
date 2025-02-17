---
title: RecognitionResult.GetSpellCheckCorrectedText
second_title: Référence de l'API Aspose.OCR pour .NET
description: RecognitionResult méthode. Corrige le texte remplace les mots mal orthographiés.
type: docs
weight: 100
url: /fr/net/aspose.ocr/recognitionresult/getspellcheckcorrectedtext/
---
## RecognitionResult.GetSpellCheckCorrectedText method

Corrige le texte (remplace les mots mal orthographiés).

```csharp
public string GetSpellCheckCorrectedText(SpellCheckLanguage language = SpellCheckLanguage.Eng, 
    string dictionaryPath = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| language | SpellCheckLanguage | Dictionnaire à utiliser. |
| dictionaryPath | String | En option. Chemin complet vers le dictionnaire utilisateur (dictionnaire de fréquences). Format de fichier du dictionnaire : Fichier texte brut en codage UTF-8. Le mot et la fréquence des mots sont séparés par un espace ou une tabulation. Par défaut, le mot est attendu dans la première colonne et la fréquence dans la deuxième colonne. Chaque mot- paire de fréquences dans une ligne séparée. Une ligne est définie comme une séquence de caractères suivie d'un saut de ligne ("\n"), d'un retour chariot ("\r"), ou d'un retour chariot immédiatement suivi d'un saut de ligne ("\r\n"). Chaque mot doit être en minuscules. |

### Return_Value

Texte avec mots remplacés.

### Voir également

* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* espace de noms [Aspose.OCR](../../recognitionresult/)
* Assemblée [Aspose.OCR](../../../)


