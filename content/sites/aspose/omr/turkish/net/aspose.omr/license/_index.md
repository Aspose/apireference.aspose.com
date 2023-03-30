---
title: Class License
second_title: Aspose.OMR for .NET API Referansı
description: Aspose.OMR.License sınıf. Bileşeni lisanslamak için yöntemler sağlar.
type: docs
weight: 770
url: /tr/net/aspose.omr/license/
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
| [Embedded](../../aspose.omr/license/embedded/) { get; set; } | Lisans numarası gömülü kaynak olarak eklendi. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [SetLicense](../../aspose.omr/license/setlicense/#setlicense)(Stream) | Bileşeni lisanslar. |
| [SetLicense](../../aspose.omr/license/setlicense/#setlicense_1)(string) | Bileşeni lisanslar. |

### Örnekler

Bu örnekte, bileşenini içeren klasörde, çağıran derlemeyi içeren klasörde, giriş derlemesinin klasöründe ve ardından gömülü çağıran derlemenin kaynakları.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### Ayrıca bakınız

* ad alanı [Aspose.OMR](../../aspose.omr/)
* toplantı [Aspose.OMR](../../)


