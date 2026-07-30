---
title: "System::ICloneable Klasse"
linktitle: "ICloneable"
second_title: "Aspose.Font für C++"
description: "System::ICloneable Klasse. Definiert eine Methode, die das Klonen von Objekten ermöglicht – das Erstellen einer Kopie eines Objekts. Objekte dieser Klasse sollten nur mit der System::MakeObject() Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3200
url: /de/cpp/system/icloneable/
---
## ICloneable class


Definiert eine Methode, die das Klonen von Objekten ermöglicht – das Erstellen einer Kopie eines Objekts. Objekte dieser Klasse sollten nur mit der [System::MakeObject()](../makeobject/) Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ICloneable : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Clone](./clone/)() | RTTI-Informationen. |
## Siehe auch

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
