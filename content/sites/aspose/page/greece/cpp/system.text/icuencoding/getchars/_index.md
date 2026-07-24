---
title: "System::Text::ICUEncoding::GetChars μέθοδος"
linktitle: "GetChars"
second_title: "Aspose.Page για C++"
description: "System::Text::ICUEncoding::GetChars μέθοδος. Αποκτά τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός byte buffer σε C++."
type: docs
weight: 500
url: /el/cpp/system.text/icuencoding/getchars/
---
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>) method


Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer byte.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) για ανάγνωση bytes από. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer byte.

```cpp
virtual int System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int byte_index, int byte_count, ArrayPtr<char_t> chars, int char_index)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) για ανάγνωση bytes από. |
| byte_index | int | Μετατόπιση του buffer εισόδου. |
| byte_count | int | Μέγεθος buffer εισόδου. |
| chars | ArrayPtr\<char_t\> | [Buffer](../../../system/buffer/) για τοποθέτηση χαρακτήρων. |
| char_index | int | Μετατόπιση buffer εξόδου. |

### ReturnValue

Αριθμός γραμμένων χαρακτήρων.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>, int, int) method


Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer byte.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int index, int count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) για ανάγνωση bytes από. |
| δείκτης | int | Μετατόπιση του buffer εισόδου. |
| count | int | Μέγεθος buffer εισόδου. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetChars(const uint8_t *, int, char_t *, int) method


Λάβετε τους χαρακτήρες που προκύπτουν από την αποκωδικοποίηση ενός buffer byte.

```cpp
int System::Text::ICUEncoding::GetChars(const uint8_t *bytes, int byte_count, char_t *chars, int char_count) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| bytes | const uint8_t * | [Buffer](../../../system/buffer/) για ανάγνωση bytes από. |
| byte_count | int | Μέγεθος buffer εισόδου. |
| chars | char_t * | [Buffer](../../../system/buffer/) για τοποθέτηση χαρακτήρων. |
| char_count | int | Μέγεθος buffer εξόδου. |

### ReturnValue

Αριθμός γραμμένων χαρακτήρων.

## Δείτε επίσης

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
