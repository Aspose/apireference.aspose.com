---
title: "Κατασκευαστής System::Xml::XmlTextWriter::XmlTextWriter"
linktitle: "XmlTextWriter"
second_title: "Aspose.Page για C++"
description: "Κατασκευαστής System::Xml::XmlTextWriter::XmlTextWriter. Δημιουργεί μια παρουσία της κλάσης XmlTextWriter χρησιμοποιώντας το καθορισμένο ρεύμα και κωδικοποίηση σε C++."
type: docs
weight: 100
url: /el/cpp/system.xml/xmltextwriter/xmltextwriter/
---
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) constructor


Δημιουργεί μια παρουσία της κλάσης [XmlTextWriter](../) χρησιμοποιώντας το καθορισμένο ρεύμα και κωδικοποίηση.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::Stream> &w, const SharedPtr<Text::Encoding> &encoding)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| w | const SharedPtr\<IO::Stream\>\& | Το ρεύμα στο οποίο θέλετε να γράψετε. |
| encoding | const SharedPtr\<Text::Encoding\>\& | Η κωδικοποίηση για δημιουργία. Εάν η κωδικοποίηση είναι **nullptr**, γράφει το ρεύμα ως UTF-8 και παραλείπει το χαρακτηριστικό κωδικοποίησης από το **ProcessingInstruction**. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::TextWriter\>\&) constructor


Δημιουργεί μια παρουσία της κλάσης [XmlTextWriter](../) χρησιμοποιώντας το καθορισμένο TextWriter.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::TextWriter> &w)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| w | const SharedPtr\<IO::TextWriter\>\& | Ο TextWriter για εγγραφή. Υποτίθεται ότι ο TextWriter έχει ήδη οριστεί στην σωστή κωδικοποίηση. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextWriter::XmlTextWriter(const String\&, const SharedPtr\<Text::Encoding\>\&) constructor


Δημιουργεί μια παρουσία της κλάσης [XmlTextWriter](../) χρησιμοποιώντας το καθορισμένο αρχείο.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const String &filename, const SharedPtr<Text::Encoding> &encoding)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| filename | const String\& | Το όνομα αρχείου για εγγραφή. Εάν το αρχείο υπάρχει, το περικόπτει και το αντικαθιστά με το νέο περιεχόμενο. |
| encoding | const SharedPtr\<Text::Encoding\>\& | Η κωδικοποίηση για δημιουργία. Εάν η κωδικοποίηση είναι **nullptr**, γράφει το αρχείο ως UTF-8 και παραλείπει το χαρακτηριστικό κωδικοποίησης από το **ProcessingInstruction**. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
