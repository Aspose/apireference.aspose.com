---
title: Aspose::Words::Story::get_StoryType method
linktitle: get_StoryType
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Story::get_StoryType method. Gets the type of this story in C++.'
type: docs
weight: 7000
url: /cpp/aspose.words/story/get_storytype/
---
## Story::get_StoryType method


Gets the type of this story.

```cpp
Aspose::Words::StoryType Aspose::Words::Story::get_StoryType() override
```


## Examples



Shows how to remove all shapes from a node. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

// Use a DocumentBuilder to insert a shape. This is an inline shape,
// which has a parent Paragraph, which is a child node of the first section's Body.
builder->InsertShape(Aspose::Words::Drawing::ShapeType::Cube, 100.0, 100.0);

ASSERT_EQ(1, doc->GetChildNodes(Aspose::Words::NodeType::Shape, true)->get_Count());

// We can delete all shapes from the child paragraphs of this Body.
ASSERT_EQ(Aspose::Words::StoryType::MainText, doc->get_FirstSection()->get_Body()->get_StoryType());
doc->get_FirstSection()->get_Body()->DeleteShapes();

ASSERT_EQ(0, doc->GetChildNodes(Aspose::Words::NodeType::Shape, true)->get_Count());
```

## See Also

* Enum [StoryType](../../storytype/)
* Class [Story](../)
* Namespace [Aspose::Words](../../)
* Library [Aspose.Words for C++](../../../)
