---
title: "System::ObjectExt::ToString yöntemi"
linktitle: "ToString"
second_title: "Aspose.Page için C++"
description: "System::ObjectExt::ToString yöntemi. C# ToString yönteminin yerine, C++'ta herhangi bir C++ türü üzerinde çalışması için."
type: docs
weight: 1300
url: /tr/cpp/system/objectext/tostring/
---
## ObjectExt::ToString(const char_t *) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi.

```cpp
static String System::ObjectExt::ToString(const char_t *obj)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const char_t * | [String](../../string/) literalini stringe dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const Nullable\<T\>\&) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi.

```cpp
template<typename T> static String System::ObjectExt::ToString(const Nullable<T> &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | [Nullable](../../nullable/) türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const Nullable\<T\>\& | [Nullable](../../nullable/) nesnesi stringe dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | [Enum](../../enum/) türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const T\& | [Enum](../../enum/) değeri stringe dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Akıllı işaretçi türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const T\& | [SmartPtr](../../smartptr/) değeri stringe dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Yapı türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const T\& | Yapı değeri stringe dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Skaler tür. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | T\&& | Skaler değeri stringe dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value &&!std::is_reference<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Skaler tür. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | T\&& | Skaler değeri stringe dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value||std::is_pointer<T>::value||IsExceptionWrapper<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Akıllı işaretçi türü veya [ExceptionWrapper](../../exceptionwrapper/). |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | T\& | Akıllı işaretçi veya [ExceptionWrapper](../../exceptionwrapper/) stringe dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Skaler tür. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | T\& | Skaler değeri stringe dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Yapı türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | T\& | Yapı değeri stringe dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
