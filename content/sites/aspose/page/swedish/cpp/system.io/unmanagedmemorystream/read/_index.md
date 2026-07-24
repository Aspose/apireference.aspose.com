---
title: "System::IO::UnmanagedMemoryStream::Read method"
linktitle: "Läs"
second_title: "Aspose.Page för C++"
description: "System::IO::UnmanagedMemoryStream::Read method. Läser det angivna antalet byte från strömmen och skriver dem till den angivna bytearrayen i C++."
type: docs
weight: 1000
url: /sv/cpp/system.io/unmanagedmemorystream/read/
---
## UnmanagedMemoryStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Läser det angivna antalet byte från strömmen och skriver dem till den angivna bytearrayen.

```cpp
virtual int32_t System::IO::UnmanagedMemoryStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
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
* Class [UnmanagedMemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## UnmanagedMemoryStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Läser det angivna antalet byte från strömmen och skriver dem till den angivna bytearrayen.

```cpp
virtual int32_t System::IO::UnmanagedMemoryStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const System::Details::ArrayView\<uint8_t\>\& | Bytearrayvyn att skriva de lästa byten till |
| offset | int32_t | En 0-baserad position i **buffer** att börja skriva vid |
| count | int32_t | Antalet byte att läsa |

### ReturnValue

Antalet lästa byte

## Se även

* Class [UnmanagedMemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
