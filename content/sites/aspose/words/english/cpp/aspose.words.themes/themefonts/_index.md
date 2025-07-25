---
title: Aspose::Words::Themes::ThemeFonts class
linktitle: ThemeFonts
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Themes::ThemeFonts class. Represents a collection of fonts in the font scheme, allowing to specify different fonts for different languages Latin, EastAsian and ComplexScript. To learn more, visit the  documentation article in C++.'
type: docs
weight: 3000
url: /cpp/aspose.words.themes/themefonts/
---
## ThemeFonts class


Represents a collection of fonts in the font scheme, allowing to specify different fonts for different languages [Latin](./get_latin/), [EastAsian](./get_eastasian/) and [ComplexScript](./get_complexscript/). To learn more, visit the [Working with Styles and Themes](https://docs.aspose.com/words/cpp/working-with-styles-and-themes/) documentation article.

```cpp
class ThemeFonts : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [get_ComplexScript](./get_complexscript/)() | Specifies font name for ComplexScript characters. |
| [get_EastAsian](./get_eastasian/)() | Specifies font name for EastAsian characters. |
| [get_Latin](./get_latin/)() | Specifies font name for Latin characters. |
| [GetType](./gettype/)() const override |  |
| [Is](./is/)(const System::TypeInfo\&) const override |  |
| [set_ComplexScript](./set_complexscript/)(const System::String\&) | Setter for [Aspose::Words::Themes::ThemeFonts::get_ComplexScript](./get_complexscript/). |
| [set_EastAsian](./set_eastasian/)(const System::String\&) | Setter for [Aspose::Words::Themes::ThemeFonts::get_EastAsian](./get_eastasian/). |
| [set_Latin](./set_latin/)(const System::String\&) | Setter for [Aspose::Words::Themes::ThemeFonts::get_Latin](./get_latin/). |
| static [Type](./type/)() |  |

## Examples



Shows how to set custom colors and fonts for themes. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"Theme colors.docx");

// The "Theme" object gives us access to the document theme, a source of default fonts and colors.
System::SharedPtr<Aspose::Words::Themes::Theme> theme = doc->get_Theme();

// Some styles, such as "Heading 1" and "Subtitle", will inherit these fonts.
theme->get_MajorFonts()->set_Latin(u"Courier New");
theme->get_MinorFonts()->set_Latin(u"Agency FB");

// Other languages may also have their custom fonts in this theme.
ASSERT_EQ(System::String::Empty, theme->get_MajorFonts()->get_ComplexScript());
ASSERT_EQ(System::String::Empty, theme->get_MajorFonts()->get_EastAsian());
ASSERT_EQ(System::String::Empty, theme->get_MinorFonts()->get_ComplexScript());
ASSERT_EQ(System::String::Empty, theme->get_MinorFonts()->get_EastAsian());

// The "Colors" property contains the color palette from Microsoft Word,
// which appears when changing shading or font color.
// Apply custom colors to the color palette so we have easy access to them in Microsoft Word
// when we, for example, change the font color via "Home" -> "Font" -> "Font Color",
// or insert a shape, and then set a color for it via "Shape Format" -> "Shape Styles".
System::SharedPtr<Aspose::Words::Themes::ThemeColors> colors = theme->get_Colors();
colors->set_Dark1(System::Drawing::Color::get_MidnightBlue());
colors->set_Light1(System::Drawing::Color::get_PaleGreen());
colors->set_Dark2(System::Drawing::Color::get_Indigo());
colors->set_Light2(System::Drawing::Color::get_Khaki());

colors->set_Accent1(System::Drawing::Color::get_OrangeRed());
colors->set_Accent2(System::Drawing::Color::get_LightSalmon());
colors->set_Accent3(System::Drawing::Color::get_Yellow());
colors->set_Accent4(System::Drawing::Color::get_Gold());
colors->set_Accent5(System::Drawing::Color::get_BlueViolet());
colors->set_Accent6(System::Drawing::Color::get_DarkViolet());

// Apply custom colors to hyperlinks in their clicked and un-clicked states.
colors->set_Hyperlink(System::Drawing::Color::get_Black());
colors->set_FollowedHyperlink(System::Drawing::Color::get_Gray());

doc->Save(get_ArtifactsDir() + u"Themes.CustomColorsAndFonts.docx");
```

## See Also

* Namespace [Aspose::Words::Themes](../)
* Library [Aspose.Words for C++](../../)
