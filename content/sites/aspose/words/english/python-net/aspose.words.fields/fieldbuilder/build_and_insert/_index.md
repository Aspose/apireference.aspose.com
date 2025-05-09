﻿---
title: FieldBuilder.build_and_insert method
linktitle: build_and_insert method
articleTitle: build_and_insert method
second_title: Aspose.Words for Python
description: "aspose.words.fields.FieldBuilder.build_and_insert method"
type: docs
weight: 40
url: /python-net/aspose.words.fields/fieldbuilder/build_and_insert/
---

## build_and_insert(ref_node) {#inline}

Builds and inserts a field into the document before the specified inline node.


```python
def build_and_insert(self, ref_node: aspose.words.Inline):
    ...
```

| Parameter | Type | Description |
| --- | --- | --- |
| ref_node | [Inline](../../../aspose.words/inline/) |  |

### Returns

A [Field](../../field/) object that represents the inserted field.


## build_and_insert(ref_node) {#paragraph}

Builds and inserts a field into the document to the end of the specified paragraph.


```python
def build_and_insert(self, ref_node: aspose.words.Paragraph):
    ...
```

| Parameter | Type | Description |
| --- | --- | --- |
| ref_node | [Paragraph](../../../aspose.words/paragraph/) |  |

### Returns

A [Field](../../field/) object that represents the inserted field.


## Examples

Shows how to create and insert a field using a field builder.

```python
doc = aw.Document()
# A convenient way of adding text content to a document is with a document builder.
builder = aw.DocumentBuilder(doc)
builder.write(' Hello world! This text is one Run, which is an inline node.')
# Fields have their builder, which we can use to construct a field code piece by piece.
# In this case, we will construct a BARCODE field representing a US postal code,
# and then insert it in front of a Run.
field_builder = aw.fields.FieldBuilder(aw.fields.FieldType.FIELD_BARCODE)
field_builder.add_argument('90210')
field_builder.add_switch('\\f', 'A')
field_builder.add_switch('\\u')
field_builder.build_and_insert(doc.first_section.body.first_paragraph.runs[0])
doc.update_fields()
doc.save(ARTIFACTS_DIR + 'Field.create_with_field_builder.docx')
```

Shows how to construct fields using a field builder, and then insert them into the document.

```python
doc = aw.Document()
# Below are three examples of field construction done using a field builder.
# 1 -  Single field:
# Use a field builder to add a SYMBOL field which displays the ƒ (Florin) symbol.
builder = aw.fields.FieldBuilder(aw.fields.FieldType.FIELD_SYMBOL)
builder.add_argument(argument=402)
builder.add_switch(switch_name='\\f', switch_argument='Arial')
builder.add_switch(switch_name='\\s', switch_argument=25)
builder.add_switch(switch_name='\\u')
field = builder.build_and_insert(ref_node=doc.first_section.body.first_paragraph)
self.assertEqual(' SYMBOL 402 \\f Arial \\s 25 \\u ', field.get_field_code())
# 2 -  Nested field:
# Use a field builder to create a formula field used as an inner field by another field builder.
inner_formula_builder = aw.fields.FieldBuilder(aw.fields.FieldType.FIELD_FORMULA)
inner_formula_builder.add_argument(argument=100)
inner_formula_builder.add_argument(argument='+')
inner_formula_builder.add_argument(argument=74)
# Create another builder for another SYMBOL field, and insert the formula field
# that we have created above into the SYMBOL field as its argument.
builder = aw.fields.FieldBuilder(aw.fields.FieldType.FIELD_SYMBOL)
builder.add_argument(argument=inner_formula_builder)
field = builder.build_and_insert(ref_node=doc.first_section.body.append_paragraph(''))
# The outer SYMBOL field will use the formula field result, 174, as its argument,
# which will make the field display the ® (Registered Sign) symbol since its character number is 174.
self.assertEqual(' SYMBOL \x13 = 100 + 74 \x14\x15 ', field.get_field_code())
# 3 -  Multiple nested fields and arguments:
# Now, we will use a builder to create an IF field, which displays one of two custom string values,
# depending on the true/false value of its expression. To get a true/false value
# that determines which string the IF field displays, the IF field will test two numeric expressions for equality.
# We will provide the two expressions in the form of formula fields, which we will nest inside the IF field.
left_expression = aw.fields.FieldBuilder(aw.fields.FieldType.FIELD_FORMULA)
left_expression.add_argument(argument=2)
left_expression.add_argument(argument='+')
left_expression.add_argument(argument=3)
right_expression = aw.fields.FieldBuilder(aw.fields.FieldType.FIELD_FORMULA)
right_expression.add_argument(argument=2.5)
right_expression.add_argument(argument='*')
right_expression.add_argument(argument=5.2)
# Next, we will build two field arguments, which will serve as the true/false output strings for the IF field.
# These arguments will reuse the output values of our numeric expressions.
true_output = aw.fields.FieldArgumentBuilder()
true_output.add_text('True, both expressions amount to ')
true_output.add_field(left_expression)
false_output = aw.fields.FieldArgumentBuilder()
false_output.add_node(aw.Run(doc=doc, text='False, '))
false_output.add_field(left_expression)
false_output.add_node(aw.Run(doc=doc, text=' does not equal '))
false_output.add_field(right_expression)
# Finally, we will create one more field builder for the IF field and combine all of the expressions.
builder = aw.fields.FieldBuilder(aw.fields.FieldType.FIELD_IF)
builder.add_argument(argument=left_expression)
builder.add_argument(argument='=')
builder.add_argument(argument=right_expression)
builder.add_argument(argument=true_output)
builder.add_argument(argument=false_output)
field = builder.build_and_insert(ref_node=doc.first_section.body.append_paragraph(''))
self.assertEqual(' IF \x13 = 2 + 3 \x14\x15 = \x13 = 2.5 * 5.2 \x14\x15 ' + '"True, both expressions amount to \x13 = 2 + 3 \x14\x15" ' + '"False, \x13 = 2 + 3 \x14\x15 does not equal \x13 = 2.5 * 5.2 \x14\x15" ', field.get_field_code())
doc.update_fields()
doc.save(file_name=ARTIFACTS_DIR + 'Field.SYMBOL.docx')
```

## See Also

* module [aspose.words.fields](../../)
* class [FieldBuilder](../)

