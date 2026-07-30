---
title: "System::IO::FileStream::FileStream costruttore"
linktitle: "FileStream"
second_title: "Aspose.Font per C++"
description: "Come utilizzare il costruttore FileStream della classe System::IO::FileStream in C++."
type: docs
weight: 100
url: /it/cpp/system.io/filestream/filestream/
---
## FileStream::FileStream(const FileStream\&) constructor




```cpp
System::IO::FileStream::FileStream(const FileStream &)=delete
```

## Vedi anche

* Class [FileStream](../)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::FileStream(const String\&, FileMode) constructor


Crea una nuova istanza della classe [FileStream](../) e la inizializza con i parametri specificati.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const String\& | Il percorso del file da aprire. |
| mode | FileMode | Specifica la modalità con cui aprire il file. |

## Vedi anche

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) constructor


Crea una nuova istanza della classe [FileStream](../) e la inizializza con i parametri specificati.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share, int32_t buffer_size, bool useAsync)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const String\& | Il percorso del file da aprire. |
| mode | FileMode | Specifica la modalità con cui aprire il file. |
| access | FileAccess | Il tipo di accesso richiesto. |
| share | FileShare | Il tipo di accesso che altri oggetti [FileStream](../) hanno sul file aperto. |
| buffer_size | int32_t | Il numero di byte bufferizzati durante le operazioni di lettura e scrittura. |
| useAsync | bool | Specifica se utilizzare I/O asincrono o I/O sincrono. |
## Osservazioni



Il sistema operativo sottostante potrebbe non supportare I/O asincrono.

## Vedi anche

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) constructor


Crea una nuova istanza della classe [FileStream](../) e la inizializza con i parametri specificati.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::Read, int32_t buffer_size=DefaultBufferSize, FileOptions options=FileOptions::SequentialScan)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const String\& | Il percorso del file da aprire. |
| mode | FileMode | Specifica la modalità con cui aprire il file. |
| access | FileAccess | Il tipo di accesso richiesto. |
| share | FileShare | Il tipo di accesso che altri oggetti [FileStream](../) hanno sul file aperto. |
| buffer_size | int32_t | Il numero di byte bufferizzati durante le operazioni di lettura e scrittura. |
| opzioni | FileOptions | Opzioni aggiuntive. |

## Vedi anche

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Enum [FileOptions](../../fileoptions/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
