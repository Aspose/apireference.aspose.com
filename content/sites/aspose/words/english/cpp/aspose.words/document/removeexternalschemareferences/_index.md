---
title: Aspose::Words::Document::RemoveExternalSchemaReferences method
linktitle: RemoveExternalSchemaReferences
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Document::RemoveExternalSchemaReferences method. Removes external XML schema references from this document in C++.'
type: docs
weight: 68000
url: /cpp/aspose.words/document/removeexternalschemareferences/
---
## Document::RemoveExternalSchemaReferences method


Removes external XML schema references from this document.

```cpp
void Aspose::Words::Document::RemoveExternalSchemaReferences()
```


## Examples



Shows how to remove all external XML schema references from a document. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"External XML schema.docx");

doc->RemoveExternalSchemaReferences();
```

## See Also

* Class [Document](../)
* Namespace [Aspose::Words](../../)
* Library [Aspose.Words for C++](../../../)
