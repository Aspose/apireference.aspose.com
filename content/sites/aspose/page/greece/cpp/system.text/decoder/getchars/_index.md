---
title: "System::Text::Decoder::GetChars μέθοδος"
linktitle: "GetChars"
second_title: "Aspose.Page για C++"
description: "System::Text::Decoder::GetChars μέθοδος. Λαμβάνει τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer σε C++."
type: docs
weight: 500
url: /el/cpp/system.text/decoder/getchars/
---
## Decoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer.

```cpp
virtual int System::Text::Decoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | Bytes για αποκωδικοποίηση. |
| byteIndex | int | Μετατόπιση του buffer εισόδου. |
| byteCount | int | Μέγεθος buffer εισόδου. |
| chars | ArrayPtr\<char_t\> | Προορισμένο buffer χαρακτήρων. |
| charIndex | int | Μετατόπιση πίνακα προορισμού. |

### ReturnValue

Αριθμός χαρακτήρων που γράφτηκαν.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) method


Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer.

```cpp
virtual int System::Text::Decoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, bool flush)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | Bytes για αποκωδικοποίηση. |
| byteIndex | int | Μετατόπιση του buffer εισόδου. |
| byteCount | int | Μέγεθος buffer εισόδου. |
| chars | ArrayPtr\<char_t\> | Προορισμένο buffer χαρακτήρων. |
| charIndex | int | Μετατόπιση πίνακα προορισμού. |
| flush | bool | Εάν είναι αληθές, καθαρίζει την εσωτερική κατάσταση του αποκωδικοποιητή μετά τον υπολογισμό. |

### ReturnValue

Αριθμός χαρακτήρων που γράφτηκαν.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::GetChars(const uint8_t *, int, char_t *, int, bool) method


Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer.

```cpp
virtual int System::Text::Decoder::GetChars(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| bytes | const uint8_t * | Bytes για αποκωδικοποίηση. |
| byteCount | int | Μέγεθος buffer εισόδου. |
| chars | char_t * | Προορισμένο buffer χαρακτήρων. |
| charCount | int | Μέγεθος πίνακα προορισμού. |
| flush | bool | Εάν είναι αληθές, καθαρίζει την εσωτερική κατάσταση του αποκωδικοποιητή μετά τον υπολογισμό. |

### ReturnValue

Αριθμός χαρακτήρων που γράφτηκαν.

## Δείτε επίσης

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
