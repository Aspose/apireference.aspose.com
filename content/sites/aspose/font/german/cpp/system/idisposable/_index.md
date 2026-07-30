---
title: "System::IDisposable Klasse"
linktitle: "IDisposable"
second_title: "Aspose.Font für C++"
description: "System::IDisposable Klasse. Definiert eine Methode, die Ressourcen freigibt, die dem aktuellen Objekt gehören. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() erstellt werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3600
url: /de/cpp/system/idisposable/
---
## IDisposable class


Definiert eine Methode, die Ressourcen freigibt, die dem aktuellen Objekt gehören. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../makeobject/) erstellt werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class IDisposable : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Dispose](./dispose/)() | Tut nichts. |
## Siehe auch

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
