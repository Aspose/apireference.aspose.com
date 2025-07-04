---
title: BaseDecodeType.TryParse
second_title: Aspose.BarCode for .NET API Reference
description: BaseDecodeType method. Converts the string representation of a SingleDecodeType to its instance. A return value indicates whether the conversion succeeded or failed
type: docs
weight: 30
url: /net/aspose.barcode.barcoderecognition/basedecodetype/tryparse/
---
## TryParse(string, out SingleDecodeType) {#tryparse_2}

Converts the string representation of a SingleDecodeType to its instance. A return value indicates whether the conversion succeeded or failed.

```csharp
public static bool TryParse(string parsingType, out SingleDecodeType result)
```

| Parameter | Type | Description |
| --- | --- | --- |
| parsingType | String | A string containing a SingleDecodeType in the format as "EAN8" or "EAN13" or "CodaBar"... to convert. |
| result | SingleDecodeType& | An actual SingleDecodeType is returned, when conversion has completed successfully; otherwise it returns indefinite type: DecodeType.None. |

### Return Value

**true** if parsingType was converted successfully; otherwise, **false**.

### See Also

* class [SingleDecodeType](../../singledecodetype/)
* class [BaseDecodeType](../)
* namespace [Aspose.BarCode.BarCodeRecognition](../../../aspose.barcode.barcoderecognition/)
* assembly [Aspose.BarCode](../../../)

---

## TryParse(string, out MultyDecodeType) {#tryparse_1}

Converts the string representation of a MultyDecodeType to its instance. A return value indicates whether the conversion succeeded or failed.

```csharp
public static bool TryParse(string parsingType, out MultyDecodeType result)
```

| Parameter | Type | Description |
| --- | --- | --- |
| parsingType | String | A string containing a MultyDecodeType representation to convert. |
| result | MultyDecodeType& | An actual MultyDecodeType is returned, when conversion has completed successfully; otherwise it returns indefinite type: new MultyDecodeType(DecodeType.None) |

### Return Value

**true** if parsingType was converted successfully; otherwise, **false**.

### See Also

* class [MultyDecodeType](../../multydecodetype/)
* class [BaseDecodeType](../)
* namespace [Aspose.BarCode.BarCodeRecognition](../../../aspose.barcode.barcoderecognition/)
* assembly [Aspose.BarCode](../../../)

---

## TryParse(string, out BaseDecodeType) {#tryparse}

Converts the string representation of a BaseDecodeType to its instance, having determined the concrete type. A return value indicates whether the conversion succeeded or failed.

```csharp
public static bool TryParse(string parsingType, out BaseDecodeType result)
```

| Parameter | Type | Description |
| --- | --- | --- |
| parsingType | String | A string containing a MultyDecodeType representation to convert. |
| result | BaseDecodeType& | An actual MultyDecodeType is returned, when conversion has completed successfully; otherwise it returns indefinite type: DecodeType.None. |

### Return Value

**true** if parsingType was converted successfully; otherwise, **false**.

### See Also

* class [BaseDecodeType](../)
* namespace [Aspose.BarCode.BarCodeRecognition](../../../aspose.barcode.barcoderecognition/)
* assembly [Aspose.BarCode](../../../)


