---
title: "System::IFormatProvider Klasse"
linktitle: "IFormatProvider"
second_title: "Aspose.Font für C++"
description: "System::IFormatProvider Klasse. Definiert eine Methode, die Formatierungsinformationen bereitstellt. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3800
url: /de/cpp/system/iformatprovider/
---
## IFormatProvider class


Definiert eine Methode, die Formatierungsinformationen bereitstellt. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class IFormatProvider : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [GetFormat](./getformat/)(const TypeInfo\&) | Gibt ein Objekt zurück, das Formatierungsdienste für den angegebenen Typ bereitstellt. |
## Siehe auch

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
