---
title: Aspose::Words::Lists::ListLevel::GetEffectiveValue method
linktitle: GetEffectiveValue
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Lists::ListLevel::GetEffectiveValue method. Reports the string representation of the ListLevel object for the specified index of the list item. Parameters specify the NumberStyle and an optional format string used when Custom is specified in C++.'
type: docs
weight: 1000
url: /cpp/aspose.words.lists/listlevel/geteffectivevalue/
---
## ListLevel::GetEffectiveValue method


Reports the string representation of the [ListLevel](../) object for the specified index of the list item. Parameters specify the [NumberStyle](../../../aspose.words/numberstyle/) and an optional format string used when [Custom](../../../aspose.words/numberstyle/) is specified.

```cpp
static System::String Aspose::Words::Lists::ListLevel::GetEffectiveValue(int32_t index, Aspose::Words::NumberStyle numberStyle, const System::String &customNumberStyleFormat)
```


| Parameter | Type | Description |
| --- | --- | --- |
| index | int32_t | The index of the list item (must be in the range from 1 to 32767). |
| numberStyle | Aspose::Words::NumberStyle | The [NumberStyle](../../../aspose.words/numberstyle/) of the [ListLevel](../) object. |
| customNumberStyleFormat | const System::String\& | The optional format string used when [Custom](../../../aspose.words/numberstyle/) is specified (e.g. "a, ç, ĝ, ..."). In other cases, this parameter must be **null** or empty. |

### ReturnValue

The string representation of the [ListLevel](../) object, described by the *numberStyle* parameter and the *customNumberStyleFormat* parameter, in the list item at the position determined by the *index* parameter.

## Examples



Shows how to get the format for a list with the custom number style. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"List with leading zero.docx");

System::SharedPtr<Aspose::Words::Lists::ListLevel> listLevel = doc->get_FirstSection()->get_Body()->get_Paragraphs()->idx_get(0)->get_ListFormat()->get_ListLevel();

System::String customNumberStyleFormat = System::String::Empty;

if (listLevel->get_NumberStyle() == Aspose::Words::NumberStyle::Custom)
{
    customNumberStyleFormat = listLevel->get_CustomNumberStyleFormat();
}

ASSERT_EQ(u"001, 002, 003, ...", customNumberStyleFormat);

// We can get value for the specified index of the list item.
ASSERT_EQ(u"iv", Aspose::Words::Lists::ListLevel::GetEffectiveValue(4, Aspose::Words::NumberStyle::LowercaseRoman, nullptr));
ASSERT_EQ(u"005", Aspose::Words::Lists::ListLevel::GetEffectiveValue(5, Aspose::Words::NumberStyle::Custom, customNumberStyleFormat));
```

## See Also

* Enum [NumberStyle](../../../aspose.words/numberstyle/)
* Class [ListLevel](../)
* Namespace [Aspose::Words::Lists](../../)
* Library [Aspose.Words for C++](../../../)
