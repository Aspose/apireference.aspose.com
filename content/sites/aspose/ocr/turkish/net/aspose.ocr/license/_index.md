---
title: Class License
second_title: Aspose.OCR for .NET API Referansı
description: Aspose.OCR.License sınıf. Bileşeni lisanslamak için yöntemler sağlar.
type: docs
weight: 120
url: /tr/net/aspose.ocr/license/
---
## License class

Bileşeni lisanslamak için yöntemler sağlar.

```csharp
public class License
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [License](license/)() | Default_Constructor |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [IsLicensed](../../aspose.ocr/license/islicensed/) { get; } | Ürünün lisanslı olup olmadığını gösteren bir değer alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense)(Stream) | Bileşeni lisanslar. |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense_1)(string) | Bileşeni lisanslar. |

### Örnekler

Bu örnekte, bileşenini içeren klasörde, çağıran derlemeyi içeren klasörde, giriş derlemesinin klasöründe ve ardından çağıran derlemenin katıştırılmış kaynakları.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");
```

### Ayrıca bakınız

* ad alanı [Aspose.OCR](../../aspose.ocr/)
* toplantı [Aspose.OCR](../../)


