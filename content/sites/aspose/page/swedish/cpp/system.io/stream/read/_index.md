---
title: "System::IO::Stream::Read metod"
linktitle: "Läs"
second_title: "Aspose.Page för C++"
description: "System::IO::Stream::Read metod. Läser det angivna antalet byte från strömmen och skriver dem till den angivna bytearrayen i C++."
type: docs
weight: 1800
url: /sv/cpp/system.io/stream/read/
---
## Stream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Läser det angivna antalet byte från strömmen och skriver dem till den angivna bytearrayen.

```cpp
virtual int32_t System::IO::Stream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const ArrayPtr\<uint8_t\>\& | Bytearrayen att skriva de lästa bytena till. |
| offset | int32_t | En 0-baserad position i **buffer** att börja skriva vid |
| count | int32_t | Antalet byte att läsa |

### ReturnValue

Antalet lästa byte

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Läser det angivna antalet byte från strömmen och skriver dem till den angivna bytearrayen.

```cpp
virtual int32_t System::IO::Stream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const System::Details::ArrayView\<uint8_t\>\& | Bytearrayvyn att skriva de lästa byten till |
| offset | int32_t | En 0-baserad position i **buffer** att börja skriva vid |
| count | int32_t | Antalet byte att läsa |

### ReturnValue

Antalet lästa byte

## Se även

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Read(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


Läser det angivna antalet byte från strömmen och skriver dem till den angivna bytearrayen.

```cpp
template<std::size_t> int32_t System::IO::Stream::Read(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| Parameter | Beskrivning |
| --- | --- |
| N | Storleken på stackarrayen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const System::Details::StackArray\<uint8_t, N\>\& | Den byte‑stack‑arrayen att skriva de lästa byten till |
| offset | int32_t | En 0-baserad position i **buffer** att börja skriva vid |
| count | int32_t | Antalet byte att läsa |

### ReturnValue

Antalet lästa byte

## Se även

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
