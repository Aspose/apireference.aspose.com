---
title: "System::Buffer::SetByte metod"
linktitle: "SetByte"
second_title: "Aspose.Page för C++"
description: "System::Buffer::SetByte metod. Tolkar den angivna typade arrayen som en rå byte-array och sätter det angivna bytevärdet vid angivet byteoffset i C++."
type: docs
weight: 400
url: /sv/cpp/system/buffer/setbyte/
---
## Buffer::SetByte(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) method


Tolkar den angivna typade arrayen som en rå bytearray och sätter det angivna bytevärdet vid angivet byteoffset.

```cpp
template<typename T> static void System::Buffer::SetByte(const SharedPtr<Array<T>> &array, int index, uint8_t value)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av element i arrayen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| array | const SharedPtr\<Array\<T\>\>\& | Målarrayen |
| index | int | Nollbaserat offset för byte som ska sättas |
| value | uint8_t | Bytevärdet att sätta |

## Se även

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::SetByte(const System::Details::ArrayView\<T\>\&, int, uint8_t) method


Tolkar den angivna typade arrayen som en rå bytearray och sätter det angivna bytevärdet vid angivet byteoffset.

```cpp
template<typename T> static void System::Buffer::SetByte(const System::Details::ArrayView<T> &array, int index, uint8_t value)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av element i arrayen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| array | const System::Details::ArrayView\<T\>\& | Målarrayvy |
| index | int | Nollbaserat offset för byte som ska sättas |
| value | uint8_t | Bytevärdet att sätta |

## Se även

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::SetByte(const System::Details::StackArray\<T, N\>\&, int, uint8_t) method


Tolkar den angivna typade arrayen som en rå bytearray och sätter det angivna bytevärdet vid angivet byteoffset.

```cpp
template<typename T,std::size_t> static void System::Buffer::SetByte(const System::Details::StackArray<T, N> &array, int index, uint8_t value)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av element i arrayen |
| N | Storleken på stackarrayen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| array | const System::Details::StackArray\<T, N\>\& | Målstackarrayen |
| index | int | Nollbaserat offset för byte som ska sättas |
| value | uint8_t | Bytevärdet att sätta |

## Se även

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
