---
title: "System::Net::Http::HttpClient klasse"
linktitle: "HttpClient"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::HttpClient klasse. Vertegenwoordigt een basisklasse van een HTTP-client voor het verzenden van verzoeken en het ontvangen van antwoorden. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 200
url: /nl/cpp/system.net.http/httpclient/
---
## HttpClient class


Vertegenwoordigt een basisklasse van een HTTP-client voor het verzenden van verzoeken en het ontvangen van antwoorden. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class HttpClient : public System::Net::Http::HttpMessageInvoker
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CancelPendingRequests](./cancelpendingrequests/)() | Annuleert alle wachtende verzoeken. |
| [get_BaseAddress](./get_baseaddress/)() | Haalt het basisadres op van de bron die wordt gebruikt voor het verzenden van verzoeken. |
| [get_DefaultRequestHeaders](./get_defaultrequestheaders/)() | RTTI-informatie. |
| [get_MaxResponseContentBufferSize](./get_maxresponsecontentbuffersize/)() | Haalt het maximale aantal bytes van de responsinhoud op. |
| [get_Timeout](./get_timeout/)() | Haalt de tijdsduur op die moet worden gewacht voordat het verzoek time‑out. |
| [HttpClient](./httpclient/)() | Construeert een nieuw exemplaar. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>) | Construeert een nieuw exemplaar. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>, bool) | Construeert een nieuw exemplaar. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>, HttpCompletionOption) | Verzendt het opgegeven HTTP-verzoek. |
| [set_BaseAddress](./set_baseaddress/)(System::SharedPtr\<Uri\>) | Stelt het basisadres van de bron in dat wordt gebruikt voor het verzenden van verzoeken. |
| [set_MaxResponseContentBufferSize](./set_maxresponsecontentbuffersize/)(int64_t) | Stelt het maximale aantal bytes van de responsinhoud in. |
| [set_Timeout](./set_timeout/)(TimeSpan) | Stelt de tijdsduur in die moet worden gewacht voordat het verzoek time‑out. |
## Zie ook

* Class [HttpMessageInvoker](../httpmessageinvoker/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
