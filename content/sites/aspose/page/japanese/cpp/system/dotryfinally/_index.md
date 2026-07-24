---
title: "System::DoTryFinally メソッド"
linktitle: "DoTryFinally"
second_title: "C++ 用 Aspose.Page"
description: "System::DoTryFinally メソッド。C#''s の try[-catch]-finally 文の動作をエミュレートする単一関数です。translator''s のオプション finally_statement_as_lambda が true に設定された状態で C#''s の try[-catch]-finally 文を翻訳する際、ステートメントは C++ でこのメソッドの呼び出しに変換されます。"
type: docs
weight: 16500
url: /ja/cpp/system/dotryfinally/
---
## System::DoTryFinally(T\&&, F\&&) method


単一関数は C#'s の try[-catch]-finally 文の動作をエミュレートします。translator's のオプション finally_statement_as_lambda が true に設定された状態で C#'s の try[-catch]-finally 文を翻訳する際、ステートメントはこのメソッドの呼び出しに変換されます。

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_void<T>::value> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| パラメーター | 説明 |
| --- | --- |
| T | エミュレートされる try[-catch]-finally 文の try[-catch] 部分を実装する関数オブジェクトの型 |
| F | エミュレートされる try[-catch]-finally 文の finally 部分を実装する関数オブジェクトの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| tryBlock | T\&& | エミュレートされる try[-catch]-finally 文の try[-catch] 部分の実装を含む本体を持つ関数オブジェクト |
| finallyBlock | F\&& | エミュレートされる try[-catch]-finally 文の finally 部分の実装を含む本体を持つ関数オブジェクト |

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


単一関数は C#'s の try[-catch]-finally 文の動作をエミュレートします。translator's のオプション finally_statement_as_lambda が true に設定された状態で C#'s の try[-catch]-finally 文を翻訳する際、ステートメントはこのメソッドの呼び出しに変換されます。このオーバーロードは、try[-catch]-finally 文の try[-catch] 部分を実装する関数オブジェクトの戻り値が bool である場合を処理します。

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_boolref<T>::value, bool> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| パラメーター | 説明 |
| --- | --- |
| T | エミュレートされる try[-catch]-finally 文の try[-catch] 部分を実装する関数オブジェクトの型 |
| F | エミュレートされる try[-catch]-finally 文の finally 部分を実装する関数オブジェクトの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| tryBlock | T\&& | エミュレートされる try[-catch]-finally 文の try[-catch] 部分の実装を含む本体を持つ関数オブジェクト |
| finallyBlock | F\&& | エミュレートされる try[-catch]-finally 文の finally 部分の実装を含む本体を持つ関数オブジェクト |

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


The sigle function that emulates behavior of C#'s try[-catch]-finally statement. During translation of C#'s try[-catch]-finally statement with translator's option finally_statement_as_lambda set to true, the statement is translated into the invocation of this method. This overload handles the case in which the return value of the function object that implements the try[-catch] part of the try[-catch]-finally statement is bool&.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_nonovoid_boolref<T>::value, std::optional<Details::ResultOf<T, bool &>>> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| パラメーター | 説明 |
| --- | --- |
| T | エミュレートされる try[-catch]-finally 文の try[-catch] 部分を実装する関数オブジェクトの型 |
| F | エミュレートされる try[-catch]-finally 文の finally 部分を実装する関数オブジェクトの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| tryBlock | T\&& | エミュレートされる try[-catch]-finally 文の try[-catch] 部分の実装を含む本体を持つ関数オブジェクト |
| finallyBlock | F\&& | エミュレートされる try[-catch]-finally 文の finally 部分の実装を含む本体を持つ関数オブジェクト |

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
