---
title: "classe System::Web::HttpUtility"
linktitle: "HttpUtility"
second_title: "Aspose.Font pour C++"
description: "classe System::Web::HttpUtility. Classe de service qui encode et décode les parties d'URL vers et depuis des fragments d'échappement hexadécimaux en C++."
type: docs
weight: 300
url: /fr/cpp/system.web/httputility/
---
## HttpUtility class


Classe de service qui encode et décode les parties d'URL vers et depuis des fragments d'échappement hexadécimal.

```cpp
class HttpUtility : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [HtmlDecode](./htmldecode/)(const String\&) | Décode le fragment HTML. |
| static [HtmlDecode](./htmldecode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | Décode le fragment HTML. |
| static [HtmlEncode](./htmlencode/)(const String\&) | Encode le fragment HTML. |
| static [HtmlEncode](./htmlencode/)(const SharedPtr\<Object\>\&) | Encode le fragment HTML. |
| static [HtmlEncode](./htmlencode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | Encode le fragment HTML. |
| static [UrlDecode](./urldecode/)(String) | Décode le fragment URI à partir d'une chaîne. |
| static [UrlDecode](./urldecode/)(String, System::SharedPtr\<Text::Encoding\>) | Décode le fragment URI à partir d'une chaîne. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) | Décode le fragment URI à partir d'un tableau d'octets. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) | Décode le fragment URI à partir d'un tableau d'octets. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | Décode le fragment URI à partir d'un tableau d'octets. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&) | Décode le fragment URI à partir d'une chaîne d'octets. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | Décode le fragment URI à partir d'une chaîne. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Décode le fragment URI à partir d'un tableau d'octets. |
| static [UrlEncode](./urlencode/)(String) | Encode le fragment URI. |
| static [UrlEncode](./urlencode/)(String, const System::SharedPtr\<Text::Encoding\>\&) | Encode le fragment URI. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&) | Encode le fragment URI. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Encode le fragment URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&) | Encode le fragment URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | Encode le fragment URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | Encode le fragment URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Encode le fragment URI. |
| static [UrlEncodeUnicode](./urlencodeunicode/)(const String\&) | Encode le fragment URI en utilisant Unicode. |
| static [UrlEncodeUnicodeToBytes](./urlencodeunicodetobytes/)(const String\&) | Encode le fragment URI en utilisant Unicode. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Web](../)
* Library [Aspose.Font for C++](../../)
