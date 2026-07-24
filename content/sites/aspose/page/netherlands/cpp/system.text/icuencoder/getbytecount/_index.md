---
title: "System::Text::ICUEncoder::GetByteCount-methode"
linktitle: "GetByteCount"
second_title: "Aspose.Page voor C++"
description: "System::Text::ICUEncoder::GetByteCount-methode. Berekent het aantal bytes dat nodig is om een buffer te coderen in C++."
type: docs
weight: 400
url: /nl/cpp/system.text/icuencoder/getbytecount/
---
## ICUEncoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


Haalt het aantal bytes op dat nodig is om een buffer te coderen.

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekens | ArrayPtr\<char_t\> | Tekens om te coderen. |
| index | int | [Buffer](../../../system/buffer/) offset. |
| count | int | Aantal tekens om te coderen. |
| flush | bool | Indien true, wordt de interne encoderstatus na de berekening opgeschoond. |

### ReturnValue

Aantal bytes dat nodig is om de buffer te coderen.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoder::GetByteCount(const char_t *, int, bool) method


Haalt het aantal bytes op dat nodig is om een buffer te coderen.

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekens | const char_t * | Tekens om te coderen. |
| count | int | Aantal tekens om te coderen. |
| flush | bool | Indien true, wordt de interne encoderstatus na de berekening opgeschoond. |

### ReturnValue

Aantal bytes dat nodig is om de buffer te coderen.

## Zie ook

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
