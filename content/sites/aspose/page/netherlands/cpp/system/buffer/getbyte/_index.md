---
title: "System::Buffer::GetByte methode"
linktitle: "GetByte"
second_title: "Aspose.Page voor C++"
description: "System::Buffer::GetByte methode. Interpreteert de gespecificeerde getypeerde array als een ruwe byte-array en haalt de byte-waarde op op de opgegeven byte-offset in C++."
type: docs
weight: 300
url: /nl/cpp/system/buffer/getbyte/
---
## Buffer::GetByte(const SharedPtr\<Array\<T\>\>\&, int) method


Interpreteert de opgegeven getypeerde array als een ruwe byte-array en haalt de byte-waarde op op de opgegeven byte-offset.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const SharedPtr<Array<T>> &array, int index)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type elementen van de array |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| array | const SharedPtr\<Array\<T\>\>\& | De doelarray |
| index | int | Nulgebaseerde offset van de byte die opgehaald moet worden |

### ReturnValue

De byte-waarde op de opgegeven index

## Zie ook

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::GetByte(const System::Details::ArrayView\<T\>\&, int) method


Interpreteert de opgegeven getypeerde array als een ruwe byte-array en haalt de byte-waarde op op de opgegeven byte-offset.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const System::Details::ArrayView<T> &array, int index)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van de elementen van de arrayweergave |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| array | const System::Details::ArrayView\<T\>\& | De doel-arrayweergave |
| index | int | Nulgebaseerde offset van de byte die opgehaald moet worden |

### ReturnValue

De byte-waarde op de opgegeven index

## Zie ook

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::GetByte(const System::Details::StackArray\<T, N\>\&, int) method


Interpreteert de opgegeven getypeerde array als een ruwe byte-array en haalt de byte-waarde op op de opgegeven byte-offset.

```cpp
template<typename T,std::size_t> static uint8_t System::Buffer::GetByte(const System::Details::StackArray<T, N> &array, int index)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van de elementen van de stack-array |
| N | De grootte van de stack-array |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| array | const System::Details::StackArray\<T, N\>\& | De doel-stack-array |
| index | int | Nulgebaseerde offset van de byte die opgehaald moet worden |

### ReturnValue

De byte-waarde op de opgegeven index

## Zie ook

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
