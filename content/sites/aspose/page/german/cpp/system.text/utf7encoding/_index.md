---
title: "System::Text::UTF7Encoding Klasse"
linktitle: "UTF7Encoding"
second_title: "Aspose.Page für C++"
description: "System::Text::UTF7Encoding Klasse. UTF-7-Codierung. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2700
url: /de/cpp/system.text/utf7encoding/
---
## UTF7Encoding class


UTF-7-Codierung. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class UTF7Encoding : public System::Text::Encoding
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | Klonen des Kodierungsobjekts. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Vergleicht mit Objekt. |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | Ermitteln Sie die Anzahl der Zeichen, die zum Kodieren eines Zeichenpuffers benötigt werden. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | Ermitteln Sie die Anzahl der Zeichen, die zum Kodieren eines Zeichenpuffers benötigt werden. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | Ermitteln Sie die Anzahl der Zeichen, die zum Kodieren eines Zeichenpuffers benötigt werden. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Ermitteln Sie die Anzahl der Zeichen, die zum Kodieren eines Zeichenpuffers benötigt werden. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | Ermittelt die Anzahl der Zeichen, die zum Kodieren einer Zeichenkette benötigt werden. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | Ermitteln Sie die Anzahl der Zeichen, die zum Kodieren eines Zeichenpuffers benötigt werden. |
| [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) override | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| virtual [GetBytes](./getbytes/)(const String\&) | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Ermitteln Sie die Bytes, die durch das Kodieren eines Zeichenpuffers entstehen. |
| [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) override | Ermitteln Sie die Anzahl der Zeichen, die zum Dekodieren eines Byte-Puffers benötigt werden. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | Ermitteln Sie die Anzahl der Zeichen, die zum Dekodieren eines Byte-Puffers benötigt werden. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Ermitteln Sie die Anzahl der Zeichen, die zum Dekodieren eines Byte-Puffers benötigt werden. |
| [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) override | Ermitteln Sie die Zeichen, die durch das Dekodieren eines Byte-Puffers entstehen. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | Ermitteln Sie die Zeichen, die durch das Dekodieren eines Byte-Puffers entstehen. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Ermitteln Sie die Zeichen, die durch das Dekodieren eines Byte-Puffers entstehen. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Ermitteln Sie die Zeichen, die durch das Dekodieren eines Byte-Puffers entstehen. |
| [GetDecoder](./getdecoder/)() override | Erhalten Sie einen Decoder, der Anfragen an dieses Objekt weiterleitet. |
| [GetEncoder](./getencoder/)() override | Erhalten Sie einen Encoder, der Anfragen an dieses Objekt weiterleitet. |
| [GetHashCode](./gethashcode/)() const override | Liefert den Hashcode der Kodierung. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Ermittelt die maximale Anzahl von Bytes, die zum Kodieren einer angegebenen Anzahl von Zeichen benötigt werden. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Ermittelt die maximale Anzahl von Zeichen, die zum Dekodieren einer angegebenen Anzahl von Bytes benötigt werden. |
| [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) override | Dekodiert einen Puffer von Bytes in eine Zeichenkette. |
| virtual [GetString](./getstring/)(uint8_t *, int) | Dekodiert einen Puffer von Bytes in eine Zeichenkette. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | Dekodiert einen Puffer von Bytes in eine Zeichenkette. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | Dekodiert einen Puffer von Bytes in eine Zeichenkette. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | Dekodiert einen Puffer von Bytes in eine Zeichenkette. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | Dekodiert einen Puffer von Bytes in eine Zeichenkette. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | Dekodiert einen Puffer von Bytes in eine Zeichenkette. |
| [operator==](./operator==/)(const UTF7Encoding\&) const | Vergleicht die Parameter der Kodierungen. |
| [UTF7Encoding](./utf7encoding/)() | Konstruktor. |
| [UTF7Encoding](./utf7encoding/)(bool) | Konstruktor. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Standardwert der Codepage. |
| static constexpr [UTF7_CODE_PAGE](./utf7_code_page/) | Magische Zahl, die von [Windows](../../system.windows/) für die UTF-7-Codepage-ID verwendet wird. |
## Siehe auch

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
