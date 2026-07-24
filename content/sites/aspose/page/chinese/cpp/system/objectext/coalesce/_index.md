---
title: "System::ObjectExt::Coalesce 方法"
linktitle: "Coalesce"
second_title: "Aspose.Page 适用于 C++"
description: "System::ObjectExt::Coalesce 方法。针对可空类型在 C++ 中的 ''??'' 运算符翻译实现。"
type: docs
weight: 500
url: /zh/cpp/system/objectext/coalesce/
---
## ObjectExt::Coalesce(System::Nullable\<T0\>, T1) method


针对可空类型的 '??' 运算符翻译实现。

```cpp
template<typename T0,typename T1> static T0 System::ObjectExt::Coalesce(System::Nullable<T0> value, T1 func)
```


| Parameter | 描述 |
| --- | --- |
| T0 | 左侧值类型。 |
| T1 | 封装右侧表达式的 lambda 的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | System::Nullable\<T0\> | LHS 值。 |
| func | T1 | RHS 表达式。 |

### ReturnValue

如果 LHS 值不为 null，则返回 LHS；否则计算 RHS 表达式并返回结果。

## 另见

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Coalesce(T0, T1) method


针对非可空类型的 '??' 运算符翻译实现。

```cpp
template<typename T0,typename T1> static auto System::ObjectExt::Coalesce(T0 value, T1 func)
```


| Parameter | 描述 |
| --- | --- |
| T0 | 左侧值类型。 |
| T1 | 封装右侧表达式的 lambda 的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| value | T0 | LHS 值。 |
| func | T1 | RHS 表达式。 |

### ReturnValue

如果 LHS 值不为 null，则返回 LHS；否则计算 RHS 表达式并返回结果。

## 另见

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
