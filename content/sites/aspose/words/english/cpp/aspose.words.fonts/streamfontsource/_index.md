---
title: Aspose::Words::Fonts::StreamFontSource class
linktitle: StreamFontSource
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Fonts::StreamFontSource class. Base class for user-defined stream font source. To learn more, visit the  documentation article in C++.'
type: docs
weight: 16000
url: /cpp/aspose.words.fonts/streamfontsource/
---
## StreamFontSource class


Base class for user-defined stream font source. To learn more, visit the [Working with Fonts](https://docs.aspose.com/words/cpp/working-with-fonts/) documentation article.

```cpp
class StreamFontSource : public Aspose::Words::Fonts::FontSourceBase,
                         public Aspose::Fonts::IFontData
```

## Methods

| Method | Description |
| --- | --- |
| [get_CacheKey](./get_cachekey/)() const | The key of this source in the cache. |
| [get_Priority](../fontsourcebase/get_priority/)() const | Returns the font source priority. |
| [get_Type](./get_type/)() override | Returns the type of the font source. |
| [get_WarningCallback](../fontsourcebase/get_warningcallback/)() const | Called during processing of font source when an issue is detected that might result in formatting fidelity loss. |
| [GetAvailableFonts](../fontsourcebase/getavailablefonts/)() | Returns list of fonts available via this source. |
| [GetType](./gettype/)() const override |  |
| [Is](./is/)(const System::TypeInfo\&) const override |  |
| virtual [OpenFontDataStream](./openfontdatastream/)() | This method should open the stream with font data on demand. |
| [set_WarningCallback](../fontsourcebase/set_warningcallback/)(const System::SharedPtr\<Aspose::Words::IWarningCallback\>\&) | Called during processing of font source when an issue is detected that might result in formatting fidelity loss. |
| static [Type](./type/)() |  |
## Remarks


In order to use the stream font source you should create a derived class from the [StreamFontSource](./) and provide implementation of the [OpenFontDataStream](./openfontdatastream/) method.

[OpenFontDataStream](./openfontdatastream/) method could be called several times. For the first time it will be called when Aspose.Words scans the provided font sources to get the list of available fonts. Later it may be called if the font is used in the document to parse the font data and to embed the font data to some output formats.

[StreamFontSource](./) may be useful because it allows to load the font data only when it is required and not to store it in the memory for the [FontSettings](../fontsettings/) lifetime. 
## See Also

* Class [FontSourceBase](../fontsourcebase/)
* Namespace [Aspose::Words::Fonts](../)
* Library [Aspose.Words for C++](../../)
