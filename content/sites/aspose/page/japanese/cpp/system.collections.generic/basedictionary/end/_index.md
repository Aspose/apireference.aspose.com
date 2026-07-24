---
title: "System::Collections::Generic::BaseDictionary::end メソッド"
linktitle: "end"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::BaseDictionary::end メソッド。コンテナの最後の要素の次にあるキー・バリュー要素の KVPair ラッパーへのイテレータを返します。C# スタイルで実装されており、イテレータは get_Key() と get_Value() インターフェイスを持つ KVPair オブジェクトを返すべきです。この要素はプレースホルダーとして機能し、アクセスしようとすると C++ で未定義の動作になります。"
type: docs
weight: 1100
url: /ja/cpp/system.collections.generic/basedictionary/end/
---
## BaseDictionary::end method


コンテナの最後の要素に続くキーと値の要素の KVPair ラッパーへのイテレータを返します。C# スタイルで実装されており、イテレータは get_Key() と get_Value() インターフェイスを持つ KVPair オブジェクトを返すべきです。この要素はプレースホルダーとして機能し、アクセスしようとすると未定義の動作になります。

```cpp
const_iterator System::Collections::Generic::BaseDictionary<Map>::end() const noexcept
```


### ReturnValue

コレクションの末尾要素の後に配置される理論上の要素を指すイテレータ。

## 参照

* Typedef [const_iterator](../const_iterator/)
* Class [BaseDictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
