---
title: "Costruttore System::Array::Array"
linktitle: "Array"
second_title: "Aspose.Font per C++"
description: "Costruttore System::Array::Array. Costruisce un array vuoto in C++."
type: docs
weight: 100
url: /it/cpp/system/array/array/
---
## Array::Array() constructor


Costruisce un array vuoto.

```cpp
System::Array<T>::Array()
```

## Vedi anche

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(const std::array\<UnderlyingType, InitArraySize\>\&) constructor


Costruisce un oggetto [Array](../) e lo riempie con i valori dell'array specificato contenente elementi di tipo **[UnderlyingType](../underlyingtype/)**.

```cpp
template<std::size_t> System::Array<T>::Array(const std::array<UnderlyingType, InitArraySize> &init)
```


| Parametro | Descrizione |
| --- | --- |
| InitArraySize | Numero di elementi dell'array **init**. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| init | const std::array\<UnderlyingType, InitArraySize\>\& | [Array](../) da copiare nell'array in fase di costruzione. |

## Vedi anche

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(const std::vector\<Q\>\&) constructor


Costruisce un oggetto [Array](../) e lo riempie con i valori copiati da un oggetto std::vector il cui tipo di valori è lo stesso di **T** ma diverso da **[UnderlyingType](../underlyingtype/)**.

```cpp
template<typename Q,typename> System::Array<T>::Array(const std::vector<Q> &value)
```


| Parametro | Descrizione |
| --- | --- |
| Q | Il tipo degli elementi dell'oggetto std::vector da cui copiare gli elementi |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | const std::vector\<Q\>\& | std::vector da cui copiare i valori |

## Vedi anche

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(const vector_t\&) constructor


Costruttore di copia.

```cpp
System::Array<T>::Array(const vector_t &assgn)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| assgn | const vector_t\& | std::vector da cui copiare i valori |

## Vedi anche

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(int, const T\&) constructor


Costruttore di riempimento.

```cpp
System::Array<T>::Array(int count, const T &init=T())
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| count | int | Dimensione iniziale dell'array |
| init | const T\& | Il valore iniziale usato per riempire l'array |

## Vedi anche

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(int, const T) constructor


Costruttore di riempimento.

```cpp
System::Array<T>::Array(int count, const T inits[])
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| count | int | Dimensione iniziale dell'array |
| inizializza | const T | Valori con cui riempire l'array |

## Vedi anche

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(std::initializer_list\<bool\>, int) constructor


Costruisce un oggetto [Array](../) e lo riempie con i valori della lista di inizializzazione specificata contenente elementi di tipo bool.

```cpp
System::Array<T>::Array(std::initializer_list<bool> init, int=0)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| init | std::initializer_list\<bool\> | Lista di inizializzazione contenente gli elementi con cui riempire l'array |

## Vedi anche

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(std::initializer_list\<UnderlyingType\>) constructor


Costruisce un oggetto [Array](../) e lo riempie con i valori della lista di inizializzazione specificata contenente elementi di tipo **[UnderlyingType](../underlyingtype/)**.

```cpp
System::Array<T>::Array(std::initializer_list<UnderlyingType> init)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| init | std::initializer_list\<UnderlyingType\> | Lista di inizializzazione contenente gli elementi con cui riempire l'array |

## Vedi anche

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(std::vector\<Q\>\&&) constructor


Costruisce un oggetto [Array](../) e lo riempie con i valori spostati da un oggetto std::vector il cui tipo di valore è lo stesso di **T** ma diverso da **[UnderlyingType](../underlyingtype/)**.

```cpp
template<typename Q,typename> System::Array<T>::Array(std::vector<Q> &&value)
```


| Parametro | Descrizione |
| --- | --- |
| Q | Il tipo degli elementi dell'oggetto std::vector da cui spostare gli elementi |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | std::vector\<Q\>\&& | std::vector da cui copiare i valori |

## Vedi anche

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) constructor


Costruttore di riempimento.

```cpp
template<typename ValueType> System::Array<T>::Array(typename std::enable_if<std::is_arithmetic<T>::value &&std::is_arithmetic<ValueType>::value &&std::is_convertible<ValueType, T>::value, int>::type count, ValueType init)
```


| Parametro | Descrizione |
| --- | --- |
| ValueType | Tipo del valore iniziale |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| count | typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type | Dimensione iniziale dell'array |
| init | ValueType | Il valore iniziale usato per riempire l'array |

## Vedi anche

* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(vector_t\&&) constructor


Costruttore di spostamento.

```cpp
System::Array<T>::Array(vector_t &&value)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | vector_t\&& | std::vector, i cui elementi sono acquisiti dall'array |

## Vedi anche

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
