---
title: Enum XpsFillRule
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.XPS.XpsModel.XpsFillRule enum. Valori validi della proprietà FillRule dellelemento PathGeometry.
type: docs
weight: 3080
url: /it/net/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enumeration

Valori validi della proprietà FillRule dell'elemento PathGeometry.

```csharp
public enum XpsFillRule
```

### I valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| EvenOdd | `0` | Questa regola determina l'"interno" di un punto sulla tela disegnando un raggio dal punto all'infinito in qualsiasi direzione e contando il numero di segmenti dalla forma data che il raggio attraversa. Se questo numero è dispari, il punto è all'interno; se è pari, il punto è esterno. |
| NonZero | `1` | Questa regola determina l'"interiorità" di un punto sulla tela disegnando un raggio dal punto all'infinito in qualsiasi direzione e quindi esaminando i punti in cui un segmento della forma attraversa il raggio. Partendo da un conteggio pari a zero, aggiungi uno ogni volta che un segmento attraversa il raggio da sinistra a destra e sottrai uno ogni volta che un segmento del percorso attraversa il raggio da destra a sinistra. Dopo aver contato gli incroci, se il risultato è zero allora il punto è fuori dal percorso; in caso contrario, è all'interno. |

### Guarda anche

* spazio dei nomi [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* assemblea [Aspose.Page](../../)


