---
title: "طريقة System::ObjectExt::ToString"
linktitle: "ToString"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::ObjectExt::ToString. بديل لطريقة C# ToString لتعمل على أي نوع C++ في C++."
type: docs
weight: 1300
url: /ar/cpp/system/objectext/tostring/
---
## ObjectExt::ToString(const char_t *) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
static String System::ObjectExt::ToString(const char_t *obj)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const char_t * | قيمة حرفية [String](../../string/) للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const Nullable\<T\>\&) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
template<typename T> static String System::ObjectExt::ToString(const Nullable<T> &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع [Nullable](../../nullable/). |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const Nullable\<T\>\& | كائن [Nullable](../../nullable/) للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع [Enum](../../enum/). |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const T\& | قيمة [Enum](../../enum/) للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع المؤشر الذكي. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const T\& | قيمة [SmartPtr](../../smartptr/) للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع البنية. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const T\& | قيمة البنية للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع قياسي. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | T\&& | قيمة قياسية للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value &&!std::is_reference<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع قياسي. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | T\&& | قيمة قياسية للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value||std::is_pointer<T>::value||IsExceptionWrapper<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع المؤشر الذكي أو [ExceptionWrapper](../../exceptionwrapper/). |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | T\& | مؤشر ذكي أو [ExceptionWrapper](../../exceptionwrapper/) للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع قياسي. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | T\& | قيمة قياسية للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع البنية. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | T\& | قيمة البنية للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
