---
title: SingleDecodeType
second_title: Aspose.BarCode für .NET-API-Referenz
description: Einzelner Dekodierungstyp. Siehe Dekodierungstyp um Instanz zu erhalten.
type: docs
weight: 270
url: /de/net/aspose.barcode.barcoderecognition/singledecodetype/
---
## SingleDecodeType class

Einzelner Dekodierungstyp. Siehe Dekodierungstyp, um Instanz zu erhalten.

```csharp
public sealed class SingleDecodeType : BaseDecodeType, IEquatable<SingleDecodeType>
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [TypeIndex](../../aspose.barcode.barcoderecognition/singledecodetype/typeindex) { get; } | Ruft einen Index des Dekodierungstyps ab |
| [TypeName](../../aspose.barcode.barcoderecognition/singledecodetype/typename) { get; } | Ruft einen Namen des Dekodierungstyps ab |

## Methoden

| Name | Beschreibung |
| --- | --- |
| static [Parse](../../aspose.barcode.barcoderecognition/singledecodetype/parse)(string) | Konvertiert die Zeichenfolgendarstellung des Namens eines SingleDecodeType in seine Instanz. |
| override [ContainsAny](../../aspose.barcode.barcoderecognition/singledecodetype/containsany)(params BaseDecodeType[]) | Gibt einen Wert zurück, der angibt, ob diese Instanz in der angegebenen Liste enthalten ist. |
| [Equals](../../aspose.barcode.barcoderecognition/basedecodetype/equals)(BaseDecodeType) | Gibt einen Wert zurück, der angibt, ob diese Instanz gleich einer angegebenen ist[`BaseDecodeType`](../basedecodetype) wert. |
| virtual [Equals](../../aspose.barcode.barcoderecognition/basedecodetype/equals)(MultyDecodeType) | Gibt einen Wert zurück, der angibt, ob diese Instanz gleich einer angegebenen ist[`MultyDecodeType`](../multydecodetype) wert. |
| override [Equals](../../aspose.barcode.barcoderecognition/singledecodetype/equals#equals_3)(object) | Gibt einen Wert zurück, der angibt, ob diese Instanz gleich einer angegebenen ist[`SingleDecodeType`](../singledecodetype) wert. |
| override [Equals](../../aspose.barcode.barcoderecognition/singledecodetype/equals#equals_2)(SingleDecodeType) | Gibt einen Wert zurück, der angibt, ob diese Instanz gleich einer angegebenen ist[`SingleDecodeType`](../singledecodetype) wert. |
| override [GetHashCode](../../aspose.barcode.barcoderecognition/singledecodetype/gethashcode)() | Gibt den Hashcode für diese Instanz zurück. |
| [GetString](../../aspose.barcode.barcoderecognition/singledecodetype/getstring)() | Konvertiert die Instanz von SingleDecodeType in die entsprechende Zeichenfolgendarstellung. Das Zeichenfolgenformat lautet: „Index:-1; Name:None“. |
| override [ToString](../../aspose.barcode.barcoderecognition/singledecodetype/tostring)() | Gibt den Namen des angegebenen SingleDecodeType als String zurück. |
| static [GetString](../../aspose.barcode.barcoderecognition/singledecodetype/getstring)(SingleDecodeType) | Konvertiert die Instanz von SingleDecodeType in die entsprechende Zeichenfolgendarstellung. Das Zeichenfolgenformat lautet: „Index:-1; Name:None“. |

### Beispiele

Dieses Beispiel zeigt, wie man eine Instanz eines einzelnen Dekodierungstyps erhält.

```csharp
[C#]
SingleDecodeType singleType = DecodeType.QR 
 
[VB.NET]
Dim singleType As SingleDecodeType 
singleType = DecodeType.QR
```

### Siehe auch

* class [BaseDecodeType](../basedecodetype)
* namensraum [Aspose.BarCode.BarCodeRecognition](../../aspose.barcode.barcoderecognition)
* Montage [Aspose.BarCode](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.BarCode.dll -->
