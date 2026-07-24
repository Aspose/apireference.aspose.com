---
title: "System::Get método"
linktitle: "Obtener"
second_title: "Aspose.Page para C++"
description: "System::Get método. Función para obtener el N-ésimo elemento de la tupla dada. Sobrecarga para objeto base en C++."
type: docs
weight: 20700
url: /es/cpp/system/get/
---
## System::Get(const SharedPtr\<Object\>\&) method


Función para obtener el N-ésimo elemento de la tupla dada. Sobrecarga para objeto base.

```cpp
template<std::size_t> auto System::Get(const SharedPtr<Object> &object)
```


| Parámetro | Descripción |
| --- | --- |
| N | índice del elemento. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| objeto | const SharedPtr\<Object\>\& | objeto a inspeccionar. |

### ReturnValue

valor del N-ésimo elemento de la tupla convertido a objeto.

## Ver también

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const SharedPtr\<T\>\&) method


Función para obtener el N-ésimo elemento de la tupla dada. Sobrecarga para punteros compartidos.

```cpp
template<std::size_t,typename T> auto System::Get(const SharedPtr<T> &pointer)
```


| Parámetro | Descripción |
| --- | --- |
| N | índice del elemento. |
| T | tipo del objeto inspeccionado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| objeto | const SharedPtr\<T\>\& | objeto a inspeccionar. |

### ReturnValue

valor del N-ésimo elemento de la tupla.

## Ver también

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const T\&) method


Función para obtener el N-ésimo elemento de la tupla dada. Sobrecarga para objetos con método Deconstruct.

```cpp
template<std::size_t,typename T> auto System::Get(const T &object)
```


| Parámetro | Descripción |
| --- | --- |
| N | índice del elemento. |
| T | tipo del objeto inspeccionado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| objeto | const T\& | objeto a inspeccionar. |

### ReturnValue

valor del N-ésimo elemento de la tupla.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const ValueTuple\<Args...\>\&) method


Obtiene el N-ésimo elemento de la tupla de valores.

```cpp
template<std::size_t,typename...> auto System::Get(const ValueTuple<Args...> &tuple)
```


| Parámetro | Descripción |
| --- | --- |
| N | índice del elemento. |
| Argumentos | elementos de tupla. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| tupla | const ValueTuple\<Args...\>\& | tupla para obtener elemento de. |

### ReturnValue

valor del N-ésimo elemento de la tupla.

## Ver también

* Class [ValueTuple](../valuetuple/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
