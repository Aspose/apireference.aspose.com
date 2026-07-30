---
title: "Méthode System::SafeInvoke"
linktitle: "SafeInvoke"
second_title: "Aspose.Font pour C++"
description: "Méthode System::SafeInvoke. Implémentation de la traduction de l’opérateur ''?.'' en C++."
type: docs
weight: 37000
url: /fr/cpp/system/safeinvoke/
---
## System::SafeInvoke method


Implémentation de la traduction de l’opérateur '?.'.

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 &&expr, T1 &&func)
```


| Paramètre | Description |
| --- | --- |
| T0 | type d’expression. |
| T1 | Type de lambda encapsulant l’expression 'WhenTrue'. |

| Paramètre | Type | Description |
| --- | --- | --- |
| expr | T0\&& | valeur d’expression. |
| func | T1\&& | Expression 'WhenTrue' liée au foncteur. |

### ReturnValue

Si la valeur de expr n’est pas nulle, renvoie func appelé avec cette valeur comme premier argument, sinon renvoie null.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
