---
title: "System::Buffer::SetByte-Methode"
linktitle: "SetByte"
second_title: "Aspose.Font für C++"
description: "System::Buffer::SetByte-Methode. Interpretiert das angegebene typisierte Array als rohes Byte-Array und setzt den angegebenen Byte-Wert an der angegebenen Byte-Position in C++."
type: docs
weight: 400
url: /de/cpp/system/buffer/setbyte/
---
## Buffer::SetByte(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) method


Interpretiert das angegebene typisierte Array als rohes Byte-Array und setzt den angegebenen Byte-Wert an der angegebenen Byte-Position.

```cpp
template<typename T> static void System::Buffer::SetByte(const SharedPtr<Array<T>> &array, int index, uint8_t value)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der Elemente des Arrays |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Array | const SharedPtr\<Array\<T\>\>\& | Das Ziel-Array |
| Index | int | Nullbasierter Offset des zu setzenden Bytes |
| Wert | uint8_t | Der zu setzende Byte-Wert |

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::SetByte(const System::Details::ArrayView\<T\>\&, int, uint8_t) method


Interpretiert das angegebene typisierte Array als rohes Byte-Array und setzt den angegebenen Byte-Wert an der angegebenen Byte-Position.

```cpp
template<typename T> static void System::Buffer::SetByte(const System::Details::ArrayView<T> &array, int index, uint8_t value)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der Elemente des Arrays |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Array | const System::Details::ArrayView\<T\>\& | Die Ziel-Array-Ansicht |
| Index | int | Nullbasierter Offset des zu setzenden Bytes |
| Wert | uint8_t | Der zu setzende Byte-Wert |

## Siehe auch

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::SetByte(const System::Details::StackArray\<T, N\>\&, int, uint8_t) method


Interpretiert das angegebene typisierte Array als rohes Byte-Array und setzt den angegebenen Byte-Wert an der angegebenen Byte-Position.

```cpp
template<typename T,std::size_t> static void System::Buffer::SetByte(const System::Details::StackArray<T, N> &array, int index, uint8_t value)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der Elemente des Arrays |
| N | Die Größe des Stack-Arrays |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Array | const System::Details::StackArray\<T, N\>\& | Das Ziel-Stack-Array |
| Index | int | Nullbasierter Offset des zu setzenden Bytes |
| Wert | uint8_t | Der zu setzende Byte-Wert |

## Siehe auch

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
