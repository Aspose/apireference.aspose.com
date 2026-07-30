---
title: "System::ObjectExt::CoalesceAssign 方法"
linktitle: "CoalesceAssign"
second_title: "Aspose.Font 适用于 C++"
description: "System::ObjectExt::CoalesceAssign 方法。实现 C++ 中 ''??='' 运算符的翻译。"
type: docs
weight: 600
url: /zh/cpp/system/objectext/coalesceassign/
---
## ObjectExt::CoalesceAssign method


实现对 '??=' 运算符的翻译。

```cpp
template<typename T0,typename T1> static T0 & System::ObjectExt::CoalesceAssign(T0 &value, T1 func)
```


| 参数 | 描述 |
| --- | --- |
| T0 | 左侧值类型。 |
| T1 | 封装右侧表达式的 lambda 类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | T0\& | 左侧值。 |
| 函数 | T1 | 右侧表达式。 |

### ReturnValue

如果左侧值不为 null，则返回左侧值；否则计算右侧表达式并返回结果。

## 另见

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
