---
title: "System::DefaultBoxedValue-Klasse"
linktitle: "DefaultBoxedValue"
second_title: "Aspose.Font für C++"
description: "System::DefaultBoxedValue-Klasse. Implementierung der BoxedValue-Klasse. Ermöglicht es, Spezialiserungen von BoxingValue zu deklarieren, ohne gemeinsamen Code zu duplizieren. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2000
url: /de/cpp/system/defaultboxedvalue/
---
## DefaultBoxedValue class


[BoxedValue](../boxedvalue/) class implementation. Allows it BoxingValue specializations to be declared without duplicating common code. Objects of this class should only be allocated using [System::MakeObject()](../makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<class T>class DefaultBoxedValue : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [DefaultBoxedValue](./defaultboxedvalue/)(const T\&) | Konstruiert eine neue Instanz der [DefaultBoxedValue](./)-Klasse, die den angegebenen Wert darstellt. |
| [Equals](./equals/)(ptr) override | Bestimmt die Gleichheit der von dem aktuellen und dem angegebenen Objekt dargestellten verpackten Werte. |
| [GetHashCode](./gethashcode/)() const override | Gibt einen Hashcode für das aktuelle Objekt zurück. |
| [GetType](./gettype/)() const override | Ermittelt den tatsächlichen Typ des Objekts. |
| [is](./is/)() const | Bestimmt, ob der Typ des von dem aktuellen Objekt dargestellten verpackten Wertes **V** ist. |
| [ToString](./tostring/)() const override | Gibt die Zeichenkettenrepräsentation des verpackten Werts zurück. |
| [unbox](./unbox/)() const | Entpackt den verpackten Wert. |
## Siehe auch

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
