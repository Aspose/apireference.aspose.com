---
title: "System::With メソッド"
linktitle: "と"
second_title: "C++ 用 Aspose.Page"
description: "System::With メソッド。C++ で参照レコードをクローンし、イニシャライザ関数オブジェクトを適用します。"
type: docs
weight: 40100
url: /ja/cpp/system/with/
---
## System::With(const SharedPtr\<T\>\&, const A\&) method


参照レコードをクローンし、イニシャライザ関数オブジェクトを適用します。

```cpp
template<typename T,typename A> SharedPtr<T> System::With(const SharedPtr<T> &record, const A &initializer)
```


| パラメーター | 説明 |
| --- | --- |
| T | クローンするレコード型。 |
| A | イニシャライザ関数オブジェクトの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| record | const SharedPtr\<T\>\& | クローンおよび初期化するオブジェクトへの共有ポインタ。 |
| initializer | const A\& | レコードクローンに適用されるイニシャライザ関数オブジェクト。 |

### ReturnValue

クローンされたレコードへの共有ポインタ。

## 参照

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::With(const T\&, const A\&) method


構造体レコードをコピーし、イニシャライザファンクタを適用します。

```cpp
template<typename T,typename A> T System::With(const T &record, const A &initializer)
```


| パラメーター | 説明 |
| --- | --- |
| T | コピーするレコード型。 |
| A | イニシャライザ関数オブジェクトの型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| record | const T\& | コピーして初期化するレコード。 |
| initializer | const A\& | レコードコピーに適用されるイニシャライザファンクタ。 |

### ReturnValue

コピーされたレコード。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
