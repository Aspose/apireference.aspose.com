---
title: "System::IO::TextWriter::Write method"
linktitle: "Write"
second_title: "Aspose.Page για C++"
description: "System::IO::TextWriter::Write method. Γράφει την αναπαράσταση συμβολοσειράς της καθορισμένης λογικής τιμής στο ρεύμα σε C++."
type: docs
weight: 900
url: /el/cpp/system.io/textwriter/write/
---
## TextWriter::Write(bool) method


Γράφει την αναπαράσταση συμβολοσειράς της καθορισμένης λογικής τιμής στη ροή.

```cpp
virtual void System::IO::TextWriter::Write(bool value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | bool | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(char_t) method


Γράφει τον καθορισμένο χαρακτήρα στη ροή.

```cpp
virtual void System::IO::TextWriter::Write(char_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | char_t | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const ArrayPtr\<char_t\>\&) method


Γράφει όλους τους χαρακτήρες από τον καθορισμένο πίνακα στη ροή.

```cpp
virtual void System::IO::TextWriter::Write(const ArrayPtr<char_t> &buffer)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<char_t\>\& | Ο πίνακας που περιέχει τους χαρακτήρες για εγγραφή |

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


Γράφει το καθορισμένο υποσύνολο χαρακτήρων UTF-16 από τον καθορισμένο πίνακα χαρακτήρων στη ροή.

```cpp
virtual void System::IO::TextWriter::Write(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count)
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
## TextWriter::Write(const char_t *) method


Γράφει τη καθορισμένη c-συμβολοσειρά στη ροή.

```cpp
virtual void System::IO::TextWriter::Write(const char_t *value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const char_t * | Η c‑string για εγγραφή |

## Δείτε επίσης

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const SharedPtr\<Object\>\&) method


Γράφει την αναπαράσταση συμβολοσειράς του καθορισμένου αντικειμένου στη ροή.

```cpp
virtual void System::IO::TextWriter::Write(const SharedPtr<Object> &value)
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
## TextWriter::Write(const String\&, const TArgs\&...) method


Γράφει τις καθορισμένες τιμές μορφοποιημένες σύμφωνα με τη καθορισμένη μορφή στη ροή.

```cpp
template<class...> void System::IO::TextWriter::Write(const String &format, const TArgs &... args)
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
## TextWriter::Write(const String\&) method


Γράφει τη καθορισμένη συμβολοσειρά στη ροή.

```cpp
virtual void System::IO::TextWriter::Write(const String &value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Η συμβολοσειρά για εγγραφή |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const TypeInfo\&) method


Γράφει την αναπαράσταση συμβολοσειράς του καθορισμένου αντικειμένου [TypeInfo](../../../system/typeinfo/) στο ρεύμα.

```cpp
virtual void System::IO::TextWriter::Write(const TypeInfo &value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const TypeInfo\& | Το αντικείμενο για εγγραφή |

## Δείτε επίσης

* Class [TypeInfo](../../../system/typeinfo/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(Decimal) method


Γράφει την αναπαράσταση συμβολοσειράς του καθορισμένου αντικειμένου [Decimal](../../../system/decimal/) στο ρεύμα.

```cpp
virtual void System::IO::TextWriter::Write(Decimal value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | Decimal | Το αντικείμενο για εγγραφή |

## Δείτε επίσης

* Class [Decimal](../../../system/decimal/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(double) method


Γράφει την αναπαράσταση συμβολοσειράς της καθορισμένης τιμής κινητής υποδιαστολής διπλής ακρίβειας στη ροή.

```cpp
virtual void System::IO::TextWriter::Write(double value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | double | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(float) method


Γράφει την αναπαράσταση συμβολοσειράς της καθορισμένης τιμής κινητής υποδιαστολής μονής ακρίβειας στη ροή.

```cpp
virtual void System::IO::TextWriter::Write(float value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(int) method


Γράφει την αναπαράσταση συμβολοσειράς της καθορισμένης τιμής 32-bit ακέραιου στη ροή.

```cpp
virtual void System::IO::TextWriter::Write(int value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | int | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(int64_t) method


Γράφει την αναπαράσταση συμβολοσειράς της καθορισμένης τιμής 64-bit ακέραιου στη ροή.

```cpp
virtual void System::IO::TextWriter::Write(int64_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | int64_t | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(uint32_t) method


Γράφει την αναπαράσταση συμβολοσειράς της καθορισμένης μη-υπογεγραμμένης τιμής 32-bit ακέραιου στη ροή.

```cpp
virtual void System::IO::TextWriter::Write(uint32_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | uint32_t | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(uint64_t) method


Γράφει την αναπαράσταση συμβολοσειράς της καθορισμένης μη-υπογεγραμμένης τιμής 64-bit ακέραιου στη ροή.

```cpp
virtual void System::IO::TextWriter::Write(uint64_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | uint64_t | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
