---
title: Aspose::Words::Drawing::OleFormat class
linktitle: OleFormat
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Drawing::OleFormat class. Provides access to the data of an OLE object or ActiveX control. To learn more, visit the  documentation article in C++.'
type: docs
weight: 8000
url: /cpp/aspose.words.drawing/oleformat/
---
## OleFormat class


Provides access to the data of an OLE object or ActiveX control. To learn more, visit the [Working with Ole Objects](https://docs.aspose.com/words/cpp/working-with-ole-objects/) documentation article.

```cpp
class OleFormat : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [get_AutoUpdate](./get_autoupdate/)() | Specifies whether the link to the OLE object is automatically updated or not in Microsoft Word. |
| [get_Clsid](./get_clsid/)() | Gets the CLSID of the OLE object. |
| [get_IconCaption](./get_iconcaption/)() | Gets icon caption of OLE object. In case if the OLE object does not have an icon or a caption cannot be retrieved, returns an empty string. |
| [get_IsLink](./get_islink/)() | Returns **true** if the OLE object is linked (when [SourceFullName](./get_sourcefullname/) is specified). |
| [get_IsLocked](./get_islocked/)() | Specifies whether the link to the OLE object is locked from updates. |
| [get_OleControl](./get_olecontrol/)() | Gets [OleControl](./get_olecontrol/) objects if this OLE object is an ActiveX control. Otherwise this property is null. |
| [get_OleIcon](./get_oleicon/)() | Gets the draw aspect of the OLE object. When **true**, the OLE object is displayed as an icon. When **false**, the OLE object is displayed as content. |
| [get_OlePackage](./get_olepackage/)() | Provide access to [OlePackage](../olepackage/) if OLE object is an OLE Package. Returns **null** otherwise. |
| [get_ProgId](./get_progid/)() | Gets or sets the ProgID of the OLE object. |
| [get_SourceFullName](./get_sourcefullname/)() | Gets or sets the path and name of the source file for the linked OLE object. |
| [get_SourceItem](./get_sourceitem/)() | Gets or sets a string that is used to identify the portion of the source file that is being linked. |
| [get_SuggestedExtension](./get_suggestedextension/)() | Gets the file extension suggested for the current embedded object if you want to save it into a file. |
| [get_SuggestedFileName](./get_suggestedfilename/)() | Gets the file name suggested for the current embedded object if you want to save it into a file. |
| [GetOleEntry](./getoleentry/)(const System::String\&) | Gets OLE object data entry. |
| [GetRawData](./getrawdata/)() | Gets OLE object raw data. |
| [GetType](./gettype/)() const override |  |
| [Is](./is/)(const System::TypeInfo\&) const override |  |
| [Save](./save/)(const System::SharedPtr\<System::IO::Stream\>\&) | Saves the data of the embedded object into the specified stream. |
| [Save](./save/)(const System::String\&) | Saves the data of the embedded object into a file with the specified name. |
| [Save](./save/)(std::basic_ostream\<CharType, Traits\>\&) |  |
| [set_AutoUpdate](./set_autoupdate/)(bool) | Setter for [Aspose::Words::Drawing::OleFormat::get_AutoUpdate](./get_autoupdate/). |
| [set_IsLocked](./set_islocked/)(bool) | Setter for [Aspose::Words::Drawing::OleFormat::get_IsLocked](./get_islocked/). |
| [set_ProgId](./set_progid/)(const System::String\&) | Setter for [Aspose::Words::Drawing::OleFormat::get_ProgId](./get_progid/). |
| [set_SourceFullName](./set_sourcefullname/)(const System::String\&) | Setter for [Aspose::Words::Drawing::OleFormat::get_SourceFullName](./get_sourcefullname/). |
| [set_SourceItem](./set_sourceitem/)(const System::String\&) | Setter for [Aspose::Words::Drawing::OleFormat::get_SourceItem](./get_sourceitem/). |
| static [Type](./type/)() |  |
## Remarks


Use the [OleFormat](../shape/get_oleformat/) property to access the data of an OLE object. You do not create instances of the [OleFormat](./) class directly.

## Examples



Shows how to extract embedded OLE objects into files. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"OLE spreadsheet.docm");
auto shape = System::ExplicitCast<Aspose::Words::Drawing::Shape>(doc->GetChild(Aspose::Words::NodeType::Shape, 0, true));

// The OLE object in the first shape is a Microsoft Excel spreadsheet.
System::SharedPtr<Aspose::Words::Drawing::OleFormat> oleFormat = shape->get_OleFormat();

ASSERT_EQ(u"Excel.Sheet.12", oleFormat->get_ProgId());

// Our object is neither auto updating nor locked from updates.
ASSERT_FALSE(oleFormat->get_AutoUpdate());
ASPOSE_ASSERT_EQ(false, oleFormat->get_IsLocked());

// If we plan on saving the OLE object to a file in the local file system,
// we can use the "SuggestedExtension" property to determine which file extension to apply to the file.
ASSERT_EQ(u".xlsx", oleFormat->get_SuggestedExtension());

// Below are two ways of saving an OLE object to a file in the local file system.
// 1 -  Save it via a stream:
{
    auto fs = System::MakeObject<System::IO::FileStream>(get_ArtifactsDir() + u"OLE spreadsheet extracted via stream" + oleFormat->get_SuggestedExtension(), System::IO::FileMode::Create);
    oleFormat->Save(fs);
}

// 2 -  Save it directly to a filename:
oleFormat->Save(get_ArtifactsDir() + u"OLE spreadsheet saved directly" + oleFormat->get_SuggestedExtension());
```

## See Also

* Namespace [Aspose::Words::Drawing](../)
* Library [Aspose.Words for C++](../../)
