---
title: FeaturesSequence.SaveTo
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: FeaturesSequence तरक. सुवधओं के अनुक्रम क परत दर परत सहेजत है
type: docs
weight: 50
url: /hi/net/aspose.gis/featuressequence/saveto/
---
## SaveTo(string, FileDriver) {#saveto_2}

सुविधाओं के अनुक्रम को परत दर परत सहेजता है।

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| destinationPath | String | आउटपुट लेयर का पथ। |
| destinationDriver | FileDriver | आउटपुट लेयर के लिए फॉर्मेट ड्राइवर। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | कोई तर्क है`null`. |
| [GisException](../../gisexception/) | फ़ाइल में/से सुविधा को पढ़ने या लिखने में त्रुटि। |
| IOException | एक I/O त्रुटि हुई। |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | स्थानिक संदर्भ प्रणाली को लक्षित करने के लिए स्रोत स्थानिक संदर्भ प्रणाली से सुविधाओं ज्यामिति का रूपांतरण विफल रहा। |

### यह सभी देखें

* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* नाम स्थान [Aspose.Gis](../../featuressequence/)
* सभा [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver) {#saveto}

सुविधाओं के अनुक्रम को परत दर परत सहेजता है।

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| destinationPath | AbstractPath | आउटपुट लेयर का पथ। |
| destinationDriver | FileDriver | आउटपुट लेयर के लिए फॉर्मेट ड्राइवर। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| [GisException](../../gisexception/) | फ़ाइल में/से सुविधा को पढ़ने या लिखने में त्रुटि। |
| IOException | एक I/O त्रुटि हुई। |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | स्थानिक संदर्भ प्रणाली को लक्षित करने के लिए स्रोत स्थानिक संदर्भ प्रणाली से सुविधाओं ज्यामिति का रूपांतरण विफल रहा। |

### यह सभी देखें

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* नाम स्थान [Aspose.Gis](../../featuressequence/)
* सभा [Aspose.GIS](../../../)

---

## SaveTo(string, FileDriver, SavingOptions) {#saveto_3}

सुविधाओं के अनुक्रम को परत दर परत सहेजता है।

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver, SavingOptions options)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| destinationPath | String | आउटपुट लेयर का पथ। |
| destinationDriver | FileDriver | आउटपुट लेयर के लिए फॉर्मेट ड्राइवर। |
| options | SavingOptions | बचत प्रक्रिया के लिए विकल्प। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| [GisException](../../gisexception/) | फ़ाइल में/से सुविधा को पढ़ने या लिखने में त्रुटि। |
| IOException | एक I/O त्रुटि हुई। |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | स्थानिक संदर्भ प्रणाली को लक्षित करने के लिए स्रोत स्थानिक संदर्भ प्रणाली से सुविधाओं ज्यामिति का रूपांतरण विफल रहा। |
| NotSupportedException | में निर्दिष्ट स्थानिक संदर्भ प्रणाली*options* द्वारा समर्थित नहीं है*destinationDriver* . |

### यह सभी देखें

* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* नाम स्थान [Aspose.Gis](../../featuressequence/)
* सभा [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver, SavingOptions) {#saveto_1}

सुविधाओं के अनुक्रम को परत दर परत सहेजता है।

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver, 
    SavingOptions options)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| destinationPath | AbstractPath | आउटपुट लेयर का पथ। |
| destinationDriver | FileDriver | आउटपुट लेयर के लिए फॉर्मेट ड्राइवर। |
| options | SavingOptions | बचत प्रक्रिया के लिए विकल्प। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| [GisException](../../gisexception/) | फ़ाइल में/से सुविधा को पढ़ने या लिखने में त्रुटि। |
| IOException | एक I/O त्रुटि हुई। |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | स्थानिक संदर्भ प्रणाली को लक्षित करने के लिए स्रोत स्थानिक संदर्भ प्रणाली से सुविधाओं ज्यामिति का रूपांतरण विफल रहा। |
| NotSupportedException | में निर्दिष्ट स्थानिक संदर्भ प्रणाली*options* द्वारा समर्थित नहीं है*destinationDriver* . |

### यह सभी देखें

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* नाम स्थान [Aspose.Gis](../../featuressequence/)
* सभा [Aspose.GIS](../../../)


