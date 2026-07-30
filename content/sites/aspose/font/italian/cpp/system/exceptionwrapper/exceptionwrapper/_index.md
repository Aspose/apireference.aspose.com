---
title: "System::ExceptionWrapper::ExceptionWrapper costruttore"
linktitle: "ExceptionWrapper"
second_title: "Aspose.Font per C++"
description: "System::ExceptionWrapper::ExceptionWrapper costruttore. Costruttore che inoltra i parametri ai costruttori della classe Exception e crea uno smart pointer che contiene una nuova istanza della classe Exception in C++."
type: docs
weight: 100
url: /it/cpp/system/exceptionwrapper/exceptionwrapper/
---
## ExceptionWrapper::ExceptionWrapper(Args\&&...) constructor


Costruttore che inoltra i parametri ai costruttori della classe [Exception](../../exception/) e crea uno smart pointer che contiene una nuova istanza della classe [Exception](../../exception/).

```cpp
template<typename ...,typename> System::ExceptionWrapper<T>::ExceptionWrapper(Args &&...args)
```

## Vedi anche

* Class [ExceptionWrapper](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ExceptionWrapper::ExceptionWrapper(const ExceptionPtr\&) constructor


Crea un'istanza della classe [ExceptionWrapper](../) che contiene il puntatore passato.

```cpp
System::ExceptionWrapper<T>::ExceptionWrapper(const ExceptionPtr &ptr)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| ptr | const ExceptionPtr\& | Smart pointer all'istanza della classe [Exception](../../exception/). |

## Vedi anche

* Typedef [ExceptionPtr](../../exceptionptr/)
* Class [ExceptionWrapper](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ExceptionWrapper::ExceptionWrapper(const ExceptionWrapper\&) constructor


Costruttore di copia.

```cpp
System::ExceptionWrapper<T>::ExceptionWrapper(const ExceptionWrapper &other)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| altro | const ExceptionWrapper\& | Altra istanza della classe wrapper che deve essere copiata. |

## Vedi anche

* Class [ExceptionWrapper](../)
* Class [ExceptionWrapper](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ExceptionWrapper::ExceptionWrapper(ExceptionWrapper\&&) constructor


Costruttore di spostamento.

```cpp
System::ExceptionWrapper<T>::ExceptionWrapper(ExceptionWrapper &&other) noexcept
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| altro | ExceptionWrapper\&& | Altra istanza della classe wrapper che deve essere spostata. |

## Vedi anche

* Class [ExceptionWrapper](../)
* Class [ExceptionWrapper](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ExceptionWrapper::ExceptionWrapper(std::nullptr_t) constructor


Crea un'istanza nulla della classe [ExceptionWrapper](../) che non rappresenta alcuna eccezione.

```cpp
System::ExceptionWrapper<T>::ExceptionWrapper(std::nullptr_t)
```

## Vedi anche

* Class [ExceptionWrapper](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
