---
title: "System::WeakReference< T > class"
linktitle: "WeakReference< T >"
second_title: "Aspose.Page voor C++"
description: "System::WeakReference< T > class. Vertegenwoordigt een zwakke referentie, die een object verwijst terwijl dat object nog steeds kan worden verwijderd in C++."
type: docs
weight: 7700
url: /nl/cpp/system/weakreference_t_/
---
## WeakReference< T > class


Stelt een zwakke referentie voor, die een object referereert terwijl dat object nog steeds kan worden verwijderd.

```cpp
template<typename T>class WeakReference< T > : public System::Object
```


| Parameter | Beschrijving |
| --- | --- |
| T | Type van een verwezen object. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [operator!=](./operator!=/)(std::nullptr_t) const | Controleert of het verwezen object niet null is. |
| [operator!=](./operator!=/)(const WeakReference\<T\>\&) const | Vergelijkt het verwezen object met een andere instantie van de [WeakReference](../weakreference/) klasse. |
| [operator==](./operator==/)(std::nullptr_t) const | Controleert of het verwezen object null is. |
| [operator==](./operator==/)(const WeakReference\<T\>\&) const | Vergelijkt het verwezen object met een andere instantie van de [WeakReference](../weakreference/) klasse. |
| [reset](./reset/)() |  |
| [SetTarget](./settarget/)(const SmartPtr\<T\>\&) | Stelt het object (het doel) in waarnaar wordt verwezen door het huidige [WeakReference](../weakreference/) object. |
| [TryGetTarget](./trygettarget/)(const SmartPtr\<T\>\&) const | Haalt het object (het doel) op waarnaar wordt verwezen door het huidige [WeakReference](../weakreference/) object. |
| [WeakReference](./weakreference/)() | Standaardconstructor. |
| [WeakReference](./weakreference/)(std::nullptr_t) | Constructor van nullptr. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&) | Initialiseert een nieuw exemplaar van de [WeakReference](../weakreference/) klasse, die verwijst naar het opgegeven object. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&, bool) | Initialiseert een nieuw exemplaar van de [WeakReference](../weakreference/) klasse, die verwijst naar het opgegeven object. |

## Zie ook

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
