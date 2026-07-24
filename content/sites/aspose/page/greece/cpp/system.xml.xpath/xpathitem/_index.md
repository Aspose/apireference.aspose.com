---
title: "System::Xml::XPath::XPathItem κλάση"
linktitle: "XPathItem"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathItem κλάση. Αντιπροσωπεύει ένα στοιχείο στο μοντέλο δεδομένων XQuery 1.0 και XPath 2.0 σε C++."
type: docs
weight: 400
url: /el/cpp/system.xml.xpath/xpathitem/
---
## XPathItem class


Αντιπροσωπεύει ένα στοιχείο στο XQuery 1.0 και [XPath](../) 2.0 [Data](../../system.data/) Model.

```cpp
class XPathItem : public virtual System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [get_IsNode](./get_isnode/)() | Όταν παρακαμφθεί σε μια κληρονομημένη κλάση, λαμβάνει μια τιμή που υποδεικνύει εάν το στοιχείο αντιπροσωπεύει έναν κόμβο [XPath](../) ή μια ατομική τιμή. |
| virtual [get_TypedValue](./get_typedvalue/)() | Όταν παρακαμφθεί σε μια κληρονομημένη κλάση, λαμβάνει το τρέχον στοιχείο ως ένα συσκευασμένο αντικείμενο του πιο κατάλληλου τύπου σύμφωνα με τον τύπο σχήματος του. |
| virtual [get_Value](./get_value/)() | Όταν παρακαμφθεί σε μια κληρονομημένη κλάση, λαμβάνει την τιμή **string** του στοιχείου. |
| virtual [get_ValueAsBoolean](./get_valueasboolean/)() | Όταν παρακαμφθεί σε μια κληρονομημένη κλάση, λαμβάνει την τιμή του στοιχείου ως [Boolean](../../system/boolean/). |
| virtual [get_ValueAsDateTime](./get_valueasdatetime/)() | Όταν παρακαμφθεί σε μια κληρονομημένη κλάση, λαμβάνει την τιμή του στοιχείου ως [DateTime](../../system/datetime/). |
| virtual [get_ValueAsDouble](./get_valueasdouble/)() | Όταν παρακαμφθεί σε μια κληρονομημένη κλάση, λαμβάνει την τιμή του στοιχείου ως [Double](../../system/double/). |
| virtual [get_ValueAsInt](./get_valueasint/)() | Όταν παρακαμφθεί σε μια κληρονομημένη κλάση, λαμβάνει την τιμή του στοιχείου ως [Int32](../../system/int32/). |
| virtual [get_ValueAsLong](./get_valueaslong/)() | Όταν παρακαμφθεί σε μια κληρονομημένη κλάση, λαμβάνει την τιμή του στοιχείου ως [Int64](../../system/int64/). |
| virtual [get_ValueType](./get_valuetype/)() | Όταν αντικαθίσταται σε μια παράγωγη κλάση, λαμβάνει τον τύπο του στοιχείου. |
| virtual [get_XmlType](./get_xmltype/)() | Όταν παρακαμφθεί σε μια κληρονομημένη κλάση, λαμβάνει το XmlSchemaType για το στοιχείο. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&) | Επιστρέφει την τιμή του στοιχείου ως τον καθορισμένο τύπο. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει την τιμή του στοιχείου ως τον τύπο που έχει καθοριστεί χρησιμοποιώντας το αντικείμενο [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) που ορίζεται για την επίλυση προθεμάτων ονομάτων χώρου. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
