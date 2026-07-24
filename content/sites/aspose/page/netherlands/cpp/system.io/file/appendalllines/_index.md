---
title: "System::IO::File::AppendAllLines methode"
linktitle: "AppendAllLines"
second_title: "Aspose.Page voor C++"
description: "System::IO::File::AppendAllLines methode. Voegt tekenreeksen uit de opgegeven collectie van tekenreeksen toe aan het opgegeven bestand met behulp van de opgegeven codering door elke tekenreeks in een nieuwe regel te schrijven. Als het opgegeven bestand niet bestaat, wordt het aangemaakt. Het bestand wordt gesloten na het schrijven van alle tekenreeksen in C++."
type: docs
weight: 100
url: /nl/cpp/system.io/file/appendalllines/
---
## File::AppendAllLines method


Voegt strings uit de opgegeven collectie strings toe aan het opgegeven bestand met de opgegeven codering door elke string in een nieuwe regel te schrijven. Als het opgegeven bestand niet bestaat, wordt het aangemaakt. Het bestand wordt gesloten na het schrijven van alle strings.

```cpp
static void System::IO::File::AppendAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const String\& | Het pad van het bestand waaraan de strings worden toegevoegd |
| inhoud | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | De strings die naar het bestand moeten worden geschreven |
| encoding | const EncodingPtr\& | De te gebruiken tekenencodering |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
