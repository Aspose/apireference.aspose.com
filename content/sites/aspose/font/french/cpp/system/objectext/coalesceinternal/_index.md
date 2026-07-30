---
title: "Méthode System::ObjectExt::CoalesceInternal"
linktitle: "CoalesceInternal"
second_title: "Aspose.Font pour C++"
description: "Méthode System::ObjectExt::CoalesceInternal. Implémentation de la traduction de l'opérateur ''??'' pour les types non nullable. Surcharge pour le cas où RT2 est convertible en RT1 en C++."
type: docs
weight: 700
url: /fr/cpp/system/objectext/coalesceinternal/
---
## ObjectExt::CoalesceInternal method


Implémentation de la traduction de l'opérateur '??' pour les types non nullables. Surcharge pour le cas où RT2 est convertible en RT1.

```cpp
template<typename RT1,typename RT2,typename F> static std::conditional<std::is_convertible<RT2, RT1>::value, RT1, RT2>::type System::ObjectExt::CoalesceInternal(RT1 value, F func)
```


| Paramètre | Description |
| --- | --- |
| T0 | Type de valeur LHS. |
| T1 | Type du lambda encapsulant l'expression RHS. |

| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | RT1 | Valeur LHS. |
| func | F | Expression RHS. |

### ReturnValue

Si la valeur LHS n'est pas null, renvoie LHS, sinon calcule l'expression RHS et renvoie le résultat.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
