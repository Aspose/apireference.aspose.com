---
title: "System::Collections::Generic::DictionaryPtr クラス"
linktitle: "DictionaryPtr"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::DictionaryPtr クラス。演算子オーバーロードを備えたディクショナリポインタクラス。この型は他のオブジェクトの削除を管理するポインタです。C++ ではスタック上に割り当て、関数に値渡しまたは const 参照で渡すべきです。"
type: docs
weight: 1300
url: /ja/cpp/system.collections.generic/dictionaryptr/
---
## DictionaryPtr class


[Dictionary](../dictionary/) pointer class with operator overloads. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T,typename V>class DictionaryPtr : public System::SmartPtr<Dictionary<T, V>>
```


| パラメーター | 説明 |
| --- | --- |
| T | キーの種類です。 |
| V | 値型です。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [DictionaryPtr](./dictionaryptr/)() | null ポインタを初期化します。 |
| [DictionaryPtr](./dictionaryptr/)(const SharedPtr\<Dictionary\<T, V\>\>\&) | ポインタ型に変換します。 |
| [operator[]](./operator[]/)(const X\&) const | キー型変換に使用するアクセス演算子です。 |
| [operator[]](./operator[]/)(const T\&) const | アクセス演算子です。 |

## 参照

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
