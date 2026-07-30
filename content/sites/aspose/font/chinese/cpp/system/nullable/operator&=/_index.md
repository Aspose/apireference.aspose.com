---
title: "System::Nullable::operator&= 方法"
linktitle: "operator&="
second_title: "Aspose.Font 适用于 C++"
description: "System::Nullable::operator&= 方法。使用指定的值作为右侧参数，在 C++ 中对当前对象表示的值应用 operator&=()。"
type: docs
weight: 1100
url: /zh/cpp/system/nullable/operator&=/
---
## Nullable::operator&= method


将 [operator&=()](./) 应用于当前对象表示的值，使用指定的值作为右侧参数。

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator&=(bool other)
```


| 参数 | 描述 |
| --- | --- |
| T1 | 使 SFINAE 工作的模板参数。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| other | bool | 用于当前对象表示的值上应用的 [operator&=()](./) 的右侧布尔值。 |

### ReturnValue

对自身的引用。

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
