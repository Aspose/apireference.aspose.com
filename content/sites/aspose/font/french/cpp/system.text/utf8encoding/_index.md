---
title: "classe System::Text::UTF8Encoding"
linktitle: "UTF8Encoding"
second_title: "Aspose.Font pour C++"
description: "Classe System::Text::UTF8Encoding. Encodage UTF-8. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2800
url: /fr/cpp/system.text/utf8encoding/
---
## UTF8Encoding class


Encodage UTF-8. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class UTF8Encoding : public System::Text::ICUEncoding
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() override | Clone l'objet d'encodage. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Compare avec l'objet. |
| [GetHashCode](./gethashcode/)() const override | Obtient le code de hachage de l'encodage. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Obtient le nombre maximal d'octets nécessaires pour encoder un nombre spécifié de caractères. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Obtient le nombre maximal de caractères nécessaires pour décoder un nombre spécifié d'octets. |
| [GetPreamble](./getpreamble/)() override | Obtient le préambule de la page de codes. |
| [operator==](./operator==/)(const UTF8Encoding\&) const | Compare les paramètres des encodages. |
| [UTF8Encoding](./utf8encoding/)() | Constructeur. |
| [UTF8Encoding](./utf8encoding/)(bool) | Constructeur. |
| [UTF8Encoding](./utf8encoding/)(bool, bool) | Constructeur. |
## Champs

| Champ | Description |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Valeur par défaut de la page de codes. |
| static constexpr [UTF8_CODE_PAGE](./utf8_code_page/) | Informations RTTI. |
## Voir aussi

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
