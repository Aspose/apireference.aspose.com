---
title: "System::Collections::IListImplRefType Klasse"
linktitle: "IListImplRefType"
second_title: "Aspose.Page für C++"
description: "System::Collections::IListImplRefType Klasse. Stub, der das System::Collections::IList-Interface auf einem System::Collections::Generic::List-Objekt implementiert. Implementierung für Referenztypen in C++."
type: docs
weight: 1100
url: /de/cpp/system.collections/ilistimplreftype/
---
## IListImplRefType class


Stub, der das [System::Collections::IList](../ilist/)-Interface auf einem [System::Collections::Generic::List](../../system.collections.generic/list/)-Objekt implementiert. Implementierung für Referenztypen.

```cpp
template<typename T>class IListImplRefType : public virtual System::Collections::IList
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | Fügt ein Element am Ende der Liste hinzu. |
| static [BoxValue](./boxvalue/)(System::SharedPtr\<T\>) | Konvertieren einer Typreferenz in einen Objektwert in ein Objekt. |
| [Clear](./clear/)() override | Löscht alle Elemente. |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | Überprüft, ob ein Element in der Liste vorhanden ist. |
| [get_Count](./get_count/)() const override | [ICollection.get_Count()](../icollection/get_count/) Methodenimplementierung Gibt die Anzahl der Elemente in der Sammlung zurück. |
| [GetEnumerator](./getenumerator/)() override | [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) Implementierung Gibt einen Enumerator zurück, der durch eine Sammlung iteriert. |
| [idx_get](./idx_get/)(int, int) const override | Gibt das Element am angegebenen Index zurück. |
| [IListImplRefType](./ilistimplreftype/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<T\>\>\>) | Erstellt eine neue Objektinstanz. |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | Gibt den Index des ersten Auftretens eines Elements im Container zurück. |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | Fügt ein Element an der angegebenen Position ein und verschiebt die anderen Elemente. |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | Entfernt die erste Instanz eines bestimmten Elements aus der Liste. |
| [RemoveAt](./removeat/)(int) override | Entfernt das Element an der angegebenen Position. |
| static [UnboxValue](./unboxvalue/)(System::SharedPtr\<System::Object\>) | Konvertieren eines Objektwerts in eine bestimmte Typreferenz. |
## Siehe auch

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
