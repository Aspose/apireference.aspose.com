---
title: "System::Globalization::SortVersion Klasse"
linktitle: "SortVersion"
second_title: "Aspose.Page für C++"
description: "System::Globalization::SortVersion Klasse. Stellt Informationen über die Unicode-Version bereit, die zum Vergleichen und Sortieren von Zeichenketten verwendet wird. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2300
url: /de/cpp/system.globalization/sortversion/
---
## SortVersion class


Stellt Informationen über die Unicode-Version bereit, die zum Vergleichen und Sortieren von Zeichenketten verwendet wird. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class SortVersion : public System::IEquatable<SharedPtr<SortVersion>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<SortVersion\>) override | Überprüft, ob die aktuelle [SortVersion](./)-Instanz gleich einem angegebenen [SortVersion](./)-Objekt ist. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Überprüft, ob die aktuelle [SortVersion](./)-Instanz gleich einem angegebenen [SortVersion](./)-Objekt ist. |
| [get_FullVersion](./get_fullversion/)() | Liefert die vollständige Versionsnummer. |
| [get_SortId](./get_sortid/)() | Liefert die eindeutige Kennung für dieses Objekt. |
| [GetHashCode](./gethashcode/)() const override | Liefert den Hashcode für das aktuelle Objekt. |
| [operator!=](./operator!=/)(const SortVersion\&) | Überprüft, ob die aktuelle [SortVersion](./)-Instanz nicht gleich einem angegebenen [SortVersion](./)-Objekt ist. |
| [operator=](./operator=/)(const SortVersion\&) |  |
| [operator==](./operator==/)(const SortVersion\&) | Überprüft, ob die aktuelle [SortVersion](./)-Instanz gleich einem angegebenen [SortVersion](./)-Objekt ist. |
| [SortVersion](./sortversion/)(int, const Guid\&) | RTTI-Informationen. |
| [SortVersion](./sortversion/)(const SortVersion\&) |  |
## Siehe auch

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
