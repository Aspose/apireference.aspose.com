---
title: "System::IO::StreamReader::StreamReader конструктор"
linktitle: "StreamReader"
second_title: "Aspose.Font для C++"
description: "System::IO::StreamReader::StreamReader конструктор. Создаёт экземпляр объекта StreamReader, который считывает символы из указанного базового потока, используя кодировку UTF-8 и буфер размером по умолчанию 1024 байта в C++."
type: docs
weight: 100
url: /ru/cpp/system.io/streamreader/streamreader/
---
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&) constructor


Создаёт экземпляр объекта [StreamReader](../), который считывает символы из указанного базового потока, используя кодировку UTF-8 и буфер размером по умолчанию 1024 байта.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | const SharedPtr\<Stream\>\& | Базовый поток, из которого считываются символы |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, bool) constructor


Создаёт экземпляр объекта [StreamReader](../), который считывает символы из указанного базового потока, используя кодировку UTF-8 и буфер размером по умолчанию 1024 байта. Параметр указывает, следует ли включить обнаружение маркера порядка байтов.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, bool detectEncodingFromByteOrderMarks)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | const SharedPtr\<Stream\>\& | Базовый поток, из которого считываются символы |
| detectEncodingFromByteOrderMarks | bool | True, если нужно искать маркеры порядка байтов в начале потока, иначе — false |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Создаёт экземпляр объекта [StreamReader](../), который считывает символы из указанного базового потока, используя заданную кодировку и буфер размером по умолчанию 1024 байта.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | const SharedPtr\<Stream\>\& | Базовый поток, из которого считываются символы |
| encoding | const EncodingPtr\& | Кодировка для использования |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) constructor


Создаёт экземпляр объекта [StreamReader](../), который считывает символы из указанного базового потока, используя заданную кодировку и буфер размером по умолчанию 1024 байта. Параметр указывает, следует ли включить обнаружение маркера порядка байтов.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | const SharedPtr\<Stream\>\& | Базовый поток, из которого считываются символы |
| encoding | const EncodingPtr\& | Кодировка для использования |
| detectEncodingFromByteOrderMarks | bool | True, если нужно искать маркеры порядка байтов в начале потока, иначе — false |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) constructor


Создаёт экземпляр объекта [StreamReader](../), который считывает символы из указанного базового потока, используя заданную кодировку и буфер указанного размера. Параметр указывает, следует ли включить обнаружение маркера порядка байтов.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | const SharedPtr\<Stream\>\& | Базовый поток, из которого считываются символы |
| encoding | const EncodingPtr\& | Кодировка для использования |
| detectEncodingFromByteOrderMarks | bool | True, если нужно искать маркеры порядка байтов в начале потока, иначе — false |
| bufferSize | int | Минимальный размер буфера в байтах |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&) constructor


Создаёт экземпляр объекта [StreamReader](../), который считывает символы из указанного файла, используя кодировку UTF-8 и буфер размером по умолчанию 4096 байт.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const System::String\& | Путь к файлу, из которого считываются символы |

## См. также

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, bool) constructor


Создаёт экземпляр объекта [StreamReader](../), который считывает символы из указанного файла, используя кодировку UTF-8 и буфер размером по умолчанию 4096 байт. Параметр указывает, следует ли включить обнаружение маркера порядка байтов.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, bool detectEncodingFromByteOrderMarks)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const System::String\& | Путь к файлу, из которого считываются символы |
| detectEncodingFromByteOrderMarks | bool | True, если нужно искать маркеры порядка байтов в начале файла, иначе — false |

## См. также

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&) constructor


Создаёт экземпляр объекта [StreamReader](../), который считывает символы из указанного файла, используя заданную кодировку и буфер размером по умолчанию 4096 байт.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const System::String\& | Путь к файлу, из которого считываются символы |
| encoding | const EncodingPtr\& | Кодировка для использования |

## См. также

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool) constructor


Создаёт экземпляр объекта [StreamReader](../), который считывает символы из указанного базового потока, используя заданную кодировку и буфер размером по умолчанию 4096 байт. Параметр указывает, следует ли включить обнаружение маркера порядка байтов.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const System::String\& | Путь к файлу, из которого считываются символы |
| encoding | const EncodingPtr\& | Кодировка для использования |
| detectEncodingFromByteOrderMarks | bool | True, если нужно искать маркеры порядка байтов в начале файла, иначе — false |

## См. также

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool, int) constructor


Создаёт экземпляр объекта [StreamReader](../), который считывает символы из указанного файла, используя заданную кодировку и буфер указанного размера. Параметр указывает, следует ли включить обнаружение маркера порядка байтов.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const System::String\& | Путь к файлу, из которого считываются символы |
| encoding | const EncodingPtr\& | Кодировка для использования |
| detectEncodingFromByteOrderMarks | bool | True, если нужно искать маркеры порядка байтов в начале файла, иначе — false |
| bufferSize | int | Минимальный размер буфера в байтах |

## См. также

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
