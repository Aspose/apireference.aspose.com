---
title: EnableCalculationChain
second_title: Aspose.Cells for .NET API Referansı
description: Formüller için hesaplama zincirini etkinleştirip etkinleştirmeme. Varsayılan yanlıştır.
type: docs
weight: 50
url: /tr/net/aspose.cells/formulasettings/enablecalculationchain/
---
## FormulaSettings.EnableCalculationChain property

Formüller için hesaplama zincirini etkinleştirip etkinleştirmeme. Varsayılan yanlıştır.

```csharp
public bool EnableCalculationChain { get; set; }
```

### Notlar

Çalışma kitabında çok sayıda formül olduğunda ve kullanıcının bunları tekrar tekrar hesaplaması gerektiğinde yalnızca küçük bir kısmını değiştirerek performans açısından hesaplama zincirini etkinleştirmek faydalı olabilir. Öte yandan, zincir etkinse, zincir modelini korumak ekstra bellek gerektirir, ve ayrıca hücrenin değerini veya formüllerini değiştirmek gibi diğer bazı işlemler için biraz daha fazla işlemci süresi gerektirir. Bu özelliği false'tan true'ya değiştirdikten sonra, hesaplama zinciri analiz edilecek ve adresinde oluşturulacaktır. çalışma kitabı için ilk hesaplama zamanı, bu nedenle ilk hesaplama için gerekli süre zincirsiz normal hesaplamadan daha fazla olabilir.

### Ayrıca bakınız

* class [FormulaSettings](../../formulasettings)
* ad alanı [Aspose.Cells](../../formulasettings)
* toplantı [Aspose.Cells](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
