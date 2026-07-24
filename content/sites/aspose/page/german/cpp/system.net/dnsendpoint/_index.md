---
title: "System::Net::DnsEndPoint Klasse"
linktitle: "DnsEndPoint"
second_title: "Aspose.Page für C++"
description: "System::Net::DnsEndPoint Klasse. Enthält Informationen, die von der Anwendung zum Verbinden mit dem Dienst verwendet werden. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 800
url: /de/cpp/system.net/dnsendpoint/
---
## DnsEndPoint class


Enthält Informationen, die von der Anwendung zum Verbinden mit dem Dienst verwendet werden. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class DnsEndPoint : public System::Net::EndPoint
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t) | Konstruiert eine neue Instanz. |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t, System::Net::Sockets::AddressFamily) | Konstruiert eine neue Instanz. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-[Object.Equals](../../system/object/equals/)-Semantik. |
| [get_AddressFamily](./get_addressfamily/)() override | RTTI-Informationen. |
| [get_Host](./get_host/)() | RTTI-Informationen. |
| [get_Port](./get_port/)() | Gibt die Portnummer zurück. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Konvertierung benutzerdefinierter Objekte in einen String. |
## Siehe auch

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
