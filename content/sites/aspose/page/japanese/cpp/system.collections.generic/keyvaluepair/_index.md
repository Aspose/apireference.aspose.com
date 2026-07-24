---
title: "System::Collections::Generic::KeyValuePair クラス"
linktitle: "KeyValuePair"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::KeyValuePair クラス。キーと値のペア。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。C++ でこの型のオブジェクトを管理するために System::SmartPtr クラスを使用しないでください。"
type: docs
weight: 2900
url: /ja/cpp/system.collections.generic/keyvaluepair/
---
## KeyValuePair class


キーと値のペア。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。[System::SmartPtr](../../system/smartptr/) クラスを使用してこの型のオブジェクトを管理しないでください。

```cpp
template<typename TKey,typename TValue>class KeyValuePair
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Key](./get_key/)() const | キーを取得します。 |
| [get_Value](./get_value/)() const | 値を取得します。 |
| [GetHashCode](./gethashcode/)() const | キーと値のハッシュを XOR してキー・バリューペアのハッシュを計算します。 |
| [IsNull](./isnull/)() const | 常に false を返します。 |
| [KeyValuePair](./keyvaluepair/)() | null キー・バリューペアの初期化子。 |
| [KeyValuePair](./keyvaluepair/)(const TKey\&, const TValue\&) | コンストラクタ。 |
| [KeyValuePair](./keyvaluepair/)(const std::pair\<OtherK, OtherV\>\&) | 型変換コンストラクタ。 |
| [operator<](./operator_/)(const KeyValuePair\&) const | [IComparer<KeyValuePair<TKey, TValue>>](../icomparer/) を継承したクラス用のパッチで、何も比較しません。 |
| [ToString](./tostring/)() const | キー・バリューペアを文字列に変換します。 |

## 参照

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
