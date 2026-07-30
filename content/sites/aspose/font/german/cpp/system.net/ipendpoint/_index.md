---
title: "System::Net::IPEndPoint Klasse"
linktitle: "IPEndPoint"
second_title: "Aspose.Font für C++"
description: "System::Net::IPEndPoint Klasse. Stellt einen Netzwerk-Endpunkt dar, der eine IP-Adresse und einen Port enthält. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2500
url: /de/cpp/system.net/ipendpoint/
---
## IPEndPoint class


Stellt einen Netzwerk-Endpunkt dar, der eine IP-Adresse und einen Port enthält. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class IPEndPoint : public System::Net::EndPoint
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Create](./create/)(System::SharedPtr\<SocketAddress\>) override | Erstellen Sie eine neue Instanz der [EndPoint](../endpoint/) Klasse mit der angegebenen Socket-Adresse. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-Semantik von [Object.Equals](../../system/object/equals/). |
| [get_Address](./get_address/)() | Liest die Endpunktadresse. |
| [get_AddressFamily](./get_addressfamily/)() override | RTTI-Informationen. |
| [get_Port](./get_port/)() | Liest die Portnummer. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| [GetImpl](./getimpl/)() const override | Gibt einen Zeiger auf die Implementierung zurück. |
| [IPEndPoint](./ipendpoint/)(int64_t, int32_t) | Erstellt eine neue Instanz. |
| [IPEndPoint](./ipendpoint/)(System::SharedPtr\<IPAddress\>, int32_t) | Erstellt eine neue Instanz. |
| [set_Address](./set_address/)(System::SharedPtr\<IPAddress\>) | Setzt die Endpunktadresse. |
| [set_Port](./set_port/)(int32_t) | Setzt die Portnummer. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Any](./any/) | Der Endpunkt für jede IPv4-Adresse und jeden Port. |
| static [AnyPort](./anyport/) | Ein Wert, der angibt, ob ein beliebiger Port verwendet werden kann. |
| static [IPv6Any](./ipv6any/) | Der Endpunkt für jede IPv6-Adresse und jeden Port. |
| static [MaxPort](./maxport/) | Die maximale Portnummer. |
| static [MinPort](./minport/) | RTTI-Informationen. |
## Siehe auch

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
