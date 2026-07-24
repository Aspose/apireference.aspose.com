---
title: "System::DynamicWeakPtr-klass"
linktitle: "DynamicWeakPtr"
second_title: "Aspose.Page för C++"
description: "System::DynamicWeakPtr-klass. Smartpekarklass som spårar pekarlägen för mallargumenten i det lagrade objektet och uppdaterar dem efter varje tilldelning. Denna typ är en pekare för att hantera raderingen av andra objekt. Den bör allokeras på stacken och skickas till funktioner antingen som värde eller som konstant referens i C++."
type: docs
weight: 2200
url: /sv/cpp/system/dynamicweakptr/
---
## DynamicWeakPtr class


Smartpekarklass som spårar pekarlägen för mallargumenten hos det lagrade objektet och uppdaterar dem efter varje tilldelning. Denna typ är en pekare för att hantera raderingen av andra objekt. Den bör allokeras på stacken och passeras till funktioner antingen som värde eller som konstant referens.

```cpp
template<typename T,SmartPtrMode,unsigned int ...>class DynamicWeakPtr : public System::SmartPtr<T>
```


| Parameter | Beskrivning |
| --- | --- |
| Pointee | typ. |
| trunkMode | Läge för smartpekaren själv, delad eller svag. |
| weakLeafs | Index för mallargumenten av den lagrade typen som bör sättas till svagt pekarläge. |
## Nested classes

* Class [Reference](./reference/)
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [DynamicWeakPtr](./dynamicweakptr/)(std::nullptr_t) | Skapar null smartpekare. |
| [DynamicWeakPtr](./dynamicweakptr/)(Pointee_ *) | Skapar smartpekare som pekar på givet objekt. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr_\&) | Kopierar konstruktion av smartpekare. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr\<Q\>\&) | Kopierar konstruktion av smartpekare. |
| [DynamicWeakPtr](./dynamicweakptr/)(const DynamicWeakPtr_\&) | Kopierar konstruktion av smartpekare. |
| [DynamicWeakPtr](./dynamicweakptr/)(SmartPtr_\&&) | Flyttar konstruktion av smartpekare. |
| [operator=](./operator=/)(SmartPtr_\&&) | Flyttar tilldelning av smartpekare. |
| [operator=](./operator=/)(const SmartPtr_\&) | Kopierar tilldelning av smartpekare. |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | Kopierar tilldelning av smartpekare. |
| [operator=](./operator=/)(typename SmartPtr_::Pointee_ *) | Tilldelar smartpekare. |
| [operator=](./operator=/)(std::nullptr_t) | Sätter smartpekare till null. |
| [operator==](./operator==/)(std::nullptr_t) const | Kontrollerar om smart pekare är null. |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [DynamicWeakPtr_](./dynamicweakptr_/) | Självtyp-alias. |
| [Pointee_](./pointee_/) | Pekad typ. |
| [SmartPtr_](./smartptr_/) | [SmartPtr](../smartptr/) basisklass alias. |

## Se även

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
