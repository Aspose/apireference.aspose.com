---
title: "System::Net::SocketAddress Klasse"
linktitle: "SocketAddress"
second_title: "Aspose.Font für C++"
description: "System::Net::SocketAddress Klasse. Wird verwendet, um serialisierte Informationen über Instanzen der EndPoint‑Klasse zu speichern. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3300
url: /de/cpp/system.net/socketaddress/
---
## SocketAddress class


Wird verwendet, um serialisierte Informationen über die [EndPoint](../endpoint/) Klasseninstanzen zu speichern. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class SocketAddress : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-Semantik von [Object.Equals](../../system/object/equals/). |
| [get_Family](./get_family/)() | RTTI-Informationen. |
| [get_Size](./get_size/)() | Gibt die zugrunde liegende Puffergröße zurück. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| [idx_get](./idx_get/)(int32_t) | Liest einen Wert des zugrunde liegenden Puffers am angegebenen Index. |
| [idx_set](./idx_set/)(int32_t, uint8_t) | Setzt einen Wert des zugrunde liegenden Puffers am angegebenen Index. |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily) | Erstellt eine neue Instanz. |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily, int32_t) | Erstellt eine neue Instanz. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
