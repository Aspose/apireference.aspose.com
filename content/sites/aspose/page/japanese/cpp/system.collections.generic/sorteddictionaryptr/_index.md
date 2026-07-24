---
title: "System::Collections::Generic::SortedDictionaryPtr クラス"
linktitle: "SortedDictionaryPtr"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::SortedDictionaryPtr クラス。アクセス演算子を持つソート済み辞書ポインタ。この型は他のオブジェクトの削除を管理するポインタです。スタック上で割り当て、C++ では値渡しまたは const 参照で関数に渡すべきです。"
type: docs
weight: 4100
url: /ja/cpp/system.collections.generic/sorteddictionaryptr/
---
## SortedDictionaryPtr class


ソートされた辞書へのポインタで、アクセス演算子を持ちます。この型は他のオブジェクトの削除を管理するポインタです。スタック上に割り当て、値渡しまたは const 参照で関数に渡すべきです。

```cpp
template<typename T,typename V>class SortedDictionaryPtr : public System::SmartPtr<SortedDictionary<T, V>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [operator[]](./operator[]/)(const T\&) const | アクセサ関数。 |
| [SortedDictionaryPtr](./sorteddictionaryptr/)() | null ポインタを作成します。 |
| [SortedDictionaryPtr](./sorteddictionaryptr/)(const SharedPtr\<SortedDictionary\<T, V\>\>\&) | 指定されたソート済み辞書へのポインタを構築します。 |
## 参照

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
