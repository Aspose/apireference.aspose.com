---
title: "μέθοδος System::ObjectExt::Unbox"
linktitle: "Αποσυσκευασία"
second_title: "Aspose.Page για C++"
description: "μέθοδος System::ObjectExt::Unbox. Αποσυσκευάζει τύπους τιμών μετά τη μετατροπή σε Object. Υλοποίηση για τύπους enum σε C++."
type: docs
weight: 1400
url: /el/cpp/system/objectext/unbox/
---
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Αποσυσκευάζει τύπους τιμών μετά τη μετατροπή σε [Object](../../object/). Υλοποίηση για τύπους enum.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | τύπος [Enum](../../enum/). |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) για αποσυσκευασία. |

### ReturnValue

[Enum](../../enum/) value.

## Δείτε επίσης

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Αποσυσκευάζει τύπους τιμών μετά τη μετατροπή σε [Object](../../object/). Υλοποίηση για μη-enum και μη-Nullable τύπους.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος τιμής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) για αποσυσκευασία. |

### ReturnValue

Αποσυσκευασμένη τιμή.

## Δείτε επίσης

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Αποσυσκευάζει τύπους τιμών μετά τη μετατροπή σε [Object](../../object/). Υλοποίηση για μη-enum και μη-Nullable τύπους.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος τιμής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) για αποσυσκευασία. |

### ReturnValue

Αποσυσκευασμένη τιμή.

## Δείτε επίσης

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Αποσυσκευάζει τιμές συμβολοσειράς.

```cpp
String System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) για αποσυσκευασία |

### ReturnValue

[String](../../string/) representation of boxed string, can be null if boxed string was null.

## Δείτε επίσης

* Class [String](../../string/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


Αποσυσκευάζει τύπους enum σε ακέραιο.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::numeric_limits<T>::is_integer, T>::type System::ObjectExt::Unbox(E e)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος ακέραιου προορισμού. |
| E | Τύπος enum πηγής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| e | E | Τιμή για αποσυσκευασία. |

### ReturnValue

Ακέραια αναπαράσταση του enum.

## Δείτε επίσης

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


Μετατρέπει τύπους enum.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(E e)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος enum προορισμού. |
| E | Τύπος enum πηγής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| e | E | Τιμή για αποσυσκευασία. |

### ReturnValue

Μετατρεπόμενη τιμή enum.

## Δείτε επίσης

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
