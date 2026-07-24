---
title: "System::Text::UTF7Encoding klasse"
linktitle: "UTF7Encoding"
second_title: "Aspose.Page voor C++"
description: "System::Text::UTF7Encoding klasse. UTF-7-codering. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik die pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2700
url: /nl/cpp/system.text/utf7encoding/
---
## UTF7Encoding class


UTF-7-codering. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik die pointer om deze als argument aan functies door te geven.

```cpp
class UTF7Encoding : public System::Text::Encoding
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() override | Kopieert coderingsobject. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Vergelijkt met object. |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | Haal het aantal tekens op dat nodig is om een tekenbuffer te coderen. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | Haal het aantal tekens op dat nodig is om een tekenbuffer te coderen. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | Haal het aantal tekens op dat nodig is om een tekenbuffer te coderen. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Haal het aantal tekens op dat nodig is om een tekenbuffer te coderen. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | Haal het aantal tekens op dat nodig is om een string te coderen. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | Haal het aantal tekens op dat nodig is om een tekenbuffer te coderen. |
| [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) override | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetBytes](./getbytes/)(const String\&) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) override | Haal het aantal tekens op dat nodig is om een bytebuffer te decoderen. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | Haal het aantal tekens op dat nodig is om een bytebuffer te decoderen. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Haal het aantal tekens op dat nodig is om een bytebuffer te decoderen. |
| [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) override | Haal de tekens op die het resultaat zijn van het decoderen van een bytebuffer. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | Haal de tekens op die het resultaat zijn van het decoderen van een bytebuffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Haal de tekens op die het resultaat zijn van het decoderen van een bytebuffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Haal de tekens op die het resultaat zijn van het decoderen van een bytebuffer. |
| [GetDecoder](./getdecoder/)() override | Haal een decoder op die verzoeken doorstuurt naar dit object. |
| [GetEncoder](./getencoder/)() override | Haal een encoder op die verzoeken doorstuurt naar dit object. |
| [GetHashCode](./gethashcode/)() const override | Haalt de hashcode van de codering op. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Haal het maximale aantal bytes op dat nodig is om een opgegeven aantal tekens te coderen. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Haal het maximale aantal tekens op dat nodig is om een opgegeven aantal bytes te decoderen. |
| [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) override | Decodeert een buffer met bytes naar een string. |
| virtual [GetString](./getstring/)(uint8_t *, int) | Decodeert een buffer met bytes naar een string. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | Decodeert een buffer met bytes naar een string. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | Decodeert een buffer met bytes naar een string. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | Decodeert een buffer met bytes naar een string. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | Decodeert een buffer met bytes naar een string. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | Decodeert een buffer met bytes naar een string. |
| [operator==](./operator==/)(const UTF7Encoding\&) const | Vergelijkt parameters van coderingen. |
| [UTF7Encoding](./utf7encoding/)() | Constructor. |
| [UTF7Encoding](./utf7encoding/)(bool) | Constructor. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Standaardwaarde van de codepagina. |
| static constexpr [UTF7_CODE_PAGE](./utf7_code_page/) | Magisch getal dat door [Windows](../../system.windows/) wordt gebruikt voor de UTF-7 codepagina‑ID. |
## Zie ook

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
