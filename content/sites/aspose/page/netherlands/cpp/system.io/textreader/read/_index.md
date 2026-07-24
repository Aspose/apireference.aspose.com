---
title: "System::IO::TextReader::Read-methode"
linktitle: "Lezen"
second_title: "Aspose.Page voor C++"
description: "System::IO::TextReader::Read-methode. Leest één enkel teken van de stroom in C++."
type: docs
weight: 400
url: /nl/cpp/system.io/textreader/read/
---
## TextReader::Read() method


Leest een enkel teken uit de stroom.

```cpp
virtual int System::IO::TextReader::Read()
```


### ReturnValue

Lees teken gecodeerd met UTF-16-codering; als het gelezen teken wordt weergegeven door twee codepunten in UTF-16-codering, wordt alleen de hoge surrogaat geretourneerd.

## Zie ook

* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextReader::Read(ArrayPtr\<char_t\>, int, int) method


Leest het opgegeven aantal tekens uit de stroom en schrijft ze naar de opgegeven tekenarray, beginnend op de opgegeven positie.

```cpp
virtual int System::IO::TextReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | ArrayPtr\<char_t\> | De UTF-16-tekenarray om de gelezen tekens van de stroom naar te schrijven |
| index | int | Een 0-gebaseerde index in **buffer** waarop gestart moet worden met schrijven. |
| count | int | Het aantal tekens om te lezen van de stroom. |

### ReturnValue

Het aantal tekens gelezen van de stroom

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
