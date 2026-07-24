---
title: "System::Is-methode"
linktitle: "Is"
second_title: "Aspose.Page voor C++"
description: "System::Is-methode. Top-level overeenkomende functie. Past een patroon toe op een waarde in C++."
type: docs
weight: 21900
url: /nl/cpp/system/is/
---
## System::Is(const E\&, const A\&) method


Top-level overeenkomende functie. Past een patroon toe op een waarde.

```cpp
template<typename A,typename E> std::enable_if_t<std::is_base_of<Details::Pattern, A>::value, bool> System::Is(const E &e, const A &a)
```


| Parameter | Beschrijving |
| --- | --- |
| A | Patroontype (moet erven van Details::Pattern). |
| E | Type van de waarde om te vergelijken. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| e | const E\& | Waarde om tegen te vergelijken. |
| een | const A\& | Patroon om toe te passen. |

### ReturnValue

true als het patroon overeenkomt met de waarde.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, const ConstantT\&) method


Implementeert 'is' constante patroonvertaling.

```cpp
template<class ExpressionT,class ConstantT> std::enable_if_t<!std::is_base_of<Details::Pattern, ConstantT>::value, bool> System::Is(const ExpressionT &left, const ConstantT &constant)
```


| Parameter | Beschrijving |
| --- | --- |
| ExpressionT | type van de linker expressie. |
| ConstantT | type van constante expressie. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| links | const ExpressionT\& | expressie die gecontroleerd zal worden. |
| constante | const ConstantT\& | expressie die vergeleken zal worden met de linker. |

### ReturnValue

true als typecontrole succesvol is, false anders.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, ResultT\&) method


Implementeert 'is' declaratiepatroonvertaling.

```cpp
template<class PatternT,class ExpressionT,class ResultT> bool System::Is(const ExpressionT &left, ResultT &result)
```


| Parameter | Beschrijving |
| --- | --- |
| PatternT | type om te controleren. |
| ExpressionT | type van de linker expressie. |
| ResultT | type van resultaatexpressie. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| links | const ExpressionT\& | expressie die gecontroleerd zal worden. |
| result | ResultT\& | variabele die toegewezen wordt aan het gecontroleerde type. |

### ReturnValue

true als typecontrole succesvol is, false anders.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
