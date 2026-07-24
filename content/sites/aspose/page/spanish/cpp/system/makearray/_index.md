---
title: "Método System::MakeArray"
linktitle: "CrearArreglo"
second_title: "Aspose.Page para C++"
description: "Método System::MakeArray. Una función de fábrica que construye un nuevo objeto Array pasando los argumentos especificados a su constructor en C++."
type: docs
weight: 24000
url: /es/cpp/system/makearray/
---
## System::MakeArray(Args\&&...) method


Una función de fábrica que construye un nuevo objeto [Array](../array/) pasando los argumentos especificados a su constructor.

```cpp
template<class T,class...> ArrayPtr<T> System::MakeArray(Args &&... args)
```


| Parámetro | Descripción |
| --- | --- |
| T | El tipo de elementos del objeto [Array](../array/) que la función construye |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| args | Args\&&... | Los argumentos que se pasan al constructor del objeto [Array](../array/) que se está construyendo |

### ReturnValue

Un puntero inteligente que apunta al objeto [Array](../array/) construido

## Ver también

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(Integral, Args\&&...) method


Una función de fábrica que construye un nuevo objeto [Array](../array/) pasando los argumentos especificados a su constructor.

```cpp
template<class T,class Integral,class...> std::enable_if<std::is_integral<Integral>::value, ArrayPtr<T>>::type System::MakeArray(Integral size, Args &&... args)
```


| Parámetro | Descripción |
| --- | --- |
| T | El tipo de elementos del objeto [Array](../array/) que la función construye |
| Integral | Tipo de tamaño del array. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| size | Integral | Tamaño del array que se está creando. |
| args | Args\&&... | Los argumentos que se pasan al constructor del objeto [Array](../array/) que se está construyendo |

### ReturnValue

Un puntero inteligente que apunta al objeto [Array](../array/) construido

## Ver también

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(std::initializer_list\<T\>) method


Una función de fábrica que construye un nuevo objeto [Array](../array/), lo llena con los elementos de la lista de inicialización especificada y devuelve un puntero inteligente que apunta al objeto [Array](../array/).

```cpp
template<typename T> ArrayPtr<T> System::MakeArray(std::initializer_list<T> init)
```


| Parámetro | Descripción |
| --- | --- |
| T | El tipo de elementos del objeto [Array](../array/) que la función construye |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| init | std::initializer_list\<T\> | La lista de inicialización que contiene los elementos para rellenar el arreglo |

### ReturnValue

Un puntero inteligente que apunta al objeto [Array](../array/) construido

## Ver también

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
