---
title: IgnoreEndingFillingPatternsForCTable
second_title: Aspose.BarCode for .NET API Referansı
description: AustraliaPost kod çözücünün CTable yöntemi olarak kod çözme sırasında Müşteri Bilgileri Alanındaki son doldurma kalıplarını yok saymasını sağlayan işaret. CTable kodlama yönteminin kodlama tablosunda boşluk yok ve doldurma kalıplarının 333 dizisinin kodu z harfi olarak çözülüyor.
type: docs
weight: 30
url: /tr/net/aspose.barcode.barcoderecognition/australiapostsettings/ignoreendingfillingpatternsforctable/
---
## AustraliaPostSettings.IgnoreEndingFillingPatternsForCTable property

AustraliaPost kod çözücünün CTable yöntemi olarak kod çözme sırasında Müşteri Bilgileri Alanındaki son doldurma kalıplarını yok saymasını sağlayan işaret. CTable kodlama yönteminin kodlama tablosunda boşluk yok ve doldurma kalıplarının "333" dizisinin kodu "z" harfi olarak çözülüyor.

```csharp
public bool IgnoreEndingFillingPatternsForCTable { get; set; }
```

### Mülk değeri

AustraliaPost kod çözücüsünü CTable yöntemi kod çözme sırasında son doldurma modellerini yok saymaya zorlayan işaret

### Örnekler

Bu örnek, CTable Interpreting Type ve doldurma kalıplarını yok sayarak Australia Post barkodunun nasıl oluşturulacağını ve tanınacağını gösterir.

```csharp
[C#]
using (BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.AustraliaPost, "5912345678AB"))
{
    generator.Parameters.Barcode.AustralianPost.AustralianPostEncodingTable = CustomerInformationInterpretingType.CTable;
    using (Bitmap image = generator.GenerateBarCodeImage())
    using (BarCodeReader reader = new BarCodeReader(image, DecodeType.AustraliaPost))
     {
        reader.BarcodeSettings.AustraliaPost.CustomerInformationInterpretingType = CustomerInformationInterpretingType.CTable;
        reader.BarcodeSettings.AustraliaPost.IgnoreEndingFillingPatternsForCTable = true;
        foreach (BarCodeResult result in reader.ReadBarCodes())
        {
            Console.WriteLine("BarCode Type: " + result.CodeType);
            Console.WriteLine("BarCode CodeText: " + result.CodeText);
        }
    }
}
[VB.NET]
Using generator As New BarcodeGenerator(EncodeTypes.AustraliaPost, "5912345678AB")
    generator.Parameters.Barcode.AustralianPost.AustralianPostEncodingTable = CustomerInformationInterpretingType.CTable
    Using image As Bitmap = generator.GenerateBarCodeImage()
        Using reader As New BarCodeReader(image, DecodeType.AustraliaPost)
            reader.BarcodeSettings.AustraliaPost.CustomerInformationInterpretingType = CustomerInformationInterpretingType.CTable
            reader.BarcodeSettings.AustraliaPost.IgnoreEndingFillingPatternsForCTable = True
            For Each result As BarCodeResult In reader.ReadBarCodes()
                Console.WriteLine("BarCode Type: " + result.CodeTypeName)
                Console.WriteLine("BarCode CodeText: " + result.CodeText)
            Next
        End Using
    End Using
End Using
```

### Ayrıca bakınız

* class [AustraliaPostSettings](../../australiapostsettings)
* ad alanı [Aspose.BarCode.BarCodeRecognition](../../australiapostsettings)
* toplantı [Aspose.BarCode](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.BarCode.dll -->
