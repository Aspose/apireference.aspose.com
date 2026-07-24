---
title: "System::IO::File::Create-methode"
linktitle: "Create"
second_title: "Aspose.Page voor C++"
description: "System::IO::File::Create-methode. Maakt een nieuw bestand (of overschrijft een bestaand) en opent het voor lees- en schrijftoegang met de opgegeven buffer‑grootte en opties in C++."
type: docs
weight: 500
url: /nl/cpp/system.io/file/create/
---
## File::Create method


Maakt een nieuw bestand (of overschrijft een bestaand bestand) en opent het voor lees‑ en schrijftoegang met de opgegeven buffergrootte en opties.

```cpp
static FileStreamPtr System::IO::File::Create(const String &path, int32_t bufferSize=DefaultBufferSize, FileOptions options=FileOptions::None)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const String\& | Het pad van het bestand dat moet worden gemaakt of overschreven |
| bufferSize | int32_t | Het aantal bytes dat wordt gebufferd bij het lezen van en schrijven naar het bestand |
| opties | FileOptions | Specificeert hoe het bestand moet worden gemaakt of overschreven |

### ReturnValue

Een shared pointer naar het [FileStream](../../filestream/) object dat is gekoppeld aan het opgegeven bestand

## Zie ook

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileOptions](../../fileoptions/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
