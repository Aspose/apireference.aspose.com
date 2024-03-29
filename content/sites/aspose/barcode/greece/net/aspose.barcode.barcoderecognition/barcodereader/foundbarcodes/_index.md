---
title: FoundBarCodes
second_title: Aspose.BarCode για Αναφορά API .NET
description: ΑναγνωρίζεταιBarCodeResultaspose.barcode.barcoderecognition/barcoderesult/s πίνακας
type: docs
weight: 40
url: /el/net/aspose.barcode.barcoderecognition/barcodereader/foundbarcodes/
---
## BarCodeReader.FoundBarCodes property

Αναγνωρίζεται[`BarCodeResult`](../../barcoderesult/)s πίνακας

```csharp
public BarCodeResult[] FoundBarCodes { get; }
```

### Αξία περιουσίας

Το αναγνωρισμένο[`BarCodeResult`](../../barcoderesult/)s πίνακας

### Παραδείγματα

Αυτό το δείγμα δείχνει πώς να διαβάζετε γραμμικούς κώδικες με το BarCodeReader

```csharp
[C#]
using (BarCodeReader reader = new BarCodeReader(@"c:\test.png", DecodeType.Code39Standard, DecodeType.Code128))
{
    reader.ReadBarCodes();
    for(int i = 0; reader.FoundCount > i; ++i)
        Console.WriteLine("BarCode CodeText: " + reader.FoundBarCodes[i].CodeText);
}
[VB.NET]
Using reader As New BarCodeReader("c:\test.png", DecodeType.Code39Standard, DecodeType.Code128)
    reader.ReadBarCodes()
    For i As Integer = 0 To reader.FoundCount - 1 Step 1
        Console.WriteLine("BarCode CodeText: " + reader.FoundBarCodes(i).CodeText)
    Next
End Using
```

### Δείτε επίσης

* class [BarCodeResult](../../barcoderesult/)
* class [BarCodeReader](../)
* χώρος ονομάτων [Aspose.BarCode.BarCodeRecognition](../../barcodereader/)
* συνέλευση [Aspose.BarCode](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.BarCode.dll -->
