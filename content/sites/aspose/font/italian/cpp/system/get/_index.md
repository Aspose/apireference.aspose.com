---
title: "System::Get metodo"
linktitle: "Ottieni"
second_title: "Aspose.Font per C++"
description: "System::Get metodo. Funzione per ottenere l'elemento N-esimo della tupla fornita. Sovraccarico per oggetto base in C++."
type: docs
weight: 20800
url: /it/cpp/system/get/
---
## System::Get(const SharedPtr\<Object\>\&) method


Funzione per ottenere l'elemento N-esimo della tupla fornita. Sovraccarico per oggetto base.

```cpp
template<std::size_t> auto System::Get(const SharedPtr<Object> &object)
```


| Parametro | Descrizione |
| --- | --- |
| N | indice dell'elemento. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| oggetto | const SharedPtr\<Object\>\& | oggetto da ispezionare. |

### ReturnValue

valore dell'elemento N-esimo della tupla convertito in oggetto.

## Vedi anche

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Get(const SharedPtr\<T\>\&) method


Funzione per ottenere l'elemento N-esimo della tupla fornita. Sovraccarico per puntatori condivisi.

```cpp
template<std::size_t,typename T> auto System::Get(const SharedPtr<T> &pointer)
```


| Parametro | Descrizione |
| --- | --- |
| N | indice dell'elemento. |
| T | tipo dell'oggetto ispezionato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| oggetto | const SharedPtr\<T\>\& | oggetto da ispezionare. |

### ReturnValue

valore dell'elemento N-esimo della tupla.

## Vedi anche

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Get(const T\&) method


Funzione per ottenere l'elemento N-esimo della tupla fornita. Sovraccarico per oggetti con metodo Deconstruct.

```cpp
template<std::size_t,typename T> auto System::Get(const T &object)
```


| Parametro | Descrizione |
| --- | --- |
| N | indice dell'elemento. |
| T | tipo dell'oggetto ispezionato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| oggetto | const T\& | oggetto da ispezionare. |

### ReturnValue

valore dell'elemento N-esimo della tupla.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Get(const ValueTuple\<Args...\>\&) method


Ottiene l'elemento N-esimo della tupla di valori.

```cpp
template<std::size_t,typename...> auto System::Get(const ValueTuple<Args...> &tuple)
```


| Parametro | Descrizione |
| --- | --- |
| N | indice dell'elemento. |
| Argomenti | elementi della tupla. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| tupla | const ValueTuple\<Args...\>\& | tupla da cui ottenere l'elemento. |

### ReturnValue

valore dell'elemento N-esimo della tupla.

## Vedi anche

* Class [ValueTuple](../valuetuple/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
