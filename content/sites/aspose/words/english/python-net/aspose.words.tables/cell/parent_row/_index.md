﻿---
title: Cell.parent_row property
linktitle: parent_row property
articleTitle: parent_row property
second_title: Aspose.Words for Python
description: "Cell.parent_row property. Returns the parent row of the cell."
type: docs
weight: 100
url: /python-net/aspose.words.tables/cell/parent_row/
---

## Cell.parent_row property

Returns the parent row of the cell.


```python
@property
def parent_row(self) -> aspose.words.tables.Row:
    ...

```

### Examples

Shows how to set a table to stay together on the same page.

```python
doc = aw.Document(file_name=MY_DIR + 'Table spanning two pages.docx')
table = doc.first_section.body.tables[0]
# Enabling KeepWithNext for every paragraph in the table except for the
# last ones in the last row will prevent the table from splitting across multiple pages.
for cell in table.get_child_nodes(aw.NodeType.CELL, True):
    cell = cell.as_cell()
    for para in cell.paragraphs:
        para = para.as_paragraph()
        self.assertTrue(para.is_in_cell)
        if not (cell.parent_row.is_last_row and para.is_end_of_cell):
            para.paragraph_format.keep_with_next = True
doc.save(file_name=ARTIFACTS_DIR + 'Table.KeepTableTogether.docx')
```

### See Also

* module [aspose.words.tables](../../)
* class [Cell](../)

