---
title: "System::IO::StreamWriter::StreamWriter constructor"
linktitle: "StreamWriter"
second_title: "Aspose.Page για C++"
description: "System::IO::StreamWriter::StreamWriter constructor. Δημιουργεί ένα στιγμιότυπο του αντικειμένου StreamWriter που γράφει χαρακτήρες στο καθορισμένο υποκείμενο ρεύμα χρησιμοποιώντας κωδικοποίηση UTF-8 και μια ενδιάμεση μνήμη με προεπιλεγμένο μέγεθος 1024 byte σε C++."
type: docs
weight: 100
url: /el/cpp/system.io/streamwriter/streamwriter/
---
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&) constructor


Δημιουργεί ένα στιγμιότυπο του αντικειμένου [StreamWriter](../) που γράφει χαρακτήρες στο καθορισμένο υποκείμενο ρεύμα χρησιμοποιώντας κωδικοποίηση UTF-8 και μια ενδιάμεση μνήμη με προεπιλεγμένο μέγεθος 1024 byte.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ροή | const SharedPtr\<Stream\>\& | Το υποκείμενο stream για την εγγραφή χαρακτήρων |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Δημιουργεί μια παρουσία του αντικειμένου [StreamWriter](../) που γράφει χαρακτήρες στο καθορισμένο υποκείμενο stream χρησιμοποιώντας την καθορισμένη κωδικοποίηση και μια ενδιάμεση μνήμη με προεπιλεγμένο μέγεθος 1024 byte.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ροή | const SharedPtr\<Stream\>\& | Το υποκείμενο stream για την εγγραφή χαρακτήρων |
| encoding | const EncodingPtr\& | Η κωδικοποίηση προς χρήση |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) constructor


Δημιουργεί μια παρουσία του αντικειμένου [StreamWriter](../) που γράφει χαρακτήρες στο καθορισμένο υποκείμενο stream χρησιμοποιώντας την καθορισμένη κωδικοποίηση και μια ενδιάμεση μνήμη του καθορισμένου μεγέθους. Ένα παράμετρος καθορίζει εάν το υποκείμενο stream πρέπει να κλείσει όταν το αντικείμενο [StreamWriter](../) απορριφθεί.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, int buffer_size, bool leave_open=false)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ροή | const SharedPtr\<Stream\>\& | Το υποκείμενο stream για την εγγραφή χαρακτήρων |
| encoding | const EncodingPtr\& | Η κωδικοποίηση προς χρήση |
| buffer_size | int | Το ελάχιστο μέγεθος της ενδιάμεσης μνήμης σε byte |
| leave_open | bool | Καθορίζει εάν το υποκείμενο stream πρέπει να παραμείνει ανοιχτό μετά την απόρριψη του τρέχοντος αντικειμένου [StreamWriter](../). |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&) constructor


Δημιουργεί μια παρουσία του αντικειμένου [StreamWriter](../) που γράφει χαρακτήρες στο καθορισμένο αρχείο χρησιμοποιώντας κωδικοποίηση UTF-8 και μια ενδιάμεση μνήμη με προεπιλεγμένο μέγεθος 1024 byte.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const String\& | Η διαδρομή του αρχείου για την εγγραφή χαρακτήρων |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&, int) constructor


Δημιουργεί μια παρουσία του αντικειμένου [StreamWriter](../) που γράφει χαρακτήρες στο καθορισμένο αρχείο χρησιμοποιώντας την καθορισμένη κωδικοποίηση και το μέγεθος της ενδιάμεσης μνήμης. Ένα παράμετρος καθορίζει εάν τα δεδομένα πρέπει να προσαρτηθούν στο αρχείο ή το αρχείο να αντικατασταθεί.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding, int buffer_size)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const String\& | Η διαδρομή του αρχείου για την εγγραφή χαρακτήρων |
| append | bool | Καθορίζει εάν τα δεδομένα πρέπει να προσαρτηθούν στο καθορισμένο αρχείο (true) ή το αρχείο να αντικατασταθεί (false). |
| encoding | const EncodingPtr\& | Η κωδικοποίηση προς χρήση |
| buffer_size | int | Το μέγεθος της ενδιάμεσης μνήμης προς χρήση |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&) constructor


Δημιουργεί μια παρουσία του αντικειμένου [StreamWriter](../) που γράφει χαρακτήρες στο καθορισμένο αρχείο χρησιμοποιώντας την καθορισμένη κωδικοποίηση και μια ενδιάμεση μνήμη με προεπιλεγμένο μέγεθος 1024 byte. Ένα παράμετρος καθορίζει εάν τα δεδομένα πρέπει να προσαρτηθούν στο αρχείο ή το αρχείο να αντικατασταθεί.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const String\& | Η διαδρομή του αρχείου για την εγγραφή χαρακτήρων |
| append | bool | Καθορίζει εάν τα δεδομένα πρέπει να προσαρτηθούν στο καθορισμένο αρχείο (true) ή το αρχείο να αντικατασταθεί (false). |
| encoding | const EncodingPtr\& | Η κωδικοποίηση προς χρήση |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
