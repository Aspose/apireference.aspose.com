---
title: "System::Object::Equals method"
linktitle: "等于"
second_title: "Aspose.Font 适用于 C++"
description: "System::Object::Equals method. 在 C++ 中使用 C# Object.Equals 语义比较对象。"
type: docs
weight: 300
url: /zh/cpp/system/object/equals/
---
## Object::Equals(ptr) method


使用 C# [Object.Equals](./) 语义比较对象。

```cpp
virtual bool System::Object::Equals(ptr obj)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj | ptr | [Object](../) 用于与当前对象比较。 |

### ReturnValue

如果对象被视为相等则为 true，否则为 false。

## 另见

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::Equals(double const\&, double const\&) method


模拟 C# 风格的浮点比较，其中两个 NaN 被视为相等，尽管根据 IEC 60559:1989 标准，NaN 不等于任何值，包括 NaN 本身。

```cpp
bool System::Object::Equals(double const &objA, double const &objB)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| objA | double const\& | 左侧浮点值。 |
| objB | double const\& | 右侧浮点值。 |

### ReturnValue

如果 **objA** 和 **objB** 均为 NaN 或相等，则为 True；否则为 false。

## 另见

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::Equals(float const\&, float const\&) method


模拟 C# 风格的浮点比较，其中两个 NaN 被视为相等，尽管根据 IEC 60559:1989 标准，NaN 不等于任何值，包括 NaN 本身。

```cpp
bool System::Object::Equals(float const &objA, float const &objB)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| objA | float const\& | 左侧浮点值。 |
| objB | float const\& | 右侧浮点值。 |

### ReturnValue

如果 **objA** 和 **objB** 均为 NaN 或相等，则为 True；否则为 false。

## 另见

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


以 C# 风格比较引用类型对象。

```cpp
template<typename T1,typename T2> static std::enable_if<IsSmartPtr<T1>::value &&IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| 参数 | 描述 |
| --- | --- |
| T1 | 要比较的第一个对象的类型。 |
| T2 | 要比较的第二个对象的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| objA | T1 const\& | 要比较的第一个对象。 |
| objB | T2 const\& | 要比较的第二个对象。 |

### ReturnValue

如果对象通过引用或语义方式（通过 [Object.Equals](./) 类似的比较）匹配，则为 True，否则为 false。

## 另见

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


以 C# 风格比较值类型对象。

```cpp
template<typename T1,typename T2> static std::enable_if<!IsSmartPtr<T1>::value &&!IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| 参数 | 描述 |
| --- | --- |
| T1 | 要比较的第一个对象的类型。 |
| T2 | 要比较的第二个对象的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| objA | T1 const\& | 要比较的第一个对象。 |
| objB | T2 const\& | 要比较的第二个对象。 |

### ReturnValue

如果对象通过可用的相等运算符被视为相等，则为 True，否则为 false。

## 另见

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
