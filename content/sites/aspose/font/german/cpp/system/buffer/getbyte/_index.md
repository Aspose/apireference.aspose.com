---
title: "System::Buffer::GetByte-Methode"
linktitle: "GetByte"
second_title: "Aspose.Font für C++"
description: "System::Buffer::GetByte-Methode. Interpretiert das angegebene typisierte Array als rohes Byte-Array und ruft den Byte-Wert am angegebenen Byte-Offset in C++ ab."
type: docs
weight: 300
url: /de/cpp/system/buffer/getbyte/
---
## Buffer::GetByte(const SharedPtr\<Array\<T\>\>\&, int) method


Interpretieren das angegebene typisierte Array als rohes Byte‑Array und rufen den Byte‑Wert am angegebenen Byte‑Offset ab.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const SharedPtr<Array<T>> &array, int index)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der Elemente des Arrays |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Array | const SharedPtr\<Array\<T\>\>\& | Das Ziel-Array |
| Index | int | Nullbasierter Offset des abzurufenden Bytes |

### ReturnValue

Der Byte-Wert am angegebenen Index

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::GetByte(const System::Details::ArrayView\<T\>\&, int) method


Interpretieren das angegebene typisierte Array als rohes Byte‑Array und rufen den Byte‑Wert am angegebenen Byte‑Offset ab.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const System::Details::ArrayView<T> &array, int index)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der Elemente der Array-Ansicht |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Array | const System::Details::ArrayView\<T\>\& | Die Ziel-Array-Ansicht |
| Index | int | Nullbasierter Offset des abzurufenden Bytes |

### ReturnValue

Der Byte-Wert am angegebenen Index

## Siehe auch

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::GetByte(const System::Details::StackArray\<T, N\>\&, int) method


Interpretieren das angegebene typisierte Array als rohes Byte‑Array und rufen den Byte‑Wert am angegebenen Byte‑Offset ab.

```cpp
template<typename T,std::size_t> static uint8_t System::Buffer::GetByte(const System::Details::StackArray<T, N> &array, int index)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der Elemente des Stack-Arrays |
| N | Die Größe des Stack-Arrays |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Array | const System::Details::StackArray\<T, N\>\& | Das Ziel-Stack-Array |
| Index | int | Nullbasierter Offset des abzurufenden Bytes |

### ReturnValue

Der Byte-Wert am angegebenen Index

## Siehe auch

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
