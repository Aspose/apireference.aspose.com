---
title: "System::Text::Encoding Klasse"
linktitle: "Encoding"
second_title: "Aspose.Page für C++"
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
| virtual [Clone](./clone/)() | Klonen des Kodierungsobjekts. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&) | Konvertiert Bytes zwischen zwei Kodierungen. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&, int, int) | Konvertiert Bytes zwischen zwei Kodierungen. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Vergleicht Kodierungen. |
| static [get_ASCII](./get_ascii/)() | Liefert die ASCII‑Kodierung. |
| static [get_BigEndianUnicode](./get_bigendianunicode/)() | Liefert das standardmäßige big-endian Unicode‑Kodierungsobjekt. |
| static [get_BigEndianUTF32](./get_bigendianutf32/)() | Liefert das standardmäßige big-endian UTF-32‑Kodierungsobjekt. |
| virtual [get_BodyName](./get_bodyname/)() | Liefert den für Mail‑Agent‑Body kompatiblen Kodierungsnamen. |
| virtual [get_CodePage](./get_codepage/)() | Liefert die [Windows](../../system.windows/) Codepage‑ID. |
| [get_DecoderFallback](./get_decoderfallback/)() const | Liefert den Decoder‑Fallback. |
| static [get_Default](./get_default/)() | Liefert die Standardkodierung. |
| [get_EncoderFallback](./get_encoderfallback/)() const | Liefert den Encoder‑Fallback. |
| virtual [get_EncodingName](./get_encodingname/)() | Liefert menschenlesbaren Kodierungsnamen. |
| virtual [get_HeaderName](./get_headername/)() | Liefert einen kodierungsnamen, der mit Mail-Agent-Headern kompatibel ist. |
| virtual [get_IsBrowserDisplay](./get_isbrowserdisplay/)() | Überprüft, ob die Kodierung im Browser zur Anzeige von Inhalten verwendet werden kann. |
| virtual [get_IsBrowserSave](./get_isbrowsersave/)() | Überprüft, ob die Kodierung im Browser zum Speichern von Inhalten verwendet werden kann. |
| virtual [get_IsMailNewsDisplay](./get_ismailnewsdisplay/)() | Überprüft, ob die Kodierung im E-Mail-Client zur Anzeige von Inhalten verwendet werden kann. |
| virtual [get_IsMailNewsSave](./get_ismailnewssave/)() | Überprüft, ob die Kodierung im E-Mail-Client zum Speichern von Inhalten verwendet werden kann. |
| [get_IsReadOnly](./get_isreadonly/)() | Überprüft, ob die Kodierung schreibgeschützt ist. |
| virtual [get_IsSingleByte](./get_issinglebyte/)() | Überprüft, ob die Kodierung ein Byte breit ist. |
| static [get_Latin1](./get_latin1/)() | Liefert die Latin1‑Kodierung. NUR ZUR INTERNEN VERWENDUNG. |
| static [get_Unicode](./get_unicode/)() | Liefert das Standard‑Unicode‑Kodierungsobjekt. |
| static [get_UTF32](./get_utf32/)() |  |
| static [get_UTF7](./get_utf7/)() | Liefert das Standard‑UTF‑7‑Kodierungsobjekt. |
| static [get_UTF8](./get_utf8/)() | Liefert das Standard‑UTF‑8‑Kodierungsobjekt. |
| static [get_UTF8Unmarked](./get_utf8unmarked/)() | Nur intern, zur Verwendung durch die Klassenbibliotheken: Unmarkiert und nicht eingabevalidierend. |
| virtual [get_WebName](./get_webname/)() | Liefert einen IANA‑kompatiblen Kodierungsnamen. |
| virtual [get_WindowsCodePage](./get_windowscodepage/)() | Liefert die [Windows](../../system.windows/) Codepage‑ID. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | Ermitteln Sie die Anzahl der Zeichen, die zum Kodieren eines Zeichenpuffers benötigt werden. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | Ermitteln Sie die Anzahl der Zeichen, die zum Kodieren eines Zeichenpuffers benötigt werden. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Ermitteln Sie die Anzahl der Zeichen, die zum Kodieren eines Zeichenpuffers benötigt werden. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | Ermittelt die Anzahl der Zeichen, die zum Kodieren einer Zeichenkette benötigt werden. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | Ermitteln Sie die Anzahl der Zeichen, die zum Kodieren eines Zeichenpuffers benötigt werden. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int) | Ermitteln Sie die Anzahl der Zeichen, die zum Kodieren eines Zeichenpuffers benötigt werden. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| virtual [GetBytes](./getbytes/)(const String\&) | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Ermitteln Sie die Anzahl der Zeichen, die zum Dekodieren eines Byte-Puffers benötigt werden. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Ermitteln Sie die Anzahl der Zeichen, die zum Dekodieren eines Byte-Puffers benötigt werden. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int) | Ermitteln Sie die Anzahl der Zeichen, die zum Dekodieren eines Byte-Puffers benötigt werden. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Ermitteln Sie die Zeichen, die durch das Dekodieren eines Byte-Puffers entstehen. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Ermitteln Sie die Zeichen, die durch das Dekodieren eines Byte-Puffers entstehen. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Ermitteln Sie die Zeichen, die durch das Dekodieren eines Byte-Puffers entstehen. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) | Ermitteln Sie die Zeichen, die durch das Dekodieren eines Byte-Puffers entstehen. |
| virtual [GetDecoder](./getdecoder/)() | Erhalten Sie einen Decoder, der Anfragen an dieses Objekt weiterleitet. |
| virtual [GetEncoder](./getencoder/)() | Erhalten Sie einen Encoder, der Anfragen an dieses Objekt weiterleitet. |
| static [GetEncoding](./getencoding/)(const String\&) | Liefert die Kodierung nach Namen. |
| static [GetEncoding](./getencoding/)(int) | Liefert die Kodierung nach Codepage. |
| static [GetEncoding](./getencoding/)(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | Liefert die Kodierung nach Codepage. |
| static [GetEncoding](./getencoding/)(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | Liefert die Kodierung nach Namen. |
| static [GetEncodings](./getencodings/)() | Liefert eine Liste bekannter Kodierungen. |
| [GetHashCode](./gethashcode/)() const override | Erzeugt einen Hashwert der Kodierung. |
| virtual [GetMaxByteCount](./getmaxbytecount/)(int) | Ermittelt die maximale Anzahl von Bytes, die zum Kodieren einer angegebenen Anzahl von Zeichen benötigt werden. |
| virtual [GetMaxCharCount](./getmaxcharcount/)(int) | Ermittelt die maximale Anzahl von Zeichen, die zum Dekodieren einer angegebenen Anzahl von Bytes benötigt werden. |
| virtual [GetPreamble](./getpreamble/)() | Gibt eine Byte‑Sequenz zurück, die die Kodierung bezeichnet (z. B. BOM). |
| virtual [GetString](./getstring/)(uint8_t *, int) | Dekodiert einen Puffer von Bytes in eine Zeichenkette. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | Dekodiert einen Puffer von Bytes in eine Zeichenkette. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | Dekodiert einen Puffer von Bytes in eine Zeichenkette. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | Dekodiert einen Puffer von Bytes in eine Zeichenkette. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) | Dekodiert einen Puffer von Bytes in eine Zeichenkette. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | Dekodiert einen Puffer von Bytes in eine Zeichenkette. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | Dekodiert einen Puffer von Bytes in eine Zeichenkette. |
| [set_DecoderFallback](./set_decoderfallback/)(const DecoderFallbackPtr\&) | Setzt die Decoder‑Fallback‑Strategie. |
| [set_EncoderFallback](./set_encoderfallback/)(const EncoderFallbackPtr\&) | Setzt die Encoder‑Fallback‑Strategie. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](./default_code_page/) | Standardwert der Codepage. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | RTTI. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
