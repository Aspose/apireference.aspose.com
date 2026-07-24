---
title: "System::Text::Decoder::Convert μέθοδος"
linktitle: "Μετατροπή"
second_title: "Aspose.Page για C++"
description: "System::Text::Decoder::Convert μέθοδος. Μετατρέπει τα byte σε χαρακτήρες σε C++."
type: docs
weight: 100
url: /el/cpp/system.text/decoder/convert/
---
## Decoder::Convert(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) method


Μετατρέπει byte σε χαρακτήρες.

```cpp
virtual void System::Text::Decoder::Convert(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | Bytes για αποκωδικοποίηση. |
| byteIndex | int | Μετατόπιση του buffer εισόδου. |
| byteCount | int | Μέγεθος buffer εισόδου. |
| chars | ArrayPtr\<char_t\> | Προορισμένο buffer χαρακτήρων. |
| charIndex | int | Μετατόπιση πίνακα προορισμού. |
| charCount | int | Μέγεθος πίνακα προορισμού. |
| flush | bool | Εάν είναι αληθές, καθαρίζει την εσωτερική κατάσταση του αποκωδικοποιητή μετά τον υπολογισμό. |
| bytesUsed | int\& | Αναφορά στη μεταβλητή για αποθήκευση του αριθμού των byte που διαβάστηκαν. |
| charsUsed | int\& | Αναφορά στη μεταβλητή για αποθήκευση του αριθμού των χαρακτήρων που γράφτηκαν. |
| completed | bool\& | Αναφορά σε μεταβλητή που θα οριστεί σε true εάν το buffer εισόδου εξαντληθεί και σε false διαφορετικά. |

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::Convert(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) method


Μετατρέπει byte σε χαρακτήρες.

```cpp
virtual void System::Text::Decoder::Convert(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| bytes | const uint8_t * | Bytes για αποκωδικοποίηση. |
| byteCount | int | Μέγεθος buffer εισόδου. |
| chars | char_t * | Προορισμένο buffer χαρακτήρων. |
| charCount | int | Μέγεθος πίνακα προορισμού. |
| flush | bool | Εάν είναι αληθές, καθαρίζει την εσωτερική κατάσταση του αποκωδικοποιητή μετά τον υπολογισμό. |
| bytesUsed | int\& | Αναφορά στη μεταβλητή για αποθήκευση του αριθμού των byte που διαβάστηκαν. |
| charsUsed | int\& | Αναφορά στη μεταβλητή για αποθήκευση του αριθμού των χαρακτήρων που γράφτηκαν. |
| completed | bool\& | Αναφορά σε μεταβλητή που θα οριστεί σε true εάν το buffer εισόδου εξαντληθεί και σε false διαφορετικά. |

## Δείτε επίσης

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
