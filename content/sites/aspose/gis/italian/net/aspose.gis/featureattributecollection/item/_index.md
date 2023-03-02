---
title: FeatureAttributeCollection.Item
second_title: Riferimento API Aspose.GIS per .NET
description: FeatureAttributeCollection proprietà. Ottiene o imposta ilFeatureAttribute allindice specificato.
type: docs
weight: 30
url: /it/net/aspose.gis/featureattributecollection/item/
---
## FeatureAttributeCollection indexer (1 of 2)

Ottiene o imposta il[`FeatureAttribute`](../../featureattribute/) all'indice specificato.

```csharp
public FeatureAttribute this[int index] { get; set; }
```

| Parametro | Descrizione |
| --- | --- |
| index | L'indice in base zero dell'attributo da ottenere o impostare. |

### Valore di ritorno

L'attributo all'indice specificato.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentOutOfRangeException | L'indice è fuori intervallo. |
| InvalidOperationException | Tentativo di modificare una raccolta bloccata. |

### Guarda anche

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* spazio dei nomi [Aspose.Gis](../../featureattributecollection/)
* assemblea [Aspose.GIS](../../../)

---

## FeatureAttributeCollection indexer (2 of 2)

Ottiene o imposta il[`FeatureAttribute`](../../featureattribute/) con un nome specificato.

```csharp
public FeatureAttribute this[string name] { get; }
```

| Parametro | Descrizione |
| --- | --- |
| name | Nome degli attributi. |

### Valore di ritorno

L'attributo con il nome specificato, o`null` se non si trova.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il nome dell'attributo è`null`. |

### Guarda anche

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* spazio dei nomi [Aspose.Gis](../../featureattributecollection/)
* assemblea [Aspose.GIS](../../../)


