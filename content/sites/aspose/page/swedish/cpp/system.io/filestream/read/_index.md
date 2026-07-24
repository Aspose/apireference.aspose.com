---
title: "System::IO::FileStream::Read metod"
linktitle: "Läs"
second_title: "Aspose.Page för C++"
description: "System::IO::FileStream::Read metod. Läser det angivna antalet byte från strömmen och skriver dem till den angivna bytearrayen i C++."
type: docs
weight: 1300
url: /sv/cpp/system.io/filestream/read/
---
## FileStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Läser det angivna antalet byte från strömmen och skriver dem till den angivna bytearrayen.

```cpp
int32_t System::IO::FileStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const ArrayPtr\<uint8_t\>\& | Bytearrayen att skriva de lästa byten till. |
| offset | int32_t | En 0-baserad position i **buffer** att börja skriva vid. |
| count | int32_t | Antalet byte att läsa. |

### ReturnValue

Antalet lästa byte.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Läser det angivna antalet byte från strömmen och skriver dem till den angivna bytearrayen.

```cpp
int32_t System::IO::FileStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const System::Details::ArrayView\<uint8_t\>\& | Bytearrayvyn att skriva de lästa byten till. |
| offset | int32_t | En 0-baserad position i **buffer** att börja skriva vid. |
| count | int32_t | Antalet byte att läsa. |

### ReturnValue

Antalet lästa byte.

## Se även

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
