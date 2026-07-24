---
title: "System::Text::Encoder::GetByteCount methode"
linktitle: "GetByteCount"
second_title: "Aspose.Page voor C++"
description: "System::Text::Encoder::GetByteCount methode. Haalt het aantal bytes op dat nodig is om een buffer te coderen in C++."
type: docs
weight: 400
url: /nl/cpp/system.text/encoder/getbytecount/
---
## Encoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


Haalt het aantal bytes op dat nodig is om een buffer te coderen.

```cpp
virtual int System::Text::Encoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
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
* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoder::GetByteCount(const char_t *, int, bool) method


Haalt het aantal bytes op dat nodig is om een buffer te coderen.

```cpp
virtual int System::Text::Encoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekens | const char_t * | Tekens om te coderen. |
| count | int | Aantal tekens om te coderen. |
| flush | bool | Indien true, wordt de interne encoderstatus na de berekening opgeschoond. |

### ReturnValue

Aantal bytes dat nodig is om de buffer te coderen.

## Zie ook

* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
