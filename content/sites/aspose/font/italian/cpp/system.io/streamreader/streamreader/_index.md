---
title: "System::IO::StreamReader::StreamReader costruttore"
linktitle: "StreamReader"
second_title: "Aspose.Font per C++"
description: "System::IO::StreamReader::StreamReader costruttore. Crea un'istanza dell'oggetto StreamReader che legge i caratteri dal flusso sottostante specificato usando la codifica UTF-8 e un buffer con dimensione predefinita di 1024 byte in C++."
type: docs
weight: 100
url: /it/cpp/system.io/streamreader/streamreader/
---
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&) constructor


Crea un'istanza dell'oggetto [StreamReader](../) che legge i caratteri dal flusso sottostante specificato usando la codifica UTF-8 e un buffer con dimensione predefinita di 1024 byte.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | Il flusso sottostante da cui leggere i caratteri |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, bool) constructor


Crea un'istanza dell'oggetto [StreamReader](../) che legge i caratteri dal flusso sottostante specificato usando la codifica UTF-8 e un buffer con dimensione predefinita di 1024 byte. Un parametro specifica se l'individuazione del byte order mark deve essere abilitata.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, bool detectEncodingFromByteOrderMarks)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | Il flusso sottostante da cui leggere i caratteri |
| detectEncodingFromByteOrderMarks | bool | True per cercare i byte order mark all'inizio del flusso, altrimenti - false |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Crea un'istanza dell'oggetto [StreamReader](../) che legge i caratteri dal flusso sottostante specificato usando la codifica specificata e un buffer con dimensione predefinita di 1024 byte.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | Il flusso sottostante da cui leggere i caratteri |
| encoding | const EncodingPtr\& | La codifica da utilizzare |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) constructor


Crea un'istanza dell'oggetto [StreamReader](../) che legge i caratteri dal flusso sottostante specificato usando la codifica specificata e un buffer con dimensione predefinita di 1024 byte. Un parametro specifica se l'individuazione del byte order mark deve essere abilitata.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | Il flusso sottostante da cui leggere i caratteri |
| encoding | const EncodingPtr\& | La codifica da utilizzare |
| detectEncodingFromByteOrderMarks | bool | True per cercare i byte order mark all'inizio del flusso, altrimenti - false |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) constructor


Crea un'istanza dell'oggetto [StreamReader](../) che legge i caratteri dal flusso sottostante specificato usando la codifica specificata e un buffer della dimensione specificata. Un parametro specifica se l'individuazione del byte order mark deve essere abilitata.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | Il flusso sottostante da cui leggere i caratteri |
| encoding | const EncodingPtr\& | La codifica da utilizzare |
| detectEncodingFromByteOrderMarks | bool | True per cercare i byte order mark all'inizio del flusso, altrimenti - false |
| bufferSize | int | La dimensione minima del buffer in byte |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&) constructor


Crea un'istanza dell'oggetto [StreamReader](../) che legge i caratteri dal file specificato usando la codifica UTF-8 e un buffer con dimensione predefinita di 4096 byte.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const System::String\& | Il percorso del file da cui leggere i caratteri |

## Vedi anche

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, bool) constructor


Crea un'istanza dell'oggetto [StreamReader](../) che legge i caratteri dal file specificato usando la codifica UTF-8 e un buffer con dimensione predefinita di 4096 byte. Un parametro specifica se l'individuazione del byte order mark deve essere abilitata.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, bool detectEncodingFromByteOrderMarks)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const System::String\& | Il percorso del file da cui leggere i caratteri |
| detectEncodingFromByteOrderMarks | bool | True per cercare i byte order mark all'inizio del file, altrimenti - false |

## Vedi anche

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&) constructor


Crea un'istanza dell'oggetto [StreamReader](../) che legge i caratteri dal file specificato usando la codifica specificata e un buffer con dimensione predefinita di 4096 byte.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const System::String\& | Il percorso del file da cui leggere i caratteri |
| encoding | const EncodingPtr\& | La codifica da utilizzare |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool) constructor


Crea un'istanza dell'oggetto [StreamReader](../) che legge i caratteri dal flusso sottostante specificato usando la codifica specificata e un buffer con dimensione predefinita di 4096 byte. Un parametro specifica se l'individuazione del byte order mark deve essere abilitata.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const System::String\& | Il percorso del file da cui leggere i caratteri |
| encoding | const EncodingPtr\& | La codifica da utilizzare |
| detectEncodingFromByteOrderMarks | bool | True per cercare i byte order mark all'inizio del file, altrimenti - false |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool, int) constructor


Crea un'istanza dell'oggetto [StreamReader](../) che legge i caratteri dal file specificato usando la codifica specificata e un buffer della dimensione specificata. Un parametro specifica se l'individuazione del byte order mark deve essere abilitata.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const System::String\& | Il percorso del file da cui leggere i caratteri |
| encoding | const EncodingPtr\& | La codifica da utilizzare |
| detectEncodingFromByteOrderMarks | bool | True per cercare i byte order mark all'inizio del file, altrimenti - false |
| bufferSize | int | La dimensione minima del buffer in byte |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
