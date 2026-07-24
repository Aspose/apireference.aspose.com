---
title: "System::Text::Encoding::GetEncoding μέθοδος"
linktitle: "GetEncoding"
second_title: "Aspose.Page για C++"
description: "System::Text::Encoding::GetEncoding μέθοδος. Λαμβάνει κωδικοποίηση με όνομα σε C++."
type: docs
weight: 4100
url: /el/cpp/system.text/encoding/getencoding/
---
## Encoding::GetEncoding(const String\&) method


Λαμβάνει κωδικοποίηση με βάση το όνομα.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(const String &name)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| name | const String\& | [Κωδικοποίηση](../) όνομα. |

### ReturnValue

[Encoding](../) of specified name.

## Δείτε επίσης

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [String](../../../system/string/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetEncoding(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) method


Λαμβάνει κωδικοποίηση με βάση το όνομα.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(const String &name, const EncoderFallbackPtr &encoder_fallback, const DecoderFallbackPtr &decoder_fallback)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| name | const String\& | [Κωδικοποίηση](../) όνομα. |
| encoder_fallback | const EncoderFallbackPtr\& | Εναλλακτική λύση για χρήση στην κωδικοποίηση. |
| decoder_fallback | const DecoderFallbackPtr\& | Εναλλακτική λύση για χρήση στην αποκωδικοποίηση. |

### ReturnValue

[Encoding](../) of specified name.

## Δείτε επίσης

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [String](../../../system/string/)
* Typedef [EncoderFallbackPtr](../../../system/encoderfallbackptr/)
* Typedef [DecoderFallbackPtr](../../../system/decoderfallbackptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetEncoding(int) method


Λαμβάνει κωδικοποίηση με βάση τη σελίδα κώδικα.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(int codepage)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| codepage | int | Αριθμός κωδικής σελίδας. |

### ReturnValue

[Encoding](../) of specified codepage.

## Δείτε επίσης

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetEncoding(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) method


Λαμβάνει κωδικοποίηση με βάση τη σελίδα κώδικα.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(int codepage, const EncoderFallbackPtr &encoder_fallback, const DecoderFallbackPtr &decoder_fallback)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| codepage | int | Αριθμός κωδικής σελίδας. |
| encoder_fallback | const EncoderFallbackPtr\& | Εναλλακτική λύση για χρήση στην κωδικοποίηση. |
| decoder_fallback | const DecoderFallbackPtr\& | Εναλλακτική λύση για χρήση στην αποκωδικοποίηση. |

### ReturnValue

[Encoding](../) of specified codepage.

## Δείτε επίσης

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Typedef [EncoderFallbackPtr](../../../system/encoderfallbackptr/)
* Typedef [DecoderFallbackPtr](../../../system/decoderfallbackptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
