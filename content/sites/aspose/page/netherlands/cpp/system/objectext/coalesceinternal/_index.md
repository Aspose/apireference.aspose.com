---
title: "System::ObjectExt::CoalesceInternal methode"
linktitle: "CoalesceInternal"
second_title: "Aspose.Page voor C++"
description: "System::ObjectExt::CoalesceInternal methode. Implementatie van de ''??''-operatorvertaling voor niet-nullable-typen. Overbelasting voor het geval dat RT2 converteerbaar is naar RT1 in C++."
type: docs
weight: 600
url: /nl/cpp/system/objectext/coalesceinternal/
---
## ObjectExt::CoalesceInternal method


Implementatie van '??'-operatorvertaling voor niet‑nullable typen. Overload voor het geval dat RT2 converteerbaar is naar RT1.

```cpp
template<typename RT1,typename RT2,typename F> static std::conditional<std::is_convertible<RT2, RT1>::value, RT1, RT2>::type System::ObjectExt::CoalesceInternal(RT1 value, F func)
```


| Parameter | Beschrijving |
| --- | --- |
| T0 | LHS-waardetype. |
| T1 | Type van lambda die de RHS-expressie encapsuleert. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | RT1 | LHS-waarde. |
| func | F | RHS-expressie. |

### ReturnValue

Als de LHS-waarde niet null is, retourneert het LHS, anders wordt de RHS-expressie berekend en wordt het resultaat geretourneerd.

## Zie ook

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
