---
title: "طريقة System::ObjectExt::ToString"
linktitle: "ToString"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::ObjectExt::ToString. بديل لطريقة C# ToString لتعمل على أي نوع C++ في C++."
type: docs
weight: 1400
url: /ar/cpp/system/objectext/tostring/
---
## ObjectExt::ToString(const char_t *) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
static String System::ObjectExt::ToString(const char_t *obj)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const char_t * | قيمة ثابتة [String](../../string/) للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const Nullable\<T\>\&) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
template<typename T> static String System::ObjectExt::ToString(const Nullable<T> &obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع [Nullable](../../nullable/). |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const Nullable\<T\>\& | كائن [Nullable](../../nullable/) للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const T\&) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع [Enum](../../enum/). |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const T\& | قيمة [Enum](../../enum/) للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const T\&) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع المؤشر الذكي. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const T\& | قيمة [SmartPtr](../../smartptr/) للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const T\&) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع البنية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const T\& | قيمة البنية للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&&) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع قياسي. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | T\&& | قيمة قياسية للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&&) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value &&!std::is_reference<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع قياسي. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | T\&& | قيمة قياسية للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value||std::is_pointer<T>::value||IsExceptionWrapper<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع المؤشر الذكي أو [ExceptionWrapper](../../exceptionwrapper/). |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | T\& | المؤشر الذكي أو [ExceptionWrapper](../../exceptionwrapper/) للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع قياسي. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | T\& | قيمة قياسية للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&) method


بديل لطريقة C# ToString لتعمل على أي نوع C++.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع البنية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | T\& | قيمة البنية للتحويل إلى سلسلة. |

### ReturnValue

[String](../../string/) representation of **obj**.

## انظر أيضًا

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
