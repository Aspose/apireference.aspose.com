---
title: "System::Collections::Generic::BaseSet Klasse"
linktitle: "BaseSet"
second_title: "Aspose.Font für C++"
description: "Wie man die System::Collections::Generic::BaseSet Klasse in C++ verwendet."
type: docs
weight: 800
url: /de/cpp/system.collections.generic/baseset/
---
## BaseSet class




```cpp
template<typename T,typename SET_T>class BaseSet : public virtual System::Object,
                                                   public System::Collections::Generic::ICollection<T>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | C++-spezifisch. |
| [Add](./add/)(const T\&) override | Fügt ein Element zum Set hinzu. |
| [begin](./begin/)() const | Erhält einen Iterator zum ersten Element der const‑qualifizierten Sammlung. |
| [cbegin](./cbegin/)() const | Erhält einen Iterator zum ersten const‑qualifizierten Element der Sammlung. |
| [cend](./cend/)() const | Erhält einen Iterator für ein nicht existierendes const‑qualifiziertes Element hinter dem Ende der Sammlung. |
| [Clear](./clear/)() override | Löscht alle Elemente im Set. |
| [Contains](./contains/)(const T\&) const override | Prüft, ob ein Element im Set vorhanden ist. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Kopiert Hash-Inhalte in vorhandene Array-Elemente. |
| [data](./data/)() | Zugriff auf die zugrunde liegende Datenstruktur. |
| [data](./data/)() const | Zugriff auf die zugrunde liegende Datenstruktur. |
| [end](./end/)() const | Erhält einen Iterator für ein nicht existierendes Element hinter dem Ende der const‑qualifizierten Sammlung. |
| [get_Count](./get_count/)() const override | Ermittelt die Anzahl der Elemente im Set. |
| [GetEnumerator](./getenumerator/)() override | Erstellt Aufzählung. |
| [Remove](./remove/)(const T\&) override | Entfernt ein Element aus dem Set. |
| [TryAdd](./tryadd/)(const T\&) | Fügt ein Element zum Set hinzu. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Liefert die Implementierung des begin‑const‑Iterators für den aktuellen Container. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Liefert die Implementierung des begin‑Iterators für den aktuellen Container. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Liefert die Implementierung des end‑const‑Iterators für den aktuellen Container. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Liefert die Implementierung des end‑Iterators für den aktuellen Container. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [BaseType](./basetype/) | Implementierte Schnittstelle. |
| [const_iterator](./const_iterator/) | Typ des konstanten Iterators. |
| [IEnumerablePtr](./ienumerableptr/) | Zeiger auf das Enumerable-Interface. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) Zeiger. |
| [iterator](./iterator/) | Iteratortyp. |
| [set_t](./set_t/) | Zugrundeliegender Datentyp. |
| [ThisPtr](./thisptr/) | Zeigertyp. |
| [ThisType](./thistype/) | Selbsttyp. |
| [ValueType](./valuetype/) | Werttyp. |
## Siehe auch

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
