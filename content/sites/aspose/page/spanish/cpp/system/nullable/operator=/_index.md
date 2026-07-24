---
title: "System::Nullable::operator= método"
linktitle: "operator="
second_title: "Aspose.Page para C++"
description: "System::Nullable::operator= método. Reemplaza el valor actualmente representado del objeto con el especificado en C++."
type: docs
weight: 1800
url: /es/cpp/system/nullable/operator=/
---
## Nullable::operator=(const Nullable\<T1\>\&) method


Reemplaza el valor actualmente representado del objeto con el especificado.

```cpp
template<typename T1> Nullable<T> & System::Nullable<T>::operator=(const Nullable<T1> &x)
```


| Parámetro | Descripción |
| --- | --- |
| El | tipo del nuevo valor que será representado por el objeto actual |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x | const Nullable\<T1\>\& | El nuevo valor que será representado por el objeto actual |

### ReturnValue

Una referencia al propio objeto

## Ver también

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator=(const T1\&) method


Reemplaza el valor actualmente representado del objeto con el especificado.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value &&!std::is_null_pointer<T1>::value, Nullable<T> &>::type System::Nullable<T>::operator=(const T1 &x)
```


| Parámetro | Descripción |
| --- | --- |
| El | tipo del nuevo valor que será representado por el objeto actual |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x | const T1\& | El nuevo valor que será representado por el objeto actual |

### ReturnValue

Una referencia al propio objeto

## Ver también

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator=(std::nullptr_t) method


Asigna un nulo al objeto actual.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator=(std::nullptr_t)
```


### ReturnValue

Un objeto [Nullable](../) que representa un valor nulo.

## Ver también

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
