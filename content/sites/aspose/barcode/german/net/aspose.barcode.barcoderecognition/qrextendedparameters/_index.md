---
title: QRExtendedParameters
second_title: Aspose.BarCode für .NET-API-Referenz
description: Speichert QR-strukturierte Anhängeinformationen des erkannten Barcodes
type: docs
weight: 230
url: /de/net/aspose.barcode.barcoderecognition/qrextendedparameters/
---
## QRExtendedParameters class

Speichert QR-strukturierte Anhängeinformationen des erkannten Barcodes

```csharp
public sealed class QRExtendedParameters : BaseExtendedParameters
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [IsEmpty](../../aspose.barcode.barcoderecognition/baseextendedparameters/isempty) { get; } | Testet, ob alle Parameter nur Standardwerte haben |
| [QRStructuredAppendModeBarCodeIndex](../../aspose.barcode.barcoderecognition/qrextendedparameters/qrstructuredappendmodebarcodeindex) { get; } | Ruft den Index des QR-Strichcodes im strukturierten Anhängemodus ab. Der Index beginnt bei 0. Der Standardwert ist -1. |
| [QRStructuredAppendModeBarCodesQuantity](../../aspose.barcode.barcoderecognition/qrextendedparameters/qrstructuredappendmodebarcodesquantity) { get; } | Ruft die Anzahl der Barcodes im strukturierten QR-Anhängemodus ab. Der Standardwert ist -1. |
| [QRStructuredAppendModeParityData](../../aspose.barcode.barcoderecognition/qrextendedparameters/qrstructuredappendmodeparitydata) { get; } | Ruft die Paritätsdaten des QR-strukturierten Anfügemodus ab. Der Standardwert ist -1. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| override [Equals](../../aspose.barcode.barcoderecognition/qrextendedparameters/equals)(object) | Gibt einen Wert zurück, der angibt, ob diese Instanz gleich einer angegebenen ist[`QRExtendedParameters`](../qrextendedparameters) wert. |
| override [GetHashCode](../../aspose.barcode.barcoderecognition/qrextendedparameters/gethashcode)() | Gibt den Hashcode für diese Instanz zurück. |
| override [ToString](../../aspose.barcode.barcoderecognition/qrextendedparameters/tostring)() | Gibt eine für Menschen lesbare Zeichenfolgendarstellung davon zurück[`QRExtendedParameters`](../qrextendedparameters) . |
| [operator ==](../../aspose.barcode.barcoderecognition/qrextendedparameters/op_equality) | Gibt einen Wert zurück, der angibt, ob der erste[`QRExtendedParameters`](../qrextendedparameters) Wert ist gleich der Sekunde. |
| [operator !=](../../aspose.barcode.barcoderecognition/qrextendedparameters/op_inequality) | Gibt einen Wert zurück, der angibt, ob der erste[`QRExtendedParameters`](../qrextendedparameters) Wert unterscheidet sich vom zweiten. |

### Beispiele

Dieses Beispiel zeigt, wie QR-strukturierte Anhängedaten abgerufen werden

```csharp
[C#]
using (BarCodeReader reader = new BarCodeReader(@"c:\test.png", DecodeType.QR))
{
    foreach (BarCodeResult result in reader.ReadBarCodes())
    {
        Console.WriteLine("BarCode Type: " + result.CodeTypeName);
        Console.WriteLine("BarCode CodeText: " + result.CodeText);
        Console.WriteLine("QR Structured Append Quantity: " + result.Extended.QR.QRStructuredAppendModeBarCodesQuantity);
        Console.WriteLine("QR Structured Append Index: " + result.Extended.QR.QRStructuredAppendModeBarCodeIndex);
        Console.WriteLine("QR Structured Append ParityData: " + result.Extended.QR.QRStructuredAppendModeParityData);
    }
}
[VB.NET]
Using reader As New BarCodeReader("c:\test.png", DecodeType.QR)
    For Each result As BarCodeResult In reader.ReadBarCodes()
        Console.WriteLine("BarCode Type: " + result.CodeTypeName)
        Console.WriteLine("BarCode CodeText: " + result.CodeText)
        Console.WriteLine("QR Structured Append Quantity: " + result.Extended.QR.QRStructuredAppendModeBarCodesQuantity)
        Console.WriteLine("QR Structured Append Index: " + result.Extended.QR.QRStructuredAppendModeBarCodeIndex)
        Console.WriteLine("QR Structured Append ParityData: " + result.Extended.QR.QRStructuredAppendModeParityData)
    Next
End Using
```

### Siehe auch

* class [BaseExtendedParameters](../baseextendedparameters)
* namensraum [Aspose.BarCode.BarCodeRecognition](../../aspose.barcode.barcoderecognition)
* Montage [Aspose.BarCode](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.BarCode.dll -->
