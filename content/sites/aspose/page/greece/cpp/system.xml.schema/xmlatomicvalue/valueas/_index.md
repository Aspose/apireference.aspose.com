---
title: "System::Xml::Schema::XmlAtomicValue::ValueAs method"
linktitle: "ValueAs"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlAtomicValue::ValueAs method. Επιστρέφει την τιμή του επικυρωμένου στοιχείου ή χαρακτηριστικού XML''s ως τον τύπο που καθορίζεται χρησιμοποιώντας το αντικείμενο IXmlNamespaceResolver που έχει οριστεί για την επίλυση προθεμάτων ονομάτων σε C++."
type: docs
weight: 1300
url: /el/cpp/system.xml.schema/xmlatomicvalue/valueas/
---
## XmlAtomicValue::ValueAs method


Επιστρέφει την τιμή του επικυρωμένου στοιχείου ή χαρακτηριστικού XML ως τον τύπο που καθορίζεται χρησιμοποιώντας το αντικείμενο [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) που έχει οριστεί για την επίλυση προθεμάτων ονομάτων.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlAtomicValue::ValueAs(const TypeInfo &type, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τύπος | const TypeInfo\& | Ο τύπος για την επιστροφή της τιμής του επικυρωμένου στοιχείου ή χαρακτηριστικού XML. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | Το αντικείμενο [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) που χρησιμοποιείται για την επίλυση προθεμάτων ονομάτων. |

### ReturnValue

Η τιμή του επικυρωμένου στοιχείου ή χαρακτηριστικού XML ως ο ζητούμενος τύπος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlAtomicValue](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
