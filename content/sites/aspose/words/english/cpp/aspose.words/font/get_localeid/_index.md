---
title: Aspose::Words::Font::get_LocaleId method
linktitle: get_LocaleId
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Font::get_LocaleId method. Gets or sets the locale identifier (language) of the formatted characters in C++.'
type: docs
weight: 22000
url: /cpp/aspose.words/font/get_localeid/
---
## Font::get_LocaleId method


Gets or sets the locale identifier (language) of the formatted characters.

```cpp
int32_t Aspose::Words::Font::get_LocaleId()
```


## Examples



Shows how to set the locale of the text that we are adding with a document builder. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

// If we set the font's locale to English and insert some Russian text,
// the English locale spell checker will not recognize the text and detect it as a spelling error.
builder->get_Font()->set_LocaleId(System::MakeObject<System::Globalization::CultureInfo>(u"en-US", false)->get_LCID());
builder->Writeln(u"Привет!");

// Set a matching locale for the text that we are about to add to apply the appropriate spell checker.
builder->get_Font()->set_LocaleId(System::MakeObject<System::Globalization::CultureInfo>(u"ru-RU", false)->get_LCID());
builder->Writeln(u"Привет!");

doc->Save(get_ArtifactsDir() + u"Font.LocaleId.docx");
```

## See Also

* Class [Font](../)
* Namespace [Aspose::Words](../../)
* Library [Aspose.Words for C++](../../../)
