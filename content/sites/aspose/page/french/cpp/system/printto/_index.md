---
title: "System::PrintTo méthode"
linktitle: "PrintTo"
second_title: "Aspose.Page pour C++"
description: "System::PrintTo méthode. Écrit la valeur représentée par l'objet spécifié dans le flux de sortie spécifié en C++."
type: docs
weight: 35300
url: /fr/cpp/system/printto/
---
## System::PrintTo(const Decimal\&, ::std::ostream *) method


Écrit la valeur représentée par l'objet spécifié dans le flux de sortie spécifié.

```cpp
void System::PrintTo(const Decimal &d, ::std::ostream *os)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| d | const Decimal\& | L'objet [Decimal](../decimal/) à imprimer dans le flux |
| os | ::std::ostream * | Le flux dans lequel imprimer l'objet spécifié |

## Voir aussi

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Details_Exception\&, std::ostream *) method


Imprime la valeur dans ostream. Principalement utilisé pour le débogage.

```cpp
void System::PrintTo(const Details_Exception &exception, std::ostream *stream)
```

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const ExceptionWrapper\<T\>\&, std::ostream *) method


Imprime la valeur dans ostream. Principalement utilisé pour le débogage.

```cpp
template<typename T> void System::PrintTo(const ExceptionWrapper<T> &exception_wrapper, std::ostream *stream)
```

## Voir aussi

* Class [ExceptionWrapper](../exceptionwrapper/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Guid\&, std::ostream *) method


Imprime la valeur dans ostream. Principalement utilisé pour le débogage.

```cpp
void System::PrintTo(const Guid &value, std::ostream *stream)
```

## Voir aussi

* Class [Guid](../guid/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Nullable\<T\>\&, std::ostream *) method


Imprime la valeur dans ostream. Principalement utilisé pour le débogage.

```cpp
template<typename T> void System::PrintTo(const Nullable<T> &value, std::ostream *stream)
```

## Voir aussi

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


Imprime la valeur dans ostream. Principalement utilisé pour le débogage.

```cpp
template<typename T> std::enable_if_t<detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


Imprime la valeur dans ostream. Principalement utilisé pour le débogage.

```cpp
template<typename T> std::enable_if_t<!detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const System::Object\&, std::ostream *) method


Imprime la valeur dans ostream. Principalement utilisé pour le débogage.

```cpp
void System::PrintTo(const System::Object &value, std::ostream *stream)
```

## Voir aussi

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const System::String\&, std::ostream *) method


Imprime la chaîne dans ostream. Principalement utilisé pour le débogage.

```cpp
void System::PrintTo(const System::String &value, std::ostream *os)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| value | const System::String\& | à imprimer. |
| os | std::ostream * | ostream cible. |

## Voir aussi

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const WeakPtr\<T\>\&, std::ostream *) method


Imprime la valeur dans ostream. Principalement utilisé pour le débogage.

```cpp
template<typename T> void System::PrintTo(const WeakPtr<T> &object_ptr, std::ostream *stream)
```

## Voir aussi

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(DateTime, std::ostream *) method


Imprime la valeur dans ostream. Principalement utilisé pour le débogage.

```cpp
void System::PrintTo(DateTime value, std::ostream *stream)
```

## Voir aussi

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(DateTimeOffset, std::ostream *) method


Imprime la valeur dans ostream. Principalement utilisé pour le débogage.

```cpp
void System::PrintTo(DateTimeOffset value, std::ostream *stream)
```

## Voir aussi

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(TimeSpan, std::ostream *) method


Imprime la valeur dans ostream. Principalement utilisé pour le débogage.

```cpp
void System::PrintTo(TimeSpan value, std::ostream *stream)
```

## Voir aussi

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
