---
title: Aspose::Words::Fonts::FontFallbackSettings::Load method
linktitle: Load
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Fonts::FontFallbackSettings::Load method. Loads fallback settings from XML stream in C++.'
type: docs
weight: 5000
url: /cpp/aspose.words.fonts/fontfallbacksettings/load/
---
## FontFallbackSettings::Load(const System::SharedPtr\<System::IO::Stream\>\&) method


Loads fallback settings from XML stream.

```cpp
void Aspose::Words::Fonts::FontFallbackSettings::Load(const System::SharedPtr<System::IO::Stream> &stream)
```


| Parameter | Type | Description |
| --- | --- | --- |
| stream | const System::SharedPtr\<System::IO::Stream\>\& | Input stream. |

## Examples



Shows how to load and save font fallback settings to/from a stream. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"Rendering.docx");

// Load an XML document that defines a set of font fallback settings.
{
    auto fontFallbackStream = System::MakeObject<System::IO::FileStream>(get_MyDir() + u"Font fallback rules.xml", System::IO::FileMode::Open);
    auto fontSettings = System::MakeObject<Aspose::Words::Fonts::FontSettings>();
    fontSettings->get_FallbackSettings()->Load(fontFallbackStream);

    doc->set_FontSettings(fontSettings);
}

doc->Save(get_ArtifactsDir() + u"FontSettings.LoadFontFallbackSettingsFromStream.pdf");

// Use a stream to save our document's current font fallback settings as an XML document.
{
    auto fontFallbackStream = System::MakeObject<System::IO::FileStream>(get_ArtifactsDir() + u"FallbackSettings.xml", System::IO::FileMode::Create);
    doc->get_FontSettings()->get_FallbackSettings()->Save(fontFallbackStream);
}
```

## See Also

* Class [FontFallbackSettings](../)
* Namespace [Aspose::Words::Fonts](../../)
* Library [Aspose.Words for C++](../../../)
## FontFallbackSettings::Load(const System::String\&) method


Loads font fallback settings from XML file.

```cpp
void Aspose::Words::Fonts::FontFallbackSettings::Load(const System::String &fileName)
```


| Parameter | Type | Description |
| --- | --- | --- |
| fileName | const System::String\& | Input file name. |

## Examples



Shows how to load and save font fallback settings to/from an XML document in the local file system. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"Rendering.docx");

// Load an XML document that defines a set of font fallback settings.
auto fontSettings = System::MakeObject<Aspose::Words::Fonts::FontSettings>();
fontSettings->get_FallbackSettings()->Load(get_MyDir() + u"Font fallback rules.xml");

doc->set_FontSettings(fontSettings);
doc->Save(get_ArtifactsDir() + u"FontSettings.LoadFontFallbackSettingsFromFile.pdf");

// Save our document's current font fallback settings as an XML document.
doc->get_FontSettings()->get_FallbackSettings()->Save(get_ArtifactsDir() + u"FallbackSettings.xml");
```

## See Also

* Class [FontFallbackSettings](../)
* Namespace [Aspose::Words::Fonts](../../)
* Library [Aspose.Words for C++](../../../)
## FontFallbackSettings::Load(std::basic_istream\<CharType, Traits\>\&) method




```cpp
template<typename CharType,typename Traits> void Aspose::Words::Fonts::FontFallbackSettings::Load(std::basic_istream<CharType, Traits> &stream)
```

## See Also

* Class [FontFallbackSettings](../)
* Namespace [Aspose::Words::Fonts](../../)
* Library [Aspose.Words for C++](../../../)
