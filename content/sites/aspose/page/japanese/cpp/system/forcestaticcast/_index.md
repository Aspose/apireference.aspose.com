---
title: "System::ForceStaticCast メソッド"
linktitle: "強制静的キャスト"
second_title: "C++ 用 Aspose.Page"
description: "System::ForceStaticCast メソッド。C++ で SmartPtr オブジェクトに対して実際の static_cast を実行します。"
type: docs
weight: 20400
url: /ja/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


[SmartPtr](../smartptr/) オブジェクトに対して実際の static_cast を実行します。

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| パラメーター | 説明 |
| --- | --- |
| TTo | 対象のポインティー型。 |
| TFrom | ソースのポインティー型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | ソース ポインタ。 |

### ReturnValue

キャストが許可されている場合はキャスト結果が得られますが、そうでない場合の動作は未定義です。

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
