---
title: "System::SafeInvoke method"
linktitle: "SafeInvoke"
second_title: "Aspose.Page pour C++"
description: "System::SafeInvoke method. Implémentation de la traduction de l'opérateur ''?.'' en C++."
type: docs
weight: 36900
url: /fr/cpp/system/safeinvoke/
---
## System::SafeInvoke method


Implémentation de la traduction de l'opérateur '?.'.

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 expr, T1 func)
```


| Paramètre | Description |
| --- | --- |
| T0 | type d'expression. |
| T1 | Type de lambda encapsulant l'expression 'WhenTrue'. |

| Paramètre | Type | Description |
| --- | --- | --- |
| expr | T0 | valeur de l'expression. |
| func | T1 | Expression 'WhenTrue' liée au foncteur. |

### ReturnValue

Si la valeur de expr n'est pas nulle, renvoie func appelé avec sa valeur comme premier argument, sinon renvoie null.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
