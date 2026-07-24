---
title: "System::Array::Exists メソッド"
linktitle: "Exists"
second_title: "C++ 用 Aspose.Page"
description: "System::Array::Exists メソッド。指定された Array オブジェクトが、指定された述語の要件を満たす要素を含むかどうかを判定します（C++）。"
type: docs
weight: 5000
url: /ja/cpp/system/array/exists/
---
## Array::Exists method


指定された [Array](../) オブジェクトが、指定された述語の要件を満たす要素を含むかどうかを判定します。

```cpp
static bool System::Array<T>::Exists(ArrayPtr<T> arr, std::function<bool(T)> match)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | 要素を検索する配列 |
| 一致 | std::function\<bool(T)> | 要件を定義し、要素がそれらを満たすかどうかをチェックする関数オブジェクト |

### ReturnValue

**arr** が **match** で定義された要件を満たす要素を含む場合は true

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
