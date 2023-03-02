---
title: FileGdbCoordinatePrecisionGrid.CreateFromRectangle
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: FileGdbCoordinatePrecisionGrid तरक. नय बनत हैफ़इल जडब समन्वय प्रेसजन ग्रड जैसे क एक आयत के भतर सभ मन प्रदर्शत करने यग्य हैं
type: docs
weight: 20
url: /hi/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/
---
## FileGdbCoordinatePrecisionGrid.CreateFromRectangle method

नया बनाता है`फ़ाइल जीडीबी समन्वय प्रेसिजन ग्रिड` जैसे कि एक आयत के भीतर सभी मान प्रदर्शित करने योग्य हैं।

```csharp
public static FileGdbCoordinatePrecisionGrid CreateFromRectangle(IPoint p1, IPoint p2)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| p1 | IPoint | आयत का एक कोना। |
| p2 | IPoint | आयत के विपरीत कोने। के समान आयाम होने चाहिए*p1*. |

### प्रतिलाभ की मात्रा

द`फ़ाइल जीडीबी समन्वय प्रेसिजन ग्रिड`जैसे कि एक आयत के भीतर सभी मान प्रतिनिधित्व योग्य हैं। आयत के बाहर के मान प्रतिनिधित्व योग्य नहीं हैं, इसलिए सभी निर्देशांक जो कि FileGDB परत को लिखे जाएंगे, आयत के अंदर होने चाहिए।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null` . |
| ArgumentException | *p1* और*p2* एक वैध खाली आयत न बनाएं: *p1* या*p2* खाली है। HasZ' के झंडे*p1* के 'HasZ' ध्वज के बराबर नहीं है*p2* HasM' के झंडे*p1* के 'HasM' ध्वज के बराबर नहीं है*p2* एक्स' का समन्वय*p1* के निर्देशांक 'X' के बराबर है*p2* Y' का निर्देशांक*p1* के 'Y' निर्देशांक के बराबर है*p2* Z' का निर्देशांक*p1* 'Z' के निर्देशांक के बराबर है*p2* एम' का समन्वय*p1* 'M' के निर्देशांक के बराबर है*p2* कोई समन्वय हैNaN या अनंत। |

### यह सभी देखें

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [FileGdbCoordinatePrecisionGrid](../)
* नाम स्थान [Aspose.Gis.Formats.FileGdb](../../filegdbcoordinateprecisiongrid/)
* सभा [Aspose.GIS](../../../)


