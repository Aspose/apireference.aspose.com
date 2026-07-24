---
title: "System::Drawing::Imaging::EncoderParameter クラス"
linktitle: "EncoderParameter"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Imaging::EncoderParameter クラス。画像エンコーダーに値を渡すために使用されるコンテナとして機能します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 600
url: /ja/cpp/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class


画像エンコーダーに値を渡すために使用されるコンテナとして機能します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class EncoderParameter : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [EncoderParameter](./encoderparameter/)() | [EncoderParameter](./) クラスの新しいインスタンスを作成します。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, uint8_t, bool) | [EncoderParameter](./) クラスの新しいインスタンスを作成します。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int16_t) | [EncoderParameter](./) クラスの新しいインスタンスを作成します。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t) | [EncoderParameter](./) クラスの新しいインスタンスを作成します。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t) | [EncoderParameter](./) クラスの新しいインスタンスを作成します。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t) | [EncoderParameter](./) クラスの新しいインスタンスを作成します（分数を表す）。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t, int64_t) | [EncoderParameter](./) クラスの新しいインスタンスを作成します（整数値の範囲を表す）。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t, int32_t, int32_t) | [EncoderParameter](./) クラスの新しいインスタンスを作成します（分数の範囲を表す）。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const String\&) | [EncoderParameter](./) クラスの新しいインスタンスを作成します。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<uint8_t\>\&, bool) | [EncoderParameter](./) クラスの新しいインスタンスを作成します（値の配列を表す）。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int16_t\>\&) | [EncoderParameter](./) クラスの新しいインスタンスを作成します（値の配列を表す）。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&) | [EncoderParameter](./) クラスの新しいインスタンスを作成します（値の配列を表す）。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | [EncoderParameter](./) クラスの新しいインスタンスを作成します（分数の配列を表す）。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&, const ArrayPtr\<int64_t\>\&) | [EncoderParameter](./) クラスの新しいインスタンスを作成します（整数の範囲の配列を表す）。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | 分数の範囲の配列を表す [EncoderParameter](./) クラスの新しいインスタンスを構築します。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int, EncoderParameterValueType, void *) | 指定されたバッファから読み取られる、指定された型の指定された数の値を表す [EncoderParameter](./) クラスの新しいインスタンスを構築します。 |
| [get_Encoder](./get_encoder/)() const | 現在の [EncoderParameter](./) オブジェクトに関連付けられた [Encoder](../encoder/) オブジェクトを返します。 |
| [get_NumberOfValues](./get_numberofvalues/)() const | 現在のオブジェクトが表す値の数を返します。 |
| [get_Type](./get_type/)() const | 現在のオブジェクトが表す値の型を返します。 |
| [set_Encoder](./set_encoder/)(const EncoderPtr\&) | 指定された [Encoder](../encoder/) オブジェクトを現在の [EncoderParameter](./) オブジェクトに関連付けます。 |
| [~EncoderParameter](./~encoderparameter/)() | デストラクタ。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
