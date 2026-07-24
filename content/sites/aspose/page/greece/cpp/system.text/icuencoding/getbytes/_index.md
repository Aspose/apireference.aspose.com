---
title: "Μέθοδος System::Text::ICUEncoding::GetBytes"
linktitle: "GetBytes"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Text::ICUEncoding::GetBytes. Λαμβάνει τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων σε C++."
type: docs
weight: 300
url: /el/cpp/system.text/icuencoding/getbytes/
---
## ICUEncoding::GetBytes(ArrayPtr\<char_t\>) method


Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Χαρακτήρες για κωδικοποίηση. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) method


Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων.

```cpp
virtual int System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Χαρακτήρες για κωδικοποίηση. |
| char_index | int | Αρχή τμήματος χαρακτήρα. |
| char_count | int | Αριθμός χαρακτήρων προς μετατροπή. |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) για τοποθέτηση χαρακτήρων. |
| byte_index | int | Μετατόπιση buffer εξόδου. |

### ReturnValue

Αριθμός γραμμένων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetBytes(ArrayPtr\<char_t\>, int, int) method


Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int index, int count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Χαρακτήρες για κωδικοποίηση. |
| δείκτης | int | Αρχή τμήματος χαρακτήρα. |
| count | int | Αριθμός χαρακτήρων προς μετατροπή. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetBytes(const char_t *, int, uint8_t *, int) method


Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων.

```cpp
int System::Text::ICUEncoding::GetBytes(const char_t *chars, int char_count, uint8_t *bytes, int byte_count) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| chars | const char_t * | Χαρακτήρες για κωδικοποίηση. |
| char_count | int | Αριθμός χαρακτήρων προς μετατροπή. |
| bytes | uint8_t * | [Buffer](../../../system/buffer/) για τοποθέτηση χαρακτήρων. |
| byte_count | int | Μέγεθος buffer εξόδου. |

### ReturnValue

Αριθμός γραμμένων byte.

## Δείτε επίσης

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetBytes(const String\&) method


Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const String &s)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) για κωδικοποίηση. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetBytes(const String\&, int, int, ArrayPtr\<uint8_t\>, int) method


Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων.

```cpp
virtual int System::Text::Encoding::GetBytes(const String &s, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) για κωδικοποίηση. |
| char_index | int | Αρχή τμήματος χαρακτήρα. |
| char_count | int | Αριθμός χαρακτήρων προς μετατροπή. |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) για τοποθέτηση χαρακτήρων. |
| byte_index | int | Μετατόπιση buffer εξόδου. |

### ReturnValue

Αριθμός γραμμένων byte.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetBytes(const System::Details::ArrayView\<char_t\>\&, int, int) method


Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::ArrayView<char_t> &chars, int index, int count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| chars | const System::Details::ArrayView\<char_t\>\& | Χαρακτήρες για κωδικοποίηση. |
| δείκτης | int | Αρχή τμήματος χαρακτήρα. |
| count | int | Αριθμός χαρακτήρων προς μετατροπή. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetBytes(const System::Details::StackArray\<char_t, N\>\&, int, int) method


Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων.

```cpp
template<std::size_t> ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::StackArray<char_t, N> &chars, int index, int count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| chars | const System::Details::StackArray\<char_t, N\>\& | Χαρακτήρες για κωδικοποίηση. |
| δείκτης | int | Αρχή τμήματος χαρακτήρα. |
| count | int | Αριθμός χαρακτήρων προς μετατροπή. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetBytes(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) method


Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων.

```cpp
virtual int System::Text::Encoding::GetBytes(System::Details::ArrayView<char_t> chars, int char_index, int char_count, System::Details::ArrayView<uint8_t> bytes, int byte_index)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| chars | System::Details::ArrayView\<char_t\> | Χαρακτήρες για κωδικοποίηση. |
| char_index | int | Αρχή τμήματος χαρακτήρα. |
| char_count | int | Αριθμός χαρακτήρων προς μετατροπή. |
| bytes | System::Details::ArrayView\<uint8_t\> | [Buffer](../../../system/buffer/) για τοποθέτηση χαρακτήρων. |
| byte_index | int | Μετατόπιση buffer εξόδου. |

### ReturnValue

Αριθμός γραμμένων byte.

## Δείτε επίσης

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetBytes(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) method


Λάβετε τα byte που προκύπτουν από την κωδικοποίηση ενός buffer χαρακτήρων.

```cpp
template<std::size_t,std::size_t> int System::Text::Encoding::GetBytes(System::Details::StackArray<char_t, SC> &chars, int char_index, int char_count, System::Details::StackArray<uint8_t, SB> &bytes, int byte_index)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| chars | System::Details::StackArray\<char_t, SC\>\& | Χαρακτήρες για κωδικοποίηση. |
| char_index | int | Αρχή τμήματος χαρακτήρα. |
| char_count | int | Αριθμός χαρακτήρων προς μετατροπή. |
| bytes | System::Details::StackArray\<uint8_t, SB\>\& | [Buffer](../../../system/buffer/) για τοποθέτηση χαρακτήρων. |
| byte_index | int | Μετατόπιση buffer εξόδου. |

### ReturnValue

Αριθμός γραμμένων byte.

## Δείτε επίσης

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
