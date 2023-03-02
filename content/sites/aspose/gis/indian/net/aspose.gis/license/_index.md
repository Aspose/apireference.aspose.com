---
title: Class License
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.License कक्ष. घटक क लइसेंस देने के तरके प्रदन करत है
type: docs
weight: 1270
url: /hi/net/aspose.gis/license/
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

## तरीकों

| नाम | विवरण |
| --- | --- |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense)(Stream) | घटक को लाइसेंस देता है। |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense_1)(string) | घटक को लाइसेंस देता है। |

### उदाहरण

इस उदाहरण में, MyLicense.lic नामक एक लाइसेंस फ़ाइल को उस फ़ोल्डर में खोजने का प्रयास किया जाएगा जिसमें घटक शामिल है, उस फ़ोल्डर में जिसमें कॉलिंग असेंबली, प्रविष्टि असेंबली के फ़ोल्डर में और उसके बाद कॉलिंग असेंबली के एम्बेडेड संसाधन।

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### यह सभी देखें

* नाम स्थान [Aspose.Gis](../../aspose.gis/)
* सभा [Aspose.GIS](../../)


