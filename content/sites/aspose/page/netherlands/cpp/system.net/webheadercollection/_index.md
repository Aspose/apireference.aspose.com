---
title: "System::Net::WebHeaderCollection class"
linktitle: "WebHeaderCollection"
second_title: "Aspose.Page voor C++"
description: "System::Net::WebHeaderCollection class. Vertegenwoordigt de verzameling van de protocol‑headers. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Plaats deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 3600
url: /nl/cpp/system.net/webheadercollection/
---
## WebHeaderCollection class


Vertegenwoordigt de verzameling van de protocol‑headers. Objecten van deze klasse mogen alleen worden toegewezen met behulp van [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Plaats deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class WebHeaderCollection : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(String, String) | Voegt het opgegeven paar van de headernaam en de headerwaarde toe aan de collectie. |
| [Add](./add/)(HttpResponseHeader, String) | Voegt het opgegeven paar van de header en de headerwaarde toe aan de collectie. |
| [Add](./add/)(HttpRequestHeader, String) | Voegt het opgegeven paar van de header en de headerwaarde toe aan de collectie. |
| [AllKeys](./allkeys/)() | Retourneert een collectie van headernamen die in de collectie zijn opgeslagen. |
| [get_Count](./get_count/)() const | Retourneert het aantal elementen in de collectie. |
| [get_Keys](./get_keys/)() | Retourneert een collectie van headernamen die in de collectie zijn opgeslagen. |
| [GetKey](./getkey/)(int) | Retourneert een sleutel op de opgegeven index. |
| [GetValues](./getvalues/)(String) | Retourneert de collectie van de headerwaarden. |
| [idx_get](./idx_get/)(HttpRequestHeader) | Haalt de headerwaarde op met behulp van de opgegeven request‑header. |
| [idx_get](./idx_get/)(HttpResponseHeader) | Haalt de headerwaarde op met behulp van de opgegeven response‑header. |
| [idx_get](./idx_get/)(String) | Haalt de headerwaarde op met behulp van de opgegeven headernaam. |
| [idx_set](./idx_set/)(HttpRequestHeader, String) | Stelt de headerwaarde in van de opgegeven header. |
| [idx_set](./idx_set/)(HttpResponseHeader, String) | Stelt de headerwaarde in met behulp van de header van de opgegeven respons. |
| [idx_set](./idx_set/)(String, String) | Stelt de headerwaarde in met behulp van de opgegeven headernaam. |
| static [IsRestricted](./isrestricted/)(const String\&) | Test of de opgegeven HTTP-header kan worden ingesteld voor het verzoek. |
| [Remove](./remove/)(String) | Verwijdert de header met de opgegeven headernaam. |
| [Remove](./remove/)(HttpResponseHeader) | Verwijdert de header van de opgegeven respons. |
| [Remove](./remove/)(HttpRequestHeader) | Verwijdert de header van het opgegeven verzoek. |
| [Set](./set/)(String, String) | Stelt de waarde in van de opgegeven header. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| [WebHeaderCollection](./webheadercollection/)() | Construeert een nieuw exemplaar. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
