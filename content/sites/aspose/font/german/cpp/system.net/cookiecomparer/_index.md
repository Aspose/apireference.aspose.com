---
title: "System::Net::CookieComparer-Klasse"
linktitle: "CookieComparer"
second_title: "Aspose.Font für C++"
description: "System::Net::CookieComparer-Klasse. Wird verwendet, um Instanzen der Cookie-Klasse zu vergleichen. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.net/cookiecomparer/
---
## CookieComparer class


Wird verwendet, um Instanzen der [Cookie](../cookie/)-Klasse zu vergleichen. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class CookieComparer : public System::Collections::Generic::IComparer<System::SharedPtr<System::Net::Cookie>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | Vergleicht die angegebenen Objekte. |
| static [get_Instance](./get_instance/)() | RTTI-Informationen. |
## Siehe auch

* Class [IComparer](../../system.collections.generic/icomparer/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
