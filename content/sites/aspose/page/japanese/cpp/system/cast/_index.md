---
title: "System::Cast メソッド"
linktitle: "Cast"
second_title: "C++ 用 Aspose.Page"
description: "System::Cast メソッド。C++ の SmartPtr オブジェクトに対してキャストを実行します。"
type: docs
weight: 15300
url: /ja/cpp/system/cast/
---
## System::Cast method


[SmartPtr](../smartptr/) オブジェクトに対してキャストを実行します。

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast(SmartPtr<TFrom> const &obj)
```


| パラメーター | 説明 |
| --- | --- |
| TTo | 対象のポインティー型。 |
| TFrom | ソースのポインティー型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | ソース ポインタ。 |

### ReturnValue

キャストが許可されている場合のキャスト結果。

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
