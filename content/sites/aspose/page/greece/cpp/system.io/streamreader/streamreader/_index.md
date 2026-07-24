---
title: "System::IO::StreamReader::StreamReader κατασκευαστής"
linktitle: "StreamReader"
second_title: "Aspose.Page για C++"
description: "System::IO::StreamReader::StreamReader κατασκευαστής. Δημιουργεί ένα στιγμιότυπο του αντικειμένου StreamReader που διαβάζει χαρακτήρες από τη συγκεκριμένη βασική ροή χρησιμοποιώντας κωδικοποίηση UTF-8 και μια ενδιάμεση μνήμη με προεπιλεγμένο μέγεθος 1024 byte σε C++."
type: docs
weight: 100
url: /el/cpp/system.io/streamreader/streamreader/
---
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&) constructor


Δημιουργεί ένα στιγμιότυπο του αντικειμένου [StreamReader](../) που διαβάζει χαρακτήρες από τη συγκεκριμένη βασική ροή χρησιμοποιώντας κωδικοποίηση UTF-8 και μια ενδιάμεση μνήμη με προεπιλεγμένο μέγεθος 1024 byte.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ροή | const SharedPtr\<Stream\>\& | Η βασική ροή από την οποία θα διαβαστούν χαρακτήρες |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, bool) constructor


Δημιουργεί ένα στιγμιότυπο του αντικειμένου [StreamReader](../) που διαβάζει χαρακτήρες από τη συγκεκριμένη βασική ροή χρησιμοποιώντας κωδικοποίηση UTF-8 και μια ενδιάμεση μνήμη με προεπιλεγμένο μέγεθος 1024 byte. Ένα παράμετρος καθορίζει αν η ανίχνευση σημείου διαταγής byte πρέπει να ενεργοποιηθεί.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ροή | const SharedPtr\<Stream\>\& | Η βασική ροή από την οποία θα διαβαστούν χαρακτήρες |
| detectEncodingFromByteOrderMarks | bool | Αληθές για να αναζητηθούν σημεία διαταγής byte στην αρχή της ροής, διαφορετικά - ψευδές |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Δημιουργεί ένα στιγμιότυπο του αντικειμένου [StreamReader](../) που διαβάζει χαρακτήρες από τη συγκεκριμένη βασική ροή χρησιμοποιώντας την καθορισμένη κωδικοποίηση και μια ενδιάμεση μνήμη με προεπιλεγμένο μέγεθος 1024 byte.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ροή | const SharedPtr\<Stream\>\& | Η βασική ροή από την οποία θα διαβαστούν χαρακτήρες |
| encoding | const EncodingPtr\& | Η κωδικοποίηση προς χρήση |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) constructor


Δημιουργεί ένα στιγμιότυπο του αντικειμένου [StreamReader](../) που διαβάζει χαρακτήρες από τη συγκεκριμένη βασική ροή χρησιμοποιώντας την καθορισμένη κωδικοποίηση και μια ενδιάμεση μνήμη με προεπιλεγμένο μέγεθος 1024 byte. Ένα παράμετρος καθορίζει αν η ανίχνευση σημείου διαταγής byte πρέπει να ενεργοποιηθεί.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ροή | const SharedPtr\<Stream\>\& | Η βασική ροή από την οποία θα διαβαστούν χαρακτήρες |
| encoding | const EncodingPtr\& | Η κωδικοποίηση προς χρήση |
| detectEncodingFromByteOrderMarks | bool | Αληθές για να αναζητηθούν σημεία διαταγής byte στην αρχή της ροής, διαφορετικά - ψευδές |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) constructor


Δημιουργεί ένα στιγμιότυπο του αντικειμένου [StreamReader](../) που διαβάζει χαρακτήρες από τη συγκεκριμένη βασική ροή χρησιμοποιώντας την καθορισμένη κωδικοποίηση και μια ενδιάμεση μνήμη του καθορισμένου μεγέθους. Ένα παράμετρος καθορίζει αν η ανίχνευση σημείου διαταγής byte πρέπει να ενεργοποιηθεί.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ροή | const SharedPtr\<Stream\>\& | Η βασική ροή από την οποία θα διαβαστούν χαρακτήρες |
| encoding | const EncodingPtr\& | Η κωδικοποίηση προς χρήση |
| detectEncodingFromByteOrderMarks | bool | Αληθές για να αναζητηθούν σημεία διαταγής byte στην αρχή της ροής, διαφορετικά - ψευδές |
| bufferSize | int | Το ελάχιστο μέγεθος της ενδιάμεσης μνήμης σε byte |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&) constructor


Δημιουργεί ένα στιγμιότυπο του αντικειμένου [StreamReader](../) που διαβάζει χαρακτήρες από το συγκεκριμένο αρχείο χρησιμοποιώντας κωδικοποίηση UTF-8 και μια ενδιάμεση μνήμη με προεπιλεγμένο μέγεθος 4096 byte.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const System::String\& | Η διαδρομή του αρχείου από το οποίο θα διαβαστούν χαρακτήρες |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, bool) constructor


Δημιουργεί ένα στιγμιότυπο του αντικειμένου [StreamReader](../) που διαβάζει χαρακτήρες από το συγκεκριμένο αρχείο χρησιμοποιώντας κωδικοποίηση UTF-8 και μια ενδιάμεση μνήμη με προεπιλεγμένο μέγεθος 4096 byte. Ένα παράμετρος καθορίζει αν η ανίχνευση σημείου διαταγής byte πρέπει να ενεργοποιηθεί.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const System::String\& | Η διαδρομή του αρχείου από το οποίο θα διαβαστούν χαρακτήρες |
| detectEncodingFromByteOrderMarks | bool | Αληθές για αναζήτηση σημείων τάξης byte στην αρχή του αρχείου, διαφορετικά - ψευδές |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&) constructor


Δημιουργεί μια παρουσία του αντικειμένου [StreamReader](../) που διαβάζει χαρακτήρες από το καθορισμένο αρχείο χρησιμοποιώντας την καθορισμένη κωδικοποίηση και μια ενδιάμεση μνήμη με προεπιλεγμένο μέγεθος 4096 byte.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const System::String\& | Η διαδρομή του αρχείου από το οποίο θα διαβαστούν χαρακτήρες |
| encoding | const EncodingPtr\& | Η κωδικοποίηση προς χρήση |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool) constructor


Δημιουργεί μια παρουσία του αντικειμένου [StreamReader](../) που διαβάζει χαρακτήρες από το καθορισμένο υποκείμενο stream χρησιμοποιώντας την καθορισμένη κωδικοποίηση και μια ενδιάμεση μνήμη με προεπιλεγμένο μέγεθος 4096 byte. Ένα παράμετρος καθορίζει αν η ανίχνευση σημείου τάξης byte πρέπει να ενεργοποιηθεί.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const System::String\& | Η διαδρομή του αρχείου από το οποίο θα διαβαστούν χαρακτήρες |
| encoding | const EncodingPtr\& | Η κωδικοποίηση προς χρήση |
| detectEncodingFromByteOrderMarks | bool | Αληθές για αναζήτηση σημείων τάξης byte στην αρχή του αρχείου, διαφορετικά - ψευδές |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool, int) constructor


Δημιουργεί μια παρουσία του αντικειμένου [StreamReader](../) που διαβάζει χαρακτήρες από το καθορισμένο αρχείο χρησιμοποιώντας την καθορισμένη κωδικοποίηση και μια ενδιάμεση μνήμη του καθορισμένου μεγέθους. Ένα παράμετρος καθορίζει αν η ανίχνευση σημείου τάξης byte πρέπει να ενεργοποιηθεί.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const System::String\& | Η διαδρομή του αρχείου από το οποίο θα διαβαστούν χαρακτήρες |
| encoding | const EncodingPtr\& | Η κωδικοποίηση προς χρήση |
| detectEncodingFromByteOrderMarks | bool | Αληθές για αναζήτηση σημείων τάξης byte στην αρχή του αρχείου, διαφορετικά - ψευδές |
| bufferSize | int | Το ελάχιστο μέγεθος της ενδιάμεσης μνήμης σε byte |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
