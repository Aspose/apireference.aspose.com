---
title: "System::DynamicWeakPtr-Klasse"
linktitle: "DynamicWeakPtr"
second_title: "Aspose.Font für C++"
description: "System::DynamicWeakPtr-Klasse. Smart-Pointer-Klasse, die die Zeigermodi der Template-Argumente des gespeicherten Objekts verfolgt und nach jeder Zuweisung aktualisiert. Dieser Typ ist ein Zeiger, um die Löschung anderer Objekte zu verwalten. Er sollte auf dem Stack alloziert und an Funktionen entweder per Wert oder per const-Referenz übergeben werden in C++."
type: docs
weight: 2200
url: /de/cpp/system/dynamicweakptr/
---
## DynamicWeakPtr class


Smart‑Pointer‑Klasse, die die Zeigermodi von Template‑Argumenten des gespeicherten Objekts verfolgt und nach jeder Zuweisung aktualisiert. Dieser Typ ist ein Zeiger zur Verwaltung der Löschung anderer Objekte. Er sollte auf dem Stack alloziert und per Wert oder als const‑Referenz an Funktionen übergeben werden.

```cpp
template<typename T,SmartPtrMode,unsigned int ...>class DynamicWeakPtr : public System::SmartPtr<T>
```


| Parameter | Beschreibung |
| --- | --- |
| Pointee | Typ. |
| trunkMode | Modus des Smart-Pointers selbst, shared oder weak. |
| weakLeafs | Indizes der Template-Argumente des gespeicherten Typs, die auf den Weak-Pointer-Modus gesetzt werden sollen. |
## Nested classes

* Class [Reference](./reference/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [DynamicWeakPtr](./dynamicweakptr/)(std::nullptr_t) | Erstellt einen Null-Smart-Pointer. |
| [DynamicWeakPtr](./dynamicweakptr/)(Pointee_ *) | Erstellt einen Smart-Pointer, der auf das gegebene Objekt zeigt. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr_\&) | Kopiert Smart-Pointer. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr\<Q\>\&) | Kopiert Smart-Pointer. |
| [DynamicWeakPtr](./dynamicweakptr/)(const DynamicWeakPtr_\&) | Kopiert Smart-Pointer. |
| [DynamicWeakPtr](./dynamicweakptr/)(SmartPtr_\&&) | Move-konstruiert Smart-Pointer. |
| [operator=](./operator=/)(SmartPtr_\&&) | Move-zuweist Smart-Pointer. |
| [operator=](./operator=/)(const SmartPtr_\&) | Copy-zuweist Smart-Pointer. |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | Copy-zuweist Smart-Pointer. |
| [operator=](./operator=/)(typename SmartPtr_::Pointee_ *) | Weist Smart-Pointer zu. |
| [operator=](./operator=/)(std::nullptr_t) | Setzt Smart-Pointer auf Null. |
| [operator==](./operator==/)(std::nullptr_t) const | Überprüft, ob der Smart-Pointer null ist. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [DynamicWeakPtr_](./dynamicweakptr_/) | Alias für den eigenen Typ. |
| [Pointee_](./pointee_/) | Typ, auf den gezeigt wird. |
| [SmartPtr_](./smartptr_/) | [SmartPtr](../smartptr/) Basisklassen-Alias. |

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
