---
title: "System::InitObject メソッド"
linktitle: "オブジェクト初期化"
second_title: "C++ 用 Aspose.Page"
description: "System::InitObject メソッド。C++ で共有所有権を持つオブジェクトの初期化を開始します。"
type: docs
weight: 21800
url: /ja/cpp/system/initobject/
---
## System::InitObject method


共有所有権を持つオブジェクトの初期化を開始します。

```cpp
template<typename T> Details::ObjectBuilder<T, SharedPtr<T>> System::InitObject(const SharedPtr<T> &object)
```


| パラメーター | 説明 |
| --- | --- |
| T | 初期化するオブジェクトの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | 初期化する [Object](../object/) |

### ReturnValue

共有ポインタ構築用に設定された ObjectBuilder
## 備考



[Object](../object/) initialization must be finished with [Get()](../get/) call 

## 参照

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
