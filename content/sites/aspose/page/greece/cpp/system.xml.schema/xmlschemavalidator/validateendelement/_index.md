---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement μέθοδος"
linktitle: "ValidateEndElement"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement μέθοδος. Επαληθεύει εάν το κειμενικό περιεχόμενο του στοιχείου είναι έγκυρο σύμφωνα με τον τύπο δεδομένων του για στοιχεία με απλό περιεχόμενο, και επαληθεύει εάν το περιεχόμενο του τρέχοντος στοιχείου είναι πλήρες για στοιχεία με σύνθετο περιεχόμενο σε C++."
type: docs
weight: 1800
url: /el/cpp/system.xml.schema/xmlschemavalidator/validateendelement/
---
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&) method


Επαληθεύει εάν το κειμενικό περιεχόμενο του στοιχείου είναι έγκυρο σύμφωνα με τον τύπο δεδομένων του για στοιχεία με απλό περιεχόμενο, και επαληθεύει εάν το περιεχόμενο του τρέχοντος στοιχείου είναι πλήρες για στοιχεία με σύνθετο περιεχόμενο.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Ένα αντικείμενο [XmlSchemaInfo](../../xmlschemainfo/) του οποίου οι ιδιότητες ορίζονται μετά από επιτυχή επικύρωση του στοιχείου. Αυτή η παράμετρος μπορεί να είναι **nullptr**. |

### ReturnValue

Η αναλυμένη, τυποποιημένη τιμή κειμένου του στοιχείου εάν το στοιχείο έχει απλό περιεχόμενο.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) method


Επαληθεύει εάν το κειμενικό περιεχόμενο του καθορισμένου στοιχείου είναι έγκυρο σύμφωνα με τον τύπο δεδομένων του.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo, const SharedPtr<Object> &typedValue)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Ένα αντικείμενο [XmlSchemaInfo](../../xmlschemainfo/) του οποίου οι ιδιότητες ορίζονται μετά από επιτυχή επικύρωση του κειμενικού περιεχομένου του στοιχείου. Αυτή η παράμετρος μπορεί να είναι **nullptr**. |
| typedValue | const SharedPtr\<Object\>\& | Το τυποποιημένο κειμενικό περιεχόμενο του στοιχείου. |

### ReturnValue

Το αναλυμένο, τυποποιημένο απλό περιεχόμενο του στοιχείου.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
