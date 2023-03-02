---
title: AbstractPath.Combine
second_title: Riferimento API Aspose.GIS per .NET
description: AbstractPath metodo. Combina questoAbstractPath con componenti di percorso specificati.
type: docs
weight: 50
url: /it/net/aspose.gis/abstractpath/combine/
---
## AbstractPath.Combine method

Combina questo[`AbstractPath`](../) con componenti di percorso specificati.

```csharp
public virtual AbstractPath Combine(string location)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| location | String | Un componente del percorso da aggiungere a this[`AbstractPath`](../). |

### Valore di ritorno

Un nuovo[`AbstractPath`](../) indicando un[`Location`](../location/) questa è una combinazione di posizioni di questo[`AbstractPath`](../)e l'argomento.

### Osservazioni

Di solito questo metodo non dovrebbe essere sovrascritto da un erede. L'implementazione predefinita lo concatena[`Location`](../location/) con l'argomento e chiama the[`WithLocation`](../withlocation/) con la stringa concatenata come argomento. Il risultato della combinazione è definito nel modo seguente:  Se l'argomento inizia con il[`Separator`](../separator/), il risultato della combinazione è uguale all'argomento; Altrimenti, se[`Location`](../location/) termina con il[`Separator`](../separator/) , il risultato della combinazione è uguale a` +`; Altrimenti, il risultato è uguale a` + +`

### Guarda anche

* class [AbstractPath](../)
* spazio dei nomi [Aspose.Gis](../../abstractpath/)
* assemblea [Aspose.GIS](../../../)


