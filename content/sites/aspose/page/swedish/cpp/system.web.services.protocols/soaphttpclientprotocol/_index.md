---
title: "System::Web::Services::Protocols::SoapHttpClientProtocol class"
linktitle: "SoapHttpClientProtocol"
second_title: "Aspose.Page för C++"
description: "System::Web::Services::Protocols::SoapHttpClientProtocol class. Klientproxytjänsterna måste ärva denna klass när SOAP används. Objekt av denna klass bör endast allokeras med System::MakeObject()‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 900
url: /sv/cpp/system.web.services.protocols/soaphttpclientprotocol/
---
## SoapHttpClientProtocol class


Klientproxytjänsterna måste ärva denna klass när SOAP används. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i [System::SmartPtr](../../system/smartptr/)‑pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class SoapHttpClientProtocol : public System::Web::Services::Protocols::HttpWebClientProtocol
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Discover](./discover/)() | Binder den aktuella instansen till XML‑[Web](../../system.web/)‑tjänsten. |
| [get_SoapVersion](./get_soapversion/)() | Hämtar SOAP‑versionen. |
| [InitializeSerializers](./initializeserializers/)(const System::TypeInfo\&, System::SharedPtr\<System::Xml::Serialization::XmlSerializerImplementation\>, String) | Initierar de interna fälten. |
| [set_SoapVersion](./set_soapversion/)(SoapProtocolVersion) | Ställer in SOAP‑versionen. |
| [SoapHttpClientProtocol](./soaphttpclientprotocol/)() | Skapar en ny instans. |
## Se även

* Class [HttpWebClientProtocol](../httpwebclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
