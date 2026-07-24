---
title: "System::Xml::XmlUrlResolver クラス"
linktitle: "XmlUrlResolver"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlUrlResolver クラス。C++ で Uniform Resource Identifier (URI) によって名前付けされた外部 XML リソースを解決します。"
type: docs
weight: 4100
url: /ja/cpp/system.xml/xmlurlresolver/
---
## XmlUrlResolver class


Uniform Resource Identifier (URI) で指定された外部 XML リソースを解決します。

```cpp
class XmlUrlResolver : public System::Xml::XmlResolver
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | URI を実際のリソースを含むオブジェクトにマッピングします。 |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | ベース URI と相対 URI から絶対 URI を解決します。 |
| [set_CachePolicy](./set_cachepolicy/)(const SharedPtr\<Net::Cache::RequestCachePolicy\>\&) | 基になる WebRequest オブジェクトのキャッシュ ポリシーを設定します。 |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Web リクエストの認証に使用される資格情報を設定します。 |
| [set_Proxy](./set_proxy/)(const SharedPtr\<Net::IWebProxy\>\&) | 基になる WebRequest オブジェクトのネットワーク プロキシを設定します。 |
| [XmlUrlResolver](./xmlurlresolver/)() | [XmlUrlResolver](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlResolver](../xmlresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
