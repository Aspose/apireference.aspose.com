﻿---
title: Paragraph.insert_field method
linktitle: insert_field method
articleTitle: insert_field method
second_title: Aspose.Words for Python
description: "aspose.words.Paragraph.insert_field method"
type: docs
weight: 290
url: /python-net/aspose.words/paragraph/insert_field/
---

## insert_field(field_type, update_field, ref_node, is_after) {#fieldtype_bool_node_bool}

Inserts a field into this paragraph.


```python
def insert_field(self, field_type: aspose.words.fields.FieldType, update_field: bool, ref_node: aspose.words.Node, is_after: bool):
    ...
```

| Parameter | Type | Description |
| --- | --- | --- |
| field_type | [FieldType](../../../aspose.words.fields/fieldtype/) | The type of the field to insert. |
| update_field | bool | Specifies whether to update the field immediately. |
| ref_node | [Node](../../node/) | Reference node inside this paragraph (if *refNode* is``None``, then appends to the end of the paragraph). |
| is_after | bool | Whether to insert the field after or before reference node. |

### Returns

A [Field](../../../aspose.words.fields/field/) object that represents the inserted field.


## insert_field(field_code, ref_node, is_after) {#str_node_bool}

Inserts a field into this paragraph.


```python
def insert_field(self, field_code: str, ref_node: aspose.words.Node, is_after: bool):
    ...
```

| Parameter | Type | Description |
| --- | --- | --- |
| field_code | str | The field code to insert (without curly braces). |
| ref_node | [Node](../../node/) | Reference node inside this paragraph (if *refNode* is``None``, then appends to the end of the paragraph). |
| is_after | bool | Whether to insert the field after or before reference node. |

### Returns

A [Field](../../../aspose.words.fields/field/) object that represents the inserted field.


## insert_field(field_code, field_value, ref_node, is_after) {#str_str_node_bool}

Inserts a field into this paragraph.


```python
def insert_field(self, field_code: str, field_value: str, ref_node: aspose.words.Node, is_after: bool):
    ...
```

| Parameter | Type | Description |
| --- | --- | --- |
| field_code | str | The field code to insert (without curly braces). |
| field_value | str | The field value to insert. Pass ``None`` for fields that do not have a value. |
| ref_node | [Node](../../node/) | Reference node inside this paragraph (if *refNode* is``None``, then appends to the end of the paragraph). |
| is_after | bool | Whether to insert the field after or before reference node. |

### Returns

A [Field](../../../aspose.words.fields/field/) object that represents the inserted field.


## Examples

Shows various ways of adding fields to a paragraph.

```python
doc = aw.Document()
para = doc.first_section.body.first_paragraph
# Below are three ways of inserting a field into a paragraph.
# 1 -  Insert an AUTHOR field into a paragraph after one of the paragraph's child nodes:
run = aw.Run(doc=doc)
run.text = 'This run was written by '
para.append_child(run)
doc.built_in_document_properties.get_by_name('Author').value = 'John Doe'
para.insert_field(field_type=aw.fields.FieldType.FIELD_AUTHOR, update_field=True, ref_node=run, is_after=True)
# 2 -  Insert a QUOTE field after one of the paragraph's child nodes:
run = aw.Run(doc=doc)
run.text = '.'
para.append_child(run)
field = para.insert_field(field_code=' QUOTE " Real value" ', ref_node=run, is_after=True)
# 3 -  Insert a QUOTE field before one of the paragraph's child nodes,
# and get it to display a placeholder value:
para.insert_field(field_code=' QUOTE " Real value."', field_value=' Placeholder value.', ref_node=field.start, is_after=False)
self.assertEqual(' Placeholder value.', doc.range.fields[1].result)
# This field will display its placeholder value until we update it.
doc.update_fields()
self.assertEqual(' Real value.', doc.range.fields[1].result)
doc.save(file_name=ARTIFACTS_DIR + 'Paragraph.InsertField.docx')
```

## See Also

* module [aspose.words](../../)
* class [Paragraph](../)

