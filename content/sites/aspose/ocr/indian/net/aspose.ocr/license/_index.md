---
title: Class License
second_title: Aspose.OCR .NET API संदर्भ के लिए
description: Aspose.OCR.License कक्ष. घटक क लइसेंस देने के तरके प्रदन करत है
type: docs
weight: 120
url: /hi/net/aspose.ocr/license/
---
## License class

घटक को लाइसेंस देने के तरीके प्रदान करता है।

```csharp
public class License
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [License](license/)() | डिफ़ॉल्ट कंस्ट्रक्टर। |

## गुण

| नाम | विवरण |
| --- | --- |
| [IsLicensed](../../aspose.ocr/license/islicensed/) { get; } | एक मान प्राप्त करता है जो बताता है कि उत्पाद लाइसेंस प्राप्त है या नहीं। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense)(Stream) | घटक को लाइसेंस देता है। |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense_1)(string) | घटक को लाइसेंस देता है। |

### उदाहरण

इस उदाहरण में, MyLicense.lic नामक एक लाइसेंस फ़ाइल को उस फ़ोल्डर में खोजने का प्रयास किया जाएगा जिसमें घटक शामिल है, उस फ़ोल्डर में जिसमें कॉलिंग असेंबली, प्रविष्टि असेंबली के फ़ोल्डर में और फिर अंदर कॉलिंग असेंबली के एम्बेडेड संसाधन।

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");
```

### यह सभी देखें

* नाम स्थान [Aspose.OCR](../../aspose.ocr/)
* सभा [Aspose.OCR](../../)


