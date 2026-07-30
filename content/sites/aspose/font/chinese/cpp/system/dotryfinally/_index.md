---
title: "System::DoTryFinally 方法"
linktitle: "执行TryFinally"
second_title: "Aspose.Font 适用于 C++"
description: "System::DoTryFinally 方法。该单函数模拟 C#''s try[-catch]-finally 语句的行为。在使用翻译器选项 finally_statement_as_lambda 设置为 true 翻译 C#''s try[-catch]-finally 语句时，该语句会被翻译为在 C++ 中调用此方法。"
type: docs
weight: 16600
url: /zh/cpp/system/dotryfinally/
---
## System::DoTryFinally(T\&&, F\&&) method


该单函数模拟 C#'s try[-catch]-finally 语句的行为。在使用翻译器选项 finally_statement_as_lambda 设置为 true 翻译 C#'s try[-catch]-finally 语句时，该语句会被翻译为调用此方法。

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_void<T>::value> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| 参数 | 描述 |
| --- | --- |
| T | 实现被模拟的 try[-catch]-finally 语句中 try[-catch] 部分的函数对象的类型 |
| F | 实现被模拟的 try[-catch]-finally 语句中 finally 部分的函数对象的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| tryBlock | T\&& | 实现被模拟的 try[-catch]-finally 语句中 try[-catch] 部分的函数对象，其主体包含该实现 |
| finallyBlock | F\&& | 实现被模拟的 try[-catch]-finally 语句中 finally 部分的函数对象，其主体包含该实现 |

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


模拟 C# 的 try[-catch]-finally 语句行为的单一函数。在使用翻译器选项 finally_statement_as_lambda 设置为 true 翻译 C# 的 try[-catch]-finally 语句时，该语句会被翻译为调用此方法。此重载处理函数对象实现的 try[-catch] 部分返回值为 bool 的情况。

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_boolref<T>::value, bool> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| 参数 | 描述 |
| --- | --- |
| T | 实现被模拟的 try[-catch]-finally 语句中 try[-catch] 部分的函数对象的类型 |
| F | 实现被模拟的 try[-catch]-finally 语句中 finally 部分的函数对象的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| tryBlock | T\&& | 实现被模拟的 try[-catch]-finally 语句中 try[-catch] 部分的函数对象，其主体包含该实现 |
| finallyBlock | F\&& | 实现被模拟的 try[-catch]-finally 语句中 finally 部分的函数对象，其主体包含该实现 |

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


模拟 C# 的 try[-catch]-finally 语句行为的单一函数。在使用翻译器选项 finally_statement_as_lambda 设置为 true �译 C# 的 try[-catch]-finally 语句时，该语句会被翻译为调用此方法。此重载处理函数对象实现的 try[-catch] 部分返回值为 bool& 的情况。

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_nonovoid_boolref<T>::value, std::optional<Details::ResultOf<T, bool &>>> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| 参数 | 描述 |
| --- | --- |
| T | 实现被模拟的 try[-catch]-finally 语句中 try[-catch] 部分的函数对象的类型 |
| F | 实现被模拟的 try[-catch]-finally 语句中 finally 部分的函数对象的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| tryBlock | T\&& | 实现被模拟的 try[-catch]-finally 语句中 try[-catch] 部分的函数对象，其主体包含该实现 |
| finallyBlock | F\&& | 实现被模拟的 try[-catch]-finally 语句中 finally 部分的函数对象，其主体包含该实现 |

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
