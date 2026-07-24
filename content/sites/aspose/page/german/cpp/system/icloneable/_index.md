---
title: "Klasse System::ICloneable"
linktitle: "ICloneable"
second_title: "Aspose.Page für C++"
description: "Klasse System::ICloneable. Definiert eine Methode, die das Klonen von Objekten ermöglicht – das Erstellen einer Kopie eines Objekts. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3200
url: /de/cpp/system/icloneable/
---
## ICloneable class


Definiert eine Methode, die das Klonen von Objekten ermöglicht – das Erstellen einer Kopie eines Objekts. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

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
* Library [Aspose.Page for C++](../../)
