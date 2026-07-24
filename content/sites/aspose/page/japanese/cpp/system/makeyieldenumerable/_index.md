---
title: "System::MakeYieldEnumerable メソッド"
linktitle: "MakeYieldEnumerable"
second_title: "C++ 用 Aspose.Page"
description: "System::MakeYieldEnumerable メソッド。C++ の yield 関数から IEnumerable を作成します。"
type: docs
weight: 25300
url: /ja/cpp/system/makeyieldenumerable/
---
## System::MakeYieldEnumerable method


yield 関数から IEnumerable を作成します。

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerable<T>> System::MakeYieldEnumerable(const Details::YieldFunction<T> &fnc)
```


| パラメーター | 説明 |
| --- | --- |
| T | シーケンス内の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | 実行する yield 関数 |

### ReturnValue

IEnumerable への共有ポインタ

## 参照

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
