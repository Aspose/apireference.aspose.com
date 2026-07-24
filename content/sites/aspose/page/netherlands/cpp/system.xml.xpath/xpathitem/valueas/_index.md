---
title: "System::Xml::XPath::XPathItem::ValueAs method"
linktitle: "ValueAs"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XPath::XPathItem::ValueAs method. Retourneert de waarde van het item als het opgegeven type in C++."
type: docs
weight: 1100
url: /nl/cpp/system.xml.xpath/xpathitem/valueas/
---
## XPathItem::ValueAs(const TypeInfo\&) method


Retourneert de waarde van het item als het opgegeven type.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| returnType | const TypeInfo\& | Het type om de itemwaarde als terug te geven. |

### ReturnValue

De waarde van het item als het gevraagde type.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathItem::ValueAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Wanneer overschreven in een afgeleide klasse, retourneert de waarde van het item als het opgegeven type met behulp van het [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) object dat is opgegeven om namespace‑prefixen op te lossen.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| returnType | const TypeInfo\& | Het type om de waarde van het item als terug te geven. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | Het [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)-object dat wordt gebruikt om namespace‑prefixen op te lossen. |

### ReturnValue

De waarde van het item als het gevraagde type.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
