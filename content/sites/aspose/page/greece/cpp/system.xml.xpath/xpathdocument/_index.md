---
title: "System::Xml::XPath::XPathDocument κλάση"
linktitle: "XPathDocument"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathDocument κλάση. Παρέχει μια γρήγορη, μόνο για ανάγνωση, αναπαράσταση στη μνήμη ενός εγγράφου XML χρησιμοποιώντας το μοντέλο δεδομένων XPath σε C++."
type: docs
weight: 200
url: /el/cpp/system.xml.xpath/xpathdocument/
---
## XPathDocument class


Παρέχει μια γρήγορη, μόνο για ανάγνωση, αναπαράσταση στη μνήμη ενός εγγράφου XML χρησιμοποιώντας το μοντέλο δεδομένων [XPath](../).

```cpp
class XPathDocument : public System::Xml::XPath::IXPathNavigable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CreateNavigator](./createnavigator/)() override | Αρχικοποιεί ένα αντικείμενο μόνο για ανάγνωση [XPathNavigator](../xpathnavigator/) για πλοήγηση μέσω των κόμβων σε αυτό το [XPathDocument](./). |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&) | Αρχικοποιεί μια νέα παρουσία της κλάσης [XPathDocument](./) από τα δεδομένα XML που περιέχονται στο καθορισμένο αντικείμενο [XmlReader](../../system.xml/xmlreader/). |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&, XmlSpace) | Αρχικοποιεί μια νέα παρουσία της κλάσης [XPathDocument](./) από τα δεδομένα XML που περιέχονται στο καθορισμένο αντικείμενο [XmlReader](../../system.xml/xmlreader/) με τον καθορισμένο χειρισμό λευκών διαστημάτων. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::TextReader\>\&) | Αρχικοποιεί μια νέα παρουσία της κλάσης [XPathDocument](./) από τα δεδομένα XML που περιέχονται στο καθορισμένο αντικείμενο TextReader. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::Stream\>\&) | Αρχικοποιεί μια νέα παρουσία της κλάσης [XPathDocument](./) από τα δεδομένα XML στο καθορισμένο αντικείμενο Stream. |
| [XPathDocument](./xpathdocument/)(const String\&) | Αρχικοποιεί μια νέα παρουσία της κλάσης [XPathDocument](./) από τα δεδομένα XML στο καθορισμένο αρχείο. |
| [XPathDocument](./xpathdocument/)(const String\&, XmlSpace) | Αρχικοποιεί μια νέα παρουσία της κλάσης [XPathDocument](./) από τα δεδομένα XML στο αρχείο που καθορίζεται με τον καθορισμένο χειρισμό λευκών διαστημάτων. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [IXPathNavigable](../ixpathnavigable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
