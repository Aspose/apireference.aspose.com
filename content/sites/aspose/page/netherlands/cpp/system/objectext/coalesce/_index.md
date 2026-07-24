---
title: "System::ObjectExt::Coalesce methode"
linktitle: "Coalesce"
second_title: "Aspose.Page voor C++"
description: "System::ObjectExt::Coalesce methode. Implementatie van de ''??''-operatorvertaling voor nullable-typen in C++."
type: docs
weight: 500
url: /nl/cpp/system/objectext/coalesce/
---
## ObjectExt::Coalesce(System::Nullable\<T0\>, T1) method


Implementatie van '??'-operatorvertaling voor nullable typen.

```cpp
template<typename T0,typename T1> static T0 System::ObjectExt::Coalesce(System::Nullable<T0> value, T1 func)
```


| Parameter | Beschrijving |
| --- | --- |
| T0 | LHS-waardetype. |
| T1 | Type van lambda die de RHS-expressie encapsuleert. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | System::Nullable\<T0\> | LHS-waarde. |
| func | T1 | RHS-expressie. |

### ReturnValue

Als de LHS-waarde niet null is, retourneert het LHS, anders wordt de RHS-expressie berekend en wordt het resultaat geretourneerd.

## Zie ook

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Coalesce(T0, T1) method


Implementatie van '??'-operatorvertaling voor niet‑nullable typen.

```cpp
template<typename T0,typename T1> static auto System::ObjectExt::Coalesce(T0 value, T1 func)
```


| Parameter | Beschrijving |
| --- | --- |
| T0 | LHS-waardetype. |
| T1 | Type van lambda die de RHS-expressie encapsuleert. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | T0 | LHS-waarde. |
| func | T1 | RHS-expressie. |

### ReturnValue

Als de LHS-waarde niet null is, retourneert het LHS, anders wordt de RHS-expressie berekend en wordt het resultaat geretourneerd.

## Zie ook

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
