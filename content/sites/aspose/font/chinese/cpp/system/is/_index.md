---
title: "System::Is 方法"
linktitle: "是"
second_title: "Aspose.Font 适用于 C++"
description: "System::Is 方法。顶层匹配函数。在 C++ 中将模式应用于值。"
type: docs
weight: 22000
url: /zh/cpp/system/is/
---
## System::Is(const E\&, const A\&) method


顶层匹配函数。将模式应用于值。

```cpp
template<typename A,typename E> std::enable_if_t<std::is_base_of<Details::Pattern, A>::value, bool> System::Is(const E &e, const A &a)
```


| 参数 | 描述 |
| --- | --- |
| A | 模式类型（必须继承自 Details::Pattern）。 |
| E | 要匹配的值的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| e | const E\& | 要匹配的值。 |
| a | const A\& | 要应用的模式。 |

### ReturnValue

如果模式匹配该值，则为 true。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Is(const ExpressionT\&, const ConstantT\&) method


实现 'is' 常量模式的翻译。

```cpp
template<class ExpressionT,class ConstantT> std::enable_if_t<!std::is_base_of<Details::Pattern, ConstantT>::value, bool> System::Is(const ExpressionT &left, const ConstantT &constant)
```


| 参数 | 描述 |
| --- | --- |
| ExpressionT | 左表达式类型。 |
| ConstantT | 常量表达式的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 左 | const ExpressionT\& | 将被检查的表达式。 |
| 常量 | const ConstantT\& | 将与左侧表达式比较的表达式。 |

### ReturnValue

如果类型检查成功则返回 true，否则返回 false。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Is(const ExpressionT\&, ResultT\&) method


实现 'is' 声明模式的翻译。

```cpp
template<class PatternT,class ExpressionT,class ResultT> bool System::Is(const ExpressionT &left, ResultT &result)
```


| 参数 | 描述 |
| --- | --- |
| PatternT | 要检查的类型。 |
| ExpressionT | 左表达式类型。 |
| ResultT | 结果表达式的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 左 | const ExpressionT\& | 将被检查的表达式。 |
| result | ResultT\& | 将被赋值为检查后类型的变量。 |

### ReturnValue

如果类型检查成功则返回 true，否则返回 false。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
