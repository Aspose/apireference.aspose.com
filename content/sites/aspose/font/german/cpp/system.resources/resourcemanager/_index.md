---
title: "System::Resources::ResourceManager Klasse"
linktitle: "ResourceManager"
second_title: "Aspose.Font für C++"
description: "System::Resources::ResourceManager Klasse. Stellt eine API zur Verwaltung von Ressourcen bereit. Nicht implementiert. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 100
url: /de/cpp/system.resources/resourcemanager/
---
## ResourceManager class


Stellt eine API zur Verwaltung von Ressourcen bereit. Nicht implementiert. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ResourceManager : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [GetObject__](./getobject__/)(String) | Liefert ein Objekt aus der Ressource. Der Name ist nicht GetObject(), um das Define-Problem von GetObjectA zu umgehen. |
| virtual [GetObject__](./getobject__/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | Liefert ein Objekt aus der Ressource. Der Name ist nicht GetObject(), um das Define-Problem von GetObjectA zu umgehen. |
| virtual [GetString](./getstring/)(String) | Liefert Zeichenkettenressource. |
| virtual [GetString](./getstring/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | Liefert Zeichenkettenressource. |
| [ResourceManager](./resourcemanager/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | RTTI-Informationen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Resources](../)
* Library [Aspose.Font for C++](../../)
