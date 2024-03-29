---
title: Timeout
second_title: Aspose.BarCode untuk .NET API Referensi
description: Mendapat atau menyetel batas waktu proses pengenalan dalam milidetik.
type: docs
weight: 70
url: /id/net/aspose.barcode.barcoderecognition/barcodereader/timeout/
---
## BarCodeReader.Timeout property

Mendapat atau menyetel batas waktu proses pengenalan dalam milidetik.

```csharp
public int Timeout { get; set; }
```

### Nilai properti

Waktu habis.

### Contoh

Contoh ini menunjukkan cara menghindari pengakuan tergantung dengan timeout pada gambar besar

```csharp
[C#]
using (BarCodeReader reader = new BarCodeReader(@"c:\test.png"))
{
    reader.Timeout = 5000;
    foreach (BarCodeResult result in reader.ReadBarCodes())
        Console.WriteLine("BarCode CodeText: " + result.CodeText);
}
[VB.NET]
Using reader As New BarCodeReader("c:\test.png")
    reader.Timeout = 5000
    For Each result As BarCodeResult In reader.ReadBarCodes()
        Console.WriteLine("BarCode CodeText: " + result.CodeText)
    Next
End Using
```

### Lihat juga

* class [BarCodeReader](../)
* ruang nama [Aspose.BarCode.BarCodeRecognition](../../barcodereader/)
* perakitan [Aspose.BarCode](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.BarCode.dll -->
