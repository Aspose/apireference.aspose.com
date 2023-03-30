---
title: OmrEngine.GenerateTemplate
second_title: .NET API संदर्भ के लिए Aspose.OMR
description: OmrEngine तरक. मेमरस्ट्रम के आधर पर एक टेम्पलेट .omr और टेम्पलेट छव बनत है
type: docs
weight: 40
url: /hi/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) {#generatetemplate_2}

मेमोरीस्ट्रीम के आधार पर एक टेम्पलेट (.omr) और टेम्पलेट छवि बनाता है

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null, Encoding encoding = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stream | MemoryStream | वह धारा जिसमें मार्कअप पंक्तियाँ हैं |
| settings | GlobalPageSettings | वैश्विक सेटिंग्स सभी पृष्ठ तत्वों पर लागू होती हैं |
| userImages | ImageCollection | छवियों का संग्रह जिनका उपयोग टेम्पलेट बनाने के लिए किया जा सकता है। फाइल सिस्टम के बजाय मेमोरीस्ट्रीम से छवियों का उपयोग करने की अनुमति दें |
| encoding | Encoding | मार्कअप लाइन एन्कोडिंग, डिफ़ॉल्ट रूप से UTF-8 का उपयोग किया जाता है |

### प्रतिलाभ की मात्रा

पीढ़ी का परिणाम

### यह सभी देखें

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* नाम स्थान [Aspose.OMR.Api](../../omrengine/)
* सभा [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection, Encoding) {#generatetemplate_1}

मेमोरीस्ट्रीम के आधार पर एक टेम्पलेट (.omr) और टेम्पलेट छवि बनाता है

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null, 
    Encoding encoding = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stream | MemoryStream | वह धारा जिसमें मार्कअप पंक्तियाँ हैं |
| userImages | ImageCollection | छवियों का संग्रह जिनका उपयोग टेम्पलेट बनाने के लिए किया जा सकता है। फाइल सिस्टम के बजाय मेमोरीस्ट्रीम से छवियों का उपयोग करने की अनुमति दें |
| encoding | Encoding | मार्कअप लाइन एन्कोडिंग, डिफ़ॉल्ट रूप से UTF-8 का उपयोग किया जाता है |

### प्रतिलाभ की मात्रा

पीढ़ी का परिणाम

### यह सभी देखें

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* नाम स्थान [Aspose.OMR.Api](../../omrengine/)
* सभा [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], GlobalPageSettings, ImageCollection) {#generatetemplate_7}

मार्कअप लाइन की एक सरणी के आधार पर एक टेम्पलेट (.omr) और टेम्पलेट छवि बनाता है

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| markupLines | String[] | मार्कअप लाइनों की सरणी |
| settings | GlobalPageSettings | वैश्विक सेटिंग्स सभी पृष्ठ तत्वों पर लागू होती हैं |
| userImages | ImageCollection | छवियों का संग्रह जिनका उपयोग टेम्पलेट बनाने के लिए किया जा सकता है। फाइल सिस्टम के बजाय मेमोरीस्ट्रीम से छवियों का उपयोग करने की अनुमति दें |

### प्रतिलाभ की मात्रा

पीढ़ी का परिणाम

### यह सभी देखें

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* नाम स्थान [Aspose.OMR.Api](../../omrengine/)
* सभा [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], ImageCollection) {#generatetemplate_6}

मार्कअप लाइन की एक सरणी के आधार पर एक टेम्पलेट (.omr) और टेम्पलेट छवि बनाता है

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, ImageCollection userImages = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| markupLines | String[] | मार्कअप लाइनों की सरणी |
| userImages | ImageCollection | छवियों का संग्रह जिनका उपयोग टेम्पलेट बनाने के लिए किया जा सकता है। फाइल सिस्टम के बजाय मेमोरीस्ट्रीम से छवियों का उपयोग करने की अनुमति दें |

### प्रतिलाभ की मात्रा

पीढ़ी का परिणाम

### यह सभी देखें

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* नाम स्थान [Aspose.OMR.Api](../../omrengine/)
* सभा [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings, Encoding) {#generatetemplate_3}

टेक्स्ट मार्कअप के आधार पर एक टेम्प्लेट (.omr) और टेम्प्लेट इमेज बनाता है

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings, 
    Encoding encoding = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| markupPath | String | पाठ मार्कअप फ़ाइल का पथ |
| settings | GlobalPageSettings | वैश्विक सेटिंग्स सभी पृष्ठ तत्वों पर लागू होती हैं |
| encoding | Encoding | मार्कअप फ़ाइल एन्कोडिंग, डिफ़ॉल्ट रूप से UTF-8 का उपयोग किया जाता है |

### प्रतिलाभ की मात्रा

पीढ़ी का परिणाम

### यह सभी देखें

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [OmrEngine](../)
* नाम स्थान [Aspose.OMR.Api](../../omrengine/)
* सभा [Aspose.OMR](../../../)

---

## GenerateTemplate(string, Encoding) {#generatetemplate_5}

टेक्स्ट मार्कअप के आधार पर एक टेम्प्लेट (.omr) और टेम्प्लेट इमेज बनाता है

```csharp
public GenerationResult GenerateTemplate(string markupPath, Encoding encoding = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| markupPath | String | पाठ मार्कअप फ़ाइल का पथ |
| encoding | Encoding | मार्कअप फ़ाइल एन्कोडिंग, डिफ़ॉल्ट रूप से UTF-8 का उपयोग किया जाता है |

### प्रतिलाभ की मात्रा

पीढ़ी का परिणाम

### यह सभी देखें

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* नाम स्थान [Aspose.OMR.Api](../../omrengine/)
* सभा [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[], Encoding) {#generatetemplate_4}

टेक्स्ट मार्कअप के आधार पर एक टेम्प्लेट (.omr) और टेम्प्लेट इमेज बनाता है

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths, 
    Encoding encoding = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| markupPath | String | पाठ मार्कअप फ़ाइल का पथ |
| imagesPaths | String[] | जनरेशन में उपयोग की गई छवियों के पूर्ण पथ |
| encoding | Encoding | मार्कअप फ़ाइल एन्कोडिंग, डिफ़ॉल्ट रूप से UTF-8 का उपयोग किया जाता है |

### प्रतिलाभ की मात्रा

पीढ़ी का परिणाम

### यह सभी देखें

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* नाम स्थान [Aspose.OMR.Api](../../omrengine/)
* सभा [Aspose.OMR](../../../)

---

## GenerateTemplate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generatetemplate}

टेम्पलेट ऑब्जेक्ट के आधार पर एक टेम्पलेट (.omr) और टेम्पलेट छवि बनाता है

```csharp
public GenerationResult GenerateTemplate(TemplateConfig config, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| config | TemplateConfig | टेम्पलेट ऑब्जेक्ट जो सभी तत्वों का प्रतिनिधित्व करता है |
| settings | GlobalPageSettings | वैश्विक सेटिंग्स सभी टेम्पलेट पीढ़ी में उपयोग की जाती हैं |
| userImages | ImageCollection | छवियों का संग्रह जिनका उपयोग टेम्पलेट बनाने के लिए किया जा सकता है। फाइल सिस्टम के बजाय मेमोरीस्ट्रीम से छवियों का उपयोग करने की अनुमति दें |

### प्रतिलाभ की मात्रा

पीढ़ी का परिणाम

### यह सभी देखें

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* नाम स्थान [Aspose.OMR.Api](../../omrengine/)
* सभा [Aspose.OMR](../../../)


