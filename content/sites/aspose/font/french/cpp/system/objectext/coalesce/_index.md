---
title: "Méthode System::ObjectExt::Coalesce"
linktitle: "Coalesce"
second_title: "Aspose.Font pour C++"
description: "Méthode System::ObjectExt::Coalesce. Implémentation de la traduction de l'opérateur ''??'' pour les types nullable en C++."
type: docs
weight: 500
url: /fr/cpp/system/objectext/coalesce/
---
## ObjectExt::Coalesce(System::Nullable\<T0\>, T1) method


Implémentation de la traduction de l'opérateur '??' pour les types nullable.

```cpp
template<typename T0,typename T1> static T0 System::ObjectExt::Coalesce(System::Nullable<T0> value, T1 func)
```


| Paramètre | Description |
| --- | --- |
| T0 | Type de valeur LHS. |
| T1 | Type du lambda encapsulant l'expression RHS. |

| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | System::Nullable\<T0\> | Valeur LHS. |
| func | T1 | Expression RHS. |

### ReturnValue

Si la valeur LHS n'est pas null, renvoie LHS, sinon calcule l'expression RHS et renvoie le résultat.

## Voir aussi

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Coalesce(T0, T1) method


Implémentation de la traduction de l'opérateur '??' pour les types non nullable.

```cpp
template<typename T0,typename T1> static auto System::ObjectExt::Coalesce(T0 value, T1 func)
```


| Paramètre | Description |
| --- | --- |
| T0 | Type de valeur LHS. |
| T1 | Type du lambda encapsulant l'expression RHS. |

| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | T0 | Valeur LHS. |
| func | T1 | Expression RHS. |

### ReturnValue

Si la valeur LHS n'est pas null, renvoie LHS, sinon calcule l'expression RHS et renvoie le résultat.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
