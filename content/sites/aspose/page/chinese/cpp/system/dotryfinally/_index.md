---
title: "System::DoTryFinally 方法"
linktitle: "DoTryFinally"
second_title: "Aspose.Page 适用于 C++"
description: "System::DoTryFinally 方法。模拟 C#''的 try[-catch]-finally 语句行为的单一函数。在使用翻译器选项 finally_statement_as_lambda 设置为 true 翻译 C#''的 try[-catch]-finally 语句时，该语句会被翻译为在 C++ 中调用此方法。"
type: docs
weight: 16500
url: /zh/cpp/system/dotryfinally/
---
## System::DoTryFinally(T\&&, F\&&) method


模拟 C#'的 try[-catch]-finally 语句行为的单一函数。在使用翻译器选项 finally_statement_as_lambda 设置为 true 翻译 C#'的 try[-catch]-finally 语句时，该语句会被翻译为调用此方法。

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_void<T>::value> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | 描述 |
| --- | --- |
| T | 实现被模拟的 try[-catch]-finally 语句中 try[-catch] 部分的函数对象的类型 |
| F | 实现被模拟的 try[-catch]-finally 语句中 finally 部分的函数对象的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| tryBlock | T\\&& | 其主体包含实现被模拟的 try[-catch]-finally 语句中 try[-catch] 部分的函数对象 |
| finallyBlock | F\\&& | 其主体包含实现被模拟的 try[-catch]-finally 语句中 finally 部分的函数对象 |

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


模拟 C#'的 try[-catch]-finally 语句行为的单一函数。在使用翻译器选项 finally_statement_as_lambda 设置为 true 翻译 C#'的 try[-catch]-finally 语句时，该语句会被翻译为调用此方法。此重载处理实现 try[-catch]-finally 语句中 try[-catch] 部分的函数对象返回值为 bool 的情况。

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_boolref<T>::value, bool> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | 描述 |
| --- | --- |
| T | 实现被模拟的 try[-catch]-finally 语句中 try[-catch] 部分的函数对象的类型 |
| F | 实现被模拟的 try[-catch]-finally 语句中 finally 部分的函数对象的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| tryBlock | T\\&& | 其主体包含实现被模拟的 try[-catch]-finally 语句中 try[-catch] 部分的函数对象 |
| finallyBlock | F\\&& | 其主体包含实现被模拟的 try[-catch]-finally 语句中 finally 部分的函数对象 |

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


单个函数模拟 C# 的 try[-catch]-finally 语句的行为。在将 C# 的 try[-catch]-finally 语句翻译为选项 finally_statement_as_lambda 为 true 时，该语句被翻译为调用此方法。此重载处理的情况是，实现 try[-catch] 部分的函数对象的返回值为 bool&。

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_nonovoid_boolref<T>::value, std::optional<Details::ResultOf<T, bool &>>> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | 描述 |
| --- | --- |
| T | 实现被模拟的 try[-catch]-finally 语句中 try[-catch] 部分的函数对象的类型 |
| F | 实现被模拟的 try[-catch]-finally 语句中 finally 部分的函数对象的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| tryBlock | T\\&& | 其主体包含实现被模拟的 try[-catch]-finally 语句中 try[-catch] 部分的函数对象 |
| finallyBlock | F\\&& | 其主体包含实现被模拟的 try[-catch]-finally 语句中 finally 部分的函数对象 |

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
