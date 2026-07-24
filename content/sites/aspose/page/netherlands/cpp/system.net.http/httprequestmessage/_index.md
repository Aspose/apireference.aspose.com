---
title: "System::Net::Http::HttpRequestMessage class"
linktitle: "HttpRequestMessage"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::HttpRequestMessage class. Vertegenwoordigt een HTTP-verzoekbericht. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime-fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 800
url: /nl/cpp/system.net.http/httprequestmessage/
---
## HttpRequestMessage class


Vertegenwoordigt een HTTP-verzoekbericht. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)-functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime-fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class HttpRequestMessage : public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Dispose](./dispose/)() override | Disposeert de huidige instantie. Deze methode disposeert ook de inhoud van het HTTP-verzoek. |
| [get_Content](./get_content/)() | Haalt de inhoud van het HTTP-verzoek op. |
| [get_Headers](./get_headers/)() | Retourneert de HTTP-inhoudheaders. |
| [get_Method](./get_method/)() | Haalt de HTTP-verzoekmethode op. |
| [get_Properties](./get_properties/)() | Retourneert de verzameling van de HTTP-verzoekeigenschappen. |
| [get_RequestUri](./get_requesturi/)() | Haalt de URI van de aangevraagde bron op. |
| [get_Version](./get_version/)() | RTTI-informatie. |
| [HttpRequestMessage](./httprequestmessage/)() | Construeert een nieuw exemplaar. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, System::SharedPtr\<Uri\>) | Construeert een nieuw exemplaar. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, String) | Construeert een nieuw exemplaar. |
| [MarkAsSent](./markassent/)() | Markeert het huidige verzoek als verzonden. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | Stelt de inhoud van het HTTP-verzoek in. |
| [set_Method](./set_method/)(System::SharedPtr\<HttpMethod\>) | Stelt de HTTP-verzoekmethode in. |
| [set_RequestUri](./set_requesturi/)(System::SharedPtr\<Uri\>) | Stelt de URI van de aangevraagde bron in. |
| [set_Version](./set_version/)(System::Version) | Stelt de HTTP-versie in. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
