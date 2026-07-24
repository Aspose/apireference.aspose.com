---
title: "System::IO::File::Open methode"
linktitle: "Openen"
second_title: "Aspose.Page voor C++"
description: "System::IO::File::Open methode. Opent het opgegeven bestand in de opgegeven modus voor lezen en schrijven en zonder delen in C++."
type: docs
weight: 1900
url: /nl/cpp/system.io/file/open/
---
## File::Open(const String\&, FileMode) method


Opent het opgegeven bestand in de opgegeven modus voor lezen en schrijven zonder delen.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const String\& | Het pad van het bestand om te openen |
| mode | FileMode | Specificeert de modus waarin het bestand moet worden geopend |

### ReturnValue

Een [FileStream](../../filestream/) object geassocieerd met het geopende bestand

## Zie ook

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## File::Open(const String\&, FileMode, FileAccess, FileShare) method


Opent het opgegeven bestand in de opgegeven modus, met het opgegeven toegangstype en de deeloptie.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::None)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const String\& | Het pad van het bestand om te openen |
| mode | FileMode | Specificeert de modus waarin het bestand moet worden geopend |
| access | FileAccess | Het aangevraagde toegangstype |
| share | FileShare | Het type toegang dat andere [FileStream](../../filestream/) objecten hebben tot het geopende bestand |

### ReturnValue

Een [FileStream](../../filestream/) object geassocieerd met het geopende bestand

## Zie ook

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
