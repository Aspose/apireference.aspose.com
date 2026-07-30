---
title: "System::Net::IPAddress Klasse"
linktitle: "IPAddress"
second_title: "Aspose.Font für C++"
description: "System::Net::IPAddress Klasse. Stellt die IP-Adresse dar. Objekte dieser Klasse sollten nur über die System::MakeObject() Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2400
url: /de/cpp/system.net/ipaddress/
---
## IPAddress class


Stellt die IP-Adresse dar. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/) Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in den [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class IPAddress : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-Semantik von [Object.Equals](../../system/object/equals/). |
| [get_AddressFamily](./get_addressfamily/)() | Gibt die Adressfamilie zurück. |
| [get_IsIPv4MappedToIPv6](./get_isipv4mappedtoipv6/)() | Gibt einen Wert zurück, der angibt, ob die Adresse eine IPv4-Adresse ist und auf eine IPv6-Adresse abgebildet wird. |
| [get_IsIPv6LinkLocal](./get_isipv6linklocal/)() | Gibt einen Wert zurück, der angibt, ob die Adresse eine IPv6-Link-Local-Adresse ist. |
| [get_IsIPv6Multicast](./get_isipv6multicast/)() | Gibt einen Wert zurück, der angibt, ob die Adresse eine globale IPv6-Multicast-Adresse ist. |
| [get_IsIPv6SiteLocal](./get_isipv6sitelocal/)() | Gibt einen Wert zurück, der angibt, ob die Adresse eine IPv6-Site-Local-Adresse ist. |
| [get_IsIPv6Teredo](./get_isipv6teredo/)() | Gibt einen Wert zurück, der angibt, ob die Adresse eine IPv6-Teredo-Adresse ist. |
| [get_ScopeId](./get_scopeid/)() | Ermittelt den Scope-Identifikator der IPv6-Adresse. |
| [GetAddressBytes](./getaddressbytes/)() | Gibt ein Byte-Array der IP-Adresse zurück. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| [GetImpl](./getimpl/)() const | Gibt einen Zeiger auf die Implementierung zurück. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int64_t) | Konvertiert die angegebene Host-Byte-Reihenfolge in die entsprechende Netzwerk-Byte-Reihenfolge. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int32_t) | Konvertiert die angegebene Host-Byte-Reihenfolge in die entsprechende Netzwerk-Byte-Reihenfolge. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int16_t) | Konvertiert die angegebene Host-Byte-Reihenfolge in die entsprechende Netzwerk-Byte-Reihenfolge. |
| [IPAddress](./ipaddress/)(int64_t) | Erstellt eine neue Instanz. |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>, int64_t) | Erstellt eine neue Instanz. |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>) | Erstellt eine neue Instanz. |
| [IPAddress](./ipaddress/)() | Erstellt eine neue Instanz. |
| static [IsLoopback](./isloopback/)(System::SharedPtr\<IPAddress\>) | Gibt einen Wert zurück, der angibt, ob die angegebene Adresse eine Loopback-Adresse ist. |
| [MapToIPv4](./maptoipv4/)() | Mappt die Adresse auf die IPv4-Adresse. |
| [MapToIPv6](./maptoipv6/)() | Mappt die Adresse auf die IPv6-Adresse. |
| static [NetworkToHostOrder](./networktohostorder/)(int64_t) | Konvertiert die angegebene Netzwerk-Byte-Reihenfolge in die entsprechende Host-Byte-Reihenfolge. |
| static [NetworkToHostOrder](./networktohostorder/)(int32_t) | Konvertiert die angegebene Netzwerk-Byte-Reihenfolge in die entsprechende Host-Byte-Reihenfolge. |
| static [NetworkToHostOrder](./networktohostorder/)(int16_t) | Konvertiert die angegebene Netzwerk-Byte-Reihenfolge in die entsprechende Host-Byte-Reihenfolge. |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der [IPAddress](./)-Klasse. |
| [set_ScopeId](./set_scopeid/)(int64_t) | Setzt den Scope-Identifier der IPv6-Adresse. |
| [SetImpl](./setimpl/)(ImplPtr) | Setzt einen Zeiger auf die Implementierung. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<IPAddress\>\&) | Versucht, einen übergebenen String in eine Instanz der [IPAddress](./)-Klasse zu konvertieren. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Any](./any/) | RTTI-Informationen. |
| static [Broadcast](./broadcast/) | Die IPv4-Broadcast-Adresse. |
| static [IPv6Any](./ipv6any/) | Die IPv6-Adresse, die angibt, ob der Server alle Netzwerkschnittstellen abhören muss. |
| static [IPv6Loopback](./ipv6loopback/) | Die IPv6-Loopback-Adresse. |
| static [IPv6None](./ipv6none/) | Die IPv6-Adresse, die angibt, ob der Server keine Netzwerkschnittstelle abhören darf. |
| static [Loopback](./loopback/) | Die IPv4-Loopback-Adresse. |
| static [None](./none/) | Die IPv4-Adresse, die angibt, ob der Server keine Netzwerkschnittstelle abhören darf. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [ImplPtr](./implptr/) | Ein Zeiger auf den Implementierungstyp. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
