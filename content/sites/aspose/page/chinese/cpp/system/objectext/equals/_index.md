---
title: "System::ObjectExt::Equals 方法"
linktitle: "等于"
second_title: "Aspose.Page 适用于 C++"
description: "System::ObjectExt::Equals 方法。替代 C# Object.Equals 调用，适用于 C++ 中的任何类型。针对字符串字面量的重载，使用字符串比较（C++）。"
type: docs
weight: 700
url: /zh/cpp/system/objectext/equals/
---
## ObjectExt::Equals(const char_t(&), String) method


替代 C# [Object.Equals](../../object/equals/) 调用，适用于 C++ 中的任何类型。针对字符串字面量的重载，使用字符串比较。

```cpp
template<size_t> static bool System::ObjectExt::Equals(const char_t(&obj)[N], String another)
```


| Parameter | 描述 |
| --- | --- |
| N | [String](../../string/) 字面量大小。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| obj | const char_t(&) | [String](../../string/) 字面量。 |
| another | String | [String](../../string/)。 |

### ReturnValue

如果字符串匹配，则为真，否则为假。

## 另见

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const double\&, const double\&) method


模拟 C# 风格的浮点比较，其中两个 NaN 被视为相等，尽管根据 IEC 60559:1989 标准，NaN 不等于任何值，包括 NaN 本身。

```cpp
bool System::ObjectExt::Equals(const double &obj, const double &another)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| obj | const double\& | 左侧浮点值。 |
| 另一个 | const double\& | 右侧浮点值。 |

### ReturnValue

如果 **obj** 和 **another** 都是 NaN 或相等，则为真，否则为假。

## 另见

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const float\&, const float\&) method


模拟 C# 风格的浮点比较，其中两个 NaN 被视为相等，尽管根据 IEC 60559:1989 标准，NaN 不等于任何值，包括 NaN 本身。

```cpp
bool System::ObjectExt::Equals(const float &obj, const float &another)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| obj | const float\& | 左侧浮点值。 |
| 另一个 | const float\& | 右侧浮点值。 |

### ReturnValue

如果 **obj** 和 **another** 都是 NaN 或相等，则为真，否则为假。

## 另见

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method




```cpp
template<typename T,typename T2> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```

## 另见

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


C# [Object.Equals](../../object/equals/) 调用的替代实现，适用于 C++ 中的任何类型。针对智能指针类型的重载。

```cpp
template<typename T,typename T2> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Parameter | 描述 |
| --- | --- |
| T | 第一个对象类型。 |
| T2 | 第二个对象类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| obj | const T\& | 第一个对象。 |
| 另一个 | const T2\& | 第二个对象。 |

### ReturnValue

如果对象被视为相等，则为真，否则为假。

## 另见

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


C# [Object.Equals](../../object/equals/) 调用的替代实现，适用于 C++ 中的任何类型。针对标量类型的重载。

```cpp
template<typename T,typename T2> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Parameter | 描述 |
| --- | --- |
| T | 第一个对象类型。 |
| T2 | 第二个对象类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| obj | const T\& | 第一个对象。 |
| 另一个 | const T2\& | 第二个对象。 |

### ReturnValue

如果对象被视为相等，则为真，否则为假。

## 另见

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(T, const T2\&) method


C# [Object.Equals](../../object/equals/) 调用的替代实现，适用于 C++ 中的任何类型。针对结构体类型的重载。

```cpp
template<typename T,typename T2> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(T obj, const T2 &another)
```


| Parameter | 描述 |
| --- | --- |
| T | 第一个对象类型。 |
| T2 | 第二个对象类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| obj | T | 第一个对象。 |
| 另一个 | const T2\& | 第二个对象。 |

### ReturnValue

如果对象被视为相等，则为真，否则为假。

## 另见

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
