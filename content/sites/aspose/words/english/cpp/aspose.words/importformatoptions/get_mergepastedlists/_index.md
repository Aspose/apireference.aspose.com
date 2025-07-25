---
title: Aspose::Words::ImportFormatOptions::get_MergePastedLists method
linktitle: get_MergePastedLists
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::ImportFormatOptions::get_MergePastedLists method. Gets or sets a boolean value that specifies whether pasted lists will be merged with surrounding lists. The default value is false in C++.'
type: docs
weight: 8000
url: /cpp/aspose.words/importformatoptions/get_mergepastedlists/
---
## ImportFormatOptions::get_MergePastedLists method


Gets or sets a boolean value that specifies whether pasted lists will be merged with surrounding lists. The default value is **false**.

```cpp
bool Aspose::Words::ImportFormatOptions::get_MergePastedLists() const
```


## Examples



Shows how to merge lists from a documents. 
```cpp
auto srcDoc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"List item.docx");
auto dstDoc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"List destination.docx");

auto options = System::MakeObject<Aspose::Words::ImportFormatOptions>();
options->set_MergePastedLists(true);

// Set the "MergePastedLists" property to "true" pasted lists will be merged with surrounding lists.
dstDoc->AppendDocument(srcDoc, Aspose::Words::ImportFormatMode::UseDestinationStyles, options);

dstDoc->Save(get_ArtifactsDir() + u"Document.MergePastedLists.docx");
```

## See Also

* Class [ImportFormatOptions](../)
* Namespace [Aspose::Words](../../)
* Library [Aspose.Words for C++](../../../)
