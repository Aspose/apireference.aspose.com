---
title: "System::Xml::Xsl::XslCompiledTransform κλάση"
linktitle: "XslCompiledTransform"
second_title: "Aspose.Page για C++"
description: "System::Xml::Xsl::XslCompiledTransform κλάση. Μετατρέπει δεδομένα XML χρησιμοποιώντας ένα φύλλο στυλ XSLT σε C++."
type: docs
weight: 300
url: /el/cpp/system.xml.xsl/xslcompiledtransform/
---
## XslCompiledTransform class


Μετατρέπει δεδομένα XML χρησιμοποιώντας ένα φύλλο στυλ XSLT.

```cpp
class XslCompiledTransform : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_OutputSettings](./get_outputsettings/)() | Επιστρέφει ένα αντικείμενο [XmlWriterSettings](../../system.xml/xmlwritersettings/) που περιέχει τις πληροφορίες εξόδου που προέρχονται από το στοιχείο **xsl:output** του φύλλου στυλ. |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | Μεταγλωττίζει το φύλλο στυλ που περιέχεται στο [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | Μεταγλωττίζει το φύλλο στυλ XSLT που περιέχεται στο [XmlReader](../../system.xml/xmlreader/). Η [XmlResolver](../../system.xml/xmlresolver/) επιλύει τυχόν στοιχεία XSLT **import** ή **include** και οι ρυθμίσεις XSLT καθορίζουν τα δικαιώματα για το φύλλο στυλ. |
| [Load](./load/)(const String\&) | Φορτώνει και μεταγλωττίζει το φύλλο στυλ που βρίσκεται στο καθορισμένο URI. |
| [Load](./load/)(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | Φορτώνει και μεταγλωττίζει το φύλλο στυλ XSLT που καθορίζεται από το URI. Η [XmlResolver](../../system.xml/xmlresolver/) επιλύει τυχόν στοιχεία XSLT **import** ή **include** και οι ρυθμίσεις XSLT καθορίζουν τα δικαιώματα για το φύλλο στυλ. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | Μεταγλωττίζει το φύλλο στυλ που περιέχεται στο αντικείμενο IXPathNavigable. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) | Μεταγλωττίζει το φύλλο στυλ XSLT που περιέχεται στο IXPathNavigable. Το [XmlResolver](../../system.xml/xmlresolver/) επιλύει τυχόν στοιχεία XSLT **import** ή **include** και οι ρυθμίσεις XSLT καθορίζουν τα δικαιώματα για το φύλλο στυλ. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) | Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο IXPathNavigable και εξάγει τα αποτελέσματα σε έναν [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο IXPathNavigable και εξάγει τα αποτελέσματα σε έναν [XmlWriter](../../system.xml/xmlwriter/). Το [XsltArgumentList](../xsltargumentlist/) παρέχει πρόσθετα επιχειρήματα χρόνου εκτέλεσης. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο IXPathNavigable και εξάγει τα αποτελέσματα σε έναν TextWriter. Το [XsltArgumentList](../xsltargumentlist/) παρέχει πρόσθετα επιχειρήματα χρόνου εκτέλεσης. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο IXPathNavigable και εξάγει τα αποτελέσματα σε μια ροή. Το [XsltArgumentList](../xsltargumentlist/) παρέχει πρόσθετα επιχειρήματα χρόνου εκτέλεσης. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) | Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο [XmlReader](../../system.xml/xmlreader/) και εξάγει τα αποτελέσματα σε έναν [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο [XmlReader](../../system.xml/xmlreader/) και εξάγει τα αποτελέσματα σε έναν [XmlWriter](../../system.xml/xmlwriter/). Το [XsltArgumentList](../xsltargumentlist/) παρέχει πρόσθετα επιχειρήματα χρόνου εκτέλεσης. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο [XmlReader](../../system.xml/xmlreader/) και εξάγει τα αποτελέσματα σε έναν TextWriter. Το [XsltArgumentList](../xsltargumentlist/) παρέχει πρόσθετα επιχειρήματα χρόνου εκτέλεσης. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο [XmlReader](../../system.xml/xmlreader/) και εξάγει τα αποτελέσματα σε μια ροή. Το [XsltArgumentList](../xsltargumentlist/) παρέχει πρόσθετα επιχειρήματα χρόνου εκτέλεσης. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XmlWriter\>\&) | Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το URI και εξάγει τα αποτελέσματα σε έναν [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το URI και εξάγει τα αποτελέσματα σε έναν [XmlWriter](../../system.xml/xmlwriter/). Το [XsltArgumentList](../xsltargumentlist/) παρέχει πρόσθετα επιχειρήματα χρόνου εκτέλεσης. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το URI και εξάγει τα αποτελέσματα σε έναν TextWriter. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το URI και εξάγει τα αποτελέσματα σε μια ροή. Το [XsltArgumentList](../xsltargumentlist/) παρέχει πρόσθετα επιχειρήματα χρόνου εκτέλεσης. |
| [Transform](./transform/)(const String\&, const String\&) | Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το URI και εξάγει τα αποτελέσματα σε ένα αρχείο. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο [XmlReader](../../system.xml/xmlreader/) και εξάγει τα αποτελέσματα σε έναν [XmlWriter](../../system.xml/xmlwriter/). Το [XsltArgumentList](../xsltargumentlist/) παρέχει πρόσθετα επιχειρήματα χρόνου εκτέλεσης και το [XmlResolver](../../system.xml/xmlresolver/) επιλύει τη λειτουργία XSLT **document()**. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | Εκτελεί τη μετατροπή χρησιμοποιώντας το έγγραφο εισόδου που καθορίζεται από το αντικείμενο IXPathNavigable και εξάγει τα αποτελέσματα σε έναν [XmlWriter](../../system.xml/xmlwriter/). Το [XsltArgumentList](../xsltargumentlist/) παρέχει πρόσθετα επιχειρήματα χρόνου εκτέλεσης και το [XmlResolver](../../system.xml/xmlresolver/) επιλύει τη λειτουργία XSLT **document()**. |
| [XslCompiledTransform](./xslcompiledtransform/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XslCompiledTransform](./). |
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
