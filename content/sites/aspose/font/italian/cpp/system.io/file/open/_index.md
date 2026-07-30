---
title: "System::IO::File::Open metodo"
linktitle: "Open"
second_title: "Aspose.Font per C++"
description: "System::IO::File::Open metodo. Apre il file specificato nella modalità specificata per lettura e scrittura e senza condivisione in C++."
type: docs
weight: 1900
url: /it/cpp/system.io/file/open/
---
## File::Open(const String\&, FileMode) method


Apre il file specificato nella modalità specificata per lettura e scrittura e senza condivisione.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const String\& | Il percorso del file da aprire |
| mode | FileMode | Specifica la modalità con cui aprire il file |

### ReturnValue

Un oggetto [FileStream](../../filestream/) associato al file aperto

## Vedi anche

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## File::Open(const String\&, FileMode, FileAccess, FileShare) method


Apre il file specificato nella modalità specificata, con il tipo di accesso specificato e l'opzione di condivisione.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::None)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const String\& | Il percorso del file da aprire |
| mode | FileMode | Specifica la modalità con cui aprire il file |
| access | FileAccess | Il tipo di accesso richiesto |
| share | FileShare | Il tipo di accesso che altri oggetti [FileStream](../../filestream/) hanno al file aperto |

### ReturnValue

Un oggetto [FileStream](../../filestream/) associato al file aperto

## Vedi anche

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
