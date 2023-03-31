---
title: Class License
second_title: .NET API संदर्भ के लिए Aspose.OMR
description: Aspose.OMR.License कक्ष. घटक क लइसेंस देने के तरके प्रदन करत है
type: docs
weight: 770
url: /hi/net/aspose.omr/license/
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
| [Embedded](../../aspose.omr/license/embedded/) { get; set; } | लाइसेंस संख्या एम्बेडेड संसाधन के रूप में जोड़ा गया था। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [SetLicense](../../aspose.omr/license/setlicense/#setlicense)(Stream) | घटक को लाइसेंस देता है। |
| [SetLicense](../../aspose.omr/license/setlicense/#setlicense_1)(string) | घटक को लाइसेंस देता है। |

### उदाहरण

इस उदाहरण में, MyLicense.lic नामक लाइसेंस फ़ाइल को उस फ़ोल्डर में खोजने का प्रयास किया जाएगा जिसमें घटक शामिल है, उस फ़ोल्डर में जिसमें कॉलिंग असेंबली, प्रविष्टि असेंबली के फ़ोल्डर में और फिर एम्बेडेड में है कॉलिंग असेंबली के संसाधन।

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### यह सभी देखें

* नाम स्थान [Aspose.OMR](../../aspose.omr/)
* सभा [Aspose.OMR](../../)


