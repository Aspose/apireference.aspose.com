---
title: "System::IO::StreamWriter::StreamWriter конструктор"
linktitle: "StreamWriter"
second_title: "Aspose.Font для C++"
description: "System::IO::StreamWriter::StreamWriter конструктор. Создаёт экземпляр объекта StreamWriter, который записывает символы в указанный базовый поток, используя кодировку UTF-8 и буфер размером по умолчанию 1024 байта в C++."
type: docs
weight: 100
url: /ru/cpp/system.io/streamwriter/streamwriter/
---
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&) constructor


Создаёт экземпляр объекта [StreamWriter](../), который записывает символы в указанный базовый поток, используя кодировку UTF-8 и буфер размером по умолчанию 1024 байта.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | const SharedPtr\<Stream\>\& | Базовый поток для записи символов |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Создаёт экземпляр объекта [StreamWriter](../), который записывает символы в указанный базовый поток, используя указанную кодировку и буфер размером по умолчанию 1024 байта.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | const SharedPtr\<Stream\>\& | Базовый поток для записи символов |
| encoding | const EncodingPtr\& | Кодировка для использования |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) constructor


Создаёт экземпляр объекта [StreamWriter](../), который записывает символы в указанный базовый поток, используя указанную кодировку и буфер указанного размера. Параметр определяет, следует ли закрывать базовый поток при освобождении объекта [StreamWriter](../).

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, int buffer_size, bool leave_open=false)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | const SharedPtr\<Stream\>\& | Базовый поток для записи символов |
| encoding | const EncodingPtr\& | Кодировка для использования |
| buffer_size | int | Минимальный размер буфера в байтах |
| leave_open | bool | Указывает, следует ли оставлять базовый поток открытым после освобождения текущего объекта [StreamWriter](../) |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&) constructor


Создаёт экземпляр объекта [StreamWriter](../), который записывает символы в указанный файл, используя кодировку UTF-8 и буфер размером по умолчанию 1024 байта.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const String\& | Путь к файлу, в который будут записываться символы |

## См. также

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&, int) constructor


Создаёт экземпляр объекта [StreamWriter](../), который записывает символы в указанный файл, используя заданную кодировку и размер буфера. Параметр указывает, следует ли добавлять данные в файл или перезаписать файл.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding, int buffer_size)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const String\& | Путь к файлу, в который будут записываться символы |
| append | bool | Указывает, следует ли добавить данные в указанный файл (true) или перезаписать файл (false) |
| encoding | const EncodingPtr\& | Кодировка для использования |
| buffer_size | int | Размер буфера, который следует использовать |

## См. также

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&) constructor


Создаёт экземпляр объекта [StreamWriter](../), который записывает символы в указанный файл, используя заданную кодировку и буфер размером по умолчанию 1024 байта. Параметр указывает, следует ли добавить данные в файл или перезаписать файл.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked())
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const String\& | Путь к файлу, в который будут записываться символы |
| append | bool | Указывает, следует ли добавить данные в указанный файл (true) или перезаписать файл (false) |
| encoding | const EncodingPtr\& | Кодировка для использования |

## См. также

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
