---
title: Aspose::Font::CffDataProviders::TopDictDataProvider class
linktitle: TopDictDataProvider
second_title: Aspose.Font for C++
description: 'Aspose::Font::CffDataProviders::TopDictDataProvider class. Declares functionality to read/update CFF Top DICT structure in C++.'
type: docs
weight: 800
url: /cpp/aspose.font.cffdataproviders/topdictdataprovider/
---
## TopDictDataProvider class


Declares functionality to read/update CFF Top DICT structure.

```cpp
class TopDictDataProvider : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [get_BaseFontName](./get_basefontname/)() | Gets/sets BaseFontName. |
| [get_CidCount](./get_cidcount/)() | Gets/sets CIDCount. |
| [get_CidFontRevision](./get_cidfontrevision/)() | Gets/sets CIDFontRevision. |
| [get_CidFontType](./get_cidfonttype/)() | Gets/sets CIDFontType. |
| [get_CidFontVersion](./get_cidfontversion/)() | Gets/sets CIDFontVersion. |
| [get_Copyright](./get_copyright/)() | Gets/sets Copyright. |
| [get_FamilyName](./get_familyname/)() | Gets/sets FamilyName. |
| [get_FontBBox](./get_fontbbox/)() | Gets/sets [FontBBox](../../aspose.font/fontbbox/). |
| [get_FontMatrix](./get_fontmatrix/)() | Gets/sets FontMatrix. |
| [get_FontName](./get_fontname/)() | Gets/sets FontName. |
| [get_FullName](./get_fullname/)() | Gets/sets FullName. |
| [get_IsFixedPitch](./get_isfixedpitch/)() | Gets/sets value for the isFixedPitch field. |
| [get_ItalicAngle](./get_italicangle/)() | Gets/sets ItalicAngle. |
| [get_Notice](./get_notice/)() | Gets/sets Notice. |
| [get_PaintType](./get_painttype/)() | Gets/sets PaintType. |
| [get_PostScript](./get_postscript/)() | Gets/sets PostScript. |
| [get_PrivateDictProvider](./get_privatedictprovider/)() | Gets provider for the Private DICT or NULL if no Private dictionary exists for the current top-level dictionary. |
| [get_StrokeWidth](./get_strokewidth/)() | Gets/sets StrokeWidth. |
| [get_SyntheticBase](./get_syntheticbase/)() | Gets/sets SyntheticBase. |
| [get_UidBase](./get_uidbase/)() | Gets/sets UIDBase. |
| [get_UnderlinePosition](./get_underlineposition/)() | Gets/sets UnderlinePosition. |
| [get_UnderlineThickness](./get_underlinethickness/)() | Gets/sets UnderlineThickness. |
| [get_UniqueId](./get_uniqueid/)() | Gets/sets UniqueID. |
| [get_Version](./get_version/)() | Gets/sets version. |
| [get_Weight](./get_weight/)() | Gets/sets Weight. |
| [get_Xuid](./get_xuid/)() | Gets/sets XUID. |
| [GetRos](./getros/)(System::String\&, System::String\&, int32_t\&) | Gets values of the ROS(Registry Ordering Supplement) field(operator). |
| [GetRos](./getros/)(int32_t\&, int32_t\&, int32_t\&) | Gets values of the ROS(Registry Ordering Supplement) field(operator). String identifiers (SID) are used for output string types. |
| [set_BaseFontName](./set_basefontname/)(System::String) | Gets/sets BaseFontName. |
| [set_CidCount](./set_cidcount/)(int32_t) | Gets/sets CIDCount. |
| [set_CidFontRevision](./set_cidfontrevision/)(int32_t) | Gets/sets CIDFontRevision. |
| [set_CidFontType](./set_cidfonttype/)(int32_t) | Gets/sets CIDFontType. |
| [set_CidFontVersion](./set_cidfontversion/)(int32_t) | Gets/sets CIDFontVersion. |
| [set_Copyright](./set_copyright/)(System::String) | Gets/sets Copyright. |
| [set_FamilyName](./set_familyname/)(System::String) | Gets/sets FamilyName. |
| [set_FontBBox](./set_fontbbox/)(System::SharedPtr\<Aspose::Font::FontBBox\>) | Gets/sets [FontBBox](../../aspose.font/fontbbox/). |
| [set_FontMatrix](./set_fontmatrix/)(System::SharedPtr\<TransformationMatrix\>) | Gets/sets FontMatrix. |
| [set_FontName](./set_fontname/)(System::String) | Gets/sets FontName. |
| [set_FullName](./set_fullname/)(System::String) | Gets/sets FullName. |
| [set_IsFixedPitch](./set_isfixedpitch/)(bool) | Gets/sets value for the isFixedPitch field. |
| [set_ItalicAngle](./set_italicangle/)(int32_t) | Gets/sets ItalicAngle. |
| [set_Notice](./set_notice/)(System::String) | Gets/sets Notice. |
| [set_PaintType](./set_painttype/)(int32_t) | Gets/sets PaintType. |
| [set_PostScript](./set_postscript/)(System::String) | Gets/sets PostScript. |
| [set_StrokeWidth](./set_strokewidth/)(int32_t) | Gets/sets StrokeWidth. |
| [set_SyntheticBase](./set_syntheticbase/)(int32_t) | Gets/sets SyntheticBase. |
| [set_UidBase](./set_uidbase/)(int32_t) | Gets/sets UIDBase. |
| [set_UnderlinePosition](./set_underlineposition/)(int32_t) | Gets/sets UnderlinePosition. |
| [set_UnderlineThickness](./set_underlinethickness/)(int32_t) | Gets/sets UnderlineThickness. |
| [set_UniqueId](./set_uniqueid/)(int32_t) | Gets/sets UniqueID. |
| [set_Version](./set_version/)(System::String) | Gets/sets version. |
| [set_Weight](./set_weight/)(System::String) | Gets/sets Weight. |
| [set_Xuid](./set_xuid/)(System::ArrayPtr\<double\>) | Gets/sets XUID. |
| [SetBaseFontName](./setbasefontname/)(System::String) | Sets string value for the BaseFontName field and returns SID associated with the newly set string value. |
| [SetBaseFontNameSid](./setbasefontnamesid/)(int32_t) | Updates SID(string identifier) value for the BaseFontName field in CFF Top DICT data. |
| [SetCopyright](./setcopyright/)(System::String) | Sets string value for the Copyright field and returns SID associated with the newly set string value. |
| [SetCopyrightSid](./setcopyrightsid/)(int32_t) | Updates SID(string identifier) value for the Copyright field in CFF Top DICT data. |
| [SetFamilyName](./setfamilyname/)(System::String) | Sets string value for the FamilyName field and returns SID associated with the newly set string value. |
| [SetFamilyNameSid](./setfamilynamesid/)(int32_t) | Updates SID(string identifier) value for the FamilyName field in CFF Top DICT data. |
| [SetFontName](./setfontname/)(System::String) | Sets string value for the FontName field and returns SID associated with the newly set string value. |
| [SetFontNameSid](./setfontnamesid/)(int32_t) | Updates SID(string identifier) value for the FontName field in CFF Top DICT data. |
| [SetFullName](./setfullname/)(System::String) | Sets string value for the FullName field and returns SID associated with the newly set string value. |
| [SetFullNameSid](./setfullnamesid/)(int32_t) | Updates SID(string identifier) value for the FullName field in CFF Top DICT data. |
| [SetNotice](./setnotice/)(System::String) | Sets string value for the Notice field(operator) and returns SID associated with the newly set string value. |
| [SetNoticeSid](./setnoticesid/)(int32_t) | Updates SID(string identifier) value for Notice field(operator) in CFF Top DICT data. |
| [SetPostScript](./setpostscript/)(System::String) | Sets string value for the PostScript field and returns SID associated with the newly set string value. |
| [SetPostScriptSid](./setpostscriptsid/)(int32_t) | Updates SID(string identifier) value for the PostScript field in CFF Top DICT data. |
| [SetRos](./setros/)(System::String, System::String, int32_t) | Sets values for the ROS(Registry Ordering Supplement) field(operator). |
| [SetRos](./setros/)(int32_t, int32_t, int32_t) | Sets values for the ROS(Registry Ordering Supplement) field(operator). String identifiers (SID) should be used for registry and ordering parameters. |
| [SetVersion](./setversion/)(System::String) | Sets string value for the version field(operator) and returns SID associated with the newly set string value. |
| [SetVersionSid](./setversionsid/)(int32_t) | Updates the SID (string identifier) value for the version field (operator) in CFF Top DICT data. |
| [SetWeight](./setweight/)(System::String) | Sets string value for the Weight field and returns SID associated with the newly set string value. |
| [SetWeightSid](./setweightsid/)(int32_t) | Updates SID(string identifier) value for the Weight field in CFF Top DICT data. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)
