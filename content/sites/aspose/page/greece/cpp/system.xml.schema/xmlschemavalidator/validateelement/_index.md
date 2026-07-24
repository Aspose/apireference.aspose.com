---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateElement μέθοδος"
linktitle: "ValidateElement"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateElement μέθοδος. Επικυρώνει το στοιχείο στο τρέχον πλαίσιο σε C++."
type: docs
weight: 1700
url: /el/cpp/system.xml.schema/xmlschemavalidator/validateelement/
---
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


Επικυρώνει το στοιχείο στο τρέχον πλαίσιο.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | const String\& | Το τοπικό όνομα του στοιχείου που θα επικυρωθεί. |
| namespaceUri | const String\& | Το URI του ονοματοχώρου του στοιχείου που θα επικυρωθεί. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Ένα αντικείμενο [XmlSchemaInfo](../../xmlschemainfo/) του οποίου οι ιδιότητες ορίζονται μετά από επιτυχή επικύρωση του ονόματος του στοιχείου. Αυτή η παράμετρος μπορεί να είναι **nullptr**. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) method


Επικυρώνει το στοιχείο στο τρέχον πλαίσιο με τις καθορισμένες τιμές χαρακτηριστικών **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation** και **xsi:NoNamespaceSchemaLocation**.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo, const String &xsiType, const String &xsiNil, const String &xsiSchemaLocation, const String &xsiNoNamespaceSchemaLocation)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | const String\& | Το τοπικό όνομα του στοιχείου που θα επικυρωθεί. |
| namespaceUri | const String\& | Το URI του ονοματοχώρου του στοιχείου που θα επικυρωθεί. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Ένα αντικείμενο [XmlSchemaInfo](../../xmlschemainfo/) του οποίου οι ιδιότητες ορίζονται μετά από επιτυχή επικύρωση του ονόματος του στοιχείου. Αυτή η παράμετρος μπορεί να είναι **nullptr**. |
| xsiType | const String\& | Η τιμή του χαρακτηριστικού **xsi:Type** του στοιχείου. Αυτή η παράμετρος μπορεί να είναι **nullptr**. |
| xsiNil | const String\& | Η τιμή του χαρακτηριστικού **xsi:Nil** του στοιχείου. Αυτή η παράμετρος μπορεί να είναι **nullptr**. |
| xsiSchemaLocation | const String\& | Η τιμή του χαρακτηριστικού **xsi:SchemaLocation** του στοιχείου. Αυτή η παράμετρος μπορεί να είναι **nullptr**. |
| xsiNoNamespaceSchemaLocation | const String\& | Η τιμή του χαρακτηριστικού **xsi:NoNamespaceSchemaLocation** του στοιχείου. Αυτή η παράμετρος μπορεί να είναι **nullptr**. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
