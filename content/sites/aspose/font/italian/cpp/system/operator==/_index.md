---
title: "metodo System::operator=="
linktitle: "operator=="
second_title: "Aspose.Font per C++"
description: "Come utilizzare il metodo operator== della classe in C++."
type: docs
weight: 32500
url: /it/cpp/system/operator==/
---
## System::operator==(ArraySegment\<T\>, ArraySegment\<T\>) method




```cpp
template<typename T> bool System::operator==(ArraySegment<T> a, ArraySegment<T> b)
```

## Vedi anche

* Class [ArraySegment](../arraysegment/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(Chars\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class Chars,typename std::enable_if< IsStringLiteral< Chars, char_t >::value >::type *> bool System::operator==(Chars &left, const String &right)
```


| Parametro | Descrizione |
| --- | --- |
| Chars | [String](../string/) tipo letterale. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| left | Chars\& | [String](../string/) letterale da confrontare. |
| right | const String\& | [String](../string/) da confrontare. |

### ReturnValue

vero se le stringhe corrispondono, falso altrimenti.

## Vedi anche

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(const SharedPtr\<Object\>\&, const String\&) method


[Object](../object/) and string comparison.

```cpp
bool System::operator==(const SharedPtr<Object> &left, const String &right)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| left | const SharedPtr\<Object\>\& | [Object](../object/) da convertire in stringa e confrontare. |
| right | const String\& | [String](../string/) da confrontare. |

### ReturnValue

vero se la rappresentazione stringa dell'oggetto è uguale alla stringa, falso altrimenti.

## Vedi anche

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) method


Determina se gli URI rappresentati dagli oggetti corrente e specificato sono uguali.

```cpp
bool System::operator==(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | Il primo oggetto [Uri](../uri/) da confrontare |
| uri2 | const SharedPtr\<Uri\>\& | Il secondo oggetto [Uri](../uri/) da confrontare |

### ReturnValue

Vero se gli URI sono uguali, altrimenti - falso

## Vedi anche

* Typedef [SharedPtr](../sharedptr/)
* Class [Uri](../uri/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(const SmartPtr\<X\>\&, const SmartPtr\<Y\>\&) method


Confronta per uguaglianza due smart pointer.

```cpp
template<class X,class Y> bool System::operator==(const SmartPtr<X> &x, const SmartPtr<Y> &y)
```


| Parametro | Descrizione |
| --- | --- |
| X | Tipo di puntato del primo puntatore. |
| Y | Tipo di puntato del secondo puntatore. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | Primo puntatore da confrontare. |
| y | const SmartPtr\<Y\>\& | Secondo puntatore da confrontare. |

### ReturnValue

Vero se i puntatori corrispondono, falso altrimenti.

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(const SmartPtr\<X\>\&, const Y *) method


Confronto di uguaglianza tra smart pointer e puntatore semplice (C).

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, Y>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator==(const SmartPtr<X> &x, const Y *y)
```


| Parametro | Descrizione |
| --- | --- |
| X | tipo di smart pointer. |
| Y | tipo di puntatore semplice. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | smart pointer da confrontare (sinistra). |
| y | const Y * | puntatore da confrontare (destra). |

### ReturnValue

Vero se i puntatori corrispondono, falso altrimenti.

## Vedi anche

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(const T1\&, const Nullable\<T2\>\&) method


Determina se il valore specificato è uguale al valore rappresentato dall'oggetto [Nullable](../nullable/) specificato applicando [operator==()](./) a questi valori.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator==(const T1 &some, const Nullable<T2> &other)
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Il tipo del valore del primo comparando |
| T2 | Il tipo sottostante dell'oggetto [Nullable](../nullable/) che rappresenta il valore del secondo comparando |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| alcuni | const T1\& | Un riferimento costante al valore che deve essere usato come primo comparando |
| other | const Nullable\<T2\>\& | Un riferimento costante all'oggetto [Nullable](../nullable/) il cui valore rappresentato deve essere usato come secondo comparando |

### ReturnValue

Vero se i comparandi sono uguali, altrimenti - falso

## Vedi anche

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(const X *, const SmartPtr\<Y\>\&) method


Confronto di uguaglianza tra smart pointer e puntatore semplice (C).

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, X>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator==(const X *x, const SmartPtr<Y> &y)
```


| Parametro | Descrizione |
| --- | --- |
| X | tipo di puntatore semplice. |
| Y | tipo di smart pointer. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | const X * | puntatore da confrontare (destra). |
| y | const SmartPtr\<Y\>\& | smart pointer da confrontare (sinistra). |

### ReturnValue

Vero se i puntatori corrispondono, falso altrimenti.

## Vedi anche

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator==(std::nullptr_t, const DateTimeOffset &)
```

## Vedi anche

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(std::nullptr_t, const Nullable\<T\>\&) method


Determina se l'oggetto [Nullable](../nullable/) specificato rappresenta un valore uguale a null.

```cpp
template<typename T> bool System::operator==(std::nullptr_t, const Nullable<T> &other)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | std::nullptr_t | Un riferimento costante a un oggetto [Nullable](../nullable/) da testare |

### ReturnValue

Vero se l'oggetto specificato rappresenta un valore null, falso altrimenti

## Vedi anche

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(std::nullptr_t, const String\&) method


Verifica se la stringa è nulla.

```cpp
bool System::operator==(std::nullptr_t, const String &str)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | std::nullptr_t | [String](../string/) da verificare. |

### ReturnValue

vero se la stringa è null, falso altrimenti.

## Vedi anche

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(std::nullptr_t, DateTime) method




```cpp
bool System::operator==(std::nullptr_t, DateTime)
```

## Vedi anche

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(std::nullptr_t, SmartPtr\<X\> const\&) method


Verifica se lo smart pointer è null.

```cpp
template<class X> bool System::operator==(std::nullptr_t, SmartPtr<X> const &x)
```


| Parametro | Descrizione |
| --- | --- |
| X | Tipo di oggetto puntato dal puntatore. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | std::nullptr_t | Puntatore da verificare. |

### ReturnValue

Vero se il puntatore è null, falso altrimenti.

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(std::nullptr_t, T const\&) method


Verifica se l'oggetto di tipo valore (struttura C# tradotta, ecc.) è null.

```cpp
template<class T> std::enable_if<!std::is_scalar<T>::value &&!std::is_pointer<T>::value &&!std::is_array<T>::value &&detail::has_method_is_null<T>::value, bool>::type System::operator==(std::nullptr_t, T const &x)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo valore. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | std::nullptr_t | [Object](../object/) da verificare. |

### ReturnValue

Vero se l'oggetto è null, falso altrimenti.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator==(std::nullptr_t, TimeSpan)
```

## Vedi anche

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(T\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class T,typename std::enable_if< IsStringPointer< T, char_t >::value >::type *> bool System::operator==(T &left, const String &right)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di puntatore [String](../string/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| left | T\& | Puntatore [String](../string/) da confrontare. |
| right | const String\& | [String](../string/) da confrontare. |

### ReturnValue

vero se le stringhe corrispondono, falso altrimenti.

## Vedi anche

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator==(T const\&, std::nullptr_t) method


Verifica se l'oggetto di tipo valore (struttura C# tradotta, ecc.) è null.

```cpp
template<class T> std::enable_if<!std::is_scalar<T>::value &&!std::is_pointer<T>::value &&!std::is_array<T>::value &&detail::has_method_is_null<T>::value, bool>::type System::operator==(T const &x, std::nullptr_t)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo valore. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | T const\& | [Object](../object/) da verificare. |

### ReturnValue

Vero se l'oggetto è null, falso altrimenti.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
