---
title: Aspose::Words::Drawing::TextBox::get_Previous method
linktitle: get_Previous
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Drawing::TextBox::get_Previous method. Returns a TextBox that represents the previous TextBox in a sequence of shapes in C++.'
type: docs
weight: 12000
url: /cpp/aspose.words.drawing/textbox/get_previous/
---
## TextBox::get_Previous method


Returns a [TextBox](../) that represents the previous [TextBox](../) in a sequence of shapes.

```cpp
System::SharedPtr<Aspose::Words::Drawing::TextBox> Aspose::Words::Drawing::TextBox::get_Previous()
```


## Examples



Shows how to link text boxes. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

System::SharedPtr<Aspose::Words::Drawing::Shape> textBoxShape1 = builder->InsertShape(Aspose::Words::Drawing::ShapeType::TextBox, 100, 100);
System::SharedPtr<Aspose::Words::Drawing::TextBox> textBox1 = textBoxShape1->get_TextBox();
builder->Writeln();

System::SharedPtr<Aspose::Words::Drawing::Shape> textBoxShape2 = builder->InsertShape(Aspose::Words::Drawing::ShapeType::TextBox, 100, 100);
System::SharedPtr<Aspose::Words::Drawing::TextBox> textBox2 = textBoxShape2->get_TextBox();
builder->Writeln();

System::SharedPtr<Aspose::Words::Drawing::Shape> textBoxShape3 = builder->InsertShape(Aspose::Words::Drawing::ShapeType::TextBox, 100, 100);
System::SharedPtr<Aspose::Words::Drawing::TextBox> textBox3 = textBoxShape3->get_TextBox();
builder->Writeln();

System::SharedPtr<Aspose::Words::Drawing::Shape> textBoxShape4 = builder->InsertShape(Aspose::Words::Drawing::ShapeType::TextBox, 100, 100);
System::SharedPtr<Aspose::Words::Drawing::TextBox> textBox4 = textBoxShape4->get_TextBox();

// Create links between some of the text boxes.
if (textBox1->IsValidLinkTarget(textBox2))
{
    textBox1->set_Next(textBox2);
}

if (textBox2->IsValidLinkTarget(textBox3))
{
    textBox2->set_Next(textBox3);
}

// Only an empty text box may have a link.
ASSERT_TRUE(textBox3->IsValidLinkTarget(textBox4));

builder->MoveTo(textBoxShape4->get_LastParagraph());
builder->Write(u"Hello world!");

ASSERT_FALSE(textBox3->IsValidLinkTarget(textBox4));

if (textBox1->get_Next() != nullptr && textBox1->get_Previous() == nullptr)
{
    std::cout << "This TextBox is the head of the sequence" << std::endl;
}

if (textBox2->get_Next() != nullptr && textBox2->get_Previous() != nullptr)
{
    std::cout << "This TextBox is the middle of the sequence" << std::endl;
}

if (textBox3->get_Next() == nullptr && textBox3->get_Previous() != nullptr)
{
    std::cout << "This TextBox is the tail of the sequence" << std::endl;

    // Break the forward link between textBox2 and textBox3, and then verify that they are no longer linked.
    textBox3->get_Previous()->BreakForwardLink();
    ASSERT_TRUE(textBox2->get_Next() == nullptr);
    ASSERT_TRUE(textBox3->get_Previous() == nullptr);
}

doc->Save(get_ArtifactsDir() + u"Shape.CreateLinkBetweenTextBoxes.docx");
```

## See Also

* Class [TextBox](../)
* Class [TextBox](../)
* Namespace [Aspose::Words::Drawing](../../)
* Library [Aspose.Words for C++](../../../)
