---
title: "System::ObjectExt::CoalesceInternal 方法"
linktitle: "CoalesceInternal"
second_title: "Aspose.Font 适用于 C++"
description: "System::ObjectExt::CoalesceInternal 方法。实现了 C++ 中非可空类型的 ''??'' 运算符翻译。为 RT2 可转换为 RT1 的情况提供了重载。"
type: docs
weight: 700
url: /zh/cpp/system/objectext/coalesceinternal/
---
## ObjectExt::CoalesceInternal method


实现对非可空类型的 '??' 运算符翻译。重载用于 RT2 可转换为 RT1 的情况。

```cpp
template<typename RT1,typename RT2,typename F> static std::conditional<std::is_convertible<RT2, RT1>::value, RT1, RT2>::type System::ObjectExt::CoalesceInternal(RT1 value, F func)
```


| 参数 | 描述 |
| --- | --- |
| T0 | 左侧值类型。 |
| T1 | 封装右侧表达式的 lambda 类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | RT1 | 左侧值。 |
| 函数 | F | 右侧表达式。 |

### ReturnValue

如果左侧值不为 null，则返回左侧值；否则计算右侧表达式并返回结果。

## 另见

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
