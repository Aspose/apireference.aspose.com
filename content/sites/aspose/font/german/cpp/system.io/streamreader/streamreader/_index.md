---
title: "System::IO::StreamReader::StreamReader-Konstruktor"
linktitle: "StreamReader"
second_title: "Aspose.Font für C++"
description: "System::IO::StreamReader::StreamReader-Konstruktor. Erstellt eine Instanz des StreamReader-Objekts, das Zeichen aus dem angegebenen zugrunde liegenden Stream mit UTF-8-Kodierung und einem Puffer mit einer Standardgröße von 1024 Byte in C++ liest."
type: docs
weight: 100
url: /de/cpp/system.io/streamreader/streamreader/
---
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&) constructor


Erstellt eine Instanz des [StreamReader](../)-Objekts, das Zeichen aus dem angegebenen zugrunde liegenden Stream mit UTF-8-Kodierung und einem Puffer mit einer Standardgröße von 1024 Byte liest.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | const SharedPtr\<Stream\>\& | Der zugrunde liegende Stream, aus dem Zeichen gelesen werden sollen |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, bool) constructor


Erstellt eine Instanz des [StreamReader](../)-Objekts, das Zeichen aus dem angegebenen zugrunde liegenden Stream mit UTF-8-Kodierung und einem Puffer mit einer Standardgröße von 1024 Byte liest. Ein Parameter gibt an, ob die Erkennung von Byte Order Marks aktiviert werden soll.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | const SharedPtr\<Stream\>\& | Der zugrunde liegende Stream, aus dem Zeichen gelesen werden sollen |
| detectEncodingFromByteOrderMarks | bool | True, um nach Byte Order Marks am Anfang des Streams zu suchen, andernfalls - false |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Erstellt eine Instanz des [StreamReader](../)-Objekts, das Zeichen aus dem angegebenen zugrunde liegenden Stream mit der angegebenen Kodierung und einem Puffer mit einer Standardgröße von 1024 Byte liest.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | const SharedPtr\<Stream\>\& | Der zugrunde liegende Stream, aus dem Zeichen gelesen werden sollen |
| encoding | const EncodingPtr\& | Die zu verwendende Kodierung |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) constructor


Erstellt eine Instanz des [StreamReader](../)-Objekts, das Zeichen aus dem angegebenen zugrunde liegenden Stream mit der angegebenen Kodierung und einem Puffer mit einer Standardgröße von 1024 Byte liest. Ein Parameter gibt an, ob die Erkennung von Byte Order Marks aktiviert werden soll.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | const SharedPtr\<Stream\>\& | Der zugrunde liegende Stream, aus dem Zeichen gelesen werden sollen |
| encoding | const EncodingPtr\& | Die zu verwendende Kodierung |
| detectEncodingFromByteOrderMarks | bool | True, um nach Byte Order Marks am Anfang des Streams zu suchen, andernfalls - false |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) constructor


Erstellt eine Instanz des [StreamReader](../)-Objekts, das Zeichen aus dem angegebenen zugrunde liegenden Stream mit der angegebenen Kodierung und einem Puffer der angegebenen Größe liest. Ein Parameter gibt an, ob die Erkennung von Byte Order Marks aktiviert werden soll.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | const SharedPtr\<Stream\>\& | Der zugrunde liegende Stream, aus dem Zeichen gelesen werden sollen |
| encoding | const EncodingPtr\& | Die zu verwendende Kodierung |
| detectEncodingFromByteOrderMarks | bool | True, um nach Byte Order Marks am Anfang des Streams zu suchen, andernfalls - false |
| bufferSize | int | Die minimale Größe des Puffers in Bytes |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&) constructor


Erstellt eine Instanz des [StreamReader](../)-Objekts, das Zeichen aus der angegebenen Datei mit UTF-8-Kodierung und einem Puffer mit einer Standardgröße von 4096 Byte liest.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const System::String\& | Der Pfad der Datei, aus der Zeichen gelesen werden sollen |

## Siehe auch

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, bool) constructor


Erstellt eine Instanz des [StreamReader](../)-Objekts, das Zeichen aus der angegebenen Datei mit UTF-8-Kodierung und einem Puffer mit einer Standardgröße von 4096 Byte liest. Ein Parameter gibt an, ob die Erkennung von Byte Order Marks aktiviert werden soll.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const System::String\& | Der Pfad der Datei, aus der Zeichen gelesen werden sollen |
| detectEncodingFromByteOrderMarks | bool | True, um nach Byte Order Marks am Anfang der Datei zu suchen, andernfalls - false |

## Siehe auch

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&) constructor


Erstellt eine Instanz des [StreamReader](../)-Objekts, das Zeichen aus der angegebenen Datei mit der angegebenen Kodierung und einem Puffer mit einer Standardgröße von 4096 Byte liest.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const System::String\& | Der Pfad der Datei, aus der Zeichen gelesen werden sollen |
| encoding | const EncodingPtr\& | Die zu verwendende Kodierung |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool) constructor


Erstellt eine Instanz des [StreamReader](../)-Objekts, das Zeichen aus dem angegebenen zugrunde liegenden Stream mit der angegebenen Kodierung und einem Puffer mit einer Standardgröße von 4096 Byte liest. Ein Parameter gibt an, ob die Erkennung von Byte Order Marks aktiviert werden soll.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const System::String\& | Der Pfad der Datei, aus der Zeichen gelesen werden sollen |
| encoding | const EncodingPtr\& | Die zu verwendende Kodierung |
| detectEncodingFromByteOrderMarks | bool | True, um nach Byte Order Marks am Anfang der Datei zu suchen, andernfalls - false |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool, int) constructor


Erstellt eine Instanz des [StreamReader](../)-Objekts, das Zeichen aus der angegebenen Datei mit der angegebenen Kodierung und einem Puffer der angegebenen Größe liest. Ein Parameter gibt an, ob die Erkennung von Byte Order Marks aktiviert werden soll.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const System::String\& | Der Pfad der Datei, aus der Zeichen gelesen werden sollen |
| encoding | const EncodingPtr\& | Die zu verwendende Kodierung |
| detectEncodingFromByteOrderMarks | bool | True, um nach Byte Order Marks am Anfang der Datei zu suchen, andernfalls - false |
| bufferSize | int | Die minimale Größe des Puffers in Bytes |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
