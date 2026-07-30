---
title: "System::Collections::IListImplRefType Klasse"
linktitle: "IListImplRefType"
second_title: "Aspose.Font für C++"
description: "System::Collections::IListImplRefType Klasse. Stub, das das System::Collections::IList-Interface auf einem System::Collections::Generic::List-Objekt implementiert. Implementierung für Referenztypen in C++."
type: docs
weight: 1100
url: /de/cpp/system.collections/ilistimplreftype/
---
## IListImplRefType class


Stub, das das [System::Collections::IList](../ilist/) Interface auf einem [System::Collections::Generic::List](../../system.collections.generic/list/) Objekt implementiert. Implementierung für Referenztypen.

```cpp
template<typename T>class IListImplRefType : public virtual System::Collections::IList
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | Fügt ein Element am Ende der Liste hinzu. |
| static [BoxValue](./boxvalue/)(System::SharedPtr\<T\>) | Konvertieren einer Typreferenz in einen Objektwert. |
| [Clear](./clear/)() override | Löscht alle Elemente. |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | Überprüft, ob das Element in der Liste vorhanden ist. |
| [get_Count](./get_count/)() const override | [ICollection.get_Count()](../icollection/get_count/) Methodenimplementierung Gibt die Anzahl der Elemente in der Sammlung zurück. |
| [GetEnumerator](./getenumerator/)() override | [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) Implementierung Gibt einen Enumerator zurück, der durch eine Sammlung iteriert. |
| [idx_get](./idx_get/)(int, int) const override | Gibt das Element am angegebenen Index zurück. |
| [IListImplRefType](./ilistimplreftype/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<T\>\>\>) | Erstellt eine neue Objektinstanz. |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | Gibt den Index des ersten Auftretens des Elements im Container zurück. |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | Fügt das Element an der angegebenen Position ein und verschiebt andere Elemente. |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | Entfernt die erste Instanz des angegebenen Elements aus der Liste. |
| [RemoveAt](./removeat/)(int) override | Entfernt das Element an der angegebenen Position. |
| static [UnboxValue](./unboxvalue/)(System::SharedPtr\<System::Object\>) | Konvertieren eines Objektwertes in eine bestimmte Typreferenz. |
## Siehe auch

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
