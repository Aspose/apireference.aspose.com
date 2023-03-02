---
title: TopoJsonOptions.DefaultObjectName
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: TopoJsonOptions संपत्त. उस वस्तु क नम जहं सुवधओं क डफ़ल्ट रूप से रख जत है
type: docs
weight: 20
url: /hi/net/aspose.gis.formats.topojson/topojsonoptions/defaultobjectname/
---
## TopoJsonOptions.DefaultObjectName property

उस वस्तु का नाम जहां सुविधाओं को डिफ़ॉल्ट रूप से रखा जाता है।

```csharp
public string DefaultObjectName { get; set; }
```

### टिप्पणियों

यह लेखन विकल्प है - यह पढ़ने को प्रभावित नहीं करता है। TopoJSON में कितनी भी नामांकित वस्तु हो सकती है। ऐसी हर वस्तु में कई विशेषताएं हो सकती हैं। यह निर्दिष्ट करने के लिए कि किस वस्तु में अपनी सुविधा डालनी है, use [`ObjectNameAttribute`](../objectnameattribute/) संपत्ति. यदि नाम के साथ विशेषता[`ObjectNameAttribute`](../objectnameattribute/) है`null`या unset for कुछ फीचर, इस फीचर को नाम के साथ ऑब्जेक्ट में जोड़ा जाता है`DefaultObjectName` . यदि नाम के साथ विशेषता[`ObjectNameAttribute`](../objectnameattribute/) में मौजूद नहीं है[`Attributes`](../../../aspose.gis/vectorlayer/attributes/) संग्रह, सभी सुविधाओं को ऑब्जेक्ट में नाम के साथ रखा गया है[`ObjectNameAttribute`](../objectnameattribute/) . डिफ़ॉल्ट मान "अनाम" है.

### यह सभी देखें

* class [TopoJsonOptions](../)
* नाम स्थान [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* सभा [Aspose.GIS](../../../)


