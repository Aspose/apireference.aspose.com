---
title: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom μέθοδος"
linktitle: "IsDerivedFrom"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom μέθοδος. Επιστρέφει μια τιμή που υποδεικνύει αν ο καθορισμένος παράγωγος τύπος σχήματος προέρχεται από τον βασικό τύπο σχήματος που καθορίζεται σε C++."
type: docs
weight: 1700
url: /el/cpp/system.xml.schema/xmlschematype/isderivedfrom/
---
## XmlSchemaType::IsDerivedFrom method


Επιστρέφει μια τιμή που υποδεικνύει αν ο καθορισμένος παράγωγος τύπος σχήματος προέρχεται από τον καθορισμένο βασικό τύπο σχήματος.

```cpp
static bool System::Xml::Schema::XmlSchemaType::IsDerivedFrom(SharedPtr<XmlSchemaType> derivedType, const SharedPtr<XmlSchemaType> &baseType, XmlSchemaDerivationMethod except)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| derivedType | SharedPtr\<XmlSchemaType\> | Ο παράγωγος [XmlSchemaType](../) προς δοκιμή. |
| baseType | const SharedPtr\<XmlSchemaType\>\& | Ο βασικός [XmlSchemaType](../) για τη δοκιμή του παραγώγου [XmlSchemaType](../). |
| except | XmlSchemaDerivationMethod | Μία από τις τιμές του [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/) που αντιπροσωπεύει μια μέθοδο παράγωγης τύπου προς εξαίρεση από τη δοκιμή. |

### ReturnValue

**true** if the derived type is derived from the base type; otherwise, **false**.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaType](../)
* Enum [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/)
* Class [XmlSchemaType](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
