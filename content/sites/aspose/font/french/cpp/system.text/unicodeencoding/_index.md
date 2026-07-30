---
title: "System::Text::UnicodeEncoding class"
linktitle: "UnicodeEncoding"
second_title: "Aspose.Font pour C++"
description: "System::Text::UnicodeEncoding class. Encodage Unicode. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne jamais créer d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Toujours encapsuler cette classe dans un pointeur System::SmartPtr et utiliser ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 2500
url: /fr/cpp/system.text/unicodeencoding/
---
## UnicodeEncoding class


Encodage Unicode. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne jamais créer d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Toujours encapsuler cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utiliser ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class UnicodeEncoding : public System::Text::ICUEncoding
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() override | Clone l'objet d'encodage. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Compare les encodages. |
| [GetHashCode](./gethashcode/)() const override | Hache l'encodage. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Obtient le nombre maximal d'octets nécessaires pour encoder un nombre spécifié de caractères. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Obtient le nombre maximal de caractères nécessaires pour décoder un nombre spécifié d'octets. |
| [GetPreamble](./getpreamble/)() override | Renvoie une séquence d'octets qui indique l'encodage (par ex. BOM). |
| [operator==](./operator==/)(const UnicodeEncoding\&) const | Compare les encodages par pages de codes et indicateurs. |
| [UnicodeEncoding](./unicodeencoding/)() | Constructeur. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool) | Constructeur. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool, bool) | Constructeur. |
## Champs

| Champ | Description |
| --- | --- |
| static constexpr [BIG_UNICODE_CODE_PAGE](./big_unicode_code_page/) | Numéro de page de codes big endian. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Valeur par défaut de la page de codes. |
| static constexpr [UNICODE_CODE_PAGE](./unicode_code_page/) | Numéro de page de codes little endian. |
## Voir aussi

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
