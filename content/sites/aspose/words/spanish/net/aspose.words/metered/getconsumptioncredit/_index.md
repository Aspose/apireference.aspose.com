---
title: Metered.GetConsumptionCredit
linktitle: GetConsumptionCredit
articleTitle: GetConsumptionCredit
second_title: Aspose.Words para .NET
description: Metered GetConsumptionCredit método. Obtiene crédito de consumo en C#.
type: docs
weight: 30
url: /es/net/aspose.words/metered/getconsumptioncredit/
---
## Metered.GetConsumptionCredit method

Obtiene crédito de consumo

```csharp
public static decimal GetConsumptionCredit()
```

### Valor_devuelto

cantidad de consumo

## Ejemplos

Muestra cómo activar una licencia medida y realizar un seguimiento del crédito/consumo.

```csharp
// Cree una nueva licencia medida y luego imprima sus estadísticas de uso.
Metered metered = new Metered();
metered.SetMeteredKey("MyPublicKey", "MyPrivateKey");

Console.WriteLine($"Credit before operation: {Metered.GetConsumptionCredit()}");
Console.WriteLine($"Consumption quantity before operation: {Metered.GetConsumptionQuantity()}");

// Opere usando Aspose.Words y luego imprima nuestras estadísticas medidas nuevamente para ver cuánto gastamos.
Document doc = new Document(MyDir + "Document.docx");
doc.Save(ArtifactsDir + "Metered.Usage.pdf");

// El mecanismo de licencia medida de Aspose no envía los datos de uso al servidor de compra cada vez,
// necesitas usar la espera.
System.Threading.Thread.Sleep(10000);

Console.WriteLine($"Credit after operation: {Metered.GetConsumptionCredit()}");
Console.WriteLine($"Consumption quantity after operation: {Metered.GetConsumptionQuantity()}");
```

### Ver también

* class [Metered](../)
* espacio de nombres [Aspose.Words](../../../aspose.words/)
* asamblea [Aspose.Words](../../../)
