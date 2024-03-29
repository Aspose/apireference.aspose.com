---
title: QrParameters
second_title: Aspose.BarCode for .NET API 参考
description: 二维码参数.
type: docs
weight: 930
url: /zh/net/aspose.barcode.generation/qrparameters/
---
## QrParameters class

二维码参数.

```csharp
public class QrParameters
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [AspectRatio](../../aspose.barcode.generation/qrparameters/aspectratio) { get; set; } | 二维条码模块的高宽比。 |
| [CodeTextEncoding](../../aspose.barcode.generation/qrparameters/codetextencoding) { get; set; } | 获取或设置codetext的编码。 默认值：UTF-8 |
| [QrECIEncoding](../../aspose.barcode.generation/qrparameters/qreciencoding) { get; set; } | 扩展频道解释标识符。它用于告诉条形码阅读器 details 用于对符号中的数据进行编码的参考。 当前实现包含所有众所周知的字符集编码。 |
| [QrEncodeMode](../../aspose.barcode.generation/qrparameters/qrencodemode) { get; set; } | 条码编码模式的二维码类型。 默认值：QREncodeMode.Auto. |
| [QrEncodeType](../../aspose.barcode.generation/qrparameters/qrencodetype) { get; set; } | QR / MicroQR 选择器模式。为标准 QR 符号选择 ForceQR，为 MicroQR 选择 Auto。 |
| [QrErrorLevel](../../aspose.barcode.generation/qrparameters/qrerrorlevel) { get; set; } | QR 条码的 Reed-Solomon 纠错级别。 从低到高：LevelL、LevelM、LevelQ、LevelH。见 QRErrorLevel. |
| [QrVersion](../../aspose.barcode.generation/qrparameters/qrversion) { get; set; } | QR 码的版本。 QR 码从 Version1 到 Version40，MicroQr 从 M1 到 M4。 默认值为 QRVersion.Auto. |
| [StructuredAppend](../../aspose.barcode.generation/qrparameters/structuredappend) { get; set; } | QR 结构化附加参数。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| override [ToString](../../aspose.barcode.generation/qrparameters/tostring)() | 返回一个人类可读的字符串表示[`QrParameters`](../qrparameters). |

### 也可以看看

* 命名空间 [Aspose.BarCode.Generation](../../aspose.barcode.generation)
* 部件 [Aspose.BarCode](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.BarCode.dll -->
