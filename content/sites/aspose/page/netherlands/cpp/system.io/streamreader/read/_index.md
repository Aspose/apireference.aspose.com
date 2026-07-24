---
title: "System::IO::StreamReader::Read‑methode"
linktitle: "Lezen"
second_title: "Aspose.Page voor C++"
description: "System::IO::StreamReader::Read‑methode. Leest één teken uit de stroom in C++."
type: docs
weight: 900
url: /nl/cpp/system.io/streamreader/read/
---
## StreamReader::Read() method


Leest een enkel teken uit de stroom.

```cpp
virtual int System::IO::StreamReader::Read() override
```


### ReturnValue

Lees teken gecodeerd met UTF-16-codering; als het gelezen teken wordt weergegeven door twee codepunten in UTF-16-codering, wordt alleen de hoge surrogaat geretourneerd.

## Zie ook

* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::Read(ArrayPtr\<char_t\>, int, int) method


Leest het opgegeven aantal tekens uit de stream, zet ze om naar UTF-16‑codering en schrijft de resulterende UTF-16‑tekens naar de opgegeven tekenarray, beginnend op de opgegeven positie.

```cpp
virtual int System::IO::StreamReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
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
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
