---
title: "System::Net::IPHostEntry Klasse"
linktitle: "IPHostEntry"
second_title: "Aspose.Font für C++"
description: "System::Net::IPHostEntry Klasse. Stellt Informationen über eine Internet‑Hostadresse dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2600
url: /de/cpp/system.net/iphostentry/
---
## IPHostEntry class


Stellt Informationen über eine Internet‑Hostadresse dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class IPHostEntry : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_AddressList](./get_addresslist/)() | Ruft die Sammlung der IP‑Adressen des Hosts ab. |
| [get_Aliases](./get_aliases/)() | Ruft die Sammlung der Aliasnamen des Hosts ab. |
| [get_HostName](./get_hostname/)() const | RTTI-Informationen. |
| [IPHostEntry](./iphostentry/)() | Erstellt eine neue Instanz. |
| [set_AddressList](./set_addresslist/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>) | Setzt eine Sammlung von IP‑Adressen des Hosts. |
| [set_Aliases](./set_aliases/)(System::ArrayPtr\<String\>) | Setzt eine Sammlung von Aliasnamen des Hosts. |
| [set_HostName](./set_hostname/)(String) | Setzt den Hostnamen. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
