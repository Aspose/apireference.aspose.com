---
title: "classe System::Text::Encoding"
linktitle: "Encoding"
second_title: "Aspose.Font pour C++"
description: "classe System::Text::Encoding. Services d'encodage en C++."
type: docs
weight: 1600
url: /fr/cpp/system.text/encoding/
---
## Encoding class


[Encoding](./) services.

```cpp
class Encoding : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Clone](./clone/)() | Clone l'objet d'encodage. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&) | Convertit les octets entre deux encodages. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&, int, int) | Convertit les octets entre deux encodages. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Compare les encodages. |
| static [get_ASCII](./get_ascii/)() | Obtient l'encodage ASCII. |
| static [get_BigEndianUnicode](./get_bigendianunicode/)() | Obtient l'objet d'encodage Unicode standard big-endian. |
| static [get_BigEndianUTF32](./get_bigendianutf32/)() | Obtient l'objet d'encodage UTF-32 standard big-endian. |
| virtual [get_BodyName](./get_bodyname/)() | Obtient le nom d'encodage compatible avec le corps de l'agent de messagerie. |
| virtual [get_CodePage](./get_codepage/)() | Obtient l'ID de la page de codes [Windows](../../system.windows/). |
| [get_DecoderFallback](./get_decoderfallback/)() const | Obtient le repli du décodage. |
| static [get_Default](./get_default/)() | Obtient l'encodage par défaut. |
| [get_EncoderFallback](./get_encoderfallback/)() const | Obtient le repli de l'encodeur. |
| virtual [get_EncodingName](./get_encodingname/)() | Obtient le nom d'encodage lisible par l'homme. |
| virtual [get_HeaderName](./get_headername/)() | Obtient le nom d'encodage compatible avec l'en-tête de l'agent de messagerie. |
| virtual [get_IsBrowserDisplay](./get_isbrowserdisplay/)() | Vérifie si l'encodage peut être utilisé dans le navigateur pour afficher le contenu. |
| virtual [get_IsBrowserSave](./get_isbrowsersave/)() | Vérifie si l'encodage peut être utilisé dans le navigateur pour enregistrer le contenu. |
| virtual [get_IsMailNewsDisplay](./get_ismailnewsdisplay/)() | Vérifie si l'encodage peut être utilisé dans le client de messagerie pour afficher le contenu. |
| virtual [get_IsMailNewsSave](./get_ismailnewssave/)() | Vérifie si l'encodage peut être utilisé dans le client de messagerie pour enregistrer le contenu. |
| [get_IsReadOnly](./get_isreadonly/)() | Vérifie si l'encodage est en lecture seule. |
| virtual [get_IsSingleByte](./get_issinglebyte/)() | Vérifie si l'encodage est à octet unique. |
| static [get_Latin1](./get_latin1/)() | Obtient l'encodage Latin1. POUR USAGE INTERNE. |
| static [get_Unicode](./get_unicode/)() | Obtient l'objet d'encodage Unicode standard. |
| static [get_UTF32](./get_utf32/)() |  |
| static [get_UTF7](./get_utf7/)() | Obtient l'objet d'encodage UTF-7 standard. |
| static [get_UTF8](./get_utf8/)() | Obtient l'objet d'encodage UTF-8 standard. |
| static [get_UTF8Unmarked](./get_utf8unmarked/)() | Interne uniquement, à utiliser par les bibliothèques de classes : non marqué et ne validant pas l'entrée. |
| virtual [get_WebName](./get_webname/)() | Obtient le nom d'encodage compatible IANA. |
| virtual [get_WindowsCodePage](./get_windowscodepage/)() | Obtient l'ID de la page de codes [Windows](../../system.windows/). |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | Obtenez le nombre de caractères nécessaires pour encoder un tampon de caractères. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | Obtenez le nombre de caractères nécessaires pour encoder un tampon de caractères. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Obtenez le nombre de caractères nécessaires pour encoder un tampon de caractères. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | Obtient le nombre de caractères nécessaires pour encoder une chaîne. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | Obtenez le nombre de caractères nécessaires pour encoder un tampon de caractères. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int) | Obtenez le nombre de caractères nécessaires pour encoder un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(const String\&) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) | Obtenez les octets résultant de l'encodage d'un tampon de caractères. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Obtenez le nombre de caractères nécessaires pour décoder un tampon d'octets. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Obtenez le nombre de caractères nécessaires pour décoder un tampon d'octets. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int) | Obtenez le nombre de caractères nécessaires pour décoder un tampon d'octets. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Obtenez les caractères résultant du décodage d'un tampon d'octets. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Obtenez les caractères résultant du décodage d'un tampon d'octets. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Obtenez les caractères résultant du décodage d'un tampon d'octets. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) | Obtenez les caractères résultant du décodage d'un tampon d'octets. |
| virtual [GetDecoder](./getdecoder/)() | Obtenez un décodeur qui transmet les requêtes à cet objet. |
| virtual [GetEncoder](./getencoder/)() | Obtenez un encodeur qui transmet les requêtes à cet objet. |
| static [GetEncoding](./getencoding/)(const String\&) | Obtient l'encodage par nom. |
| static [GetEncoding](./getencoding/)(int) | Obtient l'encodage par page de codes. |
| static [GetEncoding](./getencoding/)(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | Obtient l'encodage par page de codes. |
| static [GetEncoding](./getencoding/)(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | Obtient l'encodage par nom. |
| static [GetEncodings](./getencodings/)() | Obtient la liste des encodages connus. |
| [GetHashCode](./gethashcode/)() const override | Hache l'encodage. |
| virtual [GetMaxByteCount](./getmaxbytecount/)(int) | Obtient le nombre maximal d'octets nécessaires pour encoder un nombre spécifié de caractères. |
| virtual [GetMaxCharCount](./getmaxcharcount/)(int) | Obtient le nombre maximal de caractères nécessaires pour décoder un nombre spécifié d'octets. |
| virtual [GetPreamble](./getpreamble/)() | Renvoie une séquence d'octets qui indique l'encodage (par ex. BOM). |
| virtual [GetString](./getstring/)(uint8_t *, int) | Décode un tampon d'octets en une chaîne. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | Décode un tampon d'octets en une chaîne. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | Décode un tampon d'octets en une chaîne. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | Décode un tampon d'octets en une chaîne. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) | Décode un tampon d'octets en une chaîne. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | Décode un tampon d'octets en une chaîne. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | Décode un tampon d'octets en une chaîne. |
| [set_DecoderFallback](./set_decoderfallback/)(const DecoderFallbackPtr\&) | Définit le repli du décodage. |
| [set_EncoderFallback](./set_encoderfallback/)(const EncoderFallbackPtr\&) | Définit le repli de l'encodage. |
## Champs

| Champ | Description |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](./default_code_page/) | Valeur par défaut de la page de codes. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | RTTI. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
