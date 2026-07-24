---
title: "System::IO::MemoryStream::MemoryStream конструктор"
linktitle: "MemoryStream"
second_title: "Aspose.Page для C++"
description: "System::IO::MemoryStream::MemoryStream конструктор. Создаёт новый экземпляр класса MemoryStream с начальной ёмкостью, равной 0, в C++."
type: docs
weight: 100
url: /ru/cpp/system.io/memorystream/memorystream/
---
## MemoryStream::MemoryStream() constructor


Создаёт новый экземпляр класса [MemoryStream](../) с начальной ёмкостью, равной 0.

```cpp
System::IO::MemoryStream::MemoryStream()
```

## См. также

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, bool) constructor


Создаёт новый экземпляр класса [MemoryStream](../), представляющего поток памяти, подключённый к указанному буферу памяти. Параметр указывает, может ли поток быть доступен для записи.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, bool writable=true)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| content | const ArrayPtr\<uint8_t\>\& | Массив байтов, используемый в качестве буфера памяти, на котором будет основан поток, представляемый создаваемым объектом. |
| записываемый | bool | Указывает, должен ли поток быть доступен для записи |

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) constructor


Создаёт новый экземпляр класса [MemoryStream](../), представляющего поток памяти, подключённый к сегменту указанного буфера памяти, начиная с указанного индекса и включающий указанное количество элементов. Параметры указывают, может ли поток быть доступен для записи и можно ли вызвать метод GetBytes().

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, int index, int count, bool writable=true, bool publiclyVisible=false)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| content | const ArrayPtr\<uint8_t\>\& | Массив байтов, сегмент которого будет использоваться в качестве буфера памяти, на котором будет основан поток, представляемый создаваемым объектом. |
| индекс | int | Индекс элемента в **content**, начинающийся с 0, с которого начинается сегмент |
| count | int | Количество элементов **content**, включённых в сегмент |
| записываемый | bool | Указывает, должен ли поток быть доступен для записи |
| publiclyVisible | bool | Указывает, следует ли делать базовый буфер памяти доступным вызывающему методу GetByte() |

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(int) constructor


Создаёт новый экземпляр класса [MemoryStream](../), представляющего поток, основанный на буфере памяти указанного размера.

```cpp
System::IO::MemoryStream::MemoryStream(int capacity_)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| capacity_ | int | Размер в байтах памяти буфера, связанного с потоком, представляемым создаваемым объектом |

## См. также

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
