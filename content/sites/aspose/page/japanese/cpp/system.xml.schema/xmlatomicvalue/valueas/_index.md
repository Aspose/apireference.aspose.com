---
title: "System::Xml::Schema::XmlAtomicValue::ValueAs method"
linktitle: "ValueAs"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlAtomicValue::ValueAs method. C++ で名前空間プレフィックスを解決するために指定された IXmlNamespaceResolver オブジェクトを使用して、指定された型として検証されたXML要素または属性の値を返します。"
type: docs
weight: 1300
url: /ja/cpp/system.xml.schema/xmlatomicvalue/valueas/
---
## XmlAtomicValue::ValueAs method


検証されたXML要素または属性の値を、名前空間プレフィックスを解決するために指定された [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) オブジェクトを使用して指定された型として返します。

```cpp
SharedPtr<Object> System::Xml::Schema::XmlAtomicValue::ValueAs(const TypeInfo &type, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 型 | const TypeInfo\& | 検証されたXML要素または属性の値を返す型です。 |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | 名前空間プレフィックスを解決するために使用される [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) オブジェクトです。 |

### ReturnValue

検証された XML 要素または属性の、要求された型としての値。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlAtomicValue](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
