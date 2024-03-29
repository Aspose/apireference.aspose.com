---
title: SingleDecodeType
second_title: Referencia de API de Aspose.BarCode para .NET
description: Tipo de decodificación única. Ver tipo de decodificación para obtener instancia.
type: docs
weight: 270
url: /es/net/aspose.barcode.barcoderecognition/singledecodetype/
---
## SingleDecodeType class

Tipo de decodificación única. Ver tipo de decodificación para obtener instancia.

```csharp
public sealed class SingleDecodeType : BaseDecodeType, IEquatable<SingleDecodeType>
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [TypeIndex](../../aspose.barcode.barcoderecognition/singledecodetype/typeindex) { get; } | Obtiene un índice de decodificación type |
| [TypeName](../../aspose.barcode.barcoderecognition/singledecodetype/typename) { get; } | Obtiene un nombre de tipo de decodificación |

## Métodos

| Nombre | Descripción |
| --- | --- |
| static [Parse](../../aspose.barcode.barcoderecognition/singledecodetype/parse)(string) | Convierte la representación de cadena del nombre de un SingleDecodeType en su instancia. |
| override [ContainsAny](../../aspose.barcode.barcoderecognition/singledecodetype/containsany)(params BaseDecodeType[]) | Devuelve un valor que indica si esta instancia está incluida en la lista especificada. |
| [Equals](../../aspose.barcode.barcoderecognition/basedecodetype/equals)(BaseDecodeType) | Devuelve un valor que indica si esta instancia es igual a una especificada[`BaseDecodeType`](../basedecodetype) valor. |
| virtual [Equals](../../aspose.barcode.barcoderecognition/basedecodetype/equals)(MultyDecodeType) | Devuelve un valor que indica si esta instancia es igual a una especificada[`MultyDecodeType`](../multydecodetype) valor. |
| override [Equals](../../aspose.barcode.barcoderecognition/singledecodetype/equals#equals_3)(object) | Devuelve un valor que indica si esta instancia es igual a una especificada[`SingleDecodeType`](../singledecodetype) valor. |
| override [Equals](../../aspose.barcode.barcoderecognition/singledecodetype/equals#equals_2)(SingleDecodeType) | Devuelve un valor que indica si esta instancia es igual a una especificada[`SingleDecodeType`](../singledecodetype) valor. |
| override [GetHashCode](../../aspose.barcode.barcoderecognition/singledecodetype/gethashcode)() | Devuelve el código hash de esta instancia. |
| [GetString](../../aspose.barcode.barcoderecognition/singledecodetype/getstring)() | Convierte la instancia de SingleDecodeType a su representación de cadena equivalente. El formato de cadena es: "Índice:-1; Nombre:Ninguno". |
| override [ToString](../../aspose.barcode.barcoderecognition/singledecodetype/tostring)() | Devuelve el nombre del SingleDecodeType dado como una cadena. |
| static [GetString](../../aspose.barcode.barcoderecognition/singledecodetype/getstring)(SingleDecodeType) | Convierte la instancia de SingleDecodeType a su representación de cadena equivalente. El formato de cadena es: "Índice:-1; Nombre:Ninguno". |

### Ejemplos

Este ejemplo muestra cómo obtener una instancia de tipo de decodificación única.

```csharp
[C#]
SingleDecodeType singleType = DecodeType.QR 
 
[VB.NET]
Dim singleType As SingleDecodeType 
singleType = DecodeType.QR
```

### Ver también

* class [BaseDecodeType](../basedecodetype)
* espacio de nombres [Aspose.BarCode.BarCodeRecognition](../../aspose.barcode.barcoderecognition)
* asamblea [Aspose.BarCode](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.BarCode.dll -->
