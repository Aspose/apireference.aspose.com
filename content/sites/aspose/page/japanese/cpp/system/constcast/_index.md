---
title: "System::ConstCast メソッド"
linktitle: "ConstCast"
second_title: "C++ 用 Aspose.Page"
description: "System::ConstCast メソッド。C++ における非推奨キャストの終了。"
type: docs
weight: 16100
url: /ja/cpp/system/constcast/
---
## System::ConstCast method


非推奨キャストの終了。

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| パラメーター | 説明 |
| --- | --- |
| TTo | 対象のポインティー型。 |
| TFrom | ソースのポインティー型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | ソース ポインタ。 |

### ReturnValue

キャストが許可されている場合はキャスト結果を、そうでない場合は nullptr を返します。
## 備考


[SmartPtr](../smartptr/) オブジェクトに対して const キャストを実行します。
## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
