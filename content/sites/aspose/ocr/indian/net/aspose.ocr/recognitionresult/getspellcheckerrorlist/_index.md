---
title: RecognitionResult.GetSpellCheckErrorList
second_title: Aspose.OCR .NET API संदर्भ के लिए
description: RecognitionResult तरक. दए गए इनपुट टेक्स्ट के लए गलत वर्तन वले शब्दं क सुझई गई वर्तन के सथ खजें
type: docs
weight: 110
url: /hi/net/aspose.ocr/recognitionresult/getspellcheckerrorlist/
---
## RecognitionResult.GetSpellCheckErrorList method

दिए गए इनपुट टेक्स्ट के लिए गलत वर्तनी वाले शब्दों को सुझाई गई वर्तनी के साथ खोजें।

```csharp
public List<SpellCheckError> GetSpellCheckErrorList(
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| language | SpellCheckLanguage | उपयोग करने के लिए शब्दकोश। |
| dictionaryPath | String | वैकल्पिक रूप से। उपयोगकर्ता शब्दकोश का पूर्ण पथ (आवृत्ति शब्दकोश)। शब्दकोश फ़ाइल प्रारूप: UTF-8 एन्कोडिंग में सादा पाठ फ़ाइल। शब्द और शब्द आवृत्ति को स्थान या टैब द्वारा अलग किया जाता है। डिफ़ॉल्ट रूप से, पहले कॉलम में शब्द और दूसरे कॉलम में आवृत्ति की अपेक्षा की जाती है। प्रत्येक शब्द- फ़्रीक्वेंसी-पेयर एक अलग लाइन में। एक लाइन को एक लाइन फीड ("\n"), एक कैरिज रिटर्न ("\r"), या कैरिज रिटर्न के तुरंत बाद एक लाइन फीड के बाद वर्णों के अनुक्रम के रूप में परिभाषित किया गया है। ("\r\n"). प्रत्येक शब्द छोटे अक्षरों में होने की उम्मीद है. |

### प्रतिलाभ की मात्रा

SpellCheckError ऑब्जेक्ट की एक सूची गलत वर्तनी वाले शब्दों का प्रतिनिधित्व करती है, सूचियों के साथ प्रत्येक गलत वर्तनी वाले शब्द के लिए सही वर्तनी का सुझाव देती है, और संपादन दूरी के साथ।

### यह सभी देखें

* struct [SpellCheckError](../../../aspose.ocr.spellchecker/spellcheckerror/)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [RecognitionResult](../)
* नाम स्थान [Aspose.OCR](../../recognitionresult/)
* सभा [Aspose.OCR](../../../)


