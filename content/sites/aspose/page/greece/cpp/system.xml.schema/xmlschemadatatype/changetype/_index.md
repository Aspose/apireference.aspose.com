---
title: "System::Xml::Schema::XmlSchemaDatatype::ChangeType method"
linktitle: "ChangeType"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaDatatype::ChangeType method. Μετατρέπει την καθορισμένη τιμή, του οποίου ο τύπος είναι μία από τις έγκυρες αναπαραστάσεις του τύπου σχήματος XML που αντιπροσωπεύεται από το XmlSchemaDatatype, στον τύπο χρόνου εκτέλεσης που καθορίζεται σε C++."
type: docs
weight: 100
url: /el/cpp/system.xml.schema/xmlschemadatatype/changetype/
---
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&) method


Μετατρέπει την καθορισμένη τιμή, του οποίου ο τύπος είναι μία από τις έγκυρες αναπαραστάσεις του τύπου σχήματος XML που αντιπροσωπεύεται από το [XmlSchemaDatatype](../), στον καθορισμένο τύπο χρόνου εκτέλεσης.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | SharedPtr\<Object\> | Η τιμή εισόδου για μετατροπή στον καθορισμένο τύπο. |
| targetType | const TypeInfo\& | Ο τύπος προορισμού για μετατροπή της τιμής εισόδου. |

### ReturnValue

Η μετατρεπόμενη τιμή εισόδου.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Μετατρέπει την καθορισμένη τιμή, του οποίου ο τύπος είναι μία από τις έγκυρες αναπαραστάσεις του τύπου σχήματος XML που αντιπροσωπεύεται από το [XmlSchemaDatatype](../), στον καθορισμένο τύπο χρόνου εκτέλεσης χρησιμοποιώντας το [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) εάν το [XmlSchemaDatatype](../) αντιπροσωπεύει τον τύπο **xs:QName** ή έναν τύπο που προέρχεται από αυτόν.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | SharedPtr\<Object\> | Η τιμή εισόδου για μετατροπή στον καθορισμένο τύπο. |
| targetType | const TypeInfo\& | Ο τύπος προορισμού για μετατροπή της τιμής εισόδου. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Ένα [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) που χρησιμοποιείται για την επίλυση προθεμάτων χώρου ονομάτων. Αυτό είναι χρήσιμο μόνο εάν το [XmlSchemaDatatype](../) αντιπροσωπεύει τον τύπο **xs:QName** ή έναν τύπο που προέρχεται από αυτόν. |

### ReturnValue

Η μετατρεπόμενη τιμή εισόδου.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
