---
title: "Metodo System::PrintTo"
linktitle: "PrintTo"
second_title: "Aspose.Font per C++"
description: "Metodo System::PrintTo. Scrive il valore rappresentato dall'oggetto specificato nello stream di output specificato in C++."
type: docs
weight: 35400
url: /it/cpp/system/printto/
---
## System::PrintTo(const Decimal\&, ::std::ostream *) method


Scrive il valore rappresentato dall'oggetto specificato nello stream di output specificato.

```cpp
void System::PrintTo(const Decimal &d, ::std::ostream *os)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| d | const Decimal\& | L'oggetto [Decimal](../decimal/) da stampare nello stream |
| os | ::std::ostream * | Lo stream su cui stampare l'oggetto specificato |

## Vedi anche

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const Details_Exception\&, std::ostream *) method


Stampa il valore su ostream. Principalmente usato per debug.

```cpp
void System::PrintTo(const Details_Exception &exception, std::ostream *stream)
```

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const ExceptionWrapper\<T\>\&, std::ostream *) method


Stampa il valore su ostream. Principalmente usato per debug.

```cpp
template<typename T> void System::PrintTo(const ExceptionWrapper<T> &exception_wrapper, std::ostream *stream)
```

## Vedi anche

* Class [ExceptionWrapper](../exceptionwrapper/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const Guid\&, std::ostream *) method


Stampa il valore su ostream. Principalmente usato per debug.

```cpp
void System::PrintTo(const Guid &value, std::ostream *stream)
```

## Vedi anche

* Class [Guid](../guid/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const Nullable\<T\>\&, std::ostream *) method


Stampa il valore su ostream. Principalmente usato per debug.

```cpp
template<typename T> void System::PrintTo(const Nullable<T> &value, std::ostream *stream)
```

## Vedi anche

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


Stampa il valore su ostream. Principalmente usato per debug.

```cpp
template<typename T> std::enable_if_t<detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


Stampa il valore su ostream. Principalmente usato per debug.

```cpp
template<typename T> std::enable_if_t<!detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const System::Object\&, std::ostream *) method


Stampa il valore su ostream. Principalmente usato per debug.

```cpp
void System::PrintTo(const System::Object &value, std::ostream *stream)
```

## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const System::String\&, std::ostream *) method


Stampa la stringa su ostream. Principalmente usato per debug.

```cpp
void System::PrintTo(const System::String &value, std::ostream *os)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | const System::String\& | da stampare. |
| os | std::ostream * | ostream di destinazione. |

## Vedi anche

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const WeakPtr\<T\>\&, std::ostream *) method


Stampa il valore su ostream. Principalmente usato per debug.

```cpp
template<typename T> void System::PrintTo(const WeakPtr<T> &object_ptr, std::ostream *stream)
```

## Vedi anche

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(DateTime, std::ostream *) method


Stampa il valore su ostream. Principalmente usato per debug.

```cpp
void System::PrintTo(DateTime value, std::ostream *stream)
```

## Vedi anche

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(DateTimeOffset, std::ostream *) method


Stampa il valore su ostream. Principalmente usato per debug.

```cpp
void System::PrintTo(DateTimeOffset value, std::ostream *stream)
```

## Vedi anche

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(TimeSpan, std::ostream *) method


Stampa il valore su ostream. Principalmente usato per debug.

```cpp
void System::PrintTo(TimeSpan value, std::ostream *stream)
```

## Vedi anche

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
