---
title: "System::Reflection::AssemblyName class"
linktitle: "AssemblyName"
second_title: "Aspose.Page für C++"
description: "System::Reflection::AssemblyName class. Definiert den Namen der Assembly. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 200
url: /de/cpp/system.reflection/assemblyname/
---
## AssemblyName class


Definiert den Namen der Assembly. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class AssemblyName : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AssemblyName](./assemblyname/)() | Konstruktor. |
| [AssemblyName](./assemblyname/)(const String\&) | Konstruktor. |
| [AssemblyName](./assemblyname/)(const String\&, const Version\&) | Konstruktor. |
| [get_Name](./get_name/)() | Liefert den Namen der Assembly. |
| [get_Version](./get_version/)() | Liest die Assembly-Version. |
| [set_Name](./set_name/)(const String\&) | Setzt den Assembly-Namen. |
| [set_Version](./set_version/)(const Version\&) | Setzt die Assembly-Version. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
