---
title: "System::Text::UTF7Encoding::GetBytes methode"
linktitle: "GetBytes"
second_title: "Aspose.Page voor C++"
description: "System::Text::UTF7Encoding::GetBytes methode. Haalt de bytes op die ontstaan bij het coderen van een tekenbuffer in C++."
type: docs
weight: 500
url: /nl/cpp/system.text/utf7encoding/getbytes/
---
## UTF7Encoding::GetBytes(ArrayPtr\<char_t\>) method


Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekens | ArrayPtr\<char_t\> | Tekens om te coderen. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## UTF7Encoding::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) method


Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer.

```cpp
int System::Text::UTF7Encoding::GetBytes(ArrayPtr<char_t> chars, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekens | ArrayPtr\<char_t\> | Tekens om te coderen. |
| char_index | int | Begin van tekenfragment. |
| char_count | int | Aantal tekens om te converteren. |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) om tekens in te plaatsen. |
| byte_index | int | Offset van de uitvoerbuffer. |

### ReturnValue

Aantal geschreven bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## UTF7Encoding::GetBytes(ArrayPtr\<char_t\>, int, int) method


Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int index, int count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekens | ArrayPtr\<char_t\> | Tekens om te coderen. |
| index | int | Begin van tekenfragment. |
| count | int | Aantal tekens om te converteren. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## UTF7Encoding::GetBytes(const char_t *, int, uint8_t *, int) method


Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer.

```cpp
int System::Text::UTF7Encoding::GetBytes(const char_t *chars, int char_count, uint8_t *bytes, int byte_count) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekens | const char_t * | Tekens om te coderen. |
| char_count | int | Aantal tekens om te converteren. |
| bytes | uint8_t * | [Buffer](../../../system/buffer/) om tekens in te plaatsen. |
| byte_count | int | Grootte van uitvoerbuffer. |

### ReturnValue

Aantal geschreven bytes.

## Zie ook

* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## UTF7Encoding::GetBytes(const String\&) method


Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const String &s)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) om te coderen. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## UTF7Encoding::GetBytes(const String\&, int, int, ArrayPtr\<uint8_t\>, int) method


Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer.

```cpp
int System::Text::UTF7Encoding::GetBytes(const String &s, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) om te coderen. |
| char_index | int | Begin van tekenfragment. |
| char_count | int | Aantal tekens om te converteren. |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) om tekens in te plaatsen. |
| byte_index | int | Offset van de uitvoerbuffer. |

### ReturnValue

Aantal geschreven bytes.

## Zie ook

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## UTF7Encoding::GetBytes(const System::Details::ArrayView\<char_t\>\&, int, int) method


Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::ArrayView<char_t> &chars, int index, int count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekens | const System::Details::ArrayView\<char_t\>\& | Tekens om te coderen. |
| index | int | Begin van tekenfragment. |
| count | int | Aantal tekens om te converteren. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## UTF7Encoding::GetBytes(const System::Details::StackArray\<char_t, N\>\&, int, int) method


Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer.

```cpp
template<std::size_t> ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::StackArray<char_t, N> &chars, int index, int count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekens | const System::Details::StackArray\<char_t, N\>\& | Tekens om te coderen. |
| index | int | Begin van tekenfragment. |
| count | int | Aantal tekens om te converteren. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## UTF7Encoding::GetBytes(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) method


Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer.

```cpp
virtual int System::Text::Encoding::GetBytes(System::Details::ArrayView<char_t> chars, int char_index, int char_count, System::Details::ArrayView<uint8_t> bytes, int byte_index)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekens | System::Details::ArrayView\<char_t\> | Tekens om te coderen. |
| char_index | int | Begin van tekenfragment. |
| char_count | int | Aantal tekens om te converteren. |
| bytes | System::Details::ArrayView\<uint8_t\> | [Buffer](../../../system/buffer/) om tekens in te plaatsen. |
| byte_index | int | Offset van de uitvoerbuffer. |

### ReturnValue

Aantal geschreven bytes.

## Zie ook

* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## UTF7Encoding::GetBytes(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) method


Haal de bytes op die het resultaat zijn van het coderen van een tekenbuffer.

```cpp
template<std::size_t,std::size_t> int System::Text::Encoding::GetBytes(System::Details::StackArray<char_t, SC> &chars, int char_index, int char_count, System::Details::StackArray<uint8_t, SB> &bytes, int byte_index)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekens | System::Details::StackArray\<char_t, SC\>\& | Tekens om te coderen. |
| char_index | int | Begin van tekenfragment. |
| char_count | int | Aantal tekens om te converteren. |
| bytes | System::Details::StackArray\<uint8_t, SB\>\& | [Buffer](../../../system/buffer/) om tekens in te plaatsen. |
| byte_index | int | Offset van de uitvoerbuffer. |

### ReturnValue

Aantal geschreven bytes.

## Zie ook

* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
