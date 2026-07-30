---
title: "System::Array::Enumerator Klasse"
linktitle: "Enumerator"
second_title: "Aspose.Font für C++"
description: "System::Array::Enumerator Klasse. Implementiert das IEnumerator-Interface, das die Aufzählung von Elementen eines Array-Objekts ermöglicht. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 6800
url: /de/cpp/system/array/enumerator/
---
## Enumerator class


Implementiert das IEnumerator-Interface, das die Aufzählung von Elementen eines [Array](../)-Objekts ermöglicht. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<T>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<Array\<T\>\>\&) | Konstruiert ein neues [Enumerator](./)-Objekt, das das angegebene Array repräsentiert. |
| [get_Current](./get_current/)() const override | Gibt eine Kopie des aktuellen Elements zurück. |
| [MoveNext](./movenext/)() override | Überprüft, ob der Index des aktuellen Elements nicht auf das letzte Element im Array zeigt und erhöht ihn, falls dies nicht der Fall ist. |
| [Reset](./reset/)() override | Setzt den Index des aktuellen Elements zurück. |
| virtual [~Enumerator](./~enumerator/)() | Destruktor. |
## Siehe auch

* Class [Object](../../object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
