---
title: "System::IO::TextReader::ReadBlock‑metod"
linktitle: "ReadBlock"
second_title: "Aspose.Page för C++"
description: "System::IO::TextReader::ReadBlock‑metod. Läser det angivna maximala antalet tecken från den aktuella textläsaren och skriver data till en buffer, med start vid det angivna indexet i C++."
type: docs
weight: 500
url: /sv/cpp/system.io/textreader/readblock/
---
## TextReader::ReadBlock method


Läser det angivna maximala antalet tecken från den aktuella textläsaren och skriver data till en buffert, med start på det angivna indexet.

```cpp
virtual int System::IO::TextReader::ReadBlock(ArrayPtr<char_t> buffer, int index, int count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | ArrayPtr\<char_t\> | En teckenbuffer att skriva de lästa data till |
| index | int | Ett 0‑baserat index i **buffer** att börja skriva på |
| count | int | Det maximala antalet tecken att läsa |

### ReturnValue

Det faktiska antalet tecken som lästs

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
