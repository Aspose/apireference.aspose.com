---
title: "System::WeakPtr klasse"
linktitle: "WeakPtr"
second_title: "Aspose.Page voor C++"
description: "System::WeakPtr class. Subclass van System::SmartPtr die zichzelf bij constructie in zwakke modus zet. Houd er rekening mee dat deze klasse niet garandeert dat zijn instantie altijd in zwakke modus blijft, aangezien set_Mode() nog steeds toegankelijk is. Dit type is een pointer om de verwijdering van een ander object te beheren. Het moet op de stack worden gealloceerd en aan functies worden doorgegeven, hetzij per waarde, hetzij per const-referentie in C++."
type: docs
weight: 7500
url: /nl/cpp/system/weakptr/
---
## WeakPtr class


Subclass van [System::SmartPtr](../smartptr/) die zichzelf bij constructie in zwakke modus zet. Houd er rekening mee dat deze klasse niet garandeert dat zijn instantie altijd in zwakke modus blijft, aangezien [set_Mode()](../smartptr/set_mode/) nog steeds toegankelijk is. Dit type is een pointer om de verwijdering van een ander object te beheren. Het moet op de stack worden gealloceerd en aan functies worden doorgegeven, hetzij per waarde, hetzij per const-referentie.

```cpp
template<class T>class WeakPtr : public System::SmartPtr<T>
```


| Parameter | Beschrijving |
| --- | --- |
| T | Pointee-type. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [expired](./expired/)() const | Controleert of het verwezen object al is verwijderd. |
| [get_weak](./get_weak/)() const | Haalt het verwezen object op. Bevestigt dat de pointer zich in zwakke modus bevindt. |
| [operator=](./operator=/)(Q\&&) | Wijs een waarde toe aan de zwakke pointer. Roept de specifieke toewijzingsoperator van [SmartPtr_](./smartptr_/). aan. |
| [operator==](./operator==/)(std::nullptr_t) const | Controleert of de zwakke pointer null is. |
| [WeakPtr](./weakptr/)(std::nullptr_t) | Maakt een null-pointer. |
| [WeakPtr](./weakptr/)(Pointee_ *) | Maakt een zwakke pointer naar het opgegeven object. |
| [WeakPtr](./weakptr/)(const SmartPtr_\&) | Maakt een zwakke pointer die naar dezelfde pointer verwijst als ptr. |
| [WeakPtr](./weakptr/)(const SmartPtr\<Q\>\&) | Maakt een zwakke pointer die naar dezelfde pointer verwijst als x. |
| [WeakPtr](./weakptr/)(const WeakPtr_\&) | Copy-constructeert een zwakke pointer. |
| [WeakPtr](./weakptr/)(const WeakPtr\<Q\>\&) | Copy-constructeert een zwakke pointer. |
| [WeakPtr](./weakptr/)(SmartPtr_\&&) | Move-constructeert een zwakke pointer. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Pointee_](./pointee_/) | Gewezen type. |
| [SmartPtr_](./smartptr_/) | Alias voor de overeenkomstige [SmartPtr](../smartptr/) klasse. |
| [WeakPtr_](./weakptr_/) | Alias voor het eigen type. |

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
