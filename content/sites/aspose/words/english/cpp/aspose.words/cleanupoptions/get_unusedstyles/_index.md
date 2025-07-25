---
title: Aspose::Words::CleanupOptions::get_UnusedStyles method
linktitle: get_UnusedStyles
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::CleanupOptions::get_UnusedStyles method. Specifies whether unused styles should be removed from document. Default value is true in C++.'
type: docs
weight: 6000
url: /cpp/aspose.words/cleanupoptions/get_unusedstyles/
---
## CleanupOptions::get_UnusedStyles method


Specifies whether unused styles should be removed from document. Default value is **true**.

```cpp
bool Aspose::Words::CleanupOptions::get_UnusedStyles() const
```


## Examples



Shows how to remove all unused custom styles from a document. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();

doc->get_Styles()->Add(Aspose::Words::StyleType::List, u"MyListStyle1");
doc->get_Styles()->Add(Aspose::Words::StyleType::List, u"MyListStyle2");
doc->get_Styles()->Add(Aspose::Words::StyleType::Character, u"MyParagraphStyle1");
doc->get_Styles()->Add(Aspose::Words::StyleType::Character, u"MyParagraphStyle2");

// Combined with the built-in styles, the document now has eight styles.
// A custom style is marked as "used" while there is any text within the document
// formatted in that style. This means that the 4 styles we added are currently unused.
ASSERT_EQ(8, doc->get_Styles()->get_Count());

// Apply a custom character style, and then a custom list style. Doing so will mark them as "used".
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);
builder->get_Font()->set_Style(doc->get_Styles()->idx_get(u"MyParagraphStyle1"));
builder->Writeln(u"Hello world!");

System::SharedPtr<Aspose::Words::Lists::List> list = doc->get_Lists()->Add(doc->get_Styles()->idx_get(u"MyListStyle1"));
builder->get_ListFormat()->set_List(list);
builder->Writeln(u"Item 1");
builder->Writeln(u"Item 2");

// Now, there is one unused character style and one unused list style.
// The Cleanup() method, when configured with a CleanupOptions object, can target unused styles and remove them.
auto cleanupOptions = System::MakeObject<Aspose::Words::CleanupOptions>();
cleanupOptions->set_UnusedLists(true);
cleanupOptions->set_UnusedStyles(true);
cleanupOptions->set_UnusedBuiltinStyles(true);

doc->Cleanup(cleanupOptions);

ASSERT_EQ(4, doc->get_Styles()->get_Count());

// Removing every node that a custom style is applied to marks it as "unused" again.
// Rerun the Cleanup method to remove them.
doc->get_FirstSection()->get_Body()->RemoveAllChildren();
doc->Cleanup(cleanupOptions);

ASSERT_EQ(2, doc->get_Styles()->get_Count());
```

## See Also

* Class [CleanupOptions](../)
* Namespace [Aspose::Words](../../)
* Library [Aspose.Words for C++](../../../)
