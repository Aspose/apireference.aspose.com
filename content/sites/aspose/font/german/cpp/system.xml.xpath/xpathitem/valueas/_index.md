---
title: "System::Xml::XPath::XPathItem::ValueAs Methode"
linktitle: "ValueAs"
second_title: "Aspose.Font für C++"
description: "System::Xml::XPath::XPathItem::ValueAs Methode. Gibt den Wert des Elements als den angegebenen Typ in C++ zurück."
type: docs
weight: 1100
url: /de/cpp/system.xml.xpath/xpathitem/valueas/
---
## XPathItem::ValueAs(const TypeInfo\&) method


Gibt den Wert des Elements als den angegebenen Typ zurück.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| returnType | const TypeInfo\& | Der Typ, in dem der Elementwert zurückgegeben werden soll. |

### ReturnValue

Der Wert des Elements im angeforderten Typ.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathItem::ValueAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Wenn in einer abgeleiteten Klasse überschrieben, gibt sie den Wert des Elements als den mit dem [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) Objekt angegebenen Typ zurück, das zur Auflösung von Namensraumpräfixen verwendet wird.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| returnType | const TypeInfo\& | Der Typ, in dem der Wert des Elements zurückgegeben werden soll. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | Das [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)-Objekt, das zum Auflösen von Namensraumpräfixen verwendet wird. |

### ReturnValue

Der Wert des Elements im angeforderten Typ.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
