---
title: Aspose::Words::Drawing::ShapeBase::get_IsDeleteRevision method
linktitle: get_IsDeleteRevision
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Drawing::ShapeBase::get_IsDeleteRevision method. Returns true if this object was deleted in Microsoft Word while change tracking was enabled in C++.'
type: docs
weight: 26000
url: /cpp/aspose.words.drawing/shapebase/get_isdeleterevision/
---
## ShapeBase::get_IsDeleteRevision method


Returns true if this object was deleted in Microsoft Word while change tracking was enabled.

```cpp
bool Aspose::Words::Drawing::ShapeBase::get_IsDeleteRevision()
```


## Examples



Shows how to work with revision shapes. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();

ASSERT_FALSE(doc->get_TrackRevisions());

// Insert an inline shape without tracking revisions, which will make this shape not a revision of any kind.
auto shape = System::MakeObject<Aspose::Words::Drawing::Shape>(doc, Aspose::Words::Drawing::ShapeType::Cube);
shape->set_WrapType(Aspose::Words::Drawing::WrapType::Inline);
shape->set_Width(100.0);
shape->set_Height(100.0);
doc->get_FirstSection()->get_Body()->get_FirstParagraph()->AppendChild<System::SharedPtr<Aspose::Words::Drawing::Shape>>(shape);

// Start tracking revisions and then insert another shape, which will be a revision.
doc->StartTrackRevisions(u"John Doe");

shape = System::MakeObject<Aspose::Words::Drawing::Shape>(doc, Aspose::Words::Drawing::ShapeType::Sun);
shape->set_WrapType(Aspose::Words::Drawing::WrapType::Inline);
shape->set_Width(100.0);
shape->set_Height(100.0);
doc->get_FirstSection()->get_Body()->get_FirstParagraph()->AppendChild<System::SharedPtr<Aspose::Words::Drawing::Shape>>(shape);

System::ArrayPtr<System::SharedPtr<Aspose::Words::Drawing::Shape>> shapes = doc->GetChildNodes(Aspose::Words::NodeType::Shape, true)->LINQ_OfType<System::SharedPtr<Aspose::Words::Drawing::Shape> >()->LINQ_ToArray();

ASSERT_EQ(2, shapes->get_Length());

shapes[0]->Remove();

// Since we removed that shape while we were tracking changes,
// the shape persists in the document and counts as a delete revision.
// Accepting this revision will remove the shape permanently, and rejecting it will keep it in the document.
ASSERT_EQ(Aspose::Words::Drawing::ShapeType::Cube, shapes[0]->get_ShapeType());
ASSERT_TRUE(shapes[0]->get_IsDeleteRevision());

// And we inserted another shape while tracking changes, so that shape will count as an insert revision.
// Accepting this revision will assimilate this shape into the document as a non-revision,
// and rejecting the revision will remove this shape permanently.
ASSERT_EQ(Aspose::Words::Drawing::ShapeType::Sun, shapes[1]->get_ShapeType());
ASSERT_TRUE(shapes[1]->get_IsInsertRevision());
```

## See Also

* Class [ShapeBase](../)
* Namespace [Aspose::Words::Drawing](../../)
* Library [Aspose.Words for C++](../../../)
