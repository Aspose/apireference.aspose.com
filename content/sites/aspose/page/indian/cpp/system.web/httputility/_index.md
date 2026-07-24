---
title: "System::Web::HttpUtility class"
linktitle: "HttpUtility"
second_title: "Aspose.Page C++ के लिए"
description: "System::Web::HttpUtility class. C++ में URL भागों को हेक्स एस्केप फ्रैगमेंट्स में एन्कोड और डिकोड करने वाली सर्विस क्लास।"
type: docs
weight: 300
url: /hi/cpp/system.web/httputility/
---
## HttpUtility class


हेक्स एस्केप फ्रैगमेंट्स में और उनसे URL भागों को एन्कोड और डिकोड करने वाली सर्विस क्लास।

```cpp
class HttpUtility : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [HtmlDecode](./htmldecode/)(const String\&) | HTML फ्रैगमेंट को डिकोड करता है। |
| static [HtmlDecode](./htmldecode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | HTML फ्रैगमेंट को डिकोड करता है। |
| static [HtmlEncode](./htmlencode/)(const String\&) | HTML फ्रैगमेंट को एन्कोड करता है। |
| static [HtmlEncode](./htmlencode/)(const SharedPtr\<Object\>\&) | HTML फ्रैगमेंट को एन्कोड करता है। |
| static [HtmlEncode](./htmlencode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | HTML फ्रैगमेंट को एन्कोड करता है। |
| static [UrlDecode](./urldecode/)(String) | स्ट्रिंग से URI फ्रैगमेंट को डिकोड करता है। |
| static [UrlDecode](./urldecode/)(String, System::SharedPtr\<Text::Encoding\>) | स्ट्रिंग से URI फ्रैगमेंट को डिकोड करता है। |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) | बाइट्स एरे से URI फ्रैगमेंट को डिकोड करता है। |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) | बाइट्स एरे से URI फ्रैगमेंट को डिकोड करता है। |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | बाइट्स एरे से URI फ्रैगमेंट को डिकोड करता है। |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&) | बाइट्स स्ट्रिंग से URI फ्रैगमेंट को डिकोड करता है। |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | स्ट्रिंग से URI फ्रैगमेंट को डिकोड करता है। |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | बाइट्स एरे से URI फ्रैगमेंट को डिकोड करता है। |
| static [UrlEncode](./urlencode/)(String) | URI फ्रैगमेंट को एन्कोड करता है। |
| static [UrlEncode](./urlencode/)(String, const System::SharedPtr\<Text::Encoding\>\&) | URI फ्रैगमेंट को एन्कोड करता है। |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&) | URI फ्रैगमेंट को एन्कोड करता है। |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | URI फ्रैगमेंट को एन्कोड करता है। |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&) | URI फ्रैगमेंट को एन्कोड करता है। |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | URI फ्रैगमेंट को एन्कोड करता है। |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | URI फ्रैगमेंट को एन्कोड करता है। |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | URI फ्रैगमेंट को एन्कोड करता है। |
| static [UrlEncodeUnicode](./urlencodeunicode/)(const String\&) | Unicode का उपयोग करके URI फ्रैगमेंट को एन्कोड करता है। |
| static [UrlEncodeUnicodeToBytes](./urlencodeunicodetobytes/)(const String\&) | Unicode का उपयोग करके URI फ्रैगमेंट को एन्कोड करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Web](../)
* Library [Aspose.Page for C++](../../)
