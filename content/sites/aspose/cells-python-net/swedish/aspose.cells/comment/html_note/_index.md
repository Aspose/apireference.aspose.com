---
title: html_note fastighet
second_title: Aspose.Cells for Python via .NET API Referenser
description:
type: docs
weight: 150
url: /sv/aspose.cells/comment/html_note/
is_root: false
---
##  html_note fastighet

Hämtar och anger html-strängen som innehåller data och vissa format i den här kommentaren.

###  Anmärkningar

Om detta är en trådad kommentar kan anteckningen inte ändras, annars kan inte MS Excel behandla den som en trådad kommentar.

###  Exempel

```python

comment1.html_note = "<Font Style='FONT-FAMILY: Calibri;FONT-SIZE: 11pt;COLOR: #0000ff;TEXT-ALIGN: left;'>This is a <b>test</b>.</Font>"

```
###  Definition:
```python
@property
def html_note(self):
    ...
@html_note.setter
def html_note(self, value):
    ...
```

###  Se även
* modul [`aspose.cells`](../../)
* klass [`Comment`](/cells/python-net/sv/aspose.cells/comment)
