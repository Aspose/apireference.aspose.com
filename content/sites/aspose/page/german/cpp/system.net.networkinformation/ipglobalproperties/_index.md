---
title: "System::Net::NetworkInformation::IPGlobalProperties Klasse"
linktitle: "IPGlobalProperties"
second_title: "Aspose.Page für C++"
description: "System::Net::NetworkInformation::IPGlobalProperties Klasse. Stellt Informationen über die Netzwerkverbindung des lokalen Computers dar. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 200
url: /de/cpp/system.net.networkinformation/ipglobalproperties/
---
## IPGlobalProperties class


Stellt Informationen über die Netzwerkverbindung des lokalen Computers dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class IPGlobalProperties : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [get_DomainName](./get_domainname/)() | Gibt die Domäne zurück, in der der lokale Computer registriert ist. |
| virtual [get_HostName](./get_hostname/)() | Gibt den Hostnamen des lokalen Computers zurück. |
| static [GetIPGlobalProperties](./getipglobalproperties/)() | RTTI-Informationen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Net::NetworkInformation](../)
* Library [Aspose.Page for C++](../../)
