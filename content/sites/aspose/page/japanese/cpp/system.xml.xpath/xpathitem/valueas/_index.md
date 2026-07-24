---
title: "System::Xml::XPath::XPathItem::ValueAs メソッド"
linktitle: "ValueAs"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathItem::ValueAs メソッド。C++ で項目の値を指定された型として返します。"
type: docs
weight: 1100
url: /ja/cpp/system.xml.xpath/xpathitem/valueas/
---
## XPathItem::ValueAs(const TypeInfo\&) method


項目の値を指定された型として返します。

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| returnType | const TypeInfo\& | 項目の値を返す型。 |

### ReturnValue

要求された型としての項目の値です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathItem::ValueAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


派生クラスでオーバーライドされた場合、名前空間プレフィックスを解決するために指定された [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) オブジェクトを使用して指定された型として項目の値を返します。

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| returnType | const TypeInfo\& | 項目の値を返す型。 |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | 名前空間プレフィックスを解決するために使用される [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) オブジェクトです。 |

### ReturnValue

要求された型としての項目の値です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
