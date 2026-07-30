---
title: "System::SafeInvoke method"
linktitle: "SafeInvoke"
second_title: "Aspose.Font 适用于 C++"
description: "System::SafeInvoke 方法。C++ 中 ''?.'' 运算符翻译的实现。"
type: docs
weight: 37000
url: /zh/cpp/system/safeinvoke/
---
## System::SafeInvoke method


'?.' 运算符翻译的实现。

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 &&expr, T1 &&func)
```


| 参数 | 描述 |
| --- | --- |
| T0 | 表达式类型。 |
| T1 | 封装 'WhenTrue' 表达式的 lambda 类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| expr | T0\&& | 表达式值。 |
| 函数 | T1\&& | ‘WhenTrue’ 表达式绑定到仿函数。 |

### ReturnValue

如果 expr 值不为 null，则返回以其值作为第一个参数调用的 func；否则返回 null。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
