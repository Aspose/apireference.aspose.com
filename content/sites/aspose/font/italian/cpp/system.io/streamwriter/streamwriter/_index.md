---
title: "System::IO::StreamWriter::StreamWriter costruttore"
linktitle: "StreamWriter"
second_title: "Aspose.Font per C++"
description: "System::IO::StreamWriter::StreamWriter costruttore. Crea un'istanza dell'oggetto StreamWriter che scrive caratteri sullo stream sottostante specificato usando la codifica UTF-8 e un buffer con dimensione predefinita di 1024 byte in C++."
type: docs
weight: 100
url: /it/cpp/system.io/streamwriter/streamwriter/
---
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&) constructor


Crea un'istanza dell'oggetto [StreamWriter](../) che scrive caratteri sullo stream sottostante specificato usando la codifica UTF-8 e un buffer con dimensione predefinita di 1024 byte.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | Il flusso sottostante su cui scrivere i caratteri |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Crea un'istanza dell'oggetto [StreamWriter](../) che scrive caratteri sullo stream sottostante specificato usando la codifica specificata e un buffer con dimensione predefinita di 1024 byte.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | Il flusso sottostante su cui scrivere i caratteri |
| encoding | const EncodingPtr\& | La codifica da utilizzare |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) constructor


Crea un'istanza dell'oggetto [StreamWriter](../) che scrive caratteri sullo stream sottostante specificato usando la codifica specificata e un buffer della dimensione specificata. Un parametro indica se lo stream sottostante deve essere chiuso quando l'oggetto [StreamWriter](../) viene eliminato.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, int buffer_size, bool leave_open=false)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | Il flusso sottostante su cui scrivere i caratteri |
| encoding | const EncodingPtr\& | La codifica da utilizzare |
| buffer_size | int | La dimensione minima del buffer in byte |
| leave_open | bool | Specifica se lo stream sottostante deve rimanere aperto dopo che l'oggetto [StreamWriter](../) corrente è stato eliminato |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&) constructor


Crea un'istanza dell'oggetto [StreamWriter](../) che scrive caratteri nel file specificato usando la codifica UTF-8 e un buffer con dimensione predefinita di 1024 byte.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const String\& | Il percorso del file su cui scrivere i caratteri |

## Vedi anche

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&, int) constructor


Crea un'istanza dell'oggetto [StreamWriter](../) che scrive caratteri nel file specificato usando la codifica e la dimensione del buffer specificate. Un parametro specifica se i dati devono essere aggiunti al file o se il file deve essere sovrascritto.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding, int buffer_size)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const String\& | Il percorso del file su cui scrivere i caratteri |
| append | bool | Specifica se i dati devono essere aggiunti al file specificato (true) o se il file deve essere sovrascritto (false) |
| encoding | const EncodingPtr\& | La codifica da utilizzare |
| buffer_size | int | La dimensione del buffer da utilizzare |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&) constructor


Crea un'istanza dell'oggetto [StreamWriter](../) che scrive caratteri nel file specificato usando la codifica specificata e un buffer con dimensione predefinita di 1024 byte. Un parametro specifica se i dati devono essere aggiunti al file o se il file deve essere sovrascritto.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked())
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const String\& | Il percorso del file su cui scrivere i caratteri |
| append | bool | Specifica se i dati devono essere aggiunti al file specificato (true) o se il file deve essere sovrascritto (false) |
| encoding | const EncodingPtr\& | La codifica da utilizzare |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
