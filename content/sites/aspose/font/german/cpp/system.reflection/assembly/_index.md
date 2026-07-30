---
title: "System::Reflection::Assembly Klasse"
linktitle: "Assembly"
second_title: "Aspose.Font für C++"
description: "System::Reflection::Assembly Klasse. Reflexionsklasse, die eine Assembly beschreibt. Die Unterstützung ist eingeschränkt, da die Regeln zwischen C# und C++ stark unterschiedlich sind. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() erstellt werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Pointer ein und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.reflection/assembly/
---
## Assembly class


[Reflection](../) class describing assembly. Support is limited as the rules are quite different between C# and C++. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Assembly : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Assembly](./assembly/)() | Konstruktor. |
| virtual [get_CodeBase](./get_codebase/)() const | Liefert das Verzeichnis der aktuellen Assembly. Unterstützung ist eingeschränkt. |
| virtual [get_FullName](./get_fullname/)() const | Liefert den vollständigen Namen der Assembly. |
| virtual [get_Location](./get_location/)() const | Liefert den Speicherort der Assembly. Nicht implementiert. |
| static [GetAssembly](./getassembly/)(const TypeInfo\&) | Liefert die Assembly, die den spezifischen Typ definiert. |
| static [GetCallingAssembly](./getcallingassembly/)() | Liefert die aufrufende Assembly. |
| static [GetEntryAssembly](./getentryassembly/)() | Liefert die Einstiegs-Assembly. |
| static [GetExecutingAssembly](./getexecutingassembly/)() | Liefert die ausführende Assembly. |
| virtual [GetManifestResourceNames](./getmanifestresourcenames/)() const | Liefert die Namen der Manifest-Ressourcen. |
| virtual [GetManifestResourceStream](./getmanifestresourcestream/)(String) const | Liefert den Stream, der mit der Manifest-Ressource verbunden ist. |
| virtual [GetName](./getname/)() const | Liefert den Namen der Assembly. |
| virtual [GetTypes](./gettypes/)() const | Liefert die von der Assembly deklarierten Typen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
