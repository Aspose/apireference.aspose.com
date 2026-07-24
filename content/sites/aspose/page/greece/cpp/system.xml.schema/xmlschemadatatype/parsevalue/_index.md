---
title: "System::Xml::Schema::XmlSchemaDatatype::ParseValue method"
linktitle: "ParseValue"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaDatatype::ParseValue method. Όταν αντικαθίσταται σε μια παράγωγη κλάση, επικυρώνει τη συγκεκριμένη συμβολοσειρά έναντι ενός ενσωματωμένου ή προσαρμοσμένου απλού τύπου σε C++."
type: docs
weight: 700
url: /el/cpp/system.xml.schema/xmlschemadatatype/parsevalue/
---
## XmlSchemaDatatype::ParseValue method


Όταν αντικαθίσταται σε μια παράγωγη κλάση, επικυρώνει το **string** που καθορίζεται έναντι ενός ενσωματωμένου ή προσαρμοσμένου απλού τύπου.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ParseValue(String s, SharedPtr<XmlNameTable> nameTable, SharedPtr<IXmlNamespaceResolver> nsmgr)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| s | String | Η **string** για επικύρωση έναντι του απλού τύπου. |
| nameTable | SharedPtr\<XmlNameTable\> | Το [XmlNameTable](../../../system.xml/xmlnametable/) που θα χρησιμοποιηθεί για ατομικοποίηση κατά την ανάλυση της **string** εάν αυτό το αντικείμενο [XmlSchemaDatatype](../) αντιπροσωπεύει τον τύπο **xs:NCName**. |
| nsmgr | SharedPtr\<IXmlNamespaceResolver\> | Το αντικείμενο [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) που θα χρησιμοποιηθεί κατά την ανάλυση της **string** εάν αυτό το αντικείμενο [XmlSchemaDatatype](../) αντιπροσωπεύει τον τύπο **xs:QName**. |

### ReturnValue

Ένα [Object](../../../system/object/) που μπορεί να μετατραπεί με ασφάλεια στον τύπο που επιστρέφεται από την κλήση [XmlSchemaDatatype::get_ValueType](../get_valuetype/).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
