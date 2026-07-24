---
title: "System::Net::Http::HttpClientHandler class"
linktitle: "HttpClientHandler"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::HttpClientHandler class. Vertegenwoordigt de standaard berichtverwerker die wordt gebruikt door de HttpClient-klasse. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime-fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 300
url: /nl/cpp/system.net.http/httpclienthandler/
---
## HttpClientHandler class


Vertegenwoordigt de standaard berichtverwerker die wordt gebruikt door de [HttpClient](../httpclient/) klasse. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime-fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class HttpClientHandler : public System::Net::Http::HttpMessageHandler
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Dispose](./dispose/)() override | Doet niets. |
| [get_CookieContainer](./get_cookiecontainer/)() | Haalt de cookiecontainer op die wordt gebruikt om servercookies op te slaan. |
| [get_Credentials](./get_credentials/)() | Haalt de authenticatie-informatie op. |
| [HttpClientHandler](./httpclienthandler/)() | RTTI-informatie. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) override | RTTI-informatie. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Stelt de cookiecontainer in die wordt gebruikt om servercookies op te slaan. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Stelt de authenticatie-informatie in. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | Stelt de proxy-informatie in. |
| [set_Timeout](./set_timeout/)(int32_t) | Haalt een tijdsduur in milliseconden op waarna het verzoek zal verlopen. |
| [set_UseCookies](./set_usecookies/)(bool) | Stelt de waarde in die aangeeft of de huidige instantie de cookiecontainer gebruikt om servercookies op te slaan en of de instantie servercookies gebruikt bij het verzenden van verzoeken. |
| [set_UseProxy](./set_useproxy/)(bool) | Stelt de waarde in die aangeeft of de huidige instantie de proxy gebruikt voor het verzenden van verzoeken. |
## Zie ook

* Class [HttpMessageHandler](../httpmessagehandler/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
