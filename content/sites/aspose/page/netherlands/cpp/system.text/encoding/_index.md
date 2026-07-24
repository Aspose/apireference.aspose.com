---
title: "System::Text::Encoding class"
linktitle: "Encoding"
second_title: "Aspose.Page voor C++"
description: "System::Text::Encoding class. Coderingdiensten in C++."
type: docs
weight: 1600
url: /nl/cpp/system.text/encoding/
---
## Encoding class


[Encoding](./) services.

```cpp
class Encoding : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Clone](./clone/)() | Kopieert coderingsobject. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&) | Converteert bytes tussen twee coderingen. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&, int, int) | Converteert bytes tussen twee coderingen. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Vergelijkt coderingen. |
| static [get_ASCII](./get_ascii/)() | Haalt ASCII-codering op. |
| static [get_BigEndianUnicode](./get_bigendianunicode/)() | Haalt het standaard big-endian Unicode-coderingobject op. |
| static [get_BigEndianUTF32](./get_bigendianutf32/)() | Haalt het standaard big-endian UTF-32-coderingobject op. |
| virtual [get_BodyName](./get_bodyname/)() | Haalt de naam van de mailagent-compatibele codering voor de body op. |
| virtual [get_CodePage](./get_codepage/)() | Haalt [Windows](../../system.windows/) codepagina-ID op. |
| [get_DecoderFallback](./get_decoderfallback/)() const | Haalt decoderfallback op. |
| static [get_Default](./get_default/)() | Haalt standaardcodering op. |
| [get_EncoderFallback](./get_encoderfallback/)() const | Haalt encoderfallback op. |
| virtual [get_EncodingName](./get_encodingname/)() | Haalt menselijk leesbare coderingnaam op. |
| virtual [get_HeaderName](./get_headername/)() | Haalt de naam van de mailagent-compatibele codering voor de header op. |
| virtual [get_IsBrowserDisplay](./get_isbrowserdisplay/)() | Controleert of codering kan worden gebruikt in browser om inhoud weer te geven. |
| virtual [get_IsBrowserSave](./get_isbrowsersave/)() | Controleert of codering kan worden gebruikt in browser om inhoud op te slaan. |
| virtual [get_IsMailNewsDisplay](./get_ismailnewsdisplay/)() | Controleert of codering kan worden gebruikt in e-mailclient om inhoud weer te geven. |
| virtual [get_IsMailNewsSave](./get_ismailnewssave/)() | Controleert of codering kan worden gebruikt in e-mailclient om inhoud op te slaan. |
| [get_IsReadOnly](./get_isreadonly/)() | Controleert of codering alleen-lezen is. |
| virtual [get_IsSingleByte](./get_issinglebyte/)() | Controleert of codering één byte is. |
| static [get_Latin1](./get_latin1/)() | Haalt Latin1-codering op. VOOR INTERN GEBRUIK. |
| static [get_Unicode](./get_unicode/)() | Haalt het standaard Unicode‑coderingobject op. |
| static [get_UTF32](./get_utf32/)() |  |
| static [get_UTF7](./get_utf7/)() | Haalt het standaard UTF-7‑coderingobject op. |
| static [get_UTF8](./get_utf8/)() | Haalt het standaard UTF-8‑coderingobject op. |
| static [get_UTF8Unmarked](./get_utf8unmarked/)() | Alleen intern, te gebruiken door de klassebibliotheken: Niet gemarkeerd en niet‑invoervalidatie. |
| virtual [get_WebName](./get_webname/)() | Haalt IANA‑compatibele coderingnaam op. |
| virtual [get_WindowsCodePage](./get_windowscodepage/)() | Haalt [Windows](../../system.windows/) codepagina-ID op. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | Haal het aantal tekens op dat nodig is om een tekenbuffer te coderen. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | Haal het aantal tekens op dat nodig is om een tekenbuffer te coderen. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Haal het aantal tekens op dat nodig is om een tekenbuffer te coderen. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | Haal het aantal tekens op dat nodig is om een string te coderen. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | Haal het aantal tekens op dat nodig is om een tekenbuffer te coderen. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int) | Haal het aantal tekens op dat nodig is om een tekenbuffer te coderen. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetBytes](./getbytes/)(const String\&) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Haal het aantal tekens op dat nodig is om een bytebuffer te decoderen. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Haal het aantal tekens op dat nodig is om een bytebuffer te decoderen. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int) | Haal het aantal tekens op dat nodig is om een bytebuffer te decoderen. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Haal de tekens op die het resultaat zijn van het decoderen van een bytebuffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Haal de tekens op die het resultaat zijn van het decoderen van een bytebuffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Haal de tekens op die het resultaat zijn van het decoderen van een bytebuffer. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) | Haal de tekens op die het resultaat zijn van het decoderen van een bytebuffer. |
| virtual [GetDecoder](./getdecoder/)() | Haal een decoder op die verzoeken doorstuurt naar dit object. |
| virtual [GetEncoder](./getencoder/)() | Haal een encoder op die verzoeken doorstuurt naar dit object. |
| static [GetEncoding](./getencoding/)(const String\&) | Haalt codering op op naam. |
| static [GetEncoding](./getencoding/)(int) | Haalt codering op op codepagina. |
| static [GetEncoding](./getencoding/)(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | Haalt codering op op codepagina. |
| static [GetEncoding](./getencoding/)(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | Haalt codering op op naam. |
| static [GetEncodings](./getencodings/)() | Haalt lijst met bekende coderingen op. |
| [GetHashCode](./gethashcode/)() const override | Hasht codering. |
| virtual [GetMaxByteCount](./getmaxbytecount/)(int) | Haal het maximale aantal bytes op dat nodig is om een opgegeven aantal tekens te coderen. |
| virtual [GetMaxCharCount](./getmaxcharcount/)(int) | Haal het maximale aantal tekens op dat nodig is om een opgegeven aantal bytes te decoderen. |
| virtual [GetPreamble](./getpreamble/)() | Retourneert een reeks bytes die de codering aanduidt (bijv. BOM). |
| virtual [GetString](./getstring/)(uint8_t *, int) | Decodeert een buffer met bytes naar een string. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | Decodeert een buffer met bytes naar een string. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | Decodeert een buffer met bytes naar een string. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | Decodeert een buffer met bytes naar een string. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) | Decodeert een buffer met bytes naar een string. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | Decodeert een buffer met bytes naar een string. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | Decodeert een buffer met bytes naar een string. |
| [set_DecoderFallback](./set_decoderfallback/)(const DecoderFallbackPtr\&) | Stelt decoder fallback in. |
| [set_EncoderFallback](./set_encoderfallback/)(const EncoderFallbackPtr\&) | Stelt encoder fallback in. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](./default_code_page/) | Standaardwaarde van de codepagina. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | RTTI. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
