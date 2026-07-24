---
title: "System::IO::BinaryWriter::Write μέθοδος"
linktitle: "Write"
second_title: "Aspose.Page για C++"
description: "System::IO::BinaryWriter::Write μέθοδος. Γράφει ένα μόνο byte με τιμή 0 εάν η τιμή είναι ''true'' και 1 εάν η τιμή είναι ''false'' στο ρεύμα εξόδου σε C++."
type: docs
weight: 800
url: /el/cpp/system.io/binarywriter/write/
---
## BinaryWriter::Write(bool) method


Γράφει ένα μόνο byte με τιμή 0 εάν **value** είναι 'true' και 1 εάν **value** είναι 'false' στην ροή εξόδου.

```cpp
virtual void System::IO::BinaryWriter::Write(bool value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | bool | Η λογική τιμή που καθορίζει την τιμή του byte προς εγγραφή στο ρεύμα εξόδου |

## Δείτε επίσης

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(char16_t) method


Γράφει την καθορισμένη τιμή 16-bit χαρακτήρα στην ροή εξόδου.

```cpp
virtual void System::IO::BinaryWriter::Write(char16_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | char16_t | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const ArrayPtr\<char_t\>\&, int, int) method


Γράφει το καθορισμένο υποσύνολο χαρακτήρων UTF-16 από τον καθορισμένο πίνακα χαρακτήρων στην ροή εξόδου.

```cpp
virtual void System::IO::BinaryWriter::Write(const ArrayPtr<char_t> &buffer, int index=0, int count=-1)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<char_t\>\& | Ο πίνακας που περιέχει τους χαρακτήρες για εγγραφή |
| δείκτης | int | Ένας δείκτης 0‑βάσης του στοιχείου στο **buffer** στο οποίο αρχίζει το υποσύνολο για εγγραφή |
| count | int | Ο αριθμός των χαρακτήρων στο υποσύνολο για εγγραφή· -1 καθορίζει ότι το υποσύνολο τελειώνει όπου τελειώνει ο πίνακας **buffer** |

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const ArrayPtr\<uint8_t\>\&, int, int) method


Γράφει το καθορισμένο υποσύνολο byte από τον καθορισμένο πίνακα byte στην ροή εξόδου.

```cpp
virtual void System::IO::BinaryWriter::Write(const ArrayPtr<uint8_t> &buffer, int index=0, int count=-1)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<uint8_t\>\& | Ο πίνακας που περιέχει τα byte προς εγγραφή |
| δείκτης | int | Ένας δείκτης 0‑βάσης του στοιχείου στο **buffer** στο οποίο αρχίζει το υποσύνολο για εγγραφή |
| count | int | Ο αριθμός των στοιχείων στην υπο-περιοχή προς εγγραφή· -1 υποδεικνύει ότι η υπο-περιοχή τελειώνει όπου λήγει ο πίνακας **buffer** |

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const char_t *) method


Γράφει μια συμβολοσειρά με προεπιλεγμένο μήκος στην τρέχουσα κωδικοποίηση στην ροή εξόδου.

```cpp
virtual void System::IO::BinaryWriter::Write(const char_t *value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const char_t * | Η c‑string για εγγραφή |

## Δείτε επίσης

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const Decimal\&) method


Γράφει την αναπαράσταση σε byte της καθορισμένης τιμής [Decimal](../../../system/decimal/) στο ρεύμα εξόδου.

```cpp
virtual void System::IO::BinaryWriter::Write(const Decimal &value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const Decimal\& | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [Decimal](../../../system/decimal/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const String\&) method


Γράφει μια συμβολοσειρά με προεπιλεγμένο μήκος στην τρέχουσα κωδικοποίηση στην ροή εξόδου.

```cpp
virtual void System::IO::BinaryWriter::Write(const String &value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Η συμβολοσειρά για εγγραφή |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(double) method


Γράφει την καθορισμένη τιμή κινητής υποδιαστολής διπλής ακρίβειας στην ροή εξόδου.

```cpp
virtual void System::IO::BinaryWriter::Write(double value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | double | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(float) method


Γράφει την καθορισμένη τιμή κινητής υποδιαστολής μονής ακρίβειας στην ροή εξόδου.

```cpp
virtual void System::IO::BinaryWriter::Write(float value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(int) method


Γράφει την καθορισμένη τιμή 32-bit ακέραιου στην ροή εξόδου.

```cpp
virtual void System::IO::BinaryWriter::Write(int value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | int | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(int16_t) method


Γράφει την καθορισμένη τιμή 16-bit ακέραιου στην ροή εξόδου.

```cpp
virtual void System::IO::BinaryWriter::Write(int16_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | int16_t | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(int64_t) method


Γράφει την καθορισμένη τιμή 64-bit ακέραιου στην ροή εξόδου.

```cpp
virtual void System::IO::BinaryWriter::Write(int64_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | int64_t | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint16_t) method


Γράφει την καθορισμένη μη υπογεγραμμένη τιμή 16-bit ακέραιου στην ροή εξόδου.

```cpp
virtual void System::IO::BinaryWriter::Write(uint16_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | uint16_t | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint32_t) method


Γράφει την καθορισμένη μη υπογεγραμμένη τιμή 32-bit ακέραιου στην ροή εξόδου.

```cpp
virtual void System::IO::BinaryWriter::Write(uint32_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | uint32_t | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint64_t) method


Γράφει την καθορισμένη μη υπογεγραμμένη τιμή 64-bit ακέραιου στην ροή εξόδου.

```cpp
virtual void System::IO::BinaryWriter::Write(uint64_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | uint64_t | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint8_t) method


Γράφει την καθορισμένη μη υπογεγραμμένη τιμή 8-bit ακέραιου στην ροή εξόδου.

```cpp
virtual void System::IO::BinaryWriter::Write(uint8_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | uint8_t | Η τιμή για εγγραφή |

## Δείτε επίσης

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
