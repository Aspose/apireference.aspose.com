---
title: "System::Net::Http::Headers::HttpHeaders klasse"
linktitle: "HttpHeaders"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::HttpHeaders klasse. De verzameling van de HTTP-headers. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 700
url: /nl/cpp/system.net.http.headers/httpheaders/
---
## HttpHeaders class


De verzameling van de HTTP-headers. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class HttpHeaders : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<System::Collections::Generic::IEnumerable<System::String>>>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | Valideert een nieuw naam‑waarde paar en voegt het toe aan de huidige collectie. |
| [Add](./add/)(String, String) | Valideert een nieuw naam‑waarde paar en voegt het toe aan de huidige collectie. |
| virtual [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) | Voegt de opgegeven HttpHeaders‑klasse‑instantie samen met de huidige. |
| [AddParsedValue](./addparsedvalue/)(String, System::SharedPtr\<Object\>) | Haalt een header op op basis van de opgegeven naam en voegt een geparseerde waarde toe aan de header. |
| [Clear](./clear/)() | Verwijdert alle items uit de collectie. |
| [Contains](./contains/)(String) |  |
| [ContainsParsedValue](./containsparsedvalue/)(String, System::SharedPtr\<Object\>) | Controleert of de header de opgegeven waarde bevat. |
| [GetEnumerator](./getenumerator/)() override | Haalt enumerator op. |
| [GetHeaderString](./getheaderstring/)(String) | Retourneert een stringrepresentatie van waarden op basis van de opgegeven headernaam. |
| [GetHeaderString](./getheaderstring/)(String, System::SharedPtr\<Object\>) | Retourneert een stringrepresentatie van waarden op basis van de opgegeven headernaam. |
| [GetHeaderStrings](./getheaderstrings/)() | Retourneert een collectie die stringrepresentaties van headerwaarden bevat. |
| [GetParsedValues](./getparsedvalues/)(String) | Retourneert geparseerde waarden op basis van de opgegeven headernaam. |
| [GetValues](./getvalues/)(String) | Retourneert overeenkomstige waarden op basis van de opgegeven naam. |
| static [ParsedValuesAsList](./parsedvaluesaslist/)(const System::SharedPtr\<Object\>) | Zet geparseerde waarden om naar een lijst. |
| [Remove](./remove/)(String) | Probeert een item te verwijderen op basis van de opgegeven naam. |
| [RemoveParsedValue](./removeparsedvalue/)(String, System::SharedPtr\<Object\>) | Haalt een header op op basis van de opgegeven naam en verwijdert een geparseerde waarde uit de header. |
| [SetConfiguration](./setconfiguration/)(System::SharedPtr\<Collections::Generic::Dictionary\<String, System::SharedPtr\<HttpHeaderParser\>\>\>, System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) |  |
| [SetOrRemoveParsedValue](./setorremoveparsedvalue/)(String, System::SharedPtr\<Object\>) | Haalt een header op op basis van de opgegeven naam en stelt de waarde in of verwijdert deze. De headerwaarde wordt verwijderd wanneer de parameter 'value' nullptr is; anders wordt een geparseerde waarde ingesteld. |
| [SetParsedValue](./setparsedvalue/)(String, System::SharedPtr\<Object\>) | Haalt een header op op basis van de opgegeven naam en stelt een geparseerde waarde in voor de header. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, String) | Probeert een nieuw naam‑waarde paar toe te voegen aan de huidige collectie. |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | Voegt een collectie van naam‑waarde paren toe aan de huidige collectie. |
| [TryGetValues](./trygetvalues/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&) | Probeert overeenkomstige waarden op te halen op basis van de opgegeven naam. |
| [TryParseAndAddValue](./tryparseandaddvalue/)(String, String) | Probeert de opgegeven waarde te parseren en toe te voegen aan de headerwaarden. |
## Zie ook

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
