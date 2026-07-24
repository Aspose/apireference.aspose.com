---
title: "System::Guid class"
linktitle: "Guid"
second_title: "C++ 用 Aspose.Page"
description: "System::Guid クラス。グローバルに一意な識別子 (GUID) を表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。C++ でこの型のオブジェクトを管理するために System::SmartPtr クラスを使用しないでください。"
type: docs
weight: 3000
url: /ja/cpp/system/guid/
---
## Guid class


グローバルに一意な識別子 (GUID) を表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。[System::SmartPtr](../smartptr/) クラスを使用してこの型のオブジェクトを管理しないでください。

```cpp
class Guid
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CompareTo](./compareto/)(const Guid\&) const | 現在のオブジェクトと指定されたオブジェクトが表す GUID の算術比較を実行します。 |
| [Equals](./equals/)(const Guid\&) const | 現在のオブジェクトと指定されたオブジェクトが表す GUID が等しいかどうかを判断します。 |
| [GetHashCode](./gethashcode/)() const | 現在のオブジェクトのハッシュコードを返します。 |
| [Guid](./guid/)() | すべてゼロの GUID を表すオブジェクトを作成します。 |
| [Guid](./guid/)(const ArrayPtr\<uint8_t\>\&) | 符号なし 8 ビット整数値の配列として指定された GUID を表すオブジェクトを作成します。 |
| [Guid](./guid/)(const System::Details::ArrayView\<uint8_t\>\&) | 符号なし 8 ビット整数値の配列ビューとして指定された GUID を表すオブジェクトを作成します。 |
| [Guid](./guid/)(const String\&) | 文字列として指定された GUID を表すオブジェクトを作成します。 |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const ArrayPtr\<uint8_t\>\&) | 指定された GUID コンポーネントから [Guid](./) クラスのインスタンスを作成します。 |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const System::Details::ArrayView\<uint8_t\>\&) | 指定された GUID コンポーネントから [Guid](./) クラスのインスタンスを作成します。 |
| [Guid](./guid/)(int32_t, int16_t, int16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | 指定された符号なし整数とバイトから [Guid](./) クラスのインスタンスを作成します。 |
| [Guid](./guid/)(uint32_t, uint16_t, uint16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | 指定された符号なし整数とバイトから [Guid](./) クラスのインスタンスを作成します。 |
| [Guid](./guid/)(const Guid\&) | 指定されたオブジェクトと同じ GUID を表すオブジェクトを作成します。 |
| static [NewGuid](./newguid/)() | 新しい GUID を生成し、それを表す [Guid](./) オブジェクトを返します。 |
| [operator!=](./operator!=/)(const Guid\&) const | 現在のオブジェクトと指定されたオブジェクトが表す GUID が等しくないかどうかを判断します。 |
| [operator=](./operator=/)(const Guid\&) | 指定された [Guid](./) オブジェクトが表す GUID の値を現在のオブジェクトに割り当てます。 |
| [operator==](./operator==/)(const Guid\&) const | 現在のオブジェクトと指定されたオブジェクトが表す GUID が等しいかどうかを判断します。 |
| static [Parse](./parse/)(const String\&) | GUID の指定された文字列表現を同等の [Guid](./) オブジェクトに変換します。 |
| [ToByteArray](./tobytearray/)() const | 現在のオブジェクトが表す GUID をバイト配列に変換します。 |
| [ToString](./tostring/)() const | 現在のオブジェクトが表す GUID を文字列表現に変換します。 |
| [ToString](./tostring/)(const String\&) const | 現在のオブジェクトが表す GUID を、指定された文字列形式を使用して文字列表現に変換します。 |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const | 現在のオブジェクトが表す GUID を、指定された文字列形式とカルチャーを使用して文字列表現に変換します。 |
| static [TryParse](./tryparse/)(const String\&, Guid\&) | 指定された文字列を [Guid](./) オブジェクトに変換しようとします。 |
| [~Guid](./~guid/)() | デストラクタ。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](./empty/) | 値が 0 の GUID を表します。 |
## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
