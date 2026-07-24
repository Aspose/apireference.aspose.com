---
title: "System::Xml::XPath::XPathExpression::SetContext メソッド"
linktitle: "SetContext"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathExpression::SetContext メソッド。派生クラスでオーバーライドされた場合、C++ における名前空間解決に使用する IXmlNamespaceResolver オブジェクトを指定します。"
type: docs
weight: 500
url: /ja/cpp/system.xml.xpath/xpathexpression/setcontext/
---
## XPathExpression::SetContext(SharedPtr\<IXmlNamespaceResolver\>) method


派生クラスでオーバーライドされた場合、名前空間解決に使用する [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) オブジェクトを指定します。

```cpp
virtual void System::Xml::XPath::XPathExpression::SetContext(SharedPtr<IXmlNamespaceResolver> nsResolver)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | 名前空間解決に使用するための [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) インターフェイスを実装するオブジェクトです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathExpression::SetContext(SharedPtr\<XmlNamespaceManager\>) method


派生クラスでオーバーライドされた場合、名前空間解決に使用する [XmlNamespaceManager](../../../system.xml/xmlnamespacemanager/) オブジェクトを指定します。

```cpp
virtual void System::Xml::XPath::XPathExpression::SetContext(SharedPtr<XmlNamespaceManager> nsManager)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| nsManager | SharedPtr\<XmlNamespaceManager\> | 名前空間解決に使用する [XmlNamespaceManager](../../../system.xml/xmlnamespacemanager/) オブジェクトです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNamespaceManager](../../../system.xml/xmlnamespacemanager/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
