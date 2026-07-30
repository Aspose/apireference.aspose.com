---
title: "System::ObjectExt::Coalesce 方法"
linktitle: "合并"
second_title: "Aspose.Font 适用于 C++"
description: "System::ObjectExt::Coalesce 方法。实现了 C++ 中可空类型的 ''??'' 运算符翻译。"
type: docs
weight: 500
url: /zh/cpp/system/objectext/coalesce/
---
## ObjectExt::Coalesce(System::Nullable\<T0\>, T1) method


实现对可空类型的 '??' 运算符翻译。

```cpp
template<typename T0,typename T1> static T0 System::ObjectExt::Coalesce(System::Nullable<T0> value, T1 func)
```


| 参数 | 描述 |
| --- | --- |
| T0 | 左侧值类型。 |
| T1 | 封装右侧表达式的 lambda 类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | System::Nullable\<T0\> | 左侧值。 |
| 函数 | T1 | 右侧表达式。 |

### ReturnValue

如果左侧值不为 null，则返回左侧值；否则计算右侧表达式并返回结果。

## 另见

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Coalesce(T0, T1) method


实现对非可空类型的 '??' 运算符翻译。

```cpp
template<typename T0,typename T1> static auto System::ObjectExt::Coalesce(T0 value, T1 func)
```


| 参数 | 描述 |
| --- | --- |
| T0 | 左侧值类型。 |
| T1 | 封装右侧表达式的 lambda 类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | T0 | 左侧值。 |
| 函数 | T1 | 右侧表达式。 |

### ReturnValue

如果左侧值不为 null，则返回左侧值；否则计算右侧表达式并返回结果。

## 另见

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
