---
title: "System::IO::StreamWriter::StreamWriter Konstruktor"
linktitle: "StreamWriter"
second_title: "Aspose.Font für C++"
description: "System::IO::StreamWriter::StreamWriter Konstruktor. Erstellt eine Instanz des StreamWriter-Objekts, das Zeichen in den angegebenen zugrunde liegenden Stream schreibt, wobei UTF-8-Kodierung und ein Puffer mit Standardgröße von 1024 Bytes in C++ verwendet werden."
type: docs
weight: 100
url: /de/cpp/system.io/streamwriter/streamwriter/
---
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&) constructor


Erstellt eine Instanz des [StreamWriter](../)-Objekts, das Zeichen in den angegebenen zugrunde liegenden Stream schreibt, wobei UTF-8-Kodierung und ein Puffer mit Standardgröße von 1024 Bytes verwendet werden.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | const SharedPtr\<Stream\>\& | Der zugrunde liegende Stream, in den Zeichen geschrieben werden sollen |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Erstellt eine Instanz des [StreamWriter](../)-Objekts, das Zeichen in den angegebenen zugrunde liegenden Stream schreibt, wobei die angegebene Kodierung und ein Puffer mit Standardgröße von 1024 Bytes verwendet werden.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | const SharedPtr\<Stream\>\& | Der zugrunde liegende Stream, in den Zeichen geschrieben werden sollen |
| encoding | const EncodingPtr\& | Die zu verwendende Kodierung |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) constructor


Erstellt eine Instanz des [StreamWriter](../)-Objekts, das Zeichen in den angegebenen zugrunde liegenden Stream schreibt, wobei die angegebene Kodierung und ein Puffer mit der angegebenen Größe verwendet werden. Ein Parameter gibt an, ob der zugrunde liegende Stream geschlossen werden soll, wenn das [StreamWriter](../)-Objekt freigegeben wird.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, int buffer_size, bool leave_open=false)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | const SharedPtr\<Stream\>\& | Der zugrunde liegende Stream, in den Zeichen geschrieben werden sollen |
| encoding | const EncodingPtr\& | Die zu verwendende Kodierung |
| buffer_size | int | Die minimale Größe des Puffers in Bytes |
| leave_open | bool | Gibt an, ob der zugrunde liegende Stream nach dem Entsorgen des aktuellen [StreamWriter](../)-Objekts offen bleiben soll |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&) constructor


Erstellt eine Instanz des [StreamWriter](../)-Objekts, das Zeichen in die angegebene Datei schreibt, wobei UTF-8-Kodierung und ein Puffer mit einer Standardgröße von 1024 Bytes verwendet werden.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const String\& | Der Pfad der Datei, in die Zeichen geschrieben werden sollen |

## Siehe auch

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&, int) constructor


Erstellt eine Instanz des [StreamWriter](../)-Objekts, das Zeichen in die angegebene Datei schreibt, wobei die angegebene Kodierung und Puffergröße verwendet werden. Ein Parameter gibt an, ob die Daten an die Datei angehängt oder die Datei überschrieben werden soll.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding, int buffer_size)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const String\& | Der Pfad der Datei, in die Zeichen geschrieben werden sollen |
| append | bool | Gibt an, ob die Daten an die angegebene Datei angehängt werden sollen (true) oder die Datei überschrieben werden soll (false) |
| encoding | const EncodingPtr\& | Die zu verwendende Kodierung |
| buffer_size | int | Die zu verwendende Puffergröße |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&) constructor


Erstellt eine Instanz des [StreamWriter](../)-Objekts, das Zeichen in die angegebene Datei schreibt, wobei die angegebene Kodierung und ein Puffer mit einer Standardgröße von 1024 Bytes verwendet werden. Ein Parameter gibt an, ob die Daten an die Datei angehängt oder die Datei überschrieben werden soll.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const String\& | Der Pfad der Datei, in die Zeichen geschrieben werden sollen |
| append | bool | Gibt an, ob die Daten an die angegebene Datei angehängt werden sollen (true) oder die Datei überschrieben werden soll (false) |
| encoding | const EncodingPtr\& | Die zu verwendende Kodierung |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
