---
title: "System::Web::Services::Protocols::SoapHeaderAttribute class"
linktitle: "SoapHeaderAttribute"
second_title: "Aspose.Page för C++"
description: "System::Web::Services::Protocols::SoapHeaderAttribute class. Anger SOAP‑huvudet som XML‑webbtjänstmetoden eller XML‑webbtjänstklienten kan bearbeta. Objekt av denna klass bör endast allokeras med System::MakeObject()‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 700
url: /sv/cpp/system.web.services.protocols/soapheaderattribute/
---
## SoapHeaderAttribute class


Anger SOAP‑huvudet som XML‑[Web](../../system.web/)‑tjänstmetoden eller XML‑[Web](../../system.web/)‑tjänsteklienten kan bearbeta. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i [System::SmartPtr](../../system/smartptr/)‑pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class SoapHeaderAttribute : public System::Attribute
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_Direction](./get_direction/)() | RTTI-information. |
| [get_MemberName](./get_membername/)() | Hämtar ett medlemsvariabelnamn för XML‑SOAP‑tjänsten som används för att ta emot SOAP‑huvudinnehållet. |
| [get_Required](./get_required/)() | Hämtar ett värde som indikerar om SOAP‑huvudet måste förstås och bearbetas av mottagarens XML‑[Web](../../system.web/)‑tjänst eller XML‑[Web](../../system.web/)‑klient. |
| [set_Direction](./set_direction/)(SoapHeaderDirection) | Ställer in SOAP‑huvudets riktning. |
| [set_MemberName](./set_membername/)(String) | Ställer in ett medlemsvariabelnamn för XML‑SOAP‑tjänsten som används för att ta emot SOAP‑huvudinnehållet. |
| [set_Required](./set_required/)(bool) | Ställer in ett värde som indikerar om SOAP‑huvudet måste förstås och bearbetas av mottagarens XML‑[Web](../../system.web/)‑tjänst eller XML‑[Web](../../system.web/)‑klient. |
| [SoapHeaderAttribute](./soapheaderattribute/)(String) | Skapar en ny instans. |
## Se även

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
