---
title: "System::Xml::XPath::XPathNavigator::ValueAs メソッド"
linktitle: "ValueAs"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::ValueAs メソッド。C++ で名前空間プレフィックスを解決するために指定された IXmlNamespaceResolver オブジェクトを使用し、指定された Type として現在のノード''の値を返します。"
type: docs
weight: 8100
url: /ja/cpp/system.xml.xpath/xpathnavigator/valueas/
---
## XPathNavigator::ValueAs method


指定された Type として現在のノードの値を返します。名前空間プレフィックスを解決するために指定された [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) オブジェクトを使用します。

```cpp
SharedPtr<Object> System::Xml::XPath::XPathNavigator::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| returnType | const TypeInfo\& | 現在のノードの値を返す際の Type。 |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | 名前空間プレフィックスを解決するために使用される [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) オブジェクトです。 |

### ReturnValue

要求された Type としての現在のノードの値。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
