---
title: "System::Text::Encoder::GetBytes μέθοδος"
linktitle: "GetBytes"
second_title: "Aspose.Page για C++"
description: "System::Text::Encoder::GetBytes μέθοδος. Λαμβάνει τα byte που προκύπτουν από την κωδικοποίηση ενός buffer σε C++."
type: docs
weight: 500
url: /el/cpp/system.text/encoder/getbytes/
---
## Encoder::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) method


Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer.

```cpp
virtual int System::Text::Encoder::GetBytes(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, bool flush)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Χαρακτήρες για κωδικοποίηση. |
| charIndex | int | Μετατόπιση πηγαίου πίνακα. |
| charCount | int | Μήκος υποπίνακα πηγής. |
| bytes | ArrayPtr\<uint8_t\> | Buffer byte προορισμού. |
| byteIndex | int | Μετατόπιση buffer προορισμού. |
| flush | bool | Αν είναι true, καθαρίζει την εσωτερική κατάσταση του κωδικοποιητή μετά τον υπολογισμό. |

### ReturnValue

Αριθμός byte που γράφτηκαν.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoder::GetBytes(const char_t *, int, uint8_t *, int, bool) method


Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer.

```cpp
virtual int System::Text::Encoder::GetBytes(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| chars | const char_t * | Χαρακτήρες για κωδικοποίηση. |
| charCount | int | Μήκος πηγαίου πίνακα. |
| bytes | uint8_t * | Buffer byte προορισμού. |
| byteCount | int | Μέγεθος buffer προορισμού. |
| flush | bool | Αν είναι true, καθαρίζει την εσωτερική κατάσταση του κωδικοποιητή μετά τον υπολογισμό. |

### ReturnValue

Αριθμός byte που γράφτηκαν.

## Δείτε επίσης

* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
