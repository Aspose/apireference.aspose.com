---
title: "System::MakeYieldEnumerator メソッド"
linktitle: "MakeYieldEnumerator"
second_title: "C++ 用 Aspose.Page"
description: "System::MakeYieldEnumerator メソッド。C++ の yield 関数から IEnumerator を作成します。"
type: docs
weight: 25400
url: /ja/cpp/system/makeyieldenumerator/
---
## System::MakeYieldEnumerator method


yield 関数から IEnumerator を作成します。

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerator<T>> System::MakeYieldEnumerator(const Details::YieldFunction<T> &fnc)
```


| パラメーター | 説明 |
| --- | --- |
| T | シーケンス内の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | 実行する yield 関数 |

### ReturnValue

IEnumerator への共有ポインタ

## 参照

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
