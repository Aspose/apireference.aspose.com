---
title: "System::Net::IPEndPoint klasse"
linktitle: "IPEndPoint"
second_title: "Aspose.Page voor C++"
description: "System::Net::IPEndPoint klasse. Vertegenwoordigt een netwerkeindpunt dat een IP-adres en een poort bevat. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2500
url: /nl/cpp/system.net/ipendpoint/
---
## IPEndPoint class


Vertegenwoordigt een netwerkeindpunt dat een IP-adres en een poort bevat. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class IPEndPoint : public System::Net::EndPoint
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Create](./create/)(System::SharedPtr\<SocketAddress\>) override | Maak een nieuw exemplaar van de [EndPoint](../endpoint/) klasse aan met het opgegeven socketadres. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_Address](./get_address/)() | Haalt het eindpuntadres op. |
| [get_AddressFamily](./get_addressfamily/)() override | RTTI-informatie. |
| [get_Port](./get_port/)() | Haalt het poortnummer op. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| [GetImpl](./getimpl/)() const override | Retourneert een pointer naar de implementatie. |
| [IPEndPoint](./ipendpoint/)(int64_t, int32_t) | Construeert een nieuw exemplaar. |
| [IPEndPoint](./ipendpoint/)(System::SharedPtr\<IPAddress\>, int32_t) | Construeert een nieuw exemplaar. |
| [set_Address](./set_address/)(System::SharedPtr\<IPAddress\>) | Stelt het eindpuntadres in. |
| [set_Port](./set_port/)(int32_t) | Stelt het poortnummer in. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Any](./any/) | Het eindpunt voor elk IPv4-adres en elke poort. |
| static [AnyPort](./anyport/) | Een waarde die aangeeft of elke poort kan worden gebruikt. |
| static [IPv6Any](./ipv6any/) | Het eindpunt voor elk IPv6-adres en elke poort. |
| static [MaxPort](./maxport/) | Het maximale poortnummer. |
| static [MinPort](./minport/) | RTTI-informatie. |
## Zie ook

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
