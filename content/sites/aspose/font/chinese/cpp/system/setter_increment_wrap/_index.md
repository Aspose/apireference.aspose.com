---
title: "System::setter_increment_wrap 方法"
linktitle: "setter_increment_wrap"
second_title: "Aspose.Font 适用于 C++"
description: "System::setter_increment_wrap 方法。翻译器将 C#''s 的递增表达式（针对具有已定义 setter 和 getter 的类属性）转换为在 C++ 中调用此函数。"
type: docs
weight: 37500
url: /zh/cpp/system/setter_increment_wrap/
---
## System::setter_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


翻译器将 C#'s 的递增表达式（针对具有已定义 setter 和 getter 的类属性）转换为调用此函数。

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| 参数 | 描述 |
| --- | --- |
| T | 属性的类型 |
| Host | - 要修改的实例的类 |
| HostGet | - 主机本身或其基类型，属性的 getter 定义所在 |
| HostSet | - 主机本身或其基类型，属性的 setter 定义所在 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| host | Host *const | 指向待递增属性的对象的指针 |
| pGetter | T(HostGet::*)() | 指向属性 getter 方法的函数指针 |
| pSetter | void(HostSet::*)(T) | 指向属性 setter 方法的函数指针 |

### ReturnValue

属性的递增后值

## 另见

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_increment_wrap(T(*)(), void(*)(T)) method


翻译器将 C#'s 的递增表达式（针对具有已定义 setter 和 getter 的类属性）转换为调用此函数。

```cpp
template<typename T> T System::setter_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| 参数 | 描述 |
| --- | --- |
| T | 属性的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| pGetter | T(*)() | 指向属性 getter 自由函数的函数指针 |
| pSetter | void(*)(T) | 指向属性 setter 自由函数的函数指针 |

### ReturnValue

属性的递增后值

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
