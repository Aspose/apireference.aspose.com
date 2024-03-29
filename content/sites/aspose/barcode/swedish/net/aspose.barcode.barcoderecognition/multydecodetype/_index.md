---
title: MultyDecodeType
second_title: Aspose.BarCode för .NET API-referens
description: Sammansatt avkodningstyp.
type: docs
weight: 200
url: /sv/net/aspose.barcode.barcoderecognition/multydecodetype/
---
## MultyDecodeType class

Sammansatt avkodningstyp.

```csharp
public class MultyDecodeType : BaseDecodeType, IEquatable<MultyDecodeType>
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [MultyDecodeType](multydecodetype#constructor)(params BaseDecodeType[]) | Initierar en ny instans av[`MultyDecodeType`](../multydecodetype) class. |
| [MultyDecodeType](multydecodetype#constructor_1)(params SingleDecodeType[]) | Initierar en ny instans av[`MultyDecodeType`](../multydecodetype) class. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [GetSingleTypesCount](../../aspose.barcode.barcoderecognition/multydecodetype/getsingletypescount) { get; } | Returnerar ett antal enstaka typer. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Add](../../aspose.barcode.barcoderecognition/multydecodetype/add)(SingleDecodeType) | Lägger till en till[`SingleDecodeType`](../singledecodetype)till MultyDecodeType. |
| [ContainsAll](../../aspose.barcode.barcoderecognition/multydecodetype/containsall)(params BaseDecodeType[]) | Kontrollera om detta innehåller alla typer från streckkodstyper. |
| override [ContainsAny](../../aspose.barcode.barcoderecognition/multydecodetype/containsany)(params BaseDecodeType[]) | Innehåller någon av typen |
| [Equals](../../aspose.barcode.barcoderecognition/basedecodetype/equals)(BaseDecodeType) | Returnerar ett värde som anger om denna instans är lika med en specificerad[`BaseDecodeType`](../basedecodetype) värde. |
| override [Equals](../../aspose.barcode.barcoderecognition/multydecodetype/equals#equals_1)(MultyDecodeType) | Returnerar ett värde som anger om denna instans är lika med en specificerad[`MultyDecodeType`](../multydecodetype) värde. |
| override [Equals](../../aspose.barcode.barcoderecognition/multydecodetype/equals#equals_3)(object) | Returnerar ett värde som anger om denna instans är lika med en specificerad[`MultyDecodeType`](../multydecodetype) värde. |
| virtual [Equals](../../aspose.barcode.barcoderecognition/basedecodetype/equals)(SingleDecodeType) | Returnerar ett värde som anger om denna instans är lika med en specificerad[`SingleDecodeType`](../singledecodetype) värde. |
| override [GetHashCode](../../aspose.barcode.barcoderecognition/multydecodetype/gethashcode)() | Returnerar hashkoden för denna instans. |
| [GetSingleTypes](../../aspose.barcode.barcoderecognition/multydecodetype/getsingletypes)() | Representerar en lista med enstaka typer. |
| override [ToString](../../aspose.barcode.barcoderecognition/multydecodetype/tostring)() | Åsidosatt metod som representerar MultyDecodeType som en sträng. |
| static [TryParse](../../aspose.barcode.barcoderecognition/multydecodetype/tryparse)(string, out MultyDecodeType) | Konverterar strängrepresentationen av en MultyDecodeType till dess instans. Ett returvärde anger om konverteringen lyckades eller misslyckades. |

### Exempel

Detta exempel visar hur man skapar sammansatta MultyDecode-typer som kombinerar SingleDecodeType- och MultiDecode-typer.

```csharp
[C#]
MultyDecodeType types1 = new MultyDecodeType(DecodeType.QR, DecodeType.DataMatrix);
MultyDecodeType types2 = new MultyDecodeType(types1, DecodeType.Code128, DecodeType.Code39Standard);
[VB.NET]
Dim multyType1 As MultyDecodeType 
multyType1 = New MultyDecodeType(DecodeType.QR, DecodeType.DataMatrix)
Dim multyType2 As MultyDecodeType
multyType2 = New MultyDecodeType(multyType1, DecodeType.Code128, DecodeType.Code39Standard)
```

### Se även

* class [BaseDecodeType](../basedecodetype)
* namnutrymme [Aspose.BarCode.BarCodeRecognition](../../aspose.barcode.barcoderecognition)
* hopsättning [Aspose.BarCode](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.BarCode.dll -->
