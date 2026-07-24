---
title: "System::Net::Http::HttpRequestMessage klass"
linktitle: "HttpRequestMessage"
second_title: "Aspose.Page för C++"
description: "System::Net::Http::HttpRequestMessage klass. Representerar ett HTTP‑begäranmeddelande. Objekt av denna klass bör endast allokeras med System::MakeObject()‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kommer att leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 800
url: /sv/cpp/system.net.http/httprequestmessage/
---
## HttpRequestMessage class


Representerar ett HTTP‑begäranmeddelande. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kommer att leda till körfel och/eller påståendefel. Omslut alltid denna klass i [System::SmartPtr](../../system/smartptr/)‑pekaren och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class HttpRequestMessage : public System::IDisposable
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Dispose](./dispose/)() override | Avslutar den aktuella instansen. Denna metod avslutar också innehållet i HTTP‑begäran. |
| [get_Content](./get_content/)() | Hämtar innehållet i HTTP‑begäran. |
| [get_Headers](./get_headers/)() | Returnerar HTTP‑innehållshuvudena. |
| [get_Method](./get_method/)() | Hämtar HTTP-förfrågningsmetoden. |
| [get_Properties](./get_properties/)() | Returnerar samlingen av HTTP-förfrågningsegenskaper. |
| [get_RequestUri](./get_requesturi/)() | Hämtar URI:n för den begärda resursen. |
| [get_Version](./get_version/)() | RTTI-information. |
| [HttpRequestMessage](./httprequestmessage/)() | Skapar en ny instans. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, System::SharedPtr\<Uri\>) | Skapar en ny instans. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, String) | Skapar en ny instans. |
| [MarkAsSent](./markassent/)() | Markerar den aktuella förfrågan som skickad. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | Ställer in innehållet i HTTP-förfrågan. |
| [set_Method](./set_method/)(System::SharedPtr\<HttpMethod\>) | Ställer in HTTP-förfrågningsmetoden. |
| [set_RequestUri](./set_requesturi/)(System::SharedPtr\<Uri\>) | Ställer in URI:n för den begärda resursen. |
| [set_Version](./set_version/)(System::Version) | Ställer in HTTP-versionen. |
| [ToString](./tostring/)() const override | Analog till C# [Object.ToString()](../../system/object/tostring/) metod. Gör det möjligt att konvertera anpassade objekt till sträng. |
## Se även

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
