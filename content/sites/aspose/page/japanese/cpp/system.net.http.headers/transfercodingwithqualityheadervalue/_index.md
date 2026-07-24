---
title: "System::Net::Http::Headers::TransferCodingWithQualityHeaderValue クラス"
linktitle: "TransferCodingWithQualityHeaderValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::TransferCodingWithQualityHeaderValue クラス。''Accept-Encoding'' ヘッダーの追加の品質を持つ値を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として渡すようにしてください。"
type: docs
weight: 2500
url: /ja/cpp/system.net.http.headers/transfercodingwithqualityheadervalue/
---
## TransferCodingWithQualityHeaderValue class


''Accept-Encoding'' ヘッダーの追加の品質を持つ値を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

```cpp
class TransferCodingWithQualityHeaderValue : public System::Net::Http::Headers::TransferCodingHeaderValue
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Quality](./get_quality/)() | RTTI 情報。 |
| static [Parse](./parse/)(String) | 渡された文字列を [TransferCodingWithQualityHeaderValue](./) クラスのインスタンスに変換します。 |
| [set_Quality](./set_quality/)(Nullable\<double\>) | 'Accept-Encoding' ヘッダーの品質値を設定します。 |
| [TransferCodingWithQualityHeaderValue](./transfercodingwithqualityheadervalue/)() | 新しいインスタンスを構築します。 |
| [TransferCodingWithQualityHeaderValue](./transfercodingwithqualityheadervalue/)(String) | 新しいインスタンスを構築します。 |
| [TransferCodingWithQualityHeaderValue](./transfercodingwithqualityheadervalue/)(String, double) | 新しいインスタンスを構築します。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<TransferCodingWithQualityHeaderValue\>\&) | 渡された文字列を [TransferCodingWithQualityHeaderValue](./) クラスのインスタンスに変換しようとします。 |
## 参照

* Class [TransferCodingHeaderValue](../transfercodingheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
