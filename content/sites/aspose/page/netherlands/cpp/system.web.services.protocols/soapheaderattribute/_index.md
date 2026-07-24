---
title: "System::Web::Services::Protocols::SoapHeaderAttribute klasse"
linktitle: "SoapHeaderAttribute"
second_title: "Aspose.Page voor C++"
description: "System::Web::Services::Protocols::SoapHeaderAttribute klasse. Specificeert de SOAP-header die de XML Web-service methode of de XML Web-service client kan verwerken. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 700
url: /nl/cpp/system.web.services.protocols/soapheaderattribute/
---
## SoapHeaderAttribute class


Specificeert de SOAP-header die de XML [Web](../../system.web/) service‑methode of de XML [Web](../../system.web/) service‑client kan verwerken. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class SoapHeaderAttribute : public System::Attribute
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Direction](./get_direction/)() | RTTI-informatie. |
| [get_MemberName](./get_membername/)() | Haalt de naam van een lidvariabele van de XML SOAP-service op die wordt gebruikt om de inhoud van de SOAP-header te ontvangen. |
| [get_Required](./get_required/)() | Haalt een waarde op die aangeeft of de SOAP-header moet worden begrepen en verwerkt door de ontvangende XML [Web](../../system.web/) service of XML [Web](../../system.web/) service‑client. |
| [set_Direction](./set_direction/)(SoapHeaderDirection) | Stelt de richting van de SOAP-header in. |
| [set_MemberName](./set_membername/)(String) | Stelt de naam van een lidvariabele van de XML SOAP-service in die wordt gebruikt om de inhoud van de SOAP-header te ontvangen. |
| [set_Required](./set_required/)(bool) | Stelt een waarde in die aangeeft of de SOAP-header moet worden begrepen en verwerkt door de ontvangende XML [Web](../../system.web/) service of XML [Web](../../system.web/) service‑client. |
| [SoapHeaderAttribute](./soapheaderattribute/)(String) | Construeert een nieuw exemplaar. |
## Zie ook

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
