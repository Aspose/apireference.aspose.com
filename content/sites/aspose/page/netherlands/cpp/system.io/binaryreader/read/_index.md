---
title: "System::IO::BinaryReader::Read methode"
linktitle: "Lezen"
second_title: "Aspose.Page voor C++"
description: "System::IO::BinaryReader::Read methode. Leest één teken van de invoerstroom in C++."
type: docs
weight: 700
url: /nl/cpp/system.io/binaryreader/read/
---
## BinaryReader::Read() method


Leest één teken van de invoerstroom.

```cpp
virtual int System::IO::BinaryReader::Read()
```


### ReturnValue

Lees teken gecodeerd met UTF-16-codering; als het gelezen teken wordt weergegeven door twee codepunten in UTF-16-codering, wordt alleen de hoge surrogaat geretourneerd.

## Zie ook

* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::Read(ArrayPtr\<char_t\>, int, int) method


Leest het opgegeven aantal tekens van de invoerstroom, zet ze om naar UTF-16-codering en schrijft de resulterende UTF-16-tekens naar de opgegeven tekenarray, beginnend op de opgegeven positie.

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | ArrayPtr\<char_t\> | De UTF-16-tekenarray om de gelezen tekens van de invoerstroom naar toe te schrijven. |
| index | int | Een 0-gebaseerde index in **buffer** waarop gestart moet worden met schrijven. |
| count | int | Het aantal tekens om te lezen van de stroom. |

### ReturnValue

Het aantal tekens gelezen van de invoerstroom.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::Read(ArrayPtr\<uint8_t\>, int, int) method


Leest het opgegeven aantal bytes van de invoerstroom en schrijft ze naar de opgegeven byte-array.

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<uint8_t> buffer, int index, int count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | ArrayPtr\<uint8_t\> | De byte-array om de gelezen bytes naartoe te schrijven |
| index | int | Een 0‑gebaseerde positie in **buffer** om te beginnen met schrijven |
| count | int | Het aantal bytes om te lezen |

### ReturnValue

Het aantal gelezen bytes

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
