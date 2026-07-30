---
title: "System::Attribute Klasse"
linktitle: "Attribute"
second_title: "Aspose.Font für C++"
description: "System::Attribute Klasse. Eine Basisklasse für benutzerdefinierte Attribute. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system/attribute/
---
## Attribute class


Eine Basisklasse für benutzerdefinierte Attribute. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Attribute : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&, const TypeInfo\&) | Gibt ein benutzerdefiniertes Attribut eines angegebenen Typs zurück, das auf den angegebenen Typ angewendet wurde. |
| static [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&) | Gibt alle benutzerdefinierten Attribute zurück, die auf den angegebenen Typ angewendet wurden. |
## Siehe auch

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
