---
title: Aspose::Words::Fields::FieldIndex::get_LetterRange method
linktitle: get_LetterRange
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Fields::FieldIndex::get_LetterRange method. Gets or sets a range of letters to which limit the index in C++.'
type: docs
weight: 9000
url: /cpp/aspose.words.fields/fieldindex/get_letterrange/
---
## FieldIndex::get_LetterRange method


Gets or sets a range of letters to which limit the index.

```cpp
System::String Aspose::Words::Fields::FieldIndex::get_LetterRange()
```


## Examples



Shows how to populate an INDEX field with entries using XE fields, and also modify its appearance. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

// Create an INDEX field which will display an entry for each XE field found in the document.
// Each entry will display the XE field's Text property value on the left side,
// and the number of the page that contains the XE field on the right.
// If the XE fields have the same value in their "Text" property,
// the INDEX field will group them into one entry.
auto index = System::ExplicitCast<Aspose::Words::Fields::FieldIndex>(builder->InsertField(Aspose::Words::Fields::FieldType::FieldIndex, true));
index->set_LanguageId(u"1033");

// Setting this property's value to "A" will group all the entries by their first letter,
// and place that letter in uppercase above each group.
index->set_Heading(u"A");

// Set the table created by the INDEX field to span over 2 columns.
index->set_NumberOfColumns(u"2");

// Set any entries with starting letters outside the "a-c" character range to be omitted.
index->set_LetterRange(u"a-c");

ASSERT_EQ(u" INDEX  \\z 1033 \\h A \\c 2 \\p a-c", index->GetFieldCode());

// These next two XE fields will show up under the "A" heading,
// with their respective text stylings also applied to their page numbers.
builder->InsertBreak(Aspose::Words::BreakType::PageBreak);
auto indexEntry = System::ExplicitCast<Aspose::Words::Fields::FieldXE>(builder->InsertField(Aspose::Words::Fields::FieldType::FieldIndexEntry, true));
indexEntry->set_Text(u"Apple");
indexEntry->set_IsItalic(true);

ASSERT_EQ(u" XE  Apple \\i", indexEntry->GetFieldCode());

builder->InsertBreak(Aspose::Words::BreakType::PageBreak);
indexEntry = System::ExplicitCast<Aspose::Words::Fields::FieldXE>(builder->InsertField(Aspose::Words::Fields::FieldType::FieldIndexEntry, true));
indexEntry->set_Text(u"Apricot");
indexEntry->set_IsBold(true);

ASSERT_EQ(u" XE  Apricot \\b", indexEntry->GetFieldCode());

// Both the next two XE fields will be under a "B" and "C" heading in the INDEX fields table of contents.
builder->InsertBreak(Aspose::Words::BreakType::PageBreak);
indexEntry = System::ExplicitCast<Aspose::Words::Fields::FieldXE>(builder->InsertField(Aspose::Words::Fields::FieldType::FieldIndexEntry, true));
indexEntry->set_Text(u"Banana");

builder->InsertBreak(Aspose::Words::BreakType::PageBreak);
indexEntry = System::ExplicitCast<Aspose::Words::Fields::FieldXE>(builder->InsertField(Aspose::Words::Fields::FieldType::FieldIndexEntry, true));
indexEntry->set_Text(u"Cherry");

// INDEX fields sort all entries alphabetically, so this entry will show up under "A" with the other two.
builder->InsertBreak(Aspose::Words::BreakType::PageBreak);
indexEntry = System::ExplicitCast<Aspose::Words::Fields::FieldXE>(builder->InsertField(Aspose::Words::Fields::FieldType::FieldIndexEntry, true));
indexEntry->set_Text(u"Avocado");

// This entry will not appear because it starts with the letter "D",
// which is outside the "a-c" character range that the INDEX field's LetterRange property defines.
builder->InsertBreak(Aspose::Words::BreakType::PageBreak);
indexEntry = System::ExplicitCast<Aspose::Words::Fields::FieldXE>(builder->InsertField(Aspose::Words::Fields::FieldType::FieldIndexEntry, true));
indexEntry->set_Text(u"Durian");

doc->UpdatePageLayout();
doc->UpdateFields();
doc->Save(get_ArtifactsDir() + u"Field.INDEX.XE.Formatting.docx");
```

## See Also

* Class [FieldIndex](../)
* Namespace [Aspose::Words::Fields](../../)
* Library [Aspose.Words for C++](../../../)
