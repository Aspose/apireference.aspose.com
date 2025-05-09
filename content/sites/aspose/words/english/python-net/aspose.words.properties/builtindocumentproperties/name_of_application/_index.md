﻿---
title: BuiltInDocumentProperties.name_of_application property
linktitle: name_of_application property
articleTitle: name_of_application property
second_title: Aspose.Words for Python
description: "BuiltInDocumentProperties.name_of_application property. Gets or sets the name of the application."
type: docs
weight: 220
url: /python-net/aspose.words.properties/builtindocumentproperties/name_of_application/
---

## BuiltInDocumentProperties.name_of_application property

Gets or sets the name of the application.


```python
@property
def name_of_application(self) -> str:
    ...

@name_of_application.setter
def name_of_application(self, value: str):
    ...

```

### Examples

Shows how to work with document properties in the "Origin" category.

```python
# Open a document that we have created and edited using Microsoft Word.
doc = aw.Document(file_name=MY_DIR + 'Properties.docx')
properties = doc.built_in_document_properties
# The following built-in properties contain information regarding the creation and editing of this document.
# We can right-click this document in Windows Explorer and find
# these properties via "Properties" -> "Details" -> "Origin" category.
# Fields such as PRINTDATE and EDITTIME can display these values in the document body.
print(f'Created using {properties.name_of_application}, on {properties.created_time}')
print(f'Minutes spent editing: {properties.total_editing_time}')
print(f'Date/time last printed: {properties.last_printed}')
print(f'Template document: {properties.template}')
# We can also change the values of built-in properties.
properties.company = 'Doe Ltd.'
properties.manager = 'Jane Doe'
properties.version = 5
properties.revision_number += 1
# Microsoft Word updates the following properties automatically when we save the document.
# To use these properties with Aspose.Words, we will need to set values for them manually.
properties.last_saved_by = 'John Doe'
properties.last_saved_time = datetime.datetime.now()
# We can right-click this document in Windows Explorer and find these properties in "Properties" -> "Details" -> "Origin".
doc.save(file_name=ARTIFACTS_DIR + 'DocumentProperties.Origin.docx')
```

### See Also

* module [aspose.words.properties](../../)
* class [BuiltInDocumentProperties](../)

