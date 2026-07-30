---
title: "Aspose::Font::MultiLanguageString classe"
linktitle: "MultiLanguageString"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::MultiLanguageString classe. Représente une chaîne multilingue en C++."
type: docs
weight: 2800
url: /fr/cpp/aspose.font/multilanguagestring/
---
## MultiLanguageString class


Représente une chaîne multilingue.

```cpp
class MultiLanguageString : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AddLanguageString](./addlanguagestring/)(System::String, int32_t) | Ajoute une chaîne d'une langue spécifique. |
| [ContainsString](./containsstring/)(System::String) | Renvoie vrai si la chaîne est présente dans toutes les chaînes de langue. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Renvoie vrai si les objets sont considérés égaux. |
| [get_IsEmpty](./get_isempty/)() | Vrai, si [MultiLanguageString](./) n'a pas de chaînes de langues. |
| [GetAllLanguageIds](./getalllanguageids/)() | Obtient les identifiants de langue pour toutes les chaînes ou un tableau vide si aucune chaîne n'est présente. |
| [GetAllStrings](./getallstrings/)() | Renvoie toutes les chaînes de toutes les langues. |
| [GetEnglishString](./getenglishstring/)() | Renvoie la chaîne anglaise si elle est trouvée. Sinon renvoie la première chaîne non anglaise. |
| [GetHashCode](./gethashcode/)() const override | Implémentation de GetHashCode. |
| [GetStringForLanguageId](./getstringforlanguageid/)(int32_t) | Renvoie la chaîne liée à l'identifiant de langue fourni, si elle est trouvée. Chaîne vide sinon. |
| [MultiLanguageString](./multilanguagestring/)() | Crée une chaîne multilingue vide. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
