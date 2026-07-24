---
title: "System::Text::ICUDecoder::GetCharCount μέθοδος"
linktitle: "GetCharCount"
second_title: "Aspose.Page για C++"
description: "System::Text::ICUDecoder::GetCharCount μέθοδος. Λαμβάνει τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer σε C++."
type: docs
weight: 400
url: /el/cpp/system.text/icudecoder/getcharcount/
---
## ICUDecoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int) method


Λαμβάνει τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | Bytes για αποκωδικοποίηση. |
| index | int | [Buffer](../../../system/buffer/) μετατόπιση. |
| count | int | Αριθμός byte για αποκωδικοποίηση. |

### ReturnValue

Αριθμός χαρακτήρων που απαιτούνται για την αποκωδικοποίηση του buffer.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int, bool) method


Λαμβάνει τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count, bool flush)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | Bytes για αποκωδικοποίηση. |
| index | int | [Buffer](../../../system/buffer/) μετατόπιση. |
| count | int | Αριθμός byte για αποκωδικοποίηση. |
| flush | bool | Εάν είναι αληθές, καθαρίζει την εσωτερική κατάσταση του αποκωδικοποιητή μετά τον υπολογισμό. |

### ReturnValue

Αριθμός χαρακτήρων που απαιτούνται για την αποκωδικοποίηση του buffer.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetCharCount(const uint8_t *, int, bool) method


Λαμβάνει τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(const uint8_t *bytes, int count, bool flush)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| bytes | const uint8_t * | Bytes για αποκωδικοποίηση. |
| count | int | Αριθμός byte για αποκωδικοποίηση. |
| flush | bool | Εάν είναι αληθές, καθαρίζει την εσωτερική κατάσταση του αποκωδικοποιητή μετά τον υπολογισμό. |

### ReturnValue

Αριθμός χαρακτήρων που απαιτούνται για την αποκωδικοποίηση του buffer.

## Δείτε επίσης

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
