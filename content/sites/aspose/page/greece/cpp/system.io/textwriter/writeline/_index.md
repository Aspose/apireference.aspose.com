---
title: "System::IO::TextWriter::WriteLine μέθοδος"
linktitle: "WriteLine"
second_title: "Aspose.Page για C++"
description: "System::IO::TextWriter::WriteLine μέθοδος. Γράφει χαρακτήρες διαχωριστή γραμμής στη ροή σε C++."
type: docs
weight: 1000
url: /el/cpp/system.io/textwriter/writeline/
---
## TextWriter::WriteLine() method


Γράφει χαρακτήρες τερματιστή γραμμής στη ροή.

```cpp
virtual void System::IO::TextWriter::WriteLine()
```

## Δείτε επίσης

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(bool) method


Γράφει την αναπαράσταση συμβολοσειράς της καθορισμένης λογικής τιμής, ακολουθούμενη από τους χαρακτήρες τερματισμού γραμμής, στη ροή.

```cpp
virtual void System::IO::TextWriter::WriteLine(bool value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | bool | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(char_t) method


Γράφει τον καθορισμένο χαρακτήρα, ακολουθούμενο από τους χαρακτήρες τερματισμού γραμμής, στη ροή.

```cpp
virtual void System::IO::TextWriter::WriteLine(char_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | char_t | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const ArrayPtr\<char_t\>\&) method


Γράφει όλους τους χαρακτήρες από τον καθορισμένο πίνακα, ακολουθούμενη από τους χαρακτήρες λήξης γραμμής, στο ρεύμα.

```cpp
virtual void System::IO::TextWriter::WriteLine(const ArrayPtr<char_t> &buffer)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<char_t\>\& | Ο πίνακας που περιέχει τους χαρακτήρες για εγγραφή |

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


Γράφει το καθορισμένο υποσύνολο χαρακτήρων UTF-16 από τον καθορισμένο πίνακα χαρακτήρων, ακολουθούμενη από τους χαρακτήρες λήξης γραμμής, στο ρεύμα.

```cpp
virtual void System::IO::TextWriter::WriteLine(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<char_t\>\& | Ο πίνακας που περιέχει τους χαρακτήρες για εγγραφή |
| δείκτης | int32_t | Ένας δείκτης 0‑βάσης του στοιχείου στο **buffer** στο οποίο αρχίζει το υποσύνολο για εγγραφή |
| count | int32_t | Ο αριθμός των χαρακτήρων στο υποσύνολο για εγγραφή· -1 καθορίζει ότι το υποσύνολο τελειώνει όπου τελειώνει ο πίνακας **buffer** |

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const char_t *) method


Γράφει τη καθορισμένη c‑string, ακολουθούμενη από τους χαρακτήρες λήξης γραμμής, στο ρεύμα.

```cpp
virtual void System::IO::TextWriter::WriteLine(const char_t *value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const char_t * | Η c‑string για εγγραφή |

## Δείτε επίσης

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const SharedPtr\<Object\>\&) method


Γράφει την αναπαράσταση συμβολοσειράς του καθορισμένου αντικειμένου, ακολουθούμενη από τους χαρακτήρες τερματισμού γραμμής, στη ροή.

```cpp
virtual void System::IO::TextWriter::WriteLine(const SharedPtr<Object> &value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const SharedPtr\<Object\>\& | Το αντικείμενο για εγγραφή |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const String\&, const TArgs\&...) method


Γράφει τις καθορισμένες τιμές μορφοποιημένες σύμφωνα με τη καθορισμένη μορφή, ακολουθούμενη από τους χαρακτήρες λήξης γραμμής, στο ρεύμα.

```cpp
template<class...> void System::IO::TextWriter::WriteLine(const String &format, const TArgs &... args)
```


| Parameter | Περιγραφή |
| --- | --- |
| TArgs | Η λίστα των τύπων των τιμών για εγγραφή |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| μορφή | const String\& | Η μορφή συμβολοσειράς |
| args | const TArgs\&... | Οι τιμές για εγγραφή |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const String\&) method


Γράφει τη συγκεκριμένη συμβολοσειρά, ακολουθούμενη από τους χαρακτήρες λήξης γραμμής, στο ρεύμα.

```cpp
virtual void System::IO::TextWriter::WriteLine(const String &value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Η συμβολοσειρά για εγγραφή |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const TypeInfo\&) method


Γράφει την αναπαράσταση συμβολοσειράς του καθορισμένου αντικειμένου [TypeInfo](../../../system/typeinfo/) ακολουθούμενη από τους χαρακτήρες λήξης γραμμής στο ρεύμα.

```cpp
virtual void System::IO::TextWriter::WriteLine(const TypeInfo &value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const TypeInfo\& | Το αντικείμενο για εγγραφή |

## Δείτε επίσης

* Class [TypeInfo](../../../system/typeinfo/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(Decimal) method


Γράφει την αναπαράσταση συμβολοσειράς του καθορισμένου αντικειμένου [Decimal](../../../system/decimal/) ακολουθούμενη από τους χαρακτήρες λήξης γραμμής στο ρεύμα.

```cpp
virtual void System::IO::TextWriter::WriteLine(Decimal value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | Decimal | Το αντικείμενο για εγγραφή |

## Δείτε επίσης

* Class [Decimal](../../../system/decimal/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(double) method


Γράφει την αναπαράσταση συμβολοσειράς της καθορισμένης τιμής κινητής υποδιαστολής διπλής ακρίβειας, ακολουθούμενη από τους χαρακτήρες τερματισμού γραμμής, στη ροή.

```cpp
virtual void System::IO::TextWriter::WriteLine(double value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | double | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(float) method


Γράφει την αναπαράσταση σε συμβολοσειρά της καθορισμένης τιμής κινητής υποδιαστολής μονής ακρίβειας, ακολουθούμενη από τους χαρακτήρες λήξης γραμμής, στο ρεύμα.

```cpp
virtual void System::IO::TextWriter::WriteLine(float value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(int) method


Γράφει την αναπαράσταση συμβολοσειράς της καθορισμένης τιμής 32-bit ακέραιου, ακολουθούμενη από τους χαρακτήρες τερματισμού γραμμής, στη ροή.

```cpp
virtual void System::IO::TextWriter::WriteLine(int value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | int | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(int64_t) method


Γράφει την αναπαράσταση συμβολοσειράς της καθορισμένης τιμής 64-bit ακέραιου, ακολουθούμενη από τους χαρακτήρες τερματισμού γραμμής, στη ροή.

```cpp
virtual void System::IO::TextWriter::WriteLine(int64_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | int64_t | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(uint32_t) method


Γράφει την αναπαράσταση σε συμβολοσειρά της καθορισμένης τιμής μη υπογεγραμμένου 32-bit ακέραιου, ακολουθούμενη από τους χαρακτήρες λήξης γραμμής, στο ρεύμα.

```cpp
virtual void System::IO::TextWriter::WriteLine(uint32_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | uint32_t | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(uint64_t) method


Γράφει την αναπαράσταση σε συμβολοσειρά της καθορισμένης τιμής μη υπογεγραμμένου 64-bit ακέραιου, ακολουθούμενη από τους χαρακτήρες λήξης γραμμής, στο ρεύμα.

```cpp
virtual void System::IO::TextWriter::WriteLine(uint64_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | uint64_t | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
