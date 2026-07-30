---
title: "System::Nullable::Equals 方法"
linktitle: "等于"
second_title: "Aspose.Font 适用于 C++"
description: "System::Nullable::Equals 方法。确定当前对象表示的值是否等于 C++ 中指定的 Nullable 对象表示的值。"
type: docs
weight: 200
url: /zh/cpp/system/nullable/equals/
---
## Nullable::Equals method


确定当前对象表示的值是否等于指定的 [Nullable](../) 对象表示的值。

```cpp
template<typename T1> std::enable_if<IsNullable<T1>::value, bool>::type System::Nullable<T>::Equals(const T1 &other) const
```


| 参数 | 描述 |
| --- | --- |
| T1 | 用于比较的 [Nullable](../) 对象的底层类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| other | const T1\& | 用于比较的 [Nullable](../) 对象的常量引用 |

### ReturnValue

如果当前对象表示的值等于指定的 [Nullable](../) 对象表示的值，则为 true；否则为 false。

## 另见

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
