---
title: "System::IO::BinaryWriter クラス"
linktitle: "BinaryWriter"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::BinaryWriter クラス。プリミティブ型の値をバイトストリームに書き込むライターを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡してください。"
type: docs
weight: 900
url: /ja/cpp/system.io/binarywriter/
---
## BinaryWriter class


プリミティブ型の値をバイトストリームに書き込むライターを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。

```cpp
class BinaryWriter : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [BinaryWriter](./binarywriter/)(const StreamPtr\&, const EncodingPtr\&, bool) | 指定されたエンコーディングを使用して、指定されたストリームにデータを書き込む [BinaryWriter](./) クラスのインスタンスを構築します。 |
| [Close](./close/)() | 現在の [BinaryWriter](./) オブジェクトと基になる出力ストリームを閉じます。 |
| [Dispose](./dispose/)() override | 現在のオブジェクトが使用しているすべてのリソースを解放し、基になるストリームを閉じます。 |
| [Flush](./flush/)() | 出力ストリームをフラッシュします。 |
| [get_BaseStream](./get_basestream/)() | 出力ストリームを返します。 |
| [Seek](./seek/)(int, System::IO::SeekOrigin) | 現在のオブジェクトが表すストリームの位置を設定します。 |
| virtual [Write](./write/)(uint8_t) | 指定された符号なし 8 ビット整数値を出力ストリームに書き込みます。 |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int, int) | 指定されたバイト配列から指定されたバイトのサブレンジを出力ストリームに書き込みます。 |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int, int) | 指定された文字配列から指定された UTF-16 文字のサブレンジを出力ストリームに書き込みます。 |
| virtual [Write](./write/)(bool) | **value** が 'true' の場合は 0、**value** が 'false' の場合は 1 の単一バイトを出力ストリームに書き込みます。 |
| virtual [Write](./write/)(char16_t) | 指定された 16 ビット幅の文字値を出力ストリームに書き込みます。 |
| virtual [Write](./write/)(int16_t) | 指定された 16 ビット整数値を出力ストリームに書き込みます。 |
| virtual [Write](./write/)(int) | 指定された 32 ビット整数値を出力ストリームに書き込みます。 |
| virtual [Write](./write/)(int64_t) | 指定された 64 ビット整数値を出力ストリームに書き込みます。 |
| virtual [Write](./write/)(uint16_t) | 指定された符号なし 16 ビット整数値を出力ストリームに書き込みます。 |
| virtual [Write](./write/)(uint32_t) | 指定された符号なし 32 ビット整数値を出力ストリームに書き込みます。 |
| virtual [Write](./write/)(uint64_t) | 指定された符号なし 64 ビット整数値を出力ストリームに書き込みます。 |
| virtual [Write](./write/)(float) | 指定された単精度浮動小数点値を出力ストリームに書き込みます。 |
| virtual [Write](./write/)(double) | 指定された倍精度浮動小数点値を出力ストリームに書き込みます。 |
| virtual [Write](./write/)(const Decimal\&) | 指定された [Decimal](../../system/decimal/) 値のバイト表現を出力ストリームに書き込みます。 |
| virtual [Write](./write/)(const String\&) | 現在のエンコーディングで長さプレフィックス付き文字列を出力ストリームに書き込みます。 |
| virtual [Write](./write/)(const char_t *) | 現在のエンコーディングで長さプレフィックス付き文字列を出力ストリームに書き込みます。 |
| [~BinaryWriter](./~binarywriter/)() | デストラクタ。 |
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
