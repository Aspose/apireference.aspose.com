---
title: "System::Text::ICUEncoding class"
linktitle: "ICUEncoding"
second_title: "Aspose.Page voor C++"
description: "System::Text::ICUEncoding class. Op ICU gebaseerde coderingsimplementatie. VOOR INTERN GEBRUIK. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject() function. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2200
url: /nl/cpp/system.text/icuencoding/
---
## ICUEncoding class


Op ICU gebaseerde coderingsimplementatie. VOOR INTERN GEBRUIK. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/) function. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ICUEncoding : public System::Text::Encoding
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | Haal het aantal tekens op dat nodig is om een tekenbuffer te coderen. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | RTTI. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | RTTI. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetBytes](./getbytes/)(const String\&) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | Haal het aantal tekens op dat nodig is om een bytebuffer te decoderen. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Haal het aantal tekens op dat nodig is om een bytebuffer te decoderen. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Haal het aantal tekens op dat nodig is om een bytebuffer te decoderen. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | Haal de tekens op die het resultaat zijn van het decoderen van een bytebuffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Haal de tekens op die het resultaat zijn van het decoderen van een bytebuffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Haal de tekens op die het resultaat zijn van het decoderen van een bytebuffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Haal de tekens op die het resultaat zijn van het decoderen van een bytebuffer. |
| [GetDecoder](./getdecoder/)() override | Haal een decoder op die verzoeken doorstuurt naar dit object. |
| [GetEncoder](./getencoder/)() override | Haal een encoder op die verzoeken doorstuurt naar dit object. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Haal het maximale aantal bytes op dat nodig is om een opgegeven aantal tekens te coderen. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Haal het maximale aantal tekens op dat nodig is om een opgegeven aantal bytes te decoderen. |
| [GetPreamble](./getpreamble/)() override | Retourneert een reeks bytes die de codering aanduidt (bijv. BOM). |
| [ICUEncoding](./icuencoding/)(const Details::EncodingInfoInternal *) | Constructor. |
| [operator==](./operator==/)(const ICUEncoding\&) const | Vergelijkt coderingen met behulp van codepagina's. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Standaardwaarde van de codepagina. |
## Zie ook

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
