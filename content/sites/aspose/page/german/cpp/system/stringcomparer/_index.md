---
title: "System::StringComparer-Klasse"
linktitle: "StringComparer"
second_title: "Aspose.Page für C++"
description: "System::StringComparer-Klasse. Vergleicht Zeichenketten mithilfe verschiedener Vergleichsmodi. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 5900
url: /de/cpp/system/stringcomparer/
---
## StringComparer class


Vergleicht Zeichenketten mithilfe verschiedener Vergleichsmodi. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mittels operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class StringComparer : public virtual System::Object,
                       public System::Collections::Generic::IComparer<String>,
                       public System::Collections::Generic::IEqualityComparer<String>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | Vergleicht zwei Zeichenketten mit den aktuellen Einstellungen. |
| static [Create](./create/)(const System::SharedPtr\<System::Globalization::CultureInfo\>\&, bool) | Erstellt kulturspezifischen Vergleicher. |
| [Equals](./equals/)(String, String) const override | Prüft, ob zwei Zeichenketten mit den aktuellen Einstellungen gleich sind. |
| static [get_CurrentCulture](./get_currentculture/)() | Singleton des Vergleichers für die aktuelle Kultur. |
| static [get_CurrentCultureIgnoreCase](./get_currentcultureignorecase/)() | Singleton des Vergleichers für die aktuelle Kultur, der die Groß-/Kleinschreibung ignoriert. |
| static [get_InvariantCulture](./get_invariantculture/)() | Singleton des Vergleichers für die Invariante Kultur. |
| static [get_InvariantCultureIgnoreCase](./get_invariantcultureignorecase/)() | Singleton des Vergleichers für die Invariante Kultur, der die Groß-/Kleinschreibung ignoriert. |
| static [get_Ordinal](./get_ordinal/)() | Singleton des ordinalen Vergleichers. |
| static [get_OrdinalIgnoreCase](./get_ordinalignorecase/)() | Singleton des ordinalen Vergleichers, der die Groß-/Kleinschreibung ignoriert. |
| [GetHashCode](./gethashcode/)(String) const override | Gibt den Hashcode der Zeichenkette zurück. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [args_type](./args_type/) | RTTI-Informationen. |
## Siehe auch

* Class [Object](../object/)
* Class [IComparer](../../system.collections.generic/icomparer/)
* Class [IEqualityComparer](../../system.collections.generic/iequalitycomparer/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
