---
title: "System::ObjectExt::ToString 方法"
linktitle: "ToString"
second_title: "Aspose.Font 适用于 C++"
description: "System::ObjectExt::ToString 方法。相当于 C# 的 ToString 方法，可在 C++ 中对任何类型使用。"
type: docs
weight: 1400
url: /zh/cpp/system/objectext/tostring/
---
## ObjectExt::ToString(const char_t *) method


为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。

```cpp
static String System::ObjectExt::ToString(const char_t *obj)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const char_t * | [String](../../string/) 字面量转换为字符串。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 另见

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const Nullable\<T\>\&) method


为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。

```cpp
template<typename T> static String System::ObjectExt::ToString(const Nullable<T> &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | [Nullable](../../nullable/) 类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const Nullable\<T\>\& | [Nullable](../../nullable/) 对象转换为字符串。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 另见

* Class [String](../../string/)
* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const T\&) method


为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | [Enum](../../enum/) 类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const T\& | [Enum](../../enum/) 值转换为字符串。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 另见

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const T\&) method


为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 智能指针类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const T\& | [SmartPtr](../../smartptr/) 值转换为字符串。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 另见

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(const T\&) method


为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 结构体类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | const T\& | 结构体值转换为字符串。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 另见

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&&) method


为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 标量类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | T\&& | 标量值转换为字符串。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 另见

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&&) method


为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value &&!std::is_reference<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 标量类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | T\&& | 标量值转换为字符串。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 另见

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&) method


为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value||std::is_pointer<T>::value||IsExceptionWrapper<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 智能指针类型或 [ExceptionWrapper](../../exceptionwrapper/)。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | T\& | 智能指针或 [ExceptionWrapper](../../exceptionwrapper/) 转换为字符串。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 另见

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&) method


为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 标量类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | T\& | 标量值转换为字符串。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 另见

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ToString(T\&) method


为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| 参数 | 描述 |
| --- | --- |
| T | 结构体类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | T\& | 结构体值转换为字符串。 |

### ReturnValue

[String](../../string/) representation of **obj**.

## 另见

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
