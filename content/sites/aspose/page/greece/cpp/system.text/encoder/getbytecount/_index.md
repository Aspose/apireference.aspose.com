---
title: "System::Text::Encoder::GetByteCount μέθοδος"
linktitle: "GetByteCount"
second_title: "Aspose.Page για C++"
description: "System::Text::Encoder::GetByteCount μέθοδος. Λαμβάνει τον αριθμό των byte που απαιτούνται για την κωδικοποίηση ενός buffer σε C++."
type: docs
weight: 400
url: /el/cpp/system.text/encoder/getbytecount/
---
## Encoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


Λαμβάνει τον αριθμό των byte που απαιτούνται για την κωδικοποίηση ενός buffer.

```cpp
virtual int System::Text::Encoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Χαρακτήρες για κωδικοποίηση. |
| index | int | [Buffer](../../../system/buffer/) μετατόπιση. |
| count | int | Αριθμός χαρακτήρων προς κωδικοποίηση. |
| flush | bool | Αν είναι true, καθαρίζει την εσωτερική κατάσταση του κωδικοποιητή μετά τον υπολογισμό. |

### ReturnValue

Αριθμός byte που απαιτούνται για την κωδικοποίηση του buffer.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoder::GetByteCount(const char_t *, int, bool) method


Λαμβάνει τον αριθμό των byte που απαιτούνται για την κωδικοποίηση ενός buffer.

```cpp
virtual int System::Text::Encoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| chars | const char_t * | Χαρακτήρες για κωδικοποίηση. |
| count | int | Αριθμός χαρακτήρων προς κωδικοποίηση. |
| flush | bool | Αν είναι true, καθαρίζει την εσωτερική κατάσταση του κωδικοποιητή μετά τον υπολογισμό. |

### ReturnValue

Αριθμός byte που απαιτούνται για την κωδικοποίηση του buffer.

## Δείτε επίσης

* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
