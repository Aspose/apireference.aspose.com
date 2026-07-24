---
title: "System::Net::IPHostEntry‑klasse"
linktitle: "IPHostEntry"
second_title: "Aspose.Page voor C++"
description: "System::Net::IPHostEntry‑klasse. Vertegenwoordigt informatie over een internethostadres. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 2600
url: /nl/cpp/system.net/iphostentry/
---
## IPHostEntry class


Vertegenwoordigt informatie over een internethostadres. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument door te geven aan functies.

```cpp
class IPHostEntry : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_AddressList](./get_addresslist/)() | Haalt de verzameling IP‑adressen van de host op. |
| [get_Aliases](./get_aliases/)() | Haalt de verzameling aliassen van de host op. |
| [get_HostName](./get_hostname/)() const | RTTI-informatie. |
| [IPHostEntry](./iphostentry/)() | Construeert een nieuw exemplaar. |
| [set_AddressList](./set_addresslist/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>) | Stelt een verzameling IP‑adressen van de host in. |
| [set_Aliases](./set_aliases/)(System::ArrayPtr\<String\>) | Stelt een verzameling aliassen van de host in. |
| [set_HostName](./set_hostname/)(String) | Stelt de hostnaam in. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
