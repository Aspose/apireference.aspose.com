---
title: "System::Xml::Xsl::XslTransform κλάση"
linktitle: "XslTransform"
second_title: "Aspose.Page για C++"
description: "System::Xml::Xsl::XslTransform κλάση. Μετατρέπει δεδομένα XML χρησιμοποιώντας ένα φύλλο στυλ Extensible Stylesheet Language for Transformations (XSLT) σε C++."
type: docs
weight: 700
url: /el/cpp/system.xml.xsl/xsltransform/
---
## XslTransform class


Μετατρέπει δεδομένα XML χρησιμοποιώντας ένα φύλλο στυλ Extensible Stylesheet Language for Transformations (XSLT).

```cpp
class XslTransform : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | Φορτώνει το φύλλο στυλ XSLT που περιέχεται στο [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Φορτώνει το φύλλο στυλ XSLT που περιέχεται στο [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | Φορτώνει το φύλλο στυλ XSLT που περιέχεται στο IXPathNavigable. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Φορτώνει το φύλλο στυλ XSLT που περιέχεται στο IXPathNavigable. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) | Φορτώνει το φύλλο στυλ XSLT που περιέχεται στο XPathNavigator. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Φορτώνει το φύλλο στυλ XSLT που περιέχεται στο XPathNavigator. |
| [Load](./load/)(const String\&) | Φορτώνει το φύλλο στυλ XSLT που καθορίζεται από ένα URL. |
| [Load](./load/)(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Φορτώνει το φύλλο στυλ XSLT που καθορίζεται από ένα URL. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Ορίζει το [XmlResolver](../../system.xml/xmlresolver/) που χρησιμοποιείται για την επίλυση εξωτερικών πόρων όταν καλείται η μέθοδος [XslTransform::Transform](./transform/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Μετατρέπει τα δεδομένα XML στον XPathNavigator χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) | Μετατρέπει τα δεδομένα XML στον XPathNavigator χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Μετατρέπει τα δεδομένα XML στον XPathNavigator χρησιμοποιώντας τα καθορισμένα args και εξάγει το αποτέλεσμα σε ένα [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Μετατρέπει τα δεδομένα XML στον XPathNavigator χρησιμοποιώντας τα καθορισμένα args και εξάγει το αποτέλεσμα σε ένα [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Μετατρέπει τα δεδομένα XML στον XPathNavigator χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Μετατρέπει τα δεδομένα XML στον XPathNavigator χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Μετατρέπει τα δεδομένα XML στον XPathNavigator χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Μετατρέπει τα δεδομένα XML στον XPathNavigator χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Μετατρέπει τα δεδομένα XML στο IXPathNavigable χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) | Μετατρέπει τα δεδομένα XML στο IXPathNavigable χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Μετατρέπει τα δεδομένα XML στο IXPathNavigable χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Μετατρέπει τα δεδομένα XML στο IXPathNavigable χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Μετατρέπει τα δεδομένα XML στο IXPathNavigable χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Μετατρέπει τα δεδομένα XML στο IXPathNavigable χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Μετατρέπει τα δεδομένα XML στο IXPathNavigable χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Μετατρέπει τα δεδομένα XML στο IXPathNavigable χρησιμοποιώντας τα καθορισμένα **args** και εξάγει το αποτέλεσμα σε ένα [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Μετατρέπει τα δεδομένα XML στο αρχείο εισόδου και εξάγει το αποτέλεσμα σε ένα αρχείο εξόδου. |
| [Transform](./transform/)(const String\&, const String\&) | Μετατρέπει τα δεδομένα XML στο αρχείο εισόδου και εξάγει το αποτέλεσμα σε ένα αρχείο εξόδου. |
| [XslTransform](./xsltransform/)() | Αρχικοποιεί ένα νέο αντικείμενο της κλάσης [XslTransform](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
