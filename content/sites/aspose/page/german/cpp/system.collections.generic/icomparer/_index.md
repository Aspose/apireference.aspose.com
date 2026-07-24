---
title: "System::Collections::Generic::IComparer Klasse"
linktitle: "IComparer"
second_title: "Aspose.Page für C++"
description: "System::Collections::Generic::IComparer Klasse. Schnittstelle, die zwei Objekte im Sinne von größer‑gleich‑kleiner vergleicht. Objekte dieser Klasse sollten nur über die System::MakeObject()‑Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2000
url: /de/cpp/system.collections.generic/icomparer/
---
## IComparer class


Schnittstelle, die zwei Objekte im Sinne von größer‑gleich‑kleiner vergleicht. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename T>class IComparer : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Compare](./compare/)(args_type, args_type) const | [Comparison](../../system/comparison/) Funktion. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [args_type](./args_type/) | RTTI-Informationen. |

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
