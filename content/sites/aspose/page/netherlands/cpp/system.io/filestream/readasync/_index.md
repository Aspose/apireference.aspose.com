---
title: "System::IO::FileStream::ReadAsync methode"
linktitle: "ReadAsync"
second_title: "Aspose.Page voor C++"
description: "System::IO::FileStream::ReadAsync methode. Leest asynchroon een reeks bytes van de huidige stream, verplaatst de positie binnen de stream met het aantal gelezen bytes, en bewaakt annuleringsverzoeken in C++."
type: docs
weight: 1400
url: /nl/cpp/system.io/filestream/readasync/
---
## FileStream::ReadAsync method


Leest asynchroon een reeks bytes van de huidige stream, verplaatst de positie binnen de stream met het aantal gelezen bytes, en bewaakt annuleringsverzoeken.

```cpp
RTaskPtr<int32_t> System::IO::FileStream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | De byte-array om de gelezen bytes naar te schrijven. |
| offset | int32_t | Een 0-gebaseerde positie in **buffer** om te beginnen met schrijven. |
| count | int32_t | Het aantal bytes om te lezen. |
| cancellationToken | const Threading::CancellationToken\& | Het token om te bewaken voor annuleringsverzoeken. |

### ReturnValue

Een taak die de asynchrone leesbewerking vertegenwoordigt. De waarde van de TResult-parameter bevat het totale aantal bytes dat in de buffer is gelezen. De resultaatwaarde kan kleiner zijn dan het aantal gevraagde bytes als het aantal momenteel beschikbare bytes minder is dan het gevraagde aantal, of kan 0 (nul) zijn als het einde van de stream is bereikt.

## Zie ook

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
