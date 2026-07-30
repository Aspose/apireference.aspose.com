---
title: "System::Collections::Generic::DefaultComparer Klasse"
linktitle: "DefaultComparer"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::DefaultComparer Klasse. Standardvergleichsklasse. Verwendet den Operator < und den Operator == zum Vergleichen von Werten. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1000
url: /de/cpp/system.collections.generic/defaultcomparer/
---
## DefaultComparer class


Standardvergleichsklasse. Verwendet den Operator < und den Operator == zum Vergleichen von Werten. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<class T>class DefaultComparer : public System::Collections::Generic::IComparer<T>
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ, der verglichen wird. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Compare](./compare/)(typename ThisType::args_type, typename ThisType::args_type) const override | RTTI-Informationen. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [BaseType](./basetype/) | Implementierte Schnittstelle. |
| [ThisType](./thistype/) | Aktueller Typ. |

## Siehe auch

* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
