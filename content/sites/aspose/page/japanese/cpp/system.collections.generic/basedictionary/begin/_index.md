---
title: "System::Collections::Generic::BaseDictionary::begin メソッド"
linktitle: "begin"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::BaseDictionary::begin メソッド。コンテナのキーと値の要素をラップした KVPair ラッパーへのイテレータを返します。C# スタイルで実装されており、イテレータは get_Key() と get_Value() インターフェースを持つ KVPair オブジェクトを返すべきです。コンテナが空の場合、返されるイテレータは C++ の end() と等しくなります。"
type: docs
weight: 400
url: /ja/cpp/system.collections.generic/basedictionary/begin/
---
## BaseDictionary::begin method


コンテナのキーと値の要素の KVPair ラッパーへのイテレータを返します。C# スタイルで実装されており、イテレータは get_Key() と get_Value() インターフェイスを持つ KVPair オブジェクトを返すべきです。コンテナが空の場合、返されるイテレータは [end()](../../ienumerable/end/) と等しくなります。

```cpp
const_iterator System::Collections::Generic::BaseDictionary<Map>::begin() const noexcept
```


### ReturnValue

コレクションの最初の要素を指すイテレータ。

## 参照

* Typedef [const_iterator](../const_iterator/)
* Class [BaseDictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
