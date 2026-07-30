---
title: "System::Text::Encoding classe"
linktitle: "Encoding"
second_title: "Aspose.Font per C++"
description: "System::Text::Encoding classe. Servizi di codifica in C++."
type: docs
weight: 1600
url: /it/cpp/system.text/encoding/
---
## Encoding class


[Encoding](./) services.

```cpp
class Encoding : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Clone](./clone/)() | Clona l'oggetto di codifica. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&) | Converte byte tra due codifiche. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&, int, int) | Converte byte tra due codifiche. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Confronta le codifiche. |
| static [get_ASCII](./get_ascii/)() | Restituisce la codifica ASCII. |
| static [get_BigEndianUnicode](./get_bigendianunicode/)() | Restituisce l'oggetto di codifica Unicode standard big-endian. |
| static [get_BigEndianUTF32](./get_bigendianutf32/)() | Restituisce l'oggetto di codifica UTF-32 standard big-endian. |
| virtual [get_BodyName](./get_bodyname/)() | Restituisce il nome della codifica compatibile con il corpo dell'agente di posta. |
| virtual [get_CodePage](./get_codepage/)() | Restituisce l'ID della pagina di codice [Windows](../../system.windows/). |
| [get_DecoderFallback](./get_decoderfallback/)() const | Restituisce il fallback del decoder. |
| static [get_Default](./get_default/)() | Restituisce la codifica predefinita. |
| [get_EncoderFallback](./get_encoderfallback/)() const | Ottiene il fallback dell'encoder. |
| virtual [get_EncodingName](./get_encodingname/)() | Ottiene il nome della codifica leggibile dall'uomo. |
| virtual [get_HeaderName](./get_headername/)() | Ottiene il nome della codifica compatibile con l'intestazione dell'agente di posta. |
| virtual [get_IsBrowserDisplay](./get_isbrowserdisplay/)() | Verifica se la codifica può essere usata nel browser per visualizzare il contenuto. |
| virtual [get_IsBrowserSave](./get_isbrowsersave/)() | Verifica se la codifica può essere usata nel browser per salvare il contenuto. |
| virtual [get_IsMailNewsDisplay](./get_ismailnewsdisplay/)() | Verifica se la codifica può essere usata nel client di posta per visualizzare il contenuto. |
| virtual [get_IsMailNewsSave](./get_ismailnewssave/)() | Verifica se la codifica può essere usata nel client di posta per salvare il contenuto. |
| [get_IsReadOnly](./get_isreadonly/)() | Verifica se la codifica è di sola lettura. |
| virtual [get_IsSingleByte](./get_issinglebyte/)() | Verifica se la codifica è a byte singolo. |
| static [get_Latin1](./get_latin1/)() | Ottiene la codifica Latin1. PER USO INTERNO. |
| static [get_Unicode](./get_unicode/)() | Ottiene l'oggetto di codifica Unicode standard. |
| static [get_UTF32](./get_utf32/)() |  |
| static [get_UTF7](./get_utf7/)() | Ottiene l'oggetto di codifica UTF-7 standard. |
| static [get_UTF8](./get_utf8/)() | Ottiene l'oggetto di codifica UTF-8 standard. |
| static [get_UTF8Unmarked](./get_utf8unmarked/)() | Solo interno, da utilizzare dalle librerie di classi: non contrassegnato e non valida l'input. |
| virtual [get_WebName](./get_webname/)() | Ottiene il nome della codifica compatibile con IANA. |
| virtual [get_WindowsCodePage](./get_windowscodepage/)() | Restituisce l'ID della pagina di codice [Windows](../../system.windows/). |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | Ottieni il numero di caratteri necessari per codificare un buffer di caratteri. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | Ottieni il numero di caratteri necessari per codificare un buffer di caratteri. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Ottieni il numero di caratteri necessari per codificare un buffer di caratteri. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | Ottieni il numero di caratteri necessari per codificare una stringa. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | Ottieni il numero di caratteri necessari per codificare un buffer di caratteri. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int) | Ottieni il numero di caratteri necessari per codificare un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(const String\&) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) | Ottieni i byte risultanti dalla codifica di un buffer di caratteri. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Ottieni il numero di caratteri necessari per decodificare un buffer di byte. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Ottieni il numero di caratteri necessari per decodificare un buffer di byte. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int) | Ottieni il numero di caratteri necessari per decodificare un buffer di byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Ottieni i caratteri risultanti dalla decodifica di un buffer di byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Ottieni i caratteri risultanti dalla decodifica di un buffer di byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Ottieni i caratteri risultanti dalla decodifica di un buffer di byte. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) | Ottieni i caratteri risultanti dalla decodifica di un buffer di byte. |
| virtual [GetDecoder](./getdecoder/)() | Ottieni un decoder che inoltra le richieste a questo oggetto. |
| virtual [GetEncoder](./getencoder/)() | Ottieni un encoder che inoltra le richieste a questo oggetto. |
| static [GetEncoding](./getencoding/)(const String\&) | Ottiene la codifica per nome. |
| static [GetEncoding](./getencoding/)(int) | Ottiene la codifica per codepage. |
| static [GetEncoding](./getencoding/)(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | Ottiene la codifica per codepage. |
| static [GetEncoding](./getencoding/)(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | Ottiene la codifica per nome. |
| static [GetEncodings](./getencodings/)() | Ottiene l'elenco delle codifiche conosciute. |
| [GetHashCode](./gethashcode/)() const override | Crea hash della codifica. |
| virtual [GetMaxByteCount](./getmaxbytecount/)(int) | Restituisce il numero massimo di byte necessari per codificare un numero specificato di caratteri. |
| virtual [GetMaxCharCount](./getmaxcharcount/)(int) | Restituisce il numero massimo di caratteri necessari per decodificare un numero specificato di byte. |
| virtual [GetPreamble](./getpreamble/)() | Restituisce una sequenza di byte che indica la codifica (ad es. BOM). |
| virtual [GetString](./getstring/)(uint8_t *, int) | Decodifica un buffer di byte in una stringa. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | Decodifica un buffer di byte in una stringa. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | Decodifica un buffer di byte in una stringa. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | Decodifica un buffer di byte in una stringa. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) | Decodifica un buffer di byte in una stringa. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | Decodifica un buffer di byte in una stringa. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | Decodifica un buffer di byte in una stringa. |
| [set_DecoderFallback](./set_decoderfallback/)(const DecoderFallbackPtr\&) | Imposta il fallback del decoder. |
| [set_EncoderFallback](./set_encoderfallback/)(const EncoderFallbackPtr\&) | Imposta il fallback dell'encoder. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](./default_code_page/) | Valore predefinito della pagina di codice. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | RTTI. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
