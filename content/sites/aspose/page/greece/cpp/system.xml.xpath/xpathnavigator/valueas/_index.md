---
title: "System::Xml::XPath::XPathNavigator::ValueAs μέθοδος"
linktitle: "ValueAs"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathNavigator::ValueAs μέθοδος. Επιστρέφει την τιμή του τρέχοντος κόμβου ως τον καθορισμένο Type, χρησιμοποιώντας το αντικείμενο IXmlNamespaceResolver που καθορίζεται για την επίλυση προθεμάτων ονομάτων χώρου σε C++."
type: docs
weight: 8100
url: /el/cpp/system.xml.xpath/xpathnavigator/valueas/
---
## XPathNavigator::ValueAs method


Επιστρέφει την τιμή του τρέχοντος κόμβου ως τον καθορισμένο Type, χρησιμοποιώντας το αντικείμενο [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) που καθορίζεται για την επίλυση προθεμάτων ονομάτων χώρου.

```cpp
SharedPtr<Object> System::Xml::XPath::XPathNavigator::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| returnType | const TypeInfo\& | Ο Type για να επιστραφεί η τιμή του τρέχοντος κόμβου. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | Το αντικείμενο [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) που χρησιμοποιείται για την επίλυση προθεμάτων ονομάτων. |

### ReturnValue

Η τιμή του τρέχοντος κόμβου ως ο ζητούμενος Type.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
