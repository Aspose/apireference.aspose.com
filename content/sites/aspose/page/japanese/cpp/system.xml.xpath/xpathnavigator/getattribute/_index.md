---
title: "System::Xml::XPath::XPathNavigator::GetAttribute メソッド"
linktitle: "GetAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::GetAttribute メソッド。指定されたローカル名と名前空間 URI を持つ属性の値を C++ で返します。"
type: docs
weight: 3800
url: /ja/cpp/system.xml.xpath/xpathnavigator/getattribute/
---
## XPathNavigator::GetAttribute method


指定されたローカル名と名前空間 URI を持つ属性の値を返します。

```cpp
virtual String System::Xml::XPath::XPathNavigator::GetAttribute(String localName, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 属性のローカル名です。**localName** は大文字と小文字を区別します。 |
| namespaceURI | String | 属性の名前空間 URI。 |

### ReturnValue

指定された属性の値を含む [String](../../../system/string/)；一致する属性が見つからない場合、または [XPathNavigator](../) が要素ノード上に位置していない場合は [String::Empty](../../../system/string/empty/) を返します。

## 参照

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
