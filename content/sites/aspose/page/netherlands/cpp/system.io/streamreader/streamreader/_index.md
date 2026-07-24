---
title: "System::IO::StreamReader::StreamReader constructor"
linktitle: "StreamReader"
second_title: "Aspose.Page voor C++"
description: "System::IO::StreamReader::StreamReader constructor. Maakt een instantie van het StreamReader‑object dat tekens leest van de opgegeven onderliggende stroom met UTF-8‑codering en een buffer met een standaardgrootte van 1024 bytes in C++."
type: docs
weight: 100
url: /nl/cpp/system.io/streamreader/streamreader/
---
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&) constructor


Maakt een instantie van het [StreamReader](../)‑object dat tekens leest van de opgegeven onderliggende stroom met UTF-8‑codering en een buffer met een standaardgrootte van 1024 bytes.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | De onderliggende stroom waaruit tekens gelezen worden |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, bool) constructor


Maakt een instantie van het [StreamReader](../)‑object dat tekens leest van de opgegeven onderliggende stroom met UTF-8‑codering en een buffer met een standaardgrootte van 1024 bytes. Een parameter geeft aan of detectie van een byte‑order‑mark moet worden ingeschakeld.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | De onderliggende stroom waaruit tekens gelezen worden |
| detectEncodingFromByteOrderMarks | bool | True om te zoeken naar byte‑order‑marks aan het begin van de stroom, anders – false |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Maakt een instantie van het [StreamReader](../)‑object dat tekens leest van de opgegeven onderliggende stroom met de opgegeven codering en een buffer met een standaardgrootte van 1024 bytes.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | De onderliggende stroom waaruit tekens gelezen worden |
| encoding | const EncodingPtr\& | De te gebruiken codering |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) constructor


Maakt een instantie van het [StreamReader](../)‑object dat tekens leest van de opgegeven onderliggende stroom met de opgegeven codering en een buffer met een standaardgrootte van 1024 bytes. Een parameter geeft aan of detectie van een byte‑order‑mark moet worden ingeschakeld.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | De onderliggende stroom waaruit tekens gelezen worden |
| encoding | const EncodingPtr\& | De te gebruiken codering |
| detectEncodingFromByteOrderMarks | bool | True om te zoeken naar byte‑order‑marks aan het begin van de stroom, anders – false |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) constructor


Maakt een instantie van het [StreamReader](../)‑object dat tekens leest van de opgegeven onderliggende stroom met de opgegeven codering en een buffer van de opgegeven grootte. Een parameter geeft aan of detectie van een byte‑order‑mark moet worden ingeschakeld.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | De onderliggende stroom waaruit tekens gelezen worden |
| encoding | const EncodingPtr\& | De te gebruiken codering |
| detectEncodingFromByteOrderMarks | bool | True om te zoeken naar byte‑order‑marks aan het begin van de stroom, anders – false |
| bufferSize | int | De minimale grootte van de buffer in bytes |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&) constructor


Maakt een instantie van het [StreamReader](../)‑object dat tekens leest van het opgegeven bestand met UTF-8‑codering en een buffer met een standaardgrootte van 4096 bytes.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const System::String\& | Het pad van het bestand waaruit tekens gelezen worden |

## Zie ook

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, bool) constructor


Maakt een instantie van het [StreamReader](../)‑object dat tekens leest van het opgegeven bestand met UTF-8‑codering en een buffer met een standaardgrootte van 4096 bytes. Een parameter geeft aan of detectie van een byte‑order‑mark moet worden ingeschakeld.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const System::String\& | Het pad van het bestand waaruit tekens gelezen worden |
| detectEncodingFromByteOrderMarks | bool | True om te zoeken naar byte‑order‑marks aan het begin van het bestand, anders – false |

## Zie ook

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&) constructor


Maakt een instantie van het [StreamReader](../)‑object dat tekens leest van het opgegeven bestand met de opgegeven codering en een buffer met een standaardgrootte van 4096 bytes.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const System::String\& | Het pad van het bestand waaruit tekens gelezen worden |
| encoding | const EncodingPtr\& | De te gebruiken codering |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool) constructor


Maakt een instantie van het [StreamReader](../)‑object dat tekens leest van de opgegeven onderliggende stroom met de opgegeven codering en een buffer met een standaardgrootte van 4096 bytes. Een parameter geeft aan of detectie van een byte‑order‑mark moet worden ingeschakeld.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const System::String\& | Het pad van het bestand waaruit tekens gelezen worden |
| encoding | const EncodingPtr\& | De te gebruiken codering |
| detectEncodingFromByteOrderMarks | bool | True om te zoeken naar byte‑order‑marks aan het begin van het bestand, anders – false |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool, int) constructor


Maakt een instantie van het [StreamReader](../)‑object dat tekens leest van het opgegeven bestand met de opgegeven codering en een buffer van de opgegeven grootte. Een parameter geeft aan of detectie van een byte‑order‑mark moet worden ingeschakeld.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const System::String\& | Het pad van het bestand waaruit tekens gelezen worden |
| encoding | const EncodingPtr\& | De te gebruiken codering |
| detectEncodingFromByteOrderMarks | bool | True om te zoeken naar byte‑order‑marks aan het begin van het bestand, anders – false |
| bufferSize | int | De minimale grootte van de buffer in bytes |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
