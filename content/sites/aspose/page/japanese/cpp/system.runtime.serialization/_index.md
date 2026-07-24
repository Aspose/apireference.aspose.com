---
title: "System::Runtime::Serialization 名前空間"
linktitle: "System::Runtime::Serialization"
second_title: "C++ 用 Aspose.Page"
description: "C++ で System::Runtime::Serialization 名前空間を使用する方法。"
type: docs
weight: 5300
url: /ja/cpp/system.runtime.serialization/
---



## クラス

| クラス | 説明 |
| --- | --- |
| [FormatterConverter](./formatterconverter/) | [System::Runtime::Serialization::IFormatterConverter](./iformatterconverter/) インターフェイスの基本実装を表します。 |
| [IFormatterConverter](./iformatterconverter/) | [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) のインスタンスと、内部データの解析に最適なフォーマッタ提供クラスとの接続を提供します。 |
| [ISerializable](./iserializable/) | シリアライズ可能なオブジェクトのインターフェイスです。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。 |
| [SerializationInfo](./serializationinfo/) | シリアライズされたオブジェクトを表す名前付きフィールドの集合を保持します。実装されていません。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。 |
| [StreamingContext](./streamingcontext/) | StreamingContext を使用する翻訳クラスのコンパイルを可能にするダミークラスです。このクラスのインスタンスは [SmartPtr](../system/smartptr/) で管理しないでください。スタック上でのみ割り当てる必要があります。 |
