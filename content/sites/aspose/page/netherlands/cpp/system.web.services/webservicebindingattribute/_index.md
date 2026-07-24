---
title: "System::Web::Services::WebServiceBindingAttribute class"
linktitle: "WebServiceBindingAttribute"
second_title: "Aspose.Page voor C++"
description: "System::Web::Services::WebServiceBindingAttribute class. Gebruikt om een binding te declareren die een of meer methoden van de XML Web service definieert. Objecten van deze klasse moeten alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal resulteren in runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 400
url: /nl/cpp/system.web.services/webservicebindingattribute/
---
## WebServiceBindingAttribute class


Gebruikt om een binding te declareren die een of meer methoden van de XML [Web](../../system.web/) service definieert. Objecten van deze klasse moeten alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal resulteren in runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class WebServiceBindingAttribute : public System::Attribute
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_ConformsTo](./get_conformsto/)() | Haalt de WSI-specificatie op. |
| [get_EmitConformanceClaims](./get_emitconformanceclaims/)() | Haalt een waarde op die aangeeft of de binding conformiteitsclaims uitgeeft. |
| [get_Location](./get_location/)() | RTTI-informatie. |
| [get_Name](./get_name/)() | Haalt de naam van de binding op. |
| [get_Namespace](./get_namespace/)() | Haalt de namespace op die aan de binding is gekoppeld. |
| [set_ConformsTo](./set_conformsto/)(System::SharedPtr\<WsiProfiles\>) | Stelt de WSI-specificatie in. |
| [set_EmitConformanceClaims](./set_emitconformanceclaims/)(bool) | Stelt een waarde in die aangeeft of de binding conformiteitsclaims uitgeeft. |
| [set_Location](./set_location/)(String) | Stelt de locatie in waar de binding is gedefinieerd. |
| [set_Name](./set_name/)(String) | Stelt de naam van de binding in. |
| [set_Namespace](./set_namespace/)(String) | Stelt de namespace in die aan de binding is gekoppeld. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)() | Construeert een nieuw exemplaar. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String) | Construeert een nieuw exemplaar. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String) | Construeert een nieuw exemplaar. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String, String) | Construeert een nieuw exemplaar. |
## Zie ook

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services](../)
* Library [Aspose.Page for C++](../../)
