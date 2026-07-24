---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression enum"
linktitle: "PdfImageCompression"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression enum. C++ में PDF फ़ाइल में छवियों पर लागू संपीड़न प्रकार को निर्दिष्ट करता है।"
type: docs
weight: 700
url: /hi/cpp/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enum


PDF फ़ाइल में छवियों पर लागू संपीड़न प्रकार को निर्दिष्ट करता है।

```cpp
enum class PdfImageCompression
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| ऑटो | 0 | प्रत्येक छवि के लिए सबसे उपयुक्त संपीड़न को स्वचालित रूप से चुनता है। |
| None | 1 | कच्चे छवि बाइट्स को सहेजता है जिससे PDF फ़ाइल का आकार बड़ा हो जाता है। |
| Rle | 2 | रन लेन्थ संपीड़न। |
| Flate | 3 | फ़्लेट संपीड़न। |
| LzwBaselinePredictor | 4 | प्रेडिक्टर चयन को प्रक्रिया को तेज़ करने के लिए PNG Paeth प्रेडिक्टर तक सीमित किया गया है। व्यावहारिक रूप से यह आश्चर्यजनक रूप से अच्छा प्रदर्शन करता है। यह [LzwOptimizedPredictor](./) से बेहतर है। |
| LzwOptimizedPredictor | 5 | प्रेडिक्टर चयन अधिक जटिल है और इससे छोटी छवि आकार प्राप्त होना चाहिए, लेकिन अधिक समय लेगा। |
| Jpeg | 6 | JPEG संपीड़न। पारदर्शिता का समर्थन नहीं करता। |

## संबंधित देखें

* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
