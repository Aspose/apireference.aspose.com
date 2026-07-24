---
title: "Μέθοδος System::Text::ICUEncoder::Convert"
linktitle: "Μετατροπή"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Text::ICUEncoder::Convert. Μετατρέπει χαρακτήρες σε bytes σε C++."
type: docs
weight: 300
url: /el/cpp/system.text/icuencoder/convert/
---
## ICUEncoder::Convert(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) method


Μετατρέπει χαρακτήρες σε byte.

```cpp
virtual void System::Text::ICUEncoder::Convert(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Χαρακτήρες για κωδικοποίηση. |
| charIndex | int | Μετατόπιση του buffer εισόδου. |
| charCount | int | Μέγεθος buffer εισόδου. |
| bytes | ArrayPtr\<uint8_t\> | Buffer byte προορισμού. |
| byteIndex | int | Μετατόπιση πίνακα προορισμού. |
| byteCount | int | Μέγεθος πίνακα προορισμού. |
| flush | bool | Αν είναι true, καθαρίζει την εσωτερική κατάσταση του κωδικοποιητή μετά τον υπολογισμό. |
| charsUsed | int\& | Αναφορά σε μεταβλητή για αποθήκευση του αριθμού των χαρακτήρων που διαβάστηκαν. |
| bytesUsed | int\& | Αναφορά σε μεταβλητή για αποθήκευση του αριθμού των byte που γράφτηκαν. |
| completed | bool\& | Αναφορά σε μεταβλητή που θα οριστεί σε true εάν το buffer εισόδου εξαντληθεί και σε false διαφορετικά. |

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoder::Convert(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) method


Μετατρέπει χαρακτήρες σε byte.

```cpp
virtual void System::Text::ICUEncoder::Convert(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| chars | const char_t * | Χαρακτήρες για κωδικοποίηση. |
| charCount | int | Μέγεθος buffer εισόδου. |
| bytes | uint8_t * | Buffer byte προορισμού. |
| byteCount | int | Μέγεθος πίνακα προορισμού. |
| flush | bool | Αν είναι true, καθαρίζει την εσωτερική κατάσταση του κωδικοποιητή μετά τον υπολογισμό. |
| charsUsed | int\& | Αναφορά σε μεταβλητή για αποθήκευση του αριθμού των χαρακτήρων που διαβάστηκαν. |
| bytesUsed | int\& | Αναφορά σε μεταβλητή για αποθήκευση του αριθμού των byte που γράφτηκαν. |
| completed | bool\& | Αναφορά σε μεταβλητή που θα οριστεί σε true εάν το buffer εισόδου εξαντληθεί και σε false διαφορετικά. |

## Δείτε επίσης

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
