---
title: "System::Net::Http::Headers::MediaTypeHeaderValue クラス"
linktitle: "MediaTypeHeaderValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::MediaTypeHeaderValue クラス。'Content-Type' ヘッダーの値としての MIME タイプを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 1200
url: /ja/cpp/system.net.http.headers/mediatypeheadervalue/
---
## MediaTypeHeaderValue class


'Content-Type' ヘッダーの値としての MIME タイプを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡すようにしてください。

```cpp
class MediaTypeHeaderValue : public virtual System::ICloneable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| [get_CharSet](./get_charset/)() | RTTI 情報。 |
| [get_MediaType](./get_mediatype/)() | メディアタイプヘッダーの値を取得します。 |
| [get_Parameters](./get_parameters/)() | メディアタイプヘッダーの値パラメータを返します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| static [GetMediaTypeLength](./getmediatypelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\>, System::SharedPtr\<MediaTypeHeaderValue\>\&) | 指定されたインデックスから渡された文字列を [MediaTypeHeaderValue](./) クラスのインスタンスに変換します。 |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)() | 新しいインスタンスを構築します。 |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)(String) | 新しいインスタンスを構築します。 |
| static [Parse](./parse/)(String) | 渡された文字列を [MediaTypeHeaderValue](./) クラスのインスタンスに変換します。 |
| [set_CharSet](./set_charset/)(String) | 文字セットを設定します。 |
| [set_MediaType](./set_mediatype/)(String) | メディアタイプヘッダーの値を設定します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeHeaderValue\>\&) | 渡された文字列を [MediaTypeHeaderValue](./) クラスのインスタンスに変換しようとします。 |
## 参照

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
