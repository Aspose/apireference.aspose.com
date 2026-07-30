---
title: "System::ObjectExt::ToString yöntemi"
linktitle: "ToString"
second_title: "Aspose.Font için C++"
description: "System::ObjectExt::ToString yöntemi. C++'de herhangi bir C++ türünde çalışması için C# ToString yönteminin yerine geçer."
type: docs
weight: 1400
url: /tr/cpp/system/objectext/tostring/
---
## ObjectExt::ToString(const char_t *) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer.

```cpp
static String System::ObjectExt::ToString(const char_t *obj)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const char_t * | [String](../../string/) sabiti, string'e dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const Nullable\<T\>\&) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer.

```cpp
template<typename T> static String System::ObjectExt::ToString(const Nullable<T> &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | [Nullable](../../nullable/) türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const Nullable\<T\>\& | [Nullable](../../nullable/) nesnesi, string'e dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const T\&) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | [Enum](../../enum/) türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const T\& | [Enum](../../enum/) değeri, string'e dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const T\&) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Akıllı gösterici türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const T\& | [SmartPtr](../../smartptr/) değeri, string'e dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const T\&) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Yapı türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const T\& | Yapı değeri, string'e dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&&) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Skaler tür. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | T\&& | Skaler değeri, string'e dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&&) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value &&!std::is_reference<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Skaler tür. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | T\&& | Skaler değeri, string'e dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value||std::is_pointer<T>::value||IsExceptionWrapper<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Akıllı gösterici türü veya [ExceptionWrapper](../../exceptionwrapper/). |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | T\& | Akıllı gösterici veya [ExceptionWrapper](../../exceptionwrapper/) string'e dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Skaler tür. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | T\& | Skaler değeri, string'e dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&) method


Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Yapı türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | T\& | Yapı değeri, string'e dönüştürmek için. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
