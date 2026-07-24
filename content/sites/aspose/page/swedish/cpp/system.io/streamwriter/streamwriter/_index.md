---
title: "System::IO::StreamWriter::StreamWriter constructor"
linktitle: "StreamWriter"
second_title: "Aspose.Page för C++"
description: "System::IO::StreamWriter::StreamWriter‑konstruktor. Skapar en instans av StreamWriter‑objektet som skriver tecken till den angivna underliggande strömmen med UTF‑8‑kodning och en buffert med standardstorlek 1024 byte i C++."
type: docs
weight: 100
url: /sv/cpp/system.io/streamwriter/streamwriter/
---
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&) constructor


Skapar en instans av [StreamWriter](../)‑objektet som skriver tecken till den angivna underliggande strömmen med UTF‑8‑kodning och en buffert med standardstorlek 1024 byte.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| ström | const SharedPtr\<Stream\>\& | Den underliggande strömmen att skriva tecken till |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Skapar en instans av [StreamWriter](../)-objekt som skriver tecken till den angivna underliggande strömmen med den angivna kodningen och en buffert med standardstorlek på 1024 byte.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| ström | const SharedPtr\<Stream\>\& | Den underliggande strömmen att skriva tecken till |
| kodning | const EncodingPtr\& | Kodningen att använda |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) constructor


Skapar en instans av [StreamWriter](../)-objekt som skriver tecken till den angivna underliggande strömmen med den angivna kodningen och en buffert med den angivna storleken. En parameter anger om den underliggande strömmen ska stängas när [StreamWriter](../)-objektet har disposerats.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, int buffer_size, bool leave_open=false)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| ström | const SharedPtr\<Stream\>\& | Den underliggande strömmen att skriva tecken till |
| kodning | const EncodingPtr\& | Kodningen att använda |
| buffer_size | int | Den minsta storleken på bufferten i byte |
| leave_open | bool | Anger om den underliggande strömmen ska lämnas öppen efter att det aktuella [StreamWriter](../)-objektet har disposerats |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&) constructor


Skapar en instans av [StreamWriter](../)-objekt som skriver tecken till den angivna filen med UTF-8-kodning och en buffert med standardstorlek på 1024 byte.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| sökväg | const String\& | Sökvägen till filen som tecken ska skrivas till |

## Se även

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&, int) constructor


Skapar en instans av [StreamWriter](../)-objekt som skriver tecken till den angivna filen med den angivna kodningen och buffertstorlek. En parameter anger om data ska läggas till i filen eller om filen ska skrivas över.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding, int buffer_size)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| sökväg | const String\& | Sökvägen till filen som tecken ska skrivas till |
| append | bool | Anger om data ska läggas till i den angivna filen (true) eller om filen ska skrivas över (false) |
| kodning | const EncodingPtr\& | Kodningen att använda |
| buffer_size | int | Storleken på den buffert som ska användas |

## Se även

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&) constructor


Skapar en instans av [StreamWriter](../)-objekt som skriver tecken till den angivna filen med den angivna kodningen och en buffert med standardstorlek på 1024 byte. En parameter anger om data ska läggas till i filen eller om filen ska skrivas över.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| sökväg | const String\& | Sökvägen till filen som tecken ska skrivas till |
| append | bool | Anger om data ska läggas till i den angivna filen (true) eller om filen ska skrivas över (false) |
| kodning | const EncodingPtr\& | Kodningen att använda |

## Se även

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
