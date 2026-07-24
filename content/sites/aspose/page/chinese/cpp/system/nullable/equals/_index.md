---
title: "System::Nullable::Equals 方法"
linktitle: "等于"
second_title: "Aspose.Page 适用于 C++"
description: "System::Nullable::Equals 方法。确定当前对象所表示的值是否等于指定 Nullable 对象所表示的值（在 C++ 中）。"
type: docs
weight: 200
url: /zh/cpp/system/nullable/equals/
---
## Nullable::Equals method


确定当前对象表示的值是否等于指定的 [Nullable](../) 对象表示的值。

```cpp
template<typename T1> std::enable_if<IsNullable<T1>::value, bool>::type System::Nullable<T>::Equals(const T1 &other) const
```


| Parameter | 描述 |
| --- | --- |
| T1 | 用于比较的 [Nullable](../) 对象的底层类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| other | const T1\& | 用于比较的 [Nullable](../) 对象的常量引用 |

### ReturnValue

True 如果当前对象表示的值等于指定的 [Nullable](../) 对象表示的值，则为 true；否则为 false

## 另见

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
