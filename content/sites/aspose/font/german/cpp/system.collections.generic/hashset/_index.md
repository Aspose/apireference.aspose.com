---
title: "System::Collections::Generic::HashSet Klasse"
linktitle: "HashSet"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::HashSet Klasse. Vorwärtsdeklaration der HashSet Klasse in C++."
type: docs
weight: 1700
url: /de/cpp/system.collections.generic/hashset/
---
## HashSet class


Vorwärtsdeklaration der [HashSet](./)-Klasse.

```cpp
template<typename T>class HashSet : public System::Collections::Generic::BaseSet<T, std::unordered_set<T, EqualityComparerHashAdapter<T>, EqualityComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [HashSet](./hashset/)() | RTTI-Informationen. |
| [HashSet](./hashset/)(int) | Erstellt ein leeres Set mit der angegebenen Kapazität. |
| [HashSet](./hashset/)(const SharedPtr\<IEqualityComparer\<T\>\>\&) | Erstellt ein leeres Set, das den angegebenen Gleichheitsvergleich verwendet. |
| [HashSet](./hashset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Erstellt ein HashSet basierend auf aufzählbaren Werten. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [BaseType](./basetype/) | Basistyp. |
| [ThisPtr](./thisptr/) | Zeigertyp. |
| [ThisType](./thistype/) | Selbsttyp. |
## Hinweise


Set-Implementierung basierend auf Hashing. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
