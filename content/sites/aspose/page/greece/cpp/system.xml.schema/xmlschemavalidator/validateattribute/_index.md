---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute μέθοδος"
linktitle: "ValidateAttribute"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute μέθοδος. Επικυρώνει το όνομα του χαρακτηριστικού, το URI του ονόματος χώρου και την τιμή στο τρέχον πλαίσιο του στοιχείου σε C++."
type: docs
weight: 1600
url: /el/cpp/system.xml.schema/xmlschemavalidator/validateattribute/
---
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


Επικυρώνει το όνομα του χαρακτηριστικού, το URI του ονοματοχώρου και την τιμή στο τρέχον πλαίσιο στοιχείου.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, const String &attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | const String\& | Το τοπικό όνομα του χαρακτηριστικού προς επικύρωση. |
| namespaceUri | const String\& | Το URI του χώρου ονομάτων του χαρακτηριστικού προς επικύρωση. |
| attributeValue | const String\& | Η τιμή του χαρακτηριστικού προς επικύρωση. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Ένα αντικείμενο [XmlSchemaInfo](../../xmlschemainfo/) του οποίου οι ιδιότητες ορίζονται μετά από επιτυχή επικύρωση του χαρακτηριστικού. Αυτή η παράμετρος μπορεί να είναι **nullptr**. |

### ReturnValue

Η τιμή του επικυρωμένου χαρακτηριστικού.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) method


Επικυρώνει το όνομα του χαρακτηριστικού, το URI του ονοματοχώρου και την τιμή στο τρέχον πλαίσιο στοιχείου.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, XmlValueGetter attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | const String\& | Το τοπικό όνομα του χαρακτηριστικού προς επικύρωση. |
| namespaceUri | const String\& | Το URI του χώρου ονομάτων του χαρακτηριστικού προς επικύρωση. |
| attributeValue | XmlValueGetter | Μία [XmlValueGetter](../../xmlvaluegetter/) callback που χρησιμοποιείται για τη μεταφορά της τιμής του χαρακτηριστικού ως τύπο συμβατό με τον τύπο XML [Schema](../../) Definition Language (XSD) του χαρακτηριστικού. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Ένα αντικείμενο [XmlSchemaInfo](../../xmlschemainfo/) του οποίου οι ιδιότητες ορίζονται μετά από επιτυχή επικύρωση του χαρακτηριστικού. Αυτή η παράμετρος μπορεί να είναι **nullptr**. |

### ReturnValue

Η τιμή του επικυρωμένου χαρακτηριστικού.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Typedef [XmlValueGetter](../../xmlvaluegetter/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
