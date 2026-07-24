---
title: "System::Xml::Serialization::XmlSerializer κλάση"
linktitle: "XmlSerializer"
second_title: "Aspose.Page για C++"
description: "System::Xml::Serialization::XmlSerializer κλάση. Εκτελεί σειριοποίηση και αποσειριοποίηση αντικειμένων σε και από έγγραφα XML. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 600
url: /el/cpp/system.xml.serialization/xmlserializer/
---
## XmlSerializer class


Εκτελεί σειριοποίηση και αποσειριοποίηση αντικειμένων σε και από έγγραφα XML. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class XmlSerializer : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [CanDeserialize](./candeserialize/)(System::SharedPtr\<XmlReader\>) | Ελέγχει αν ο συγκεκριμένος αναγνώστης βρίσκεται σε κατάσταση αποσειριοποίησης. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::Stream\>) | Αποσειριοποιεί έγγραφο XML σε αντικείμενο. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::TextReader\>) | Αποσειριοποιεί έγγραφο XML σε αντικείμενο. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>) | Αποσειριοποιεί έγγραφο XML σε αντικείμενο. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>, String) | Αποσειριοποιεί έγγραφο XML σε αντικείμενο. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>) | Σειριοποιεί το έγγραφο σε XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>) | Σειριοποιεί το έγγραφο σε XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>) | Σειριοποιεί το έγγραφο σε XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Σειριοποιεί το έγγραφο σε XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Σειριοποιεί το έγγραφο σε XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Σειριοποιεί το έγγραφο σε XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String) | Σειριοποιεί το έγγραφο σε XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String, String) | Σειριοποιεί το έγγραφο σε XML. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [EncodingNamespace](./encodingnamespace/) | Κωδικοποίηση ονόματος χώρου ονομάτων. |
| static [WsdlNamespace](./wsdlnamespace/) | RTTI. |
| static [WsdlTypesNamespace](./wsdltypesnamespace/) | Όνομα χώρου ονομάτων τύπων WSDL. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
