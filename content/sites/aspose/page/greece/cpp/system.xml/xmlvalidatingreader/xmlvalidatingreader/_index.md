---
title: "System::Xml::XmlValidatingReader::XmlValidatingReader constructor"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlValidatingReader::XmlValidatingReader constructor. Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης XmlValidatingReader με τις καθορισμένες τιμές σε C++."
type: docs
weight: 100
url: /el/cpp/system.xml/xmlvalidatingreader/xmlvalidatingreader/
---
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlValidatingReader](../) με τις καθορισμένες τιμές.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | Το stream που περιέχει το τμήμα XML για ανάλυση. |
| fragType | XmlNodeType | Το [XmlNodeType](../../xmlnodetype/) του τμήματος XML. Αυτό καθορίζει τι μπορεί να περιέχει το τμήμα (δείτε τον παρακάτω πίνακα). |
| context | const SharedPtr\<XmlParserContext\>\& | Το [XmlParserContext](../../xmlparsercontext/) στο οποίο θα αναλυθεί το τμήμα XML. Αυτό περιλαμβάνει το [XmlNameTable](../../xmlnametable/) που θα χρησιμοποιηθεί, την κωδικοποίηση, το πεδίο ονομάτων, το τρέχον **xml:lang** και το πεδίο **xml:space**. |
## Παρατηρήσεις



Ο παρακάτω πίνακας παραθέτει τις έγκυρες τιμές για **fragType** και πώς ο αναγνώστης επεξεργάζεται κάθε διαφορετικό τύπο κόμβου. |||
|-|-|
| XmlNodeType | Το τμήμα μπορεί να περιέχει |
| Element | Οποιοδήποτε έγκυρο περιεχόμενο στοιχείου (π.χ., οποιοσδήποτε συνδυασμός στοιχείων, σχολίων, οδηγιών επεξεργασίας, cdata, κειμένου και αναφορών οντοτήτων). |
| Attribute | Η τιμή ενός χαρακτηριστικού (το τμήμα μέσα στα εισαγωγικά). |
| Document | Το περιεχόμενο ολόκληρου εγγράφου XML· αυτό επιβάλλει κανόνες επιπέδου εγγράφου. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<XmlReader\>\&) constructor


Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlValidatingReader](../) που επικυρώνει το περιεχόμενο που επιστρέφεται από το δεδομένο [XmlReader](../../xmlreader/).

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<XmlReader> &reader)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| reader | const SharedPtr\<XmlReader\>\& | Ο [XmlReader](../../xmlreader/) για ανάγνωση κατά την επικύρωση. Η τρέχουσα υλοποίηση υποστηρίζει μόνο το [XmlTextReader](../../xmltextreader/). |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlValidatingReader](../) με τις καθορισμένες τιμές.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| xmlFragment | const String\& | Η συμβολοσειρά που περιέχει το απόσπασμα XML προς ανάλυση. |
| fragType | XmlNodeType | Ο [XmlNodeType](../../xmlnodetype/) του τμήματος XML. Αυτό επίσης καθορίζει τι μπορεί να περιέχει η συμβολοσειρά του τμήματος (δείτε τον παρακάτω πίνακα). |
| context | const SharedPtr\<XmlParserContext\>\& | Το [XmlParserContext](../../xmlparsercontext/) στο οποίο θα αναλυθεί το τμήμα XML. Αυτό περιλαμβάνει το [NameTable](../../nametable/) που θα χρησιμοποιηθεί, την κωδικοποίηση, το πεδίο ονομάτων, το τρέχον **xml:lang** και το **xml:space**. |
## Παρατηρήσεις



Ο παρακάτω πίνακας παραθέτει τις έγκυρες τιμές για **fragType** και πώς ο αναγνώστης επεξεργάζεται κάθε διαφορετικό τύπο κόμβου. |||
|-|-|
| XmlNodeType | Το τμήμα μπορεί να περιέχει |
| Element | Οποιοδήποτε έγκυρο περιεχόμενο στοιχείου (π.χ., οποιοσδήποτε συνδυασμός στοιχείων, σχολίων, οδηγιών επεξεργασίας, cdata, κειμένου και αναφορών οντοτήτων). |
| Attribute | Η τιμή ενός χαρακτηριστικού (το τμήμα μέσα στα εισαγωγικά). |
| Document | Το περιεχόμενο ολόκληρου εγγράφου XML· αυτό επιβάλλει κανόνες επιπέδου εγγράφου. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
