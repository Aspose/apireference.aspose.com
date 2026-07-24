---
title: "System::Collections::Generic::IEnumerable::LINQ_Aggregate メソッド"
linktitle: "LINQ_Aggregate"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::IEnumerable::LINQ_Aggregate メソッド。C++ でシーケンスに対してアキュムレータ関数を適用します。"
type: docs
weight: 600
url: /ja/cpp/system.collections.generic/ienumerable/linq_aggregate/
---
## IEnumerable::LINQ_Aggregate method


シーケンスに対してアキュムレータ関数を適用します。

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_Aggregate(const Func<T, T, T> &func)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| func | const Func\<T, T, T\>\& | 各要素に対して呼び出されるアキュムレータ関数です。 |

### ReturnValue

最終的なアキュムレータの値です。

## 参照

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
