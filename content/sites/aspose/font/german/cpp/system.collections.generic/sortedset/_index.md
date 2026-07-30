---
title: "System::Collections::Generic::SortedSet Klasse"
linktitle: "SortedSet"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::SortedSet Klasse. Vorwärtsdeklaration der SortedSet-Klasse in C++."
type: docs
weight: 4400
url: /de/cpp/system.collections.generic/sortedset/
---
## SortedSet class


Vorwärtsdeklaration der [SortedSet](./)-Klasse.

```cpp
template<typename T>class SortedSet : public System::Collections::Generic::BaseSet<T, std::set<T, ComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Max](./get_max/)() const | Ermittelt den Maximalwert im [SortedSet](./). |
| [SortedSet](./sortedset/)() | RTTI-Informationen. |
| [SortedSet](./sortedset/)(int) | Erstellt ein leeres Set mit der angegebenen Kapazität. |
| [SortedSet](./sortedset/)(const SharedPtr\<IComparer\<T\>\>\&) | Erstellt ein leeres Set, das den angegebenen Gleichheitsvergleich verwendet. |
| [SortedSet](./sortedset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Erstellt ein [SortedSet](./) basierend auf aufzählbaren Werten. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [BaseType](./basetype/) | Vasentyp. |
| [ThisPtr](./thisptr/) | Zeigertyp. |
| [ThisType](./thistype/) | Selbsttyp. |
## Hinweise


Implementierung einer Menge geordneter Objekte. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
