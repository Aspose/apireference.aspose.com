---
title: "System::ObjectExt::Is μέθοδος"
linktitle: "Είναι"
second_title: "Aspose.Page για C++"
description: "System::ObjectExt::Is μέθοδος. Υλοποιεί τη μετάφραση του τελεστή ''is''. Ειδική υλοποίηση για κυριολεκτικό συμβολοσειράς σε C++."
type: docs
weight: 1000
url: /el/cpp/system/objectext/is/
---
## ObjectExt::Is(const char16_t *) method


Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για κυριολεκτικό συμβολοσειράς.

```cpp
template<class T> static bool System::ObjectExt::Is(const char16_t *str)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στόχου. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| str | const char16_t * | [String](../../string/) κυριολεκτικό. |

### ReturnValue

Αληθές εάν το 'is' επιστρέφει true, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const ExceptionWrapper\<U\>\&) method


Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για τύπους περιτύλιξης εξαιρέσεων.

```cpp
template<class T,class U> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Is(const ExceptionWrapper<U> &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στόχου. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const ExceptionWrapper\<U\>\& | [Object](../../object/) για δοκιμή του τελεστή 'is'. |

### ReturnValue

Αληθές εάν το 'is' επιστρέφει true, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [ExceptionWrapper](../../exceptionwrapper/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Nullable\<U\>\&) method


Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδική υλοποίηση για τύπο [Nullable](../../nullable/).

```cpp
template<class T,class U> static bool System::ObjectExt::Is(const Nullable<U> &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στόχου. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const Nullable\<U\>\& | τύπος [Nullable](../../nullable/). |

### ReturnValue

Αληθές εάν το 'is' επιστρέφει true, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Object\&) method


Υλοποιεί μετάφραση του τελεστή 'is'. Εξειδίκευση για τύπους τιμών.

```cpp
template<class T> static std::enable_if<std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στόχου. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) για δοκιμή του τελεστή 'is'. |

### ReturnValue

Αληθές εάν το 'is' επιστρέφει true, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Object\&) method


Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για μη μετατρέψιμους τύπους.

```cpp
template<class T> static std::enable_if<!std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στόχου. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) για δοκιμή του τελεστή 'is'. |

### ReturnValue

Πάντα επιστρέφει false καθώς οι τύποι είναι μη μετατρέψιμοι.

## Δείτε επίσης

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για nullable τύπους.

```cpp
template<class T> static std::enable_if<IsNullable<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στόχου. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) για δοκιμή του τελεστή 'is'. |

### ReturnValue

Αληθές εάν το 'is' επιστρέφει true, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για τύπους που μπορούν να τοποθετηθούν σε κουτί με ορισμένο τελεστή ==

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στόχου. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) για δοκιμή του τελεστή 'is'. |

### ReturnValue

Αληθές εάν το 'is' επιστρέφει true, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για τύπους που μπορούν να τοποθετηθούν σε κουτί χωρίς ορισμένο ==

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στόχου. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) για δοκιμή του τελεστή 'is'. |

### ReturnValue

Αληθές εάν το 'is' επιστρέφει true, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


Υλοποιεί μετάφραση του τελεστή 'is'. Εξειδίκευση για τύπους δεικτών.

```cpp
template<class T,class U> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στόχου. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) για δοκιμή του τελεστή 'is'. |

### ReturnValue

Αληθές εάν το 'is' επιστρέφει true, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για τύπους enum.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στόχου. |
| U | Τύπος του αντικειμένου που δείχνει. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) για δοκιμή του τελεστή 'is'. |

### ReturnValue

Αληθές εάν το 'is' επιστρέφει true, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<V\>\&) method


Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για τύπους τιμών που τοποθετούνται σε κουτί σε διεπαφές.

```cpp
template<class T,class V> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!std::is_same<V, Object>::value, bool>::type System::ObjectExt::Is(const SmartPtr<V> &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στόχου. |
| V | Τύπος του αντικειμένου που δείχνει. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const SmartPtr\<V\>\& | [Object](../../object/) για δοκιμή του τελεστή 'is'. |

### ReturnValue

Αληθές εάν το 'is' επιστρέφει true, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [Object](../../object/)
* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const T\&) method


Υλοποιεί μετάφραση του τελεστή 'is'. Εξειδίκευση για τύπους που μπορούν να υποστούν boxing (τιμές), που είναι ακριβώς αυτό που είναι.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value, bool>::type System::ObjectExt::Is(const T &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στόχου. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) για δοκιμή του τελεστή 'is'. Αγνοείται. |

### ReturnValue

Πάντα true

## Δείτε επίσης

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const U\&) method


Υλοποιεί μετάφραση του τελεστή 'is'. Εξειδίκευση για τύπους δεικτών βελτιστοποιημένους για κλάσεις 'final'.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στόχου. |
| U | Τύπος που ελέγχεται. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) για δοκιμή του τελεστή 'is'. |

### ReturnValue

Αληθές εάν το 'is' επιστρέφει true, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const U\&) method


Υλοποιεί μετάφραση του τελεστή 'is'. Εξειδίκευση για τύπους δεικτών.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&!std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στόχου. |
| U | Τύπος που ελέγχεται. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) για δοκιμή του τελεστή 'is'. |

### ReturnValue

Αληθές εάν το 'is' επιστρέφει true, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const WeakPtr\<U\>\&) method


Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για τύπους enum έναντι αδύναμων δεικτών.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const WeakPtr<U> &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στόχου. |
| U | Τύπος του αντικειμένου που δείχνει. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const WeakPtr\<U\>\& | [Object](../../object/) για δοκιμή του τελεστή 'is'. |

### ReturnValue

Αληθές εάν το 'is' επιστρέφει true, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [WeakPtr](../../weakptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(int32_t) method


Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για κυριολεκτικό ακέραιου.

```cpp
template<class T> static bool System::ObjectExt::Is(int32_t value)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στόχου. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | int32_t | ακέραιο κυριολεκτικό. |

### ReturnValue

Αληθές εάν το 'is' επιστρέφει true, ψευδές διαφορετικά.

## Δείτε επίσης

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
