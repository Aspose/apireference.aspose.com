---
title: "System::Xml::Schema::XmlAtomicValue κλάση"
linktitle: "XmlAtomicValue"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlAtomicValue κλάση. Αντιπροσωπεύει την τυποποιημένη τιμή ενός επικυρωμένου στοιχείου ή χαρακτηριστικού XML. Η κλάση XmlAtomicValue δεν μπορεί να κληρονομηθεί σε C++."
type: docs
weight: 300
url: /el/cpp/system.xml.schema/xmlatomicvalue/
---
## XmlAtomicValue class


Αντιπροσωπεύει την τυποποιημένη τιμή ενός επικυρωμένου στοιχείου ή χαρακτηριστικού XML. Η κλάση [XmlAtomicValue](./) δεν μπορεί να κληρονομηθεί.

```cpp
class XmlAtomicValue : public System::Xml::XPath::XPathItem
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() | Επιστρέφει ένα αντίγραφο αυτού του αντικειμένου [XmlAtomicValue](./). |
| [get_IsNode](./get_isnode/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν το επικυρωμένο στοιχείο ή χαρακτηριστικό XML είναι κόμβος [XPath](../../system.xml.xpath/) ή ατομική τιμή. |
| [get_TypedValue](./get_typedvalue/)() override | Επιστρέφει το τρέχον επικυρωμένο στοιχείο ή χαρακτηριστικό XML ως ένα συσκευασμένο αντικείμενο του πιο κατάλληλου τύπου σύμφωνα με τον τύπο σχήματος του. |
| [get_Value](./get_value/)() override | Επιστρέφει την τιμή [String](../../system/string/) του επικυρωμένου στοιχείου ή χαρακτηριστικού XML. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | Επιστρέφει την τιμή του επικυρωμένου στοιχείου ή χαρακτηριστικού XML ως [Boolean](../../system/boolean/). |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | Επιστρέφει την τιμή του επικυρωμένου στοιχείου ή χαρακτηριστικού XML ως [DateTime](../../system/datetime/). |
| [get_ValueAsDouble](./get_valueasdouble/)() override | Επιστρέφει την τιμή του επικυρωμένου στοιχείου ή χαρακτηριστικού XML ως [Double](../../system/double/). |
| [get_ValueAsInt](./get_valueasint/)() override | Επιστρέφει την τιμή του επικυρωμένου στοιχείου ή χαρακτηριστικού XML ως [Int32](../../system/int32/). |
| [get_ValueAsLong](./get_valueaslong/)() override | Επιστρέφει την τιμή του επικυρωμένου στοιχείου ή χαρακτηριστικού XML ως [Int64](../../system/int64/). |
| [get_ValueType](./get_valuetype/)() override | Επιστρέφει τον τύπο του επικυρωμένου στοιχείου ή χαρακτηριστικού XML. |
| [get_XmlType](./get_xmltype/)() override | Επιστρέφει το [XmlSchemaType](../xmlschematype/) για το επικυρωμένο στοιχείο ή χαρακτηριστικό XML. |
| [ToString](./tostring/)() const override | Επιστρέφει την τιμή [String](../../system/string/) του επικυρωμένου στοιχείου ή χαρακτηριστικού XML. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | Επιστρέφει την τιμή του επικυρωμένου στοιχείου ή χαρακτηριστικού XML ως τον τύπο που καθορίζεται χρησιμοποιώντας το αντικείμενο [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) που έχει οριστεί για την επίλυση προθεμάτων ονοματοχώρου. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XPathItem](../../system.xml.xpath/xpathitem/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
