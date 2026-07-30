---
title: "classe System::Text::UTF7Encoding"
linktitle: "UTF7Encoding"
second_title: "Aspose.Font pour C++"
description: "classe System::Text::UTF7Encoding. Encodage UTF-7. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 2700
url: /fr/cpp/system.text/utf7encoding/
---
## UTF7Encoding class


Encodage UTF-7. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class UTF7Encoding : public System::Text::Encoding
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() override | Clone l'objet d'encodage. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Compare avec l'objet. |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | Obtenez le nombre de caractères nécessaires pour encoder un tampon de caractères. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | Obtenez le nombre de caractères nécessaires pour encoder un tampon de caractères. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | Obtenez le nombre de caractères nécessaires pour encoder un tampon de caractères. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Obtenez le nombre de caractères nécessaires pour encoder un tampon de caractères. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | Obtient le nombre de caractères nécessaires pour encoder une chaîne. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | Obtenez le nombre de caractères nécessaires pour encoder un tampon de caractères. |
| [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) override | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(const String\&) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) override | Obtenez le nombre de caractères nécessaires pour décoder un tampon d'octets. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | Obtenez le nombre de caractères nécessaires pour décoder un tampon d'octets. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Obtenez le nombre de caractères nécessaires pour décoder un tampon d'octets. |
| [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) override | Obtenez les caractères résultant du décodage d'un tampon d'octets. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | Obtenez les caractères résultant du décodage d'un tampon d'octets. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Obtenez les caractères résultant du décodage d'un tampon d'octets. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Obtenez les caractères résultant du décodage d'un tampon d'octets. |
| [GetDecoder](./getdecoder/)() override | Obtenez un décodeur qui transmet les requêtes à cet objet. |
| [GetEncoder](./getencoder/)() override | Obtenez un encodeur qui transmet les requêtes à cet objet. |
| [GetHashCode](./gethashcode/)() const override | Obtient le code de hachage de l'encodage. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Obtient le nombre maximal d'octets nécessaires pour encoder un nombre spécifié de caractères. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Obtient le nombre maximal de caractères nécessaires pour décoder un nombre spécifié d'octets. |
| [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) override | Décode un tampon d'octets en une chaîne. |
| virtual [GetString](./getstring/)(uint8_t *, int) | Décode un tampon d'octets en une chaîne. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | Décode un tampon d'octets en une chaîne. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | Décode un tampon d'octets en une chaîne. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | Décode un tampon d'octets en une chaîne. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | Décode un tampon d'octets en une chaîne. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | Décode un tampon d'octets en une chaîne. |
| [operator==](./operator==/)(const UTF7Encoding\&) const | Compare les paramètres des encodages. |
| [UTF7Encoding](./utf7encoding/)() | Constructeur. |
| [UTF7Encoding](./utf7encoding/)(bool) | Constructeur. |
## Champs

| Champ | Description |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Valeur par défaut de la page de codes. |
| static constexpr [UTF7_CODE_PAGE](./utf7_code_page/) | Nombre magique utilisé par [Windows](../../system.windows/) pour l'identifiant de la page de code UTF-7. |
## Voir aussi

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
