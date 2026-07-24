---
title: "System::Text::UTF7Encoding‑klass"
linktitle: "UTF7Encoding"
second_title: "Aspose.Page för C++"
description: "System::Text::UTF7Encoding‑klass. UTF-7‑kodning. Objekt av den här klassen bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 2700
url: /sv/cpp/system.text/utf7encoding/
---
## UTF7Encoding class


UTF-7‑kodning. Objekt av den här klassen bör endast allokeras med hjälp av funktionen [System::MakeObject()](../../system/makeobject/) . Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)‑pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class UTF7Encoding : public System::Text::Encoding
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Clone](./clone/)() override | Klonar kodningsobjekt. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Jämför med objekt. |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | Hämta antalet tecken som behövs för att koda en teckenbuffert. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | Hämta antalet tecken som behövs för att koda en teckenbuffert. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | Hämta antalet tecken som behövs för att koda en teckenbuffert. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Hämta antalet tecken som behövs för att koda en teckenbuffert. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | Hämta antalet tecken som behövs för att koda en sträng. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | Hämta antalet tecken som behövs för att koda en teckenbuffert. |
| [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | Hämta de byte som erhålls genom att koda en teckenbuffert. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | Hämta de byte som erhålls genom att koda en teckenbuffert. |
| [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) override | Hämta de byte som erhålls genom att koda en teckenbuffert. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Hämta de byte som erhålls genom att koda en teckenbuffert. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Hämta de byte som erhålls genom att koda en teckenbuffert. |
| virtual [GetBytes](./getbytes/)(const String\&) | Hämta de byte som erhålls genom att koda en teckenbuffert. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Hämta de byte som erhålls genom att koda en teckenbuffert. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Hämta de byte som erhålls genom att koda en teckenbuffert. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Hämta de byte som erhålls genom att koda en teckenbuffert. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Hämta de byte som erhålls genom att koda en teckenbuffert. |
| [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) override | Hämta antalet tecken som behövs för att avkoda en bytebuffert. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | Hämta antalet tecken som behövs för att avkoda en bytebuffert. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Hämta antalet tecken som behövs för att avkoda en bytebuffert. |
| [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) override | Hämta de tecken som erhålls genom att avkoda en bytebuffert. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | Hämta de tecken som erhålls genom att avkoda en bytebuffert. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Hämta de tecken som erhålls genom att avkoda en bytebuffert. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Hämta de tecken som erhålls genom att avkoda en bytebuffert. |
| [GetDecoder](./getdecoder/)() override | Hämta en avkodare som vidarebefordrar förfrågningar till detta objekt. |
| [GetEncoder](./getencoder/)() override | Hämta en kodare som vidarebefordrar förfrågningar till detta objekt. |
| [GetHashCode](./gethashcode/)() const override | Hämtar kodningens hash‑kod. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Hämta det maximala antalet byte som behövs för att koda ett angivet antal tecken. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Hämta det maximala antalet tecken som behövs för att avkoda ett angivet antal byte. |
| [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) override | Avkodar en buffert med bytes till en sträng. |
| virtual [GetString](./getstring/)(uint8_t *, int) | Avkodar en buffert med bytes till en sträng. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | Avkodar en buffert med bytes till en sträng. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | Avkodar en buffert med bytes till en sträng. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | Avkodar en buffert med bytes till en sträng. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | Avkodar en buffert med bytes till en sträng. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | Avkodar en buffert med bytes till en sträng. |
| [operator==](./operator==/)(const UTF7Encoding\&) const | Jämför kodningens parametrar. |
| [UTF7Encoding](./utf7encoding/)() | Konstruktor. |
| [UTF7Encoding](./utf7encoding/)(bool) | Konstruktor. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Standardvärde för kodsida. |
| static constexpr [UTF7_CODE_PAGE](./utf7_code_page/) | Magiskt tal som används av [Windows](../../system.windows/) för UTF-7‑kodsid‑id. |
## Se även

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
