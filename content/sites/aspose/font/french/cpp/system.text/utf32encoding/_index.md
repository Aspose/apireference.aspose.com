---
title: "Classe System::Text::UTF32Encoding"
linktitle: "UTF32Encoding"
second_title: "Aspose.Font pour C++"
description: "Classe System::Text::UTF32Encoding. Encodage UTF-32. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject() . Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des fautes d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu’argument en C++."
type: docs
weight: 2600
url: /fr/cpp/system.text/utf32encoding/
---
## UTF32Encoding class


Encodage UTF-32. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des fautes d’assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu’argument.

```cpp
class UTF32Encoding : public System::Text::ICUEncoding
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() override | Clone l'objet d'encodage. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Compare avec l'objet. |
| [GetHashCode](./gethashcode/)() const override | Obtient le code de hachage de l'encodage. |
| [GetPreamble](./getpreamble/)() override | Obtient le préambule de la page de codes. |
| [operator==](./operator==/)(const UTF32Encoding\&) const | Compare les paramètres des encodages. |
| [UTF32Encoding](./utf32encoding/)() | Constructeur. |
| [UTF32Encoding](./utf32encoding/)(bool, bool) | Constructeur. |
| [UTF32Encoding](./utf32encoding/)(bool, bool, bool) | Constructeur. |
## Champs

| Champ | Description |
| --- | --- |
| static constexpr [BIG_UTF32_CODE_PAGE](./big_utf32_code_page/) | Nombre magique utilisé par [Windows](../../system.windows/) pour l’identifiant de page de code UTF-32 big endian. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Valeur par défaut de la page de codes. |
| static constexpr [UTF32_CODE_PAGE](./utf32_code_page/) | Nombre magique utilisé par [Windows](../../system.windows/) pour l’identifiant de page de code UTF-32 little endian. |
## Voir aussi

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
