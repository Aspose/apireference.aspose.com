---
title: Aspose::Words::Revision::get_ParentStyle method
linktitle: get_ParentStyle
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Revision::get_ParentStyle method. Gets the immediate parent style (owner) of this revision. This property will work for only for the StyleDefinitionChange revision type in C++.'
type: docs
weight: 7000
url: /cpp/aspose.words/revision/get_parentstyle/
---
## Revision::get_ParentStyle method


Gets the immediate parent style (owner) of this revision. This property will work for only for the [StyleDefinitionChange](../../revisiontype/) revision type.

```cpp
System::SharedPtr<Aspose::Words::Style> Aspose::Words::Revision::get_ParentStyle()
```


## Examples



Shows how to work with a document's collection of revisions. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"Revisions.docx");
System::SharedPtr<Aspose::Words::RevisionCollection> revisions = doc->get_Revisions();

// This collection itself has a collection of revision groups.
// Each group is a sequence of adjacent revisions.
std::cout << System::String::Format(u"{0} revision groups:", revisions->get_Groups()->get_Count()) << std::endl;

// Iterate over the collection of groups and print the text that the revision concerns.
{
    System::SharedPtr<System::Collections::Generic::IEnumerator<System::SharedPtr<Aspose::Words::RevisionGroup>>> e = revisions->get_Groups()->GetEnumerator();
    while (e->MoveNext())
    {
        std::cout << (System::String::Format(u"\tGroup type \"{0}\", ", e->get_Current()->get_RevisionType()) + System::String::Format(u"author: {0}, contents: [{1}]", e->get_Current()->get_Author(), e->get_Current()->get_Text().Trim())) << std::endl;
    }
}

// Each Run that a revision affects gets a corresponding Revision object.
// The revisions' collection is considerably larger than the condensed form we printed above,
// depending on how many Runs we have segmented the document into during Microsoft Word editing.
std::cout << System::String::Format(u"\n{0} revisions:", revisions->get_Count()) << std::endl;

{
    System::SharedPtr<System::Collections::Generic::IEnumerator<System::SharedPtr<Aspose::Words::Revision>>> e = revisions->GetEnumerator();
    while (e->MoveNext())
    {
        // A StyleDefinitionChange strictly affects styles and not document nodes. This means the "ParentStyle"
        // property will always be in use, while the ParentNode will always be null.
        // Since all other changes affect nodes, ParentNode will conversely be in use, and ParentStyle will be null.
        if (e->get_Current()->get_RevisionType() == Aspose::Words::RevisionType::StyleDefinitionChange)
        {
            std::cout << (System::String::Format(u"\tRevision type \"{0}\", ", e->get_Current()->get_RevisionType()) + System::String::Format(u"author: {0}, style: [{1}]", e->get_Current()->get_Author(), e->get_Current()->get_ParentStyle()->get_Name())) << std::endl;
        }
        else
        {
            std::cout << (System::String::Format(u"\tRevision type \"{0}\", ", e->get_Current()->get_RevisionType()) + System::String::Format(u"author: {0}, contents: [{1}]", e->get_Current()->get_Author(), e->get_Current()->get_ParentNode()->GetText().Trim())) << std::endl;
        }
    }
}

// Reject all revisions via the collection, reverting the document to its original form.
revisions->RejectAll();

ASSERT_EQ(0, revisions->get_Count());
```

## See Also

* Class [Style](../../style/)
* Class [Revision](../)
* Namespace [Aspose::Words](../../)
* Library [Aspose.Words for C++](../../../)
