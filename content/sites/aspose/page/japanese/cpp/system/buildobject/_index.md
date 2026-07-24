---
title: "System::BuildObject メソッド"
linktitle: "BuildObject"
second_title: "C++ 用 Aspose.Page"
description: "System::BuildObject メソッド。C++ で共有所有権を持つオブジェクトを構築します。"
type: docs
weight: 15200
url: /ja/cpp/system/buildobject/
---
## System::BuildObject method


共有所有権を持つオブジェクトを構築します。

```cpp
template<typename T,typename...> Details::ObjectBuilder<T, SharedPtr<T>> System::BuildObject(Args &&... args)
```


| パラメーター | 説明 |
| --- | --- |
| T | 構築するオブジェクトの型 |
| 引数 | オブジェクト構築の引数型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| args | Args\&&... | オブジェクトコンストラクタに転送する引数 |

### ReturnValue

共有ポインタ構築用に設定された ObjectBuilder
## 備考



[SharedPtr<T>](../sharedptr/) を作成し、そのビルダーを返します。
[Object](../object/) construction must be finished with [Get()](../get/) call 

## 参照

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
