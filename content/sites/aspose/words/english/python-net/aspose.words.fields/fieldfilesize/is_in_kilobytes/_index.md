﻿---
title: FieldFileSize.is_in_kilobytes property
linktitle: is_in_kilobytes property
articleTitle: is_in_kilobytes property
second_title: Aspose.Words for Python
description: "FieldFileSize.is_in_kilobytes property. Gets or sets whether to display the file size in kilobytes."
type: docs
weight: 20
url: /python-net/aspose.words.fields/fieldfilesize/is_in_kilobytes/
---

## FieldFileSize.is_in_kilobytes property

Gets or sets whether to display the file size in kilobytes.


```python
@property
def is_in_kilobytes(self) -> bool:
    ...

@is_in_kilobytes.setter
def is_in_kilobytes(self, value: bool):
    ...

```

### Examples

Shows how to display the file size of a document with a FILESIZE field.

```python
doc = aw.Document(file_name=MY_DIR + 'Document.docx')
self.assertEqual(18105, doc.built_in_document_properties.bytes)
builder = aw.DocumentBuilder(doc=doc)
builder.move_to_document_end()
builder.insert_paragraph()
# Below are three different units of measure
# with which FILESIZE fields can display the document's file size.
# 1 -  Bytes:
field = builder.insert_field(field_type=aw.fields.FieldType.FIELD_FILE_SIZE, update_field=True).as_field_file_size()
field.update()
self.assertEqual(' FILESIZE ', field.get_field_code())
self.assertEqual('18105', field.result)
# 2 -  Kilobytes:
builder.insert_paragraph()
field = builder.insert_field(field_type=aw.fields.FieldType.FIELD_FILE_SIZE, update_field=True).as_field_file_size()
field.is_in_kilobytes = True
field.update()
self.assertEqual(' FILESIZE  \\k', field.get_field_code())
self.assertEqual('18', field.result)
# 3 -  Megabytes:
builder.insert_paragraph()
field = builder.insert_field(field_type=aw.fields.FieldType.FIELD_FILE_SIZE, update_field=True).as_field_file_size()
field.is_in_megabytes = True
field.update()
self.assertEqual(' FILESIZE  \\m', field.get_field_code())
self.assertEqual('0', field.result)
# To update the values of these fields while editing in Microsoft Word,
# we must first save the changes, and then manually update these fields.
doc.save(file_name=ARTIFACTS_DIR + 'Field.FILESIZE.docx')
```

### See Also

* module [aspose.words.fields](../../)
* class [FieldFileSize](../)

