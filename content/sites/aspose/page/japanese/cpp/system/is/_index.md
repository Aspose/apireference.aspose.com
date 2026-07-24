---
title: "System::Is メソッド"
linktitle: "は"
second_title: "C++ 用 Aspose.Page"
description: "System::Is メソッド。トップレベルのマッチング関数。C++ でパターンを値に適用します。"
type: docs
weight: 21900
url: /ja/cpp/system/is/
---
## System::Is(const E\&, const A\&) method


トップレベルのマッチング関数。パターンを値に適用します。

```cpp
template<typename A,typename E> std::enable_if_t<std::is_base_of<Details::Pattern, A>::value, bool> System::Is(const E &e, const A &a)
```


| パラメーター | 説明 |
| --- | --- |
| A | パターン型（Details::Pattern から継承する必要があります）。 |
| E | マッチさせる値の型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| e | const E\& | マッチさせる対象の値。 |
| a | const A\& | 適用するパターン。 |

### ReturnValue

パターンが値にマッチすれば true。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, const ConstantT\&) method


'is' 定数パターンの変換を実装します。

```cpp
template<class ExpressionT,class ConstantT> std::enable_if_t<!std::is_base_of<Details::Pattern, ConstantT>::value, bool> System::Is(const ExpressionT &left, const ConstantT &constant)
```


| パラメーター | 説明 |
| --- | --- |
| ExpressionT | 左側の式の型です。 |
| ConstantT | 定数式の型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 左 | const ExpressionT\& | チェックされる式。 |
| 定数 | const ConstantT\& | 左側の式と比較される式。 |

### ReturnValue

型チェックが成功した場合は true、そうでない場合は false。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, ResultT\&) method


'is' 宣言パターンの変換を実装します。

```cpp
template<class PatternT,class ExpressionT,class ResultT> bool System::Is(const ExpressionT &left, ResultT &result)
```


| パラメーター | 説明 |
| --- | --- |
| PatternT | チェックする型。 |
| ExpressionT | 左側の式の型です。 |
| ResultT | 結果式の型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 左 | const ExpressionT\& | チェックされる式。 |
| 結果 | ResultT\& | チェックされた型に代入される変数。 |

### ReturnValue

型チェックが成功した場合は true、そうでない場合は false。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
