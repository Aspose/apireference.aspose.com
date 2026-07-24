---
title: "System::Xml::XmlSecureResolver クラス"
linktitle: "XmlSecureResolver"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlSecureResolver クラス。C++ で XmlResolver オブジェクトをラップし、基礎となる XmlResolver がアクセスできるリソースを制限することで、別の XmlResolver 実装のセキュリティを強化します。"
type: docs
weight: 3600
url: /ja/cpp/system.xml/xmlsecureresolver/
---
## XmlSecureResolver class


別の実装の [XmlResolver](../xmlresolver/) をラップし、基礎となる [XmlResolver](../xmlresolver/) がアクセスできるリソースを制限することで、セキュリティを強化します。

```cpp
class XmlSecureResolver : public System::Xml::XmlResolver
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | URI を実際のリソースを含むオブジェクトにマッピングします。 |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | 基礎となる [XmlResolver](../xmlresolver/) で **ResolveUri** を呼び出すことにより、基底と相対 URI から絶対 URI を解決します。 |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Web リクエストの認証に使用される資格情報を設定します。 |
| [XmlSecureResolver](./xmlsecureresolver/)(const SharedPtr\<XmlResolver\>\&, const String\&) | 提供された [XmlResolver](../xmlresolver/) と URL を使用して、[XmlSecureResolver](./) クラスの新しいインスタンスを初期化します。 |
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
