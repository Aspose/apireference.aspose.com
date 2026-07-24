---
title: "System::Net::IPAddress klasse"
linktitle: "IPAddress"
second_title: "Aspose.Page voor C++"
description: "System::Net::IPAddress klasse. Vertegenwoordigt het IP-adres. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om het door te geven aan functies als argument in C++."
type: docs
weight: 2400
url: /nl/cpp/system.net/ipaddress/
---
## IPAddress class


Vertegenwoordigt het IP-adres. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om het door te geven aan functies als argument.

```cpp
class IPAddress : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_AddressFamily](./get_addressfamily/)() | Retourneert de adresfamilie. |
| [get_IsIPv4MappedToIPv6](./get_isipv4mappedtoipv6/)() | Geeft een waarde terug die aangeeft of het adres een IPv4-adres is en gemapt is naar een IPv6-adres. |
| [get_IsIPv6LinkLocal](./get_isipv6linklocal/)() | Geeft een waarde terug die aangeeft of het adres een IPv6 link-local adres is. |
| [get_IsIPv6Multicast](./get_isipv6multicast/)() | Geeft een waarde terug die aangeeft of het adres een globaal IPv6 multicast-adres is. |
| [get_IsIPv6SiteLocal](./get_isipv6sitelocal/)() | Geeft een waarde terug die aangeeft of het adres een IPv6 site-local adres is. |
| [get_IsIPv6Teredo](./get_isipv6teredo/)() | Geeft een waarde terug die aangeeft of het adres een IPv6 Teredo-adres is. |
| [get_ScopeId](./get_scopeid/)() | Haalt de scope‑identifier op van het IPv6-adres. |
| [GetAddressBytes](./getaddressbytes/)() | Geeft een byte‑array van het IP-adres terug. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| [GetImpl](./getimpl/)() const | Retourneert een pointer naar de implementatie. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int64_t) | Converteert de opgegeven host‑byte‑order naar de overeenkomstige netwerk‑byte‑order. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int32_t) | Converteert de opgegeven host‑byte‑order naar de overeenkomstige netwerk‑byte‑order. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int16_t) | Converteert de opgegeven host‑byte‑order naar de overeenkomstige netwerk‑byte‑order. |
| [IPAddress](./ipaddress/)(int64_t) | Construeert een nieuw exemplaar. |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>, int64_t) | Construeert een nieuw exemplaar. |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>) | Construeert een nieuw exemplaar. |
| [IPAddress](./ipaddress/)() | Construeert een nieuw exemplaar. |
| static [IsLoopback](./isloopback/)(System::SharedPtr\<IPAddress\>) | Geeft een waarde terug die aangeeft of het opgegeven adres een loopback‑adres is. |
| [MapToIPv4](./maptoipv4/)() | Mapt het adres naar het IPv4-adres. |
| [MapToIPv6](./maptoipv6/)() | Mapt het adres naar het IPv6-adres. |
| static [NetworkToHostOrder](./networktohostorder/)(int64_t) | Converteert de opgegeven netwerbytevolgorde naar de overeenkomstige hostbytevolgorde. |
| static [NetworkToHostOrder](./networktohostorder/)(int32_t) | Converteert de opgegeven netwerbytevolgorde naar de overeenkomstige hostbytevolgorde. |
| static [NetworkToHostOrder](./networktohostorder/)(int16_t) | Converteert de opgegeven netwerbytevolgorde naar de overeenkomstige hostbytevolgorde. |
| static [Parse](./parse/)(String) | Converteert een meegegeven string naar een instantie van de [IPAddress](./) klasse. |
| [set_ScopeId](./set_scopeid/)(int64_t) | Stelt de scope‑identificator van het IPv6-adres in. |
| [SetImpl](./setimpl/)(ImplPtr) | Stelt een pointer naar de implementatie in. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<IPAddress\>\&) | Probeert een meegegeven string te converteren naar een instantie van de [IPAddress](./) klasse. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Any](./any/) | RTTI-informatie. |
| static [Broadcast](./broadcast/) | Het IPv4-broadcastadres. |
| static [IPv6Any](./ipv6any/) | Het IPv6-adres dat aangeeft of de server op alle netwerkinterfaces moet luisteren. |
| static [IPv6Loopback](./ipv6loopback/) | Het IPv6-loopbackadres. |
| static [IPv6None](./ipv6none/) | Het IPv6-adres dat aangeeft of de server op geen enkele netwerkinterface mag luisteren. |
| static [Loopback](./loopback/) | Het IPv4-loopbackadres. |
| static [None](./none/) | Het IPv4-adres dat aangeeft of de server op geen enkele netwerkinterface mag luisteren. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [ImplPtr](./implptr/) | Een pointer naar het implementatietype. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
