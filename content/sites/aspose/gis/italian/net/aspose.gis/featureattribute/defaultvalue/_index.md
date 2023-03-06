---
title: FeatureAttribute.DefaultValue
second_title: Riferimento API Aspose.GIS per .NET
description: FeatureAttribute proprietà. Ottiene o imposta un valore per lattributo che indica i dati mancanti.
type: docs
weight: 50
url: /it/net/aspose.gis/featureattribute/defaultvalue/
---
## FeatureAttribute.DefaultValue property

Ottiene o imposta un valore per l'attributo, che indica i dati mancanti.

```csharp
public object DefaultValue { get; set; }
```

### Eccezioni

| eccezione | condizione |
| --- | --- |
| InvalidOperationException | L'attributo è bloccato. |
| InvalidOperationException | L'attributo non consente`nullo` valori. |

### Osservazioni

Questo è il valore che rappresenta un'informazione mancante, quando un attributo non lo consente`nullo`value. Per gli attributi che lo consentono`nullo` valori ([`CanBeNull`](../canbenull/) ==`VERO` ),`DefaultValue` È`nullo` a meno che non sia stato esplicitamente modificato.

### Guarda anche

* class [FeatureAttribute](../)
* spazio dei nomi [Aspose.Gis](../../featureattribute/)
* assemblea [Aspose.GIS](../../../)


