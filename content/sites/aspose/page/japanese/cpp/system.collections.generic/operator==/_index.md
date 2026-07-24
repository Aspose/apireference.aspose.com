---
title: "System::Collections::Generic::operator== メソッド"
linktitle: "operator=="
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::operator== メソッド。''equals'' セマンティクスを使用して 2 つのキーと値のペアを比較します。キーと値の両方に対して operator == または EqualsTo メソッドを使用し、C++ で定義されている方を使用します。"
type: docs
weight: 5600
url: /ja/cpp/system.collections.generic/operator==/
---
## System::Collections::Generic::operator== method


''equals'' セマンティクスを使用して 2 つのキーと値のペアを比較します。キーと値の両方に対して operator == または EqualsTo メソッドを使用し、定義されている方を使用します。

```cpp
template<typename TKey,typename TValue> bool System::Collections::Generic::operator==(const KeyValuePair<TKey, TValue> &left, const KeyValuePair<TKey, TValue> &right)
```


| パラメーター | 説明 |
| --- | --- |
| TKey | キーの種類です。 |
| TValue | 値型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 左 | const KeyValuePair\<TKey, TValue\>\& | 左辺オペランドです。 |
| 右 | const KeyValuePair\<TKey, TValue\>\& | 右辺オペランド。 |

### ReturnValue

キーと値の両方が一致すれば true、そうでなければ false です。

## 参照

* Class [KeyValuePair](../keyvaluepair/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
