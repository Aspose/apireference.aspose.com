---
title: Aspose::Words::Document::RemoveMacros method
linktitle: RemoveMacros
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Document::RemoveMacros method. Removes all macros (the VBA project) as well as toolbars and command customizations from the document in C++.'
type: docs
weight: 69000
url: /cpp/aspose.words/document/removemacros/
---
## Document::RemoveMacros method


Removes all macros (the VBA project) as well as toolbars and command customizations from the document.

```cpp
void Aspose::Words::Document::RemoveMacros()
```

## Remarks


By removing all macros from a document you can ensure the document contains no macro viruses.

## Examples



Shows how to remove all macros from a document. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"Macro.docm");

ASSERT_TRUE(doc->get_HasMacros());
ASSERT_EQ(u"Project", doc->get_VbaProject()->get_Name());

// Remove the document's VBA project, along with all its macros.
doc->RemoveMacros();

ASSERT_FALSE(doc->get_HasMacros());
ASSERT_TRUE(System::TestTools::IsNull(doc->get_VbaProject()));
```

## See Also

* Class [Document](../)
* Namespace [Aspose::Words](../../)
* Library [Aspose.Words for C++](../../../)
