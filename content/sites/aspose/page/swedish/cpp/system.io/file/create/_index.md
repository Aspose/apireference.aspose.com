---
title: "System::IO::File::Create‑metod"
linktitle: "Skapa"
second_title: "Aspose.Page för C++"
description: "System::IO::File::Create‑metod. Skapar en ny fil (eller skriver över befintlig) och öppnar den för läs‑ och skrivåtkomst med angiven buffertstorlek och alternativ i C++."
type: docs
weight: 500
url: /sv/cpp/system.io/file/create/
---
## File::Create method


Skapar en ny fil (eller skriver över befintlig) och öppnar den för läs- och skrivåtkomst med den angivna buffertstorleken och alternativen.

```cpp
static FileStreamPtr System::IO::File::Create(const String &path, int32_t bufferSize=DefaultBufferSize, FileOptions options=FileOptions::None)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| sökväg | const String\& | Sökvägen till filen som ska skapas eller skrivas över |
| bufferSize | int32_t | Antalet byte som buffras vid läsning från och skrivning till filen |
| alternativ | FileOptions | Anger hur filen ska skapas eller skrivas över |

### ReturnValue

En delad pekare till [FileStream](../../filestream/)‑objektet som är associerat med den angivna filen

## Se även

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileOptions](../../fileoptions/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
