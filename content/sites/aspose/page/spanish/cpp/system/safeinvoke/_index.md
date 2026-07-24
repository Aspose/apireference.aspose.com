---
title: "System::SafeInvoke método"
linktitle: "SafeInvoke"
second_title: "Aspose.Page para C++"
description: "System::SafeInvoke método. Implementación de la traducción del operador ''?.'' en C++."
type: docs
weight: 36900
url: /es/cpp/system/safeinvoke/
---
## System::SafeInvoke method


Implementación de la traducción del operador '?.'.

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 expr, T1 func)
```


| Parámetro | Descripción |
| --- | --- |
| T0 | tipo de expresión. |
| T1 | Tipo de lambda que encapsula la expresión 'WhenTrue'. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| expr | T0 | valor de la expresión. |
| func | T1 | Expresión 'WhenTrue' vinculada al functor. |

### ReturnValue

Si el valor de expr no es nulo, devuelve func llamado con su valor como primer argumento; de lo contrario, devuelve nulo.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
