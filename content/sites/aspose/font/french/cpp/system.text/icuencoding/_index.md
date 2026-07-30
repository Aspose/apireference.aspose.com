---
title: "System::Text::ICUEncoding class"
linktitle: "ICUEncoding"
second_title: "Aspose.Font pour C++"
description: "System::Text::ICUEncoding class. Implémentation d'encodage basée sur ICU. POUR USAGE INTERNE. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2200
url: /fr/cpp/system.text/icuencoding/
---
## ICUEncoding class


Implémentation d'encodage basée sur ICU. POUR USAGE INTERNE. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument.

```cpp
class ICUEncoding : public System::Text::Encoding
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | Obtenez le nombre de caractères nécessaires pour encoder un tampon de caractères. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | RTTI. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | RTTI. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(const String\&) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | Obtenez le nombre de caractères nécessaires pour décoder un tampon d'octets. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Obtenez le nombre de caractères nécessaires pour décoder un tampon d'octets. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Obtenez le nombre de caractères nécessaires pour décoder un tampon d'octets. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | Obtenez les caractères résultant du décodage d'un tampon d'octets. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Obtenez les caractères résultant du décodage d'un tampon d'octets. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Obtenez les caractères résultant du décodage d'un tampon d'octets. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Obtenez les caractères résultant du décodage d'un tampon d'octets. |
| [GetDecoder](./getdecoder/)() override | Obtenez un décodeur qui transmet les requêtes à cet objet. |
| [GetEncoder](./getencoder/)() override | Obtenez un encodeur qui transmet les requêtes à cet objet. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Obtient le nombre maximal d'octets nécessaires pour encoder un nombre spécifié de caractères. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Obtient le nombre maximal de caractères nécessaires pour décoder un nombre spécifié d'octets. |
| [GetPreamble](./getpreamble/)() override | Renvoie une séquence d'octets qui indique l'encodage (par ex. BOM). |
| [ICUEncoding](./icuencoding/)(const Details::EncodingInfoInternal *) | Constructeur. |
| [operator==](./operator==/)(const ICUEncoding\&) const | Compare les encodages en utilisant les pages de code. |
## Champs

| Champ | Description |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Valeur par défaut de la page de codes. |
## Voir aussi

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
