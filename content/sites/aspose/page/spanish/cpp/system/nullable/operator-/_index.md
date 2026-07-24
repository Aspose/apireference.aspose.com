---
title: "System::Nullable::operator- método"
linktitle: "operator-"
second_title: "Aspose.Page para C++"
description: "System::Nullable::operator- método. Resta valores anulables en C++."
type: docs
weight: 1400
url: /es/cpp/system/nullable/operator-/
---
## Nullable::operator-(const Nullable\<T1\>\&) const method


Resta valores nullable.

```cpp
template<typename T1> System::Nullable<decltype(get_Value() - other.get_Value())> System::Nullable<T>::operator-(const Nullable<T1> &other) const
```


| Parámetro | Descripción |
| --- | --- |
| T1 | Tipo de operando derecho. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| otro | const Nullable\<T1\>\& | valor a restar. |

### ReturnValue

Resultado de la resta.

## Ver también

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-(const T1\&) const method


Resta valores nullable y no nullable.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value() - other)> System::Nullable<T>::operator-(const T1 &other) const
```


| Parámetro | Descripción |
| --- | --- |
| T1 | Tipo de operando derecho. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| otro | const T1\& | valor a restar. |

### ReturnValue

Resultado de la resta.

## Ver también

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-(T1) const method


Resta valores nullable y valores apuntados a nulo.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-(T1) const
```


| Parámetro | Descripción |
| --- | --- |
| T1 | Tipo del operando derecho, debe ser nullptr_t. |

### ReturnValue

Objeto [Nullable](../) vacío.

## Ver también

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
