---
title: Aspose::Words::Saving::HtmlMetafileFormat enum
linktitle: HtmlMetafileFormat
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Saving::HtmlMetafileFormat enum. Indicates the format in which metafiles are saved to HTML documents in C++.'
type: docs
weight: 60000
url: /cpp/aspose.words.saving/htmlmetafileformat/
---
## HtmlMetafileFormat enum


Indicates the format in which metafiles are saved to HTML documents.

```cpp
enum class HtmlMetafileFormat
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Png | 0 | Metafiles are rendered to raster PNG images. |
| Svg | 1 | Metafiles are converted to vector SVG images. |
| EmfOrWmf | 2 | Metafiles are saved as is, without conversion. |


## Examples



Shows how to convert SVG objects to a different format when saving HTML documents. 
```cpp
System::String html = u"<html>\r\n                    <svg xmlns='http://www.w3.org/2000/svg' width='500' height='40' viewBox='0 0 500 40'>\r\n                        <text x='0' y='35' font-family='Verdana' font-size='35'>Hello world!</text>\r\n                    </svg>\r\n                </html>";

// Use 'ConvertSvgToEmf' to turn back the legacy behavior
// where all SVG images loaded from an HTML document were converted to EMF.
// Now SVG images are loaded without conversion
// if the MS Word version specified in load options supports SVG images natively.
auto loadOptions = System::MakeObject<Aspose::Words::Loading::HtmlLoadOptions>();
loadOptions->set_ConvertSvgToEmf(true);

auto doc = System::MakeObject<Aspose::Words::Document>(System::MakeObject<System::IO::MemoryStream>(System::Text::Encoding::get_UTF8()->GetBytes(html)), loadOptions);

// This document contains a <svg> element in the form of text.
// When we save the document to HTML, we can pass a SaveOptions object
// to determine how the saving operation handles this object.
// Setting the "MetafileFormat" property to "HtmlMetafileFormat.Png" to convert it to a PNG image.
// Setting the "MetafileFormat" property to "HtmlMetafileFormat.Svg" preserve it as a SVG object.
// Setting the "MetafileFormat" property to "HtmlMetafileFormat.EmfOrWmf" to convert it to a metafile.
auto options = System::MakeObject<Aspose::Words::Saving::HtmlSaveOptions>();
options->set_MetafileFormat(htmlMetafileFormat);

doc->Save(get_ArtifactsDir() + u"HtmlSaveOptions.MetafileFormat.html", options);

System::String outDocContents = System::IO::File::ReadAllText(get_ArtifactsDir() + u"HtmlSaveOptions.MetafileFormat.html");

switch (htmlMetafileFormat)
{
    case Aspose::Words::Saving::HtmlMetafileFormat::Png:
        ASSERT_TRUE(outDocContents.Contains(System::String(u"<p style=\"margin-top:0pt; margin-bottom:0pt\">") + u"<img src=\"HtmlSaveOptions.MetafileFormat.001.png\" width=\"500\" height=\"40\" alt=\"\" " + u"style=\"-aw-left-pos:0pt; -aw-rel-hpos:column; -aw-rel-vpos:paragraph; -aw-top-pos:0pt; -aw-wrap-type:inline\" />" + u"</p>"));
        break;

    case Aspose::Words::Saving::HtmlMetafileFormat::Svg:
        ASSERT_TRUE(outDocContents.Contains(System::String(u"<span style=\"-aw-left-pos:0pt; -aw-rel-hpos:column; -aw-rel-vpos:paragraph; -aw-top-pos:0pt; -aw-wrap-type:inline\">") + u"<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" version=\"1.1\" width=\"499\" height=\"40\">"));
        break;

    case Aspose::Words::Saving::HtmlMetafileFormat::EmfOrWmf:
        ASSERT_TRUE(outDocContents.Contains(System::String(u"<p style=\"margin-top:0pt; margin-bottom:0pt\">") + u"<img src=\"HtmlSaveOptions.MetafileFormat.001.emf\" width=\"500\" height=\"40\" alt=\"\" " + u"style=\"-aw-left-pos:0pt; -aw-rel-hpos:column; -aw-rel-vpos:paragraph; -aw-top-pos:0pt; -aw-wrap-type:inline\" />" + u"</p>"));
        break;

}
```

## See Also

* Namespace [Aspose::Words::Saving](../)
* Library [Aspose.Words for C++](../../)
