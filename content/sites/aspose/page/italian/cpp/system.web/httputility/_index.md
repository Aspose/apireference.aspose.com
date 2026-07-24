---
title: "System::Web::HttpUtility classe"
linktitle: "HttpUtility"
second_title: "Aspose.Page per C++"
description: "System::Web::HttpUtility classe. Classe di servizio che codifica e decodifica parti di URL da e verso frammenti di escape esadecimali in C++."
type: docs
weight: 300
url: /it/cpp/system.web/httputility/
---
## HttpUtility class


Classe di servizio che codifica e decodifica le parti di URL da e verso frammenti di escape esadecimali.

```cpp
class HttpUtility : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [HtmlDecode](./htmldecode/)(const String\&) | Decodifica frammento HTML. |
| static [HtmlDecode](./htmldecode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | Decodifica frammento HTML. |
| static [HtmlEncode](./htmlencode/)(const String\&) | Codifica frammento HTML. |
| static [HtmlEncode](./htmlencode/)(const SharedPtr\<Object\>\&) | Codifica frammento HTML. |
| static [HtmlEncode](./htmlencode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | Codifica frammento HTML. |
| static [UrlDecode](./urldecode/)(String) | Decodifica frammento URI da stringa. |
| static [UrlDecode](./urldecode/)(String, System::SharedPtr\<Text::Encoding\>) | Decodifica frammento URI da stringa. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) | Decodifica frammento URI da array di byte. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) | Decodifica frammento URI da array di byte. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | Decodifica frammento URI da array di byte. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&) | Decodifica frammento URI da stringa di byte. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | Decodifica frammento URI da stringa. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Decodifica frammento URI da array di byte. |
| static [UrlEncode](./urlencode/)(String) | Codifica frammento URI. |
| static [UrlEncode](./urlencode/)(String, const System::SharedPtr\<Text::Encoding\>\&) | Codifica frammento URI. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&) | Codifica frammento URI. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Codifica frammento URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&) | Codifica frammento URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | Codifica frammento URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | Codifica frammento URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Codifica frammento URI. |
| static [UrlEncodeUnicode](./urlencodeunicode/)(const String\&) | Codifica il frammento URI usando Unicode. |
| static [UrlEncodeUnicodeToBytes](./urlencodeunicodetobytes/)(const String\&) | Codifica il frammento URI usando Unicode. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Web](../)
* Library [Aspose.Page for C++](../../)
