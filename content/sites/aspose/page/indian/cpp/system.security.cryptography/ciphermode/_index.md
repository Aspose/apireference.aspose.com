---
title: "System::Security::Cryptography::CipherMode enum"
linktitle: "CipherMode"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::CipherMode enum. C++ में ब्लॉक सिफर मोड।"
type: docs
weight: 5300
url: /hi/cpp/system.security.cryptography/ciphermode/
---
## CipherMode enum


ब्लॉक सिफर मोड।

```cpp
enum class CipherMode
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| CBC | 1 | साइफ़र ब्लॉक चेनिंग जो वर्तमान ब्लॉक को पिछले ब्लॉक के साथ मिलाकर एन्क्रिप्शन को बेहतर बनाती है। |
| ECB | 2 | इलेक्ट्रॉनिक कोडबुक मोड जिसमें ब्लॉकों के बीच कोई प्रभाव नहीं होता; इससे एन्क्रिप्शन कमजोर हो जाता है। |
| OFB | 3 | आउटपुट फ़ीडबैक मोड जो बड़े इनपुट ब्लॉकों को छोटे हिस्सों में संभालता है। |
| CFB | 4 | साइफ़र फ़ीडबैक मोड जो बड़े इनपुट ब्लॉकों को छोटे हिस्सों में संभालता है। मंग्लिंग नियम OFB के नियमों से अलग होते हैं। |
| CTS | 5 | साइफ़र टेक्स्ट स्टीलिंग मोड, जो सभी लेकिन अंतिम दो ब्लॉकों को छोड़कर CBC जैसा व्यवहार करता है। |

## संबंधित देखें

* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
