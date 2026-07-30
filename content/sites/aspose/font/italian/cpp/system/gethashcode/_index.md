---
title: "System::GetHashCode metodo"
linktitle: "OttieniCodiceHash"
second_title: "Aspose.Font per C++"
description: "System::GetHashCode metodo. Specializzazione per std::thread::id; Restituisce il codice hash per l'oggetto thread specificato in C++."
type: docs
weight: 21300
url: /it/cpp/system/gethashcode/
---
## System::GetHashCode(const std::thread::id\&) method


Specializzazione per std::thread::id; Restituisce il codice hash per l'oggetto thread specificato.

```cpp
int System::GetHashCode(const std::thread::id &id)
```

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


Restituisce un codice hash per il valore scalare specificato.

```cpp
template<typename T> std::enable_if<std::is_scalar<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo del valore per il quale la funzione genera il codice hash |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const T\& | Il valore per cui generare il codice hash |

### ReturnValue

Il codice hash generato per il valore specificato

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


Restituisce un codice hash per l'oggetto specificato.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&System::IsSmartPtr<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo dell'oggetto per il quale la funzione genera il codice hash |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const T\& | Il [SmartPtr](../smartptr/) che punta all'oggetto per cui generare il codice hash |

### ReturnValue

Il codice hash generato per l'oggetto specificato

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


Restituisce un codice hash per l'oggetto specificato che è un'eccezione.

```cpp
template<typename T> std::enable_if<System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo dell'oggetto per il quale la funzione genera il codice hash |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const T\& | Il wrapper [Exception](../exception/) che contiene l'oggetto per cui generare il codice hash |

### ReturnValue

Il codice hash generato per l'oggetto specificato

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


Restituisce un codice hash per l'oggetto specificato che non è né un puntatore intelligente né un'eccezione.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&!System::IsSmartPtr<T>::value &&!System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo dell'oggetto per il quale la funzione genera il codice hash |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const T\& | Un riferimento const all'oggetto per cui generare il codice hash |

### ReturnValue

Il codice hash generato per l'oggetto specificato

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
