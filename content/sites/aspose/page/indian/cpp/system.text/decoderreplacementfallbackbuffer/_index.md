---
title: "System::Text::DecoderReplacementFallbackBuffer क्लास"
linktitle: "DecoderReplacementFallbackBuffer"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::DecoderReplacementFallbackBuffer क्लास। C++ में डिकोडिंग फॉलबैक रणनीति को बदलने के लिए बफ़र।"
type: docs
weight: 800
url: /hi/cpp/system.text/decoderreplacementfallbackbuffer/
---
## DecoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing decoding fallback strategy.

```cpp
class DecoderReplacementFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [DecoderReplacementFallbackBuffer](./decoderreplacementfallbackbuffer/)(const DecoderReplacementFallbackPtr\&) | निर्माता। |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | डिकोडिंग विफलता को संभालता है। |
| [get_Remaining](./get_remaining/)() const override | बफ़र में शेष अक्षरों की संख्या प्राप्त करता है। |
| [GetNextChar](./getnextchar/)() override | अगला उपलब्ध अक्षर प्राप्त करता है। |
| [MovePrevious](./moveprevious/)() override | पिछले अक्षर पर जाता है। |
| [Reset](./reset/)() override | बफ़र को प्रारंभिक स्थिति में रीसेट करता है ( [Fallback()](./fallback/) कॉल से पहले)। |
## संबंधित देखें

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
