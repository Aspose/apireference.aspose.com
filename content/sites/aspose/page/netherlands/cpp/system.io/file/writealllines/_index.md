---
title: "System::IO::File::WriteAllLines-methode"
linktitle: "WriteAllLines"
second_title: "Aspose.Page voor C++"
description: "System::IO::File::WriteAllLines-methode. Maakt een nieuw tekstbestand aan of overschrijft het bestaande bestand en schrijft alle tekenreeksen uit de opgegeven array van tekenreeksen naar het bestand, elke tekenreeks op een nieuwe regel, met behulp van de opgegeven codering in C++."
type: docs
weight: 3600
url: /nl/cpp/system.io/file/writealllines/
---
## File::WriteAllLines(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) method


Maakt een nieuw tekstbestand aan of overschrijft het bestaande en schrijft alle strings uit de opgegeven array van strings erin, elke string op een nieuwe regel, met de opgegeven codering.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const ArrayPtr<String> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const String\& | Het bestand om te maken of te overschrijven |
| inhoud | const ArrayPtr\<String\>\& | Een string-array |
| encoding | const EncodingPtr\& | De te gebruiken tekenencodering |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## File::WriteAllLines(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) method


Maakt een nieuw tekstbestand aan of overschrijft het bestaande en schrijft alle strings uit de opgegeven enumerateerbare collectie van strings erin, elke string op een nieuwe regel, met de opgegeven codering.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const String\& | Het bestand om te maken of te overschrijven |
| inhoud | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | Een enumerabele collectie van tekenreeksen |
| encoding | const EncodingPtr\& | De te gebruiken tekenencodering |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
