---
title: "System::Build メソッド"
linktitle: "Build"
second_title: "C++ 用 Aspose.Page"
description: "System::Build メソッドです。C++ で直接所有権を持つオブジェクトを構築します。"
type: docs
weight: 15000
url: /ja/cpp/system/build/
---
## System::Build method


直接所有権を持つオブジェクトを構築します。

```cpp
template<typename T,typename...> Details::ObjectBuilder<T> System::Build(Args &&... args)
```


| パラメーター | 説明 |
| --- | --- |
| T | 構築するオブジェクトの型 |
| 引数 | オブジェクト構築の引数型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| args | Args\&&... | オブジェクトコンストラクタに転送する引数 |

### ReturnValue

直接オブジェクト構築用に設定された ObjectBuilder
## 備考



[Object](../object/) construction must be finished with [Get()](../get/) call 

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
