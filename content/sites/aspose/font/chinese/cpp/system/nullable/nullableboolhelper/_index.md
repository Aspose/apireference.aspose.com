---
title: "System::Nullable::NullableBoolHelper 方法"
linktitle: "NullableBoolHelper"
second_title: "Aspose.Font 适用于 C++"
description: "System::Nullable::NullableBoolHelper 方法。帮助函数，用于检查 **this** 和 **other** 是否均非空，并在满足时调用 lambda。用于 C++ 中的 implementation.s。"
type: docs
weight: 800
url: /zh/cpp/system/nullable/nullableboolhelper/
---
## Nullable::NullableBoolHelper method


帮助函数，用于检查 this 和 **other** 是否均非空，并在满足条件时调用 lambda。用于实现中。

```cpp
template<typename T1> bool System::Nullable<T>::NullableBoolHelper(const T1 &other, const std::function<bool()> &f, bool default_if_both_are_null=false) const
```


| 参数 | 描述 |
| --- | --- |
| T1 | 其他可空类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 其他 | const T1\& | 用于比较的其他可空值。 |
| f | const std::function\<bool()>\& | 如果 **this** 和 **other** 均非空时调用的 lambda。 |
| default_if_both_are_null | bool | 如果两个值均为空时的返回值。 |

### ReturnValue

如果 **this** 或 **other** 任一为空则返回 false；如果两者均为空则返回 **default_if_both_are_null**；如果两者均非空则返回 **f** 调用的结果。

## 另见

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
