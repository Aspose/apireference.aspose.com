---
title: "System::Collections::IListImplValueType class"
linktitle: "IListImplValueType"
second_title: "Aspose.Page voor C++"
description: "System::Collections::IListImplValueType class. Stub die de System::Collections::IList-interface implementeert op een System::Collections::Generic::List-object - implementatie voor waarde-typen in C++."
type: docs
weight: 1200
url: /nl/cpp/system.collections/ilistimplvaluetype/
---
## IListImplValueType class


Stub die de [System::Collections::IList](../ilist/) interface implementeert op een [System::Collections::Generic::List](../../system.collections.generic/list/) object - implementatie voor waarde-typen.

```cpp
template<typename T>class IListImplValueType : public virtual System::Collections::IList
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | Voegt een element toe aan het einde van de lijst. |
| [Clear](./clear/)() override | Verwijdert alle elementen. |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | Controleert of het item aanwezig is in de lijst. |
| [get_Count](./get_count/)() const override | [ICollection.get_Count()](../icollection/get_count/) methodimplementatie Haalt het aantal elementen in de collectie op. |
| [GetEnumerator](./getenumerator/)() override | [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) implementatie Retourneert een enumerator die door een collectie iterereert. |
| [idx_get](./idx_get/)(int, int) const override | Haalt het element op op de opgegeven index. |
| [IListImplValueType](./ilistimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IList\<T\>\>) | Maakt een nieuwe object-instantie. |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | Haalt de index op van de eerste verschijning van het item in de container. |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | Voegt een element in op de opgegeven positie, waarbij andere elementen worden verschoven. |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | Verwijdert de eerste instantie van een specifiek item uit de lijst. |
| [RemoveAt](./removeat/)(int) override | Verwijdert item op de opgegeven positie. |
## Zie ook

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
