---
title: "Aspose::Page::XPS::XpsModel::XpsFillRule enum"
linktitle: "XpsFillRule"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsModel::XpsFillRule enum. Valori validi della proprietà FillRule dell'elemento PathGeometry in C++."
type: docs
weight: 4900
url: /it/cpp/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enum


Valori validi della proprietà FillRule dell'elemento PathGeometry.

```cpp
enum class XpsFillRule
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| EvenOdd | 0 | Questa regola determina la “internità” di un punto sulla tela disegnando un raggio dal punto verso l'infinito in qualsiasi direzione e contando il numero di segmenti della forma data che il raggio attraversa. Se questo numero è dispari, il punto è interno; se è pari, il punto è esterno. |
| NonZero | 1 | Questa regola determina la “insideness” di un punto sulla tela disegnando un raggio dal punto all'infinito in qualsiasi direzione e poi esaminando i punti in cui un segmento della forma attraversa il raggio. Partendo da un conteggio pari a zero, aggiungi uno ogni volta che un segmento attraversa il raggio da sinistra a destra e sottrai uno ogni volta che un segmento del percorso attraversa il raggio da destra a sinistra. Dopo aver contato le intersezioni, se il risultato è zero il punto è fuori dal percorso; altrimenti, è dentro. |

## Vedi anche

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
