---
title: "System::SafeInvoke method"
linktitle: "SafeInvoke"
second_title: "Aspose.Page 适用于 C++"
description: "System::SafeInvoke method。在 C++ 中实现 ''?.'' 运算符的翻译。"
type: docs
weight: 36900
url: /zh/cpp/system/safeinvoke/
---
## System::SafeInvoke method


实现 '?.' 运算符的翻译。

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 expr, T1 func)
```


| Parameter | 描述 |
| --- | --- |
| T0 | 表达式类型。 |
| T1 | 封装 'WhenTrue' 表达式的 lambda 类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| expr | T0 | 表达式值。 |
| func | T1 | 'WhenTrue' 表达式绑定到函数对象。 |

### ReturnValue

如果 expr 的值不为 null，则返回以该值作为第一个参数调用的 func；否则返回 null。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
