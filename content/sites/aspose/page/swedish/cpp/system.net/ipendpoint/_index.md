---
title: "System::Net::IPEndPoint class"
linktitle: "IPEndPoint"
second_title: "Aspose.Page för C++"
description: "System::Net::IPEndPoint-klass. Representerar en nätverksändpunkt som innehåller en IP-adress och en port. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 2500
url: /sv/cpp/system.net/ipendpoint/
---
## IPEndPoint class


Representerar en nätverksändpunkt som innehåller en IP-adress och en port. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class IPEndPoint : public System::Net::EndPoint
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Create](./create/)(System::SharedPtr\<SocketAddress\>) override | Skapa en ny instans av [EndPoint](../endpoint/) klassen med den angivna socketadressen. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Jämför objekt med C# [Object.Equals](../../system/object/equals/) semantik. |
| [get_Address](./get_address/)() | Hämtar ändpunktsadressen. |
| [get_AddressFamily](./get_addressfamily/)() override | RTTI-information. |
| [get_Port](./get_port/)() | Hämtar portnumret. |
| [GetHashCode](./gethashcode/)() const override | Analog till C# [Object.GetHashCode()](../../system/object/gethashcode/)-metoden. Möjliggör hashning av anpassade objekt. |
| [GetImpl](./getimpl/)() const override | Returnerar en pekare till implementationen. |
| [IPEndPoint](./ipendpoint/)(int64_t, int32_t) | Skapar en ny instans. |
| [IPEndPoint](./ipendpoint/)(System::SharedPtr\<IPAddress\>, int32_t) | Skapar en ny instans. |
| [set_Address](./set_address/)(System::SharedPtr\<IPAddress\>) | Sätter ändpunktsadressen. |
| [set_Port](./set_port/)(int32_t) | Sätter portnumret. |
| [ToString](./tostring/)() const override | Analog till C# [Object.ToString()](../../system/object/tostring/) metod. Gör det möjligt att konvertera anpassade objekt till sträng. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| static [Any](./any/) | Ändpunkten för alla IPv4-adresser och alla portar. |
| static [AnyPort](./anyport/) | Ett värde som indikerar om någon port kan användas. |
| static [IPv6Any](./ipv6any/) | Ändpunkten för alla IPv6-adresser och alla portar. |
| static [MaxPort](./maxport/) | Det maximala portnumret. |
| static [MinPort](./minport/) | RTTI-information. |
## Se även

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
