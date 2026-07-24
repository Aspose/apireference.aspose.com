---
title: "System::Net::Http::StringContent クラス"
linktitle: "StringContent"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::StringContent クラス。HTTP コンテンツを文字列として表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。"
type: docs
weight: 1100
url: /ja/cpp/system.net.http/stringcontent/
---
## StringContent class


文字列として HTTP コンテンツを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

```cpp
class StringContent : public System::Net::Http::ByteArrayContent
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [StringContent](./stringcontent/)(String) | RTTI 情報。 |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>) | 新しいインスタンスを構築します。 |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>, String) | 新しいインスタンスを構築します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | デフォルトのエンコーディングです。 |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | バイト数の最大値です。 |
## 参照

* Class [ByteArrayContent](../bytearraycontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
