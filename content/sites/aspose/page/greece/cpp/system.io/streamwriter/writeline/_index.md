---
title: "System::IO::StreamWriter::WriteLine method"
linktitle: "WriteLine"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::IO::StreamWriter::WriteLine. Γράφει χαρακτήρες τερματισμού γραμμής στο stream σε C++."
type: docs
weight: 1100
url: /el/cpp/system.io/streamwriter/writeline/
---
## StreamWriter::WriteLine() method


Γράφει χαρακτήρες τερματιστή γραμμής στη ροή.

```cpp
void System::IO::StreamWriter::WriteLine() override
```

## Δείτε επίσης

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&) method


Γράφει όλους τους χαρακτήρες από τον καθορισμένο πίνακα, ακολουθούμενη από τους χαρακτήρες λήξης γραμμής, στο ρεύμα.

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<char_t\>\& | Ο πίνακας που περιέχει τους χαρακτήρες για εγγραφή |

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


Γράφει το καθορισμένο υποσύνολο χαρακτήρων UTF-16 από τον καθορισμένο πίνακα χαρακτήρων, ακολουθούμενη από τους χαρακτήρες λήξης γραμμής, στο ρεύμα.

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<char_t\>\& | Ο πίνακας που περιέχει τους χαρακτήρες για εγγραφή |
| δείκτης | int32_t | Ένας δείκτης 0‑βάσης του στοιχείου στο **buffer** στο οποίο αρχίζει το υποσύνολο για εγγραφή |
| count | int32_t | Ο αριθμός των χαρακτήρων στο υποσύνολο για εγγραφή· -1 καθορίζει ότι το υποσύνολο τελειώνει όπου τελειώνει ο πίνακας **buffer** |

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const char_t *) method


Γράφει τη καθορισμένη c‑string, ακολουθούμενη από τους χαρακτήρες λήξης γραμμής, στο ρεύμα.

```cpp
void System::IO::StreamWriter::WriteLine(const char_t *buffer) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const char_t * | Η c‑string για εγγραφή |

## Δείτε επίσης

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const SharedPtr\<Object\>\&) method


Γράφει την αναπαράσταση συμβολοσειράς του καθορισμένου αντικειμένου, ακολουθούμενη από τους χαρακτήρες τερματισμού γραμμής, στη ροή.

```cpp
void System::IO::StreamWriter::WriteLine(const SharedPtr<Object> &obj) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const SharedPtr\<Object\>\& | Το αντικείμενο για εγγραφή |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const String\&) method


Γράφει τη συγκεκριμένη συμβολοσειρά, ακολουθούμενη από τους χαρακτήρες λήξης γραμμής, στο ρεύμα.

```cpp
void System::IO::StreamWriter::WriteLine(const String &value) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Η συμβολοσειρά για εγγραφή |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const System::SharedPtr\<T\>\&) method


Γράφει την αναπαράσταση συμβολοσειράς του καθορισμένου αντικειμένου, ακολουθούμενη από τους χαρακτήρες τερματισμού γραμμής, στη ροή.

```cpp
template<typename T> void System::IO::StreamWriter::WriteLine(const System::SharedPtr<T> &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος του αντικειμένου |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const System::SharedPtr\<T\>\& | Το αντικείμενο για εγγραφή |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
