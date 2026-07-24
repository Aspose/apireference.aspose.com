---
title: "System::DynamicWeakPtr klasse"
linktitle: "DynamicWeakPtr"
second_title: "Aspose.Page voor C++"
description: "System::DynamicWeakPtr klasse. Smart-pointerklasse die de pointermodi van de sjabloonargumenten van het opgeslagen object bijhoudt en deze na elke toewijzing bijwerkt. Dit type is een pointer om de verwijdering van een ander object te beheren. Het moet op de stack worden gealloceerd en aan functies worden doorgegeven, hetzij per waarde, hetzij per const-referentie in C++."
type: docs
weight: 2200
url: /nl/cpp/system/dynamicweakptr/
---
## DynamicWeakPtr class


Smart‑pointer‑klasse die de pointer‑modi van sjabloon‑argumenten van het opgeslagen object bijhoudt en deze na elke toewijzing bijwerkt. Dit type is een pointer om de verwijdering van andere objecten te beheren. Het moet op de stack worden gealloceerd en aan functies worden doorgegeven, hetzij per waarde, hetzij per const‑referentie.

```cpp
template<typename T,SmartPtrMode,unsigned int ...>class DynamicWeakPtr : public System::SmartPtr<T>
```


| Parameter | Beschrijving |
| --- | --- |
| Pointee | type. |
| trunkMode | Modus van de smart pointer zelf, gedeeld of zwak. |
| weakLeafs | Indexen van sjabloonargumenten van het opgeslagen type die op zwakke pointer-modus moeten worden ingesteld. |
## Nested classes

* Class [Reference](./reference/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [DynamicWeakPtr](./dynamicweakptr/)(std::nullptr_t) | Maakt een null smart pointer. |
| [DynamicWeakPtr](./dynamicweakptr/)(Pointee_ *) | Maakt een smart pointer die naar het opgegeven object wijst. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr_\&) | Copy-constructeert smart pointer. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr\<Q\>\&) | Copy-constructeert smart pointer. |
| [DynamicWeakPtr](./dynamicweakptr/)(const DynamicWeakPtr_\&) | Copy-constructeert smart pointer. |
| [DynamicWeakPtr](./dynamicweakptr/)(SmartPtr_\&&) | Move-constructeert smart pointer. |
| [operator=](./operator=/)(SmartPtr_\&&) | Voert een move-toewijzing uit op een slimme pointer. |
| [operator=](./operator=/)(const SmartPtr_\&) | Voert een copy-toewijzing uit op een slimme pointer. |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | Voert een copy-toewijzing uit op een slimme pointer. |
| [operator=](./operator=/)(typename SmartPtr_::Pointee_ *) | Wijs slimme pointer toe. |
| [operator=](./operator=/)(std::nullptr_t) | Stelt slimme pointer in op null. |
| [operator==](./operator==/)(std::nullptr_t) const | Controleert of smart pointer null is. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [DynamicWeakPtr_](./dynamicweakptr_/) | Zelftype alias. |
| [Pointee_](./pointee_/) | Gewezen type. |
| [SmartPtr_](./smartptr_/) | [SmartPtr](../smartptr/) basisklasse alias. |

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
