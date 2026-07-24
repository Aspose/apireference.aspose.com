---
title: "System::DynamicCastArray メソッド"
linktitle: "DynamicCastArray"
second_title: "C++ 用 Aspose.Page"
description: "System::DynamicCastArray メソッド。指定された配列の要素を別の型にキャストします（C++）。"
type: docs
weight: 17900
url: /ja/cpp/system/dynamiccastarray/
---
## System::DynamicCastArray method


指定された配列の要素を別の型にキャストします。

```cpp
template<class To,class From> SharedPtr<Array<To>> System::DynamicCastArray(const SharedPtr<Array<From>> &from)
```


| パラメーター | 説明 |
| --- | --- |
| へ | 指定された配列の要素をキャストする型 |
| From | キャスト対象の配列要素の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| from | const SharedPtr\<Array\<From\>\>\& | キャスト対象の要素を含む配列への共有ポインタ |

### ReturnValue

**from** の要素に相当する **To** 型の要素を含む新しい配列へのポインタ

## Deprecated
下位互換性のために追加されました。代わりに ExplicitCast を使用してください。

## 参照

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
