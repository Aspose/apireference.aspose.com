---
title: "System::Xml::XPath::XPathNavigator::CheckValidity メソッド"
linktitle: "CheckValidity"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::CheckValidity メソッド。XPathNavigator の XML データが、C++ で提供された XML スキーマ定義言語 (XSD) スキーマに準拠しているかを検証します。"
type: docs
weight: 300
url: /ja/cpp/system.xml.xpath/xpathnavigator/checkvalidity/
---
## XPathNavigator::CheckValidity method


[XPathNavigator](../) の XML データが、提供された XML [Schema](../../../system.xml.schema/) 定義言語 (XSD) スキーマに準拠しているかを検証します。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::CheckValidity(SharedPtr<System::Xml::Schema::XmlSchemaSet> schemas, System::Xml::Schema::ValidationEventHandler validationEventHandler)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| schemas | SharedPtr\<System::Xml::Schema::XmlSchemaSet\> | XmlSchemaSet は、[XPathNavigator](../) に含まれる XML データを検証するために使用されるスキーマを含んでいます。 |
| validationEventHandler | System::Xml::Schema::ValidationEventHandler | スキーマ検証の警告とエラーに関する情報を受け取る ValidationEventHandler。 |

### ReturnValue

**true** if no schema validation errors occurred; otherwise, **false**.

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../../system.xml.schema/xmlschemaset/)
* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
