---
title: SpatialReferenceSystem.Validate
second_title: Riferimento API Aspose.GIS per .NET
description: SpatialReferenceSystem metodo. Determina se questo SRS è valido.
type: docs
weight: 240
url: /it/net/aspose.gis.spatialreferencing/spatialreferencesystem/validate/
---
## SpatialReferenceSystem.Validate method

Determina se questo SRS è valido.

```csharp
public abstract bool Validate(out string errorMessage)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| errorMessage | String& | Se il metodo restituisce`false` allora questa è la descrizione dell'invalidità. |

### Valore di ritorno

`true` se SRS è valido,`false` Altrimenti.

### Osservazioni

L'SRS valido deve avere un ellissoide valido. - L'SRS geografico deve avere esattamente un asse est/ovest, esattamente un asse nord/sud e un asse su/giù facoltativo (l'asse facoltativo è presente quando l'SRS geografico è un composto di SRS geografico 2D e SRS verticale). - L'SRS proiettato deve avere esattamente un asse est/ovest, esattamente un asse nord/sud e l'asse Su/Giù facoltativo (l'asse facoltativo è presente quando l'SRS proiettato è un composto di SRS geografico 2D e SRS verticale). - L'SRS geocentrico deve avere esattamente un asse Est/Ovest, esattamente un asse Nord/Sud ed esattamente un altro asse. - L'SRS verticale deve avere esattamente un asse Su/Giù. - L'SRS locale deve avere almeno un asse. Le direzioni degli assi non misurano. - L'SRS composto deve essere una combinazione di un SRS geografico/proiettato valido e di un SRS verticale valido.

### Guarda anche

* class [SpatialReferenceSystem](../)
* spazio dei nomi [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* assemblea [Aspose.GIS](../../../)


