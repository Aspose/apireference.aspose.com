---
title: AsposeOcr.CorrectSpelling
second_title: Aspose.OCR .NET API संदर्भ के लिए
description: AsposeOcr तरक. पठ क ठक करत है गलत वर्तन वले शब्दं क बदलत है
type: docs
weight: 60
url: /hi/net/aspose.ocr/asposeocr/correctspelling/
---
## AsposeOcr.CorrectSpelling method

पाठ को ठीक करता है (गलत वर्तनी वाले शब्दों को बदलता है)।

```csharp
public string CorrectSpelling(string text, SpellCheckLanguage language = SpellCheckLanguage.Eng, 
    string dictionaryPath = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | String | सुधार के लिए पाठ। |
| language | SpellCheckLanguage | उपयोग करने के लिए शब्दकोश। |
| dictionaryPath | String | वैकल्पिक रूप से। उपयोगकर्ता शब्दकोश का पूर्ण पथ (आवृत्ति शब्दकोश)। शब्दकोश फ़ाइल प्रारूप: UTF-8 एन्कोडिंग में सादा पाठ फ़ाइल। शब्द और शब्द आवृत्ति को स्थान या टैब द्वारा अलग किया जाता है। डिफ़ॉल्ट रूप से, पहले कॉलम में शब्द और दूसरे कॉलम में आवृत्ति की अपेक्षा की जाती है। प्रत्येक शब्द- फ़्रीक्वेंसी-पेयर एक अलग लाइन में। एक लाइन को एक लाइन फीड ("\n"), एक कैरिज रिटर्न ("\r"), या कैरिज रिटर्न के तुरंत बाद एक लाइन फीड के बाद वर्णों के अनुक्रम के रूप में परिभाषित किया गया है। ("\r\n"). प्रत्येक शब्द छोटे अक्षरों में होने की उम्मीद है. |

### प्रतिलाभ की मात्रा

बदले हुए शब्दों के साथ पाठ।

### यह सभी देखें

* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [AsposeOcr](../)
* नाम स्थान [Aspose.OCR](../../asposeocr/)
* सभा [Aspose.OCR](../../../)


