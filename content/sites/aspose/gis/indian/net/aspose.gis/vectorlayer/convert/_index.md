---
title: VectorLayer.Convert
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: VectorLayer तरक. एक परत क एक अलग प्ररूप में बदलें
type: docs
weight: 200
url: /hi/net/aspose.gis/vectorlayer/convert/
---
## Convert(string, FileDriver, string, FileDriver) {#convert_2}

एक परत को एक अलग प्रारूप में बदलें।

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| sourcePath | String | उस परत का पथ जिसे परिवर्तित किया जाएगा। |
| sourceDriver | FileDriver | स्रोत परत के लिए प्रारूप ड्राइवर। |
| destinationPath | String | रूपांतरण के परिणामस्वरूप बनने वाली परत का पथ. |
| destinationDriver | FileDriver | गंतव्य परत के लिए प्रारूप ड्राइवर। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | दोनों में से कोई एक रास्ता है`null`. |

### यह सभी देखें

* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* नाम स्थान [Aspose.Gis](../../vectorlayer/)
* सभा [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver) {#convert}

एक परत को एक अलग प्रारूप में बदलें।

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| sourcePath | AbstractPath | उस परत का पथ जिसे परिवर्तित किया जाएगा। |
| sourceDriver | FileDriver | स्रोत परत के लिए प्रारूप ड्राइवर। |
| destinationPath | AbstractPath | रूपांतरण के परिणामस्वरूप बनने वाली परत का पथ. |
| destinationDriver | FileDriver | गंतव्य परत के लिए प्रारूप ड्राइवर। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | दोनों में से कोई एक रास्ता है`null`. |

### यह सभी देखें

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* नाम स्थान [Aspose.Gis](../../vectorlayer/)
* सभा [Aspose.GIS](../../../)

---

## Convert(string, FileDriver, string, FileDriver, ConversionOptions) {#convert_3}

एक परत को एक अलग प्रारूप में बदलें।

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver, ConversionOptions options)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| sourcePath | String | उस परत का पथ जिसे परिवर्तित किया जाएगा। |
| sourceDriver | FileDriver | स्रोत परत के लिए प्रारूप ड्राइवर। |
| destinationPath | String | रूपांतरण के परिणामस्वरूप बनने वाली परत का पथ. |
| destinationDriver | FileDriver | गंतव्य परत के लिए प्रारूप ड्राइवर। |
| options | ConversionOptions | रूपांतरण प्रक्रिया के लिए विकल्प। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | दोनों में से कोई एक रास्ता है`null`. |
| ArgumentException | विकल्प ऑब्जेक्ट में इस ड्राइवर के लिए गलत प्रकार है। |
| [GisException](../../gisexception/) | फ़ाइल में/से सुविधा को पढ़ने या लिखने में त्रुटि। |
| IOException | एक I/O त्रुटि हुई। |
| NotSupportedException | में निर्दिष्ट स्थानिक संदर्भ प्रणाली*options* द्वारा समर्थित नहीं है*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | स्थानिक संदर्भ प्रणाली को लक्षित करने के लिए स्रोत स्थानिक संदर्भ प्रणाली से सुविधाओं ज्यामिति का रूपांतरण विफल रहा। |

### यह सभी देखें

* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* नाम स्थान [Aspose.Gis](../../vectorlayer/)
* सभा [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) {#convert_1}

एक परत को एक अलग प्रारूप में बदलें।

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver, ConversionOptions options)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| sourcePath | AbstractPath | उस परत का पथ जिसे परिवर्तित किया जाएगा। |
| sourceDriver | FileDriver | स्रोत परत के लिए प्रारूप ड्राइवर। |
| destinationPath | AbstractPath | रूपांतरण के परिणामस्वरूप बनने वाली परत का पथ. |
| destinationDriver | FileDriver | गंतव्य परत के लिए प्रारूप ड्राइवर। |
| options | ConversionOptions | रूपांतरण प्रक्रिया के लिए विकल्प। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | दोनों में से कोई एक रास्ता है`null`. |
| ArgumentException | विकल्प ऑब्जेक्ट में इस ड्राइवर के लिए गलत प्रकार है। |
| [GisException](../../gisexception/) | फ़ाइल में/से सुविधा को पढ़ने या लिखने में त्रुटि। |
| IOException | एक I/O त्रुटि हुई। |
| NotSupportedException | में निर्दिष्ट स्थानिक संदर्भ प्रणाली*options* द्वारा समर्थित नहीं है*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | स्थानिक संदर्भ प्रणाली को लक्षित करने के लिए स्रोत स्थानिक संदर्भ प्रणाली से सुविधाओं ज्यामिति का रूपांतरण विफल रहा। |

### यह सभी देखें

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* नाम स्थान [Aspose.Gis](../../vectorlayer/)
* सभा [Aspose.GIS](../../../)


