---
title: "Méthode System::ObjectExt::CoalesceAssign"
linktitle: "CoalesceAssign"
second_title: "Aspose.Font pour C++"
description: "Méthode System::ObjectExt::CoalesceAssign. Implémentation de la traduction de l'opérateur ''??='' en C++."
type: docs
weight: 600
url: /fr/cpp/system/objectext/coalesceassign/
---
## ObjectExt::CoalesceAssign method


Implémentation de la traduction de l'opérateur '??='.

```cpp
template<typename T0,typename T1> static T0 & System::ObjectExt::CoalesceAssign(T0 &value, T1 func)
```


| Paramètre | Description |
| --- | --- |
| T0 | Type de valeur LHS. |
| T1 | Type du lambda encapsulant l'expression RHS. |

| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | T0\& | Valeur LHS. |
| func | T1 | Expression RHS. |

### ReturnValue

Si la valeur LHS n'est pas null, renvoie LHS, sinon calcule l'expression RHS et renvoie le résultat.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
