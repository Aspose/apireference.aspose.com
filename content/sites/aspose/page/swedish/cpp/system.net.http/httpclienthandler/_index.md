---
title: "System::Net::Http::HttpClientHandler class"
linktitle: "HttpClientHandler"
second_title: "Aspose.Page för C++"
description: "System::Net::Http::HttpClientHandler class. Representerar standardmeddelandehanteraren som används av HttpClient‑klassen. Objekt av denna klass bör endast allokeras med System::MakeObject()‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller assert‑fel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 300
url: /sv/cpp/system.net.http/httpclienthandler/
---
## HttpClientHandler class


Representerar standardmeddelandehanteraren som används av [HttpClient](../httpclient/)‑klassen. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller assert‑fel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)‑pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class HttpClientHandler : public System::Net::Http::HttpMessageHandler
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Dispose](./dispose/)() override | Gör ingenting. |
| [get_CookieContainer](./get_cookiecontainer/)() | Hämtar cookiebehållaren som används för att lagra server‑cookies. |
| [get_Credentials](./get_credentials/)() | Hämtar autentiseringsinformationen. |
| [HttpClientHandler](./httpclienthandler/)() | RTTI-information. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) override | RTTI-information. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Ställer in cookiebehållaren som används för att lagra server‑cookies. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Ställer in autentiseringsinformationen. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | Ställer in proxyinformationen. |
| [set_Timeout](./set_timeout/)(int32_t) | Hämtar en tid i millisekunder efter vilken begäran tidsöverskrids. |
| [set_UseCookies](./set_usecookies/)(bool) | Ställer in värdet som indikerar om den aktuella instansen använder cookiebehållaren för att lagra server‑cookies och om instansen använder server‑cookies när den skickar begäranden. |
| [set_UseProxy](./set_useproxy/)(bool) | Ställer in värdet som indikerar om den aktuella instansen använder proxyn för att skicka begäranden. |
## Se även

* Class [HttpMessageHandler](../httpmessagehandler/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
