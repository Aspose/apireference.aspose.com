---
title: Class Metered
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.Metered classe. Fornisce metodi per impostare la chiave misurata.
type: docs
weight: 2200
url: /it/net/aspose.svg/metered/
---
## Metered class

Fornisce metodi per impostare la chiave misurata.

```csharp
public class Metered
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Metered](metered/)() | Inizializza una nuova istanza di questa classe. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [SetMeteredKey](../../aspose.svg/metered/setmeteredkey/)(string, string) | Imposta la chiave pubblica e privata misurata. Se acquisti una licenza misurata, quando avvii l'applicazione, questa API dovrebbe essere chiamata, normalmente, questo è sufficiente. Tuttavia, se non riesci sempre a caricare i dati di consumo e superi le 24 ore, la licenza verrà impostata sullo stato di valutazione, per evitare tale caso, dovresti controllare regolarmente lo stato della licenza, se è lo stato di valutazione, chiama di nuovo questa API. |
| static [GetConsumptionCredit](../../aspose.svg/metered/getconsumptioncredit/)() | Ottiene credito di consumo |
| static [GetConsumptionQuantity](../../aspose.svg/metered/getconsumptionquantity/)() | Ottiene la dimensione del file di consumo |

### Esempi

In questo esempio, verrà effettuato un tentativo di impostare la chiave pubblica e privata misurata

```csharp
[C#]

Metered matered = new Metered();
matered.SetMeteredKey("PublicKey", "PrivateKey");


[Visual Basic]

Dim matered As Metered = New Metered
matered.SetMeteredKey("PublicKey", "PrivateKey")
```

il file jar del componente:

```csharp
Metered matered = new Metered();
matered.setMeteredKey("PublicKey", "PrivateKey");
```

### Guarda anche

* spazio dei nomi [Aspose.Svg](../../aspose.svg/)
* assemblea [Aspose.SVG](../../)


