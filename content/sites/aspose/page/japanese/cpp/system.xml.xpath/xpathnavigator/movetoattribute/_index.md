---
title: "System::Xml::XPath::XPathNavigator::MoveToAttribute メソッド"
linktitle: "MoveToAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::MoveToAttribute メソッド。C++ で一致するローカル名と名前空間 URI を持つ属性へ XPathNavigator を移動します。"
type: docs
weight: 5100
url: /ja/cpp/system.xml.xpath/xpathnavigator/movetoattribute/
---
## XPathNavigator::MoveToAttribute method


一致するローカル名と名前空間 URI を持つ属性へ [XPathNavigator](../) を移動します。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToAttribute(String localName, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 属性のローカル名。 |
| namespaceURI | String | 属性の名前空間 URI。空の名前空間の場合は **nullptr**。 |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the attribute; otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 参照

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
