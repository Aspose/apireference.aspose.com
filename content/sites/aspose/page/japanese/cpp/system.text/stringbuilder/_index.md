---
title: "System::Text::StringBuilder クラス"
linktitle: "StringBuilder"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::StringBuilder クラス。文字列を部分ごとに蓄積するバッファ。この型はスタック上の値型として、または System::MakeObject() 関数を使用してヒープ上に割り当てることができます。オブジェクトが割り当てられたら、これら二つの使用ケースを混在させてはいけません：スタック上に割り当てられたオブジェクトへの SmartPtr ポインタを使用することは C++ で厳格に禁止されています。"
type: docs
weight: 2400
url: /ja/cpp/system.text/stringbuilder/
---
## StringBuilder class


[Buffer](../../system/buffer/) to accumulate string part by part. This type can be allocated either in stack as value type or in heap using [System::MakeObject()](../../system/makeobject/) function. Once the object is allocated, never mix up these two usecases: having [SmartPtr](../../system/smartptr/) pointers onto stack-allocated objects is strictly prohibited.

```cpp
class StringBuilder : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Append](./append/)(char_t) | 文字をビルダーに追加します。 |
| [Append](./append/)(char_t, int) | 文字をビルダーに追加します。 |
| [Append](./append/)(const ArrayPtr\<char_t\>\&) | 文字配列をビルダーに追加します。 |
| [Append](./append/)(const ArrayPtr\<char_t\>\&, int, int) | 文字配列のスライスをビルダーに追加します。 |
| [Append](./append/)(const String\&) | 文字列をビルダーに追加します。 |
| [Append](./append/)(const String\&, int, int) | 文字列のスライスをビルダーに追加します。 |
| [Append](./append/)(const SharedPtr\<T\>\&) | オブジェクトの文字列表現をビルダーに追加します。 |
| [Append](./append/)(const SharedPtr\<StringBuilder\>\&) | ビルダーの内容をビルダーに追加します。 |
| [Append](./append/)(float) | 浮動小数点値をビルダーに追加します。 |
| [Append](./append/)(double) | 浮動小数点値をビルダーに追加します。 |
| [Append](./append/)(int) | 整数値をビルダーに追加します。 |
| [Append](./append/)(T) | 算術値をビルダーに追加します。 |
| [Append](./append/)(E) | 列挙型の値の文字列表現をビルダーに追加します。 |
| [AppendFormat](./appendformat/)(const String\&, const TArgs\&...) | 書式設定された文字列をビルダーに追加します。 |
| [AppendFormat](./appendformat/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const TArgs\&...) | 書式設定された文字列をビルダーに追加します。 |
| [AppendLine](./appendline/)() | 改行文字をビルダーに追加します。 |
| [AppendLine](./appendline/)(const String\&) | 文字列と改行文字を続けてビルダーに追加します。 |
| [Clear](./clear/)() | ビルダーからすべての文字を削除します。 |
| [CopyTo](./copyto/)(int, System::ArrayPtr\<char_t\> const\&, int, int) | ビルダーのデータを既存の配列位置にコピーします。 |
| [get_Capacity](./get_capacity/)() const | 文字列ビルダーの現在の容量を取得します。 |
| [get_Length](./get_length/)() const | ビルダー内の文字列の長さを取得します。 |
| [idx_get](./idx_get/)(int) const | 指定位置の文字を取得します。 |
| [idx_set](./idx_set/)(int, char_t) | 指定位置に文字を設定します。 |
| [Insert](./insert/)(int, const String\&) | 文字列をビルダーの固定位置に挿入します。 |
| [Insert](./insert/)(int32_t, const String\&, int32_t) | 繰り返し文字列をビルダーの固定位置に挿入します。 |
| [Insert](./insert/)(int, char_t) | 文字をビルダーの固定位置に挿入します。 |
| [Insert](./insert/)(int, const System::ArrayPtr\<char_t\>\&, int, int) | 文字列をビルダーの固定位置に挿入します。 |
| [Insert](./insert/)(int, T) | 値をビルダーの固定位置に挿入します。 |
| [operator[]](./operator[]/)(int) const | 指定位置の文字を取得します。 |
| [Remove](./remove/)(int, int) | ビルダーからフラグメントを削除します。 |
| [Replace](./replace/)(const String\&, const String\&) | ビルダーを通じて部分文字列を置換します。 |
| [Replace](./replace/)(const String\&, const String\&, int, int) | ビルダーの範囲を通じて部分文字列を置換します。 |
| [Replace](./replace/)(char_t, char_t) | ビルダーを通じて文字を置換します。 |
| [Replace](./replace/)(char_t, char_t, int, int) | ビルダーの範囲を通じて文字を置換します。 |
| [set_Capacity](./set_capacity/)(int) | 文字列ビルダーの現在の容量を設定します。 |
| [set_Length](./set_length/)(int) | 文字列ビルダーを指定された長さに切り詰めるか拡張します。 |
| [StringBuilder](./stringbuilder/)() | コンストラクタ。 |
| [StringBuilder](./stringbuilder/)(int) | コンストラクタ。 |
| [StringBuilder](./stringbuilder/)(const String\&) | コンストラクタ。 |
| [StringBuilder](./stringbuilder/)(const String\&, int) | コンストラクタ。 |
| [StringBuilder](./stringbuilder/)(const String\&, int, int, int) | コンストラクタ。 |
| [ToString](./tostring/)() const override | ビルダーに現在含まれている文字列を取得します。 |
| [ToString](./tostring/)(int, int) const | ビルダーに現在含まれている部分文字列を取得します。 |
| [~StringBuilder](./~stringbuilder/)() | デストラクタ。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
