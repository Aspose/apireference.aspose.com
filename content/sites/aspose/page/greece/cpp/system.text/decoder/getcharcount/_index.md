---
title: "System::Text::Decoder::GetCharCount μέθοδος"
linktitle: "GetCharCount"
second_title: "Aspose.Page για C++"
description: "System::Text::Decoder::GetCharCount μέθοδος. Επιστρέφει τον αριθμό των χαρακτήρων που χρειάζονται για την αποκωδικοποίηση ενός buffer σε C++."
type: docs
weight: 400
url: /el/cpp/system.text/decoder/getcharcount/
---
## Decoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int) method


Λαμβάνει τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer.

```cpp
virtual int System::Text::Decoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count)
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
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int, bool) method


Λαμβάνει τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer.

```cpp
virtual int System::Text::Decoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count, bool flush)
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
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::GetCharCount(const uint8_t *, int, bool) method


Λαμβάνει τον αριθμό των χαρακτήρων που απαιτούνται για την αποκωδικοποίηση ενός buffer.

```cpp
virtual int System::Text::Decoder::GetCharCount(const uint8_t *bytes, int count, bool flush)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| bytes | const uint8_t * | Bytes για αποκωδικοποίηση. |
| count | int | Αριθμός byte για αποκωδικοποίηση. |
| flush | bool | Εάν είναι αληθές, καθαρίζει την εσωτερική κατάσταση του αποκωδικοποιητή μετά τον υπολογισμό. |

### ReturnValue

Αριθμός χαρακτήρων που απαιτούνται για την αποκωδικοποίηση του buffer.

## Δείτε επίσης

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
