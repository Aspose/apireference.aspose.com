---
title: "System::ObjectExt::CoalesceInternal 方法"
linktitle: "CoalesceInternal"
second_title: "Aspose.Page 适用于 C++"
description: "System::ObjectExt::CoalesceInternal 方法。实现 ''??'' 运算符的非可空类型翻译。重载用于 RT2 可转换为 RT1 的情况（C++）。"
type: docs
weight: 600
url: /zh/cpp/system/objectext/coalesceinternal/
---
## ObjectExt::CoalesceInternal method


针对非可空类型的 '??' 运算符翻译实现。针对 RT2 可转换为 RT1 的情况的重载。

```cpp
template<typename RT1,typename RT2,typename F> static std::conditional<std::is_convertible<RT2, RT1>::value, RT1, RT2>::type System::ObjectExt::CoalesceInternal(RT1 value, F func)
```


| Parameter | 描述 |
| --- | --- |
| T0 | 左侧值类型。 |
| T1 | 封装右侧表达式的 lambda 的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | RT1 | LHS 值。 |
| func | F | RHS 表达式。 |

### ReturnValue

如果 LHS 值不为 null，则返回 LHS；否则计算 RHS 表达式并返回结果。

## 另见

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
