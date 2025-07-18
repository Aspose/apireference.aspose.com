---
title: Aspose::Words::Fonts::PhysicalFontInfo class
linktitle: PhysicalFontInfo
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Fonts::PhysicalFontInfo class. Specifies information about physical font available to Aspose.Words font engine. To learn more, visit the  documentation article in C++.'
type: docs
weight: 15000
url: /cpp/aspose.words.fonts/physicalfontinfo/
---
## PhysicalFontInfo class


Specifies information about physical font available to Aspose.Words font engine. To learn more, visit the [Working with Fonts](https://docs.aspose.com/words/cpp/working-with-fonts/) documentation article.

```cpp
class PhysicalFontInfo : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [get_EmbeddingLicensingRights](./get_embeddinglicensingrights/)() const | Embedding licensing rights for the font. |
| [get_FilePath](./get_filepath/)() const | Path to the font file if any. |
| [get_FontFamilyName](./get_fontfamilyname/)() const | Family name of the font. |
| [get_FullFontName](./get_fullfontname/)() const | Full name of the font. |
| [get_Version](./get_version/)() const | Version string of the font. |
| [GetType](./gettype/)() const override |  |
| [Is](./is/)(const System::TypeInfo\&) const override |  |
| static [Type](./type/)() |  |

## Examples



Shows how to list available fonts. 
```cpp
// Configure Aspose.Words to source fonts from a custom folder, and then print every available font.
System::ArrayPtr<System::SharedPtr<Aspose::Words::Fonts::FontSourceBase>> folderFontSource = System::MakeArray<System::SharedPtr<Aspose::Words::Fonts::FontSourceBase>>({System::MakeObject<Aspose::Words::Fonts::FolderFontSource>(get_FontsDir(), true)});

for (auto&& fontInfo : System::IterateOver(folderFontSource[0]->GetAvailableFonts()))
{
    std::cout << "FontFamilyName : " << fontInfo->get_FontFamilyName() << std::endl;
    std::cout << "FullFontName  : " << fontInfo->get_FullFontName() << std::endl;
    std::cout << "Version  : " << fontInfo->get_Version() << std::endl;
    std::cout << "FilePath : " << fontInfo->get_FilePath() << "\n" << std::endl;
}
```

## See Also

* Namespace [Aspose::Words::Fonts](../)
* Library [Aspose.Words for C++](../../)
