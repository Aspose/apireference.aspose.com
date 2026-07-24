---
title: "System::Xml::XPath::XPathItem::ValueAs μέθοδος"
linktitle: "ValueAs"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathItem::ValueAs μέθοδος. Επιστρέφει την τιμή του στοιχείου ως τον καθορισμένο τύπο σε C++."
type: docs
weight: 1100
url: /el/cpp/system.xml.xpath/xpathitem/valueas/
---
## XPathItem::ValueAs(const TypeInfo\&) method


Επιστρέφει την τιμή του στοιχείου ως τον καθορισμένο τύπο.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| returnType | const TypeInfo\& | Ο τύπος για να επιστραφεί η τιμή του στοιχείου. |

### ReturnValue

Η τιμή του στοιχείου ως ο ζητούμενος τύπος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathItem::ValueAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Όταν παρακαμφθεί σε μια παράγωγη κλάση, επιστρέφει την τιμή του στοιχείου ως τον τύπο που καθορίζεται χρησιμοποιώντας το αντικείμενο [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) που ορίζεται για την επίλυση προθεμάτων ονοματοχώρων.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| returnType | const TypeInfo\& | Ο τύπος για να επιστραφεί η τιμή του στοιχείου. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | Το αντικείμενο [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) που χρησιμοποιείται για την επίλυση προθεμάτων ονομάτων. |

### ReturnValue

Η τιμή του στοιχείου ως ο ζητούμενος τύπος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
