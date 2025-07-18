---
title: Aspose::Words::TabStopCollection::GetPositionByIndex method
linktitle: GetPositionByIndex
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::TabStopCollection::GetPositionByIndex method. Gets the position (in points) of the tab stop at the specified index in C++.'
type: docs
weight: 10000
url: /cpp/aspose.words/tabstopcollection/getpositionbyindex/
---
## TabStopCollection::GetPositionByIndex method


Gets the position (in points) of the tab stop at the specified index.

```cpp
double Aspose::Words::TabStopCollection::GetPositionByIndex(int32_t index)
```


| Parameter | Type | Description |
| --- | --- | --- |
| index | int32_t | An index into the collection of tab stops. |

### ReturnValue

The position of the tab stop.

## Examples



Shows how to find a tab, stop by its index and verify its position. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
System::SharedPtr<Aspose::Words::TabStopCollection> tabStops = doc->get_FirstSection()->get_Body()->get_Paragraphs()->idx_get(0)->get_ParagraphFormat()->get_TabStops();

tabStops->Add(Aspose::Words::ConvertUtil::MillimeterToPoint(30), Aspose::Words::TabAlignment::Left, Aspose::Words::TabLeader::Dashes);
tabStops->Add(Aspose::Words::ConvertUtil::MillimeterToPoint(60), Aspose::Words::TabAlignment::Left, Aspose::Words::TabLeader::Dashes);

// Verify the position of the second tab stop in the collection.
ASSERT_NEAR(Aspose::Words::ConvertUtil::MillimeterToPoint(60), tabStops->GetPositionByIndex(1), 0.1);
```

## See Also

* Class [TabStopCollection](../)
* Namespace [Aspose::Words](../../)
* Library [Aspose.Words for C++](../../../)
