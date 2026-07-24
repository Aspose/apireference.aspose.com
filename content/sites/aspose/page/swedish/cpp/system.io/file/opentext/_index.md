---
title: "System::IO::File::OpenText metod"
linktitle: "OpenText"
second_title: "Aspose.Page för C++"
description: "System::IO::File::OpenText metod. Öppnar den angivna befintliga filen för läsning av text med UTF-8-kodning utan delning i C++."
type: docs
weight: 2100
url: /sv/cpp/system.io/file/opentext/
---
## File::OpenText method


Öppnar den angivna befintliga filen för läsning av text med UTF-8-kodning utan delning.

```cpp
static StreamReaderPtr System::IO::File::OpenText(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| sökväg | const String\& | Sökvägen till filen som ska öppnas |
| kodning | const EncodingPtr\& | Teckenkodningen som ska användas |

### ReturnValue

En delad pekare till ett [StreamWriter](../../streamwriter/)-objekt som är associerat med den öppnade filen

## Se även

* Typedef [StreamReaderPtr](../../../system/streamreaderptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
