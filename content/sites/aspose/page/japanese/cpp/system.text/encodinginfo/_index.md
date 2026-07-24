---
title: "System::Text::EncodingInfo クラス"
linktitle: "EncodingInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::EncodingInfo クラス。エンコーディングに関する簡潔な情報です。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 1900
url: /ja/cpp/system.text/encodinginfo/
---
## EncodingInfo class


エンコーディングに関する簡潔な情報です。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class EncodingInfo : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [EncodingInfo](./encodinginfo/)(int, const String\&, const String\&) | コンストラクタ。 |
| [get_CodePage](./get_codepage/)() const | コードページ ID を取得します。 |
| [get_DisplayName](./get_displayname/)() const | ローカライズされた完全なエンコーディング名を取得します。 |
| [get_Name](./get_name/)() const | エンコーディングの短縮名を取得します。 |
| [GetEncoding](./getencoding/)() | 情報で記述されたエンコーディングを取得します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
