---
title: "System::Xml::XmlDocument::CreateXmlDeclaration メソッド"
linktitle: "CreateXmlDeclaration"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlDocument::CreateXmlDeclaration メソッド。C++ で指定された値を持つ XmlDeclaration ノードを作成します。"
type: docs
weight: 1600
url: /ja/cpp/system.xml/xmldocument/createxmldeclaration/
---
## XmlDocument::CreateXmlDeclaration method


指定された値を持つ [XmlDeclaration](../../xmldeclaration/) ノードを作成します。

```cpp
virtual SharedPtr<XmlDeclaration> System::Xml::XmlDocument::CreateXmlDeclaration(const String &version, const String &encoding, const String &standalone)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バージョン | const String\& | バージョンは "1.0" である必要があります。 |
| encoding | const String\& | エンコーディング属性の値。このエンコーディングは、[XmlDocument](../) をファイルまたはストリームに保存する際に使用されます。そのため、[Text::Encoding](../../../system.text/encoding/) クラスでサポートされている文字列に設定する必要があり、そうでない場合は "XmlDocument::Save(String)" が失敗します。これが **nullptr** または [String::Empty](../../../system/string/empty/) の場合、[XmlDocument::Save](../save/) メソッドは XML 宣言にエンコーディング属性を書き込まず、デフォルトのエンコーディングである UTF-8 が使用されます。 |
| standalone | const String\& | 値は "yes" または "no" のいずれかである必要があります。これが **nullptr** または [String::Empty](../../../system/string/empty/) の場合、[XmlDocument::Save](../save/) メソッドは XML 宣言に standalone 属性を書き込みません。 |

### ReturnValue

新しい [XmlDeclaration](../../xmldeclaration/) ノード。
## 備考



注意: [XmlDocument](../) が TextWriter または [XmlTextWriter](../../xmltextwriter/) のいずれかに保存される場合、このエンコーディング値は破棄されます。その代わりに、TextWriter または [XmlTextWriter](../../xmltextwriter/) のエンコーディングが使用されます。これにより、書き出された XML を正しいエンコーディングで再度読み取ることができます。
## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDeclaration](../../xmldeclaration/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
