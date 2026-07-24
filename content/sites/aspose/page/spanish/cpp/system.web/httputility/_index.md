---
title: "System::Web::HttpUtility clase"
linktitle: "HttpUtility"
second_title: "Aspose.Page para C++"
description: "System::Web::HttpUtility clase. Clase de servicio que codifica y decodifica partes de URL a y desde fragmentos de escape hexadecimal en C++."
type: docs
weight: 300
url: /es/cpp/system.web/httputility/
---
## HttpUtility class


Clase de servicio que codifica y decodifica partes de URL hacia y desde fragmentos de escape hexadecimales.

```cpp
class HttpUtility : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| static [HtmlDecode](./htmldecode/)(const String\&) | Decodifica fragmento HTML. |
| static [HtmlDecode](./htmldecode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | Decodifica fragmento HTML. |
| static [HtmlEncode](./htmlencode/)(const String\&) | Codifica fragmento HTML. |
| static [HtmlEncode](./htmlencode/)(const SharedPtr\<Object\>\&) | Codifica fragmento HTML. |
| static [HtmlEncode](./htmlencode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | Codifica fragmento HTML. |
| static [UrlDecode](./urldecode/)(String) | Decodifica fragmento URI desde cadena. |
| static [UrlDecode](./urldecode/)(String, System::SharedPtr\<Text::Encoding\>) | Decodifica fragmento URI desde cadena. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) | Decodifica fragmento URI desde matriz de bytes. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) | Decodifica fragmento URI desde matriz de bytes. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | Decodifica fragmento URI desde matriz de bytes. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&) | Decodifica fragmento URI desde cadena de bytes. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | Decodifica fragmento URI desde cadena. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Decodifica fragmento URI desde matriz de bytes. |
| static [UrlEncode](./urlencode/)(String) | Codifica fragmento URI. |
| static [UrlEncode](./urlencode/)(String, const System::SharedPtr\<Text::Encoding\>\&) | Codifica fragmento URI. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&) | Codifica fragmento URI. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Codifica fragmento URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&) | Codifica fragmento URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | Codifica fragmento URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | Codifica fragmento URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Codifica fragmento URI. |
| static [UrlEncodeUnicode](./urlencodeunicode/)(const String\&) | Codifica fragmento de URI usando Unicode. |
| static [UrlEncodeUnicodeToBytes](./urlencodeunicodetobytes/)(const String\&) | Codifica fragmento de URI usando Unicode. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Web](../)
* Library [Aspose.Page for C++](../../)
