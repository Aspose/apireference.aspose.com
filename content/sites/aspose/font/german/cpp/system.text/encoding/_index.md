---
title: "System::Text::Encoding Klasse"
linktitle: "Encoding"
second_title: "Aspose.Font für C++"
description: "System::Text::Encoding Klasse. Kodierungsdienste in C++."
type: docs
weight: 1600
url: /de/cpp/system.text/encoding/
---
## Encoding class


[Encoding](./) services.

```cpp
class Encoding : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Clone](./clone/)() | Klont das Kodierungsobjekt. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&) | Konvertiert Bytes zwischen zwei Kodierungen. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&, int, int) | Konvertiert Bytes zwischen zwei Kodierungen. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Vergleicht Kodierungen. |
| static [get_ASCII](./get_ascii/)() | Liefert die ASCII‑Kodierung. |
| static [get_BigEndianUnicode](./get_bigendianunicode/)() | Liefert das standardmäßige big‑endian Unicode‑Kodierungsobjekt. |
| static [get_BigEndianUTF32](./get_bigendianutf32/)() | Liefert das standardmäßige big‑endian UTF-32‑Kodierungsobjekt. |
| virtual [get_BodyName](./get_bodyname/)() | Liefert den kodierungsnamen, der mit dem Mail‑Agent‑Body kompatibel ist. |
| virtual [get_CodePage](./get_codepage/)() | Liefert die [Windows](../../system.windows/) Codepage‑ID. |
| [get_DecoderFallback](./get_decoderfallback/)() const | Liefert den Decoder‑Fallback. |
| static [get_Default](./get_default/)() | Liefert die Standardkodierung. |
| [get_EncoderFallback](./get_encoderfallback/)() const | Ruft Encoder‑Fallback ab. |
| virtual [get_EncodingName](./get_encodingname/)() | Ruft menschenlesbaren Kodierungsnamen ab. |
| virtual [get_HeaderName](./get_headername/)() | Ruft mit Mail‑Agent‑Header kompatiblen Kodierungsnamen ab. |
| virtual [get_IsBrowserDisplay](./get_isbrowserdisplay/)() | Prüft, ob die Kodierung im Browser zur Anzeige von Inhalten verwendet werden kann. |
| virtual [get_IsBrowserSave](./get_isbrowsersave/)() | Prüft, ob die Kodierung im Browser zum Speichern von Inhalten verwendet werden kann. |
| virtual [get_IsMailNewsDisplay](./get_ismailnewsdisplay/)() | Prüft, ob die Kodierung im E‑Mail‑Client zur Anzeige von Inhalten verwendet werden kann. |
| virtual [get_IsMailNewsSave](./get_ismailnewssave/)() | Prüft, ob die Kodierung im E‑Mail‑Client zum Speichern von Inhalten verwendet werden kann. |
| [get_IsReadOnly](./get_isreadonly/)() | Prüft, ob die Kodierung schreibgeschützt ist. |
| virtual [get_IsSingleByte](./get_issinglebyte/)() | Prüft, ob die Kodierung ein Byte pro Zeichen ist. |
| static [get_Latin1](./get_latin1/)() | Ruft Latin1‑Kodierung ab. NUR FÜR INTERNEN GEBRAUCH. |
| static [get_Unicode](./get_unicode/)() | Ruft das Standard‑Unicode‑Kodierungsobjekt ab. |
| static [get_UTF32](./get_utf32/)() |  |
| static [get_UTF7](./get_utf7/)() | Ruft das Standard‑UTF-7‑Kodierungsobjekt ab. |
| static [get_UTF8](./get_utf8/)() | Ruft das Standard‑UTF-8‑Kodierungsobjekt ab. |
| static [get_UTF8Unmarked](./get_utf8unmarked/)() | Nur intern, zur Verwendung durch die Klassenbibliotheken: Unmarkiert und nicht eingabevalidierend. |
| virtual [get_WebName](./get_webname/)() | Ruft IANA‑kompatiblen Kodierungsnamen ab. |
| virtual [get_WindowsCodePage](./get_windowscodepage/)() | Liefert die [Windows](../../system.windows/) Codepage‑ID. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | Ermittelt die Anzahl der Zeichen, die zum Codieren eines Zeichenpuffers benötigt werden. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | Ermittelt die Anzahl der Zeichen, die zum Codieren eines Zeichenpuffers benötigt werden. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Ermittelt die Anzahl der Zeichen, die zum Codieren eines Zeichenpuffers benötigt werden. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | Ermittelt die Anzahl der Zeichen, die zum Kodieren einer Zeichenfolge benötigt werden. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | Ermittelt die Anzahl der Zeichen, die zum Codieren eines Zeichenpuffers benötigt werden. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int) | Ermittelt die Anzahl der Zeichen, die zum Codieren eines Zeichenpuffers benötigt werden. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen. |
| virtual [GetBytes](./getbytes/)(const String\&) | Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) | Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Ermittelt die Anzahl der Zeichen, die zum Dekodieren eines Byte-Puffers benötigt werden. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Ermittelt die Anzahl der Zeichen, die zum Dekodieren eines Byte-Puffers benötigt werden. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int) | Ermittelt die Anzahl der Zeichen, die zum Dekodieren eines Byte-Puffers benötigt werden. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Ermittelt die Zeichen, die durch das Dekodieren eines Byte-Puffers entstehen. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Ermittelt die Zeichen, die durch das Dekodieren eines Byte-Puffers entstehen. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Ermittelt die Zeichen, die durch das Dekodieren eines Byte-Puffers entstehen. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) | Ermittelt die Zeichen, die durch das Dekodieren eines Byte-Puffers entstehen. |
| virtual [GetDecoder](./getdecoder/)() | Ermittelt einen Decoder, der Anfragen an dieses Objekt weiterleitet. |
| virtual [GetEncoder](./getencoder/)() | Ermittelt einen Encoder, der Anfragen an dieses Objekt weiterleitet. |
| static [GetEncoding](./getencoding/)(const String\&) | Ruft Kodierung nach Namen ab. |
| static [GetEncoding](./getencoding/)(int) | Ruft Kodierung nach Codepage ab. |
| static [GetEncoding](./getencoding/)(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | Ruft Kodierung nach Codepage ab. |
| static [GetEncoding](./getencoding/)(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | Ruft Kodierung nach Namen ab. |
| static [GetEncodings](./getencodings/)() | Ruft Liste bekannter Kodierungen ab. |
| [GetHashCode](./gethashcode/)() const override | Erzeugt Hash der Kodierung. |
| virtual [GetMaxByteCount](./getmaxbytecount/)(int) | Ermittelt die maximale Anzahl von Bytes, die zum Kodieren einer angegebenen Anzahl von Zeichen benötigt werden. |
| virtual [GetMaxCharCount](./getmaxcharcount/)(int) | Ermittelt die maximale Anzahl von Zeichen, die zum Dekodieren einer angegebenen Anzahl von Bytes benötigt werden. |
| virtual [GetPreamble](./getpreamble/)() | Gibt eine Byte‑Sequenz zurück, die die Codierung bezeichnet (z. b. BOM). |
| virtual [GetString](./getstring/)(uint8_t *, int) | Dekodiert einen Puffer von Bytes in eine Zeichenfolge. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | Dekodiert einen Puffer von Bytes in eine Zeichenfolge. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | Dekodiert einen Puffer von Bytes in eine Zeichenfolge. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | Dekodiert einen Puffer von Bytes in eine Zeichenfolge. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) | Dekodiert einen Puffer von Bytes in eine Zeichenfolge. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | Dekodiert einen Puffer von Bytes in eine Zeichenfolge. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | Dekodiert einen Puffer von Bytes in eine Zeichenfolge. |
| [set_DecoderFallback](./set_decoderfallback/)(const DecoderFallbackPtr\&) | Setzt Decoder‑Fallback. |
| [set_EncoderFallback](./set_encoderfallback/)(const EncoderFallbackPtr\&) | Setzt Encoder‑Fallback. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](./default_code_page/) | Standardwert der Codepage. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | RTTI. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
