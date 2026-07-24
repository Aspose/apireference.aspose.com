---
title: "Método System::ObjectExt::Coalesce"
linktitle: "Coalesce"
second_title: "Aspose.Page para C++"
description: "Método System::ObjectExt::Coalesce. Implementación de la traducción del operador ''??'' para tipos nullable en C++."
type: docs
weight: 500
url: /es/cpp/system/objectext/coalesce/
---
## ObjectExt::Coalesce(System::Nullable\<T0\>, T1) method


Implementación de la traducción del operador '??' para tipos anulables.

```cpp
template<typename T0,typename T1> static T0 System::ObjectExt::Coalesce(System::Nullable<T0> value, T1 func)
```


| Parámetro | Descripción |
| --- | --- |
| T0 | Tipo de valor LHS. |
| T1 | Tipo de lambda que encapsula la expresión RHS. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | System::Nullable\<T0\> | Valor LHS. |
| func | T1 | Expresión RHS. |

### ReturnValue

Si el valor LHS no es nulo, devuelve LHS; de lo contrario calcula la expresión RHS y devuelve el resultado.

## Ver también

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Coalesce(T0, T1) method


Implementación de la traducción del operador '??' para tipos no anulables.

```cpp
template<typename T0,typename T1> static auto System::ObjectExt::Coalesce(T0 value, T1 func)
```


| Parámetro | Descripción |
| --- | --- |
| T0 | Tipo de valor LHS. |
| T1 | Tipo de lambda que encapsula la expresión RHS. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | T0 | Valor LHS. |
| func | T1 | Expresión RHS. |

### ReturnValue

Si el valor LHS no es nulo, devuelve LHS; de lo contrario calcula la expresión RHS y devuelve el resultado.

## Ver también

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
