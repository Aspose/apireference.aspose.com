---
title: "System::IO::File::ReadLines-methode"
linktitle: "ReadLines"
second_title: "Aspose.Page voor C++"
description: "System::IO::File::ReadLines-methode. Leest de inhoud van het opgegeven tekstbestand regel voor regel met behulp van de opgegeven tekencodering en retourneert een enumerabele collectie van tekenreeksen, waarbij elke tekenreeks een enkele regel van de bestandsinhoud vertegenwoordigt in C++."
type: docs
weight: 2600
url: /nl/cpp/system.io/file/readlines/
---
## File::ReadLines method


Leest de inhoud van het opgegeven tekstbestand regel voor regel met de opgegeven tekencodering en retourneert een enumerateerbare collectie van strings, waarbij elke string een enkele regel van de bestandsinhoud vertegenwoordigt.

```cpp
static SharedPtr<Collections::Generic::IEnumerable<String>> System::IO::File::ReadLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const String\& | Het pad van het bestand om te lezen |
| encoding | const EncodingPtr\& | De te gebruiken tekenencodering |

### ReturnValue

Een enumerabele collectie van tekenreeksen die de inhoud van het opgegeven bestand weergeven

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
