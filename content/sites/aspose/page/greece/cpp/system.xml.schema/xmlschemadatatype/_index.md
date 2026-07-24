---
title: "System::Xml::Schema::XmlSchemaDatatype κλάση"
linktitle: "XmlSchemaDatatype"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaDatatype κλάση. Η κλάση XmlSchemaDatatype είναι μια αφηρημένη κλάση για τη χαρτογράφηση των τύπων της γλώσσας ορισμού XML Schema (XSD) σε τύπους χρόνου εκτέλεσης σε C++."
type: docs
weight: 2400
url: /el/cpp/system.xml.schema/xmlschemadatatype/
---
## XmlSchemaDatatype class


Η κλάση [XmlSchemaDatatype](./) είναι μια αφηρημένη κλάση για τη χαρτογράφηση των τύπων της XML [Schema](../) γλώσσας ορισμού (XSD) σε τύπους χρόνου εκτέλεσης.

```cpp
class XmlSchemaDatatype : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&) | Μετατρέπει την καθορισμένη τιμή, της οποίας ο τύπος είναι μία από τις έγκυρες αναπαραστάσεις του τύπου σχήματος XML που αντιπροσωπεύεται από το [XmlSchemaDatatype](./), στον καθορισμένο τύπο χρόνου εκτέλεσης. |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Μετατρέπει την καθορισμένη τιμή, της οποίας ο τύπος είναι μία από τις έγκυρες αναπαραστάσεις του τύπου σχήματος XML που αντιπροσωπεύεται από το [XmlSchemaDatatype](./), στον καθορισμένο τύπο χρόνου εκτέλεσης χρησιμοποιώντας το [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) εάν το [XmlSchemaDatatype](./) αντιπροσωπεύει τον τύπο **xs:QName** ή έναν τύπο που προέρχεται από αυτόν. |
| virtual [get_TokenizedType](./get_tokenizedtype/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, λαμβάνει τον τύπο για το **string** όπως ορίζεται στην Παγκόσμια [Web](../../system.web/) Consortium (W3C) προδιαγραφή XML 1.0. |
| virtual [get_TypeCode](./get_typecode/)() | Επιστρέφει την τιμή [XmlTypeCode](../xmltypecode/) για τον απλό τύπο. |
| virtual [get_ValueType](./get_valuetype/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, λαμβάνει τον τύπο του στοιχείου. |
| virtual [get_Variety](./get_variety/)() | Επιστρέφει την τιμή [XmlSchemaDatatypeVariety](../xmlschemadatatypevariety/) για τον απλό τύπο. |
| virtual [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaDatatype\>) | Αυτή η μέθοδος πάντα επιστρέφει **false**. |
| virtual [ParseValue](./parsevalue/)(String, SharedPtr\<XmlNameTable\>, SharedPtr\<IXmlNamespaceResolver\>) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επικυρώνει το **string** που καθορίζεται έναντι ενός ενσωματωμένου ή προσαρμοσμένου απλού τύπου. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
