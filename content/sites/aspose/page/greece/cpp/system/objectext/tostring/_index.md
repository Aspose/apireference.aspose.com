---
title: "μέθοδος System::ObjectExt::ToString"
linktitle: "ToString"
second_title: "Aspose.Page για C++"
description: "μέθοδος System::ObjectExt::ToString. Αντικατάσταση για τη μέθοδο ToString της C# ώστε να λειτουργεί σε οποιονδήποτε τύπο C++ σε C++."
type: docs
weight: 1300
url: /el/cpp/system/objectext/tostring/
---
## ObjectExt::ToString(const char_t *) method


Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++.

```cpp
static String System::ObjectExt::ToString(const char_t *obj)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const char_t * | literal [String](../../string/) για μετατροπή σε συμβολοσειρά. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Δείτε επίσης

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const Nullable\<T\>\&) method


Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++.

```cpp
template<typename T> static String System::ObjectExt::ToString(const Nullable<T> &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | τύπος [Nullable](../../nullable/). |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const Nullable\<T\>\& | αντικείμενο [Nullable](../../nullable/) για μετατροπή σε συμβολοσειρά. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Δείτε επίσης

* Class [String](../../string/)
* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | τύπος [Enum](../../enum/). |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const T\& | τιμή [Enum](../../enum/) για μετατροπή σε συμβολοσειρά. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Δείτε επίσης

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | τύπος έξυπνου δείκτη. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const T\& | τιμή [SmartPtr](../../smartptr/) για μετατροπή σε συμβολοσειρά. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Δείτε επίσης

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | τύπος δομής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const T\& | τιμή δομής για μετατροπή σε συμβολοσειρά. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Δείτε επίσης

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | πρωτογενής τύπος |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | T\&& | τιμή πρωτογενούς τύπου για μετατροπή σε συμβολοσειρά. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Δείτε επίσης

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value &&!std::is_reference<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | πρωτογενής τύπος |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | T\&& | τιμή πρωτογενούς τύπου για μετατροπή σε συμβολοσειρά. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Δείτε επίσης

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value||std::is_pointer<T>::value||IsExceptionWrapper<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | τύπος έξυπνου δείκτη ή [ExceptionWrapper](../../exceptionwrapper/). |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | T\& | Έξυπνος δείκτης ή [ExceptionWrapper](../../exceptionwrapper/) για μετατροπή σε συμβολοσειρά. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Δείτε επίσης

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | πρωτογενής τύπος |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | T\& | τιμή πρωτογενούς τύπου για μετατροπή σε συμβολοσειρά. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Δείτε επίσης

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | τύπος δομής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | T\& | τιμή δομής για μετατροπή σε συμβολοσειρά. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Δείτε επίσης

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
