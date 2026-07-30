---
title: "System::setter_wrap 方法"
linktitle: "setter_wrap"
second_title: "Aspose.Font 适用于 C++"
description: "System::setter_wrap 方法。针对 C++ 中实例 setter 函数的类型转换的重载。"
type: docs
weight: 38300
url: /zh/cpp/system/setter_wrap/
---
## System::setter_wrap(Host *const, void(HostSet::*)(T2), T) method


针对实例 setter 函数的类型转换的重载。

```cpp
template<typename T,typename T2,typename Host,typename HostSet> std::enable_if<std::is_base_of<HostSet, Host>::value, T>::type System::setter_wrap(Host *const host, void(HostSet::*pSetter)(T2), T value)
```


| 参数 | 描述 |
| --- | --- |
| T | 值类型。 |
| T2 | setter 函数期望的类型。 |
| Host | 实例类型。 |
| HostSet | - 主机本身或其基类型，其中定义了属性的 setter。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| host | Host *const | 用于调用 setter 函数的 [Object](../object/)。 |
| pSetter | void(HostSet::*)(T2) | setter 函数引用。 |
| 值 | T | 要设置的值。 |

### ReturnValue

设置值。

## 另见

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_wrap(void(*)(T2), T) method


针对带类型转换的静态 setter 函数的重载。

```cpp
template<typename T,typename T2> T System::setter_wrap(void(*pSetter)(T2), T value)
```


| 参数 | 描述 |
| --- | --- |
| T | 值类型。 |
| T2 | setter 函数期望的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| pSetter | void(*)(T2) | 静态 setter 函数引用。 |
| 值 | T | 要设置的值。 |

### ReturnValue

设置值。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
