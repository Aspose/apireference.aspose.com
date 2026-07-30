---
title: "System::Drawing::Drawing2D::CombineMode enum"
linktitle: "CombineMode"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Drawing2D::CombineMode enum. Specifica come le regioni di ritaglio vengono combinate in C++."
type: docs
weight: 1400
url: /it/cpp/system.drawing.drawing2d/combinemode/
---
## CombineMode enum


Specifica come vengono combinati i regioni di ritaglio.

```cpp
enum class CombineMode
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Sostituisci | 0 | Una regione di ritaglio viene sostituita da un'altra. |
| Intersect | 1 | Le due regioni di ritaglio vengono combinate prendendo la loro intersezione. |
| Unione | 2 | Le due regioni di ritaglio vengono combinate prendendo l'unione di entrambe. |
| Xor | 3 | Le due regioni di ritaglio vengono combinate prendendo solo l'area racchiusa da una delle due regioni, ma non da entrambe. |
| Escludi | 4 | Due regioni di ritaglio vengono combinate prendendo l'area della prima regione che non interseca la seconda. |
| Complemento | 5 | Due regioni di ritaglio vengono combinate prendendo l'area della seconda regione che non interseca la prima. |

## Vedi anche

* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
