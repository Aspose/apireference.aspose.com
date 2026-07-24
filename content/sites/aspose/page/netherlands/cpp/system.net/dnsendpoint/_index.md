---
title: "System::Net::DnsEndPoint class"
linktitle: "DnsEndPoint"
second_title: "Aspose.Page voor C++"
description: "System::Net::DnsEndPoint class. Bevat informatie die door de applicatie wordt gebruikt om verbinding te maken met de service. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 800
url: /nl/cpp/system.net/dnsendpoint/
---
## DnsEndPoint class


Bevat informatie die door de applicatie wordt gebruikt om verbinding te maken met de service. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class DnsEndPoint : public System::Net::EndPoint
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t) | Construeert een nieuw exemplaar. |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t, System::Net::Sockets::AddressFamily) | Construeert een nieuw exemplaar. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_AddressFamily](./get_addressfamily/)() override | RTTI-informatie. |
| [get_Host](./get_host/)() | RTTI-informatie. |
| [get_Port](./get_port/)() | Retourneert het poortnummer. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
## Zie ook

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
