---
title: "System::Xml::XmlWriter::Create μέθοδος"
linktitle: "Δημιουργία"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlWriter::Create μέθοδος. Δημιουργεί ένα νέο αντικείμενο XmlWriter χρησιμοποιώντας το καθορισμένο stream σε C++."
type: docs
weight: 3700
url: /el/cpp/system.xml/xmlwriter/create/
---
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&) method


Δημιουργεί ένα νέο παράδειγμα [XmlWriter](../) χρησιμοποιώντας τη συγκεκριμένη ροή.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | Η ροή στην οποία θέλετε να γράψετε. Το [XmlWriter](../) γράφει σύνταξη κειμένου XML 1.0 και την προσθέτει στην καθορισμένη ροή. |

### ReturnValue

Ένα αντικείμενο [XmlWriter](../).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) method


Δημιουργεί ένα νέο παράδειγμα [XmlWriter](../) χρησιμοποιώντας τη ροή και το αντικείμενο [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | Η ροή στην οποία θέλετε να γράψετε. Το [XmlWriter](../) γράφει σύνταξη κειμένου XML 1.0 και την προσθέτει στην καθορισμένη ροή. |
| settings | SharedPtr\<XmlWriterSettings\> | Το αντικείμενο [XmlWriterSettings](../../xmlwritersettings/) που χρησιμοποιείται για τη διαμόρφωση του νέου παραδείγματος [XmlWriter](../). Εάν είναι **nullptr**, χρησιμοποιείται ένα [XmlWriterSettings](../../xmlwritersettings/) με προεπιλεγμένες ρυθμίσεις. Εάν το [XmlWriter](../) χρησιμοποιείται με τη μέθοδο XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), θα πρέπει να χρησιμοποιήσετε την τιμή XslCompiledTransform::get_OutputSettings για να λάβετε ένα αντικείμενο [XmlWriterSettings](../../xmlwritersettings/) με τις σωστές ρυθμίσεις. Αυτό εξασφαλίζει ότι το δημιουργημένο αντικείμενο [XmlWriter](../) έχει τις σωστές ρυθμίσεις εξόδου. |

### ReturnValue

Ένα αντικείμενο [XmlWriter](../).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&) method


Δημιουργεί ένα νέο παράδειγμα [XmlWriter](../) χρησιμοποιώντας το καθορισμένο TextWriter.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | Ο TextWriter στον οποίο θέλετε να γράψετε. Το [XmlWriter](../) γράφει σύνταξη κειμένου XML 1.0 και την προσθέτει στον καθορισμένο TextWriter. |

### ReturnValue

Ένα αντικείμενο [XmlWriter](../).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


Δημιουργεί ένα νέο παράδειγμα [XmlWriter](../) χρησιμοποιώντας τα αντικείμενα TextWriter και [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | Ο TextWriter στον οποίο θέλετε να γράψετε. Το [XmlWriter](../) γράφει σύνταξη κειμένου XML 1.0 και την προσθέτει στον καθορισμένο TextWriter. |
| settings | SharedPtr\<XmlWriterSettings\> | Το αντικείμενο [XmlWriterSettings](../../xmlwritersettings/) που χρησιμοποιείται για τη διαμόρφωση του νέου παραδείγματος [XmlWriter](../). Εάν είναι **nullptr**, χρησιμοποιείται ένα [XmlWriterSettings](../../xmlwritersettings/) με προεπιλεγμένες ρυθμίσεις. Εάν το [XmlWriter](../) χρησιμοποιείται με τη μέθοδο XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), θα πρέπει να χρησιμοποιήσετε την τιμή XslCompiledTransform::get_OutputSettings για να λάβετε ένα αντικείμενο [XmlWriterSettings](../../xmlwritersettings/) με τις σωστές ρυθμίσεις. Αυτό εξασφαλίζει ότι το δημιουργημένο αντικείμενο [XmlWriter](../) έχει τις σωστές ρυθμίσεις εξόδου. |

### ReturnValue

Ένα αντικείμενο [XmlWriter](../).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&) method


Δημιουργεί ένα νέο παράδειγμα [XmlWriter](../) χρησιμοποιώντας το καθορισμένο [Text::StringBuilder](../../../system.text/stringbuilder/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | Το [Text::StringBuilder](../../../system.text/stringbuilder/) στο οποίο θα γράψετε. Το περιεχόμενο που γράφεται από το [XmlWriter](../) προστίθεται στο [Text::StringBuilder](../../../system.text/stringbuilder/). |

### ReturnValue

Ένα αντικείμενο [XmlWriter](../).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) method


Δημιουργεί ένα νέο παράδειγμα [XmlWriter](../) χρησιμοποιώντας τα αντικείμενα [Text::StringBuilder](../../../system.text/stringbuilder/) και [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | Το [Text::StringBuilder](../../../system.text/stringbuilder/) στο οποίο θα γράψετε. Το περιεχόμενο που γράφεται από το [XmlWriter](../) προστίθεται στο [Text::StringBuilder](../../../system.text/stringbuilder/). |
| settings | SharedPtr\<XmlWriterSettings\> | Το αντικείμενο [XmlWriterSettings](../../xmlwritersettings/) που χρησιμοποιείται για τη διαμόρφωση του νέου παραδείγματος [XmlWriter](../). Εάν είναι **nullptr**, χρησιμοποιείται ένα [XmlWriterSettings](../../xmlwritersettings/) με προεπιλεγμένες ρυθμίσεις. Εάν το [XmlWriter](../) χρησιμοποιείται με τη μέθοδο XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), θα πρέπει να χρησιμοποιήσετε την τιμή XslCompiledTransform::get_OutputSettings για να λάβετε ένα αντικείμενο [XmlWriterSettings](../../xmlwritersettings/) με τις σωστές ρυθμίσεις. Αυτό εξασφαλίζει ότι το δημιουργημένο αντικείμενο [XmlWriter](../) έχει τις σωστές ρυθμίσεις εξόδου. |

### ReturnValue

Ένα αντικείμενο [XmlWriter](../).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&) method


Δημιουργεί ένα νέο παράδειγμα [XmlWriter](../) χρησιμοποιώντας το καθορισμένο αντικείμενο [XmlWriter](../).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | Το αντικείμενο [XmlWriter](../) που θέλετε να χρησιμοποιήσετε ως τον υποκείμενο writer. |

### ReturnValue

Ένα αντικείμενο [XmlWriter](../) που περιβάλλεται γύρω από το καθορισμένο αντικείμενο [XmlWriter](../).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


Δημιουργεί ένα νέο παράδειγμα [XmlWriter](../) χρησιμοποιώντας τα καθορισμένα αντικείμενα [XmlWriter](../) και [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | Το αντικείμενο [XmlWriter](../) που θέλετε να χρησιμοποιήσετε ως τον υποκείμενο writer. |
| settings | SharedPtr\<XmlWriterSettings\> | Το αντικείμενο [XmlWriterSettings](../../xmlwritersettings/) που χρησιμοποιείται για τη διαμόρφωση του νέου παραδείγματος [XmlWriter](../). Εάν είναι **nullptr**, χρησιμοποιείται ένα [XmlWriterSettings](../../xmlwritersettings/) με προεπιλεγμένες ρυθμίσεις. Εάν το [XmlWriter](../) χρησιμοποιείται με τη μέθοδο XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), θα πρέπει να χρησιμοποιήσετε την τιμή XslCompiledTransform::get_OutputSettings για να λάβετε ένα αντικείμενο [XmlWriterSettings](../../xmlwritersettings/) με τις σωστές ρυθμίσεις. Αυτό εξασφαλίζει ότι το δημιουργημένο αντικείμενο [XmlWriter](../) έχει τις σωστές ρυθμίσεις εξόδου. |

### ReturnValue

Ένα αντικείμενο [XmlWriter](../) που περιβάλλεται γύρω από το καθορισμένο αντικείμενο [XmlWriter](../).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const String\&) method


Δημιουργεί ένα νέο παράδειγμα [XmlWriter](../) χρησιμοποιώντας το καθορισμένο όνομα αρχείου.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| outputFileName | const String\& | Το αρχείο στο οποίο θέλετε να γράψετε. Το [XmlWriter](../) δημιουργεί ένα αρχείο στην καθορισμένη διαδρομή και γράφει σε αυτό με σύνταξη κειμένου XML 1.0. Το **outputFileName** πρέπει να είναι μια διαδρομή συστήματος αρχείων. |

### ReturnValue

Ένα αντικείμενο [XmlWriter](../).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const String\&, SharedPtr\<XmlWriterSettings\>) method


Δημιουργεί ένα νέο παράδειγμα [XmlWriter](../) χρησιμοποιώντας το όνομα αρχείου και το αντικείμενο [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| outputFileName | const String\& | Το αρχείο στο οποίο θέλετε να γράψετε. Το [XmlWriter](../) δημιουργεί ένα αρχείο στην καθορισμένη διαδρομή και γράφει σε αυτό με σύνταξη κειμένου XML 1.0. Το **outputFileName** πρέπει να είναι μια διαδρομή συστήματος αρχείων. |
| settings | SharedPtr\<XmlWriterSettings\> | Το αντικείμενο [XmlWriterSettings](../../xmlwritersettings/) που χρησιμοποιείται για τη διαμόρφωση του νέου παραδείγματος [XmlWriter](../). Εάν είναι **nullptr**, χρησιμοποιείται ένα [XmlWriterSettings](../../xmlwritersettings/) με προεπιλεγμένες ρυθμίσεις. Εάν το [XmlWriter](../) χρησιμοποιείται με τη μέθοδο XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), θα πρέπει να χρησιμοποιήσετε την τιμή XslCompiledTransform::get_OutputSettings για να λάβετε ένα αντικείμενο [XmlWriterSettings](../../xmlwritersettings/) με τις σωστές ρυθμίσεις. Αυτό εξασφαλίζει ότι το δημιουργημένο αντικείμενο [XmlWriter](../) έχει τις σωστές ρυθμίσεις εξόδου. |

### ReturnValue

Ένα αντικείμενο [XmlWriter](../).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
