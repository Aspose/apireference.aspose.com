---
title: "System::IO::StreamWriter::StreamWriter конструктор"
linktitle: "StreamWriter"
second_title: "Aspose.Page для C++"
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
| поток | const SharedPtr\<Stream\>\& | Подлежащий поток для записи символов |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Создаёт экземпляр объекта [StreamWriter](../), который записывает символы в указанный подлежащий поток, используя указанную кодировку и буфер размером по умолчанию 1024 байта.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | const SharedPtr\<Stream\>\& | Подлежащий поток для записи символов |
| кодировка | const EncodingPtr\& | Кодировка для использования |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) constructor


Создаёт экземпляр объекта [StreamWriter](../), который записывает символы в указанный подлежащий поток, используя указанную кодировку и буфер заданного размера. Параметр указывает, следует ли закрывать подлежащий поток при освобождении объекта [StreamWriter](../).

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, int buffer_size, bool leave_open=false)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | const SharedPtr\<Stream\>\& | Подлежащий поток для записи символов |
| кодировка | const EncodingPtr\& | Кодировка для использования |
| buffer_size | int | Минимальный размер буфера в байтах |
| leave_open | bool | Указывает, следует ли оставлять подлежащий поток открытым после освобождения текущего объекта [StreamWriter](../) |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&) constructor


Создаёт экземпляр объекта [StreamWriter](../), который записывает символы в указанный файл, используя кодировку UTF-8 и буфер размером по умолчанию 1024 байта.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const String\& | Путь к файлу, в который записываются символы |

## См. также

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&, int) constructor


Создаёт экземпляр объекта [StreamWriter](../), который записывает символы в указанный файл, используя указанную кодировку и размер буфера. Параметр указывает, следует ли добавлять данные в файл или перезаписывать файл.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding, int buffer_size)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const String\& | Путь к файлу, в который записываются символы |
| append | bool | Указывает, следует ли добавлять данные в указанный файл (true) или перезаписать файл (false) |
| кодировка | const EncodingPtr\& | Кодировка для использования |
| buffer_size | int | Размер буфера для использования |

## См. также

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&) constructor


Создаёт экземпляр объекта [StreamWriter](../), который записывает символы в указанный файл, используя указанную кодировку и буфер размером по умолчанию 1024 байта. Параметр указывает, следует ли добавлять данные в файл или перезаписывать файл.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked())
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const String\& | Путь к файлу, в который записываются символы |
| append | bool | Указывает, следует ли добавлять данные в указанный файл (true) или перезаписать файл (false) |
| кодировка | const EncodingPtr\& | Кодировка для использования |

## См. также

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
