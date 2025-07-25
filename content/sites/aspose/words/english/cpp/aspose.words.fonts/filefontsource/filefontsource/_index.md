---
title: Aspose::Words::Fonts::FileFontSource::FileFontSource constructor
linktitle: FileFontSource
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Fonts::FileFontSource::FileFontSource constructor. Ctor in C++.'
type: docs
weight: 2000
url: /cpp/aspose.words.fonts/filefontsource/filefontsource/
---
## FileFontSource::FileFontSource(const System::String\&) constructor


Ctor.

```cpp
Aspose::Words::Fonts::FileFontSource::FileFontSource(const System::String &filePath)
```


| Parameter | Type | Description |
| --- | --- | --- |
| filePath | const System::String\& | Path to font file. |

## Examples



Shows how to use a font file in the local file system as a font source. 
```cpp
auto fileFontSource = System::MakeObject<Aspose::Words::Fonts::FileFontSource>(get_MyDir() + u"Alte DIN 1451 Mittelschrift.ttf", 0);

auto doc = System::MakeObject<Aspose::Words::Document>();
doc->set_FontSettings(System::MakeObject<Aspose::Words::Fonts::FontSettings>());
doc->get_FontSettings()->SetFontsSources(System::MakeArray<System::SharedPtr<Aspose::Words::Fonts::FontSourceBase>>({fileFontSource}));

ASSERT_EQ(get_MyDir() + u"Alte DIN 1451 Mittelschrift.ttf", fileFontSource->get_FilePath());
ASSERT_EQ(Aspose::Words::Fonts::FontSourceType::FontFile, fileFontSource->get_Type());
ASSERT_EQ(0, fileFontSource->get_Priority());
```

## See Also

* Class [FileFontSource](../)
* Namespace [Aspose::Words::Fonts](../../)
* Library [Aspose.Words for C++](../../../)
## FileFontSource::FileFontSource(const System::String\&, int32_t) constructor


Ctor.

```cpp
Aspose::Words::Fonts::FileFontSource::FileFontSource(const System::String &filePath, int32_t priority)
```


| Parameter | Type | Description |
| --- | --- | --- |
| filePath | const System::String\& | Path to font file. |
| priority | int32_t | [Font](../../../aspose.words/font/) source priority. See the [Priority](../../fontsourcebase/get_priority/) property description for more information. |

## Examples



Shows how to use a font file in the local file system as a font source. 
```cpp
auto fileFontSource = System::MakeObject<Aspose::Words::Fonts::FileFontSource>(get_MyDir() + u"Alte DIN 1451 Mittelschrift.ttf", 0);

auto doc = System::MakeObject<Aspose::Words::Document>();
doc->set_FontSettings(System::MakeObject<Aspose::Words::Fonts::FontSettings>());
doc->get_FontSettings()->SetFontsSources(System::MakeArray<System::SharedPtr<Aspose::Words::Fonts::FontSourceBase>>({fileFontSource}));

ASSERT_EQ(get_MyDir() + u"Alte DIN 1451 Mittelschrift.ttf", fileFontSource->get_FilePath());
ASSERT_EQ(Aspose::Words::Fonts::FontSourceType::FontFile, fileFontSource->get_Type());
ASSERT_EQ(0, fileFontSource->get_Priority());
```

## See Also

* Class [FileFontSource](../)
* Namespace [Aspose::Words::Fonts](../../)
* Library [Aspose.Words for C++](../../../)
## FileFontSource::FileFontSource(const System::String\&, int32_t, const System::String\&) constructor


Ctor.

```cpp
Aspose::Words::Fonts::FileFontSource::FileFontSource(const System::String &filePath, int32_t priority, const System::String &cacheKey)
```


| Parameter | Type | Description |
| --- | --- | --- |
| filePath | const System::String\& | Path to font file. |
| priority | int32_t | [Font](../../../aspose.words/font/) source priority. See the [Priority](../../fontsourcebase/get_priority/) property description for more information. |
| cacheKey | const System::String\& | The key of this source in the cache. See [CacheKey](../get_cachekey/) property description for more information. |

## See Also

* Class [FileFontSource](../)
* Namespace [Aspose::Words::Fonts](../../)
* Library [Aspose.Words for C++](../../../)
