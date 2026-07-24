---
title: "System::Net::Http::HttpResponseMessage klasse"
linktitle: "HttpResponseMessage"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::HttpResponseMessage klasse. Vertegenwoordigt een HTTP-responsbericht. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 900
url: /nl/cpp/system.net.http/httpresponsemessage/
---
## HttpResponseMessage class


Vertegenwoordigt een HTTP-responsbericht. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument door te geven aan functies.

```cpp
class HttpResponseMessage : public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Dispose](./dispose/)() override | Disposeert de huidige instantie. Deze methode disposeert ook de inhoud van de HTTP-respons. |
| [EnsureSuccessStatusCode](./ensuresuccessstatuscode/)() | Controleert de statuscode. [HttpRequestException](../httprequestexception/) wordt gegooid wanneer de statuscode niet tot 2xx behoort. |
| [get_Content](./get_content/)() const | Haalt de inhoud van de HTTP-respons op. |
| [get_Headers](./get_headers/)() const | Retourneert de HTTP-inhoudheaders. |
| [get_IsSuccessStatusCode](./get_issuccessstatuscode/)() const | Controleert of de statuscode aangeeft dat de door de client gevraagde actie ontvangen, begrepen en geaccepteerd is. |
| [get_ReasonPhrase](./get_reasonphrase/)() const | Haalt de Reason-Phrase op die door servers samen met de statuscode wordt verzonden. |
| [get_RequestMessage](./get_requestmessage/)() const | Haalt het HTTP-verzoekbericht op. |
| [get_StatusCode](./get_statuscode/)() const | Haalt de HTTP-statuscode op. |
| [get_Version](./get_version/)() const | RTTI-informatie. |
| [HttpResponseMessage](./httpresponsemessage/)() | Construeert een nieuw exemplaar. |
| [HttpResponseMessage](./httpresponsemessage/)(HttpStatusCode) | Construeert een nieuw exemplaar. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | Stelt de inhoud van de HTTP-respons in. |
| [set_ReasonPhrase](./set_reasonphrase/)(String) | Stelt de Reason-Phrase in die door servers samen met de statuscode wordt verzonden. |
| [set_RequestMessage](./set_requestmessage/)(System::SharedPtr\<HttpRequestMessage\>) | Stelt het HTTP-verzoekbericht in. |
| [set_StatusCode](./set_statuscode/)(HttpStatusCode) | Stelt de HTTP-statuscode in. |
| [set_Version](./set_version/)(System::Version) | Stelt de HTTP-versie in. |
| [ToString](./tostring/)() const override | [System::Object::ToString](../../system/object/tostring/). |
## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
