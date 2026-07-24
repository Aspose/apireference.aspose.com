---
title: "Μέθοδος System::Xml::XmlDocument::CreateXmlDeclaration"
linktitle: "CreateXmlDeclaration"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Xml::XmlDocument::CreateXmlDeclaration. Δημιουργεί έναν κόμβο XmlDeclaration με τις συγκεκριμένες τιμές σε C++."
type: docs
weight: 1600
url: /el/cpp/system.xml/xmldocument/createxmldeclaration/
---
## XmlDocument::CreateXmlDeclaration method


Δημιουργεί έναν κόμβο [XmlDeclaration](../../xmldeclaration/) με τις συγκεκριμένες τιμές.

```cpp
virtual SharedPtr<XmlDeclaration> System::Xml::XmlDocument::CreateXmlDeclaration(const String &version, const String &encoding, const String &standalone)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| έκδοση | const String\& | Η έκδοση πρέπει να είναι "1.0". |
| encoding | const String\& | Η τιμή του χαρακτηριστικού κωδικοποίησης. Αυτή είναι η κωδικοποίηση που χρησιμοποιείται όταν αποθηκεύετε το [XmlDocument](../) σε αρχείο ή ροή· επομένως, πρέπει να οριστεί σε μια συμβολοσειρά που υποστηρίζεται από την κλάση [Text::Encoding](../../../system.text/encoding/), διαφορετικά η λειτουργία "XmlDocument::Save(String)" αποτυγχάνει. Εάν είναι **nullptr** ή [String::Empty](../../../system/string/empty/), η μέθοδος [XmlDocument::Save](../save/) δεν γράφει χαρακτηριστικό κωδικοποίησης στην δήλωση XML και έτσι χρησιμοποιείται η προεπιλεγμένη κωδικοποίηση, UTF-8. |
| standalone | const String\& | Η τιμή πρέπει να είναι είτε "yes" είτε "no". Εάν είναι **nullptr** ή [String::Empty](../../../system/string/empty/), η μέθοδος [XmlDocument::Save](../save/) δεν γράφει χαρακτηριστικό standalone στην δήλωση XML. |

### ReturnValue

Ο νέος κόμβος [XmlDeclaration](../../xmldeclaration/).
## Παρατηρήσεις



Σημείωση: Εάν το [XmlDocument](../) αποθηκευτεί είτε σε TextWriter είτε σε [XmlTextWriter](../../xmltextwriter/), αυτή η τιμή κωδικοποίησης απορρίπτεται. Αντίθετα, χρησιμοποιείται η κωδικοποίηση του TextWriter ή του [XmlTextWriter](../../xmltextwriter/). Αυτό εξασφαλίζει ότι το XML που γράφεται μπορεί να αναγνωστεί ξανά χρησιμοποιώντας τη σωστή κωδικοποίηση.
## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDeclaration](../../xmldeclaration/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
