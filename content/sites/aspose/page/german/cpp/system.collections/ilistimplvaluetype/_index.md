---
title: "System::Collections::IListImplValueType Klasse"
linktitle: "IListImplValueType"
second_title: "Aspose.Page für C++"
description: "System::Collections::IListImplValueType Klasse. Stub, das das System::Collections::IList Interface auf einem System::Collections::Generic::List-Objekt implementiert. Implementierung für Werttypen in C++."
type: docs
weight: 1200
url: /de/cpp/system.collections/ilistimplvaluetype/
---
## IListImplValueType class


Stub, das das [System::Collections::IList](../ilist/) Interface auf einem [System::Collections::Generic::List](../../system.collections.generic/list/) Objekt implementiert. Implementierung für Werttypen.

```cpp
template<typename T>class IListImplValueType : public virtual System::Collections::IList
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | Fügt ein Element am Ende der Liste hinzu. |
| [Clear](./clear/)() override | Löscht alle Elemente. |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | Überprüft, ob ein Element in der Liste vorhanden ist. |
| [get_Count](./get_count/)() const override | [ICollection.get_Count()](../icollection/get_count/) Methodenimplementierung Gibt die Anzahl der Elemente in der Sammlung zurück. |
| [GetEnumerator](./getenumerator/)() override | [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) Implementierung Gibt einen Enumerator zurück, der durch eine Sammlung iteriert. |
| [idx_get](./idx_get/)(int, int) const override | Gibt das Element am angegebenen Index zurück. |
| [IListImplValueType](./ilistimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IList\<T\>\>) | Erstellt eine neue Objektinstanz. |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | Gibt den Index des ersten Auftretens eines Elements im Container zurück. |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | Fügt ein Element an der angegebenen Position ein und verschiebt die anderen Elemente. |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | Entfernt die erste Instanz eines bestimmten Elements aus der Liste. |
| [RemoveAt](./removeat/)(int) override | Entfernt das Element an der angegebenen Position. |
## Siehe auch

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
