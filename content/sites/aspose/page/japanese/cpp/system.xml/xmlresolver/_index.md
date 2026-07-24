---
title: "System::Xml::XmlResolver クラス"
linktitle: "XmlResolver"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlResolver クラス。C++ で、Uniform Resource Identifier (URI) によって名前付けされた外部 XML リソースを解決します。"
type: docs
weight: 3500
url: /ja/cpp/system.xml/xmlresolver/
---
## XmlResolver class


Uniform Resource Identifier (URI) で指定された外部 XML リソースを解決します。

```cpp
class XmlResolver : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) | 派生クラスでオーバーライドされた場合、URI を実際のリソースを含むオブジェクトにマップします。 |
| virtual [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) | 派生クラスでオーバーライドされた場合、基底 URI と相対 URI から絶対 URI を解決します。 |
| virtual [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) | 派生クラスでオーバーライドされた場合、Web 要求の認証に使用される資格情報を設定します。 |
| virtual [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) | リゾルバーが Stream 以外の型を返すことを可能にします。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
