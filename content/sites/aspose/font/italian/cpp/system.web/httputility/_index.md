---
title: "System::Web::HttpUtility classe"
linktitle: "HttpUtility"
second_title: "Aspose.Font per C++"
description: "System::Web::HttpUtility classe. Classe di servizio che codifica e decodifica parti di URL da e verso frammenti di escape esadecimali in C++."
type: docs
weight: 300
url: /it/cpp/system.web/httputility/
---
## HttpUtility class


Classe di servizio che codifica e decodifica parti di URL in e da frammenti di escape esadecimali.

```cpp
class HttpUtility : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [HtmlDecode](./htmldecode/)(const String\&) | Decodifica frammento Html. |
| static [HtmlDecode](./htmldecode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | Decodifica frammento Html. |
| static [HtmlEncode](./htmlencode/)(const String\&) | Codifica frammento Html. |
| static [HtmlEncode](./htmlencode/)(const SharedPtr\<Object\>\&) | Codifica frammento Html. |
| static [HtmlEncode](./htmlencode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | Codifica frammento Html. |
| static [UrlDecode](./urldecode/)(String) | Decodifica frammento URI da stringa. |
| static [UrlDecode](./urldecode/)(String, System::SharedPtr\<Text::Encoding\>) | Decodifica frammento URI da stringa. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) | Decodifica il frammento URI da un array di byte. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) | Decodifica il frammento URI da un array di byte. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | Decodifica il frammento URI da un array di byte. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&) | Decodifica il frammento URI da una stringa di byte. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | Decodifica frammento URI da stringa. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Decodifica il frammento URI da un array di byte. |
| static [UrlEncode](./urlencode/)(String) | Codifica il frammento URI. |
| static [UrlEncode](./urlencode/)(String, const System::SharedPtr\<Text::Encoding\>\&) | Codifica il frammento URI. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&) | Codifica il frammento URI. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Codifica il frammento URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&) | Codifica il frammento URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | Codifica il frammento URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | Codifica il frammento URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Codifica il frammento URI. |
| static [UrlEncodeUnicode](./urlencodeunicode/)(const String\&) | Codifica il frammento URI usando Unicode. |
| static [UrlEncodeUnicodeToBytes](./urlencodeunicodetobytes/)(const String\&) | Codifica il frammento URI usando Unicode. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Web](../)
* Library [Aspose.Font for C++](../../)
