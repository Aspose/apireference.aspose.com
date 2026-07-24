---
title: "System::Net::EndPoint Klasse"
linktitle: "EndPoint"
second_title: "Aspose.Page für C++"
description: "System::Net::EndPoint Klasse. Die abstrakte Klasse enthält eine Netzwerkadresse. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 900
url: /de/cpp/system.net/endpoint/
---
## EndPoint class


Die abstrakte Klasse enthält eine Netzwerkadresse. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class EndPoint : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Create](./create/)(System::SharedPtr\<SocketAddress\>) | Erstellen Sie eine neue Instanz der [EndPoint](./)-Klasse unter Verwendung der angegebenen Socket-Adresse. |
| virtual [get_AddressFamily](./get_addressfamily/)() | RTTI-Informationen. |
| virtual [GetImpl](./getimpl/)() const | Gibt einen Zeiger auf die Implementierung zurück. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [ImplPtr](./implptr/) | Ein Zeiger auf die Implementierung. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
