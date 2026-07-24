---
title: "System::Xml::Resolvers::XmlPreloadedResolver class"
linktitle: "XmlPreloadedResolver"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Resolvers::XmlPreloadedResolver class. C++ で DTD や XML ストリームでキャッシュを事前に埋めるために使用されるクラスを表します。"
type: docs
weight: 100
url: /ja/cpp/system.xml.resolvers/xmlpreloadedresolver/
---
## XmlPreloadedResolver class


DTD または XML ストリームでキャッシュを事前に埋めるために使用されるクラスを表します。

```cpp
class XmlPreloadedResolver : public System::Xml::XmlResolver
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&) | バイト配列を [XmlPreloadedResolver](./) ストアに追加し、URI にマップします。同じ URI のマッピングが既にストアに存在する場合、既存のマッピングは上書きされます。 |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | バイト配列を [XmlPreloadedResolver](./) ストアに追加し、URI にマップします。同じ URI のマッピングが既にストアに存在する場合、既存のマッピングは上書きされます。 |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const SharedPtr\<IO::Stream\>\&) | ストリームを [XmlPreloadedResolver](./) ストアに追加し、URI にマップします。同じ URI のマッピングが既にストアに存在する場合、既存のマッピングは上書きされます。 |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const String\&) | 事前ロードされたデータを含む文字列を [XmlPreloadedResolver](./) ストアに追加し、URI にマップします。同じ URI のマッピングが既にストアに存在する場合、既存のマッピングは上書きされます。 |
| [get_PreloadedUris](./get_preloadeduris/)() | 事前ロードされた URI のコレクションを返します。 |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | URI を実際のリソースを含むオブジェクトにマッピングします。 |
| [Remove](./remove/)(const SharedPtr\<Uri\>\&) | URI に対応するデータを [XmlPreloadedResolver](./) から削除します。 |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | ベース URI と相対 URI から絶対 URI を解決します。 |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | 基盤となる [Net::WebRequest](../../system.net/webrequest/) の認証に使用される資格情報を設定します。 |
| [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) override | このリゾルバがストリーム以外の他の型をサポートしているかどうかを判定します。 |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)() | [XmlPreloadedResolver](./) クラスの新しいインスタンスを初期化します。 |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(XmlKnownDtds) | 指定された事前読み込み済みの既知 DTD を使用して、[XmlPreloadedResolver](./) クラスの新しいインスタンスを初期化します。 |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&) | 指定されたフォールバック リゾルバーを使用して、[XmlPreloadedResolver](./) クラスの新しいインスタンスを初期化します。 |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) | 指定されたフォールバック リゾルバーと事前読み込み済みの既知 DTD を使用して、[XmlPreloadedResolver](./) クラスの新しいインスタンスを初期化します。 |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) | 指定されたフォールバック リゾルバー、事前読み込み済みの既知 DTD、そして URI 等価比較子を使用して、[XmlPreloadedResolver](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlResolver](../../system.xml/xmlresolver/)
* Namespace [System::Xml::Resolvers](../)
* Library [Aspose.Page for C++](../../)
