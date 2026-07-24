---
title: "System::Web::HttpUtility κλάση"
linktitle: "HttpUtility"
second_title: "Aspose.Page για C++"
description: "System::Web::HttpUtility κλάση. Κλάση υπηρεσίας που κωδικοποιεί και αποκωδικοποιεί τμήματα URL σε και από δεκαεξαδικά τμήματα διαφυγής σε C++."
type: docs
weight: 300
url: /el/cpp/system.web/httputility/
---
## HttpUtility class


Κατηγορία υπηρεσίας που κωδικοποιεί και αποκωδικοποιεί τμήματα URL σε και από δεκαεξαδικά τμήματα διαφυγής.

```cpp
class HttpUtility : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [HtmlDecode](./htmldecode/)(const String\&) | Αποκωδικοποιεί τμήμα Html. |
| static [HtmlDecode](./htmldecode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | Αποκωδικοποιεί τμήμα Html. |
| static [HtmlEncode](./htmlencode/)(const String\&) | Κωδικοποιεί τμήμα Html. |
| static [HtmlEncode](./htmlencode/)(const SharedPtr\<Object\>\&) | Κωδικοποιεί τμήμα Html. |
| static [HtmlEncode](./htmlencode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | Κωδικοποιεί τμήμα Html. |
| static [UrlDecode](./urldecode/)(String) | Αποκωδικοποιεί τμήμα URI από συμβολοσειρά. |
| static [UrlDecode](./urldecode/)(String, System::SharedPtr\<Text::Encoding\>) | Αποκωδικοποιεί τμήμα URI από συμβολοσειρά. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) | Αποκωδικοποιεί τμήμα URI από πίνακα bytes. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) | Αποκωδικοποιεί τμήμα URI από πίνακα bytes. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | Αποκωδικοποιεί τμήμα URI από πίνακα bytes. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&) | Αποκωδικοποιεί τμήμα URI από συμβολοσειρά bytes. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | Αποκωδικοποιεί τμήμα URI από συμβολοσειρά. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Αποκωδικοποιεί τμήμα URI από πίνακα bytes. |
| static [UrlEncode](./urlencode/)(String) | Κωδικοποιεί τμήμα URI. |
| static [UrlEncode](./urlencode/)(String, const System::SharedPtr\<Text::Encoding\>\&) | Κωδικοποιεί τμήμα URI. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&) | Κωδικοποιεί τμήμα URI. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Κωδικοποιεί τμήμα URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&) | Κωδικοποιεί τμήμα URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | Κωδικοποιεί τμήμα URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | Κωδικοποιεί τμήμα URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Κωδικοποιεί τμήμα URI. |
| static [UrlEncodeUnicode](./urlencodeunicode/)(const String\&) | Κωδικοποιεί το τμήμα URI χρησιμοποιώντας Unicode. |
| static [UrlEncodeUnicodeToBytes](./urlencodeunicodetobytes/)(const String\&) | Κωδικοποιεί το τμήμα URI χρησιμοποιώντας Unicode. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Web](../)
* Library [Aspose.Page for C++](../../)
