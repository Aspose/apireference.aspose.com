---
title: "System::IO::StreamWriter::StreamWriter constructor"
linktitle: "StreamWriter"
second_title: "Aspose.Page voor C++"
description: "System::IO::StreamWriter::StreamWriter constructor. Maakt een instantie van een StreamWriter-object dat tekens schrijft naar de opgegeven onderliggende stream met UTF-8-codering en een buffer met een standaardgrootte van 1024 bytes in C++."
type: docs
weight: 100
url: /nl/cpp/system.io/streamwriter/streamwriter/
---
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&) constructor


Maakt een instantie van een [StreamWriter](../)-object dat tekens schrijft naar de opgegeven onderliggende stream met UTF-8-codering en een buffer met een standaardgrootte van 1024 bytes.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | De onderliggende stream om tekens naar te schrijven |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Maakt een instantie van een [StreamWriter](../)-object dat tekens schrijft naar de opgegeven onderliggende stream met de opgegeven codering en een buffer met een standaardgrootte van 1024 bytes.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | De onderliggende stream om tekens naar te schrijven |
| encoding | const EncodingPtr\& | De te gebruiken codering |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) constructor


Maakt een instantie van een [StreamWriter](../)-object dat tekens schrijft naar de opgegeven onderliggende stream met de opgegeven codering en een buffer van de opgegeven grootte. Een parameter geeft aan of de onderliggende stream moet worden gesloten wanneer het [StreamWriter](../)-object wordt verwijderd.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, int buffer_size, bool leave_open=false)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | De onderliggende stream om tekens naar te schrijven |
| encoding | const EncodingPtr\& | De te gebruiken codering |
| buffer_size | int | De minimale grootte van de buffer in bytes |
| leave_open | bool | Geeft aan of de onderliggende stream open moet blijven nadat het huidige [StreamWriter](../)-object is verwijderd |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&) constructor


Maakt een instantie van een [StreamWriter](../)-object dat tekens schrijft naar het opgegeven bestand met UTF-8-codering en een buffer met een standaardgrootte van 1024 bytes.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const String\& | Het pad van het bestand om tekens naar te schrijven |

## Zie ook

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&, int) constructor


Maakt een instantie van een [StreamWriter](../)-object dat tekens schrijft naar het opgegeven bestand met de opgegeven codering en buffergrootte. Een parameter geeft aan of de gegevens aan het bestand moeten worden toegevoegd of dat het bestand moet worden overschreven.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding, int buffer_size)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const String\& | Het pad van het bestand om tekens naar te schrijven |
| toevoegen | bool | Geeft aan of de gegevens moeten worden toegevoegd aan het opgegeven bestand (true) of dat het bestand moet worden overschreven (false) |
| encoding | const EncodingPtr\& | De te gebruiken codering |
| buffer_size | int | De grootte van de te gebruiken buffer |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&) constructor


Construeert een instantie van het [StreamWriter](../)-object dat tekens naar het opgegeven bestand schrijft met de opgegeven codering en een buffer met een standaardgrootte van 1024 bytes. Een parameter geeft aan of de gegevens aan het bestand moeten worden toegevoegd of dat het bestand moet worden overschreven.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const String\& | Het pad van het bestand om tekens naar te schrijven |
| toevoegen | bool | Geeft aan of de gegevens moeten worden toegevoegd aan het opgegeven bestand (true) of dat het bestand moet worden overschreven (false) |
| encoding | const EncodingPtr\& | De te gebruiken codering |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
