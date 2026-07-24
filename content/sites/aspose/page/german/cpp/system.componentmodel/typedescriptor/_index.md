---
title: "System::ComponentModel::TypeDescriptor Klasse"
linktitle: "TypeDescriptor"
second_title: "Aspose.Page für C++"
description: "System::ComponentModel::TypeDescriptor Klasse. Dummy‑Klasse, damit Code, der TypeDescriptor verwendet, nach der Übersetzung kompiliert werden kann. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1500
url: /de/cpp/system.componentmodel/typedescriptor/
---
## TypeDescriptor class


Dummy-Klasse für TypeDescriptor-verwendenden Code, damit er nach der Übersetzung kompiliert. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class TypeDescriptor : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [GetConverter](./getconverter/)(const TypeInfo\&) | RTTI-Informationen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
