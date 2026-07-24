---
title: "System::IConvertible クラス"
linktitle: "IConvertible"
second_title: "C++ 用 Aspose.Page"
description: "System::IConvertible クラス。実装された参照型または値型の値を、同等の値を持つ共通言語ランタイム型に変換するメソッドを定義します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 3400
url: /ja/cpp/system/iconvertible/
---
## IConvertible class


実装された参照型または値型の値を、同等の値を持つ共通言語ランタイム型に変換するメソッドを定義します。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。

```cpp
class IConvertible : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() | このインスタンスの型コードを返します。 |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<System::IFormatProvider\>) | このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して同等の [Boolean](../boolean/) 値に変換します。 |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<System::IFormatProvider\>) | このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して同等の 8 ビット uint32_teger に変換します。 |
| virtual [ToChar](./tochar/)(System::SharedPtr\<System::IFormatProvider\>) | このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して同等の Unicode 文字に変換します。 |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<System::IFormatProvider\>) | このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して同等の [System::DateTime](../datetime/) に変換します。 |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<System::IFormatProvider\>) | このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して同等の [System::Decimal](../decimal/) 数値に変換します。 |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<System::IFormatProvider\>) | このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して同等の倍精度浮動小数点数に変換します。 |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<System::IFormatProvider\>) | このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して同等の 16 ビット符号付き整数に変換します。 |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<System::IFormatProvider\>) | このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して同等の 32 ビット符号付き整数に変換します。 |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<System::IFormatProvider\>) | このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して同等の 64 ビット符号付き整数に変換します。 |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<System::IFormatProvider\>) | このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して同等の 8 ビット符号付き整数に変換します。 |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<System::IFormatProvider\>) | このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して同等の単精度浮動小数点数に変換します。 |
| virtual [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して同等の [System::String](../string/) に変換します。 |
| virtual [ToString](./tostring/)() const | C# の [Object.ToString()](../object/tostring/) メソッドの類似です。カスタムオブジェクトを文字列に変換できるようにします。 |
| virtual [ToType](./totype/)(const TypeInfo\&, System::SharedPtr\<System::IFormatProvider\>) | このインスタンスの値を、指定された System::Type の [System::Object](../object/) に変換し、同等の値を持たせます。指定されたカルチャ固有の書式情報を使用します。 |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<System::IFormatProvider\>) | このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して同等の 16 ビット uint32_teger に変換します。 |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<System::IFormatProvider\>) | このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して、同等の 32 ビット uint32_teger に変換します。 |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<System::IFormatProvider\>) | このインスタンスの値を、指定されたカルチャ固有の書式情報を使用して、同等の 64 ビット uint32_teger に変換します。 |
## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
