---
title: "Metodo System::Equals< float, float >"
linktitle: "Uguale< float, float >"
second_title: "Aspose.Page per C++"
description: "Metodo System::Equals< float, float >. Specializzazione per valori a virgola mobile a precisione singola. Sebbene due NaN a virgola mobile siano definiti dallo IEC 60559:1989 per essere sempre confrontati come non uguali, il contratto per System.Object.Equals richiede che le sovrascritture soddisfino i requisiti di un operatore di equivalenza. Pertanto, System.Double.Equals e System.Single.Equals restituiscono True quando si confrontano due NaN, mentre l'operatore di uguaglianza restituisce False in quel caso, come richiesto dallo standard in C++."
type: docs
weight: 18400
url: /it/cpp/system/equals_float,float_/
---
## System::Equals< float, float > method


Specializzazione per valori a virgola mobile a precisione singola. Sebbene due NaN a virgola mobile siano definiti dallo IEC 60559:1989 per essere sempre confrontati come non uguali, il contratto per [System.Object.Equals](../object/equals/) richiede che le sovrascritture soddisfino i requisiti di un operatore di equivalenza. Pertanto, System.Double.Equals e System.Single.Equals restituiscono True quando si confrontano due NaN, mentre l'operatore di uguaglianza restituisce False in quel caso, come richiesto dallo standard.

```cpp
bool System::Equals<float, float>(const float &a, const float &b)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| a | const float\& | Il primo comparando |
| b | const float\& | Il secondo comparando |

### ReturnValue

Vero se entrambi i valori sono NaN o sono uguali, altrimenti - falso

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
