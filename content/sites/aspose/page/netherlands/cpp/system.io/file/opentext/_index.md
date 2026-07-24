---
title: "System::IO::File::OpenText methode"
linktitle: "OpenText"
second_title: "Aspose.Page voor C++"
description: "System::IO::File::OpenText methode. Opent het opgegeven bestaande bestand voor het lezen van tekst met UTF-8-codering zonder delen in C++."
type: docs
weight: 2100
url: /nl/cpp/system.io/file/opentext/
---
## File::OpenText method


Opent het opgegeven bestaande bestand voor het lezen van tekst met UTF-8‑codering zonder delen.

```cpp
static StreamReaderPtr System::IO::File::OpenText(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const String\& | Het pad van het bestand om te openen |
| encoding | const EncodingPtr\& | De te gebruiken tekenencodering |

### ReturnValue

Een gedeelde pointer naar een [StreamWriter](../../streamwriter/) object dat is gekoppeld aan het geopende bestand

## Zie ook

* Typedef [StreamReaderPtr](../../../system/streamreaderptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
